final class pd {
	static rd a;
	static rd rd_b;
	static rd c;
	static rd d;
	static rd rd_f;
	static int g = 3;
	static rd rd_h;
	static rd i = md.a((String) "Menge eingeben:", (byte) 115);
	static rd j;
	static rd newUser2;
	static rd l;
	static rd m;
	static rd n;
	static rd rd_o;
	static rd p;
	static rd q;
	static rd r;
	static rd s = md.a((String) "@red@", (byte) 127);
	static rd t;
	static int int_u;
	static rd v;
	static rd w;
	static rd x;
	static rd y;
	static rd z;
	static short[][] B = new short[][]{
			{
					(short) 6798,
					(short) 107,
					(short) 10283,
					(short) 16,
					(short) 4797,
					(short) 7744,
					(short) 5799,
					(short) 4634,
					(short) -31839,
					(short) 22433,
					(short) 2983,
					(short) -11343
			},
			{
					(short) 8741,
					(short) 12,
					(short) -1506,
					(short) -22374,
					(short) 7735,
					(short) 8404,
					(short) 1701,
					(short) -27106,
					(short) 24094,
					(short) 10153,
					(short) -8915,
					(short) 4783,
					(short) 1341,
					(short) 16578,
					(short) -30533,
					(short) 25239
			},
			{
					(short) 25238,
					(short) 8742,
					(short) 12,
					(short) -1506,
					(short) -22374,
					(short) 7735,
					(short) 8404,
					(short) 1701,
					(short) -27106,
					(short) 24094,
					(short) 10153,
					(short) -8915,
					(short) 4783,
					(short) 1341,
					(short) 16578,
					(short) -30533
			},
			{
					(short) 4626,
					(short) 11146,
					(short) 6439,
					(short) 12,
					(short) 4758,
					(short) 10270
			},
			{
					(short) 4550,
					(short) 4537,
					(short) 5681,
					(short) 5673,
					(short) 5790,
					(short) 6806,
					(short) 8076,
					(short) 4574
			}
	};
	static int C;
	static rd D;
	static int[] E;
	static int F;
	static int G;
	static rd H;
	static rd I;
	static rd J;
	static rd K;
	static rd malformedLoginPacket2;
	static int M;
	static rd N;
	static rd O = md.a((String) "leuchten2:", (byte) 117);
	static int P;
	static rd Q;
	static rd R;
	static he S;
	static rd T;
	static rd U;
	static u V;
	static int W;
	static rd X;
	static rd Y;
	static rd ab;
	static rd bb;
	private static rd malformedLoginPacket = md.a((String) "Malformed login packet)3", (byte) 117);
	private static rd newUser = md.a((String) "New User", (byte) 127);
	private static rd Z;

	static {
		newUser2 = newUser;
		malformedLoginPacket2 = malformedLoginPacket;
		E = new int[1000];
		Z = md.a("", (byte) 126);
		t = Z;
		c = Z;
		N = Z;
		n = Z;
		D = Z;
		rd_b = Z;
		R = Z;
		Y = Z;
		d = Z;
		ab = Z;
		v = Z;
		H = Z;
		Q = Z;
		m = Z;
		q = Z;
		bb = Z;
		T = Z;
		rd_f = Z;
		l = Z;
		p = Z;
		j = Z;
		J = Z;
		X = Z;
		I = Z;
		r = Z;
		y = Z;
		U = Z;
		rd_h = Z;
		a = Z;
		rd_o = Z;
		w = Z;
		z = Z;
		x = Z;
		K = Z;
	}

