import java.awt.Graphics;

final class pa {
	static int b;
	static int c;
	static int canvasWidth;
	static rd rd_f = md.a((String) "Anmelde)2Limit -Uberschritten)3", (byte) 121);
	static rd g;
	static boolean boolean_h = false;
	static int i;
	static int int_j;
	static int k;
	static rd l;
	static rd m = md.a((String) "Wen m-Ochten Sie entfernen?", (byte) 124);
	static int n;
	static int int_o;
	static int trade_competeStatus;
	private static rd rd_a = md.a((String) "glow1:", (byte) 114);
	private static rd rd_e;

	static {
		l = rd_a;
		rd_e = md.a("wishes to duel with you)3", (byte) 120);
		g = rd_e;
		trade_competeStatus = 0;
	}

	static oa a (int var0) {
		try {
			++c;
			oa var1 = new oa();
			var1.lb = a.mb;
			var1.hb = e.yb[0];
			var1.mb = ra.q[0];
			var1.ib = eb.ints_g;
			if (var0 != -19457) {
				rd_a = null;
			}

			var1.kb = sd.bb[0];
			var1.nb = w.ints_a[0];
			var1.jb = w.bytes_s[0];
			var1.gb = ld.g;
			ee.b(-1958111762);
			return var1;
		} catch (RuntimeException var2) {
			throw id.a(var2, "pa.A(" + var0 + ')');
		}
	}

