import java.util.Date;

final class m {
	static int int_b;
	static rd systemUpdateIn_2;
	static int int_d = 0;
	static ke cacheFile13;
	static rd rd_f = md.a((String) "gleiten:", (byte) 127);
	static rd rd_g = md.a((String) "null", (byte) 116);
	static rd backvmid2 = md.a((String) "backvmid2", (byte) 120);
	static int int_i;
	static int int_j;
	static rd rd_k;
	static int int_l;
	static h h_m;
	static rd rd_n;
	private static rd systemUpdateIn_ = md.a((String) "System update in: ", (byte) 127);

	static {
		systemUpdateIn_2 = systemUpdateIn_;
		rd_k = md.a("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>", (byte) 124);
		rd_n = md.a("Anmelde)2Zeitlimit -Uberschritten)3", (byte) 125);
	}

	static void a (byte var0) {
		int var9 = client.int_tb;

		try {
			++int_i;
			if (var0 != -2) {
				a(null, 2, -16, -70, 56, null, null);
			}

			while (lc.readStream.k(-89, l.incomingPacketSize) >= 11) {
				int var1 = lc.readStream.readBits((byte) 87, 11);
				if (var1 == 2047) {
					break;
				}

				boolean var2 = false;
				if (f.Lc[var1] == null) {
					var2 = true;
					f.Lc[var1] = new td();
					if (sd.X[var1] != null) {
						f.Lc[var1].a(sd.X[var1], var0 ^ 1);
					}
				}

				r.R[b.int_hd++] = var1;
				td var3 = f.Lc[var1];
				var3.Pb = ce.y;
				int var4 = lc.readStream.readBits((byte) 66, 5);
				if (~var4 < -16) {
					var4 -= 32;
				}

				int var5 = ca.ints_o[lc.readStream.readBits((byte) 20, 3)];
				if (var2) {
					var3.Bb = var5;
				}

				int var6 = lc.readStream.readBits((byte) 14, 1);
				if (var6 == 1) {
					sb.ints_o[gf.int_q++] = var1;
				}

				int var7 = lc.readStream.readBits((byte) 70, 5);
				if (~var7 < -16) {
					var7 -= 32;
				}

				int var8 = lc.readStream.readBits((byte) 88, 1);
				var3.a((byte) -121, ~var8 == -2, var7 + af.td_p.Hc[0], af.td_p.xc[0] - -var4);
				if (var9 != 0) {
					break;
				}
			}

			lc.readStream.finishBitAccess((byte) 61);
		} catch (RuntimeException var10) {
			throw id.a(var10, "m.A(" + var0 + ')');
		}
	}

