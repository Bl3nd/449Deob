final class me extends je {
	static rd z = md.a((String) "@gre@", (byte) 119);
	static rd errorConnectingToServer2;
	static int B;
	static int C = 78;
	static int D;
	static rd backright1 = md.a((String) "backright1", (byte) 115);
	static int F;
	static int H = 0;
	static rd I = md.a((String) "Verbindung mit", (byte) 123);
	static volatile boolean J = true;
	static int K;
	static int L = 0;
	static int Q = 0;
	static int T;
	static rd iconsRedrawn;
	static int lb;
	private static rd errorConnectingToServer = md.a((String) "Error connecting to server)3", (byte) 124);

	static {
		errorConnectingToServer2 = errorConnectingToServer;
		iconsRedrawn = md.a("Icons redrawn", (byte) 119);
		lb = 0;
	}

	int[] M = new int[5];
	int N;
	int O;
	me P;
	t R;
	nb S;
	ra U;
	ob V;
	int W;
	int X;
	mb Y;
	boolean Z;
	int ab;
	int bb = 0;
	boolean db;
	int eb;
	bc fb;
	la[] gb = new la[5];
	boolean hb;
	int ib;
	int jb;
	int kb;
	int mb;

	me (int var1, int x, int y) {
		try {
			this.jb = y;
			this.N = x;
			this.eb = this.O = var1;
		} catch (RuntimeException var5) {
			throw id.a(var5, "me.<init>(" + var1 + ',' + x + ',' + y + ')');
		}
	}

	public static void e (int var0) {
		try {
			backright1 = null;
			errorConnectingToServer = null;
			int var1 = -73 / ((var0 - -75) / 47);
			z = null;
			I = null;
			iconsRedrawn = null;
			errorConnectingToServer2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "me.A(" + var0 + ')');
		}
	}

	static a a (int var0, pb var1, boolean var2, pb var3, int var4) {
		int var11 = client.int_tb;

		try {
			++F;
			boolean var5 = true;
			int[] var6 = var1.a(var0, false);
			int var7 = var4;
			if (var11 == 0 && ~var6.length >= ~var4) {
				if (!var5) {
					return null;
				} else {
					try {
						return new a(var1, var3, var0, var2);
					} catch (Exception var13) {
						return null;
					}
				}
			} else {
				do {
					label73:
					{
						byte[] var8 = var1.a(var0, -1, var6[var7]);
						if (var8 == null) {
							var5 = false;
							if (var11 == 0) {
								break label73;
							}
						}

						byte[] var10;
						label44:
						{
							int var9 = var8[1] & 255 | var8[0] << 8 & '\uff00';
							if (var2) {
								var10 = var3.a(0, -1, var9);
								if (var11 == 0) {
									break label44;
								}
							}

							var10 = var3.a(var9, ~var4, 0);
						}

						if (var10 == null) {
							var5 = false;
						}
					}

					++var7;
				} while (~var6.length < ~var7);

				if (!var5) {
					return null;
				} else {
					try {
						return new a(var1, var3, var0, var2);
					} catch (Exception var12) {
						return null;
					}
				}
			}
		} catch (RuntimeException var14) {
			throw id.a(var14, "me.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}
}
