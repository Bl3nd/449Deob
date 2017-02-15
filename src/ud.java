final class ud extends je {
	static mc[] z;
	static int A;
	static int B;
	static int E;
	static int H;
	static int I;
	static rd J;
	static int K;
	static byte[][][] M;
	static pc N;
	static rd O;
	static pc P;
	static rd Q;
	static jd R;
	static rd S;
	private static rd G = md.a((String) "Enter name of friend to delete from list", (byte) 120);

	static {
		J = G;
		O = md.a("Willkommen auf RuneScape", (byte) 117);
		z = new mc[8];
		N = new pc(4096);
		Q = md.a("(U(Y", (byte) 123);
		S = md.a("Von:", (byte) 116);
		P = new pc(32);
	}

	int[] D = new int[1];
	int[] L = new int[]{-1};

	static void a (int var0, int var1, int var2, int var3, byte var4, int var5) {
		try {
			++B;
			int var6 = var3 * (var3 + -32) / var2;
			if (var6 < 8) {
				var6 = 8;
			}

			fc.scrollbarData[0].a(var1, var5);
			fc.scrollbarData[1].a(var1, -16 + var3 + var5);
			int var7 = var0 * (-var6 + -32 + var3) / (-var3 + var2);
			ic.c(var1, var5 + 16, 16, -32 + var3, bf.int_b);
			ic.c(var1, var7 + 16 + var5, 16, var6, nc.a);
			ic.c(var1, var5 + 16 + var7, var6, wb.vb);
			ic.c(1 + var1, var7 + var5 - -16, var6, wb.vb);
			ic.b(var1, var7 + 16 + var5, 16, wb.vb);
			ic.b(var1, var7 + (var5 - -17), 16, wb.vb);
			if (var4 > 0) {
				ic.c(15 + var1, var5 + 16 - -var7, var6, be.int_l);
				ic.c(14 + var1, 17 + (var5 - -var7), -1 + var6, be.int_l);
				ic.b(var1, 15 + var5 - -var7 + var6, 16, be.int_l);
				ic.b(1 + var1, var6 + var5 + 14 - -var7, 15, be.int_l);
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "ud.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	public static void c (boolean var0) {
		try {
			S = null;
			N = null;
			G = null;
			R = null;
			z = null;
			if (!var0) {
				g(124);
			}

			Q = null;
			P = null;
			J = null;
			O = null;
			M = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ud.A(" + var0 + ')');
		}
	}

	static void e (int var0) {
		try {
			M = null;
			o.h = null;
			sb.ints_m = null;
			ge.ints_ab = null;
			af.ints_c = null;
			f.Wc = null;
			p.L = null;
			id.Rb = null;
			s.xb = null;
			u.bytes_kb = null;
			++E;
			if (var0 != 16) {
				M = null;
			}

			ta.Xb = null;
			a.bytes_gb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ud.D(" + var0 + ')');
		}
	}

	static void f (int var0) {
		try {
			if (var0 != -29025) {
				J = null;
			}

			if (jc.cb != null) {
				jc.cb.a(25830);
			}

			++H;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ud.C(" + var0 + ')');
		}
	}

	static void g (int var0) {
		try {
			++K;
			if (nd.Bc != null) {
				synchronized (nd.Bc) {
					nd.Bc = null;
				}
			}

			if (var0 != -17) {
				e(-72);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ud.E(" + var0 + ')');
		}
	}
}