	static void a (ua class_ua, byte unused, nc[] ncs) {
		int dummy = client.int_tb;
		try {
			for (int plane = 0 ; plane < 4 ; plane++) {
				int x = 0;
				do {
					int y = 0;
					if (y >= 104) {
						++x;
					} else {
						do {
							if ((d.bytes_j[plane][x][y] & 1) == 1) {
								int plane2 = plane;
								if ((d.bytes_j[1][x][y] & 2) == 2) {
									plane2 = plane - 1;
								}

								if (plane2 >= 0) {
									ncs[plane2].markBlocked(x, y, (byte) -77);
								}
							}

							++y;
						} while (y < 104);

						++x;
					}
				} while (x < 104);
			}

			j.ob += -2 + (int) (Math.random() * 5.0D);
			++i;
			if (j.ob < -16) {
				j.ob = -16;
			}

			if (j.ob > 16) {
				j.ob = 16;
			}

			id.gb += (int) (5.0D * Math.random()) + -2;
			if (id.gb < -8) {
				id.gb = -8;
			}

			if (id.gb > 8) {
				id.gb = 8;
			}

			int plane = 0;
			int var5;
			int var6;
			int var7;
			int var8;
			int x;
			int x1;
			int y2;
			int x2;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			short var47;
			if (plane >= 4) {
				class_ua.g(-50, -10, -50);
				int i = 0;
				if (~i > -105) {
					do {
						var6 = 0;
						if (~var6 <= -105) {
							++i;
						} else {
							do {
								if (~(2 & d.bytes_j[1][i][var6]) == -3) {
									class_ua.a(i, var6);
								}

								++var6;
							} while (~var6 > -105);

							++i;
						}
					} while (~i > -105);
				}

				var6 = 1;
				var8 = 4;
				var7 = 2;
				x = 0;
				if (x < 4) {
					do {
						if (~x < -1) {
							var7 <<= 3;
							var8 <<= 3;
							var6 <<= 3;
						}

						x1 = 0;
						if (x1 > x) {
							++x;
						} else {
							do {
								y2 = 0;
								if (y2 > 104) {
									++x1;
								} else {
									do {
										x2 = 0;
										if (x2 > 104) {
											++y2;
										} else {
											do {
												if (~(var6 & af.ints_c[x1][x2][y2]) != -1) {
													var13 = y2;
													while (var13 > 0 && ~(af.ints_c[x1][x2][var13 - 1] & var6) != -1) {
														--var13;
													}

													var14 = y2;
													while (var14 < 104 && ~(af.ints_c[x1][x2][var14 - -1] & var6) != -1) {
														++var14;
													}

													label1627:
													{
														var16 = x1;
														var15 = x1;
														if (x1 <= 0) {
															if (x1 >= x) {
																break label1627;
															}
														} else {
															label1028:
															while (true) {
																var17 = var13;
																if (~var13 >= ~var14) {
																	do {
																		if ((af.ints_c[var15 - 1][x2][var17] & var6) == 0) {
																			if (dummy == 0) {
																				if (x1 >= x) {
																					break label1627;
																				}
																				break label1028;
																			}

																			++var17;
																		} else {
																			++var17;
																		}
																	} while (~var17 >= ~var14);
																}

																--var15;
																if (var15 <= 0) {
																	if (dummy == 0 && x1 >= x) {
																		break label1627;
																	}
																	break;
																}
															}
														}

														label1026:
														do {
															var17 = var13;
															if (dummy == 0 && var14 < var13) {
																++var16;
															} else {
																do {
																	if ((var6 & af.ints_c[1 + var16][x2][var17]) == 0 && dummy == 0) {
																		break label1026;
																	}

																	++var17;
																} while (var14 >= var17);

																++var16;
															}
														} while (var16 < x);
													}

													var17 = (1 + var16 + -var15) * (1 + -var13 + var14);
													if (var17 >= 8) {
														var47 = 240;
														var19 = -var47 + tb.Yb[var16][x2][var13];
														var20 = tb.Yb[var15][x2][var13];
														ua.b(x, 1, x2 * 128, x2 * 128, 128 * var13, 128 + var14 * 128, var19, var20);
														var21 = var15;
														if (dummy != 0 || ~var15 >= ~var16) {
															do {
																var22 = var13;
																if (dummy == 0 && var14 < var13) {
																	++var21;
																} else {
																	do {
																		af.ints_c[var21][x2][var22] = od
																				.a(af.ints_c[var21][x2][var22], ~var6);
																		++var22;
																	} while (var14 >= var22);

																	++var21;
																}
															} while (~var21 >= ~var16);
														}
													}
												}

												if ((af.ints_c[x1][x2][y2] & var7) != 0) {
													var13 = x2;
													if (dummy != 0) {
														var13 = x2 - 1;
													}

													while (var13 > 0 && (af.ints_c[x1][var13 + -1][y2] & var7) != 0) {
														--var13;
													}

													var14 = x2;
													var15 = x1;
													if (dummy != 0) {
														var14 = x2 + 1;
													}

													while (var14 < 104 && ~(var7 & af.ints_c[x1][1 + var14][y2]) != -1) {
														++var14;
													}

													label1630:
													{
														var16 = x1;
														if (dummy == 0 && x1 <= 0) {
															if (dummy == 0 && x1 >= x) {
																break label1630;
															}
														} else {
															label1186:
															while (true) {
																var17 = var13;
																if (dummy != 0 || var14 >= var13) {
																	do {
																		if (~(var7 & af.ints_c[-1 + var15][var17][y2]) == -1) {
																			if (dummy == 0) {
																				if (x1 >= x) {
																					break label1630;
																				}
																				break label1186;
																			}

																			++var17;
																		} else {
																			++var17;
																		}
																	} while (var14 >= var17);
																}

																--var15;
																if (var15 <= 0) {
																	if (dummy == 0 && x1 >= x) {
																		break label1630;
																	}
																	break;
																}
															}
														}

														label1184:
														do {
															var17 = var13;
															if (dummy == 0 && ~var13 < ~var14) {
																++var16;
															} else {
																do {
																	if (~(var7 & af.ints_c[var16 - -1][var17][y2]) == -1 && dummy == 0) {
																		break label1184;
																	}

																	++var17;
																} while (~var17 >= ~var14);

																++var16;
															}
														} while (var16 < x);
													}

													var17 = (1 + var14 - var13) * (var16 - -1 - var15);
													if (var17 >= 8) {
														var47 = 240;
														var20 = tb.Yb[var15][var13][y2];
														var19 = -var47 + tb.Yb[var16][var13][y2];
														ua.b(x, 2, 128 * var13, 128 + var14 * 128, 128 * y2, y2 * 128, var19, var20);
														var21 = var15;
														if (dummy != 0 || var15 <= var16) {
															do {
																var22 = var13;
																if (dummy == 0 && ~var13 < ~var14) {
																	++var21;
																} else {
																	do {
																		af.ints_c[var21][var22][y2] = od
																				.a(af.ints_c[var21][var22][y2], ~var7);
																		++var22;
																	} while (~var22 >= ~var14);

																	++var21;
																}
															} while (var21 <= var16);
														}
													}
												}

												if (~(af.ints_c[x1][x2][y2] & var8) != -1) {
													var14 = x2;
													var13 = x2;
													var16 = y2;
													var15 = y2;
													if (dummy != 0) {
														var16 = y2 + 1;
													}

													label1307:
													while (true) {
														if (var16 < 104) {
															if ((af.ints_c[x1][x2][1 + var16] & var8) != 0) {
																++var16;
																continue;
															}

															if (dummy != 0) {
																var15 = y2 - 1;
															}
														}

														while (true) {
															label1333:
															{
																if (~var15 < -1) {
																	if ((var8 & af.ints_c[x1][x2][var15 + -1]) != 0) {
																		--var15;
																		continue;
																	}

																	if (dummy == 0 && ~x2 >= -1) {
																		if (dummy == 0 && ~x2 <= -105) {
																			break label1307;
																		}
																		break label1333;
																	}
																} else if (~x2 >= -1) {
																	if (dummy == 0 && ~x2 <= -105) {
																		break label1307;
																	}
																	break label1333;
																}

																label1336:
																while (true) {
																	var17 = var15;
																	if (dummy != 0 || ~var15 >= ~var16) {
																		do {
																			if (~(var8 & af.ints_c[x1][var13 + -1][var17]) == -1) {
																				if (dummy == 0) {
																					if (~x2 <= -105) {
																						break label1307;
																					}
																					break label1336;
																				}

																				++var17;
																			} else {
																				++var17;
																			}
																		} while (~var17 >= ~var16);
																	}

																	--var13;
																	if (~var13 >= -1) {
																		if (dummy == 0 && ~x2 <= -105) {
																			break label1307;
																		}
																		break;
																	}
																}
															}

															while (true) {
																var17 = var15;
																if (dummy == 0 && ~var16 > ~var15) {
																	++var14;
																} else {
																	while (true) {
																		if (~(af.ints_c[x1][var14 + 1][var17] & var8) == -1 && dummy == 0) {
																			break label1307;
																		}

																		++var17;
																		if (~var16 > ~var17) {
																			++var14;
																			break;
																		}
																	}
																}

																if (~var14 <= -105) {
																	break label1307;
																}
															}
														}
													}

													if (~((1 + (var14 - var13)) * (1 + -var15 + var16)) <= -5) {
														var17 = tb.Yb[x1][var13][var15];
														ua.b(x, 4, 128 * var13, 128 + 128 * var14, var15 * 128, 128 * var16 + 128, var17, var17);
														var18 = var13;
														if (dummy != 0 || ~var14 <= ~var13) {
															do {
																var19 = var15;
																if (dummy == 0 && ~var15 < ~var16) {
																	++var18;
																} else {
																	do {
																		af.ints_c[x1][var18][var19] = od
																				.a(af.ints_c[x1][var18][var19], ~var8);
																		++var19;
																	} while (~var19 >= ~var16);

																	++var18;
																}
															} while (~var14 <= ~var18);
														}
													}
												}

												++x2;
											} while (x2 <= 104);

											++y2;
										}
									} while (y2 <= 104);

									++x1;
								}
							} while (~x1 >= ~x);

							++x;
						}
					} while (x < 4);

				}
			} else {
				do {
					byte[][] bytes = ud.M[plane];
					int i = (int) Math.sqrt(5100.0D);
					int i1 = i * 768 >> 8;
					int y = 1;
					while (y < 103) {
						x = 1;
						if (x >= 103) {
							++y;
						} else {
							do {
								int i2 = -tb.Yb[plane][x + -1][y] + tb.Yb[plane][x + 1][y];
								int i3 = tb.Yb[plane][x][1 + y] - tb.Yb[plane][x][-1 + y];
								int i4 = (int) Math.sqrt((double) (i3 * i3 + i2 * i2 + 65536));
								int i5 = (i2 << 8) / i4;
								int i6 = (i3 << 8) / i4;
								int i7 = 65536 / i4;
								int i8 = 96 + ((i7 * -10 + (i5 * -50 + (i6 * -50))) / i1);
								int i9 = (bytes[x][y] >> 1) + (bytes[x][1 + y] >> 3) + (bytes[x][y + -1] >> 2) + (bytes[-1 + x][y] >> 2) + (bytes[1 + x][y] >> 3);
								ge.ints_ab[x][y] = -i9 + i8;
								++x;
							} while (x < 103);

							++y;
						}
					}

					x = 0;
					while (x < 104) {
						sb.ints_m[x] = 0;
						id.Rb[x] = 0;
						s.xb[x] = 0;
						p.L[x] = 0;
						f.Wc[x] = 0;
						++x;
					}

					x1 = -5;
					if (x1 < 109) {
						do {
							int i2 = 0;
							sa class_sa;
							sa class_sa2;
							for ( ; i2 < 104 ; ++i2) {
								int i3 = 5 + x1;
								if (i3 >= 0 && i3 < 104) {
									int fileRequest = 255 & o.h[plane][i3][i2];
									if (fileRequest > 0) {
										class_sa = ad.a(true, -1 + fileRequest);
										sb.ints_m[i2] += class_sa.Db;
										id.Rb[i2] += class_sa.gb;
										s.xb[i2] += class_sa.wb;
										p.L[i2] += class_sa.eb;
										++f.Wc[i2];
									}
								}

								int i4 = x1 + -5;
								if (i4 >= 0 && i4 < 104) {
									int fileRequest = 255 & o.h[plane][i4][i2];
									if (fileRequest > 0) {
										class_sa2 = ad.a(true, -1 + fileRequest);
										sb.ints_m[i2] -= class_sa2.Db;
										id.Rb[i2] -= class_sa2.gb;
										s.xb[i2] -= class_sa2.wb;
										p.L[i2] -= class_sa2.eb;
										--f.Wc[i2];
									}
								}
							}

							if (x1 >= 1 && x1 < 103) {
								int i3 = 0;
								int i4 = 0;
								int i5 = 0;
								int i6 = 0;
								int i7 = 0;
								int y1 = -5;
								if (y1 < 109) {
									do {
										int i9 = y1 - 5;
										int i10 = 5 + y1;
										if (i10 >= 0 && i10 < 104) {
											i3 += sb.ints_m[i10];
											i6 += p.L[i10];
											i4 += s.xb[i10];
											i5 += id.Rb[i10];
											i7 += f.Wc[i10];
										}

										if (i9 >= 0 && i9 < 104) {
											i3 -= sb.ints_m[i9];
											i6 -= p.L[i9];
											i7 -= f.Wc[i9];
											i4 -= s.xb[i9];
											i5 -= id.Rb[i9];
										}

										if (y1 >= 1 && y1 < 103 && (!jb.L || (2 & d.bytes_j[0][x1][y1]) != 0 || (16 & d.bytes_j[plane][x1][y1]) == 0 && (qb
												.a((byte) -123, x1, plane, y1) == af.int_m))) {
											if (client.int_ib > plane) {
												client.int_ib = plane;
											}

											int i8 = 255 & o.h[plane][x1][y1];
											int i11 = 255 & u.bytes_kb[plane][x1][y1];
											if (i8 > 0 || i11 > 0) {
												label1623:
												{
													int i12 = tb.Yb[plane][x1][y1];
													int i13 = tb.Yb[plane][x1 + 1][y1];
													int i14 = tb.Yb[plane][x1 - -1][y1 - -1];
													int i15 = tb.Yb[plane][x1][y1 + 1];
													int i16 = ge.ints_ab[x1][y1];
													int i17 = ge.ints_ab[x1 + 1][y1 - -1];
													int i18 = ge.ints_ab[1 + x1][y1];
													int i19 = -1;
													int i20 = -1;
													int i21 = ge.ints_ab[x1][1 + y1];
													int i22;
													int i23;
													if (i8 > 0) {
														int i24;
														i22 = i3 * 256 / i6;
														i23 = i5 / i7;
														i24 = i4 / i7;
														i20 = j.a(i23, 27, i24, i22);
														i22 = id.gb + i22 & 255;
														i24 += j.ob;
														if (i24 >= 0) {
															if (i24 > 255) {
																i24 = 255;
															}
														} else {
															i24 = 0;
														}

														i19 = j.a(i23, -78, i24, i22);
													}

													if (plane > 0) {
														boolean flag2 = true;
														if (i8 == 0 && ta.Xb[plane][x1][y1] != 0) {
															flag2 = false;
														}

														if (i11 > 0 && !h.a(-128, i11 - 1).cb) {
															flag2 = false;
														}

														if (flag2 && i12 == i13 && ~i12 == ~i14 && ~i15 == ~i12) {
															af.ints_c[plane][x1][y1] = fb
																	.b(af.ints_c[plane][x1][y1], 2340);
														}
													}

													i22 = 0;
													if (i19 != -1) {
														i22 = v.hb[pe.b(i19, 96, (byte) -29)];
													}

													if (i11 == 0) {
														class_ua.a(plane, x1, y1, 0, 0, -1, i12, i13, i14, i15, pe
																.b(i20, i16, (byte) -29), pe
																		   .b(i20, i18, (byte) -29), pe
																		   .b(i20, i17, (byte) -29), pe
																		   .b(i20, i21, (byte) -29), 0, 0, 0, 0, i22, 0);
													} else {
														hf var35;
														int var36;
														int var37;
														int var38;
														int var39;
														int var40;
														byte var49;
														label1598:
														{
															i23 = ta.Xb[plane][x1][y1] + 1;
															var49 = a.bytes_gb[plane][x1][y1];
															var35 = h.a(-128, i11 + -1);
															var36 = var35.tb;
															if (~var36 <= -1) {
																var38 = v.cd_ub.a(-22953, var36);
																var37 = -1;
																if (dummy == 0) {
																	break label1598;
																}
															}

															if (var35.lb != 16711935) {
																label709:
																{
																	var37 = j.a(var35.fb, 112, var35.Z, var35.int_eb);
																	var39 = var35.int_eb + id.gb & 255;
																	var40 = j.ob + var35.Z;
																	if (~var40 <= -1) {
																		if (var40 <= 255) {
																			break label709;
																		}

																		var40 = 255;
																		if (dummy == 0) {
																			break label709;
																		}
																	}

																	var40 = 0;
																}

																var38 = j.a(var35.fb, 66, var40, var39);
																if (dummy == 0) {
																	break label1598;
																}
															}

															var38 = -2;
															var36 = -1;
															var37 = -2;
														}

														var39 = 0;
														if (var38 != -2) {
															var39 = v.hb[bd.a(96, var38, 99)];
														}

														if (var35.int_ub != -1) {
															int var41;
															label699:
															{
																var40 = id.gb + var35.ab & 255;
																var41 = j.ob + var35.ob;
																if (~var41 > -1) {
																	var41 = 0;
																	if (dummy == 0) {
																		break label699;
																	}
																}

																if (~var41 < -256) {
																	var41 = 255;
																}
															}

															var38 = j.a(var35.db, 109, var41, var40);
															var39 = v.hb[bd.a(96, var38, 47)];
														}

														class_ua.a(plane, x1, y1, i23, var49, var36, i12, i13, i14, i15, pe
																.b(i20, i16, (byte) -29), pe
																		   .b(i20, i18, (byte) -29), pe
																		   .b(i20, i17, (byte) -29), pe
																		   .b(i20, i21, (byte) -29), bd
																		   .a(i16, var37, 30), bd
																		   .a(i18, var37, 112), bd
																		   .a(i17, var37, 73), bd
																		   .a(i21, var37, 70), i22, var39);
													}
												}
											}
										}

										++y1;
									} while (y1 < 109);
								}
							}

							++x1;
						} while (x1 < 109);

						y2 = 1;
						if (y2 < 103) {
							do {
								x2 = 1;
								if (x2 >= 103) {
									++y2;
								} else {
									do {
										class_ua.d(plane, x2, y2, qb.a((byte) -123, x2, plane, y2));
										++x2;
									} while (x2 < 103);

									++y2;
								}
							} while (y2 < 103);

							o.h[plane] = null;
							u.bytes_kb[plane] = null;
							ta.Xb[plane] = null;
							a.bytes_gb[plane] = null;
							ud.M[plane] = null;
							++plane;
						} else {
							o.h[plane] = null;
							u.bytes_kb[plane] = null;
							ta.Xb[plane] = null;
							a.bytes_gb[plane] = null;
							ud.M[plane] = null;
							++plane;
						}
					} else {
						y2 = 1;
						if (y2 < 103) {
							do {
								x2 = 1;
								if (x2 >= 103) {
									++y2;
								} else {
									do {
										class_ua.d(plane, x2, y2, qb.a((byte) -123, x2, plane, y2));
										++x2;
									} while (x2 < 103);

									++y2;
								}
							} while (y2 < 103);

							o.h[plane] = null;
							u.bytes_kb[plane] = null;
							ta.Xb[plane] = null;
							a.bytes_gb[plane] = null;
							ud.M[plane] = null;
							++plane;
						} else {
							o.h[plane] = null;
							u.bytes_kb[plane] = null;
							ta.Xb[plane] = null;
							a.bytes_gb[plane] = null;
							ud.M[plane] = null;
							++plane;
						}
					}
				} while (plane < 4);

				class_ua.g(-50, -10, -50);
				int x3 = 0;
				if (x3 < 104) {
					do {
						int y = 0;
						if (y >= 104) {
							++x3;
						} else {
							do {
								if ((2 & d.bytes_j[1][x3][y]) == 2) {
									class_ua.a(x3, y);
								}

								++y;
							} while (y < 104);

							++x3;
						}
					} while (x3 < 104);
				}

				int i = 1;
				int i1 = 4;
				int i2 = 2;
				int plane2 = 0;
				if (plane2 < 4) {
					do {
						if (plane2 > 0) {
							i2 <<= 3;
							i1 <<= 3;
							i <<= 3;
						}

						int plane3 = 0;
						if (plane3 > plane2) {
							++plane2;
						} else {
							do {
								y2 = 0;
								if (y2 > 104) {
									++plane3;
								} else {
									do {
										x2 = 0;
										if (x2 > 104) {
											++y2;
										} else {
											do {
												if ((i & af.ints_c[plane3][x2][y2]) != 0) {
													int y3 = y2;
													while (y3 > 0 && (af.ints_c[plane3][x2][y3 - 1] & i) != 0) {
														--y3;
													}

													int y4 = y2;
													while (y4 < 104 && (af.ints_c[plane3][x2][y4 + 1] & i) != 0) {
														++y4;
													}

													label1635:
													{
														var16 = plane3;
														var15 = plane3;
														if (plane3 <= 0) {
															if (plane3 >= plane2) {
																break label1635;
															}
														} else {
															label579:
															while (true) {
																int y5 = y3;
																if (~y3 >= ~y4) {
																	do {
																		if (~(af.ints_c[var15 - 1][x2][y5] & i) == -1) {
																			if (dummy == 0) {
																				if (plane3 >= plane2) {
																					break label1635;
																				}
																				break label579;
																			}

																			++y5;
																		} else {
																			++y5;
																		}
																	} while (~y5 >= ~y4);
																}

																--var15;
																if (var15 <= 0) {
																	if (plane3 >= plane2) {
																		break label1635;
																	}
																	break;
																}
															}
														}

														label551:
														do {
															int y5 = y3;
															if (y4 < y3) {
																++var16;
															} else {
																do {
																	if ((i & af.ints_c[1 + var16][x2][y5]) == 0) {
																		break label551;
																	}

																	++y5;
																} while (y4 >= y5);

																++var16;
															}
														} while (var16 < plane2);
													}

													var17 = (1 + var16 + -var15) * (1 + -y3 + y4);
													if (var17 >= 8) {
														var47 = 240;
														var19 = -var47 + tb.Yb[var16][x2][y3];
														var20 = tb.Yb[var15][x2][y3];
														ua.b(plane2, 1, x2 * 128, x2 * 128, 128 * y3, 128 + y4 * 128, var19, var20);
														var21 = var15;
														if (dummy != 0 || ~var15 >= ~var16) {
															do {
																var22 = y3;
																if (dummy == 0 && y4 < y3) {
																	++var21;
																} else {
																	do {
																		af.ints_c[var21][x2][var22] = od
																				.a(af.ints_c[var21][x2][var22], ~i);
																		++var22;
																	} while (y4 >= var22);

																	++var21;
																}
															} while (~var21 >= ~var16);
														}
													}
												}

												if ((af.ints_c[plane3][x2][y2] & i2) != 0) {
													var13 = x2;
													if (dummy != 0) {
														var13 = x2 - 1;
													}

													while (var13 > 0 && (af.ints_c[plane3][var13 + -1][y2] & i2) != 0) {
														--var13;
													}

													var14 = x2;
													var15 = plane3;
													if (dummy != 0) {
														var14 = x2 + 1;
													}

													while (var14 < 104 && ~(i2 & af.ints_c[plane3][1 + var14][y2]) != -1) {
														++var14;
													}

													label1638:
													{
														var16 = plane3;
														if (dummy == 0 && plane3 <= 0) {
															if (dummy == 0 && plane3 >= plane2) {
																break label1638;
															}
														} else {
															label477:
															while (true) {
																var17 = var13;
																if (dummy != 0 || var14 >= var13) {
																	do {
																		if (~(i2 & af.ints_c[-1 + var15][var17][y2]) == -1) {
																			if (dummy == 0) {
																				if (plane3 >= plane2) {
																					break label1638;
																				}
																				break label477;
																			}

																			++var17;
																		} else {
																			++var17;
																		}
																	} while (var14 >= var17);
																}

																--var15;
																if (var15 <= 0) {
																	if (dummy == 0 && plane3 >= plane2) {
																		break label1638;
																	}
																	break;
																}
															}
														}

														label449:
														do {
															var17 = var13;
															if (dummy == 0 && ~var13 < ~var14) {
																++var16;
															} else {
																do {
																	if (~(i2 & af.ints_c[var16 - -1][var17][y2]) == -1 && dummy == 0) {
																		break label449;
																	}

																	++var17;
																} while (~var17 >= ~var14);

																++var16;
															}
														} while (var16 < plane2);
													}

													var17 = (1 + var14 - var13) * (var16 - -1 - var15);
													if (var17 >= 8) {
														var47 = 240;
														var20 = tb.Yb[var15][var13][y2];
														var19 = -var47 + tb.Yb[var16][var13][y2];
														ua.b(plane2, 2, 128 * var13, 128 + var14 * 128, 128 * y2, y2 * 128, var19, var20);
														var21 = var15;
														if (dummy != 0 || var15 <= var16) {
															do {
																var22 = var13;
																if (dummy == 0 && ~var13 < ~var14) {
																	++var21;
																} else {
																	do {
																		af.ints_c[var21][var22][y2] = od
																				.a(af.ints_c[var21][var22][y2], ~i2);
																		++var22;
																	} while (~var22 >= ~var14);

																	++var21;
																}
															} while (var21 <= var16);
														}
													}
												}

												if ((af.ints_c[plane3][x2][y2] & i1) != 0) {
													var14 = x2;
													var13 = x2;
													var16 = y2;
													var15 = y2;
													label397:
													while (true) {
														if (var16 < 104) {
															if ((af.ints_c[plane3][x2][1 + var16] & i1) != 0) {
																++var16;
																continue;
															}
														}

														while (true) {
															label382:
															{
																if (~var15 < -1) {
																	if ((i1 & af.ints_c[plane3][x2][var15 + -1]) != 0) {
																		--var15;
																		continue;
																	}

																	if (dummy == 0 && ~x2 >= -1) {
																		if (dummy == 0 && ~x2 <= -105) {
																			break label397;
																		}
																		break label382;
																	}
																} else if (~x2 >= -1) {
																	if (dummy == 0 && ~x2 <= -105) {
																		break label397;
																	}
																	break label382;
																}

																label378:
																while (true) {
																	var17 = var15;
																	if (dummy != 0 || ~var15 >= ~var16) {
																		do {
																			if (~(i1 & af.ints_c[plane3][var13 + -1][var17]) == -1) {
																				if (dummy == 0) {
																					if (~x2 <= -105) {
																						break label397;
																					}
																					break label378;
																				}

																				++var17;
																			} else {
																				++var17;
																			}
																		} while (~var17 >= ~var16);
																	}

																	--var13;
																	if (~var13 >= -1) {
																		if (dummy == 0 && ~x2 <= -105) {
																			break label397;
																		}
																		break;
																	}
																}
															}

															while (true) {
																var17 = var15;
																if (dummy == 0 && ~var16 > ~var15) {
																	++var14;
																} else {
																	while (true) {
																		if (~(af.ints_c[plane3][var14 + 1][var17] & i1) == -1 && dummy == 0) {
																			break label397;
																		}

																		++var17;
																		if (~var16 > ~var17) {
																			++var14;
																			break;
																		}
																	}
																}

																if (~var14 <= -105) {
																	break label397;
																}
															}
														}
													}

													if (~((1 + (var14 - var13)) * (1 + -var15 + var16)) <= -5) {
														var17 = tb.Yb[plane3][var13][var15];
														ua.b(plane2, 4, 128 * var13, 128 + 128 * var14, var15 * 128, 128 * var16 + 128, var17, var17);
														var18 = var13;
														if (dummy != 0 || ~var14 <= ~var13) {
															do {
																var19 = var15;
																if (dummy == 0 && ~var15 < ~var16) {
																	++var18;
																} else {
																	do {
																		af.ints_c[plane3][var18][var19] = od
																				.a(af.ints_c[plane3][var18][var19], ~i1);
																		++var19;
																	} while (~var19 >= ~var16);

																	++var18;
																}
															} while (~var14 <= ~var18);
														}
													}
												}

												++x2;
											} while (x2 <= 104);

											++y2;
										}
									} while (y2 <= 104);

									++plane3;
								}
							} while (~plane3 >= ~plane2);

							++plane2;
						}
					} while (plane2 < 4);

				}
			}
		} catch (RuntimeException var43) {
			throw id.a(var43, "pa.E(" + (class_ua != null ? "{...}" : "null") + ',' + unused + ',' + (ncs != null ? "{...}" : "null") + ')');
		}
	}

