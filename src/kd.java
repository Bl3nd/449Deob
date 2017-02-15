final class kd {
	static rd sorryInvitedPlayersOnly2;
	static int int_b;
	static int c;
	static rd rd_e = md.a((String) "Privater Chat", (byte) 120);
	static int[] ints_f;
	static rd g = md.a((String) "Die Verbindung konnte", (byte) 118);
	static rd mapback = md.a((String) "mapback", (byte) 122);
	static int[] i = new int[]{
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800,
			12800
	};
	static md j;
	static int k;
	static int int_l;
	static rd rd_m = md.a((String) "null", (byte) 119);
	static int n;
	static g o;
	static int p;
	static rd loadedWordpack2;
	static int int_s;
	static int t;
	static int[] ints_u;
	static rd rd_v;
	static int int_w;
	static rd x;
	static rd y;
	static rd z;
	static rd A;
	static int[] B;
	static rd C;
	static rd D;
	static rd E;
	static int F;
	private static rd loadedWordpack = md.a((String) "Loaded wordpack", (byte) 122);
	private static rd sorryInvitedPlayersOnly = md.a((String) "Sorry invited players only)3", (byte) 127);

	static {
		loadedWordpack2 = loadedWordpack;
		t = -1;
		ints_f = new int[500];
		sorryInvitedPlayersOnly2 = sorryInvitedPlayersOnly;
		j = new md();
		rd_v = md.a("", (byte) 119);
		D = rd_v;
		ints_u = new int[128];
		E = rd_v;
		B = new int[50];
		z = rd_v;
		y = rd_v;
		x = rd_v;
		C = rd_v;
		A = rd_v;
	}

	static void a (int unused) {
		int dummy = client.int_tb;
		try {
			++int_s;
			uc.a(13870, false);
			d.int_k = 0;
			boolean flag = true;
			for (int index = 0 ; be.bytes_i.length > index ; ++index) {
				if (ke.Qb[index] != -1 && be.bytes_i[index] == null) {
					be.bytes_i[index] = pb.cacheFile5.a(ke.Qb[index], 0, (byte) 66);
					if (be.bytes_i[index] == null) {
						++d.int_k;
						flag = false;
					}
				}

				if (ee.ints_f[index] != -1 && fc.bytes_q[index] == null) {
					fc.bytes_q[index] = pb.cacheFile5.a(0, ee.ints_f[index], 0, e.ints_ib[index]);
					if (fc.bytes_q[index] == null) {
						flag = false;
						++d.int_k;
					}
				}
			}

			if (!flag) {
				wa.rb = 1;
			} else {
				hc.kb = 0;
				flag = true;
				for (int index = 0 ; ~index > ~be.bytes_i.length ; ++index) {
					byte[] bytes = fc.bytes_q[index];
					if (bytes != null) {
						int i = -int_w + (l.U[index] >> 8) * 64;
						int i1 = -jc.X + (255 & l.U[index]) * 64;
						if (we.r) {
							i = 10;
							i1 = 10;
						}

						flag &= ec.a(-124, i, bytes, i1);
					}
				}

				if (!flag) {
					wa.rb = 2;
				} else {
					if (wa.rb != 0) {
						nd.a(0, cf.rd_n, true, sa.loading_PleaseWait2);
					}

					u.g(-1);
					pc.o.c();
					System.gc();

					for (int plane = 0 ; plane < 4 ; plane++) {
						nd.xd[plane].a(-3390);
					}

					for (int plane = 0 ; plane < 4 ; plane++) {
						for (int mapX = 0 ; mapX < 104 ; mapX++) {
							for (int mapY = 0 ; mapY < 104 ; mapY++) {
								d.bytes_j[plane][mapX][mapY] = 0;
							}
						}
					}
					int var1;
					td.g((byte) 64);
					int length = be.bytes_i.length;
					r.e(125);
					uc.a(13870, true);
					int var8;
					int var9;
					int var12;
					int var22;
					int var24;
					if (!we.r) {
						int i = 0;
						byte[] var10;
						if (length > i) {
							do {
								int x = 64 * (l.U[i] >> 8) + -int_w;
								int y = 64 * (255 & l.U[i]) + -jc.X;
								byte[] buffer = be.bytes_i[i];
								if (buffer != null) {
									tb.a(buffer, x, y, (byte) 68, nd.xd, jc.Y * 8 - 48, -48 + ub.G * 8);
								}

								++i;
							} while (length > i);
						}

						int i1 = 0;
						if (i1 < length) {
							do {
								int x = -int_w + 64 * (l.U[i1] >> 8);
								int y = -jc.X + (l.U[i1] & 255) * 64;
								byte[] data = be.bytes_i[i1];
								if (data == null && jc.Y < 800) {
									m.a(x, -65, 64, 64, y);
								}

								++i1;
							} while (i1 < length);
						}

						uc.a(13870, true);
						int i2 = 0;
						if (i2 < length) {
							do {
								byte[] bytes = fc.bytes_q[i2];
								if (bytes != null) {
									int x = -int_w + 64 * (l.U[i2] >> 8);
									int y = -jc.X + 64 * (l.U[i2] & 255);
									ba.a(pc.o, nd.xd, x, bytes, 63, y);
								}

								++i2;
							} while (i2 < length);
						}
					}

					int var13;
					int var14;
					if (we.r) {
						int plane = 0;
						int var15;
						int var16;
						int var17;
						do {
							int mapChunkX = 0;
							do {
								int mapChunkY = 0;
								do {
									int i = ab.mapChunks[plane][mapChunkX][mapChunkY];
									boolean flag2 = false;
									if (i != -1) {
										var13 = 3 & i >> 1;
										var14 = 1023 & i >> 14;
										var15 = 2047 & i >> 3;
										var12 = (i & 66513124) >> 24;
										var16 = (var14 / 8 << 8) + var15 / 8;
										var17 = 0;
										if (dummy != 0 || var17 < l.U.length) {
											do {
												if (~var16 == ~l.U[var17] && be.bytes_i[var17] != null) {
													flag2 = true;
													vc.a(var12, 8 * mapChunkX, nd.xd, (var14 & 7) * 8, (7 & var15) * 8, var13, -74, 8 * mapChunkY, plane, be.bytes_i[var17]);
													if (dummy == 0) {
														break;
													}
												}

												++var17;
											} while (var17 < l.U.length);
										}
									}

									if (!flag2) {
										f.b(mapChunkY * 8, -1, plane, 8 * mapChunkX);
									}

									++mapChunkY;
								} while (mapChunkY < 13);

								++mapChunkX;
							} while (~mapChunkX > -14);

							++plane;
						} while (~plane > -5);

						var8 = 0;
						if (dummy != 0 || var8 < 13) {
							do {
								var9 = 0;
								if (dummy == 0 && var9 >= 13) {
									++var8;
								} else {
									do {
										var22 = ab.mapChunks[0][var8][var9];
										if (var22 == -1) {
											m.a(var8 * 8, -65, 8, 8, 8 * var9);
										}

										++var9;
									} while (var9 < 13);

									++var8;
								}
							} while (var8 < 13);
						}

						uc.a(unused + 13615, true);
						var9 = 0;
						if (dummy != 0 || var9 < 4) {
							do {
								var22 = 0;
								if (dummy == 0 && var22 >= 13) {
									++var9;
								} else {
									do {
										var24 = 0;
										if (dummy == 0 && var24 >= 13) {
											++var22;
										} else {
											do {
												var12 = ab.mapChunks[var9][var22][var24];
												if (var12 != -1) {
													var13 = (58482786 & var12) >> 24;
													var14 = 3 & var12 >> 1;
													var15 = (var12 & 16764305) >> 14;
													var16 = var12 >> 3 & 2047;
													var17 = var16 / 8 + (var15 / 8 << 8);
													int var18 = 0;
													if (dummy != 0 || ~var18 > ~l.U.length) {
														do {
															if (~var17 == ~l.U[var18] && fc.bytes_q[var18] != null) {
																dd.a(var14, var9, nd.xd, (7 & var15) * 8, var24 * 8, pc.o, (byte) 37, fc.bytes_q[var18], 8 * var22, var13, 8 * (7 & var16));
																if (dummy == 0) {
																	break;
																}
															}

															++var18;
														} while (~var18 > ~l.U.length);
													}
												}

												++var24;
											} while (var24 < 13);

											++var22;
										}
									} while (var22 < 13);

									++var9;
								}
							} while (var9 < 4);
						}
					}

					uc.a(13870, true);
					u.g(-1);
					pa.a(pc.o, (byte) -108, nd.xd);
					uc.a(13870, true);
					var1 = client.int_ib;
					if (ce.plane < var1) {
						var1 = ce.plane;
					}

					if (ce.plane - 1 > var1) {
						var1 = ce.plane + -1;
					}

					if (jb.L) {
						pc.o.a(client.int_ib);
					} else {
						pc.o.a(0);
					}

					var8 = 0;
					while (~var8 > -105) {
						var9 = 0;
						while (~var9 > -105) {
							ec.a(var8, -128, var9);
							++var9;
						}

						++var8;
					}

					w.c(69);
					ec.dd_j.c(-127);
					if (ec.frame_m != null) {
						++jd.int_p;
						ie.writeStream.writeOpcode(8, 67);
						ie.writeStream.writeInt(unused + -7410, 1057001181);
					}

					if (!we.r) {
						int i = (ub.G + 6) / 8;
						int i1 = (ub.G + -6) / 8;
						int i2 = (jc.Y + 6) / 8;
						int i3 = (-6 + jc.Y) / 8;
						int xCalc = -1 + i1;
						if (~(1 + i) <= ~xCalc) {
							do {
								int yCalc = -1 + i3;
								if (yCalc > 1 + i2) {
									++xCalc;
								} else {
									do {
										if (~i1 < ~xCalc || xCalc > i || ~yCalc > ~i3 || ~yCalc < ~i2) {
											pb.cacheFile5.a(0, pc.a((byte) 127, new rd[]{
													client.m_,
													bf.a(xCalc, -31766),
													ja.underscore,
													bf.a(yCalc, -31766)
											}));
											pb.cacheFile5.a(0, pc.a((byte) 126, new rd[]{
													ra.l_,
													bf.a(xCalc, -31766),
													ja.underscore,
													bf.a(yCalc, unused + -32021)
											}));
										}

										++yCalc;
									} while (~yCalc >= ~(1 + i2));

									++xCalc;
								}
							} while (~(1 + i) <= ~xCalc);
						}
					}

					if (ee.int_h != -1) {
						bd.a(false, 35);
					} else {
						bd.a(false, 30);
					}

					ud.e(16);
					ie.writeStream.writeOpcode(8, 100);
					kb.a(105);
				}
			}
		} catch (RuntimeException var20) {
			throw id.a(var20, "kd.D(" + unused + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static boolean b (int unused) {
		try {
			++int_l;
			synchronized (nd.Bc) {
				if (sa.lb == nd.wd) {
					return false;
				}

				af.int_i = s.yb[sa.lb];
				dd.z = qe.E[sa.lb];
				sa.lb = 127 & 1 + sa.lb;
				return true;
			}

		} catch (RuntimeException var7) {
			throw id.a(var7, "kd.F(" + unused + ')');
		}
	}

	static oa[] c (int unused) {
		try {
			++n;
			oa[] oas = new oa[sd.I];
			int index = 0;
			if (sd.I <= -1) {
				ee.b(-1958111762);
				return oas;
			} else {
				while (index < sd.I) {
					oa class_oa = oas[index] = new oa();
					class_oa.gb = ld.g;
					class_oa.lb = a.mb;
					class_oa.hb = e.yb[index];
					class_oa.kb = sd.bb[index];
					class_oa.mb = ra.q[index];
					class_oa.nb = w.ints_a[index];
					class_oa.ib = eb.ints_g;
					class_oa.jb = w.bytes_s[index];
					++index;
				}

				ee.b(-1958111762);
				return oas;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "kd.A(" + unused + ')');
		}
	}

	public static void a (byte var0) {
		try {
			A = null;
			sorryInvitedPlayersOnly = null;
			rd_m = null;
			ints_f = null;
			y = null;
			z = null;
			o = null;
			rd_e = null;
			j = null;
			i = null;
			mapback = null;
			ints_u = null;
			C = null;
			rd_v = null;
			loadedWordpack = null;
			loadedWordpack2 = null;
			g = null;
			if (var0 >= 123) {
				E = null;
				B = null;
				x = null;
				sorryInvitedPlayersOnly2 = null;
				D = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "kd.E(" + var0 + ')');
		}
	}

	static void a (byte unused, int index) {
		int dummy = client.int_tb;
		try {
			dc.d(-118);
			int var2 = wa.a(index, -1).kb;
			++c;
			if (var2 != 0) {
				int var3 = ta.Pb[index];
				if (~var2 == -2) {
					if (~var3 == -2) {
						v.a(0.9D);
						((wd) v.cd_ub).a(0.9D, -28996);
					}

					if (var3 == 2) {
						v.a(0.8D);
						((wd) v.cd_ub).a(0.8D, -28996);
					}

					if (var3 == 3) {
						v.a(0.7D);
						((wd) v.cd_ub).a(0.7D, -28996);
					}

					if (var3 == 4) {
						v.a(0.6D);
						((wd) v.cd_ub).a(0.6D, -28996);
					}

					ie.a(0);
					ee.boolean_o = true;
				}

				if (var2 == 3) {
					short var4 = 0;
					if (var3 == 0) {
						var4 = 255;
					}

					if (~var3 == -2) {
						var4 = 192;
					}

					if (~var3 == -3) {
						var4 = 128;
					}

					if (~var3 == -4) {
						var4 = 64;
					}

					if (~var3 == -5) {
						var4 = 0;
					}

					if (~var4 != ~fc.int_u) {
						label151:
						{
							if (fc.int_u != 0 || ~b.dd == 0) {
								if (var4 == 0) {
									ld.a(-128);
									mb.b = 0;
									if (dummy == 0) {
										break label151;
									}
								}

								va.a((byte) -3, var4);
								if (dummy == 0) {
									break label151;
								}
							}

							ld.a(0, b.dd, false, vc.cacheFile6, 0, var4, (byte) 124);
							mb.b = 0;
						}

						fc.int_u = var4;
					}
				}

				if (var2 == 9) {
					ub.A = var3;
				}

				if (~var2 == -7) {
					pb.O = var3;
				}

				if (var2 == 5) {
					ad.int_t = var3;
				}

				if (var2 == 8) {
					w.h = true;
					dd.int_q = var3;
				}

				if (~var2 == -5) {
					if (var3 == 0) {
						ib.o = 127;
					}

					if (~var3 == -2) {
						ib.o = 96;
					}

					if (var3 == 2) {
						ib.o = 64;
					}

					if (var3 == 3) {
						ib.o = 32;
					}

					if (~var3 == -5) {
						ib.o = 0;
					}
				}

				if (var2 == 10) {
					if (var3 == 0) {
						md.b = 127;
					}

					if (var3 == 1) {
						md.b = 96;
					}

					if (~var3 == -3) {
						md.b = 64;
					}

					if (~var3 == -4) {
						md.b = 32;
					}

					if (~var3 == -5) {
						md.b = 0;
					}
				}

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "kd.C(" + unused + ',' + index + ')');
		}
	}

	static int d (int unused) {
		try {
			++p;
			return 19;
		} catch (RuntimeException var2) {
			throw id.a(var2, "kd.B(" + unused + ')');
		}
	}
}
