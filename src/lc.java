final class lc {
	static he he_a;
	static int b;
	static rd c = md.a((String) "Nehmen", (byte) 124);
	static uc readStream;
	static int e;
	static int[] ints_f;
	static rd connectionLost2;
	static int h;
	static int i;
	static int j = -1;
	static int k = 0;
	static int l = 0;
	static rd invback = md.a((String) "invback", (byte) 121);
	static int n = -1;
	static int o;
	static int currentGameState = 0;
	static int q;
	static md[][][] s;
	static int t;
	private static rd connectionLost = md.a((String) "Connection lost", (byte) 127);

	static {
		connectionLost2 = connectionLost;
		s = new md[4][104][104];
		q = 0;
		readStream = new uc(5000);
	}

	private int[] u;

	lc (int[] var1) {
		int var6 = client.int_tb;
		//super();

		try {
			int var2 = 1;
			if (var6 != 0) {
				var2 <<= 1;
			}

			while (~((var1.length >> 1) + var1.length) <= ~var2) {
				var2 <<= 1;
			}

			this.u = new int[var2 + var2];
			int var3 = 0;
			if (var6 != 0) {
				this.u[var3] = -1;
				++var3;
			}

			while (var3 < var2 - -var2) {
				this.u[var3] = -1;
				++var3;
			}

			int var4 = 0;
			if (var6 != 0 || ~var4 > ~var1.length) {
				do {
					int var5 = -1 + var2 & var1[var4];
					if (var6 != 0) {
						var5 = var2 + -1 & var5 - -1;
					}

					while (~this.u[1 + var5 + var5] != 0) {
						var5 = var2 + -1 & var5 - -1;
					}

					this.u[var5 + var5] = var1[var4];
					this.u[var5 + var5 + 1] = var4++;
				} while (~var4 > ~var1.length);

			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "lc.<init>(" + "{...}" + ')');
		}
	}

	public static void a (byte var0) {
		try {
			connectionLost = null;
			c = null;
			connectionLost2 = null;
			s = null;
			he_a = null;
			invback = null;
			ints_f = null;
			readStream = null;
			if (var0 != 14) {
				ints_f = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "lc.D(" + var0 + ')');
		}
	}

	static int a (byte var0, int var1, int var2) {
		int var7 = client.int_tb;

		try {
			++b;
			ud var3 = (ud) ud.P.a(-1, (long) var1);
			if (var3 == null) {
				return 0;
			} else if (~var2 == 0) {
				return 0;
			} else {
				int var5 = 9 / ((var0 - -46) / 47);
				int var4 = 0;
				int var6 = 0;
				if (var7 == 0 && ~var3.D.length >= ~var6) {
					return var4;
				} else {
					do {
						if (var2 == var3.L[var6]) {
							var4 += var3.D[var6];
						}

						++var6;
					} while (~var3.D.length < ~var6);

					return var4;
				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "lc.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a (int var0, int var1, byte[] var2, boolean var3, int var4) {
		try {
			++o;
			if (p.z != null) {
				if (var0 <= -34) {
					if (~f.Ab > -1) {
						if (r.T != 0) {
							jc.K = var2;
							client.loopInfinite = var3;
							ce.z = var1;
						} else {
							ja.a((byte) -110, var1, var2, var3);
						}
					} else {
						var4 -= 20;
						if (~var4 > -2) {
							var4 = 1;
						}

						label36:
						{
							r.T = var4;
							if (~f.Ab == -1) {
								te.tb = 0;
							} else {
								int var5 = qb.a(f.Ab, (byte) -114);
								var5 -= tc.I;
								te.tb = (-1 + var4 + var5 + 3600) / var4;
							}
						}

						ce.z = var1;
						jc.K = var2;
						client.loopInfinite = var3;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "lc.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void a (byte var0, int var1) {
		int var6 = client.int_tb;

		try {
			++t;
			if (var1 != -1) {
				if (a.a(0, var1)) {
					nd[] var2 = ld.c[var1];
					int var3 = -32 / ((var0 - -86) / 35);
					int var4 = 0;
					if (var6 != 0 || ~var4 > ~var2.length) {
						do {
							nd var5 = var2[var4];
							if (var5.pb != null) {
								m.a(var5.pb, 0, 0, 0, 23, null, var5);
							}

							++var4;
						} while (~var4 > ~var2.length);

					}
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "lc.B(" + var0 + ',' + var1 + ')');
		}
	}

	final int a (int unused, int i) {
		try {
			++h;
			int length = this.u.length - 2;
			int i1 = length & i << 1;
			while (true) {
				int i2 = this.u[i1];
				if (i2 == i) {
					return this.u[1 + i1];
				} else if (~i2 == 0) {
					return -1;
				}

				i1 = length & i1 + 2;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "lc.E(" + unused + ',' + i + ')');
		}
	}
}
