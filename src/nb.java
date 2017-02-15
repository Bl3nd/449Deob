final class nb {
	static rd a = md.a((String) "RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 117);
	static rd b;
	static int d;
	static int f;
	static rd g = md.a((String) "@yel@*V", (byte) 119);
	static int h;
	static int l;
	static int m;
	static int n;
	static rd o;
	static int p;
	static id s;
	private static rd c = md.a((String) "Remove", (byte) 126);

	static {
		b = c;
		o = md.a("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", (byte) 123);
		m = 128;
		n = 0;
	}

	int e;
	int i;
	int int_j;
	int k;
	int q;
	boolean r = true;
	int t;

	nb (int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		try {
			this.int_j = var1;
			this.k = var4;
			this.q = var6;
			this.e = var5;
			this.t = var2;
			this.r = var7;
			this.i = var3;
		} catch (RuntimeException var9) {
			throw id.a(var9, "nb.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	public static void a (int var0) {
		try {
			a = null;
			s = null;
			c = null;
			if (var0 == 9380) {
				b = null;
				o = null;
				g = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "nb.D(" + var0 + ')');
		}
	}

	static void a (int len, byte unused) {
		try {
			++l;
			pe.b += len;
			while (pe.b >= hc.sampleRate) {
				pe.b -= hc.sampleRate;
				va.int_q -= va.int_q >> 2;
			}

			va.int_q -= len * 1000;
			if (va.int_q < 0) {
				va.int_q = 0;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "nb.C(" + len + ',' + unused + ')');
		}
	}

	static int a (byte unused) {
		try {
			++f;
			return ie.o++;
		} catch (RuntimeException var2) {
			throw id.a(var2, "nb.A(" + unused + ')');
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, nd var7, int var8) {
		int var12 = client.int_tb;

		try {
			label132:
			{
				if (od.Bb) {
					af.int_q = 32;
					if (var12 == 0) {
						break label132;
					}
				}

				af.int_q = 0;
			}

			od.Bb = false;
			if (var5 <= -69) {
				int var9;
				label148:
				{
					++h;
					if (~var6 <= ~var8 && 16 + var8 > var6 && var2 <= var3 && var2 + 16 > var3) {
						var7.int_ib -= j.lb * 4;
						if (~var4 == -2) {
							db.F = true;
						}

						if (var4 != 2 && ~var4 != -4) {
							break label148;
						}

						w.h = true;
						if (var12 == 0) {
							break label148;
						}
					}

					if (~var8 < ~var6 || ~(16 + var8) >= ~var6 || ~var3 > ~(-16 + var1 + var2) || var2 + var1 <= var3) {
						if (~(var8 - af.int_q) < ~var6 || af.int_q + 16 + var8 <= var6 || var2 + 16 > var3 || ~(-16 + var1 + var2) >= ~var3 || ~j.lb >= -1) {
							break label148;
						}

						od.Bb = true;
						var9 = var1 * (var1 + -32) / var0;
						if (var4 == 1) {
							db.F = true;
						}

						if (~var4 == -3 || var4 == 3) {
							w.h = true;
						}

						if (var9 < 8) {
							var9 = 8;
						}

						int var10 = -(var9 / 2) + -var2 + (var3 - 16);
						int var11 = -32 + var1 + -var9;
						var7.int_ib = (-var1 + var0) * var10 / var11;
						if (var12 == 0) {
							break label148;
						}
					}

					var7.int_ib += 4 * j.lb;
					if (var4 == 1) {
						db.F = true;
					}

					if (var4 == 2 || var4 == 3) {
						w.h = true;
					}
				}

				if (wd.int_a != 0) {
					var9 = var7.Bb;
					if (var4 == -1) {
						var9 = 479;
					}

					if (var6 >= var8 + -var9 && ~var2 >= ~var3 && var6 < 16 + var8 && ~(var1 + var2) <= ~var3) {
						if (~var4 == -2) {
							db.F = true;
						}

						var7.int_ib += 45 * wd.int_a;
						if (var4 == 2 || ~var4 == -4) {
							w.h = true;
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "nb.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ')');
		}
	}
}