	public static void a (int var0) {
		try {
			cacheFile13 = null;
			backvmid2 = null;
			rd_g = null;
			if (var0 != -627) {
				a(-30);
			}

			rd_f = null;
			rd_k = null;
			rd_n = null;
			systemUpdateIn_ = null;
			systemUpdateIn_2 = null;
			h_m = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "m.D(" + var0 + ')');
		}
	}

	static void a (int x, int unused, int i1, int i2, int y) {
		try {
			++int_j;
			int mapY = y;
			if (y > i2 + y) {
				return;
			}

			do {
				int mapX = x;
				if (x + i1 < x) {
					++mapY;
				} else {
					do {
						if (mapX >= 0 && mapX < 104 && mapY >= 0 && mapY < 104) {
							ud.M[0][mapX][mapY] = 127;
							if (x == mapX && mapX > 0) {
								tb.Yb[0][mapX][mapY] = tb.Yb[0][-1 + mapX][mapY];
							}

							if (x + i1 == mapX && mapX < 103) {
								tb.Yb[0][mapX][mapY] = tb.Yb[0][1 + mapX][mapY];
							}

							if (mapY == y && mapY > 0) {
								tb.Yb[0][mapX][mapY] = tb.Yb[0][mapX][-1 + mapY];
							}

							if (i2 + y == mapY && mapY < 104) {
								tb.Yb[0][mapX][mapY] = tb.Yb[0][mapX][mapY + 1];
							}
						}

						++mapX;
					} while (x + i1 >= mapX);

					++mapY;
				}
			} while (mapY <= i2 + y);

		} catch (RuntimeException var8) {
			throw id.a(var8, "m.B(" + x + ',' + unused + ',' + i1 + ',' + i2 + ',' + y + ')');
		}
	}

	static void a (Object[] var0, int var1, int var2, int var3, int var4, nd var5, nd var6) {
		int var26 = client.int_tb;

		try {
			int var7 = (Integer) var0[0];
			wb var8 = t.a(24879, var7);
			++int_b;
			if (var4 <= 19) {
				rd_n = null;
			}

			if (var8 != null) {
				int var11 = -1;
				int var9 = 0;
				int[] var12 = var8.sb;
				int[] var13 = var8.ob;
				int var10 = 0;
				byte opcode = -1;

				try {
					int var15 = 0;
					ba.rds_o = new rd[var8.int_tb];
					ka.Fb = new int[var8.gb];
					int var16 = 0;
					int var17 = 1;
					int var18;
					if (var26 != 0) {
						label1787:
						{
							if (!(var0[var17] instanceof Integer)) {
								if (!(var0[var17] instanceof rd)) {
									break label1787;
								}

								ba.rds_o[var16++] = (rd) var0[var17];
								if (var26 == 0) {
									break label1787;
								}
							}

							var18 = (Integer) var0[var17];
							if (var18 == -2147483647) {
								var18 = var1;
							}

							if (var18 == -2147483646) {
								var18 = var3;
							}

							if (~var18 == 2147483644) {
								var18 = var6 == null ? -1 : var6.dc;
							}

							if (~var18 == 2147483643) {
								var18 = var2;
							}

							if (~var18 == 2147483642) {
								var18 = var6 == null ? -1 : var6.Yc;
							}

							if (~var18 == 2147483641) {
								var18 = var5 != null ? var5.dc : -1;
							}

							if (var18 == -2147483641) {
								var18 = var5 != null ? var5.Yc : -1;
							}

							ka.Fb[var15++] = var18;
						}

						++var17;
					}

					for ( ; ~var17 > ~var0.length ; ++var17) {
						if (!(var0[var17] instanceof Integer)) {
							if (!(var0[var17] instanceof rd)) {
								continue;
							}

							ba.rds_o[var16++] = (rd) var0[var17];
							if (var26 == 0) {
								continue;
							}
						}

						var18 = (Integer) var0[var17];
						if (var18 == -2147483647) {
							var18 = var1;
						}

						if (var18 == -2147483646) {
							var18 = var3;
						}

						if (~var18 == 2147483644) {
							var18 = var6 == null ? -1 : var6.dc;
						}

						if (~var18 == 2147483643) {
							var18 = var2;
						}

						if (~var18 == 2147483642) {
							var18 = var6 == null ? -1 : var6.Yc;
						}

						if (~var18 == 2147483641) {
							var18 = var5 != null ? var5.dc : -1;
						}

						if (var18 == -2147483641) {
							var18 = var5 != null ? var5.Yc : -1;
						}

						ka.Fb[var15++] = var18;
					}

					var18 = 0;

					while (true) {
						++var18;
						if (~var18 < -200001) {
							throw new RuntimeException("slow");
						}

						++var11;
						int clientscriptOpcode = var12[var11];
						rd var20;
						int var23;
						int var24;
						int var32;
						int var33;
						if (clientscriptOpcode < 100) {
							if (~clientscriptOpcode == -1) {
								sa.ints_ub[var9++] = var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							int var19;
							if (clientscriptOpcode == 1) {
								var19 = var13[var11];
								sa.ints_ub[var9++] = ta.Pb[var19];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -3) {
								var19 = var13[var11];
								--var9;
								ta.Pb[var19] = sa.ints_ub[var9];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 3) {
								cc.rds_h[var10++] = var8.Z[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 6) {
								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 7) {
								var9 -= 2;
								if (sa.ints_ub[1 + var9] == sa.ints_ub[var9]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 8) {
								var9 -= 2;
								if (sa.ints_ub[var9] != sa.ints_ub[1 + var9]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 9) {
								var9 -= 2;
								if (sa.ints_ub[var9] >= sa.ints_ub[var9 + 1]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 10) {
								var9 -= 2;
								if (~sa.ints_ub[var9 + 1] <= ~sa.ints_ub[var9]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -22) {
								if (gf.int_u == 0) {
									return;
								}

								ce var30 = be.ces_h[--gf.int_u];
								ba.rds_o = var30.rds_q;
								var11 = var30.int_p;
								ka.Fb = var30.ints_v;
								var8 = var30.wb_i;
								var12 = var8.sb;
								var13 = var8.ob;
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -26) {
								var19 = var13[var11];
								sa.ints_ub[var9++] = o.a((byte) 69, var19);
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 27) {
								var19 = var13[var11];
								--var9;
								pe.a(sa.ints_ub[var9], var19, (byte) -81);
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 31) {
								var9 -= 2;
								if (sa.ints_ub[var9 - -1] < sa.ints_ub[var9]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -33) {
								var9 -= 2;
								if (~sa.ints_ub[var9] > ~sa.ints_ub[1 + var9]) {
									continue;
								}

								var11 += var13[var11];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 33) {
								sa.ints_ub[var9++] = ka.Fb[var13[var11]];
								if (var26 == 0) {
									continue;
								}
							}

							int var10001;
							if (~clientscriptOpcode == -35) {
								var10001 = var13[var11];
								--var9;
								ka.Fb[var10001] = sa.ints_ub[var9];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -36) {
								cc.rds_h[var10++] = ba.rds_o[var13[var11]];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -37) {
								var10001 = var13[var11];
								--var10;
								ba.rds_o[var10001] = cc.rds_h[var10];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 37) {
								var19 = var13[var11];
								var10 -= var19;
								var20 = ie.a(cc.rds_h, (byte) -94, var19, var10);
								cc.rds_h[var10++] = var20;
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -39) {
								--var9;
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -40) {
								--var10;
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 40) {
								var19 = var13[var11];
								wb var31 = t.a(24879, var19);
								rd[] var22 = new rd[var31.int_tb];
								int[] var21 = new int[var31.gb];
								var23 = 0;
								if (var26 != 0 || var31.int_jb > var23) {
									do {
										var21[var23] = sa.ints_ub[-var31.int_jb + var9 - -var23];
										++var23;
									} while (var31.int_jb > var23);
								}

								var24 = 0;
								if (var26 != 0 || ~var24 > ~var31.hb) {
									do {
										var22[var24] = cc.rds_h[var24 + -var31.hb + var10];
										++var24;
									} while (~var24 > ~var31.hb);
								}

								var10 -= var31.hb;
								var9 -= var31.int_jb;
								ce var25 = new ce();
								var25.rds_q = ba.rds_o;
								var25.int_p = var11;
								var11 = -1;
								var25.ints_v = ka.Fb;
								var25.wb_i = var8;
								var8 = var31;
								be.ces_h[gf.int_u++] = var25;
								var12 = var31.sb;
								var13 = var31.ob;
								ka.Fb = var21;
								ba.rds_o = var22;
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -43) {
								sa.ints_ub[var9++] = le.lb[var13[var11]];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 43) {
								var10001 = var13[var11];
								--var9;
								le.lb[var10001] = sa.ints_ub[var9];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -45) {
								--var9;
								var33 = sa.ints_ub[var9];
								var19 = var13[var11] >> 16;
								var32 = var13[var11];
								if (~var33 > -1 || ~var33 < -5001) {
									throw new RuntimeException();
								}

								byte var37 = -1;
								db.I[var19] = var33;
								if (var32 == 105) {
									var37 = 0;
								}

								var23 = 0;
								if (var26 != 0) {
									kb.f[var19][var23] = var37;
									++var23;
								}

								while (~var23 > ~var33) {
									kb.f[var19][var23] = var37;
									++var23;
								}

								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode == -46) {
								var19 = var13[var11];
								--var9;
								var32 = sa.ints_ub[var9];
								if (~var32 > -1 || var32 >= db.I[var19]) {
									throw new RuntimeException();
								}

								sa.ints_ub[var9++] = kb.f[var19][var32];
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode == 46) {
								var19 = var13[var11];
								var9 -= 2;
								var32 = sa.ints_ub[var9];
								if (var32 < 0 || db.I[var19] <= var32) {
									throw new RuntimeException();
								}

								kb.f[var19][var32] = sa.ints_ub[var9 - -1];
								if (var26 == 0) {
									continue;
								}
							}
						}

						boolean var36;
						label725:
						{
							if (~var13[var11] == -2) {
								var36 = true;
								if (var26 == 0) {
									break label725;
								}
							}

							var36 = false;
						}

						label1970:
						{
							nd var34;
							int var38;
							int var45;
							if (~clientscriptOpcode > -1001) {
								if (clientscriptOpcode == 100) {
									var9 -= 3;
									var38 = sa.ints_ub[2 + var9];
									var33 = sa.ints_ub[var9 + 1];
									var32 = sa.ints_ub[var9];
									if (~var33 == -1) {
										throw new RuntimeException();
									}

									nd var43 = bf.b('\uffff', var32);
									if (var43.Ab == null) {
										var43.Ab = new nd[1 + var38];
									}

									if (var43.Ab.length <= var38) {
										nd[] var41 = new nd[1 + var38];
										var45 = 0;
										if (var26 != 0) {
											var41[var45] = var43.Ab[var45];
											++var45;
										}

										while (~var45 > ~var43.Ab.length) {
											var41[var45] = var43.Ab[var45];
											++var45;
										}

										var43.Ab = var41;
									}

									if (~var38 < -1 && var43.Ab[-1 + var38] == null) {
										throw new RuntimeException("Gap at:" + (-1 + var38));
									}

									label1531:
									{
										nd var44 = new nd();
										var44.tb = var33;
										var44.Yc = var38;
										var44.gb = true;
										var44.Uc = var44.dc = var43.dc;
										var43.Ab[var38] = var44;
										if (var36) {
											sa.nd_jb = var44;
											if (var26 == 0) {
												break label1531;
											}
										}

										mb.v = var44;
									}

									r.a(var43, (byte) -57);
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 101) {
									var34 = !var36 ? mb.v : sa.nd_jb;
									nd var35 = bf.b('\uffff', var34.dc);
									var35.Ab[var34.Yc] = null;
									r.a(var35, (byte) -57);
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -103) {
									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
									var34.Ab = null;
									r.a(var34, (byte) -57);
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode != -201) {
									break label1970;
								}

								var9 -= 2;
								var32 = sa.ints_ub[var9];
								var33 = sa.ints_ub[1 + var9];
								nd var39 = o.a((byte) -76, var32, var33);
								if (var39 != null && var33 != -1) {
									sa.ints_ub[var9++] = 1;
									if (var36) {
										sa.nd_jb = var39;
										if (var26 == 0) {
											continue;
										}
									}

									mb.v = var39;
									if (var26 == 0) {
										continue;
									}
								}

								sa.ints_ub[var9++] = 0;
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode >= 1000 && clientscriptOpcode < 1100 || ~clientscriptOpcode <= -2001 && clientscriptOpcode < 2100) {
								label1508:
								{
									if (clientscriptOpcode < 2000) {
										var34 = !var36 ? mb.v : sa.nd_jb;
										if (var26 == 0) {
											break label1508;
										}
									}

									clientscriptOpcode -= 1000;
									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
								}

								r.a(var34, (byte) -57);
								if (clientscriptOpcode == 1000) {
									var9 -= 2;
									var34.kb = sa.ints_ub[var9];
									var34.Hb = sa.ints_ub[1 + var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1002) {
									var9 -= 2;
									var34.Bb = sa.ints_ub[var9];
									var34.Nb = sa.ints_ub[var9 + 1];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode != 1003) {
									break label1970;
								}

								--var9;
								var34.Jc = sa.ints_ub[var9] == 1;
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode <= -1101 && clientscriptOpcode < 1200 || ~clientscriptOpcode <= -2101 && clientscriptOpcode < 2200) {
								label1484:
								{
									if (clientscriptOpcode < 2000) {
										var34 = !var36 ? mb.v : sa.nd_jb;
										if (var26 == 0) {
											break label1484;
										}
									}

									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
									clientscriptOpcode -= 1000;
								}

								r.a(var34, (byte) -57);
								if (clientscriptOpcode == 1100) {
									var9 -= 2;
									var34.Mb = sa.ints_ub[var9];
									if (~(-var34.Bb + var34.hd) > ~var34.Mb) {
										var34.Mb = var34.hd + -var34.Bb;
									}

									if (var34.Mb < 0) {
										var34.Mb = 0;
									}

									var34.int_ib = sa.ints_ub[1 + var9];
									if (~var34.int_ib < ~(-var34.Nb + var34.mb)) {
										var34.int_ib = -var34.Nb + var34.mb;
									}

									if (~var34.int_ib <= -1) {
										continue;
									}

									var34.int_ib = 0;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1102) {
									--var9;
									var34.Z = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1103) {
									--var9;
									var34.dd = sa.ints_ub[var9] == 1;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1104) {
									--var9;
									var34.qc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1104) {
									--var9;
									var34.sc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1105) {
									--var9;
									var34.ab = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1107) {
									--var9;
									var34.int_bd = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1107) {
									--var9;
									var34.Db = ~sa.ints_ub[var9] == -2;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1109) {
									var34.int_od = 1;
									--var9;
									var34.int_kc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1110) {
									var9 -= 6;
									var34.ed = sa.ints_ub[var9];
									var34.ac = sa.ints_ub[var9 + 1];
									var34.int_id = sa.ints_ub[var9 - -2];
									var34.int_sd = sa.ints_ub[var9 - -3];
									var34.int_sb = sa.ints_ub[4 + var9];
									var34.int_db = sa.ints_ub[var9 - -5];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1110) {
									--var9;
									var34.rb = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1112) {
									--var9;
									var34.Qb = ~sa.ints_ub[var9] == -2;
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1112) {
									--var10;
									var34.rd_ub = cc.rds_h[var10];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1113) {
									--var9;
									var34.Ib = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1114) {
									var9 -= 3;
									var34.Rc = sa.ints_ub[var9];
									var34.rc = sa.ints_ub[1 + var9];
									var34.bb = sa.ints_ub[2 + var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1115) {
									--var9;
									var34.Sc = sa.ints_ub[var9] == 1;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1117) {
									--var9;
									var34.Tc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1118) {
									--var9;
									var34.rd = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1119) {
									--var9;
									var34.Pb = ~sa.ints_ub[var9] == -2;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1120) {
									--var9;
									var34.yb = sa.ints_ub[var9] == 1;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode != -1121) {
									break label1970;
								}

								var9 -= 2;
								var34.hd = sa.ints_ub[var9];
								var34.mb = sa.ints_ub[var9 - -1];
								if (var26 == 0) {
									continue;
								}
							}

							if (~clientscriptOpcode <= -1201 && clientscriptOpcode < 1300 || clientscriptOpcode >= 2200 && ~clientscriptOpcode > -2301) {
								label1415:
								{
									if (clientscriptOpcode < 2000) {
										var34 = var36 ? sa.nd_jb : mb.v;
										if (var26 == 0) {
											break label1415;
										}
									}

									clientscriptOpcode -= 1000;
									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
								}

								r.a(var34, (byte) -57);
								if (~clientscriptOpcode == -1201) {
									var9 -= 2;
									var38 = sa.ints_ub[1 + var9];
									var33 = sa.ints_ub[var9];
									var34.gc = var38;
									var34.Qc = var33;
									hc var46 = u.a(var33, false);
									var34.ac = var46.wb;
									var34.int_sb = var46.Lb;
									var34.int_id = var46.fc;
									var34.ed = var46.ec;
									var34.int_db = var46.Sb;
									var34.int_sd = var46.vb;
									if (var34.Bb <= 0) {
										continue;
									}

									var34.int_db = var34.int_db * 32 / var34.Bb;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1202) {
									var34.int_od = 2;
									--var9;
									var34.int_kc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode != -1203) {
									break label1970;
								}

								var34.int_od = 3;
								var34.int_kc = af.td_p.o_jd.b(89);
								if (var26 == 0) {
									continue;
								}
							}

							if (clientscriptOpcode >= 1300 && clientscriptOpcode < 1400 || ~clientscriptOpcode <= -2301 && ~clientscriptOpcode > -2401) {
								label1391:
								{
									if (~clientscriptOpcode > -2001) {
										var34 = var36 ? sa.nd_jb : mb.v;
										if (var26 == 0) {
											break label1391;
										}
									}

									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
									clientscriptOpcode -= 1000;
								}

								if (~clientscriptOpcode == -1301) {
									--var9;
									var33 = sa.ints_ub[var9] - 1;
									if (var33 < 0 || ~var33 < -10) {
										--var10;
										if (var26 == 0) {
											continue;
										}
									}

									--var10;
									var34.a(cc.rds_h[var10], false, var33);
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1301) {
									var9 -= 2;
									var38 = sa.ints_ub[var9 + 1];
									var33 = sa.ints_ub[var9];
									var34.zb = o.a((byte) -110, var33, var38);
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1302) {
									--var9;
									var34.Rb = ~sa.ints_ub[var9] == -2;
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1303) {
									--var9;
									var34.xc = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1304) {
									--var9;
									var34.Ob = sa.ints_ub[var9];
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1305) {
									--var10;
									var34.Xc = cc.rds_h[var10];
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode != -1307) {
									break label1970;
								}

								--var10;
								var34.Gc = cc.rds_h[var10];
								if (var26 == 0) {
									continue;
								}
							}

							rd var40;
							if ((~clientscriptOpcode > -1401 || ~clientscriptOpcode <= -1501) && (~clientscriptOpcode > -2401 || ~clientscriptOpcode <= -2501)) {
								if (~clientscriptOpcode > -1601) {
									var34 = !var36 ? mb.v : sa.nd_jb;
									if (clientscriptOpcode == 1500) {
										sa.ints_ub[var9++] = var34.kb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -1502) {
										sa.ints_ub[var9++] = var34.Hb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -1503) {
										sa.ints_ub[var9++] = var34.Bb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -1504) {
										sa.ints_ub[var9++] = var34.Nb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -1505) {
										sa.ints_ub[var9++] = !var34.Jc ? 0 : 1;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode != -1506) {
										break label1970;
									}

									sa.ints_ub[var9++] = var34.Uc;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode <= -1701) {
									if (~clientscriptOpcode > -1801) {
										var34 = var36 ? sa.nd_jb : mb.v;
										if (clientscriptOpcode == 1700) {
											sa.ints_ub[var9++] = var34.Qc;
											if (var26 == 0) {
												continue;
											}
										}

										if (clientscriptOpcode == 1701) {
											if (~var34.Qc != 0) {
												sa.ints_ub[var9++] = var34.gc;
												if (var26 == 0) {
													continue;
												}
											}

											sa.ints_ub[var9++] = 0;
											if (var26 == 0) {
												continue;
											}
										}

										if (~clientscriptOpcode != -1703) {
											break label1970;
										}

										sa.ints_ub[var9++] = var34.Yc;
										if (var26 == 0) {
											continue;
										}
									}

									if (clientscriptOpcode < 1900) {
										var34 = !var36 ? mb.v : sa.nd_jb;
										if (clientscriptOpcode != 1800) {
											break label1970;
										}

										sa.ints_ub[var9++] = se.a((byte) 69, fc.a(var34, 1572721824));
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode <= -2601) {
										if (~clientscriptOpcode <= -2701) {
											if (clientscriptOpcode < 2800) {
												--var9;
												var34 = bf.b('\uffff', sa.ints_ub[var9]);
												if (~clientscriptOpcode == -2701) {
													sa.ints_ub[var9++] = var34.Qc;
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode != 2701) {
													break label1970;
												}

												if (~var34.Qc == 0) {
													sa.ints_ub[var9++] = 0;
													if (var26 == 0) {
														continue;
													}
												}

												sa.ints_ub[var9++] = var34.gc;
												if (var26 == 0) {
													continue;
												}
											}

											if (~clientscriptOpcode > -2901) {
												--var9;
												var34 = bf.b('\uffff', sa.ints_ub[var9]);
												if (~clientscriptOpcode != -2801) {
													break label1970;
												}

												sa.ints_ub[var9++] = se.a((byte) 69, fc.a(var34, 1572721824));
												if (var26 == 0) {
													continue;
												}
											}

											if (clientscriptOpcode >= 3200) {
												if (~clientscriptOpcode > -3301) {
													if (clientscriptOpcode == 3200) {
														var9 -= 3;
														bd.a(sa.ints_ub[var9 + 1], -89, sa.ints_ub[2 + var9], sa.ints_ub[var9]);
														if (var26 == 0) {
															continue;
														}
													}

													if (clientscriptOpcode == 3201) {
														--var9;
														td.a(0, sa.ints_ub[var9]);
														if (var26 == 0) {
															continue;
														}
													}

													if (~clientscriptOpcode != -3203) {
														break label1970;
													}

													var9 -= 2;
													gd.a(sa.ints_ub[var9], sa.ints_ub[1 + var9], -96);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode <= -3401) {
													if (~clientscriptOpcode <= -3701) {
														if (clientscriptOpcode >= 4100) {
															if (~clientscriptOpcode > -4201) {
																if (clientscriptOpcode == 4100) {
																	--var10;
																	var20 = cc.rds_h[var10];
																	--var9;
																	var33 = sa.ints_ub[var9];
																	cc.rds_h[var10++] = pc.a((byte) 126, new rd[]{
																			var20,
																			bf.a(var33, -31766)
																	});
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (~clientscriptOpcode == -4102) {
																	var10 -= 2;
																	var40 = cc.rds_h[var10 + 1];
																	var20 = cc.rds_h[var10];
																	cc.rds_h[var10++] = pc.a((byte) 127, new rd[]{
																			var20,
																			var40
																	});
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (~clientscriptOpcode == -4103) {
																	--var10;
																	var20 = cc.rds_h[var10];
																	--var9;
																	var33 = sa.ints_ub[var9];
																	cc.rds_h[var10++] = pc.a((byte) 125, new rd[]{
																			var20,
																			qc.a(var33, true, -1)
																	});
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (clientscriptOpcode == 4103) {
																	--var10;
																	var20 = cc.rds_h[var10];
																	cc.rds_h[var10++] = var20.l(-34);
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (clientscriptOpcode == 4104) {
																	--var9;
																	var32 = sa.ints_ub[var9];
																	long date = 86400000L * (long) var32 - -1014768000000L;
																	hf.Cb.setTime(new Date(date));
																	var23 = hf.Cb.get(5);
																	var24 = hf.Cb.get(2);
																	var45 = hf.Cb.get(1);
																	cc.rds_h[var10++] = pc.a((byte) 126, new rd[]{
																			bf.a(var23, -31766),
																			we.c,
																			rb.d[var24],
																			we.c,
																			bf.a(var45, -31766)
																	});
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (clientscriptOpcode == 4105) {
																	var10 -= 2;
																	var20 = cc.rds_h[var10];
																	var40 = cc.rds_h[1 + var10];
																	if (af.td_p.o_jd != null && af.td_p.o_jd.y) {
																		cc.rds_h[var10++] = var40;
																		if (var26 == 0) {
																			continue;
																		}
																	}

																	cc.rds_h[var10++] = var20;
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (clientscriptOpcode == 4106) {
																	--var9;
																	var32 = sa.ints_ub[var9];
																	cc.rds_h[var10++] = bf.a(var32, -31766);
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (~clientscriptOpcode == -4108) {
																	var10 -= 2;
																	sa.ints_ub[var9++] = cc.rds_h[var10]
																			.a(cc.rds_h[1 + var10], 22941);
																	if (var26 == 0) {
																		continue;
																	}
																}

																gb var48;
																byte[] var49;
																if (clientscriptOpcode == 4108) {
																	var9 -= 2;
																	var33 = sa.ints_ub[var9];
																	--var10;
																	var20 = cc.rds_h[var10];
																	var38 = sa.ints_ub[var9 + 1];
																	var49 = cacheFile13.a(var38, 0, (byte) 66);
																	var48 = new gb(var49);
																	sa.ints_ub[var9++] = var48.b(var20, var33);
																	if (var26 == 0) {
																		continue;
																	}
																}

																if (clientscriptOpcode != 4109) {
																	break label1970;
																}

																var9 -= 2;
																var38 = sa.ints_ub[var9 + 1];
																var33 = sa.ints_ub[var9];
																--var10;
																var20 = cc.rds_h[var10];
																var49 = cacheFile13.a(var38, 0, (byte) 66);
																var48 = new gb(var49);
																sa.ints_ub[var9++] = var48.a(var20, var33);
																if (var26 == 0) {
																	continue;
																}
															}

															if (~clientscriptOpcode <= -4301) {
																break label1970;
															}

															if (~clientscriptOpcode == -4201) {
																--var9;
																var32 = sa.ints_ub[var9];
																cc.rds_h[var10++] = u.a(var32, false).Rb;
																if (var26 == 0) {
																	continue;
																}
															}

															hc var47;
															if (~clientscriptOpcode == -4202) {
																var9 -= 2;
																var32 = sa.ints_ub[var9];
																var33 = sa.ints_ub[var9 - -1];
																var47 = u.a(var32, false);
																if (~var33 <= -2 && var33 <= 5 && var47.Bb[-1 + var33] != null) {
																	cc.rds_h[var10++] = var47.Bb[-1 + var33];
																	if (var26 == 0) {
																		continue;
																	}
																}

																cc.rds_h[var10++] = bb.rd_h;
																if (var26 == 0) {
																	continue;
																}
															}

															if (~clientscriptOpcode == -4203) {
																var9 -= 2;
																var33 = sa.ints_ub[1 + var9];
																var32 = sa.ints_ub[var9];
																var47 = u.a(var32, false);
																if (var33 >= 1 && ~var33 >= -6 && var47.Gb[-1 + var33] != null) {
																	cc.rds_h[var10++] = var47.Gb[var33 - 1];
																	if (var26 == 0) {
																		continue;
																	}
																}

																cc.rds_h[var10++] = bb.rd_h;
																if (var26 == 0) {
																	continue;
																}
															}

															if (~clientscriptOpcode == -4204) {
																--var9;
																var32 = sa.ints_ub[var9];
																sa.ints_ub[var9++] = u.a(var32, false).Yb;
																if (var26 == 0) {
																	continue;
																}
															}

															if (clientscriptOpcode == 4204) {
																--var9;
																var32 = sa.ints_ub[var9];
																sa.ints_ub[var9++] = u.a(var32, false).gb != 1 ? 0 : 1;
																if (var26 == 0) {
																	continue;
																}
															}

															hc var50;
															if (~clientscriptOpcode == -4206) {
																--var9;
																var32 = sa.ints_ub[var9];
																var50 = u.a(var32, false);
																if (var50.rb != -1 || ~var50.Eb > -1) {
																	sa.ints_ub[var9++] = var32;
																	if (var26 == 0) {
																		continue;
																	}
																}

																sa.ints_ub[var9++] = var50.Eb;
																if (var26 == 0) {
																	continue;
																}
															}

															if (clientscriptOpcode == 4206) {
																--var9;
																var32 = sa.ints_ub[var9];
																var50 = u.a(var32, false);
																if (var50.rb >= 0 && ~var50.Eb <= -1) {
																	sa.ints_ub[var9++] = var50.Eb;
																	if (var26 == 0) {
																		continue;
																	}
																}

																sa.ints_ub[var9++] = var32;
																if (var26 == 0) {
																	continue;
																}
															}

															if (clientscriptOpcode != 4207) {
																break label1970;
															}

															--var9;
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = u.a(var32, false).dc ? 1 : 0;
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4000) {
															var9 -= 2;
															var33 = sa.ints_ub[var9 + 1];
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = var32 + var33;
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4001) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[var9 - -1];
															sa.ints_ub[var9++] = var32 - var33;
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4002) {
															var9 -= 2;
															var33 = sa.ints_ub[1 + var9];
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = var33 * var32;
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4004) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[1 + var9];
															sa.ints_ub[var9++] = var32 / var33;
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4005) {
															--var9;
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = (int) (Math.random() * (double) var32);
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4005) {
															--var9;
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = (int) (Math
																	.random() * (double) (var32 - -1));
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4007) {
															var9 -= 5;
															var33 = sa.ints_ub[var9 - -1];
															var32 = sa.ints_ub[var9];
															var38 = sa.ints_ub[var9 + 2];
															var23 = sa.ints_ub[3 + var9];
															var24 = sa.ints_ub[4 + var9];
															sa.ints_ub[var9++] = var32 - -((-var38 + var24) * (-var32 + var33) / (var23 - var38));
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4007) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[1 + var9];
															sa.ints_ub[var9++] = var33 * var32 / 100 + var32;
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4009) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[1 + var9];
															sa.ints_ub[var9++] = fb.b(var32, 1 << var33);
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4010) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[var9 - -1];
															sa.ints_ub[var9++] = od.a(var32, -(1 << var33) + -1);
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4011) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[1 + var9];
															sa.ints_ub[var9++] = ~od.a(1 << var33, var32) == -1 ? 0 : 1;
															if (var26 == 0) {
																continue;
															}
														}

														if (~clientscriptOpcode == -4012) {
															var9 -= 2;
															var33 = sa.ints_ub[1 + var9];
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = var32 % var33;
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4012) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[var9 + 1];
															if (var32 == 0) {
																sa.ints_ub[var9++] = 0;
																if (var26 == 0) {
																	continue;
																}
															}

															sa.ints_ub[var9++] = (int) Math
																	.pow((double) var32, (double) var33);
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4013) {
															var9 -= 2;
															var32 = sa.ints_ub[var9];
															var33 = sa.ints_ub[var9 + 1];
															if (~var32 == -1) {
																sa.ints_ub[var9++] = 0;
																if (var26 == 0) {
																	continue;
																}
															}

															if (~var33 != -1) {
																sa.ints_ub[var9++] = (int) Math
																		.pow((double) var32, 1.0D / (double) var33);
																if (var26 == 0) {
																	continue;
																}
															}

															sa.ints_ub[var9++] = Integer.MAX_VALUE;
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode == 4014) {
															var9 -= 2;
															var33 = sa.ints_ub[var9 + 1];
															var32 = sa.ints_ub[var9];
															sa.ints_ub[var9++] = od.a(var33, var32);
															if (var26 == 0) {
																continue;
															}
														}

														if (clientscriptOpcode != 4015) {
															break label1970;
														}

														var9 -= 2;
														var33 = sa.ints_ub[var9 - -1];
														var32 = sa.ints_ub[var9];
														sa.ints_ub[var9++] = fb.b(var33, var32);
														if (var26 == 0) {
															continue;
														}
													}

													if (clientscriptOpcode == 3600) {
														if (ke.int_mb != 0) {
															if (~ke.int_mb == -2) {
																sa.ints_ub[var9++] = -1;
																if (var26 == 0) {
																	continue;
																}
															}

															sa.ints_ub[var9++] = u.int_eb;
															if (var26 == 0) {
																continue;
															}
														}

														sa.ints_ub[var9++] = -2;
														if (var26 == 0) {
															continue;
														}
													}

													if (~clientscriptOpcode == -3602) {
														--var9;
														var32 = sa.ints_ub[var9];
														if (~ke.int_mb == -3 && u.int_eb > var32) {
															cc.rds_h[var10++] = ad.rds_k[var32];
															if (var26 == 0) {
																continue;
															}
														}

														cc.rds_h[var10++] = bb.rd_h;
														if (var26 == 0) {
															continue;
														}
													}

													if (~clientscriptOpcode == -3603) {
														--var9;
														var32 = sa.ints_ub[var9];
														if (~ke.int_mb == -3 && ~u.int_eb < ~var32) {
															sa.ints_ub[var9++] = ee.ints_k[var32];
															if (var26 == 0) {
																continue;
															}
														}

														sa.ints_ub[var9++] = 0;
														if (var26 == 0) {
															continue;
														}
													}

													if (clientscriptOpcode == 3603) {
														--var9;
														var32 = sa.ints_ub[var9];
														if (ke.int_mb != 2 || ~u.int_eb >= ~var32) {
															sa.ints_ub[var9++] = 0;
															if (var26 == 0) {
																continue;
															}
														}

														sa.ints_ub[var9++] = je.ints_i[var32];
														if (var26 == 0) {
															continue;
														}
													}

													if (~clientscriptOpcode != -3605) {
														break label1970;
													}

													--var10;
													var20 = cc.rds_h[var10];
													--var9;
													var33 = sa.ints_ub[var9];
													w.a(var33, false, var20);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3301) {
													sa.ints_ub[var9++] = ce.y;
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3302) {
													var9 -= 2;
													var32 = sa.ints_ub[var9];
													var33 = sa.ints_ub[1 + var9];
													sa.ints_ub[var9++] = pa.a(var33, var32, 0);
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3302) {
													var9 -= 2;
													var32 = sa.ints_ub[var9];
													var33 = sa.ints_ub[1 + var9];
													sa.ints_ub[var9++] = mb.a(var32, var33, true);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3304) {
													var9 -= 2;
													var32 = sa.ints_ub[var9];
													var33 = sa.ints_ub[var9 + 1];
													sa.ints_ub[var9++] = lc.a((byte) -104, var32, var33);
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3304) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = fb.a(var32, 5).fb;
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3305) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = ke.hb[var32];
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3306) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = eb.ints_i[var32];
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3308) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = p.N[var32];
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3308) {
													var32 = ce.plane;
													var33 = (af.td_p.x_ >> 7) - -kd.int_w;
													var38 = jc.X + (af.td_p.y_ >> 7);
													sa.ints_ub[var9++] = var38 + (var33 << 14) + (var32 << 28);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3310) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = od.a(16383, var32 >> 14);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3311) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = var32 >> 28;
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3311) {
													--var9;
													var32 = sa.ints_ub[var9];
													sa.ints_ub[var9++] = od.a(16383, var32);
													if (var26 == 0) {
														continue;
													}
												}

												if (clientscriptOpcode == 3312) {
													sa.ints_ub[var9++] = va.isMembers_j ? 1 : 0;
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3314) {
													var9 -= 2;
													var32 = '耀' + sa.ints_ub[var9];
													var33 = sa.ints_ub[var9 + 1];
													sa.ints_ub[var9++] = pa.a(var33, var32, 0);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode == -3315) {
													var9 -= 2;
													var32 = '耀' + sa.ints_ub[var9];
													var33 = sa.ints_ub[1 + var9];
													sa.ints_ub[var9++] = mb.a(var32, var33, true);
													if (var26 == 0) {
														continue;
													}
												}

												if (~clientscriptOpcode != -3316) {
													break label1970;
												}

												var9 -= 2;
												var32 = sa.ints_ub[var9] - -32768;
												var33 = sa.ints_ub[var9 - -1];
												sa.ints_ub[var9++] = lc.a((byte) 42, var32, var33);
												if (var26 == 0) {
													continue;
												}
											}

											if (clientscriptOpcode == 3100) {
												--var10;
												var20 = cc.rds_h[var10];
												n.a(bb.rd_h, var20, true, 0);
												if (var26 == 0) {
													continue;
												}
											}

											if (clientscriptOpcode == 3101) {
												var9 -= 2;
												ke.a(sa.ints_ub[var9 - -1], sa.ints_ub[var9], af.td_p, 2);
												if (var26 == 0) {
													continue;
												}
											}

											if (~clientscriptOpcode == -3103) {
												--var9;
												var32 = sa.ints_ub[var9];
												if (var32 < 0 || ~var32 <= ~ta.Zb.length || ta.Zb[var32] == -1 && var26 == 0) {
													continue;
												}

												pd.g = var32;
												pe.l = true;
												db.F = true;
												if (var26 == 0) {
													continue;
												}
											}

											if (~clientscriptOpcode != -3104) {
												break label1970;
											}

											te.d((byte) 99);
											if (var26 == 0) {
												continue;
											}
										}

										--var9;
										var34 = bf.b('\uffff', sa.ints_ub[var9]);
										if (clientscriptOpcode == 2600) {
											sa.ints_ub[var9++] = var34.Mb;
											if (var26 == 0) {
												continue;
											}
										}

										if (clientscriptOpcode == 2601) {
											sa.ints_ub[var9++] = var34.int_ib;
											if (var26 == 0) {
												continue;
											}
										}

										if (~clientscriptOpcode == -2603) {
											cc.rds_h[var10++] = var34.rd_ub;
											if (var26 == 0) {
												continue;
											}
										}

										if (clientscriptOpcode == 2603) {
											sa.ints_ub[var9++] = var34.hd;
											if (var26 == 0) {
												continue;
											}
										}

										if (~clientscriptOpcode == -2605) {
											sa.ints_ub[var9++] = var34.mb;
											if (var26 == 0) {
												continue;
											}
										}

										if (~clientscriptOpcode != -2606) {
											break label1970;
										}

										sa.ints_ub[var9++] = var34.int_db;
										if (var26 == 0) {
											continue;
										}
									}

									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
									if (~clientscriptOpcode == -2501) {
										sa.ints_ub[var9++] = var34.kb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -2502) {
										sa.ints_ub[var9++] = var34.Hb;
										if (var26 == 0) {
											continue;
										}
									}

									if (clientscriptOpcode == 2502) {
										sa.ints_ub[var9++] = var34.Bb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -2504) {
										sa.ints_ub[var9++] = var34.Nb;
										if (var26 == 0) {
											continue;
										}
									}

									if (~clientscriptOpcode == -2505) {
										sa.ints_ub[var9++] = var34.Jc ? 1 : 0;
										if (var26 == 0) {
											continue;
										}
									}

									if (clientscriptOpcode != 2505) {
										break label1970;
									}

									sa.ints_ub[var9++] = var34.Uc;
									if (var26 == 0) {
										continue;
									}
								}

								var34 = var36 ? sa.nd_jb : mb.v;
								if (clientscriptOpcode == 1600) {
									sa.ints_ub[var9++] = var34.Mb;
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1601) {
									sa.ints_ub[var9++] = var34.int_ib;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1603) {
									cc.rds_h[var10++] = var34.rd_ub;
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode == 1603) {
									sa.ints_ub[var9++] = var34.hd;
									if (var26 == 0) {
										continue;
									}
								}

								if (~clientscriptOpcode == -1605) {
									sa.ints_ub[var9++] = var34.mb;
									if (var26 == 0) {
										continue;
									}
								}

								if (clientscriptOpcode != 1605) {
									break label1970;
								}

								sa.ints_ub[var9++] = var34.int_db;
								if (var26 == 0) {
									continue;
								}
							}

							label1836:
							{
								if (~clientscriptOpcode <= -2001) {
									clientscriptOpcode -= 1000;
									--var9;
									var34 = bf.b('\uffff', sa.ints_ub[var9]);
									if (var26 == 0) {
										break label1836;
									}
								}

								var34 = !var36 ? mb.v : sa.nd_jb;
							}

							--var10;
							var40 = cc.rds_h[var10];
							Object[] var51 = new Object[1 + var40.b(-29348)];
							var23 = var51.length + -1;
							if (var26 != 0 || var23 >= 1) {
								do {
									label1091:
									{
										if (var40.readUnsignedByte(-1 + var23, -14412) == 115) {
											--var10;
											var51[var23] = cc.rds_h[var10];
											if (var26 == 0) {
												break label1091;
											}
										}

										--var9;
										var51[var23] = sa.ints_ub[var9];
									}

									--var23;
								} while (var23 >= 1);
							}

							--var9;
							var51[0] = sa.ints_ub[var9];
							if (~clientscriptOpcode == -1411) {
								var34.objects_eb = var51;
							}

							if (clientscriptOpcode == 1400) {
								var34.Jb = var51;
							}

							if (~clientscriptOpcode == -1413) {
								var34.vd = var51;
							}

							var34.jb = true;
							if (clientscriptOpcode == 1414) {
								var34.objects_cc = var51;
							}

							if (~clientscriptOpcode == -1405) {
								var34.Mc = var51;
							}

							if (~clientscriptOpcode == -1416) {
								var34.Oc = var51;
							}

							if (clientscriptOpcode == 1411) {
								var34.Wb = var51;
							}

							if (~clientscriptOpcode == -1408) {
								var34.objects_ld = var51;
							}

							if (~clientscriptOpcode == -1403) {
								var34.Ec = var51;
							}

							if (clientscriptOpcode == 1409) {
								var34.objects_md = var51;
							}

							if (clientscriptOpcode == 1408) {
								var34.Eb = var51;
							}

							if (~clientscriptOpcode == -1417) {
								var34.hc = var51;
							}

							if (~clientscriptOpcode == -1402) {
								var34.cd = var51;
							}

							if (~clientscriptOpcode == -1407) {
								var34.Kc = var51;
							}

							if (~clientscriptOpcode == -1404) {
								var34.Cb = var51;
							}

							if (clientscriptOpcode == 1413) {
								var34.Fc = var51;
							}

							if (~clientscriptOpcode == -1406) {
								var34.uc = var51;
							}

							if (~clientscriptOpcode != -1418) {
								continue;
							}

							var34.wc = var51;
							if (var26 == 0) {
								continue;
							}
						}

						se.a((byte) 44, null, "CS2 - nosuchop:" + clientscriptOpcode);
						return;
					}
				} catch (Exception var27) {
					se.a((byte) 122, var27, "CS2 - scr:" + var8.script + " op:" + opcode);
				}
			}
		} catch (RuntimeException var28) {
			throw id.a(var28, "m.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + (var6 != null ? "{...}" : "null") + ')');
		}
	}
}
