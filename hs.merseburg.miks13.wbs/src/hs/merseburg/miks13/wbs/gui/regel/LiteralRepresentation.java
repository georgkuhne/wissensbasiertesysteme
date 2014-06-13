package hs.merseburg.miks13.wbs.gui.regel;

import wissensbasismodel.LiteralOperatorenLogik;

public class LiteralRepresentation {
	private final static String[] binaerePraedikatFunktionen = { "==", "<>" };
	private final static String[] praedikatFunktionen = { "==", "<>", "<=",
			">=", "<", ">" };
	private final static String[] klammerAuf = { "", "(" };
	private final static String[] klammerZU = { "", ")" };
	private final static String[] NEGATION = { "", "NOT" };
	private final static String[] logicOperatoren = { "", "AND", "OR" };

	public static String[] getBinaerePraedikatFunktionen() {
		return binaerePraedikatFunktionen;
	}

	public static String[] getPraedikatFunktionen() {
		return praedikatFunktionen;
	}

	public static String[] getKlammerauf() {
		return klammerAuf;
	}

	public static String[] getKlammerzu() {
		return klammerZU;
	}

	public static String[] getNegation() {
		return NEGATION;
	}

	public static String[] getLogikOperatoren() {
		// TODO Auto-generated method stub
		return logicOperatoren;
	}

	public static int getIndexOfLogicOperator(LiteralOperatorenLogik op) {

		if (op == null)
			return 0;
		switch (op) {
		case AND:
			return 1;
		case OR:
			return 2;
		case NULL:
			return 0;
		default:
			return 0;

		}
	}

	public static LiteralOperatorenLogik getLogicOperatorByName(String value) {
		if (value == null)
			return LiteralOperatorenLogik.NULL;
		if (value.equals(logicOperatoren[0]))
			return LiteralOperatorenLogik.NULL;
		if (value.equals(logicOperatoren[1]))
			return LiteralOperatorenLogik.AND;
		if (value.equals(logicOperatoren[2]))
			return LiteralOperatorenLogik.OR;
		return LiteralOperatorenLogik.NULL;
	}

	public static boolean getLogicKlammeraufByName(String value) {
		if (value == null)
			return false;
		if (value.equals(klammerAuf[0]))
			return false;
		if (value.equals(klammerAuf[1]))
			return true;
		return false;
	}

	public static boolean getLogicKlammerZUByName(String value) {
		if (value == null)
			return false;
		if (value.equals(klammerZU[0]))
			return false;
		if (value.equals(klammerZU[1]))
			return true;
		return false;
	}

	public static boolean getNOTByName(String value) {
		if (value == null)
			return false;
		if (value.equals(NEGATION[0]))
			return false;
		if (value.equals(NEGATION[1]))
			return true;
		return false;
	}
}
