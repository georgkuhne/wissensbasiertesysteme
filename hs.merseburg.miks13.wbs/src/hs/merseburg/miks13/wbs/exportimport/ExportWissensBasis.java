package hs.merseburg.miks13.wbs.exportimport;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks13.wbs.gui.regel.LiteralRepresentation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.hibernate.Session;

import wissensbasismodel.Aussage;
import wissensbasismodel.KonklusionsTyp;
import wissensbasismodel.Literal;
import wissensbasismodel.LiteralOperatorenLogik;
import wissensbasismodel.Regel;
import wissensbasismodel.Regelgruppe;
import wissensbasismodel.WertebereichTyp;
import wissensbasismodel.WissensBasis;

public class ExportWissensBasis {
	public static final String DATEIENDUNG = ".txt";

	Session session;
	WissensBasis wb;
	String dir;
	FileWriter writer;
	File file;

	public ExportWissensBasis(long wbsid, String selectedDir) {
		session = PersistenceUtility.getINSTANCE().createSession();
		wb = PersistenceUtility.getWissensBasisById(wbsid, session);
		dir = selectedDir;
		file = new File(selectedDir + File.separator + wb.getName()
				+ DATEIENDUNG);
		try {
			writer = new FileWriter(file);
			writeAussagen();
			writeRegeln();
			writeRegelGruppen();
			writer.flush();
		} catch (IOException e) {
			MessageDialog.openWarning(
					Display.getCurrent().getActiveShell(),"Fehler",""+e.toString()+" "+ e.getMessage() );	
		}

	}

	private void writeRegelGruppen() throws IOException {
		ArrayList<Regelgruppe> regelgruppen = new ArrayList<Regelgruppe>(
				wb.getRegelGruppen());
		for (int i = 0; i < regelgruppen.size(); i++) {
			writeRegelgruppe(regelgruppen.get(i));
		}

	}

	private void writeRegelgruppe(Regelgruppe regelgruppe) throws IOException {

		writer.write("Regelgruppe:" + System.getProperty("line.separator"));

		writer.write("\tName\t" + InternExternRepresenationMapping.bezeichner
				+ regelgruppe.getName() + ","
				+ System.getProperty("line.separator"));
		writer.write("\tWertebereicht\t"
				+ InternExternRepresenationMapping.bezeichner + "Liste{");
		ArrayList<Regel> regeln = new ArrayList<Regel>(regelgruppe.getRegeln());
		for (int i = 0; i < regeln.size(); i++) {
			if (i != 0)
				writer.write(", ");
			writer.write(regeln.get(i).getName());
		}
		writer.write("};" + System.getProperty("line.separator"));

	}

	private void writeRegeln() throws IOException {
		ArrayList<Regel> regeln = new ArrayList<Regel>(wb.getRegeln());
		for (int i = 0; i < regeln.size(); i++) {
			writeRegel(regeln.get(i));

		}

	}

