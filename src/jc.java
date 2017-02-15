final class jc extends je {
	static int C = 0;
	static rd D = md.a((String) "(Udns", (byte) 122);
	static int E;
	static int H;
	static md J = new md();
	static byte[] K;
	static int M;
	static int O;
	static int Q = 0;
	static int X;
	static int Y;
	static rd unexpectedServerResponse2;
	static rd bb = md.a((String) " steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 120);
	static ff cb;
	static rd db = md.a((String) "Lade Titelbild )2 ", (byte) 114);
	static rd runescapeHasBeenUpdated2;
	private static rd runescapeHasBeenUpdated = md.a((String) "RuneScape has been updated(Q", (byte) 126);
	private static rd unexpectedServerResponse = md.a((String) "Unexpected server response", (byte) 120);

	static {
		runescapeHasBeenUpdated2 = runescapeHasBeenUpdated;
		unexpectedServerResponse2 = unexpectedServerResponse;
	}

	int z;
	bd A;
	ac B;
	ac F;
	int G;
	int I;
	int L;
	int N;
	int P;
	int R;
	int S;
	int T;
	int[] U;
	int V;

	public static void f (int var0) {
		try {
			bb = null;
			runescapeHasBeenUpdated = null;
			unexpectedServerResponse = null;
			runescapeHasBeenUpdated2 = null;
			D = null;
			K = null;
			if (var0 != 15310) {
				runescapeHasBeenUpdated = null;
			}

			db = null;
			cb = null;
			J = null;
			unexpectedServerResponse2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "jc.B(" + var0 + ')');
		}
	}

	static void g (int var0) {
		int var9 = client.int_tb;

		try {
			++E;
			short var1 = 256;
			int var2 = 10;
			int var3;
			if (var9 != 0) {
				var3 = (int) (Math.random() * 100.0D);
				if (var3 < 50) {
					lc.ints_f[(-2 + var1 << 7) + var2] = 255;
				}

				++var2;
			}

			for ( ; var2 < 117 ; ++var2) {
				var3 = (int) (Math.random() * 100.0D);
				if (var3 < 50) {
					lc.ints_f[(-2 + var1 << 7) + var2] = 255;
				}
			}

			var3 = 0;
			int var4;
			int var5;
			int var6;
			if (var9 != 0 || var3 < 100) {
				do {
					var5 = 128 + (int) (Math.random() * 128.0D);
					var4 = 2 + (int) (Math.random() * 124.0D);
					var6 = var4 + (var5 << 7);
					lc.ints_f[var6] = 192;
					++var3;
				} while (var3 < 100);
			}

			var4 = 1;
			if (var9 != 0) {
				var5 = 1;
				if (var9 == 0 && var5 >= 127) {
					++var4;
				} else {
					while (true) {
						var6 = (var4 << 7) + var5;
						jb.W[var6] = (lc.ints_f[var6 - -128] + lc.ints_f[-128 + var6] + lc.ints_f[1 + var6] + lc.ints_f[-1 + var6]) / 4;
						++var5;
						if (var5 >= 127) {
							++var4;
							break;
						}
					}
				}
			}

			while (-1 + var1 > var4) {
				var5 = 1;
				if (var9 == 0 && var5 >= 127) {
					++var4;
				} else {
					do {
						var6 = (var4 << 7) + var5;
						jb.W[var6] = (lc.ints_f[var6 - -128] + lc.ints_f[-128 + var6] + lc.ints_f[1 + var6] + lc.ints_f[-1 + var6]) / 4;
						++var5;
					} while (var5 < 127);

					++var4;
				}
			}

			fb.int_m += 128;
			if (~b.ints_od.length > ~fb.int_m) {
				fb.int_m -= b.ints_od.length;
				var5 = (int) (Math.random() * 12.0D);
				ge.a(ce.oas_m[var5], (byte) 36);
			}

			var5 = 1;
			int var7;
			if (var9 != 0 || var5 < var1 + -1) {
				do {
					var6 = 1;
					if (var9 == 0 && var6 >= 127) {
						++var5;
					} else {
						do {
							var7 = var6 + (var5 << 7);
							int var8 = -(b.ints_od[fb.int_m + var7 & -1 + b.ints_od.length] / 5) + jb.W[128 + var7];
							if (var8 < 0) {
								var8 = 0;
							}

							lc.ints_f[var7] = var8;
							++var6;
						} while (var6 < 127);

						++var5;
					}
				} while (var5 < var1 + -1);
			}

			var6 = 0;
			if (var9 != 0) {
				f.Vc[var6] = f.Vc[1 + var6];
				++var6;
			}

			while (~(-1 + var1) < ~var6) {
				f.Vc[var6] = f.Vc[1 + var6];
				++var6;
			}

			f.Vc[-1 + var1] = (int) (Math.sin((double) ce.y / 14.0D) * 16.0D + 14.0D * Math
					.sin((double) ce.y / 15.0D) + Math.sin((double) ce.y / 16.0D) * 12.0D);
			if (~j.zb < -1) {
				j.zb -= 4;
			}

			if (var0 < h.int_q) {
				h.int_q -= 4;
			}

			if (~j.zb == -1 && ~h.int_q == -1) {
				var7 = (int) (Math.random() * 2000.0D);
				if (var7 == 1) {
					h.int_q = 1024;
				}

				if (~var7 == -1) {
					j.zb = 1024;
				}
			}

		} catch (RuntimeException var10) {
			throw id.a(var10, "jc.C(" + var0 + ')');
		}
	}

	final void e (int var1) {
		try {
			int var2 = this.L;
			if (var1 != 17015) {
				this.T = 112;
			}

			++H;
			bd var3 = this.A.g(-1);
			if (var3 == null) {
				this.L = -1;
				this.S = 0;
				this.U = null;
				this.z = 0;
				this.P = 0;
			} else {
				this.P = var3.int_lb;
				this.z = var3.int_eb;
				this.S = 128 * var3.Yb;
				this.L = var3.int_fc;
				this.U = var3.ints_sb;
			}

			if (this.L != var2 && this.B != null) {
				e.Nb.a(this.B);
				this.B = null;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "jc.A(" + var1 + ')');
		}
	}
}
