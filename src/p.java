final class p extends je {
	static sb z;
	static int C;
	static byte[][] D = new byte[1000][];
	static int F;
	static int H;
	static int I;
	static int K;
	static int[] L;
	static int[] N = new int[25];
	static rd S = md.a((String) "Startseite auf (WSpielkonto wiederherstellen(W)3", (byte) 127);
	static rd U = md.a((String) "@gr2@", (byte) 127);
	static int V = 0;
	int B = 0;
	int E;
	int G;
	int J;
	int M;
	int O = -1;
	int Q;
	int T;
	int W;
	int X;
	int Y;
	int Z;

	static void a (int unused, int i) {
		try {
			++C;
			ie.o = i;
		} catch (RuntimeException var3) {
			throw id.a(var3, "p.E(" + unused + ',' + i + ')');
		}
	}

	static boolean a (int var0, nd var1) {
		int var5 = client.int_tb;

		try {
			++F;
			if (var1.Dc == null) {
				return false;
			} else {
				if (var0 > -114) {
					z = null;
				}

				int var2 = 0;
				if (var5 == 0 && ~var2 <= ~var1.Dc.length) {
					return true;
				} else {
					do {
						int var3 = hf.a(var1, var2, (byte) -72);
						int var4 = var1.ints_ic[var2];
						if (var1.Dc[var2] == 2) {
							if (var3 >= var4) {
								return false;
							}
						} else if (~var1.Dc[var2] == -4) {
							if (~var4 <= ~var3) {
								return false;
							}
						} else if (var1.Dc[var2] == 4) {
							if (~var4 == ~var3) {
								return false;
							}
						} else if (~var3 != ~var4) {
							return false;
						}

						++var2;
					} while (~var2 > ~var1.Dc.length);

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "p.D(" + var0 + ',' + "{...}" + ')');
		}
	}

	static void e (int unused) {
		try {
			++K;
			int i = -1;
			int i1;
			for ( ; b.int_hd > i ; ++i) {
				if (i != -1) {
					i1 = r.R[i];
				} else {
					i1 = 2047;
				}

				td class_td = f.Lc[i1];
				if (class_td != null && class_td.int_wc > 0) {
					--class_td.int_wc;
					if (class_td.int_wc == 0) {
						class_td.Qb = null;
					}
				}
			}

			i1 = 0;
			if (lc.q > i1) {
				do {
					int i2 = ca.ints_b[i1];
					b class_b = ta.Nb[i2];
					if (class_b != null && class_b.int_wc > 0) {
						--class_b.int_wc;
						if (class_b.int_wc == 0) {
							class_b.Qb = null;
						}
					}

					++i1;
				} while (lc.q > i1);

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "p.A(" + unused + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void f (int unused) {
		try {
			++H;
			while (true) {
				tc class_tc;
				synchronized (sb.md_e) {
					class_tc = (tc) pe.i.d(-63);
				}

				if (class_tc == null) {
					return;
				}

				class_tc.B.a((int) class_tc.script, -125, class_tc.N, class_tc.P, false);
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "p.B(" + unused + ')');
		}
	}

	public static void g (int var0) {
		try {
			N = null;
			if (var0 != -1) {
				D = null;
			}

			L = null;
			U = null;
			D = null;
			S = null;
			z = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "p.C(" + var0 + ')');
		}
	}
}
