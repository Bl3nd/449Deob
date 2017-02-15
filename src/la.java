final class la {
	static rd b = md.a((String) "Zu viele Verbindungen von Ihrer Adresse)3", (byte) 122);
	static int i;
	static rd j = md.a((String) "sich mit einer anderen Welt zu verbinden)3", (byte) 121);
	static rd loadingFonts2;
	static int m;
	static boolean redrawChatPanel = false;
	static int r;
	static rd s;
	static int t = 0;
	static int v = 0;
	static rd loadingInterfaces2;
	private static rd loadingFonts;
	private static rd loadingInterfaces = md.a((String) "Loading interfaces )2 ", (byte) 121);

	static {
		loadingInterfaces2 = loadingInterfaces;
		s = md.a(" weitere Optionen", (byte) 120);
		loadingFonts = md.a("Loading fonts )2 ", (byte) 117);
		loadingFonts2 = loadingFonts;
	}

	int int_a;
	int c;
	int d;
	int int_e;
	int f;
	int g;
	int h;
	int k = 0;
	int n;
	int o = 0;
	int p;
	ha y;
	int z;
	int A;

	static he a (byte unused) {
		int dummy = client.int_tb;
		try {
			++i;
			he class_he = new he();
			class_he.kb = a.mb;
			class_he.jb = sd.bb[0];
			class_he.imageWidth = ra.q[0];
			class_he.lb = ld.g;
			class_he.imageHeight = w.ints_a[0];
			class_he.gb = e.yb[0];
			byte[] var3 = w.bytes_s[0];
			int var2 = class_he.imageWidth * class_he.imageHeight;
			class_he.imagePixels = new int[var2];
			int var4 = 0;
			if (dummy == 0 && var2 <= var4) {
				ee.b(-1958111762);
				return class_he;
			} else {
				do {
					class_he.imagePixels[var4] = eb.ints_g[od.a(var3[var4], 255)];
					++var4;
				} while (var2 > var4);

				ee.b(-1958111762);
				return class_he;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "la.B(" + unused + ')');
		}
	}

	public static void a (int var0) {
		try {
			loadingFonts = null;
			b = null;
			loadingInterfaces2 = null;
			s = null;
			loadingInterfaces = null;
			if (var0 >= -86) {
				v = 93;
			}

			j = null;
			loadingFonts2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "la.A(" + var0 + ')');
		}
	}

	static void a (byte var0, int var1, g var2, id var3) {
		int var15 = client.int_tb;

		try {
			if (var0 != -116) {
				b = null;
			}

			++m;
			sd var4 = new sd();
			var4.F = var3.readUnsignedByte((byte) 116);
			var4.z = var3.readInt((byte) -107);
			var4.Z = new byte[var4.F][][];
			var4.V = new int[var4.F];
			var4.T = new ma[var4.F];
			var4.N = new int[var4.F];
			var4.R = new int[var4.F];
			var4.J = new ma[var4.F];
			int var5 = 0;
			if (var15 == 0 && ~var4.F >= ~var5) {
				ie.a.a(var4, (byte) 100);
			} else {
				do {
					try {
						label122:
						{
							int var6 = var3.readUnsignedByte((byte) 116);
							String var7;
							String var8;
							int var9;
							if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
								if (var6 != 3 && ~var6 != -5) {
									break label122;
								}

								var7 = new String(var3.readRSString(-1).b((byte) -28));
								var8 = new String(var3.readRSString(var0 ^ 115).b((byte) -28));
								var9 = var3.readUnsignedByte((byte) 116);
								String[] var10 = new String[var9];
								int var11 = 0;
								if (var15 != 0 || var11 < var9) {
									do {
										var10[var11] = new String(var3.readRSString(sd.b(var0, 115)).b((byte) -28));
										++var11;
									} while (var11 < var9);
								}

								byte[][] var12 = new byte[var9][];
								int var14;
								if (~var6 == -4) {
									int var13 = 0;
									if (var15 != 0 || ~var9 < ~var13) {
										do {
											var14 = var3.readInt((byte) -105);
											var12[var13] = new byte[var14];
											var3.readBytes(var14, var12[var13], (byte) 66, 0);
											++var13;
										} while (~var9 < ~var13);
									}
								}

								var4.R[var5] = var6;
								Class[] var22 = new Class[var9];
								var14 = 0;
								if (var15 != 0 || var9 > var14) {
									do {
										var22[var14] = dc.getParameterByType(false, var10[var14]);
										++var14;
									} while (var9 > var14);
								}

								var4.J[var5] = var2.a(var22, var8, -123, dc.getParameterByType(false, var7));
								var4.Z[var5] = var12;
								if (var15 == 0) {
									break label122;
								}
							}

							var7 = new String(var3.readRSString(var0 + 115).b((byte) -28));
							var8 = new String(var3.readRSString(-1).b((byte) -28));
							var9 = 0;
							if (var6 == 1) {
								var9 = var3.readInt((byte) -46);
							}

							var4.R[var5] = var6;
							var4.N[var5] = var9;
							var4.T[var5] = var2.a(dc.getParameterByType(false, var7), (byte) -73, var8);
						}
					} catch (ClassNotFoundException var16) {
						var4.V[var5] = -1;
					} catch (SecurityException var17) {
						var4.V[var5] = -2;
					} catch (NullPointerException var18) {
						var4.V[var5] = -3;
					} catch (Exception var19) {
						var4.V[var5] = -4;
					} catch (Throwable var20) {
						var4.V[var5] = -5;
					}

					++var5;
				} while (~var4.F < ~var5);

				ie.a.a(var4, (byte) 100);
			}
		} catch (RuntimeException var21) {
			throw id.a(var21, "la.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
