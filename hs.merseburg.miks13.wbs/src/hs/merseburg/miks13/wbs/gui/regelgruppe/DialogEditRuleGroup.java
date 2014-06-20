package hs.merseburg.miks13.wbs.gui.regelgruppe;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.hibernate.Session;

import wissensbasismodel.Regel;
import wissensbasismodel.Regelgruppe;
import wissensbasismodel.WissensBasis;

public class DialogEditRuleGroup extends Dialog {
	private Text text;
	private ListViewer vieweradd;
	private ListViewer viewerselected;
	private long WBSID;
	private Session session;
	private Collection<Regel> regelnadd;
	private ArrayList<Regel> regelnselected = new ArrayList<Regel>();
	private Regelgruppe regelgruppe;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param wbsID
	 */
	public DialogEditRuleGroup(Shell parentShell, long wbsID,
			Regelgruppe regelgruppe) {
		super(parentShell);
		this.regelgruppe = regelgruppe;
		WBSID = wbsID;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gl_container = new GridLayout(3, true);
		container.setLayout(gl_container);

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblRegeln = new Label(container, SWT.NONE);
		lblRegeln.setText("Regeln:");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		List listviewadd = new List(container, SWT.BORDER | SWT.MULTI);
		listviewadd.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));
		new Label(container, SWT.NONE);

		List listviewselected = new List(container, SWT.BORDER);
		listviewselected.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));
		viewerselected = new ListViewer(listviewselected);
		viewerselected.setLabelProvider(new LabelProviderRegel());
		viewerselected.setContentProvider(ArrayContentProvider.getInstance());
		Button btnAddAll = new Button(container, SWT.NONE);
		btnAddAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnAddAll.setText("Alle Hinzufügen >>");

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		btnAdd.setText("Hinzufügen >");

		Button btnRemove = new Button(container, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnRemove.setText("< Entfernen");

		Button btnRemoveAll = new Button(container, SWT.NONE);
		btnRemoveAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnRemoveAll.setText("<< Alle Entfernen");
		new Label(container, SWT.NONE);

		session = PersistenceUtility.getINSTANCE().createSession();
		WissensBasis wbs = PersistenceUtility.getWissensBasisById(WBSID,
				session);

		regelnadd = (Collection<Regel>) EcoreUtil.copyAll(wbs.getRegeln());

		vieweradd = new ListViewer(listviewadd);
		vieweradd.setLabelProvider(new LabelProvider());
		vieweradd.setContentProvider(ArrayContentProvider.getInstance());
		vieweradd.setLabelProvider(new LabelProviderRegel());

		btnAddAll.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				regelnselected.addAll(regelnadd);
				regelnadd.clear();
				refreshlists();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btnAdd.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				ISelection selection = vieweradd.getSelection();
				StructuredSelection structuredSelection = (StructuredSelection) selection;
				Iterator iterator = structuredSelection.iterator();
				while (iterator.hasNext()) {
					Regel r = (Regel) iterator.next();
					regelnselected.add(r);
					regelnadd.remove(r);
				}
				refreshlists();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btnRemove.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				ISelection selection = viewerselected.getSelection();
				StructuredSelection structuredSelection = (StructuredSelection) selection;
				Iterator iterator = structuredSelection.iterator();
				while (iterator.hasNext()) {
					Regel r = (Regel) iterator.next();
					regelnadd.add(r);
					regelnselected.remove(r);
				}
				refreshlists();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btnRemoveAll.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				regelnadd.addAll(regelnselected);
				regelnselected.clear();
				refreshlists();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		initContent();
		refreshlists();
		return container;
	}

	private void initContent() {
		regelgruppe = (Regelgruppe) session.merge(regelgruppe);
		ArrayList<Regel> regelgruppe1 = new ArrayList<Regel>(regelnadd);
		regelnselected.addAll(EcoreUtil.copyAll(regelgruppe.getRegeln()));
		for (int i = 0; i < regelnselected.size(); i++) {
			for (Iterator iterator = regelnadd.iterator(); iterator.hasNext();) {
				Regel regel = (Regel) iterator.next();
				if (regel.getID() == regelnselected.get(i).getID()) {
					regelgruppe1.remove(regel);
				}
			}
		}
		regelnadd = regelgruppe1;
		text.setText(regelgruppe.getName());
	}

	private void refreshlists() {
		vieweradd.setInput(regelnadd);
		viewerselected.setInput(regelnselected);

	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */

	@Override
	protected Point getInitialSize() {
		return new Point(507, 377);
	}

	protected class LabelProviderRegel extends LabelProvider {
		@Override
		public String getText(Object element) {
			Regel regel = (Regel) element;
			return regel.getName();
		}

	}

	@Override
	protected void okPressed() {
		String wert;
		if (!validateInput())
			return;
		String Name = text.getText().trim();

		WissensBasis wbs = PersistenceUtility.getINSTANCE()
				.getWissensBasisById(WBSID, session);
		regelgruppe.setName(Name);
		regelgruppe.getRegeln().clear();

		for (int i = 0; i < regelnselected.size(); i++) {
			Regel selectedregel = regelnselected.get(i);
			EList<Regel> wbsregeln = wbs.getRegeln();
			for (Iterator iterator = wbsregeln.iterator(); iterator.hasNext();) {
				Regel regel = (Regel) iterator.next();
				if (regel.getID() == selectedregel.getID()) {
					regelgruppe.getRegeln().add(regel);
					break;
				}
			}
		}

		session.flush();
		session.close();
		super.okPressed();
	}

	private boolean validateInput() {
		return true;
	}
}