	static void b (int var0) {
		try {
			try {
				Graphics graphics = rd.canvas.getGraphics();
				se.q.a(0, 4, 4, graphics);
				if (var0 >= -82) {
					a(null, -27);
				}
			} catch (Exception var2) {
				rd.canvas.repaint();
			}

			++int_j;
		} catch (RuntimeException var3) {
			throw id.a(var3, "pa.D(" + var0 + ')');
		}
	}

	static synchronized long c (int unused) {
		try {
			long timeMillis = System.currentTimeMillis();
			if (~timeMillis > ~we.n) {
				ib.long_h += -timeMillis + we.n;
			}

			++k;
			we.n = timeMillis;
			return ib.long_h + timeMillis;
		} catch (RuntimeException var3) {
			throw id.a(var3, "pa.F(" + unused + ')');
		}
	}

	public static void a (byte var0) {
		try {
			m = null;
			if (var0 == -104) {
				rd_e = null;
				l = null;
				rd_a = null;
				rd_f = null;
				g = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "pa.B(" + var0 + ')');
		}
	}

	static int a (int var0, int var1, int var2) {
		try {
			++b;
			ud var3 = (ud) ud.P.a(~var2, (long) var1);
			return var3 == null ? -1 : (var0 >= var2 && ~var0 > ~var3.L.length ? var3.L[var0] : -1);
		} catch (RuntimeException var4) {
			throw id.a(var4, "pa.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a (pb archiveFile2, int unused) {
		try {
			pe.archiveFile2 = archiveFile2;
			++int_o;
		} catch (RuntimeException var3) {
			throw id.a(var3, "pa.G(" + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
}
