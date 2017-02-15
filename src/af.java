final class af {
	static rd rd_a;
	static int[][][] ints_c;
	static int int_d;
	static rd rd_e = md.a((String) "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 123);
	static rd pleaseReloadThisPage2;
	static int[] ints_g = new int[]{1, 0, -1, 0};
	static rd rd_h = md.a((String) " x ", (byte) 124);
	static int int_i;
	static int int_k;
	static int int_l;
	static int int_m;
	static int int_n;
	static int int_o;
	static td td_p;
	static int int_q;
	static int int_r;
	private static rd rd_b = md.a((String) "scroll:", (byte) 120);
	private static rd pleaseReloadThisPage;

	static {
		rd_a = rd_b;
		int_m = 0;
		int_o = 1;
		pleaseReloadThisPage = md.a("Please reload this page)3", (byte) 122);
		pleaseReloadThisPage2 = pleaseReloadThisPage;
		int_q = 0;
	}

	//Something to do with headicons_hint[0]
	static void a (int unused) {
		try {
			++int_k;
			if (sb.int_a == 2) {
				cf.a(ta.Qb + (-jc.X + ta.Rb << 7), 2 * m.int_d, bc.y + (-kd.int_w + gd.int_o << 7), 128);
				if (cf.int_h > -1 && ce.y % 20 < 10) {
					d.headicons_hint[0].a(cf.int_h + -12, -28 + fb.int_o);
				}
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "af.E(" + unused + ')');
		}
	}

	public static void b (int unused) {
		try {
			pleaseReloadThisPage = null;
			ints_g = null;
			rd_a = null;
			pleaseReloadThisPage2 = null;
			td_p = null;
			rd_b = null;
			ints_c = null;
			rd_e = null;
			rd_h = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "af.D(" + unused + ')');
		}
	}

	static void a (byte unused) {
		try {
			++int_n;
			if (ce.loadingStage != 0) {
				if (ce.loadingStage != 20) {
					if (ce.loadingStage == 30) {
						rb.cacheFile0 = ba.a(true, 0, 64, false, true);
						gf.cacheFile1 = ba.a(true, 1, 126, false, true);
						sa.cacheFile2 = ba.a(true, 2, 11, true, false);
						ge.cacheFile3 = ba.a(true, 3, 19, false, true);
						bd.cacheFile4 = ba.a(true, 4, 105, false, true);
						pb.cacheFile5 = ba.a(true, 5, -127, true, true);
						vc.cacheFile6 = ba.a(false, 6, 61, true, true);
						s.cacheFile7 = ba.a(true, 7, 13, false, true);
						q.cacheFile8 = ba.a(true, 8, -121, false, true);
						eb.cacheFile9 = ba.a(true, 9, -111, false, true);
						u.cacheFile10 = ba.a(true, 10, 54, false, true);
						hf.cacheFile11 = ba.a(true, 11, 109, false, true);
						dd.cacheFile12 = ba.a(true, 12, -127, false, true);
						m.cacheFile13 = ba.a(true, 13, -108, true, false);
						ff.loadingText = ad.connectingToUpdateServer2;
						rd.percentageBar = 20;
						ce.loadingStage = 40;
					} else if (ce.loadingStage == 40) {
						int updatePercentage = 5 * rb.cacheFile0.c(0) / 100;
						updatePercentage += 5 * gf.cacheFile1.c(0) / 100;
						updatePercentage += sa.cacheFile2.c(0) * 5 / 100;
						updatePercentage += 5 * ge.cacheFile3.c(0) / 100;
						updatePercentage += bd.cacheFile4.c(0) * 5 / 100;
						updatePercentage += 5 * pb.cacheFile5.c(0) / 100;
						updatePercentage += vc.cacheFile6.c(0) * 5 / 100;
						updatePercentage += 40 * s.cacheFile7.c(0) / 100;
						updatePercentage += 5 * q.cacheFile8.c(0) / 100;
						updatePercentage += 3 * eb.cacheFile9.c(0) / 100;
						updatePercentage += 5 * u.cacheFile10.c(0) / 100;
						updatePercentage += 5 * hf.cacheFile11.c(0) / 100;
						updatePercentage += 5 * dd.cacheFile12.c(0) / 100;
						updatePercentage += 2 * m.cacheFile13.c(0) / 100;
						if (updatePercentage != 100) {
							if (updatePercentage != 0) {
								ff.loadingText = pc.a((byte) 127, new rd[]{l.checkingForUpdates2, bf.a(updatePercentage, -31766), tb.percentageSymbol});
							}

							rd.percentageBar = 30;
						} else {
							ce.loadingStage = 45;
							rd.percentageBar = 30;
							ff.loadingText = ge.loadedUpdateList2;
						}
					} else {
						if (ce.loadingStage == 45) {
							fb.a(0, f.Nc, !jb.L, false);
							e.Nb = cf.a(false, 22050, rd.canvas, f.Nc, 91);
							m.h_m = new h(22050, hc.sampleRate);
							ff.loadingText = w.preparedSoundEngine2;
							rd.percentageBar = 35;
							ce.loadingStage = 50;
						} else if (ce.loadingStage == 50) {
							int fontCount = 0;
							if (e.Ib == null) {
								e.Ib = ee.a(q.cacheFile8, (byte) 126, kd.rd_v, id.p11_full);
							} else {
								++fontCount;
							}

							if (ad.gb_a == null) {
								ad.gb_a = ee.a(q.cacheFile8, (byte) 126, kd.rd_v, client.p12_full);
							} else {
								++fontCount;
							}

							if (client.Y == null) {
								client.Y = ee.a(q.cacheFile8, (byte) 126, kd.rd_v, dd.b12_full);
							} else {
								++fontCount;
							}

							if (fontCount < 3) {
								ff.loadingText = pc.a((byte) 127, new rd[]{la.loadingFonts2, bf.a(100 * fontCount / 3, -31766), tb.percentageSymbol});
								rd.percentageBar = 40;
							} else {
								rd.percentageBar = 40;
								ff.loadingText = ff.loadedFonts2;
								ce.loadingStage = 60;
							}
						} else if (ce.loadingStage == 60) {
							int titleScreenSpriteCount = nc.a(q.cacheFile8, u.cacheFile10, 0);
							int requiredCount = j.f(-24556);
							if (titleScreenSpriteCount < requiredCount) {
								ff.loadingText = pc.a((byte) 126, new rd[]{vc.loadingTitleScreen2, bf.a(titleScreenSpriteCount * 100 / requiredCount, -31766), tb.percentageSymbol});
								rd.percentageBar = 50;
							} else {
								rd.percentageBar = 50;
								ff.loadingText = r.loadedTitleScreen2;
								bd.a(false, 5);
								ce.loadingStage = 70;
							}
						} else if (ce.loadingStage == 70) {
							if (!sa.cacheFile2.b((byte) 20)) {
								ff.loadingText = pc.a((byte) 126, new rd[]{id.loadingConfig2, bf.a(sa.cacheFile2.a(false), -31766), tb.percentageSymbol});
								rd.percentageBar = 60;
							} else {
								pd.a(sa.cacheFile2, (byte) -97);
								dc.a(sa.cacheFile2, 73);
								md.a(sa.cacheFile2, s.cacheFile7, (byte) 102);
								wb.a(sa.cacheFile2, 1176, jb.L, s.cacheFile7);
								t.a(s.cacheFile7, -29075, sa.cacheFile2);
								kb.a(e.Ib, sa.cacheFile2, 64, va.isMembers_j, s.cacheFile7);
								wb.a(rb.cacheFile0, (byte) -96, sa.cacheFile2, gf.cacheFile1);
								td.a(s.cacheFile7, sa.cacheFile2, 62);
								t.a(-123, sa.cacheFile2);
								ab.a(sa.cacheFile2, -128);
								ec.a(q.cacheFile8, s.cacheFile7, 0, ge.cacheFile3);
								pa.a(sa.cacheFile2, 43);
								ce.loadingStage = 80;
								rd.percentageBar = 60;
								ff.loadingText = sd.loadedConfig2;
							}
						} else if (ce.loadingStage != 80) {
							if (ce.loadingStage == 85) {
								int gameScreenCount = va.a((byte) -120, q.cacheFile8);
								int required = kd.d(-9459);
								if (required > gameScreenCount) {
									ff.loadingText = pc.a((byte) 125, new rd[]{
											od.loadingGameScreen2,
											bf.a(100 * gameScreenCount / required, -31766),
											tb.percentageSymbol
									});
									rd.percentageBar = 80;
								} else {
									ff.loadingText = h.loadedGamescreen2;
									ce.loadingStage = 90;
									rd.percentageBar = 80;
								}
							} else if (ce.loadingStage == 90) {
								if (!eb.cacheFile9.b((byte) 19)) {
									ff.loadingText = pc.a((byte) 127, new rd[]{
											uc.loadingTextures2,
											bf.a(eb.cacheFile9.a(false), -31766),
											tb.percentageSymbol
									});
									rd.percentageBar = 90;
								} else {
									wd class_wd = new wd(eb.cacheFile9, q.cacheFile8, 20, 0.8D, !jb.L ? 128 : 64);
									v.a(class_wd);
									v.a(0.8D);
									ff.loadingText = h.loadedTextures2;
									rd.percentageBar = 90;
									ce.loadingStage = 110;
								}
							} else if (ce.loadingStage == 110) {
								h.df_s = new df();
								f.Nc.a(10, (byte) -113, h.df_s);
								rd.percentageBar = 94;
								ce.loadingStage = 120;
								ff.loadingText = tb.loadedInputHandler2;
							} else if (ce.loadingStage == 120) {
								if (!u.cacheFile10.b((byte) -95, hc.huffman, kd.rd_v)) {
									ff.loadingText = pc.a((byte) 126, new rd[]{wb.loadingWordpack2, ad.rd_l});
									rd.percentageBar = 96;
								} else {
									kb class_kb = new kb(u.cacheFile10.a((byte) 110, hc.huffman, kd.rd_v));
									od.a(1, class_kb);
									ce.loadingStage = 130;
									rd.percentageBar = 96;
									ff.loadingText = kd.loadedWordpack2;
								}
							} else if (ce.loadingStage == 130) {
								if (!ge.cacheFile3.b((byte) 77)) {
									ff.loadingText = pc.a((byte) 127, new rd[]{
											la.loadingInterfaces2,
											bf.a(ge.cacheFile3.a(false) * 4 / 5, -31766),
											tb.percentageSymbol
									});
									rd.percentageBar = 100;
								} else if (!dd.cacheFile12.b((byte) 89)) {
									ff.loadingText = pc.a((byte) 127, new rd[]{
											la.loadingInterfaces2,
											bf.a(80 + dd.cacheFile12.a(false) / 6, -31766),
											tb.percentageSymbol
									});
									rd.percentageBar = 100;
								} else if (!m.cacheFile13.b((byte) 88)) {
									ff.loadingText = pc.a((byte) 125, new rd[]{
											la.loadingInterfaces2,
											bf.a(96 + m.cacheFile13.a(false) / 20, -31766),
											tb.percentageSymbol
									});
									rd.percentageBar = 100;
								} else {
									rd.percentageBar = 100;
									ce.loadingStage = 140;
									ff.loadingText = u.loadedInterfaces2;
								}
							} else if (ce.loadingStage == 140) {
								bd.a(false, 10);
							}
						} else {
							int spriteCount = 0;
							if (hb.compass != null) {
								++spriteCount;
							} else {
								hb.compass = te.a(q.cacheFile8, db.compass, kd.rd_v, true);
							}

							if (jd.mapedge == null) {
								jd.mapedge = te.a(q.cacheFile8, ub.mapedge, kd.rd_v, true);
							} else {
								++spriteCount;
							}

							if (kb.mapscene != null) {
								++spriteCount;
							} else {
								kb.mapscene = qb.a(kd.rd_v, ce.mapscene, q.cacheFile8, -107);
							}

							if (tc.mapfunction != null) {
								++spriteCount;
							} else {
								tc.mapfunction = hf.a(q.cacheFile8, pe.mapfunction, kd.rd_v, (byte) 125);
							}

							if (va.hitmarks == null) {
								va.hitmarks = hf.a(q.cacheFile8, nc.hitmarks, kd.rd_v, (byte) 82);
							} else {
								++spriteCount;
							}

							if (cc.headicons_pk != null) {
								++spriteCount;
							} else {
								cc.headicons_pk = hf.a(q.cacheFile8, a.headicons_pk, kd.rd_v, (byte) 68);
							}

							if (jd.headicons_prayer != null) {
								++spriteCount;
							} else {
								jd.headicons_prayer = hf.a(q.cacheFile8, gd.headicons_prayer, kd.rd_v, (byte) 112);
							}

							if (d.headicons_hint == null) {
								d.headicons_hint = hf.a(q.cacheFile8, i.headicons_hint, kd.rd_v, (byte) 85);
							} else {
								++spriteCount;
							}

							if (rd.overlay_multiway == null) {
								rd.overlay_multiway = te.a(q.cacheFile8, ka.overlay_multiway, kd.rd_v, true);
							} else {
								++spriteCount;
							}

							if (qb.mapmarker != null) {
								++spriteCount;
							} else {
								qb.mapmarker = hf.a(q.cacheFile8, d.mapmarker, kd.rd_v, (byte) 86);
							}

							if (rb.cross == null) {
								rb.cross = hf.a(q.cacheFile8, ke.cross, kd.rd_v, (byte) 52);
							} else {
								++spriteCount;
							}

							if (tb.mapdots != null) {
								++spriteCount;
							} else {
								tb.mapdots = hf.a(q.cacheFile8, ba.mapdots, kd.rd_v, (byte) 90);
							}

							if (fc.scrollbarData != null) {
								++spriteCount;
							} else {
								fc.scrollbarData = qb.a(kd.rd_v, fc.scrollbar, q.cacheFile8, -127);
							}

							if (qe.mod_icons == null) {
								qe.mod_icons = qb.a(kd.rd_v, uc.mod_icons, q.cacheFile8, -108);
							} else {
								++spriteCount;
							}

							if (spriteCount < 14) {
								ff.loadingText = pc.a((byte) 127, new rd[]{ra.loadingSprites2, bf.a(spriteCount * 100 / 14, -31766), tb.percentageSymbol});
								rd.percentageBar = 70;
							} else {
								jd.mapedge.e();
								int i = (int) (Math.random() * 21.0D) + -10;
								int i1 = (int) (21.0D * Math.random()) - 10;
								int i2 = (int) (Math.random() * 41.0D) - 20;
								int i3 = -10 + (int) (21.0D * Math.random());
								int index = 0;
								while (index < tc.mapfunction.length) {
									tc.mapfunction[index].b(i2 + i1, i2 + i, i3 + i2);
									++index;
								}

								kb.mapscene[0].a(i2 + i1, i - -i2, i2 + i3);
								rd.percentageBar = 70;
								ff.loadingText = hc.bb;
								ce.loadingStage = 85;
							}
						}
					}
				} else {
					int[] ints = new int[9];
					int i = 0;
					do {
						int i1 = 143 + i * 32;
						int i2 = v.pb[i1];
						int i3 = 600 - -(3 * i1);
						ints[i] = i3 * i2 >> 16;
						++i;
					} while (i < 9);

					ua.a(ints, 500, 800, 512, 334);
					ce.loadingStage = 30;
					rd.percentageBar = 10;
					ff.loadingText = ca.preparedVisibilityMap2;
				}
			} else {
				pc.o = new ua(4, 104, 104, tb.Yb);
				int index = 0;
				while (index < 4) {
					nd.xd[index] = new nc(104, 104);
					++index;
				}

				pd.S = new he(512, 512);
				ff.loadingText = ee.startingGameEngine2;
				rd.percentageBar = 5;
				ce.loadingStage = 20;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "af.A(" + unused + ')');
		}
	}

	static void b (byte unused) {
		try {
			++int_d;
			if (client.int_qb == 1) {
				if (wb.nb >= 6 && wb.nb <= 106 && sb.int_b >= 467 && sb.int_b <= 499) {
					w.h = true;
					++rd.g;
					db.L = true;
					bd.publicChatStatus = (1 + bd.publicChatStatus) % 4;
					ie.writeStream.writeOpcode(8, 4);
					ie.writeStream.writeByte((byte) 125, bd.publicChatStatus);
					ie.writeStream.writeByte((byte) -97, ub.privateChatStatus);
					ie.writeStream.writeByte((byte) -98, pa.trade_competeStatus);
				}

				if (wb.nb >= 135 && wb.nb <= 235 && sb.int_b >= 467 && sb.int_b <= 499) {
					w.h = true;
					ub.privateChatStatus = (ub.privateChatStatus + 1) % 3;
					++rd.g;
					db.L = true;
					ie.writeStream.writeOpcode(8, 4);
					ie.writeStream.writeByte((byte) 90, bd.publicChatStatus);
					ie.writeStream.writeByte((byte) -31, ub.privateChatStatus);
					ie.writeStream.writeByte((byte) -122, pa.trade_competeStatus);
				}

				if (wb.nb >= 273 && wb.nb <= 373 && sb.int_b >= 467 && sb.int_b <= 499) {
					++rd.g;
					pa.trade_competeStatus = (1 + pa.trade_competeStatus) % 3;
					w.h = true;
					db.L = true;
					ie.writeStream.writeOpcode(8, 4);
					ie.writeStream.writeByte((byte) 105, bd.publicChatStatus);
					ie.writeStream.writeByte((byte) 99, ub.privateChatStatus);
					ie.writeStream.writeByte((byte) -72, pa.trade_competeStatus);
				}

				if (wb.nb >= 412 && wb.nb <= 512 && sb.int_b >= 467 && sb.int_b <= 499) {
					if (sa.zb == -1) {
						te.d((byte) 99);
						if (u.int_db != -1) {
							ce.boolean_s = false;
							se.o = sa.zb = u.int_db;
							kd.C = kd.rd_v;
						}
					} else {
						n.a(kd.rd_v, ba.pleaseCloseTheInterfaceBeforeUsingReportAbuse2, true, 0);
						if (h.y == null) {
							return;
						}

						n.a(kd.rd_v, h.y, true, 0);
					}
				}
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "af.B(" + unused + ')');
		}
	}

	static int a (rd class_rd, int unused, id writeStream) {
		try {
			++int_l;
			int pointer = writeStream.pointer;
			writeStream.b(class_rd.stringPointer, (byte) 36);
			writeStream.pointer += bd.xc.a(0, writeStream.buffer, writeStream.pointer, 117, class_rd.stringBuffer, class_rd.stringPointer);
			return writeStream.pointer - pointer;
		} catch (RuntimeException var5) {
			throw id.a(var5, "af.C(" + "{...}" + ',' + unused + ',' + "{...}" + ')');
		}
	}
}
