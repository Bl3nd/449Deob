import java.awt.Graphics;

final class ub extends je {
	static int z;
	static int A = 0;
	static rd B;
	static int C;
	static int D = 0;
	static rd E;
	static int F;
	static int G;
	static int H;
	static int privateChatStatus;
	static int L;
	static int M;
	static rd mapedge;
	private static rd J = md.a((String) "skill)2", (byte) 114);

	static {
		E = J;
		L = 0;
		privateChatStatus = 0;
		B = md.a("Bitte warten Sie)3)3)3", (byte) 118);
		mapedge = md.a("mapedge", (byte) 116);
	}

	int I;

	public ub () {
	}

	ub (int var1) {
		try {
			this.I = var1;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ub.<init>(" + var1 + ')');
		}
	}

	public static void e (int var0) {
		try {
			J = null;
			mapedge = null;
			if (var0 == 5) {
				E = null;
				B = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ub.E(" + var0 + ')');
		}
	}

	static void f (int unused) {//todo
		int dummy = client.int_tb;
		try {
			++F;
			if (kd.b(1)) {
				do {
					if (sa.zb != -1 && se.o == sa.zb) {
						if (af.int_i == 85 && kd.C.b(-29348) > 0) {
							kd.C = kd.C.b(kd.C.b(-29348) - 1, 199 + -23944, 0);
						}

						if (!nd.b(dd.z, 199 + -81) && dd.z != 32 || ~kd.C.b(199 ^ -29285) <= -13) {
							continue;
						}

						kd.C = kd.C.d(dd.z, -97);
						if (dummy == 0) {
							continue;
						}
					}

					int var1;
					if (!ad.boolean_v) {
						if (~wb.int_db == -2) {
							if (af.int_i == 85 && kd.x.b(-29348) > 0) {
								kd.x = kd.x.b(kd.x.b(-29348) - 1, 199 + -23944, 0);
								w.h = true;
							}

							if (e.a(true, dd.z) && ~kd.x.b(-29348) > -11) {
								kd.x = kd.x.d(dd.z, -101);
								w.h = true;
							}

							if (af.int_i != 84) {
								continue;
							}

							if (~kd.x.b(-29348) < -1) {
								++ad.z;
								var1 = 0;
								if (kd.x.b(true)) {
									var1 = kd.x.h(122);
								}

								ie.writeStream.writeOpcode(8, 60);
								ie.writeStream.writeInt(-7155, var1);
							}

							w.h = true;
							wb.int_db = 0;
							if (dummy == 0) {
								continue;
							}
						}

						if (~wb.int_db != -3) {
							if (~wb.int_db != -4) {
								if (wb.int_db == 4) {
									if (~af.int_i == -86 && kd.x.b(-29348) > 0) {
										kd.x = kd.x.b(kd.x.b(-29348) - 1, 199 + -23944, 0);
										w.h = true;
									}

									if ((ka.b(199 ^ 236, dd.z) || ~dd.z == -33) && ~kd.x.b(-29348) > -81) {
										kd.x = kd.x.d(dd.z, -98);
										w.h = true;
									}

									if (~af.int_i != -85) {
										continue;
									}

									if (~kd.x.b(-29348) < -1) {
										++wd.z;
										ie.writeStream.writeOpcode(199 ^ 207, 10);
										ie.writeStream.writeByte((byte) -88, kd.x.b(-29348) - -1);
										ie.writeStream.a(-6595, kd.x);
									}

									w.h = true;
									wb.int_db = 0;
									if (dummy == 0) {
										continue;
									}
								}

								if (ta.Sb != -1 || ~ee.int_h != 0) {
									continue;
								}

								if (af.int_i == 85 && kd.D.b(-29348) > 0) {
									kd.D = kd.D.b(kd.D.b(-29348) - 1, -23745, 0);
									w.h = true;
								}

								if (ka.b(48, dd.z) && ~kd.D.b(-29348) > -81) {
									kd.D = kd.D.d(dd.z, -107);
									w.h = true;
								}

								if (~af.int_i != -85 || kd.D.b(199 ^ -29285) <= 0) {
									continue;
								}

								if (ib.int_l == 2) {
									if (kd.D.a(sa.Bb, false)) {
										System.gc();
									}

									if (kd.D.a(cf.clientdrop, false)) {
										n.g(32129);
									}

									if (kd.D.a(uc.uc, false)) {
										t.g = true;
									}

									if (kd.D.a(ha.rd_db, false)) {
										t.g = false;
									}

									if (kd.D.a(mb.p, false)) {
										var1 = 0;
										if (dummy != 0 || var1 < 4) {
											do {
												int var2 = 1;
												if (dummy == 0 && var2 >= 103) {
													++var1;
												} else {
													do {
														int var3 = 1;
														if (dummy == 0 && ~var3 <= -104) {
															++var2;
														} else {
															do {
																nd.xd[var1].adjacency[var2][var3] = 0;
																++var3;
															} while (~var3 > -104);

															++var2;
														}
													} while (var2 < 103);

													++var1;
												}
											} while (var1 < 4);
										}
									}

									if (kd.D.a(rd.cb, false) && i.modeWhere_F == 2) {
										throw new RuntimeException();
									}

									if (kd.D.a(bf.qa_op_test, false)) {
										a.boolean_jb = true;
									}
								}

								label318:
								{
									if (!kd.D.b(27, fb.doubleColon)) {
										byte var7;
										rd var8;
										byte var9;
										label405:
										{
											var9 = 0;
											++pc.int_r;
											var7 = 0;
											var8 = kd.D.l(-34);
											if (var8.b(27, ba.rd_m)) {
												var7 = 0;
												kd.D = kd.D.a(false, ba.rd_m.b(-29348));
												if (dummy == 0) {
													break label405;
												}
											}

											if (var8.b(199 ^ 220, uc.vc)) {
												var7 = 1;
												kd.D = kd.D.a(false, uc.vc.b(-29348));
												if (dummy == 0) {
													break label405;
												}
											}

											if (!var8.b(27, ab.rd_l)) {
												if (!var8.b(27, jb.X)) {
													if (var8.b(27, vc.H)) {
														var7 = 4;
														kd.D = kd.D.a(false, vc.H.b(-29348));
														if (dummy == 0) {
															break label405;
														}
													}

													if (!var8.b(27, nc.x)) {
														if (!var8.b(27, jb.I)) {
															if (var8.b(199 + -172, sb.rd_u)) {
																kd.D = kd.D.a(false, sb.rd_u.b(199 ^ -29285));
																var7 = 7;
																if (dummy == 0) {
																	break label405;
																}
															}

															if (!var8.b(27, qe.z)) {
																if (!var8.b(27, pa.l)) {
																	if (var8.b(199 + -172, hb.rd_m)) {
																		kd.D = kd.D.a(false, hb.rd_m.b(-29348));
																		var7 = 10;
																		if (dummy == 0) {
																			break label405;
																		}
																	}

																	if (!var8.b(199 + -172, s.bb)) {
																		break label405;
																	}

																	kd.D = kd.D.a(false, s.bb.b(199 + -29547));
																	var7 = 11;
																	if (dummy == 0) {
																		break label405;
																	}
																}

																kd.D = kd.D.a(false, pa.l.b(199 ^ -29285));
																var7 = 9;
																if (dummy == 0) {
																	break label405;
																}
															}

															var7 = 8;
															kd.D = kd.D.a(false, qe.z.b(-29348));
															if (dummy == 0) {
																break label405;
															}
														}

														kd.D = kd.D.a(false, jb.I.b(199 ^ -29285));
														var7 = 6;
														if (dummy == 0) {
															break label405;
														}
													}

													kd.D = kd.D.a(false, nc.x.b(199 + -29547));
													var7 = 5;
													if (dummy == 0) {
														break label405;
													}
												}

												kd.D = kd.D.a(false, jb.X.b(199 + -29547));
												var7 = 3;
												if (dummy == 0) {
													break label405;
												}
											}

											var7 = 2;
											kd.D = kd.D.a(false, ab.rd_l.b(-29348));
										}

										label272:
										{
											var8 = kd.D.l(-34);
											if (!var8.b(199 ^ 220, nd.td)) {
												if (var8.b(27, je.rd_s)) {
													var9 = 2;
													kd.D = kd.D.a(false, je.rd_s.b(-29348));
													if (dummy == 0) {
														break label272;
													}
												}

												if (!var8.b(27, gf.rd_l)) {
													if (!var8.b(27, af.rd_a)) {
														if (!var8.b(27, l.i)) {
															break label272;
														}

														kd.D = kd.D.a(false, l.i.b(-29348));
														var9 = 5;
														if (dummy == 0) {
															break label272;
														}
													}

													var9 = 4;
													kd.D = kd.D.a(false, af.rd_a.b(-29348));
													if (dummy == 0) {
														break label272;
													}
												}

												kd.D = kd.D.a(false, gf.rd_l.b(-29348));
												var9 = 3;
												if (dummy == 0) {
													break label272;
												}
											}

											kd.D = kd.D.a(false, nd.td.b(unused + -29547));
											var9 = 1;
										}

										ie.writeStream.writeOpcode(8, 247);
										ie.writeStream.writeByte((byte) 107, 0);
										int var4 = ie.writeStream.pointer;
										ie.writeStream.writeByte((byte) 90, (int) var7);
										ie.writeStream.writeByte((byte) -127, (int) var9);
										af.a(kd.D, -65, ie.writeStream);
										ie.writeStream.i(-1, ie.writeStream.pointer - var4);
										if (bd.publicChatStatus != 2) {
											break label318;
										}

										db.L = true;
										++rd.g;
										bd.publicChatStatus = 3;
										ie.writeStream.writeOpcode(8, 4);
										ie.writeStream.writeByte((byte) -23, bd.publicChatStatus);
										ie.writeStream.writeByte((byte) -84, privateChatStatus);
										ie.writeStream.writeByte((byte) -52, pa.trade_competeStatus);
										if (dummy == 0) {
											break label318;
										}
									}

									++wd.u;
									ie.writeStream.writeOpcode(8, 199);
									ie.writeStream.writeByte((byte) 114, -1 + kd.D.b(199 + -29547));
									ie.writeStream.a(199 + -6794, kd.D.a(false, 2));
								}

								w.h = true;
								kd.D = kd.rd_v;
								if (dummy == 0) {
									continue;
								}
							}

							if (af.int_i == 85 && ~kd.x.b(199 ^ -29285) < -1) {
								kd.x = kd.x.b(-1 + kd.x.b(-29348), -23745, 0);
								w.h = true;
							}

							if (!ka.b(27, dd.z) || ~kd.x.b(-29348) <= -41) {
								continue;
							}

							kd.x = kd.x.d(dd.z, -121);
							w.h = true;
							if (dummy == 0) {
								continue;
							}
						}

						if (af.int_i == 85 && ~kd.x.b(-29348) < -1) {
							kd.x = kd.x.b(-1 + kd.x.b(199 ^ -29285), 199 ^ -23560, 0);
							w.h = true;
						}

						if ((nd.b(dd.z, 199 + -81) || dd.z == 32) && kd.x.b(199 ^ -29285) < 12) {
							kd.x = kd.x.d(dd.z, -103);
							w.h = true;
						}

						if (~af.int_i != -85) {
							continue;
						}

						if (kd.x.b(-29348) > 0) {
							++r.P;
							ie.writeStream.writeOpcode(8, 194);
							ie.writeStream.writeLong(kd.x.i(29486), 2);
						}

						w.h = true;
						wb.int_db = 0;
						if (dummy == 0) {
							continue;
						}
					}

					if (af.int_i == 85 && kd.E.b(199 ^ -29285) > 0) {
						kd.E = kd.E.b(-1 + kd.E.b(-29348), 199 ^ -23560, 0);
						w.h = true;
					}

					if (ka.b(58, dd.z) && ~kd.E.b(-29348) > -81) {
						kd.E = kd.E.d(dd.z, -108);
						w.h = true;
					}

					if (af.int_i == 84) {
						w.h = true;
						ad.boolean_v = false;
						long var10;
						if (hb.int_d == 1) {
							var10 = kd.E.i(199 + 29287);
							se.a(-122, var10);
						}

						if (~hb.int_d == -3 && u.int_eb > 0) {
							var10 = kd.E.i(29486);
							nd.a(var10, true);
						}

						if (hb.int_d == 3 && ~kd.E.b(-29348) < -1) {
							++h.int_a;
							ie.writeStream.writeOpcode(199 + -191, 32);
							ie.writeStream.writeByte((byte) 121, 0);
							var1 = ie.writeStream.pointer;
							ie.writeStream.writeLong(ff.long_e, 2);
							af.a(kd.E, 125, ie.writeStream);
							ie.writeStream.i(-1, ie.writeStream.pointer + -var1);
							if (privateChatStatus == 2) {
								privateChatStatus = 1;
								++rd.g;
								db.L = true;
								ie.writeStream.writeOpcode(8, 4);
								ie.writeStream.writeByte((byte) 120, bd.publicChatStatus);
								ie.writeStream.writeByte((byte) 113, privateChatStatus);
								ie.writeStream.writeByte((byte) 119, pa.trade_competeStatus);
							}
						}

						if (~hb.int_d == -5 && ~nc.p > -101) {
							var10 = kd.E.i(199 + 29287);
							jd.a((byte) -128, var10);
						}

						if (hb.int_d == 5 && nc.p > 0) {
							var10 = kd.E.i(29486);
							i.a(199 ^ 199, var10);
						}
					}
				} while (kd.b(1));

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "ub.C(" + unused + ')');
		}
	}

	static rd a (boolean flag, int i, int unused, byte unused2) {
		try {
			++z;
			int i1 = 1;
			int i2 = i / 10;
			while (i2 != 0) {
				i2 /= 10;
				++i1;
			}

			int i3 = i1;
			if (~i > -1 || flag) {
				i3 = i1 + 1;
			}

			byte[] data = new byte[i3];
			if (i >= 0) {
				if (flag) {
					data[0] = 43;
				}
			} else {
				data[0] = 45;
			}

			int i4 = 0;
			rd class_rd;
			if (i1 <= i4) {
				class_rd = new rd();
				class_rd.stringBuffer = data;
				class_rd.stringPointer = i3;
				return class_rd;
			} else {
				do {
					int i5 = i % 10;
					if (i5 < 0) {
						i5 = -i5;
					}

					if (i5 > 9) {
						i5 += 39;
					}

					data[-1 + -i4 + i3] = (byte) (48 + i5);
					i /= 10;
					++i4;
				} while (i1 > i4);

				class_rd = new rd();
				class_rd.stringBuffer = data;
				class_rd.stringPointer = i3;
				return class_rd;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ub.A(" + flag + ',' + i + ',' + unused + ',' + unused2 + ')');
		}
	}

	static void a (int privateChatStatus, int unused, int publicChatStatus, gb class_gb, int trade_competeStatus) {
		try {
			++H;
			bc.q.a(-1926);
			wb.kb.a(0, 0);
			class_gb.b(uc.publicChat2, 55, 28, 16777215, true);
			if (publicChatStatus == 0) {
				class_gb.b(db.on2, 55, 41, '\uff00', true);
			}

			if (publicChatStatus == 1) {
				class_gb.b(ee.friends2, 55, 41, 16776960, true);
			}

			if (publicChatStatus == 2) {
				class_gb.b(bd.off2, 55, 41, 16711680, true);
			}

			if (publicChatStatus == 3) {
				class_gb.b(wd.m, 55, 41, '\uffff', true);
			}

			class_gb.b(dd.privateChat2, 184, 28, 16777215, true);
			if (privateChatStatus == 0) {
				class_gb.b(db.on2, 184, 41, '\uff00', true);
			}

			if (~privateChatStatus == -2) {
				class_gb.b(ee.friends2, 184, 41, 16776960, true);
			}

			if (~privateChatStatus == -3) {
				class_gb.b(bd.off2, 184, 41, 16711680, true);
			}

			class_gb.b(q.trade_compete2, 324, 28, 16777215, true);
			if (trade_competeStatus == 0) {
				class_gb.b(db.on2, 324, 41, '\uff00', true);
			}

			if (trade_competeStatus == 1) {
				class_gb.b(ee.friends2, 324, 41, 16776960, true);
			}

			if (~trade_competeStatus == -3) {
				class_gb.b(bd.off2, 324, 41, 16711680, true);
			}

			class_gb.a(mb.reportAbuse2, 417, 17, 85, 25, 16777215, true, 1, 1, 0);

			try {
				Graphics graphics = rd.canvas.getGraphics();
				bc.q.a(0, 0, 453, graphics);
			} catch (Exception var6) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "ub.B(" + privateChatStatus + ',' + unused + ',' + publicChatStatus + ',' + (class_gb != null ? "{...}" : "null") + ',' + trade_competeStatus + ')');
		}
	}

	static bd a (int unused, int fileRequest) {
		try {
			++M;
			bd var2 = (bd) le.cb.a((byte) -100, (long) fileRequest);
			if (var2 != null) {
				return var2;
			} else {
				byte[] buffer = te.archiveFile2.a(6, fileRequest, (byte) 66);
				var2 = new bd();
				var2.int_ab = fileRequest;
				if (buffer != null) {
					var2.initialize(126, new id(buffer));
				}

				var2.c((byte) -109);
				if (var2.Z) {
					var2.impenetrable = false;
					var2.boolean_ib = false;
				}

				le.cb.a(-84, var2, (long) fileRequest);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ub.D(" + unused + ',' + fileRequest + ')');
		}
	}
}
