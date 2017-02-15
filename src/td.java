final class td extends f {
	static int ad;
	static rd backtop1 = md.a((String) "backtop1", (byte) 125);
	static int hd;
	static int int_id;
	static int int_ld;
	static int int_od;
	static rd rd_pd = md.a((String) "(U1", (byte) 116);
	static dd qd;
	static rd td;
	static rd rd_ud;
	static int vd;
	static volatile int mousePressedX;
	static volatile int yd;
	static int Ad;
	static rd Dd;
	static int Ed;
	static int Fd;
	static ke[] Id;
	private static rd rd_kd = md.a((String) "Enter name of player to delete from list", (byte) 123);

	static {
		td = rd_kd;
		mousePressedX = 0;
		Dd = md.a((String) "Lade Ignorieren)2Liste)3)3)3", (byte) 115);
		yd = 0;
		rd_ud = md.a((String) "Ung-Ultiger Benutzername", (byte) 115);
		qd = new dd(30);
		Id = new ke[256];
	}

	int Xc = 0;
	int Yc;
	int Zc;
	int int_bd;
	int dd;
	boolean ed = false;
	int fd = -1;
	int gd = 0;
	o o_jd;
	int int_md;
	int int_nd;
	int rd;
	int int_sd = 0;
	int xd = -1;
	int zd = 0;
	int Bd;
	int Cd = 0;
	rd Gd;
	ue Hd;

	static void a (int var0, int var1) {
		try {
			label41:
			{
				if (var1 != -1 || ~mb.b != -1) {
					if (~var1 == 0 || ~var1 == ~b.dd || fc.int_u == 0 || mb.b != 0) {
						break label41;
					}

					ld.a(fc.int_u, false, 0, -5, 10, 0, vc.cacheFile6, var1);
					if (client.int_tb == 0) {
						break label41;
					}
				}

				ld.a(-116);
			}

			++ad;
			b.dd = var1;
			if (var0 != 0) {
				a(null, null, 29);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "td.I(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (pb archiveFile7, pb archiveFile2, int unused) {
		try {
			++hd;
			tb.archiveFile2 = archiveFile2;
			w.archiveFile7 = archiveFile7;
		} catch (RuntimeException var4) {
			throw id.a(var4, "td.J(" + (archiveFile7 != null ? "{...}" : "null") + ',' + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void g (byte unused) {
		try {
			af.ints_c = new int[4][105][105];
			ta.Xb = new byte[4][104][104];
			u.bytes_kb = new byte[4][104][104];
			ud.M = new byte[4][105][105];
			sb.ints_m = new int[104];
			client.int_ib = 99;
			o.h = new byte[4][104][104];
			p.L = new int[104];
			ge.ints_ab = new int[105][105];
			id.Rb = new int[104];
			s.xb = new int[104];
			a.bytes_gb = new byte[4][104][104];
			++int_od;
			f.Wc = new int[104];
		} catch (RuntimeException var2) {
			throw id.a(var2, "td.H(" + unused + ')');
		}
	}

	public static void g (int var0) {
		try {
			int var1 = 84 / ((var0 - -55) / 33);
			Id = null;
			backtop1 = null;
			td = null;
			qd = null;
			Dd = null;
			rd_pd = null;
			rd_kd = null;
			rd_ud = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "td.C(" + var0 + ')');
		}
	}

	static void a (int var0, nd[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
				   int var9, int var10, int var11) {
		int var25 = client.int_tb;

		try {
			++Fd;
			if (var9 <= var11 && var5 <= var7 && var11 < var4 && var7 < var3) {
				int var12 = 0;
				if (var25 == 0 && var1.length <= var12) {
					if (var0 <= 5) {
						mousePressedX = -32;
					}
				} else {
					do {
						nd var13 = var1[var12];
						if (var13 != null && (~var10 == ~var13.Uc || var25 != 0) && (!var13.gb || !se.a(var13, true))) {
							label516:
							{
								int var14 = var9 + var13.kb + -var8;
								int var15 = var5 + var13.Hb - var2;
								if ((var13.pc >= 0 || ~var13.Vb != -1) && ~var11 <= ~var14 && ~var15 >= ~var7 && ~var11 > ~(var13.Bb + var14) && ~(var13.Nb + var15) < ~var7) {
									label447:
									{
										if (~var13.pc <= -1) {
											gf.int_f = var13.pc;
											if (var25 == 0) {
												break label447;
											}
										}

										gf.int_f = var12;
									}
								}

								if (~var13.tb == -9 && var14 <= var11 && ~var15 >= ~var7 && var14 - -var13.Bb > var11 && var13.Nb + var15 > var7) {
									we.int_t = var12;
								}

								if (var13.tb == 0) {
									if (!var13.gb && se.a(var13, true) && !se.b(var6, var12, -4)) {
										break label516;
									}

									a(43, var1, var13.int_ib, var15 + var13.Nb, var14 - -var13.Bb, var15, var6, var7, var13.Mb, var14, var13.dc, var11);
									if (var13.Ab != null) {
										a(93, var13.Ab, var13.int_ib, var15 - -var13.Nb, var14 + var13.Bb, var15, var6, var7, var13.Mb, var14, var13.dc, var11);
									}

									if (~var13.mb < ~var13.Nb && !var13.gb) {
										nb.a(var13.mb, var13.Nb, var15, var7, var6, -105, var11, var13, var14 + var13.Bb);
									}

									if (!var13.gb && var25 == 0) {
										break label516;
									}
								}

								if (~var13.jc == -2 && var14 <= var11 && ~var7 <= ~var15 && ~(var13.Bb + var14) < ~var11 && var7 < var13.Nb + var15) {
									boolean var16 = false;
									if (~var13.Sb != -1) {
										var16 = s.a(var13, (byte) 118);
									}

									if (!var16) {
										++df.int_k;
										ab.a(0, kd.rd_v, var13.dc, (byte) 120, 42, var13.nd, 0);
									}
								}

								if (var13.jc == 2 && !tc.K && ~var14 >= ~var11 && ~var15 >= ~var7 && ~(var14 - -var13.Bb) < ~var11 && ~var7 > ~(var13.Nb + var15)) {
									rd var27 = cf.a(var13, true);
									if (var27 != null) {
										ab.a(-1, pc.a((byte) 125, new rd[]{
												me.z,
												var13.Gb
										}), var13.dc, (byte) 126, 4, var27, 0);
										++e.Lb;
									}
								}

								if (~var13.jc == -4 && var14 <= var11 && var7 >= var15 && ~(var13.Bb + var14) < ~var11 && var7 < var13.Nb + var15) {
									byte var28;
									label432:
									{
										++sd.eb;
										if (var6 != 3) {
											var28 = 39;
											if (var25 == 0) {
												break label432;
											}
										}

										var28 = 55;
									}

									ab.a(0, kd.rd_v, var13.dc, (byte) 124, var28, dc.close2, 0);
								}

								if (~var13.jc == -5 && var11 >= var14 && var7 >= var15 && ~var11 > ~(var13.Bb + var14) && var7 < var15 - -var13.Nb) {
									++ie.e;
									ab.a(0, kd.rd_v, var13.dc, (byte) 122, 25, var13.nd, 0);
								}

								if (var13.jc == 5 && ~var14 >= ~var11 && var15 <= var7 && var13.Bb + var14 > var11 && ~var7 > ~(var13.Nb + var15)) {
									ab.a(0, kd.rd_v, var13.dc, (byte) 123, 53, var13.nd, 0);
									++ge.J;
								}

								if (~var13.jc == -7 && ce.int_l == -1 && var14 <= var11 && var15 <= var7 && ~(var13.Bb + var14) < ~var11 && var7 < var13.Nb + var15) {
									ab.a(-1, kd.rd_v, var13.dc, (byte) 127, 45, var13.nd, 0);
									++wd.f;
								}

								int var18;
								int var29;
								if (var13.tb == 2) {
									var29 = 0;
									int var17 = 0;
									if (var25 != 0 || ~var13.Nb < ~var17) {
										do {
											var18 = 0;
											if (var25 == 0 && ~var18 <= ~var13.Bb) {
												++var17;
											} else {
												do {
													int var19 = var14 + var18 * (var13.int_hb + 32);
													int var20 = var15 - -((32 - -var13.Vc) * var17);
													if (var29 < 20) {
														var19 += var13.xb[var29];
														var20 += var13.Hc[var29];
													}

													if (~var11 <= ~var19 && var20 <= var7 && ~var11 > ~(32 + var19) && ~(var20 + 32) < ~var7) {
														ce.int_k = var29;
														vc.z = var13.dc;
														if (~var13.ob[var29] < -1) {
															label514:
															{
																hc var21 = u.a(var13.ob[var29] - 1, false);
																if (we.f == 1 && b.a(0, fc.a(var13, 1572721824))) {
																	if (~var13.dc == ~m.int_l && hc.tb == var29) {
																		break label514;
																	}

																	++ge.O;
																	ab.a(var29, pc.a((byte) 125, new rd[]{
																			ca.rd_d,
																			dc.rd_q,
																			var21.Rb
																	}), var13.dc, (byte) 126, 29, sa.use2, var21.jb);
																	if (var25 == 0) {
																		break label514;
																	}
																}

																if (!tc.K || !b.a(0, fc.a(var13, 1572721824))) {
																	rd[] var22 = var21.Gb;
																	++pc.A;
																	if (qb.kb) {
																		var22 = e.a(120, var22);
																	}

																	int var23;
																	byte var24;
																	if (b.a(0, fc.a(var13, 1572721824))) {
																		var23 = 4;
																		if (var25 != 0 || var23 >= 3) {
																			do {
																				label364:
																				{
																					if (var22 != null && var22[var23] != null) {
																						label357:
																						{
																							if (var23 != 3) {
																								var24 = 57;
																								if (var25 == 0) {
																									break label357;
																								}
																							}

																							var24 = 31;
																						}

																						ab.a(var29, pc
																								.a((byte) 125, new rd[]{
																										db.lightRedText,
																										var21.Rb
																								}), var13.dc, (byte) 120, var24, var22[var23], var21.jb);
																						++h.int_b;
																						if (var25 == 0) {
																							break label364;
																						}
																					}

																					if (var23 == 4) {
																						ab.a(var29, pc
																								.a((byte) 127, new rd[]{
																										db.lightRedText,
																										var21.Rb
																								}), var13.dc, (byte) 125, 57, md.x, var21.jb);
																						++bc.p;
																					}
																				}

																				--var23;
																			} while (var23 >= 3);
																		}
																	}

																	if (kb.a((byte) -66, fc.a(var13, 1572721824))) {
																		++tb.Qb;
																		ab.a(var29, pc.a((byte) 127, new rd[]{
																				db.lightRedText,
																				var21.Rb
																		}), var13.dc, (byte) 123, 23, sa.use2, var21.jb);
																	}

																	if (b
																			.a(0, fc.a(var13, 1572721824)) && var22 != null) {
																		var23 = 2;
																		if (var25 != 0 || var23 >= 0) {
																			do {
																				if (var22[var23] != null) {
																					++ca.int_h;
																					var24 = 0;
																					if (~var23 == -1) {
																						var24 = 28;
																					}

																					if (var23 == 1) {
																						var24 = 50;
																					}

																					if (var23 == 2) {
																						var24 = 6;
																					}

																					ab.a(var29, pc
																							.a((byte) 126, (rd[]) (new rd[]{
																									db.lightRedText,
																									var21.Rb
																							})), var13.dc, (byte) 126, var24, var22[var23], var21.jb);
																				}

																				--var23;
																			} while (var23 >= 0);
																		}
																	}

																	var22 = var13.Ac;
																	if (qb.kb) {
																		var22 = e.a(109, var22);
																	}

																	if (var22 != null) {
																		var23 = 4;
																		if (var25 != 0 || ~var23 <= -1) {
																			do {
																				if (var22[var23] != null) {
																					++jd.int_d;
																					var24 = 0;
																					if (var23 == 0) {
																						var24 = 37;
																					}

																					if (var23 == 1) {
																						var24 = 10;
																					}

																					if (var23 == 2) {
																						var24 = 1;
																					}

																					if (~var23 == -4) {
																						var24 = 48;
																					}

																					if (var23 == 4) {
																						var24 = 36;
																					}

																					ab.a(var29, pc
																							.a((byte) 126, (rd[]) (new rd[]{
																									db.lightRedText,
																									var21.Rb
																							})), var13.dc, (byte) 122, var24, var22[var23], var21.jb);
																				}

																				--var23;
																			} while (~var23 <= -1);
																		}
																	}

																	ab.a(var29, pc.a((byte) 125, (rd[]) (new rd[]{
																			db.lightRedText,
																			var21.Rb
																	})), var13.dc, (byte) 124, 1006, tb.examine2, var21.jb);
																	if (var25 == 0) {
																		break label514;
																	}
																}

																if ((16 & d.int_g) == 16) {
																	ab.a(var29, pc.a((byte) 125, (rd[]) (new rd[]{
																			ee.rd_t,
																			dc.rd_q,
																			var21.Rb
																	})), var13.dc, (byte) 123, 41, sd.P, var21.jb);
																	++pd.P;
																}
															}
														}
													}

													++var29;
													++var18;
												} while (~var18 > ~var13.Bb);

												++var17;
											}
										} while (~var13.Nb < ~var17);
									}
								}

								if (var13.gb) {
									label506:
									{
										if (!tc.K) {
											if (var11 < var14 || var15 > var7 || ~(var14 - -var13.Bb) >= ~var11 || ~var7 <= ~(var15 + var13.Nb)) {
												break label506;
											}

											var29 = 9;
											rd var30;
											if (var25 != 0 || ~var29 <= -6) {
												do {
													var30 = w.a(var13, var29, (byte) 115);
													if (var30 != null) {
														ab.a(var13.Yc, var13.Xc, var13.dc, (byte) 126, 24, var30, 1 + var29);
														++me.K;
													}

													--var29;
												} while (~var29 <= -6);
											}

											var30 = cf.a(var13, true);
											if (var30 != null) {
												ab.a(var13.Yc, var13.Xc, var13.dc, (byte) 126, 4, var30, 0);
												++e.Lb;
											}

											var18 = 4;
											if (var25 != 0 || var18 >= 0) {
												do {
													rd var31 = w.a(var13, var18, (byte) 75);
													if (var31 != null) {
														++me.K;
														ab.a(var13.Yc, var13.Xc, var13.dc, (byte) 125, 24, var31, 1 + var18);
													}

													--var18;
												} while (var18 >= 0);
											}

											if (!s.a((byte) 116, fc.a(var13, 1572721824))) {
												break label506;
											}

											ab.a(-1, kd.rd_v, var13.dc, (byte) 122, 45, var13.nd, 0);
											++wd.f;
											if (var25 == 0) {
												break label506;
											}
										}

										if (nd.a(fc.a(var13, 1572721824), true) && ~(d.int_g & 32) == -33 && var14 <= var11 && var15 <= var7 && var13.Bb + var14 > var11 && var13.Nb + var15 > var7) {
											++bd.int_fb;
											ab.a(var13.Yc, pc.a((byte) 127, (rd[]) (new rd[]{
													ee.rd_t,
													t.h,
													var13.Xc
											})), var13.dc, (byte) 127, 15, sd.P, 0);
										}
									}
								}
							}
						}

						++var12;
					} while (var1.length > var12);

					if (var0 <= 5) {
						mousePressedX = -32;
					}
				}
			}
		} catch (RuntimeException var26) {
			throw id.a(var26, "td.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	static void a (int i, int mapX, int i1, id class_id, int i2, int unused, int mapY, int plane) {
		int dummy = client.int_tb;
		try {
			label92:
			{
				int var8;
				if (mapX >= 0 && mapX < 104 && mapY >= 0 && mapY < 104) {
					d.bytes_j[plane][mapX][mapY] = 0;
					do {
						do {
							do {
								var8 = class_id.readUnsignedByte((byte) 116);
								if (var8 == 0) {
									if (plane != 0) {
										tb.Yb[plane][mapX][mapY] = -240 + tb.Yb[plane + -1][mapX][mapY];
										if (dummy == 0) {
											break label92;
										}
									} else {
										tb.Yb[0][mapX][mapY] = -qe
												.a(4237, i1 + mapX + 932731, i2 + mapY + 556238) * 8;
										if (dummy == 0) {
											break label92;
										}
									}
								} else if (var8 == 1) {
									int var9 = class_id.readUnsignedByte((byte) 116);
									if (var9 == 1) {
										var9 = 0;
									}

									if (plane == 0) {
										tb.Yb[0][mapX][mapY] = 8 * -var9;
										if (dummy == 0) {
											break label92;
										}
									} else {
										tb.Yb[plane][mapX][mapY] = tb.Yb[plane + -1][mapX][mapY] - var9 * 8;
										if (dummy == 0) {
											break label92;
										}
									}
								}

								if (var8 > 49) {
									break;
								}

								u.bytes_kb[plane][mapX][mapY] = class_id.readByte(true);
								ta.Xb[plane][mapX][mapY] = (byte) ((-2 + var8) / 4);
								a.bytes_gb[plane][mapX][mapY] = (byte) od.a(3, i + -2 + var8);
							} while (true);

							if (var8 > 81) {
								break;
							}

							d.bytes_j[plane][mapX][mapY] = (byte) (-49 + var8);
						} while (true);

						o.h[plane][mapX][mapY] = (byte) (-81 + var8);
					} while (true);
				}

				while (true) {
					int i3 = class_id.readUnsignedByte((byte) 116);
					if (i3 == 0) {
						break;
					} else if (i3 == 1) {
						class_id.readUnsignedByte((byte) 116);
						if (dummy == 0) {
							break;
						}
					} else if (i3 <= 49) {
						class_id.readUnsignedByte((byte) 116);
						if (dummy != 0) {
							break;
						}
					}
				}
			}

			++vd;
		} catch (RuntimeException var11) {
			throw id.a(var11, "td.E(" + i + ',' + mapX + ',' + i1 + ',' + (class_id != null ? "{...}" : "null") + ',' + i2 + ',' + unused + ',' + mapY + ',' + plane + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void h (int unused) {
		try {
			synchronized (ja.fc_a) {
				s.zb = b.int_id;
				pb.H = df.mouseX;
				la.t = qc.mouseY;
				client.int_qb = ke.qb;
				wb.nb = mousePressedX;
				sb.int_b = df.mousePressedY;
				s.long_qb = nd.long_ec;
				ke.qb = 0;
			}

			++Ad;
		} catch (RuntimeException var7) {
			throw id.a(var7, "td.G(" + unused + ')');
		}
	}

	final boolean d (byte unused) {
		try {
			++int_ld;
			return this.o_jd != null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "td.A(" + unused + ')');
		}
	}

	final void a (id var1, int var2) {
		int var10 = client.int_tb;

		try {
			++Ed;
			var1.pointer = 0;
			int var3 = var1.readUnsignedByte((byte) 116);
			this.fd = var1.readByte(true);
			int var4 = var2;
			this.xd = var1.readByte(true);
			int[] var5 = new int[12];
			this.Xc = 0;
			int var6 = 0;
			int var8;
			int var9;
			if (var10 != 0 || ~var6 > -13) {
				do {
					label122:
					{
						int var7 = var1.readUnsignedByte((byte) 116);
						if (var7 == 0) {
							var5[var6] = 0;
							if (var10 == 0) {
								break label122;
							}
						}

						var8 = var1.readUnsignedByte((byte) 116);
						var5[var6] = var8 + (var7 << 8);
						if (~var6 == -1 && ~var5[0] == -65536) {
							var4 = var1.readUnsignedLEShort(var2 ^ -256);
							if (var10 == 0) {
								break;
							}
						}

						if (var5[var6] >= 512) {
							var9 = u.a(var5[var6] - 512, false).Nb;
							if (var9 != 0) {
								this.Xc = var9;
							}
						}
					}

					++var6;
				} while (~var6 > -13);
			}

			int[] var12 = new int[5];
			var8 = 0;
			if (var10 != 0) {
				var9 = var1.readUnsignedByte((byte) 116);
				if (var9 < 0 || var9 >= pd.B[var8].length) {
					var9 = 0;
				}

				var12[var8] = var9;
				++var8;
			}

			while (~var8 > -6) {
				var9 = var1.readUnsignedByte((byte) 116);
				if (var9 < 0 || var9 >= pd.B[var8].length) {
					var9 = 0;
				}

				var12[var8] = var9;
				++var8;
			}

			super.yb = var1.readUnsignedLEShort(255);
			if (~super.yb == -65536) {
				super.yb = -1;
			}

			super.Gc = var1.readUnsignedLEShort(255);
			if (super.Gc == '\uffff') {
				super.Gc = -1;
			}

			super.int_sc = super.Gc;
			super.xb = var1.readUnsignedLEShort(255);
			if (super.xb == '\uffff') {
				super.xb = -1;
			}

			super.int_oc = var1.readUnsignedLEShort(255);
			if (~super.int_oc == -65536) {
				super.int_oc = -1;
			}

			super.int_fc = var1.readUnsignedLEShort(255);
			if (super.int_fc == '\uffff') {
				super.int_fc = -1;
			}

			super.Rb = var1.readUnsignedLEShort(255);
			if (~super.Rb == -65536) {
				super.Rb = -1;
			}

			super.Cc = var1.readUnsignedLEShort(255);
			if (super.Cc == '\uffff') {
				super.Cc = -1;
			}

			this.Gd = ff.a(-26567, var1.readLong(false)).e(-85);
			this.int_sd = var1.readUnsignedByte((byte) 116);
			this.gd = var1.readUnsignedLEShort(255);
			if (this.o_jd == null) {
				this.o_jd = new o();
			}

			this.o_jd.a(~var3 == -2, var4, (byte) -34, var12, var5);
		} catch (RuntimeException var11) {
			throw id.a(var11, "td.D(" + "{...}" + ',' + var2 + ')');
		}
	}

	final ue c (byte var1) {
		int var7 = client.int_tb;

		try {
			++int_id;
			if (this.o_jd == null) {
				return null;
			} else {
				if (var1 >= -9) {
					g(-54);
				}

				e var2 = super.zc != -1 && super.Gb == 0 ? bd.a(super.zc, false) : null;
				e var3 = super.int_lc != -1 && !this.ed && (super.yb != super.int_lc || var2 == null) ? bd
						.a(super.int_lc, false) : null;
				ue var4 = this.o_jd.a(super.Fb, var2, 0, super.int_tb, var3);
				if (var4 == null) {
					return null;
				} else {
					var4.d();
					super.int_vc = var4.int_qb;
					ue var5;
					ue[] var6;
					if (!this.ed && ~super.Wb != 0 && super.int_tc != -1) {
						var5 = l.a(true, super.Wb).b(-1565796086, super.int_tc);
						if (var5 != null) {
							var5.b(0, -super.int_gc, 0);
							var6 = new ue[]{var4, var5};
							var4 = new ue(var6, 2);
						}
					}

					if (!this.ed && this.Hd != null) {
						if (ce.y >= this.Cd) {
							this.Hd = null;
						}

						if (ce.y >= this.zd && ~this.Cd < ~ce.y) {
							label107:
							{
								var5 = this.Hd;
								var5.b(this.rd + -super.x_, -this.int_nd + this.Bd, this.int_bd - super.y_);
								if (super.int_ac == 512) {
									var5.b();
									var5.b();
									var5.b();
									if (var7 == 0) {
										break label107;
									}
								}

								if (super.int_ac != 1024) {
									if (~super.int_ac != -1537) {
										break label107;
									}

									var5.b();
									if (var7 == 0) {
										break label107;
									}
								}

								var5.b();
								var5.b();
							}

							label108:
							{
								var6 = new ue[]{var4, var5};
								var4 = new ue(var6, 2);
								if (~super.int_ac == -513) {
									var5.b();
									if (var7 == 0) {
										break label108;
									}
								}

								if (~super.int_ac != -1025) {
									if (~super.int_ac != -1537) {
										break label108;
									}

									var5.b();
									var5.b();
									var5.b();
									if (var7 == 0) {
										break label108;
									}
								}

								var5.b();
								var5.b();
							}

							var5.b(-this.rd + super.x_, this.int_nd + -this.Bd, super.y_ - this.int_bd);
						}
					}

					var4.Db = true;
					return var4;
				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "td.F(" + var1 + ')');
		}
	}
}