	static void a (pb archiveFile2, byte unused) {
		try {
			++W;
			ka.archiveFile2 = archiveFile2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "pd.D(" + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void a (byte var0) {
		try {
			x = null;
			z = null;
			n = null;
			j = null;
			H = null;
			y = null;
			p = null;
			w = null;
			bb = null;
			U = null;
			i = null;
			K = null;
			J = null;
			N = null;
			rd_h = null;
			a = null;
			q = null;
			rd_f = null;
			D = null;
			B = null;
			t = null;
			rd_o = null;
			c = null;
			T = null;
			v = null;
			S = null;
			I = null;
			r = null;
			R = null;
			s = null;
			d = null;
			Z = null;
			V = null;
			X = null;
			Q = null;
			if (var0 == -85) {
				E = null;
				malformedLoginPacket2 = null;
				rd_b = null;
				malformedLoginPacket = null;
				l = null;
				newUser2 = null;
				Y = null;
				O = null;
				m = null;
				newUser = null;
				ab = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "pd.C(" + var0 + ')');
		}
	}

	static nd a (nd var0, byte var1) {
		int var4 = client.int_tb;

		try {
			++C;
			int var2 = fb.a(true, fc.a(var0, 1572721824));
			if (var1 < 99) {
				return null;
			} else if (var2 == 0) {
				return null;
			} else {
				int var3 = 0;
				if (var4 == 0 && ~var3 <= ~var2) {
					return var0;
				} else {
					do {
						var0 = bf.b('\uffff', var0.Uc);
						if (var0 == null) {
							return null;
						}

						++var3;
					} while (~var3 > ~var2);

					return var0;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "pd.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static void a (boolean var0) {
		int var14 = client.int_tb;

		try {
			++G;
			je.b(var0);
			int var3;
			int var4;
			if (pb.d != 2) {
				int var16 = ka.Kb + o.w & 2047;
				var3 = 464 - af.td_p.y_ / 32;
				int var17 = 48 + af.td_p.x_ / 32;
				S.a(25, 5, 146, 151, var17, var3, var16, 256 + gf.int_j, ha.ints_ob, ra.f);
				var4 = 0;
				if (var14 != 0 || var4 < lc.k) {
					do {
						var3 = 2 + 4 * se.p[var4] - af.td_p.y_ / 32;
						var17 = -(af.td_p.x_ / 32) + 2 + tc.L[var4] * 4;
						ld.a((byte) 127, var3, ib.d[var4], var17);
						++var4;
					} while (var4 < lc.k);
				}

				int var5 = 0;
				int var6;
				md var7;
				if (var14 != 0) {
					var6 = 0;
					if (var14 == 0 && var6 >= 104) {
						++var5;
					} else {
						while (true) {
							var7 = lc.s[ce.plane][var5][var6];
							if (var7 != null) {
								var17 = -(af.td_p.x_ / 32) + 2 + var5 * 4;
								var3 = -(af.td_p.y_ / 32) + 4 * var6 + 2;
								ld.a((byte) 101, var3, tb.mapdots[0], var17);
							}

							++var6;
							if (var6 >= 104) {
								++var5;
								break;
							}
						}
					}
				}

				while (var5 < 104) {
					var6 = 0;
					if (var14 == 0 && var6 >= 104) {
						++var5;
					} else {
						do {
							var7 = lc.s[ce.plane][var5][var6];
							if (var7 != null) {
								var17 = -(af.td_p.x_ / 32) + 2 + var5 * 4;
								var3 = -(af.td_p.y_ / 32) + 4 * var6 + 2;
								ld.a((byte) 101, var3, tb.mapdots[0], var17);
							}

							++var6;
						} while (var6 < 104);

						++var5;
					}
				}

				var6 = 0;
				if (var14 != 0 || var6 < lc.q) {
					do {
						b var18 = ta.Nb[ca.ints_b[var6]];
						if (var18 != null && var18.d((byte) -127)) {
							tb var8 = var18.tb_md;
							if (var8 != null && var8.Fb != null) {
								var8 = var8.f(-1);
							}

							if (var8 != null && var8.yb && var8.Eb) {
								var3 = -(af.td_p.y_ / 32) + var18.y_ / 32;
								var17 = -(af.td_p.x_ / 32) + var18.x_ / 32;
								ld.a((byte) 119, var3, tb.mapdots[1], var17);
							}
						}

						++var6;
					} while (var6 < lc.q);
				}

				int var19 = 0;
				boolean var9;
				long var10;
				int var12;
				boolean var13;
				td var20;
				if (var14 != 0) {
					var20 = f.Lc[r.stringBuffer[var19]];
					if (var20 != null && var20.d((byte) -127)) {
						label305:
						{
							var3 = var20.y_ / 32 + -(af.td_p.y_ / 32);
							var17 = var20.x_ / 32 - af.td_p.x_ / 32;
							var9 = false;
							var10 = var20.Gd.i(29486);
							var12 = 0;
							if (var14 != 0 || ~u.int_eb < ~var12) {
								do {
									if (~cc.longs_f[var12] == ~var10 && ~ee.ints_k[var12] != -1) {
										var9 = true;
										if (var14 == 0) {
											break;
										}
									}

									++var12;
								} while (~u.int_eb < ~var12);
							}

							var13 = false;
							if (~af.td_p.Xc != -1 && var20.Xc != 0 && var20.Xc == af.td_p.Xc) {
								var13 = true;
							}

							if (var9) {
								ld.a((byte) 102, var3, tb.mapdots[3], var17);
								if (var14 == 0) {
									break label305;
								}
							}

							if (!var13) {
								ld.a((byte) 120, var3, tb.mapdots[2], var17);
								if (var14 == 0) {
									break label305;
								}
							}

							ld.a((byte) 95, var3, tb.mapdots[4], var17);
						}
					}

					++var19;
				}

				for ( ; ~b.int_hd < ~var19 ; ++var19) {
					var20 = f.Lc[r.stringBuffer[var19]];
					if (var20 != null && var20.d((byte) -127)) {
						var3 = var20.y_ / 32 + -(af.td_p.y_ / 32);
						var17 = var20.x_ / 32 - af.td_p.x_ / 32;
						var9 = false;
						var10 = var20.Gd.i(29486);
						var12 = 0;
						if (var14 != 0 || ~u.int_eb < ~var12) {
							do {
								if (~cc.longs_f[var12] == ~var10 && ~ee.ints_k[var12] != -1) {
									var9 = true;
									if (var14 == 0) {
										break;
									}
								}

								++var12;
							} while (~u.int_eb < ~var12);
						}

						var13 = false;
						if (~af.td_p.Xc != -1 && var20.Xc != 0 && var20.Xc == af.td_p.Xc) {
							var13 = true;
						}

						if (var9) {
							ld.a((byte) 102, var3, tb.mapdots[3], var17);
							if (var14 == 0) {
								continue;
							}
						}

						if (!var13) {
							ld.a((byte) 120, var3, tb.mapdots[2], var17);
							if (var14 == 0) {
								continue;
							}
						}

						ld.a((byte) 95, var3, tb.mapdots[4], var17);
					}
				}

				if (sb.int_a != 0 && ce.y % 20 < 10) {
					if (sb.int_a == 1 && ~hb.int_k <= -1 && hb.int_k < ta.Nb.length) {
						b var21 = ta.Nb[hb.int_k];
						if (var21 != null) {
							var17 = -(af.td_p.x_ / 32) + var21.x_ / 32;
							var3 = var21.y_ / 32 + -(af.td_p.y_ / 32);
							df.a(var17, var3, 23781, qb.mapmarker[1]);
						}
					}

					if (~sb.int_a == -3) {
						var17 = -(af.td_p.x_ / 32) + 2 + 4 * (-kd.int_w + gd.int_o);
						var3 = -(af.td_p.y_ / 32) + 4 * (-jc.X + ta.Rb) + 2;
						df.a(var17, var3, 23781, qb.mapmarker[1]);
					}

					if (~sb.int_a == -11 && ~qe.t <= -1 && ~f.Lc.length < ~qe.t) {
						var20 = f.Lc[qe.t];
						if (var20 != null) {
							var3 = -(af.td_p.y_ / 32) + var20.y_ / 32;
							var17 = var20.x_ / 32 - af.td_p.x_ / 32;
							df.a(var17, var3, 23781, qb.mapmarker[1]);
						}
					}
				}

				if (~jb.M != -1) {
					var3 = 2 + (4 * me.L - af.td_p.y_ / 32);
					var17 = -(af.td_p.x_ / 32) + 2 + jb.M * 4;
					ld.a((byte) 100, var3, qb.mapmarker[0], var17);
				}

				if (var0) {
					S = null;
				}

				ic.c(97, 78, 3, 3, 16777215);
				hb.compass.a(0, 0, 33, 33, 25, 25, o.w, 256, qe.D, rd.ints_f);
				od.f(45);
			} else {
				byte[] var1 = h.oa_l.jb;
				var3 = var1.length;
				int[] var2 = ic.pixels;
				var4 = 0;
				if (var14 != 0) {
					if (~var1[var4] == -1) {
						var2[var4] = 0;
					}

					++var4;
				}

				for ( ; var3 > var4 ; ++var4) {
					if (~var1[var4] == -1) {
						var2[var4] = 0;
					}
				}

				hb.compass.a(0, 0, 33, 33, 25, 25, o.w, 256, qe.D, rd.ints_f);
				od.f(97);
			}
		} catch (RuntimeException var15) {
			throw id.a(var15, "pd.E(" + var0 + ')');
		}
	}

	static void a (int var0, int var1) {
		int var4 = client.int_tb;

		try {
			++int_u;
			ud var2 = (ud) ud.P.a(-1, (long) var1);
			if (var2 != null) {
				int var3 = 0;
				if (var4 != 0) {
					var2.L[var3] = -1;
					var2.D[var3] = 0;
					++var3;
				}

				while (var2.L.length > var3) {
					var2.L[var3] = -1;
					var2.D[var3] = 0;
					++var3;
				}

				if (var0 <= 13) {
					rd_b = null;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "pd.B(" + var0 + ',' + var1 + ')');
		}
	}
}
