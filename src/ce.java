final class ce {
	static int plane;
	static he he_b;
	static rd unableToFind_2;
	static int int_e;
	static jd jd_f;
	static int int_g = 0;
	static int int_h;
	static int int_k = 0;
	static int int_l = -1;
	static oa[] oas_m;
	static rd colon_ = md.a((String) ": ", (byte) 119);
	static rd rd_o = md.a((String) "Diese Welt ist voll)3", (byte) 119);
	static int loadingStage = 0;
	static boolean boolean_s = false;
	static rd enterNameOfPlayerToAddToList2;
	static rd to2;
	static rd mapscene = md.a((String) "mapscene", (byte) 121);
	static int y;
	static int z;
	static int A;
	private static rd to = md.a((String) "To", (byte) 120);
	private static rd unableToFind_ = md.a((String) "Unable to find ", (byte) 116);
	private static rd enterNameOfPlayerToAddToList = md.a((String) "Enter name of player to add to list", (byte) 115);

	static {
		to2 = to;
		y = 0;
		unableToFind_2 = unableToFind_;
		enterNameOfPlayerToAddToList2 = enterNameOfPlayerToAddToList;
	}

	wb wb_i;
	int int_p = -1;
	rd[] rds_q;
	int[] ints_v;

	public static void a (int unused) {
		try {
			to = null;
			he_b = null;
			unableToFind_ = null;
			unableToFind_2 = null;
			rd_o = null;
			mapscene = null;
			oas_m = null;
			jd_f = null;
			to2 = null;
			enterNameOfPlayerToAddToList = null;
			colon_ = null;
			enterNameOfPlayerToAddToList2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ce.B(" + unused + ')');
		}
	}

	static void b (int unused) {
		try {
			++int_e;
			ja.a((byte) -125, 0, null, false);
		} catch (RuntimeException var2) {
			throw id.a(var2, "ce.A(" + unused + ')');
		}
	}

	static void a (f class_f, int unused, int i) {
		try {
			++int_h;
			cf.a(class_f.y_, i, class_f.x_, 128);
		} catch (RuntimeException var4) {
			throw id.a(var4, "ce.C(" + "{...}" + ',' + unused + ',' + i + ')');
		}
	}
}
