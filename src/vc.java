final class vc extends je {
	static int z = 0;
	static int C;
	static int D;
	static rd F;
	static rd H;
	static int I;
	static rd J;
	static rd loadingTitleScreen2;
	static rd L;
	static rd noReplyFromLoginserver2;
	static int O;
	static ke cacheFile6;
	static rd colon_;
	private static rd A = md.a((String) "Enter message to send to ", (byte) 122);
	private static rd B = md.a((String) "purple:", (byte) 114);
	private static rd noReplyFromLoginserver = md.a((String) "No reply from loginserver)3", (byte) 122);
	private static rd loadingTitleScreen;
	private static rd Q;

	static {
		L = A;
		noReplyFromLoginserver2 = noReplyFromLoginserver;
		I = 0;
		F = md.a("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", (byte) 116);
		Q = md.a("go back to the main RuneScape webpage", (byte) 116);
		J = Q;
		colon_ = md.a(": ", (byte) 123);
		loadingTitleScreen = md.a("Loading title screen )2 ", (byte) 125);
		loadingTitleScreen2 = loadingTitleScreen;
		H = B;
	}

	rd M;

	static int a (int plane, int x_, int y_, byte unused) {
		try {
			++O;
			int y = y_ >> 7;
			int x = x_ >> 7;
			if (~x <= -1 && ~y <= -1 && ~x >= -104 && y <= 103) {
				int plane2 = plane;
				if (~plane > -4 && ~(2 & d.bytes_j[1][x][y]) == -3) {
					plane2 = plane + 1;
				}

				int y2 = y_ & 127;
				int x2 = 127 & x_;
				int i = tb.Yb[plane2][x][y] * (-x2 + 128) + (x2 * tb.Yb[plane2][1 + x][y]) >> 7;
				int i1 = tb.Yb[plane2][1 + x][1 + y] * x2 + (128 + -x2) * tb.Yb[plane2][x][1 + y] >> 7;
				return i1 * y2 + i * (128 + -y2) >> 7;
			} else {
				return 0;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "vc.B(" + plane + ',' + x_ + ',' + y_ + ',' + unused + ')');
		}
	}

	static void a (int var0, int var1, nc[] var2, int var3, int var4, int var5, int var6, int var7, int var8,
				   byte[] var9) {
		int var15 = client.int_tb;

		try {
			int var10 = 0;
			int var11;
			if (var15 != 0) {
				var11 = 0;
				if (var15 == 0 && var11 >= 8) {
					++var10;
				} else {
					while (true) {
						if (~(var1 - -var10) < -1 && var1 + var10 < 103 && var7 - -var11 > 0 && var7 + var11 < 103) {
							var2[var8].adjacency[var1 + var10][var7 - -var11] = od
									.a(var2[var8].adjacency[var1 + var10][var7 - -var11], -16777217);
						}

						++var11;
						if (var11 >= 8) {
							++var10;
							break;
						}
					}
				}
			}

			while (~var10 > -9) {
				var11 = 0;
				if (var15 == 0 && var11 >= 8) {
					++var10;
				} else {
					do {
						if (~(var1 - -var10) < -1 && var1 + var10 < 103 && var7 - -var11 > 0 && var7 + var11 < 103) {
							var2[var8].adjacency[var1 + var10][var7 - -var11] = od
									.a(var2[var8].adjacency[var1 + var10][var7 - -var11], -16777217);
						}

						++var11;
					} while (var11 < 8);

					++var10;
				}
			}

			++D;
			id var17 = new id(var9);
			if (var6 > -56) {
				I = 0;
			}

			int var12 = 0;
			if (var15 != 0 || var12 < 4) {
				do {
					int var13 = 0;
					if (var15 == 0 && ~var13 <= -65) {
						++var12;
					} else {
						do {
							int var14 = 0;
							if (var15 == 0 && ~var14 <= -65) {
								++var13;
							} else {
								do {
									label65:
									{
										if (var12 == var0 && ~var13 <= ~var3 && ~(8 + var3) < ~var13 && ~var4 >= ~var14 && ~(8 + var4) < ~var14) {
											td.a(var5, var1 - -bb
													.a((byte) -89, 7 & var14, var5, var13 & 7), 0, var17, 0, 49, ge
														 .a(var13 & 7, 255, var14 & 7, var5) + var7, var8);
											if (var15 == 0) {
												break label65;
											}
										}

										td.a(0, -1, 0, var17, 0, 49, -1, 0);
									}

									++var14;
								} while (~var14 > -65);

								++var13;
							}
						} while (~var13 > -65);

						++var12;
					}
				} while (var12 < 4);

			}
		} catch (RuntimeException var16) {
			throw id.a(var16, "vc.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}

	public static void c (boolean var0) {
		try {
			F = null;
			noReplyFromLoginserver = null;
			noReplyFromLoginserver2 = null;
			L = null;
			Q = null;
			cacheFile6 = null;
			H = null;
			if (var0) {
				loadingTitleScreen = null;
				colon_ = null;
				J = null;
				B = null;
				loadingTitleScreen2 = null;
				A = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "vc.C(" + var0 + ')');
		}
	}
}
