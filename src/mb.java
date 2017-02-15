final class mb {
	static int int_a;
	static int b = 0;
	static rd c = md.a((String) "blinken1:", (byte) 118);
	static rd reportAbuse2;
	static int h;
	static int l;
	static rd m = md.a((String) "Konfig geladen)3", (byte) 114);
	static rd p = md.a((String) "::noclip", (byte) 114);
	static int q;
	static rd r;
	static int s;
	static rd t = md.a((String) "T", (byte) 119);
	static nd v;
	static rd x;
	static rd y;
	static int z;
	static rd A = md.a((String) "Ihr Spielkonto wurde deaktiviert)3", (byte) 115);
	static int B;
	private static rd i = md.a((String) " from your friend list first", (byte) 125);
	private static rd reportAbuse = md.a((String) "Report abuse", (byte) 118);

	static {
		reportAbuse2 = reportAbuse;
		y = md.a("leuchten3:", (byte) 124);
		r = i;
		x = md.a("Handel)4Duell", (byte) 118);
	}

	int d;
	ha f;
	int g;
	ha j;
	ha k;
	int n;
	int u;
	int w;

	static void a (boolean var0, int var1) {
		try {
			++z;
			if (a.a(0, var1)) {
				nd[] var2 = ld.c[var1];
				int var3 = 0;
				if (var0) {
					for ( ; ~var2.length < ~var3 ; ++var3) {
						nd var4 = var2[var3];
						if (var4 != null) {
							var4.Lb = 0;
							var4.cb = 0;
						}
					}

				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "mb.E(" + var0 + ',' + var1 + ')');
		}
	}

	static int a (int var0, int var1, boolean var2) {
		try {
			++h;
			ud var3 = (ud) ud.P.a(-1, (long) var0);
			if (var3 == null) {
				return 0;
			} else {
				if (!var2) {
					a(116, -111, -73, -101, 106, -114, -51, -22, 12, 58);
				}

				return ~var1 <= -1 && ~var1 > ~var3.D.length ? var3.D[var1] : 0;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "mb.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void a (int var0) {
		try {
			if (var0 < 84) {
				y = null;
			}

			t = null;
			y = null;
			v = null;
			A = null;
			p = null;
			i = null;
			r = null;
			x = null;
			m = null;
			c = null;
			reportAbuse2 = null;
			reportAbuse = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "mb.A(" + var0 + ')');
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
				   int var9) {
		int var12 = client.int_tb;

		try {
			++B;
			p var10 = null;
			p var11 = (p) kd.j.c((byte) 30);
			if (var12 != 0 || var11 != null) {
				do {
					if (~var6 == ~var11.T && ~var1 == ~var11.X && ~var11.J == ~var0 && ~var7 == ~var11.E) {
						var10 = var11;
						break;
					}

					var11 = (p) kd.j.a((byte) -68);
				} while (var11 != null);
			}

			if (var10 == null) {
				var10 = new p();
				var10.E = var7;
				var10.J = var0;
				var10.T = var6;
				var10.X = var1;
				le.a((byte) 103, var10);
				kd.j.a(var10, (byte) 103);
			}

			var10.B = var4;
			if (var5 >= -108) {
				a(-52);
			}

			var10.W = var8;
			var10.M = var2;
			var10.Y = var9;
			var10.O = var3;
		} catch (RuntimeException var13) {
			throw id.a(var13, "mb.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static boolean a (int var0, int var1, int fileRequest) {
		try {
			if (var0 == 11) {
				var0 = 10;
			}

			bd var3 = ub.a(-76, fileRequest);
			if (~var0 <= -6 && ~var0 >= -9) {
				var0 = 4;
			}

			++l;
			if (var1 != -11090) {
				m = null;
			}

			return var3.a(125, var0);
		} catch (RuntimeException var4) {
			throw id.a(var4, "mb.B(" + var0 + ',' + var1 + ',' + fileRequest + ')');
		}
	}
}
