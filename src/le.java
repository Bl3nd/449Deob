final class le extends jb {
	static int Z;
	static rd rd_ab = md.a((String) "@cr2@", (byte) 120);
	static int bb;
	static dd cb = new dd(64);
	static int int_db = 0;
	static int[] eb;
	static int gb;
	static rd rd_hb = md.a((String) "(Z", (byte) 121);
	static int int_ib;
	static int jb;
	static int int_kb;
	static int[] lb = new int[2000];
	static int int_mb;
	static jd nb;
	static oa oa_pb;
	static rd qb = md.a((String) "scrollen:", (byte) 123);
	static int updateTime = 0;
	static rd runescapeIsLoading_pleaseWait2;
	private static rd runescapeIsLoading_pleaseWait = md.a((String) "RuneScape is loading )2 please wait)3)3)3", (byte) 119);

	static {
		runescapeIsLoading_pleaseWait2 = runescapeIsLoading_pleaseWait;
	}

	int fb = 0;

	public static void c (byte var0) {
		try {
			if (var0 != 12) {
				runescapeIsLoading_pleaseWait = null;
			}

			rd_ab = null;
			runescapeIsLoading_pleaseWait2 = null;
			lb = null;
			rd_hb = null;
			oa_pb = null;
			cb = null;
			qb = null;
			runescapeIsLoading_pleaseWait = null;
			eb = null;
			nb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "le.F(" + var0 + ')');
		}
	}

	static void f (int unused) {
		try {
			++jb;
			r.F.c(-121);
		} catch (RuntimeException var2) {
			throw id.a(var2, "le.E(" + unused + ')');
		}
	}

	static void a (byte var0, p var1) {
		try {
			++bb;
			int var2 = 0;
			if (~var1.E == -1) {
				var2 = pc.o.p(var1.T, var1.X, var1.J);
			}

			if (var1.E == 1) {
				var2 = pc.o.c(var1.T, var1.X, var1.J);
			}

			int var3 = -1;
			if (~var1.E == -3) {
				var2 = pc.o.o(var1.T, var1.X, var1.J);
			}

			if (var0 != 103) {
				runescapeIsLoading_pleaseWait = null;
			}

			int var5 = 0;
			if (~var1.E == -4) {
				var2 = pc.o.q(var1.T, var1.X, var1.J);
			}

			int var4 = 0;
			if (~var2 != -1) {
				var3 = 32767 & var2 >> 14;
				int var6 = pc.o.b(var1.T, var1.X, var1.J, var2);
				var4 = var6 & 31;
				var5 = (var6 & 213) >> 6;
			}

			var1.Q = var4;
			var1.Z = var3;
			var1.G = var5;
		} catch (RuntimeException var7) {
			throw id.a(var7, "le.D(" + var0 + ',' + "{...}" + ')');
		}
	}

	static void c (boolean var0) {
		int var7 = client.int_tb;

		try {
			++int_kb;
			if (dd.int_q != 0) {
				if (var0) {
					int_db = 46;
				}

				int var1 = 0;
				if (~updateTime != -1) {
					var1 = 1;
				}

				int var2 = 0;
				do {
					if (wd.j[var2] != null) {
						int var3 = df.ints_i[var2];
						rd var4 = df.rds_o[var2];
						if (var4 != null && var4.b(27, ha.Z)) {
							var4 = var4.a(var0, 5);
						}

						if (var4 != null && var4.b(27, rd_ab)) {
							var4 = var4.a(false, 5);
						}

						if ((~var3 == -4 || var3 == 7) && (~var3 == -8 || ~ub.privateChatStatus == -1 || ~ub.privateChatStatus == -2 && db
								.a((byte) 32, var4))) {
							int var5 = -(13 * var1) + 329;
							++var1;
							if (~pb.H < -5 && ~(la.t + -4) < ~(var5 - 10) && ~(-4 + la.t) >= ~(3 + var5)) {
								int var6 = ad.gb_a
										.b(pc.a((byte) 127, new rd[]{kb.h, pe.j, var4, wd.j[var2]})) - -25;
								if (var6 > 450) {
									var6 = 450;
								}

								if (~(var6 + 4) < ~pb.H) {
									if (~ib.int_l <= -2) {
										++la.r;
										ab.a(0, pc.a((byte) 125, new rd[]{
												u.whiteText,
												var4
										}), 0, (byte) 125, 2017, mb.reportAbuse2, 0);
									}

									ab.a(0, pc.a((byte) 125, new rd[]{
											u.whiteText,
											var4
									}), 0, (byte) 125, 2002, va.addIgnore2, 0);
									++pc.k;
									ab.a(0, pc.a((byte) 125, new rd[]{
											u.whiteText,
											var4
									}), 0, (byte) 121, 2007, hb.addFriend2, 0);
									++df.int_c;
								}
							}

							if (~var1 <= -6) {
								return;
							}
						}

						if ((~var3 == -6 || var3 == 6) && ~ub.privateChatStatus > -3) {
							++var1;
							if (var1 >= 5) {
								return;
							}
						}
					}

					++var2;
				} while (var2 < 100);

			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "le.C(" + var0 + ')');
		}
	}

	private void a (byte var1, int var2, id var3) {
		try {
			if (var2 == 2) {
				this.fb = var3.readUnsignedLEShort(255);
			}

			if (var1 != -113) {
				c((byte) -60);
			}

			++int_ib;
		} catch (RuntimeException var5) {
			throw id.a(var5, "le.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a (id var1, byte var2) {
		int var5 = client.int_tb;

		try {
			int var3 = -23 % ((9 - var2) / 43);

			do {
				int var4 = var1.readUnsignedByte((byte) 116);
				if (var4 == 0) {
					break;
				}

				this.a((byte) -113, var4, var1);
			} while (var5 == 0);

			++Z;
		} catch (RuntimeException var6) {
			throw id.a(var6, "le.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
}
