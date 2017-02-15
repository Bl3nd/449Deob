final class gd {
	static int languageId_int_a = 0;
	static int int_b;
	static dd dd_c;
	static int int_d;
	static ma ma_e;
	static int int_f = 0;
	static rd rd_g = md.a((String) "Lade Konfiguration )2 ", (byte) 120);
	static int[] ints_h = new int[]{1, 2, 4, 8};
	static rd headicons_prayer = md.a((String) "headicons_prayer", (byte) 120);
	static int int_j;
	static rd rd_k = md.a((String) "Bitte warten Sie eine Minute", (byte) 118);
	static int int_l;
	static rd rd_m;
	static int[] ints_n = new int[50];
	static int int_o = 0;
	static int int_q = 0;
	private static rd rd_p = md.a((String) "Enter name:", (byte) 118);

	static {
		rd_m = rd_p;
	}

	static int a (boolean var0, boolean var1, boolean var2) {
		try {
			int var3 = 0;
			if (!var0) {
				a(false, false, false);
			}

			++int_b;
			if (var2) {
				var3 += gf.int_r + we.g;
			}

			if (var1) {
				var3 += sd.O + o.int_r;
			}

			return var3;
		} catch (RuntimeException var4) {
			throw id.a(var4, "gd.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static boolean a (int var0, int var1, byte var2) {
		try {
			++int_l;
			if (~var1 == -1 && var0 == bf.int_m) {
				return true;
			} else if (var1 == 1 && ~ca.int_l == ~var0) {
				return true;
			} else if ((var1 == 2 || ~var1 == -4) && ~var0 == ~te.Cb) {
				return true;
			} else {
				if (var2 != -125) {
					ints_h = null;
				}

				return false;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "gd.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a (int var0, int var1, int var2) {
		try {
			int var3 = -59 / ((37 - var2) / 56);
			if (~fc.int_u != -1 && ~var0 != 0) {
				ld.a(0, var0, false, hf.cacheFile11, 1, fc.int_u, (byte) 124);
				mb.b = var1;
			}

			++int_j;
		} catch (RuntimeException var4) {
			throw id.a(var4, "gd.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void a (int var0) {
		try {
			rd_k = null;
			ints_h = null;
			dd_c = null;
			headicons_prayer = null;
			ma_e = null;
			rd_p = null;
			ints_n = null;
			rd_g = null;
			if (var0 == 8) {
				rd_m = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "gd.A(" + var0 + ')');
		}
	}
}
