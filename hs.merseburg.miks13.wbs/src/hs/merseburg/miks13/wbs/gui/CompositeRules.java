package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks13.wbs.gui.aussage.DialogCreateNewAussage;
import hs.merseburg.miks13.wbs.gui.regel.DialogCreateNewRule;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.hibernate.Session;

import wissensbasismodel.Konklusion;
import wissensbasismodel.KonklusionsTyp;
import wissensbasismodel.LiteralOperatorenPraedikat;
import wissensbasismodel.Regel;
import wissensbasismodel.Regelgruppe;
import wissensbasismodel.WissensBasis;

public class CompositeRules extends Composite implements GlobalEditActions {

	private TableViewer viewer;
	private Table table;
	private Button b_new, b_edit, b_delete;
	private long wbsID;

	public CompositeRules(Composite parent, int style) {
		super(parent, style);

		this.setLayout(new FormLayout());

		viewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		createColumns(viewer);

		FormData fdviewer = new FormData();
		fdviewer.top = new FormAttachment(0);
		fdviewer.bottom = new FormAttachment(100);
		fdviewer.left = new FormAttachment(0);
		fdviewer.right = new FormAttachment(90);
		table.setLayoutData(fdviewer);
		refreshTable();

		FormData fdButtons = new FormData();
		fdButtons.top = new FormAttachment(0);
		fdButtons.bottom = new FormAttachment(100);
		fdButtons.left = new FormAttachment(table);
		fdButtons.right = new FormAttachment(100);

		Composite cbuttons = new Composite(this, SWT.None);
		cbuttons.setLayoutData(fdButtons);
		cbuttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		b_new = new Button(cbuttons, SWT.PUSH);
		b_edit = new Button(cbuttons, SWT.None);
		b_delete = new Button(cbuttons, SWT.None);
		b_new.setText("Anlegen");
		b_edit.setText("Bearbeiten");
		b_delete.setText("Löschen");
		b_edit.setEnabled(false);
		b_delete.setEnabled(false);
		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				b_edit.setEnabled(true);
				b_delete.setEnabled(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b_new.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createnewRule();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		b_delete.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteRule();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		List list = PersistenceUtility.getAll(session, "Regel", null, null);
		viewer.setInput(list);
		session.close();
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return wb.getName();

			}
		});

		col = createTableViewerColumn("Konklusion", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				String returnwert = null;
				String not;
				String praedikat = null;
				String wert = null;
				Regel wb = (Regel) element;
				Konklusion konklusion = wb.getKonklusion();
				KonklusionsTyp typ = konklusion.getKonklusionTyp();
				String result = "";
				switch (typ) {
				case LITERAL:
					String name = konklusion.getLiteral().getAussage()
							.getName();
					if (konklusion.getLiteral().getPraedikat() != LiteralOperatorenPraedikat.NULL) {
						praedikat = konklusion.getLiteral().getPraedikat()
								.getName();
					} else {
						praedikat = "";
					}

					if (konklusion.getLiteral().getWert() != null) {
						wert = konklusion.getLiteral().getWert();
					} else {
						wert = "";
					}

					if (konklusion.getLiteral().isNOT()) {
						not = "NOT";
					} else {
						not = "";
					}

					result = not + " " + name + " " + praedikat + " " + wert;

					returnwert = result;

					break;
				case DIAGNOSEAUSGABE:
					returnwert = konklusion.getDiagnoseaussage()
							.getDiagnosetext();
					break;
				case TEXTAUSGABE:
					returnwert = konklusion.getTextausgabe().toString();
					break;
				default:
					break;
				}
				return returnwert;

			}
		});

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}

	@Override
	public void setWBSID(long wbsID) {
		this.wbsID = wbsID;
		refreshTable();

	}

	private void createnewRule() {
		DialogCreateNewRule dialog = new DialogCreateNewRule(Display
				.getCurrent().getActiveShell(), wbsID);
		if (dialog.open() == DialogCreateNewAussage.OK) {
			refreshTable();
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	private void deleteRule() {
		// TODO Auto-generated method stub
		ISelection selected = viewer.getSelection();
		Session session = PersistenceUtility.getINSTANCE().createSession();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		WissensBasis wbs = PersistenceUtility.getWissensBasisById(wbsID,
				session);
		Regel regel = ((Regel) structuredSelection.getFirstElement());
		EList<Regelgruppe> regelgruppen = wbs.getRegelGruppen();
		for (Iterator iterator = regelgruppen.iterator(); iterator.hasNext();) {
			Regelgruppe regelgruppe = (Regelgruppe) iterator.next();
			if (regelgruppe == null) {
				System.err.println("regelgeruppe ist: " + regelgruppe);
			} else {
				boolean drin = regelgruppe.getRegeln().contains(regel);

				if (drin) {
					System.err.println("regelgeruppe ist: " + regelgruppe);
					regelgruppe.getRegeln().remove(regel);

				}
			}
		}

		session.delete(regel);
		session.flush();
		session.close();
		refreshTable();
	}
}
