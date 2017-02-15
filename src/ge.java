final class ge extends ee {
	static int A;
	static int D;
	static int E;
	static ke cacheFile3;
	static int G;
	static int[] H = new int[256];
	static int J;
	static int M;
	static int N;
	static int O;
	static rd Q;
	static rd loadedUpdateList2;
	static int T;
	static byte[] U;
	static rd V;
	static long W;
	static int X;
	static rd Y;
	static int[][] ints_ab;
	static rd rd_bb;
	static rd rd_db;
	private static rd loadedUpdateList;
	private static rd Z;
	private static rd rd_cb;

	static {
		for (int var1 = 0 ; ~var1 > -257 ; ++var1) {
			int var0 = var1;

			for (int var2 = 0 ; var2 < 8 ; ++var2) {
				if (~(1 & var0) == -2) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			H[var1] = var0;
		}

		Y = md.a("Wen m-Ochten Sie von der Liste entfernen?", (byte) 125);
		Z = md.a("Existing user", (byte) 122);
		loadedUpdateList = md.a("Loaded update list", (byte) 121);
		Q = md.a("Musik)2Engine vorbereitet)3", (byte) 114);
		rd_cb = md.a("Cancel", (byte) 117);
		V = md.a("Suche nach Updates )2 ", (byte) 123);
		rd_bb = Z;
		rd_db = rd_cb;
		U = new byte[520];
		loadedUpdateList2 = loadedUpdateList;
	}

	private int B;
	private long C;
	private int I;
	private int K;
	private long[] L = new long[10];
	private int P;

	ge () {
		try {
			this.e(15);//todo
		} catch (RuntimeException var2) {
			throw id.a(var2, "ge.<init>(" + ')');
		}
	}

	static oa a (rd fileName, pb cacheFile, boolean unused, rd emptyString) {
		try {
			++M;
			int value = cacheFile.a(fileName, (byte) -96);
			int var5 = cacheFile.a(emptyString, -31757, value);
			return jb.a(64, cacheFile, value, var5);
		} catch (RuntimeException var6) {
			throw id.a(var6, "ge.L(" + (fileName != null ? "{...}" : "null") + ',' + (cacheFile != null ? "{...}" : "null") + ',' + unused + ',' + (emptyString != null ? "{...}" : "null") + ')');
		}
	}

	static int a (int var0, int var1, int var2, int var3) {
		try {
			if (var1 != 255) {
				return -21;
			} else {
				var3 &= 3;
				++D;
				return ~var3 == -1 ? var2 : (var3 == 1 ? 7 + -var0 : (var3 == 2 ? -var2 + 7 : var0));
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ge.N(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void g (int var0) {
		try {
			Y = null;
			rd_db = null;
			H = null;
			U = null;
			cacheFile3 = null;
			Z = null;
			Q = null;
			rd_cb = null;
			V = null;
			rd_bb = null;
			loadedUpdateList2 = null;
			ints_ab = null;
			loadedUpdateList = null;
			if (var0 != 25) {
				W = -10L;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ge.O(" + var0 + ')');
		}
	}

	static void a (oa class_oa, byte unused) {
		try {
			++E;
			int var3 = 0;
			while (~var3 > ~b.ints_od.length) {
				b.ints_od[var3] = 0;
				++var3;
			}

			short var2 = 256;
			int var4 = 0;
			int var5;
			if (~var4 > -5001) {
				do {
					var5 = (int) (Math.random() * 128.0D * (double) var2);
					b.ints_od[var5] = (int) (Math.random() * 256.0D);
					++var4;
				} while (~var4 > -5001);
			}

			var5 = 0;
			int var6;
			int var7;
			int var8;
			int[] var14;
			while (~var5 > -21) {
				var6 = 1;
				if (var2 + -1 <= var6) {
					var14 = b.ints_od;
					b.ints_od = ja.ints_o;
					ja.ints_o = var14;
					++var5;
				} else {
					do {
						var7 = 1;
						if (~var7 <= -128) {
							++var6;
						} else {
							do {
								var8 = (var6 << 7) + var7;
								ja.ints_o[var8] = (b.ints_od[1 + var8] + b.ints_od[var8 + -1] + b.ints_od[-128 + var8] + b.ints_od[128 + var8]) / 4;
								++var7;
							} while (~var7 > -128);

							++var6;
						}
					} while (var2 + -1 > var6);

					var14 = b.ints_od;
					b.ints_od = ja.ints_o;
					ja.ints_o = var14;
					++var5;
				}
			}

			if (class_oa != null) {
				var6 = 0;
				var7 = 0;
				if (class_oa.nb > var7) {
					do {
						var8 = 0;
						if (~var8 <= ~class_oa.mb) {
							++var7;
						} else {
							do {
								if (~class_oa.jb[var6++] != -1) {
									int var10 = var7 - -16 - -class_oa.kb;
									int var9 = class_oa.hb + (var8 - -16);
									int var11 = (var10 << 7) + var9;
									b.ints_od[var11] = 0;
								}

								++var8;
							} while (~var8 > ~class_oa.mb);

							++var7;
						}
					} while (class_oa.nb > var7);
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "ge.M(" + (class_oa != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final void e (int unused) {
		try {
			++N;
			this.I = 256;
			this.B = 0;
			this.P = 1;
			this.C = pa.c(0);
			int var2 = 0;
			while (var2 < 10) {
				this.L[var2] = this.C;
				++var2;
			}

		} catch (RuntimeException var3) {
			throw id.a(var3, "ge.A(" + unused + ')');
		}
	}

	final void c (int unused) {
		int var3 = client.int_tb;

		try {
			if (unused != -2982) {
				this.I = -101;
			}

			int var2 = 0;
			if (var3 != 0) {
				this.L[var2] = 0L;
				++var2;
			}

			while (~var2 > -11) {
				this.L[var2] = 0L;
				++var2;
			}

			++T;
		} catch (RuntimeException var4) {
			throw id.a(var4, "ge.C(" + unused + ')');
		}
	}

	final int b (int i, int i1, int unused) {
		try {
			int i2 = this.I;
			int i3 = this.P;
			++G;
			this.I = 300;
			this.P = 1;
			this.C = pa.c(0);
			if (this.L[this.K] != 0L) {
				if (this.L[this.K] < this.C) {
					this.I = (int) ((long) (i1 * 2560) / (this.C + -this.L[this.K]));
				}
			} else {
				this.P = i3;
				this.I = i2;
			}

			if (~this.I > -26) {
				this.I = 25;
			}

			if (this.I > 256) {
				this.I = 256;
				this.P = (int) (-((-this.L[this.K] + this.C) / 10L) + (long) i1);
			}

			if (~this.P < ~i1) {
				this.P = i1;
			}

			this.L[this.K] = this.C;
			this.K = (1 + this.K) % 10;
			int var6;
			if (~this.P < -2) {
				var6 = 0;
				do {
					if (~this.L[var6] != -1L) {
						this.L[var6] += (long) this.P;
					}

					++var6;
				} while (var6 < 10);
			}

			if (~i < ~this.P) {
				this.P = i;
			}

			var6 = 0;
			wa.sleep(17525, (long) this.P);
			while (~this.B > -257) {
				++var6;
				this.B += this.I;
			}

			this.B &= 255;
			return var6;
		} catch (RuntimeException var8) {
			throw id.a(var8, "ge.B(" + i + ',' + i1 + ',' + unused + ')');
		}
	}
}
