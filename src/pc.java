import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class pc {
	static int int_a;
	static rd noResponseFromServer2;
	static int c;
	static int int_d = 0;
	static int g;
	static int h;
	static int int_j;
	static int k;
	static rd colon;
	static ua o;
	static int int_p;
	static int q;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_v;
	static int int_w;
	static oa x;
	static int z;
	static int A;
	static rd B;
	static boolean[] C;
	static int D;
	static rd rd_e = md.a((String) " )2>", (byte) 117);
	static rd fps_ = md.a((String) "Fps:", (byte) 119);
	static rd E;
	static int F;
	private static rd noResponseFromServer = md.a((String) "No response from server)3", (byte) 117);

	static {
		noResponseFromServer2 = noResponseFromServer;
		B = md.a("Zu viele Anmelde)2Versuche von Ihrer Adresse", (byte) 127);
		colon = md.a(":", (byte) 122);
		C = new boolean[112];
		E = md.a("Benutzen", (byte) 118);
	}

	private je je_l;
	private je[] jes_n;
	private long long_u;
	private int y;
	private int G = 0;
	private je H;

	pc (int size) {
		try {
			this.y = size;
			this.jes_n = new je[size];

			for (int index = 0 ; ~index > ~size ; ++index) {
				je var3 = this.jes_n[index] = new je();
				var3.je_a = var3;
				var3.je_f = var3;
			}

		} catch (RuntimeException var4) {
			throw id.a(var4, "pc.<init>(" + size + ')');
		}
	}

	static void a (int unused, uc writeStream, int unused2) {
		int dummy = client.int_tb;
		try {
			++int_w;

			while (true) {
				sd class_sd = (sd) ie.a.c((byte) 21);
				if (class_sd == null) {
					return;
				}

				boolean flag = false;
				int i = 0;
				for ( ; class_sd.F > i ; ++i) {
					if (class_sd.T[i] != null) {
						if (class_sd.T[i].f == 2) {
							class_sd.V[i] = -5;
						}

						if (class_sd.T[i].f == 0) {
							flag = true;
						}
					}

					if (class_sd.J[i] != null) {
						if (class_sd.J[i].f == 2) {
							class_sd.V[i] = -6;
						}

						if (class_sd.J[i].f == 0) {
							flag = true;
						}
					}
				}

				if (flag) {
					return;
				}

				writeStream.writeOpcode(8, 22);
				writeStream.writeByte((byte) -24, 0);
				int pointer = writeStream.pointer;
				writeStream.writeInt(-7155, class_sd.z);
				int var7 = 0;
				if (class_sd.F > var7) {
					do {
						label143:
						{
							if (~class_sd.V[var7] != -1) {
								writeStream.writeByte((byte) 104, class_sd.V[var7]);
								if (dummy == 0) {
									break label143;
								}
							}

							try {
								label211:
								{
									int var8;
									int var10;
									label207:
									{
										var8 = class_sd.R[var7];
										Field var9;
										if (var8 == 0) {
											var9 = (Field) class_sd.T[var7].c;
											var10 = var9.getInt(null);
											writeStream.writeByte((byte) 114, 0);
											writeStream.writeInt(-7155, var10);
											if (dummy == 0) {
												break label207;
											}
										}

										if (~var8 != -2) {
											if (~var8 != -3) {
												break label207;
											}

											var9 = (Field) class_sd.T[var7].c;
											var10 = var9.getModifiers();
											writeStream.writeByte((byte) -51, 0);
											writeStream.writeInt(-7155, var10);
											if (dummy == 0) {
												break label207;
											}
										}

										var9 = (Field) class_sd.T[var7].c;
										var9.setInt(null, class_sd.N[var7]);
										writeStream.writeByte((byte) -77, 0);
									}

									Method var28;
									if (~var8 != -4) {
										if (var8 != 4) {
											break label211;
										}

										var28 = (Method) class_sd.J[var7].c;
										var10 = var28.getModifiers();
										writeStream.writeByte((byte) 88, 0);
										writeStream.writeInt(-7155, var10);
										if (dummy == 0) {
											break label211;
										}
									}

									var28 = (Method) class_sd.J[var7].c;
									byte[][] var29 = class_sd.Z[var7];
									Object[] var11 = new Object[var29.length];
									int var12 = 0;
									if (dummy != 0 || ~var12 > ~var29.length) {
										do {
											ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(var29[var12]));
											var11[var12] = objectInputStream.readObject();
											++var12;
										} while (~var12 > ~var29.length);
									}

									Object var30 = var28.invoke(null, var11);
									if (var30 == null) {
										writeStream.writeByte((byte) 113, 0);
										if (dummy == 0) {
											break label211;
										}
									}

									if (var30 instanceof Number) {
										writeStream.writeByte((byte) 125, 1);
										writeStream.writeLong(((Number) var30).longValue(), 2);
										if (dummy == 0) {
											break label211;
										}
									}

									if (var30 instanceof rd) {
										writeStream.writeByte((byte) 93, 2);
										writeStream.a(-6595, (rd) var30);
										if (dummy == 0) {
											break label211;
										}
									}

									writeStream.writeByte((byte) 106, 4);
								}
							} catch (ClassNotFoundException var15) {
								writeStream.writeByte((byte) 112, -10);
							} catch (InvalidClassException var16) {
								writeStream.writeByte((byte) 110, -11);
							} catch (StreamCorruptedException var17) {
								writeStream.writeByte((byte) -29, -12);
							} catch (OptionalDataException var18) {
								writeStream.writeByte((byte) 89, -13);
							} catch (IllegalAccessException var19) {
								writeStream.writeByte((byte) 115, -14);
							} catch (IllegalArgumentException var20) {
								writeStream.writeByte((byte) -116, -15);
							} catch (InvocationTargetException var21) {
								writeStream.writeByte((byte) 124, -16);
							} catch (SecurityException var22) {
								writeStream.writeByte((byte) 109, -17);
							} catch (IOException var23) {
								writeStream.writeByte((byte) 103, -18);
							} catch (NullPointerException var24) {
								writeStream.writeByte((byte) -120, -19);
							} catch (Exception var25) {
								writeStream.writeByte((byte) -107, -20);
							} catch (Throwable var26) {
								writeStream.writeByte((byte) 95, -21);
							}
						}

						++var7;
					} while (class_sd.F > var7);

					writeStream.e((byte) -122, pointer);
					writeStream.i(-1, writeStream.pointer - pointer);
					class_sd.d(unused2 ^ -26671);
				} else {
					writeStream.e((byte) -122, pointer);
					writeStream.i(-1, writeStream.pointer - pointer);
					class_sd.d(unused2 ^ -26671);
				}
			}
		} catch (RuntimeException var27) {
			throw id.a(var27, "pc.E(" + unused + ',' + (writeStream != null ? "{...}" : "null") + ',' + unused2 + ')');
		}
	}

	static void a (int var0, f var1) {
		try {
			++int_v;
			if (ce.y == var1.Ib || ~var1.zc == 0 || ~var1.Gb != -1 || ~(var1.Ec - -1) < ~bd
					.a(var1.zc, false).Eb[var1.int_tb]) {
				int var2 = -var1.int_uc + var1.Ib;
				int var5 = 128 * var1.Eb + 64 * var1.int_kc;
				int var6 = 128 * var1.int_jc + var1.int_kc * 64;
				int var7 = var1.int_kc * 64 + var1.int_sb * 128;
				int var3 = -var1.int_uc + ce.y;
				var1.y_ = (var7 * var3 + var5 * (var2 - var3)) / var2;
				int var4 = var1.Zb * 128 + var1.int_kc * 64;
				var1.x_ = (var3 * var6 + (var2 + -var3) * var4) / var2;
			}

			if (var1.int_dc == 0) {
				var1.int_ac = 1024;
			}

			var1.Jb = 0;
			if (~var1.int_dc == -2) {
				var1.int_ac = 1536;
			}

			if (var1.int_dc == 2) {
				var1.int_ac = 0;
			}

			if (var1.int_dc == 3) {
				var1.int_ac = 512;
			}

			var1.Bb = var1.int_ac;
			if (var0 != 3031) {
				E = null;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "pc.C(" + var0 + ',' + "{...}" + ')');
		}
	}

	public static void b (byte var0) {
		try {
			if (var0 > 125) {
				x = null;
				noResponseFromServer = null;
				fps_ = null;
				o = null;
				colon = null;
				C = null;
				B = null;
				E = null;
				rd_e = null;
				noResponseFromServer2 = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "pc.H(" + var0 + ')');
		}
	}

	static boolean a (nd[] var0, int var1, int var2, int var3, int var4, int var5, byte var6, int var7, int var8,
					  int var9) {
		int var33 = client.int_tb;

		try {
			++F;
			ic.a(var8, var5, var7, var2);
			boolean var10 = true;
			if (var6 != 71) {
				a(-65, (f) null);
			}

			int var11 = 0;
			if (var33 == 0 && ~var11 <= ~var0.length) {
				return var10;
			} else {
				do {
					nd var12 = var0[var11];
					if (var12 != null && (~var3 == ~var12.Uc || ~var3 == 1412584498 && (be.nd_c == var12 || var33 != 0))) {
						label827:
						{
							if (var12.Sb > 0) {
								ka.a(var12, var6 ^ -29731);
							}

							int var14 = var5 + (var12.Hb - var9);
							int var13 = -var1 + var12.kb + var8;
							int var15 = var12.qc;
							int var19;
							int var20;
							int var21;
							int var22;
							if (var12 == be.nd_c) {
								label782:
								{
									if (~var3 != 1412584498 && !var12.Rb) {
										kd.F = var1;
										bf.nds_k = var0;
										b.int_cd = var9;
										if (var33 == 0) {
											break label827;
										}
									}

									nd var16 = t.a(var12, 104);
									if (var16 != null) {
										int[] var17 = pb.a(var16, 18168);
										int[] var18 = pb.a(var12, 18168);
										var20 = la.t + -la.v;
										if (!var12.Rb) {
											var15 = 128;
										}

										label822:
										{
											var19 = pb.H + -ja.int_d;
											if (~var19 >= ~var12.xc && -var12.xc <= var19 && var20 <= var12.xc && ~var20 <= ~(-var12.xc) && !ca.boolean_f) {
												var20 = 0;
												var19 = 0;
												if (var33 == 0) {
													break label822;
												}
											}

											if (~ub.C < ~var12.Ob || ca.boolean_f) {
												ca.boolean_f = true;
												if (var33 == 0) {
													break label822;
												}
											}

											var20 = 0;
											var19 = 0;
										}

										var22 = var20 + var18[1] + -var17[1];
										var21 = -var17[0] + var18[0] + var19;
										if (~var21 > -1) {
											var21 = 0;
										}

										if (~(var21 + var12.Bb) < ~var16.Bb) {
											var21 = var16.Bb + -var12.Bb;
										}

										if (~var22 > -1) {
											var22 = 0;
										}

										if (var12.Nb + var22 > var16.Nb) {
											var22 = var16.Nb - var12.Nb;
										}

										var14 = var17[1] + var22;
										var13 = var21 + var17[0];
										if (var33 == 0) {
											break label782;
										}
									}

									be.nd_c = null;
								}
							}

							if ((!var12.gb || var13 <= ic.Z && ~var14 >= ~ic.int_db && ~(var12.Bb + var13) <= ~ic.int_ab && (~(var12.Nb + var14) <= ~ic.int_bb || var33 != 0)) && (!var12.gb || !se
									.a(var12, true))) {
								label817:
								{
									if (~var12.tb == -1) {
										if (!var12.gb && se.a(var12, true) && !se.b(var4, var11, var6 ^ -69)) {
											break label817;
										}

										if (!var12.gb) {
											if (var12.int_ib > -var12.Nb + var12.mb) {
												var12.int_ib = -var12.Nb + var12.mb;
											}

											if (~var12.int_ib > -1) {
												var12.int_ib = 0;
											}
										}

										var10 &= a(var0, var12.Mb, var12.Nb + var14, var12.dc, var4, var14, (byte) 71, var12.Bb + var13, var13, var12.int_ib);
										if (var12.Ab != null) {
											var10 &= a(var12.Ab, var12.Mb, var14 + var12.Nb, var12.dc, var4, var14, (byte) 71, var12.Bb + var13, var13, var12.int_ib);
										}

										ic.a(var8, var5, var7, var2);
										if (~var12.Nb > ~var12.mb && !var12.gb) {
											ud.a(var12.int_ib, var13 - -var12.Bb, var12.mb, var12.Nb, (byte) 95, var14);
										}
									}

									if (var12.tb != 1) {
										label809:
										{
											int var23;
											int var26;
											int var35;
											int var36;
											int var37;
											if (var12.tb == 2) {
												var35 = 0;
												var36 = 0;
												if (var33 != 0 || var36 < var12.Nb) {
													do {
														var37 = 0;
														if (var33 == 0 && ~var12.Bb >= ~var37) {
															++var36;
														} else {
															do {
																var19 = var13 - -(var37 * (var12.int_hb + 32));
																var20 = var36 * (32 + var12.Vc) + var14;
																if (var35 < 20) {
																	var20 += var12.Hc[var35];
																	var19 += var12.xb[var35];
																}

																label694:
																{
																	if (~var12.ob[var35] < -1) {
																		boolean var45 = false;
																		boolean var46 = false;
																		var23 = var12.ob[var35] - 1;
																		if ((~(ic.int_ab + -32) <= ~var19 || ~var19 <= ~ic.Z || ~(ic.int_bb - 32) <= ~var20 || ~ic.int_db >= ~var20) && (bf.int_l == 0 || ~a.int_lb != ~var35)) {
																			break label694;
																		}

																		he var24;
																		label832:
																		{
																			if (~we.f != -2 || ~var35 != ~hc.tb || ~var12.dc != ~m.int_l) {
																				var24 = jb
																						.a(var23, var12.zc[var35], 1, 2, 3153952, false);
																				if (var33 == 0) {
																					break label832;
																				}
																			}

																			var24 = jb
																					.a(var23, var12.zc[var35], 2, 2, 0, false);
																		}

																		if (var24 != null) {
																			if (~bf.int_l == -1 || ~var35 != ~a.int_lb || l.O != var12.dc) {
																				if (wa.xb != 0 && ~var35 == ~ja.int_h && ~ta.Ob == ~var12.dc) {
																					var24.a(var19, var20, 128);
																					if (var33 == 0) {
																						break label694;
																					}
																				}

																				var24.a(var19, var20);
																				if (var33 == 0) {
																					break label694;
																				}
																			}

																			var22 = la.t - ha.int_pb;
																			var21 = -bf.int_g + pb.H;
																			if (var22 < 5 && ~var22 < 4) {
																				var22 = 0;
																			}

																			if (~var21 > -6 && var21 > -5) {
																				var21 = 0;
																			}

																			if (~n.qb > -6) {
																				var22 = 0;
																				var21 = 0;
																			}

																			var24.a(var21 + var19, var22 + var20, 128);
																			if (~var3 == 0) {
																				break label694;
																			}

																			nd var25 = var0[var3];
																			if (~ic.int_bb < ~(var20 - -var22) && ~var25.int_ib < -1) {
																				var26 = (-var20 + ic.int_bb - var22) * va.g / 3;
																				if (var26 > 10 * va.g) {
																					var26 = 10 * va.g;
																				}

																				if (var26 > var25.int_ib) {
																					var26 = var25.int_ib;
																				}

																				var25.int_ib -= var26;
																				ha.int_pb += var26;
																			}

																			if (~ic.int_db <= ~(var20 - (-var22 + -32)) || ~(-var25.Nb + var25.mb) >= ~var25.int_ib) {
																				break label694;
																			}

																			var26 = va.g * (-ic.int_db + 32 + (var20 - -var22)) / 3;
																			if (va.g * 10 < var26) {
																				var26 = va.g * 10;
																			}

																			if (var25.mb - (var25.Nb + var25.int_ib) < var26) {
																				var26 = var25.mb + -var25.Nb - var25.int_ib;
																			}

																			ha.int_pb -= var26;
																			var25.int_ib += var26;
																			if (var33 == 0) {
																				break label694;
																			}
																		}

																		var10 = false;
																		if (var33 == 0) {
																			break label694;
																		}
																	}

																	if (var12.Zc != null && var35 < 20) {
																		label635:
																		{
																			he var47 = var12.a(var35, 0);
																			if (var47 != null) {
																				var47.a(var19, var20);
																				if (var33 == 0) {
																					break label635;
																				}
																			}

																			if (nc.G) {
																				var10 = false;
																			}
																		}
																	}
																}

																++var35;
																++var37;
															} while (~var12.Bb < ~var37);

															++var36;
														}
													} while (var36 < var12.Nb);
												}

												if (var33 == 0) {
													break label809;
												}
											}

											if (var12.tb == 3) {
												label628:
												{
													if (p.a(var6 ^ -59, var12)) {
														var35 = var12.Wc;
														if (!se.b(var4, var11, -4) || var12.Cc == 0) {
															break label628;
														}

														var35 = var12.Cc;
														if (var33 == 0) {
															break label628;
														}
													}

													var35 = var12.Z;
													if (se.b(var4, var11, -4) && var12.Vb != 0) {
														var35 = var12.Vb;
													}
												}

												if (var15 != 0) {
													if (!var12.dd) {
														ic.b(var13, var14, var12.Bb, var12.Nb, var35, -(255 & var15) + 256);
														if (var33 == 0) {
															break label809;
														}
													}

													ic.a(var13, var14, var12.Bb, var12.Nb, var35, -(var15 & 255) + 256);
													if (var33 == 0) {
														break label809;
													}
												}

												if (!var12.dd) {
													ic.a(var13, var14, var12.Bb, var12.Nb, var35);
													if (var33 == 0) {
														break label809;
													}
												}

												ic.c(var13, var14, var12.Bb, var12.Nb, var35);
												if (var33 == 0) {
													break label809;
												}
											}

											gb var39;
											if (~var12.tb == -5) {
												var39 = var12.c((byte) 118);
												if (var39 == null) {
													if (!nc.G) {
														break label809;
													}

													var10 = false;
													if (var33 == 0) {
														break label809;
													}
												}

												rd var38;
												label616:
												{
													var38 = var12.rd_ub;
													if (p.a(-127, var12)) {
														var36 = var12.Wc;
														if (se.b(var4, var11, -4) && var12.Cc != 0) {
															var36 = var12.Cc;
														}

														if (var12.Lc.b(-29348) <= 0) {
															break label616;
														}

														var38 = var12.Lc;
														if (var33 == 0) {
															break label616;
														}
													}

													var36 = var12.Z;
													if (se.b(var4, var11, var6 ^ -69) && ~var12.Vb != -1) {
														var36 = var12.Vb;
													}
												}

												if (var12.gb && ~var12.Qc != 0) {
													hc var42 = u.a(var12.Qc, false);
													var38 = var42.Rb;
													if (var38 == null) {
														var38 = we.i;
													}

													if ((~var42.gb == -2 || ~var12.gc != -2) && ~var12.gc != 0) {
														var38 = a((byte) 126, new rd[]{
																var38,
																sb.rd_f,
																j.a(var12.gc, 3056)
														});
													}
												}

												if (var12.dc == ce.int_l && ~n.ob == ~var12.Yc) {
													var36 = var12.Z;
													var38 = je.rd_q;
												}

												if (~ic.width == -480) {
													if (~var36 == -16776961) {
														var36 = 255;
													}

													if (~var36 == -49153) {
														var36 = 16777215;
													}
												}

												var38 = wd.a(var38, var6 ^ -72, var12);
												var39.a(var38, var13, var14, var12.Bb, var12.Nb, var36, var12.Sc, var12.Rc, var12.rc, var12.bb);
												if (var33 == 0) {
													break label809;
												}
											}

											int var27;
											int var51;
											int var52;
											if (~var12.tb == -6) {
												he var40;
												if (var12.gb) {
													label596:
													{
														if (~var12.Qc == 0) {
															var40 = var12.b(117, false);
															if (var33 == 0) {
																break label596;
															}
														}

														var40 = jb.a(var12.Qc, var12.gc, var12.Tc, 2, var12.rd, false);
													}

													if (var40 == null) {
														if (!nc.G) {
															break label809;
														}

														var10 = false;
														if (var33 == 0) {
															break label809;
														}
													}

													var36 = var40.lb;
													var37 = var40.kb;
													if (var12.Db) {
														var20 = var13;
														int[] var43 = new int[4];
														ic.b(var43);
														if (var13 < var43[0]) {
															var20 = var43[0];
														}

														var21 = var14;
														if (var14 < var43[1]) {
															var21 = var43[1];
														}

														var22 = var13 + var12.Bb;
														if (var22 > var43[2]) {
															var22 = var43[2];
														}

														var23 = var12.Nb + var14;
														if (~var23 < ~var43[3]) {
															var23 = var43[3];
														}

														ic.a(var20, var21, var22, var23);
														var52 = (var12.Nb + var37 + -1) / var37;
														var51 = (-1 + var36 + var12.Bb) / var36;
														var26 = 0;
														if (var33 != 0 || ~var26 > ~var51) {
															do {
																var27 = 0;
																if (var33 == 0 && var27 >= var52) {
																	++var26;
																} else {
																	do {
																		label561:
																		{
																			if (~var12.int_bd == -1) {
																				if (~var15 != -1) {
																					var40.a(var13 - -(var36 * var26), var27 * var37 + var14, -(var15 & 255) + 256);
																					if (var33 == 0) {
																						break label561;
																					}
																				}

																				var40.a(var26 * var36 + var13, var27 * var37 + var14);
																				if (var33 == 0) {
																					break label561;
																				}
																			}

																			var40.d(var13 + var26 * var36 + var36 / 2, var37 / 2 + var14 + var27 * var37, var12.int_bd, 4096);
																		}

																		++var27;
																	} while (var27 < var52);

																	++var26;
																}
															} while (~var26 > ~var51);
														}

														ic.a(var43);
														if (var33 == 0) {
															break label809;
														}
													}

													var19 = 4096 * var12.Bb / var36;
													if (var12.int_bd != 0) {
														var40.d(var13 + var12.Bb / 2, var14 - -(var12.Nb / 2), var12.int_bd, var19);
														if (var33 == 0) {
															break label809;
														}
													}

													if (~var15 == -1) {
														if (~var12.Bb != ~var36 || var37 != var12.Nb) {
															var40.e(var13, var14, var12.Bb, var12.Nb);
															if (var33 == 0) {
																break label809;
															}
														}

														var40.a(var13, var14);
														if (var33 == 0) {
															break label809;
														}
													}

													var40.f(var13, var14, var12.Bb, var12.Nb, 256 + -(var15 & 255));
													if (var33 == 0) {
														break label809;
													}
												}

												var40 = var12.b(116, p.a(-118, var12));
												if (var40 == null) {
													if (!nc.G) {
														break label809;
													}

													var10 = false;
													if (var33 == 0) {
														break label809;
													}
												}

												var40.a(var13, var14);
												if (var33 == 0) {
													break label809;
												}
											}

											hc var50;
											if (var12.tb == 6) {
												boolean var41;
												label542:
												{
													var41 = p.a(-124, var12);
													if (var41) {
														var36 = var12.Tb;
														if (var33 == 0) {
															break label542;
														}
													}

													var36 = var12.rb;
												}

												ue var44 = null;
												var19 = 0;
												if (var12.Qc == -1) {
													if (var12.int_od != 5) {
														if (~var36 != 0) {
															e var49 = bd.a(var36, false);
															var44 = var12
																	.a(af.td_p.o_jd, var41, var12.Lb, var49, (byte) -17);
															if (var44 == null && nc.G) {
																var10 = false;
															}
														} else {
															var44 = var12.a(af.td_p.o_jd, var41, -1, null, (byte) -17);
															if (var44 == null && nc.G) {
																var10 = false;
															}
														}
													} else if (var12.int_kc != 0) {
														var44 = af.td_p.c((byte) -64);
													} else {
														var44 = s.ob.a(-1, (e) null, 0, -1, (e) null);
													}
												} else {
													var50 = u.a(var12.Qc, false);
													if (var50 != null) {
														label535:
														{
															var50 = var50.a(var12.gc, (byte) 35);
															var44 = var50.a(1, -93);
															if (var44 != null) {
																var44.d();
																var19 = var44.int_qb / 2;
																if (var33 == 0) {
																	break label535;
																}
															}

															var10 = false;
														}
													}
												}

												v.a(var13 - -(var12.Bb / 2), var12.Nb / 2 + var14);
												var20 = v.pb[var12.int_id] * var12.int_db >> 16;
												var21 = v.wb[var12.int_id] * var12.int_db >> 16;
												if (var44 != null) {
													label529:
													{
														if (var12.gb) {
															var44.d();
															if (var12.Qb) {
																var44.b(0, var12.int_sd, var12.int_sb, var12.int_id, var12.ed, var20 - (-var19 - var12.ac), var21 - -var12.ac, var12.int_db);
																if (var33 == 0) {
																	break label529;
																}
															}

															var44.a(0, var12.int_sd, var12.int_sb, var12.int_id, var12.ed, var20 - -var19 + var12.ac, var21 - -var12.ac);
															if (var33 == 0) {
																break label529;
															}
														}

														var44.a(0, var12.int_sd, 0, var12.int_id, 0, var20, var21);
													}
												}

												v.e();
												if (var33 == 0) {
													break label809;
												}
											}

											if (var12.tb == 7) {
												var39 = var12.c((byte) 116);
												if (var39 == null) {
													if (!nc.G) {
														break label809;
													}

													var10 = false;
													if (var33 == 0) {
														break label809;
													}
												}

												var36 = 0;
												var37 = 0;
												if (var33 != 0 || ~var12.Nb < ~var37) {
													do {
														var19 = 0;
														if (var33 == 0 && ~var12.Bb >= ~var19) {
															++var37;
														} else {
															do {
																if (~var12.ob[var36] < -1) {
																	label836:
																	{
																		var50 = u.a(var12.ob[var36] - 1, false);
																		rd var54 = var50.Rb;
																		if (var54 == null) {
																			var54 = we.i;
																		}

																		if (~var50.gb == -2 || var12.zc[var36] != 1) {
																			var54 = a((byte) 127, new rd[]{
																					var54,
																					sb.rd_f,
																					j.a(var12.zc[var36], 3056)
																			});
																		}

																		var22 = (115 + var12.int_hb) * var19 + var13;
																		var23 = (12 + var12.Vc) * var37 + var14;
																		if (~var12.Rc != -1) {
																			if (var12.Rc == 1) {
																				var39.b(var54, var22 + var12.Bb / 2, var23, var12.Z, var12.Sc);
																				if (var33 == 0) {
																					break label836;
																				}
																			}

																			var39.a(var54, -1 + (var22 - -var12.Bb), var23, var12.Z, var12.Sc);
																			if (var33 == 0) {
																				break label836;
																			}
																		}

																		var39.c(var54, var22, var23, var12.Z, var12.Sc);
																	}
																}

																++var36;
																++var19;
															} while (~var12.Bb < ~var19);

															++var37;
														}
													} while (~var12.Nb < ~var37);
												}
											}

											if (~var12.tb == -9 && gd.a(var11, var4, (byte) -125) && eb.int_f == sa.ib) {
												var35 = 0;
												gb var53 = ad.gb_a;
												rd var48 = var12.rd_ub;
												var48 = wd.a(var48, -1, var12);
												var36 = 0;
												rd var55;
												if (var33 != 0 || var48.b(-29348) > 0) {
													do {
														label469:
														{
															var21 = var48.a((byte) 126, jd.rd_s);
															if (var21 != -1) {
																var55 = var48.b(var21, var6 + -23816, 0);
																var48 = var48.a(false, var21 - -2);
																if (var33 == 0) {
																	break label469;
																}
															}

															var55 = var48;
															var48 = kd.rd_v;
														}

														var22 = var53.a(var55);
														var36 += 1 + var53.Fb;
														if (var35 < var22) {
															var35 = var22;
														}
													} while (var48.b(-29348) > 0);
												}

												var35 += 6;
												var21 = var13 - (-var12.Bb - -5) - var35;
												var22 = var12.Nb + var14 + 5;
												if (~(var13 + 5) < ~var21) {
													var21 = 5 + var13;
												}

												if (~(var21 + var35) < ~var7) {
													var21 = var7 - var35;
												}

												var36 += 7;
												if (~(var36 + var22) < ~var2) {
													var22 = var2 - var36;
												}

												ic.c(var21, var22, var35, var36, 16777120);
												ic.a(var21, var22, var35, var36, 0);
												var48 = var12.rd_ub;
												var23 = var22 - -var53.Fb + 2;
												var48 = wd.a(var48, -1, var12);
												if (var33 != 0 || ~var48.b(-29348) < -1) {
													do {
														label450:
														{
															var51 = var48.a((byte) 32, jd.rd_s);
															if (var51 != -1) {
																var55 = var48.b(var51, -23745, 0);
																var48 = var48.a(false, var51 - -2);
																if (var33 == 0) {
																	break label450;
																}
															}

															var55 = var48;
															var48 = kd.rd_v;
														}

														var53.c(var55, 3 + var21, var23, 0, false);
														var23 += 1 + var53.Fb;
													} while (~var48.b(-29348) < -1);
												}
											}

											if (var12.tb == 9) {
												label810:
												{
													if (~var12.sc == -2) {
														ic.b(var13, var14, var12.Bb + var13, var14 - -var12.Nb, var12.Z);
														if (var33 == 0) {
															break label810;
														}
													}

													var35 = var12.Bb >= 0 ? var12.Bb : -var12.Bb;
													var36 = var12.Nb < 0 ? -var12.Nb : var12.Nb;
													var37 = var35;
													if (var36 > var35) {
														var37 = var36;
													}

													if (var37 != 0) {
														label440:
														{
															var19 = (var12.Bb << 16) / var37;
															var20 = (var12.Nb << 16) / var37;
															if (var20 <= var19) {
																var19 = -var19;
																if (var33 == 0) {
																	break label440;
																}
															}

															var20 = -var20;
														}

														var21 = var12.sc * var20 >> 17;
														var22 = 1 + var12.sc * var20 >> 17;
														var23 = var12.sc * var19 >> 17;
														var51 = 1 + var19 * var12.sc >> 17;
														var27 = -var22 + var13 - -var12.Bb;
														var52 = var13 - -var21;
														var26 = var13 + -var22;
														int var28 = var13 - -var12.Bb - -var21;
														int var29 = var14 - -var23;
														int var30 = var14 + -var51;
														int var31 = -var51 + var12.Nb + var14;
														int var32 = var12.Nb + var14 + var23;
														v.a(var52, var26, var27);
														v.a(var29, var30, var31, var52, var26, var27, var12.Z);
														v.a(var52, var27, var28);
														v.a(var29, var31, var32, var52, var27, var28, var12.Z);
													}
												}
											}
										}
									}
								}
							}
						}
					}

					++var11;
				} while (~var11 > ~var0.length);

				return var10;
			}
		} catch (RuntimeException var34) {
			throw id.a(var34, "pc.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static void a (int unused, byte[] buffer) {
		try {
			++h;
			id class_id = new id(buffer);
			class_id.pointer = buffer.length - 2;
			sd.I = class_id.readUnsignedLEShort(255);
			ra.q = new int[sd.I];
			w.bytes_s = new byte[sd.I][];
			sd.bb = new int[sd.I];
			e.yb = new int[sd.I];
			w.ints_a = new int[sd.I];
			class_id.pointer = -(8 * sd.I) + -7 + buffer.length;
			ld.g = class_id.readUnsignedLEShort(255);
			a.mb = class_id.readUnsignedLEShort(255);
			int i = 1 + (255 & class_id.readUnsignedByte((byte) 116));
			int i1 = 0;
			if (sd.I > i1) {
				while (sd.I > i1) {
					e.yb[i1] = class_id.readUnsignedLEShort(255);
					++i1;
				}
			}

			for (int index = 0; index < sd.I; index++) {
				sd.bb[index] = class_id.readUnsignedLEShort(255);
			}

			int i2 = 0;
			if (sd.I > i2) {
				while (sd.I > i2) {
					ra.q[i2] = class_id.readUnsignedLEShort(255);
					++i2;
				}
			}

			for (int index = 0; index < sd.I; index++) {
				w.ints_a[index] = class_id.readUnsignedLEShort(255);
			}

			class_id.pointer = -((-1 + i) * 3) + (buffer.length + -7 - 8 * sd.I);
			eb.ints_g = new int[i];
			int var8 = 1;
			if (i > var8) {
				while (i > var8) {
					eb.ints_g[var8] = class_id.readMedInt((byte) -122);
					if (eb.ints_g[var8] == 0) {
						eb.ints_g[var8] = 1;
					}

					++var8;
				}
			}

			class_id.pointer = 0;
			int i3 = 0;
			if (i3 < sd.I) {
				do {
					int i4 = ra.q[i3];
					int i5 = w.ints_a[i3];
					int i6 = i5 * i4;
					byte[] bytes = new byte[i6];
					w.bytes_s[i3] = bytes;
					int i7 = class_id.readUnsignedByte((byte) 116);
					int i8;
					if (i7 != 0) {
						if (i7 == 1) {
							i8 = 0;
							if (i8 < i4) {
								do {
									int i9 = 0;
									if (i9 >= i5) {
										++i8;
									} else {
										do {
											bytes[i4 * i9 + i8] = class_id.readByte(true);
											++i9;
										} while (i9 < i5);

										++i8;
									}
								} while (i8 < i4);
							}
						}
					} else {
						i8 = 0;
						if (i6 > i8) {
							do {
								bytes[i8] = class_id.readByte(true);
								++i8;
							} while (i6 > i8);
						}
					}

					++i3;
				} while (~i3 > ~sd.I);

			}
		} catch (RuntimeException var18) {
			throw id.a(var18, "pc.B(" + unused + ',' + (buffer != null ? "{...}" : "null") + ')');
		}
	}

	static rd a (byte unused, rd[] rds) {
		try {
			++int_s;
			if (rds.length < 2) {
				throw new IllegalArgumentException();
			} else {
				return ie.a(rds, (byte) -14, rds.length, 0);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "pc.L(" + unused + ',' + "{...}" + ')');
		}
	}

	static void c (int var0) {
		int var12 = client.int_tb;

		try {
			++int_a;
			sa.vb = 0;
			int var1 = -1;
			int var15;
			if (var12 != 0 || ~var1 > ~(b.int_hd - -lc.q)) {
				do {
					Object var2;
					label358:
					{
						if (~var1 != 0) {
							if (b.int_hd > var1) {
								var2 = f.Lc[r.R[var1]];
								if (var12 == 0) {
									break label358;
								}
							}

							var2 = ta.Nb[ca.ints_b[-b.int_hd + var1]];
							if (var12 == 0) {
								break label358;
							}
						}

						var2 = af.td_p;
					}

					if (var2 != null && (((f) var2).d((byte) -126) || var12 != 0)) {
						label403:
						{
							tb var3;
							if (var2 instanceof b) {
								var3 = ((b) var2).tb_md;
								if (var3.Fb != null) {
									var3 = var3.f(-1);
								}

							}

							label386:
							{
								if (~b.int_hd < ~var1) {
									var15 = 30;
									td var4 = (td) var2;
									if (var4.fd != -1 || ~var4.xd != 0) {
										ce.a((f) var2, var0 + -1, 15 + ((f) var2).int_vc);
										if (~cf.int_h < 0) {
											if (var4.fd != -1) {
												cc.headicons_pk[var4.fd].a(-12 + cf.int_h, fb.int_o + -var15);
												var15 += 25;
											}

											if (~var4.xd != 0) {
												jd.headicons_prayer[var4.xd].a(cf.int_h + -12, -var15 + fb.int_o);
												var15 += 25;
											}
										}
									}

									if (~var1 > -1 || sb.int_a != 10 || ~r.R[var1] != ~qe.t) {
										break label386;
									}

									ce.a((f) var2, -1, 15 + ((f) var2).int_vc);
									if (cf.int_h <= -1) {
										break label386;
									}

									d.headicons_hint[1].a(-12 + cf.int_h, fb.int_o + -var15);
									if (var12 == 0) {
										break label386;
									}
								}

								var3 = ((b) var2).tb_md;
								if (var3.Fb != null) {
									var3 = var3.f(-1);
								}

								if (var3.Cb >= 0 && ~var3.Cb > ~jd.headicons_prayer.length) {
									ce.a((f) var2, -1, 15 + ((f) var2).int_vc);
									if (cf.int_h > -1) {
										jd.headicons_prayer[var3.Cb].a(-12 + cf.int_h, fb.int_o - 30);
									}
								}

								if (sb.int_a == 1 && ca.ints_b[-b.int_hd + var1] == hb.int_k && ~(ce.y % 20) > -11) {
									ce.a((f) var2, -1, ((f) var2).int_vc - -15);
									if (~cf.int_h < 0) {
										d.headicons_hint[0].a(cf.int_h - 12, -28 + fb.int_o);
									}
								}
							}

							if (((f) var2).Qb != null && (var1 >= b.int_hd || bd.publicChatStatus == 0 || ~bd.publicChatStatus == -4 || ~bd.publicChatStatus == -2 && db
									.a((byte) 32, ((td) var2).Gd))) {
								ce.a((f) var2, -1, ((f) var2).int_vc);
								if (~cf.int_h < 0 && ~sa.vb > ~bc.j) {
									bc.A[sa.vb] = client.Y.b(((f) var2).Qb) / 2;
									bc.ints_c[sa.vb] = client.Y.Fb;
									bc.r[sa.vb] = cf.int_h;
									bc.G[sa.vb] = fb.int_o;
									bc.v[sa.vb] = ((f) var2).Db;
									bc.e[sa.vb] = ((f) var2).Mb;
									bc.i[sa.vb] = ((f) var2).int_wc;
									bc.rds_a[sa.vb] = ((f) var2).Qb;
									++sa.vb;
								}
							}

							if (((f) var2).int_qc > ce.y) {
								ce.a((f) var2, -1, 15 + ((f) var2).int_vc);
								if (~cf.int_h < 0) {
									var15 = 30 * ((f) var2).int_hc / ((f) var2).Ob;
									if (var15 > 30) {
										var15 = 30;
									}

									ic.c(cf.int_h + -15, fb.int_o - 3, var15, 5, '\uff00');
									ic.c(var15 + (cf.int_h - 15), fb.int_o - 3, 30 - var15, 5, 16711680);
								}
							}

							var15 = 0;
							do {
								if (((f) var2).ints_pc[var15] > ce.y) {
									ce.a((f) var2, -1, ((f) var2).int_vc / 2);
									if (cf.int_h > -1) {
										if (var15 == 1) {
											fb.int_o -= 20;
										}

										if (var15 == 2) {
											cf.int_h -= 15;
											fb.int_o -= 10;
										}

										if (var15 == 3) {
											cf.int_h += 15;
											fb.int_o -= 10;
										}

										va.hitmarks[((f) var2).ints_mc[var15]].a(-12 + cf.int_h, fb.int_o - 12);
										e.Ib.c(bf.a(((f) var2).Tb[var15], -31766), cf.int_h, fb.int_o - -4, 0);
										e.Ib.c(bf.a(((f) var2).Tb[var15], -31766), cf.int_h + -1, fb.int_o - -3, 16777215);
									}
								}

								++var15;
							} while (var15 < 4);
						}
					}

					++var1;
				} while (~var1 > ~(b.int_hd - -lc.q));
			}

			int var14 = var0;
			if (var12 != 0 || ~var0 > ~sa.vb) {
				do {
					var15 = bc.r[var14];
					int var16 = bc.G[var14];
					int var5 = bc.A[var14];
					int var6 = bc.ints_c[var14];
					boolean var7 = true;
					int var8;
					if (var12 != 0) {
						var7 = false;
						var8 = 0;
						do {
							if (2 + var16 > -bc.ints_c[var8] + bc.G[var8] && var16 - var6 < bc.G[var8] + 2 && bc.r[var8] - -bc.A[var8] > var15 - var5 && ~(bc.r[var8] - bc.A[var8]) > ~(var5 + var15) && ~(-bc.ints_c[var8] + bc.G[var8]) > ~var16) {
								var16 = bc.G[var8] + -bc.ints_c[var8];
								var7 = true;
							}

							++var8;
						} while (var8 < var14);
					}

					while (var7) {
						var7 = false;
						var8 = 0;
						if (var12 != 0 || var8 < var14) {
							while (true) {
								if (2 + var16 > -bc.ints_c[var8] + bc.G[var8] && var16 - var6 < bc.G[var8] + 2 && bc.r[var8] - -bc.A[var8] > var15 - var5 && ~(bc.r[var8] - bc.A[var8]) > ~(var5 + var15) && ~(-bc.ints_c[var8] + bc.G[var8]) > ~var16) {
									var16 = bc.G[var8] + -bc.ints_c[var8];
									var7 = true;
								}

								++var8;
								if (var8 >= var14) {
									break;
								}
							}
						}
					}

					label393:
					{
						cf.int_h = bc.r[var14];
						fb.int_o = bc.G[var14] = var16;
						rd var17 = bc.rds_a[var14];
						if (~pb.O != -1) {
							client.Y.c(var17, cf.int_h, 1 + fb.int_o, 0);
							client.Y.c(var17, cf.int_h, fb.int_o, 16776960);
							if (var12 == 0) {
								break label393;
							}
						}

						int var9 = 16776960;
						if (~bc.v[var14] > -7) {
							var9 = a.ints_nb[bc.v[var14]];
						}

						if (~bc.v[var14] == -7) {
							var9 = qe.F % 20 < 10 ? 16711680 : 16776960;
						}

						if (bc.v[var14] == 7) {
							var9 = qe.F % 20 < 10 ? 255 : '\uffff';
						}

						if (bc.v[var14] == 8) {
							var9 = ~(qe.F % 20) <= -11 ? 8454016 : '뀀';
						}

						int var10;
						if (~bc.v[var14] == -10) {
							label240:
							{
								var10 = -bc.i[var14] + 150;
								if (var10 >= 50) {
									if (~var10 > -101) {
										var9 = 16384000 + -(var10 * 327680) + 16776960;
										if (var12 == 0) {
											break label240;
										}
									}

									if (~var10 <= -151) {
										break label240;
									}

									var9 = 'ﴌ' - -(5 * var10);
									if (var12 == 0) {
										break label240;
									}
								}

								var9 = 16711680 + 1280 * var10;
							}
						}

						if (~bc.v[var14] == -11) {
							label395:
							{
								var10 = 150 - bc.i[var14];
								if (~var10 > -51) {
									var9 = 16711680 + 5 * var10;
									if (var12 == 0) {
										break label395;
									}
								}

								if (var10 >= 100) {
									if (~var10 <= -151) {
										break label395;
									}

									var9 = 255 - (-(327680 * var10) - -32768000) + 500 + -(var10 * 5);
									if (var12 == 0) {
										break label395;
									}
								}

								var9 = -((-50 + var10) * 327680) + 16711935;
							}
						}

						if (bc.v[var14] == 11) {
							label217:
							{
								var10 = -bc.i[var14] + 150;
								if (var10 >= 50) {
									if (var10 >= 100) {
										if (~var10 <= -151) {
											break label217;
										}

										var9 = -(var10 * 327680) + 49545215;
										if (var12 == 0) {
											break label217;
										}
									}

									var9 = '\uff00' + 327685 * (-50 + var10);
									if (var12 == 0) {
										break label217;
									}
								}

								var9 = -(var10 * 327685) + 16777215;
							}
						}

						if (~bc.e[var14] == -1) {
							client.Y.c(var17, cf.int_h, 1 + fb.int_o, 0);
							client.Y.c(var17, cf.int_h, fb.int_o, var9);
						}

						if (bc.e[var14] == 1) {
							client.Y.a(var17, cf.int_h, fb.int_o - -1, 0, qe.F);
							client.Y.a(var17, cf.int_h, fb.int_o, var9, qe.F);
						}

						if (~bc.e[var14] == -3) {
							client.Y.b(var17, cf.int_h, 1 + fb.int_o, 0, qe.F);
							client.Y.b(var17, cf.int_h, fb.int_o, var9, qe.F);
						}

						if (~bc.e[var14] == -4) {
							client.Y.a(var17, cf.int_h, fb.int_o - -1, 0, qe.F, 150 - bc.i[var14]);
							client.Y.a(var17, cf.int_h, fb.int_o, var9, qe.F, -bc.i[var14] + 150);
						}

						int var11;
						if (~bc.e[var14] == -5) {
							var10 = client.Y.b(var17);
							var11 = (var10 + 100) * (150 - bc.i[var14]) / 150;
							ic.a(cf.int_h - 50, 0, 50 + cf.int_h, 334);
							client.Y.b(var17, 50 + cf.int_h + -var11, fb.int_o - -1, 0);
							client.Y.b(var17, cf.int_h + (50 - var11), fb.int_o, var9);
							ic.b();
						}

						if (~bc.e[var14] == -6) {
							label199:
							{
								var10 = 150 - bc.i[var14];
								ic.a(0, -1 + -client.Y.Fb + fb.int_o, 512, fb.int_o + 5);
								var11 = 0;
								if (~var10 <= -26) {
									if (~var10 >= -126) {
										break label199;
									}

									var11 = var10 - 125;
									if (var12 == 0) {
										break label199;
									}
								}

								var11 = -25 + var10;
							}

							client.Y.c(var17, cf.int_h, var11 + fb.int_o + 1, 0);
							client.Y.c(var17, cf.int_h, fb.int_o - -var11, var9);
							ic.b();
						}
					}

					++var14;
				} while (~var14 > ~sa.vb);

			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "pc.G(" + var0 + ')');
		}
	}

	final je a (byte var1) {
		try {
			++int_t;
			this.G = 0;
			return this.a(-1);
		} catch (RuntimeException var3) {
			throw id.a(var3, "pc.I(" + var1 + ')');
		}
	}

	final void a (byte unused, long fileRequest, je class_je) {
		try {
			++D;
			if (class_je.je_a != null) {
				class_je.d(-26669);
			}

			je class_je2 = this.jes_n[(int) ((long) (-1 + this.y) & fileRequest)];
			class_je.script = fileRequest;
			class_je.je_a = class_je2.je_a;
			class_je.je_f = class_je2;
			class_je.je_a.je_f = class_je;
			class_je.je_f.je_a = class_je;
		} catch (RuntimeException var6) {
			throw id.a(var6, "pc.F(" + unused + ',' + fileRequest + ',' + "{...}" + ')');
		}
	}

	final je a (int var1) {
		try {
			++z;
			je var2;
			if (this.G > 0 && this.H != this.jes_n[this.G - 1]) {
				var2 = this.H;
				this.H = var2.je_f;
				return var2;
			} else {
				while (this.y > this.G) {
					var2 = this.jes_n[this.G++].je_f;
					if (this.jes_n[-1 + this.G] != var2) {
						this.H = var2.je_f;
						return var2;
					}
				}

				return null;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "pc.D(" + var1 + ')');
		}
	}

	final je a (int unused, long fileRequest) {
		try {
			++q;
			this.long_u = fileRequest;
			je class_je = this.jes_n[(int) ((long) (-1 + this.y) & fileRequest)];
			for (this.je_l = class_je.je_f; this.je_l != class_je ; this.je_l = this.je_l.je_f) {
				if (this.je_l.script == fileRequest) {
					je class_je2 = this.je_l;
					this.je_l = this.je_l.je_f;
					return class_je2;
				}
			}

			this.je_l = null;
			return null;
		} catch (RuntimeException var6) {
			throw id.a(var6, "pc.J(" + unused + ',' + fileRequest + ')');
		}
	}

	final je b (int var1) {
		try {
			++c;
			if (this.je_l == null) {
				return null;
			} else {
				je var2 = this.jes_n[(int) (this.long_u & (long) (-1 + this.y))];
				if (var1 != 2) {
					C = null;
				}

				while (var2 != this.je_l) {
					if (this.je_l.script == this.long_u) {
						je var3 = this.je_l;
						this.je_l = this.je_l.je_f;
						return var3;
					}

					this.je_l = this.je_l.je_f;
				}

				this.je_l = null;
				return null;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pc.K(" + var1 + ')');
		}
	}
}