	private void writeRegel(Regel regel) throws IOException {

		writer.write("Regel:" + System.getProperty("line.separator"));
		writer.write("\tName\t" + InternExternRepresenationMapping.bezeichner
				+ regel.getName() + "," + System.getProperty("line.separator"));
		writer.write("\tPr\u00E4misse\t"
				+ InternExternRepresenationMapping.bezeichner + "{");
		ArrayList<Literal> prämisse = new ArrayList<>(regel.getPraemisse());
		for (int i = 0; i < prämisse.size(); i++) {
			Literal literal = prämisse.get(i);
			if (literal.getOutLogicOperator() != LiteralOperatorenLogik.NULL)
				writer.write(LiteralRepresentation.getLogicOperatorName(literal
						.getOutLogicOperator()) + " ");
			if (literal.isKlammerAuf())
				writer.write("(");
			writer.write(LiteralRepresentation.getLogicOperatorName(literal
					.getInnerLogikOperator()) + " ");
			if (literal.isNOT())
				writer.write("NOT");
			writer.write(" " + literal.getAussage().getName());
			if (!(literal.getAussage().getWertebereich() == WertebereichTyp.BOOLEAN)) {

				writer.write(" "
						+ LiteralRepresentation.getPraedikatName(literal
								.getPraedikat()));
				writer.write(" " + literal.getWert());
			}
			if (literal.isKlammerZu())
				writer.write(")");
			if (i == prämisse.size() - 1)
				writer.write("}," + System.getProperty("line.separator"));
			else
				writer.write(System.getProperty("line.separator") + "\t\t  ");

		}
		writer.write("\tKonklusion\t"
				+ InternExternRepresenationMapping.bezeichner + " ");
		KonklusionsTyp type = regel.getKonklusion().getKonklusionTyp();
		switch (type) {
		case DIAGNOSEAUSGABE:
			writer.write("{Diagnoseausgabe "
					+ regel.getKonklusion().getDiagnoseaussage().getName()
					+ "}");
			break;
		case LITERAL:
			writer.write("{");
			if (regel.getKonklusion().getLiteral().isNOT())
				writer.write("NOT ");
			writer.write(regel.getKonklusion().getLiteral().getAussage()
					.getName());
			if (regel.getKonklusion().getLiteral().getAussage()
					.getWertebereich() != WertebereichTyp.BOOLEAN) {
				writer.write(" "
						+ LiteralRepresentation.getPraedikatName(regel
								.getKonklusion().getLiteral().getPraedikat())
						+ " " + regel.getKonklusion().getLiteral().getWert());
			}
			writer.write("}");
			break;
		case TEXTAUSGABE:
			writer.write("{Textausgabe \""
					+ regel.getKonklusion().getTextausgabe() + "\"}");
			break;
		}
		writer.write(";" + System.getProperty("line.separator"));
	}

	private void writeAussagen() throws IOException {
		ArrayList<Aussage> aussagen = new ArrayList<Aussage>(wb.getAussagen());
		for (int i = 0; i < aussagen.size(); i++) {
			writeAussage(aussagen.get(i));
		}

	}

	private void writeAussage(Aussage aussage) throws IOException {
		writer.write("Aussage:" + System.getProperty("line.separator"));
		writer.write("\tName\t" + InternExternRepresenationMapping.bezeichner
				+ aussage.getName() + ","
				+ System.getProperty("line.separator"));
		WertebereichTyp type = aussage.getWertebereich();
		switch (type) {
		case INTEGER:
			writer.write("\tWertebereicht\t"
					+ InternExternRepresenationMapping.bezeichner + "integer"
					+ System.getProperty("line.separator"));
			break;
		case BOOLEAN:
			writer.write("\tWertebereicht\t"
					+ InternExternRepresenationMapping.bezeichner + "bool,"
					+ System.getProperty("line.separator"));
			break;
		case REAL:
			writer.write("\tWertebereicht\t"
					+ InternExternRepresenationMapping.bezeichner + "real,"
					+ System.getProperty("line.separator"));
			break;
		case STRINGLIST:
			writer.write("\tWertebereicht\t"
					+ InternExternRepresenationMapping.bezeichner + "Liste{");
			ArrayList<String> werte = new ArrayList<String>(
					aussage.getListWertebereich());
			for (int i = 0; i < werte.size(); i++) {
				if (i != 0)
					writer.write(", ");
				writer.write(werte.get(i));
			}
			writer.write("}," + System.getProperty("line.separator"));
			break;
		default:
			break;
		}
		String fragetext = aussage.getFragetext();
		String diagnosetext = aussage.getDiagnosetext();
		if (fragetext != null && !"".equals(fragetext.trim())) {
			writer.write("\tFragetext\t"
					+ InternExternRepresenationMapping.bezeichner + "{\""
					+ fragetext + "\"}," + System.getProperty("line.separator"));

		}
		if (diagnosetext != null && !"".equals(diagnosetext.trim())) {
			writer.write("\tDiagnosetext\t"
					+ InternExternRepresenationMapping.bezeichner + "{\""
					+ diagnosetext + "\"};");
		}
		writer.write(System.getProperty("line.separator"));

	}
}
