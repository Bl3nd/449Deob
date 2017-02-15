import java.io.IOException;

final class ja {
	static fc fc_a;
	static int int_b;
	static int int_c;
	static int int_d = 0;
	static rd rd_e = md.a((String) ":chalreq:", (byte) 122);
	static int int_f;
	static rd rd_g;
	static int int_h = 0;
	static int int_i;
	static int int_j;
	static int int_k = 0;
	static rd rd_l;
	static rd rd_n = md.a((String) ":tradereq:", (byte) 124);
	static int[] ints_o;
	static ma ma_p;
	static jd jd_q;
	static rd underscore;
	private static rd rd_m = md
			.a((String) "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", (byte) 127);

	static {
		rd_g = rd_m;
		rd_l = md.a("Spieler kann nicht gefunden werden: ", (byte) 117);
		fc_a = new fc();
		underscore = md.a("_", (byte) 126);
	}

	static void a (byte unused, int i, byte[] data, boolean flag) {
		try {
			++int_j;
			if (p.z != null) {
				if (f.Ab >= 0) {
					p.z.silence((byte) -63);//Something to do with midi
					tc.I = 0;
					r.T = 20;
					jc.K = null;
					f.Ab = -1;
				}

				if (data != null) {
					if (r.T > 0) {
						p.z.a('\uffff', i);
						r.T = 0;
					}

					f.Ab = i;
					p.z.a(flag, i, (byte) -94, data);
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ja.B(" + unused + ',' + i + ',' + (data != null ? "{...}" : "null") + ',' + flag + ')');
		}
	}

	public static void a (int var0) {
		try {
			fc_a = null;
			rd_g = null;
			ma_p = null;
			rd_l = null;
			rd_n = null;
			jd_q = null;
			rd_e = null;
			ints_o = null;
			underscore = null;
			if (var0 != -14065) {
				ints_o = null;
			}

			rd_m = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ja.D(" + var0 + ')');
		}
	}

	static void a (byte unused) {
		try {
			nd.font = null;
			f.image = null;
			++int_c;
			ta.fontMetrics = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ja.A(" + unused + ')');
		}
	}

	static void a (int var0, int var1, int var2) {
		try {
			ie.writeStream.writeOpcode(8, 241);
			if (var1 < 42) {
				a((byte) -69);
			}

			ie.writeStream.writeLEShortA(-19962, var2);
			ie.writeStream.writeInt_V1(23538, var0);
			++int_b;
			++ta.int_vb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "ja.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void b (byte unused) {
		int dummy = client.int_tb;

		try {
			if (e.int_mb > 0) {
				--e.int_mb;
			}

			if (le.updateTime > 1) {
				--le.updateTime;
			}

			++int_f;
			if (j.Eb) {
				j.Eb = false;
				n.g(32129);
			} else {
				int var1 = 0;
				while (ib.a(false)) {
					++var1;
					if (var1 >= 100) {
						break;
					}
				}

				if (lc.currentGameState == 30 || lc.currentGameState == 35) {
					if (i.z && lc.currentGameState == 30) {
						client.int_qb = 0;
						s.zb = 0;

						while (kd.b(1)) {
						}

						int var2 = 0;
						while (~var2 > ~pc.C.length) {
							pc.C[var2] = false;
							++var2;
						}
					}

					pc.a(22, ie.writeStream, 2);
					/*if (unused >= -54) {
						b((byte) -88);
					}*/

					int var4;
					int var5;
					int var6;
					int var8;
					synchronized (h.df_s.object_b) {
						label1249:
						{
							if (od.Ab) {
								if (client.int_qb == 0 && h.df_s.int_s < 40) {
									break label1249;
								}

								++w.u;
								var5 = 0;
								ie.writeStream.writeOpcode(8, 212);
								ie.writeStream.writeByte((byte) 97, 0);
								var4 = ie.writeStream.pointer;
								var6 = 0;
								int var7;
								if (dummy != 0 || ~var6 > ~h.df_s.int_s) {
									while (~(ie.writeStream.pointer - var4) > -241) {
										label1225:
										{
											++var5;
											var7 = h.df_s.ints_m[var6];
											var8 = h.df_s.ints_q[var6];
											if (var7 >= 0) {
												if (~var7 >= -503) {
													break label1225;
												}

												var7 = 502;
												if (dummy == 0) {
													break label1225;
												}
											}

											var7 = 0;
										}

										if (var8 < 0) {
											var8 = 0;
										} else if (var8 > 764) {
											var8 = 764;
										}

										int var9 = 765 * var7 + var8;
										if (h.df_s.ints_m[var6] == -1 && h.df_s.ints_q[var6] == -1) {
											var8 = -1;
											var7 = -1;
											var9 = 524287;
										}

										if (~bd.int_pc == ~var8 && ~var7 == ~hf.Ib) {
											if (be.int_r < 2047) {
												++be.int_r;
											}
										} else {
											int var11 = -hf.Ib + var7;
											int var10 = var8 + -bd.int_pc;
											bd.int_pc = var8;
											hf.Ib = var7;
											if (be.int_r < 8 && var10 >= -32 && ~var10 >= -32 && ~var11 <= 31 && var11 <= 31) {
												var11 += 32;
												var10 += 32;
												ie.writeStream.writeShort((var10 << 6) + (be.int_r << 12) + var11, (byte) 89);
												be.int_r = 0;
											} else {
												if (be.int_r < 8) {
													ie.writeStream.writeMedium(-2016590992, 8388608 + (be.int_r << 19) - -var9);
													be.int_r = 0;
												} else {
													ie.writeStream.writeInt(-7155, -1073741824 - (-(be.int_r << 19) + -var9));
													be.int_r = 0;
												}
											}
										}

										++var6;
										if (~var6 <= ~h.df_s.int_s) {
											break;
										}
									}
								}

								ie.writeStream.i(-1, ie.writeStream.pointer + -var4);
								if (var5 >= h.df_s.int_s) {
									h.df_s.int_s = 0;
									if (dummy == 0) {
										break label1249;
									}
								}

								h.df_s.int_s -= var5;
								var7 = 0;
								if (dummy != 0 || var7 < h.df_s.int_s) {
									do {
										h.df_s.ints_q[var7] = h.df_s.ints_q[var7 + var5];
										h.df_s.ints_m[var7] = h.df_s.ints_m[var7 - -var5];
										++var7;
									} while (var7 < h.df_s.int_s);
								}

								if (dummy == 0) {
									break label1249;
								}
							}

							h.df_s.int_s = 0;
						}
					}


					if (client.int_qb != 0) {
						++ra.e;
						long var20 = (s.long_qb - id.F) / 50L;
						id.F = s.long_qb;
						if (~var20 < -4096L) {
							var20 = 4095L;
						}

						label1177:
						{
							var4 = sb.int_b;
							var5 = wb.nb;
							if (var5 >= 0) {
								if (~var5 >= -765) {
									break label1177;
								}

								var5 = 764;
								if (dummy == 0) {
									break label1177;
								}
							}

							var5 = 0;
						}

						label1170:
						{
							if (var4 < 0) {
								var4 = 0;
								if (dummy == 0) {
									break label1170;
								}
							}

							if (var4 > 502) {
								var4 = 502;
							}
						}

						var6 = var5 + var4 * 765;
						byte var25 = 0;
						if (client.int_qb == 2) {
							var25 = 1;
						}

						ie.writeStream.writeOpcode(8, 88);
						var8 = (int) var20;
						ie.writeStream.writeInt_V2((var25 << 19) + (var8 << 20) - -var6, -1762115368);
					}

					if (gd.int_q > 0) {
						--gd.int_q;
					}

					if (pc.C[96] || pc.C[97] || pc.C[98] || pc.C[99]) {
						pe.n = true;
					}

					if (pe.n && gd.int_q <= 0) {
						gd.int_q = 20;
						++fc.int_a;
						pe.n = false;
						ie.writeStream.writeOpcode(8, 81);
						ie.writeStream.writeLEShortA(-19962, o.w);
						ie.writeStream.writeLEShort(nb.m, (byte) 75);
					}

					if (se.r && !ha.boolean_cb) {
						++ta.int_rb;
						ha.boolean_cb = true;
						ie.writeStream.writeOpcode(8, 123);
						ie.writeStream.writeByte((byte) -21, 1);
					}

					if (!se.r && ha.boolean_cb) {
						++ta.int_rb;
						ha.boolean_cb = false;
						ie.writeStream.writeOpcode(8, 123);
						ie.writeStream.writeByte((byte) 125, 0);
					}

					rb.c(-1);
					if (lc.currentGameState == 30 || lc.currentGameState == 35) {
						ec.a(-124);
						ke.d((byte) -61);
						++nb.n;
						if (nb.n > 750) {
							n.g(32129);
						} else {
							cc.b((byte) -32);
							wd.a(-24281);
							p.e(4);
							++va.g;
							if (q.y != 0) {
								b.int_ed += 20;
								if (b.int_ed >= 400) {
									q.y = 0;
								}
							}

							if (wa.xb != 0) {
								++sa.rb;
								if (sa.rb >= 15) {
									if (wa.xb == 3) {
										w.h = true;
									}

									if (wa.xb == 2) {
										db.F = true;
									}

									wa.xb = 0;
								}
							}

							if (bf.int_l != 0) {
								++n.qb;
								if (pb.H > bf.int_g + 5 || bf.int_g - 5 > pb.H || 5 + ha.int_pb < la.t || la.t < ha.int_pb - 5) {
									qc.V = true;
								}

								if (s.zb == 0) {
									if (bf.int_l == 3) {
										w.h = true;
									}

									if (bf.int_l == 2) {
										db.F = true;
									}

									label1326:
									{
										bf.int_l = 0;
										if (!qc.V || n.qb < 5) {
											if (ad.int_t != 1 && !ad.a(-1 + id.rb, true) || id.rb <= 2) {
												if (~id.rb >= -1) {
													break label1326;
												}

												db.b(-1 + id.rb, -3);
												if (dummy == 0) {
													break label1326;
												}
											}

											qe.b(-109);
											if (dummy == 0) {
												break label1326;
											}
										}

										vc.z = -1;
										je.a(true);
										if (~vc.z == ~l.O && ~ce.int_k != ~a.int_lb) {
											++se.v;
											byte var3 = 0;
											nd var22 = bf.b('\uffff', l.O);
											if (ub.A == 1 && var22.Sb == 206) {
												var3 = 1;
											}

											if (~var22.ob[ce.int_k] >= -1) {
												var3 = 0;
											}

											label1303:
											{
												if (a.d(fc.a(var22, 1572721824), 1073340130)) {
													var4 = a.int_lb;
													var5 = ce.int_k;
													var22.ob[var5] = var22.ob[var4];
													var22.zc[var5] = var22.zc[var4];
													var22.ob[var4] = -1;
													var22.zc[var4] = 0;
													if (dummy == 0) {
														break label1303;
													}
												}

												if (var3 == 1) {
													var4 = a.int_lb;
													var5 = ce.int_k;
													if (dummy != 0 || ~var4 != ~var5) {
														do {
															if (~var5 > ~var4) {
																var22.a(var4 + -1, (byte) -119, var4);
																--var4;
																if (dummy == 0) {
																	continue;
																}
															}

															if (~var5 < ~var4) {
																var22.a(1 + var4, (byte) -93, var4);
																++var4;
															}
														} while (~var4 != ~var5);
													}

													if (dummy == 0) {
														break label1303;
													}
												}

												var22.a(ce.int_k, (byte) -97, a.int_lb);
											}

											ie.writeStream.writeOpcode(8, 209);
											ie.writeStream.writeInt_V1(23538, l.O);
											ie.writeStream.b((byte) 108, (int) var3);
											ie.writeStream.writeShortA((byte) 46, a.int_lb);
											ie.writeStream.writeShort(ce.int_k, (byte) 35);
										}
									}

									client.int_qb = 0;
									sa.rb = 10;
								}
							}

							byte var23 = 34;
							if (ee.int_h == -1) {
								if (sa.zb != -1) {
									bd.a(sa.zb, 4, 338, (byte) 123, var23, 4, 516);
								} else {
									if (kd.t != -1) {
										bd.a(kd.t, 4, 338, (byte) 105, var23, 4, 516);
									}
								}

								if (ta.Yb == -1) {
									if (ta.Zb[pd.g] != -1) {
										bd.a(ta.Zb[pd.g], 205, 466, (byte) 111, var23, 553, 743);
									}
								} else {
									bd.a(ta.Yb, 205, 466, (byte) 107, var23, 553, 743);
								}

								if (ta.Sb != -1) {
									bd.a(ta.Sb, 357, 453, (byte) 120, var23, 17, 496);
								} else {
									if (b.int_ld != -1) {
										bd.a(b.int_ld, 357, 453, (byte) 119, var23, 17, 496);
									}
								}
							} else {
								bd.a(ee.int_h, 0, 503, (byte) 111, var23, 0, 765);
								if (i.R != -1) {
									bd.a(i.R, 0, 503, (byte) 102, var23, 0, 765);
								}
							}

							label1063:
							{
								if (ee.int_h == -1) {
									label1052:
									{
										if (sa.zb != -1) {
											bd.a(sa.zb, 4, 338, (byte) 123, ~var23, 4, 516);
											if (dummy == 0) {
												break label1052;
											}
										}

										if (~kd.t != 0) {
											bd.a(kd.t, 4, 338, (byte) 109, ~var23, 4, 516);
										}
									}

									if (~ta.Yb == 0) {
										if (~ta.Zb[pd.g] != 0) {
											bd.a(ta.Zb[pd.g], 205, 466, (byte) 106, ~var23, 553, 743);
										}
									} else {
										bd.a(ta.Yb, 205, 466, (byte) 107, ~var23, 553, 743);
									}

									if (ta.Sb != -1) {
										bd.a(ta.Sb, 357, 453, (byte) 110, ~var23, 17, 496);
										if (dummy == 0) {
											break label1063;
										}
									}

									if (b.int_ld != -1) {
										bd.a(b.int_ld, 357, 453, (byte) 124, ~var23, 17, 496);
									}
								} else {
									bd.a(ee.int_h, 0, 503, (byte) 121, ~var23, 0, 765);
									if (~i.R != 0) {
										bd.a(i.R, 0, 503, (byte) 108, ~var23, 0, 765);
									}
								}
							}

							sa.d(true);
							int var21;
							if (~ua.o != 0) {
								int i = ua.o;
								int i1 = ua.r;
								boolean flag = bb.a(i, af.td_p.Hc[0], af.td_p.xc[0], 0, true, i1, 0, 0, -120, 0, 0, 0);
								if (flag) {
									ka.Rb = wb.nb;
									q.y = 1;
									int_k = sb.int_b;
									b.int_ed = 0;
								}

								ua.o = -1;
							}

							if (client.int_qb == 1 && id.eb != null) {
								w.h = true;
								client.int_qb = 0;
								id.eb = null;
							}

							ab.b(0);
							if (ee.int_h == -1) {
								hf.f(-33);
								we.c(502);
								af.b((byte) 36);
							}

							label1323:
							{
								if (te.Cb != -1 || ca.int_l != -1 || bf.int_m != -1) {
									if (sa.ib >= eb.int_f) {
										break label1323;
									}

									++sa.ib;
									if (eb.int_f != sa.ib) {
										break label1323;
									}

									if (ca.int_l != -1) {
										db.F = true;
									}

									if (~te.Cb == 0) {
										break label1323;
									}

									w.h = true;
									if (dummy == 0) {
										break label1323;
									}
								}

								if (~sa.ib < -1) {
									--sa.ib;
								}
							}

							if (s.zb == 1 || client.int_qb == 1) {
								++j.lb;
							}

							db.h(-94);
							if (bc.k) {
								rb.b(64);
							}

							var21 = 0;
							while (var21 < 5) {
								++df.ints_g[var21];
								++var21;
							}

							ub.f(199);
							var4 = nb.a((byte) 89);
							var5 = tc.e(2);
							if (var4 > 4500 && var5 > 4500) {
								++lc.e;
								e.int_mb = 250;
								p.a(-103, 4000);
								ie.writeStream.writeOpcode(8, 110);
							}

							++wb.mb;
							++ba.int_f;
							++ib.int_p;
							if (ib.int_p > 500) {
								var6 = (int) (Math.random() * 8.0D);
								if ((1 & var6) == 1) {
									ub.L += i.O;
								}

								if ((4 & var6) == 4) {
									nd.qd += wd.y;
								}

								if ((2 & var6) == 2) {
									gd.int_f += a.int_kb;
								}

								ib.int_p = 0;
							}

							if (ub.L < -50) {
								i.O = 2;
							}

							if (gd.int_f < -55) {
								a.int_kb = 2;
							}

							if (ba.int_f > 500) {
								ba.int_f = 0;
								var6 = (int) (8.0D * Math.random());
								if ((var6 & 2) == 2) {
									gf.int_j += af.int_o;
								}

								if ((var6 & 1) == 1) {
									ka.Kb += rb.m;
								}
							}

							if (ka.Kb < -60) {
								rb.m = 2;
							}

							if (nd.qd < -40) {
								wd.y = 1;
							}

							if (~nd.qd < -41) {
								wd.y = -1;
							}

							if (ka.Kb > 60) {
								rb.m = -2;
							}

							if (gd.int_f > 55) {
								a.int_kb = -2;
							}

							if (ub.L > 50) {
								i.O = -2;
							}

							if (gf.int_j < -20) {
								af.int_o = 1;
							}

							if (gf.int_j > 10) {
								af.int_o = -1;
							}

							if (wb.mb > 50) {
								ie.writeStream.writeOpcode(8, 249);
								++df.int_f;
							}

							try {
								if (cc.ff_k != null && ie.writeStream.pointer > 0) {
									cc.ff_k.writeToStream(false, ie.writeStream.pointer, 0, ie.writeStream.buffer);
									ie.writeStream.pointer = 0;
									wb.mb = 0;
								}
							} catch (IOException var16) {
								n.g(32129);
							}
						}
					}
				}
			}
		} catch (RuntimeException var18) {
			throw id.a(var18, "ja.E(" + unused + ')');
		}
	}
}
