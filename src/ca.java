import java.awt.Component;

final class ca {
	static int int_a;
	static int[] ints_b = new int['耀'];
	static rd rd_d = null;
	static boolean boolean_f = false;
	static int int_g = 0;
	static int int_h;
	static int int_i;
	static rd preparedVisibilityMap2;
	static rd attack2;
	static int int_l;
	static int int_m;
	static int int_n;
	static int[] ints_o;
	static rd rd_p;
	static int int_q;
	private static rd attack = md.a((String) "Attack", (byte) 114);
	private static rd preparedVisibilityMap = md.a((String) "Prepared visibility map", (byte) 126);

	static {
		preparedVisibilityMap2 = preparedVisibilityMap;
		attack2 = attack;
		int_l = -1;
		rd_p = md.a("weiss:", (byte) 119);
		ints_o = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	}

	@SuppressWarnings("UnnecessaryParentheses")
	static void a (pb cacheFile10, Component component, pb cacheFile8, int unused) {
		try {
			++int_a;
			if (!ke.tb) {
				ke.wb = je.a(-72, 128, 265, component);
				ic.a();
				te.Vb = je.a(-85, 128, 265, component);
				ic.a();
				l.v = je.a(-88, 509, 171, component);
				ic.a();
				ja.jd_q = je.a(-65, 360, 132, component);
				ic.a();
				od.jd_sb = je.a(-68, 360, 200, component);
				ic.a();
				kb.j = je.a(-91, 202, 238, component);
				ic.a();
				dc.jd_k = je.a(-119, 203, 238, component);
				ic.a();
				sd.L = je.a(-91, 74, 94, component);
				ic.a();
				s.db = je.a(-98, 75, 94, component);
				ic.a();
				byte[] imageData = cacheFile10.a((byte) 82, i.title_jpg, ff.rd_t);
				he class_he = new he(imageData, component);
				ke.wb.a(-1926);
				class_he.b(0, 0);
				te.Vb.a(-1926);
				class_he.b(-637, 0);
				l.v.a(-1926);
				class_he.b(-128, 0);
				ja.jd_q.a(-1926);
				class_he.b(-202, -371);
				od.jd_sb.a(-1926);
				class_he.b(-202, -171);
				kb.j.a(-1926);
				class_he.b(0, -265);
				dc.jd_k.a(-1926);
				class_he.b(-562, -265);
				sd.L.a(-1926);
				class_he.b(-128, -171);
				s.db.a(-1926);
				class_he.b(-562, -171);
				int[] widthIndice = new int[class_he.imageWidth];
				for (int height = 0 ; height < class_he.imageHeight ; height++) {
					for (int width = 0 ; width < class_he.imageWidth ; width++) {
						widthIndice[width] = class_he.imagePixels[-width + (class_he.imageWidth - (1 + -(height * class_he.imageWidth)))];
					}

					System.arraycopy(widthIndice, 0, class_he.imagePixels, (class_he.imageWidth * height), class_he.imageWidth);
				}

				ke.wb.a(-1926);
				class_he.b(382, 0);
				te.Vb.a(-1926);
				class_he.b(-255, 0);
				l.v.a(-1926);
				class_he.b(254, 0);
				ja.jd_q.a(-1926);
				class_he.b(180, -371);
				od.jd_sb.a(-1926);
				class_he.b(180, -171);
				kb.j.a(-1926);
				class_he.b(382, -265);
				dc.jd_k.a(-1926);
				class_he.b(-180, -265);
				sd.L.a(-1926);
				class_he.b(254, -171);
				s.db.a(-1926);
				class_he.b(-180, -171);
				class_he = te.a(cacheFile8, ka.logo, ff.rd_t, true);
				l.v.a(-1926);
				class_he.a(254 - class_he.imageWidth / 2, 18);
				rb.A = ge.a(ib.titleBox, cacheFile8, false, ff.rd_t);
				dc.oa_d = ge.a(bd.titleButton, cacheFile8, false, ff.rd_t);
				ce.oas_m = qb.a(ff.rd_t, rb.runes, cacheFile8, -120);

				lc.he_a = new he(128, 265);
				ce.he_b = new he(128, 265);
				System.arraycopy(ke.wb.imagePixels, 0, lc.he_a.imagePixels, 0, '蒀');
				System.arraycopy(te.Vb.imagePixels, 0, ce.he_b.imagePixels, 0, '蒀');


				ff.ints_h = new int[256];
				for (int index = 0 ; index < 64 ; index++) {
					ff.ints_h[index] = index * 262144;
				}

				for (int index = 0 ; index < 64 ; index++) {
					ff.ints_h[index + 64] = 1024 * index + 16711680;
				}

				for (int index = 0 ; index < 64 ; index++) {
					ff.ints_h[128 + index] = index * 4 + 16776960;
				}

				for (int index = 0 ; index < 64 ; index++) {
					ff.ints_h[192 + index] = 16777215;
				}

				tb.Zb = new int[256];
				for (int index = 0 ; index < 64 ; index++) {
					tb.Zb[index] = index * 1024;
				}

				for (int index = 0 ; index < 64 ; index++) {
					tb.Zb[64 + index] = '\uff00' + 4 * index;
				}

				for (int index = 0 ; index < 64 ; index++) {
					tb.Zb[index + 128] = '\uffff' + (262144 * index);
				}

				for (int index = 0 ; index < 64 ; index++) {
					tb.Zb[192 + index] = 16777215;
				}

				ie.m = new int[256];
				for (int index = 0 ; index < 64 ; index++) {
					ie.m[index] = index * 4;
				}

				for (int index = 0 ; index < 64 ; index++) {
					ie.m[index + 64] = 255 + (262144 * index);
				}

				for (int index = 0 ; index < 64 ; index++) {
					ie.m[128 + index] = 16711935 + index * 1024;
				}

				for (int index = 0 ; index < 64 ; index++) {
					ie.m[192 + index] = 16777215;
				}

				ja.ints_o = new int['耀'];
				jb.B = new int[256];
				b.ints_od = new int['耀'];
				ge.a(null, (byte) 36);
				h.int_c = 0;
				lc.ints_f = new int['耀'];
				ff.rd_w = ff.rd_t;
				jb.W = new int['耀'];
				ff.rd_f = ff.rd_t;
				if (fc.int_u == 0 || jb.L) {
					ld.a(10, (byte) 13);
				} else {
					ld.a(0, vc.cacheFile6, fc.int_u, false, 10, 255, uc.scape_main, ff.rd_t);
				}

				md.a((byte) 94, false);
				ee.boolean_o = true;
				ke.tb = true;
			}
		} catch (RuntimeException var23) {
			throw id.a(var23, "ca.D(" + (cacheFile10 != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ',' + (cacheFile8 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void a (boolean flag, byte unused) {
		try {
			int i = b.int_hd;
			if (jb.M == af.td_p.x_ >> 7 && me.L == af.td_p.y_ >> 7) {
				jb.M = 0;
			}

			if (flag) {
				i = 1;
			}

			int i1 = 0;
			if (i1 >= i) {
				++int_m;
			} else {
				do {
					td class_td;
					int i2;
					if (!flag) {
						class_td = f.Lc[r.R[i1]];
						i2 = r.R[i1] << 14;
					} else {
						class_td = af.td_p;
						i2 = 33538048;
					}

					if (class_td != null && class_td.d((byte) -124)) {
						class_td.ed = false;
						int x = class_td.x_ >> 7;
						if ((jb.L && b.int_hd > 50 || b.int_hd > 200) && !flag && class_td.int_lc == class_td.yb) {
							class_td.ed = true;
						}

						int y = class_td.y_ >> 7;
						if (x >= 0 && x < 104 && y >= 0 && y < 104) {
							if (class_td.Hd != null && class_td.zd <= ce.y && class_td.Cd > ce.y) {
								class_td.ed = false;
								class_td.int_nd = vc.a(ce.plane, class_td.x_, class_td.y_, (byte) 37);
								pc.o.a(ce.plane, class_td.x_, class_td.y_, class_td.int_nd, 60, class_td, class_td.Bb, i2, class_td.dd, class_td.Zc, class_td.Yc, class_td.int_md);
							} else {
								if ((class_td.x_ & 127) == 64 && (127 & class_td.y_) == 64) {
									if (ha.ints_nb[x][y] != qe.F) {
										ha.ints_nb[x][y] = qe.F;
									}
								} else {
									class_td.int_nd = vc.a(ce.plane, class_td.x_, class_td.y_, (byte) 37);
									pc.o.a(ce.plane, class_td.x_, class_td.y_, class_td.int_nd, 60, class_td, class_td.Bb, i2, class_td.zb);
								}
							}
						}
					}

					++i1;
				} while (i1 < i);

				++int_m;
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "ca.E(" + flag + ',' + unused + ')');
		}
	}

	static gb a (int unused) {
		try {
			++int_i;
			gb class_gb = new gb(sd.bb, ra.q, w.ints_a, eb.ints_g, w.bytes_s);
			ee.b(-1958111762);
			return class_gb;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ca.C(" + unused + ')');
		}
	}

	static void a (int y, int position, int plane, ua class_ua, nc class_nc, int orientation, int fileRequest, int x, byte unused) {
		try {
			++int_q;
			if (jb.L && (2 & d.bytes_j[0][x][y]) == 0) {
				if ((d.bytes_j[plane][x][y] & 16) != 0) {
					return;
				}

				if (qb.a((byte) -123, x, plane, y) != af.int_m) {
					return;
				}
			}

			if (plane < client.int_ib) {
				client.int_ib = plane;
			}

			int maxArea = tb.Yb[plane][1 + x][1 + y];
			int regularArea = tb.Yb[plane][x][y];
			int i3 = tb.Yb[plane][1 + x][y];
			int i4 = tb.Yb[plane][x][1 + y];
			int i5 = i4 + maxArea + i3 + regularArea >> 2;
			bd class_bd = ub.a(-55 + -27, fileRequest);
			int i2 = 1073741824 + (fileRequest << 14) + x + (y << 7);
			if (class_bd.Mb == 0) {
				i2 += Integer.MIN_VALUE;
			}

			int i6 = (orientation << 6) + position;
			if (class_bd.Cb == 1) {
				i6 += 256;
			}

			if (class_bd.h(-1684)) {
				df.a(y, orientation, plane, x, (byte) -36, class_bd);
			}

			Object o;
			if (position == 22) {
				if (!jb.L || class_bd.Mb != 0 || class_bd.Gb) {
					if (class_bd.int_kb != -1 || class_bd.Jb != null) {
						o = new ta(fileRequest, 22, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
					} else {
						o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, 22);
					}

					class_ua.a(plane, x, y, i5, (ha) o, i2, i6);
					if (class_bd.boolean_ib && class_bd.Mb == 1 && class_nc != null) {
						class_nc.markBlocked(x, y, (byte) -75);
					}

				}
			} else {
				int h;
				if (position != 10 && position != 11) {
					if (position >= 12) {
						if (class_bd.int_kb != -1 || class_bd.Jb != null) {
							o = new ta(fileRequest, position, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
						} else {
							o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, position);
						}

						class_ua.a(plane, x, y, i5, 1, 1, (ha) o, 0, i2, i6);
						if (position >= 12 && position <= 17 && position != 13 && plane > 0) {
							af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 2340);
						}

						if (class_bd.boolean_ib && class_nc != null) {
							class_nc.markSolidOccupant(class_bd.h, 20850, class_bd.w, x, class_bd.impenetrable, orientation, y);
						}
					} else if (position == 0) {
						if (class_bd.int_kb != -1 || class_bd.Jb != null) {
							o = new ta(fileRequest, 0, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
						} else {
							o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, 0);
						}

						class_ua.a(plane, x, y, i5, (ha) o, null, gd.ints_h[orientation], 0, i2, i6);
						if (orientation == 0) {
							if (class_bd.boolean_bb) {
								ud.M[plane][x][y] = 50;
								ud.M[plane][x][1 + y] = 50;
							}

							if (class_bd.Rb) {
								af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 585);
							}
						} else if (orientation != 1) {
							if (orientation != 2) {
								if (orientation == 3) {
									if (class_bd.boolean_bb) {
										ud.M[plane][x][y] = 50;
										ud.M[plane][1 + x][y] = 50;
									}

									if (class_bd.Rb) {
										af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 1170);
									}
								}
							} else {
								if (class_bd.boolean_bb) {
									ud.M[plane][x + 1][y] = 50;
									ud.M[plane][1 + x][y + 1] = 50;
								}

								if (class_bd.Rb) {
									af.ints_c[plane][1 + x][y] = fb.b(af.ints_c[plane][1 + x][y], 585);
								}
							}
						} else {
							if (class_bd.boolean_bb) {
								ud.M[plane][x][y + 1] = 50;
								ud.M[plane][1 + x][y + 1] = 50;
							}

							if (class_bd.Rb) {
								af.ints_c[plane][x][y + 1] = fb.b(af.ints_c[plane][x][y + 1], 1170);
							}
						}

						if (class_bd.boolean_ib && class_nc != null) {
							class_nc.markWall(y, x, class_bd.impenetrable, (byte) -102, position, orientation);
						}

						if (class_bd.Tb != 16) {
							class_ua.e(plane, x, y, class_bd.Tb);
						}
					} else if (position == 1) {
						if (class_bd.int_kb != -1 || class_bd.Jb != null) {
							o = new ta(fileRequest, 1, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
						} else {
							o = class_bd.a(orientation, i3, maxArea, -55 ^ -65463, i4, regularArea, 1);
						}

						class_ua.a(plane, x, y, i5, (ha) o, null, tb.Xb[orientation], 0, i2, i6);
						if (class_bd.boolean_bb) {
							if (orientation == 0) {
								ud.M[plane][x][y + 1] = 50;
							} else if (orientation == 1) {
								ud.M[plane][1 + x][1 + y] = 50;
							} else if (orientation == 2) {
								ud.M[plane][x + 1][y] = 50;
							} else if (orientation == 3) {
								ud.M[plane][x][y] = 50;
							}
						}

						if (class_bd.boolean_ib && class_nc != null) {
							class_nc.markWall(y, x, class_bd.impenetrable, (byte) -102, position, orientation);
						}
					} else {
						int orientation1;
						Object o1;
						if (position == 2) {
							Object o2;
							orientation1 = 3 & 1 + orientation;
							if (class_bd.int_kb != -1 || class_bd.Jb != null) {
								o2 = new ta(fileRequest, 2, 4 + orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								o1 = new ta(fileRequest, 2, orientation1, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
							} else {
								o2 = class_bd.a(4 + orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, 2);
								o1 = class_bd.a(orientation1, i3, maxArea, (int) 'ﾀ', i4, regularArea, 2);
							}

							class_ua.a(plane, x, y, i5, (ha) o2, (ha) o1, gd.ints_h[orientation], gd.ints_h[orientation1], i2, i6);
							if (class_bd.Rb) {
								if (orientation != 0) {
									if (orientation == 1) {
										af.ints_c[plane][x][y + 1] = fb.b(af.ints_c[plane][x][y + 1], 1170);
										af.ints_c[plane][1 + x][y] = fb.b(af.ints_c[plane][1 + x][y], 585);
									} else if (orientation != 2) {
										if (orientation == 3) {
											af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 1170);
											af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 585);
										}
									} else {
										af.ints_c[plane][x + 1][y] = fb.b(af.ints_c[plane][x + 1][y], 585);
										af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 1170);
									}
								} else {
									af.ints_c[plane][x][y] = fb.b(af.ints_c[plane][x][y], 585);
									af.ints_c[plane][x][1 + y] = fb.b(af.ints_c[plane][x][1 + y], 1170);
								}
							}

							if (class_bd.boolean_ib && class_nc != null) {
								class_nc.markWall(y, x, class_bd.impenetrable, (byte) -102, position, orientation);
							}

							if (class_bd.Tb != 16) {
								class_ua.e(plane, x, y, class_bd.Tb);
							}
						} else if (position == 3) {
							if (class_bd.int_kb == -1 && class_bd.Jb == null) {
								o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, 3);
							} else {
								o = new ta(fileRequest, 3, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
							}

							class_ua.a(plane, x, y, i5, (ha) o, null, tb.Xb[orientation], 0, i2, i6);
							if (class_bd.boolean_bb) {
								if (orientation != 0) {
									if (orientation == 1) {
										ud.M[plane][1 + x][1 + y] = 50;
									} else if (orientation != 2) {
										if (orientation == 3) {
											ud.M[plane][x][y] = 50;
										}
									} else {
										ud.M[plane][x + 1][y] = 50;
									}
								} else {
									ud.M[plane][x][y + 1] = 50;
								}
							}

							if (class_bd.boolean_ib && class_nc != null) {
								class_nc.markWall(y, x, class_bd.impenetrable, (byte) -102, position, orientation);
							}

						} else if (position == 9) {
							if (class_bd.int_kb != -1 || class_bd.Jb != null) {
								o = new ta(fileRequest, position, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
							} else {
								o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, position);
							}

							class_ua.a(plane, x, y, i5, 1, 1, (ha) o, 0, i2, i6);
							if (class_bd.boolean_ib && class_nc != null) {
								class_nc.markSolidOccupant(class_bd.h, 20850, class_bd.w, x, class_bd.impenetrable, orientation, y);
							}

						} else {
							if (class_bd.Fb) {
								if (orientation != 1) {
									if (orientation != 2) {
										if (orientation == 3) {
											orientation1 = i4;
											i4 = regularArea;
											regularArea = i3;
											i3 = maxArea;
											maxArea = orientation1;
										}
									} else {
										orientation1 = i4;
										i4 = i3;
										i3 = orientation1;
										orientation1 = maxArea;
										maxArea = regularArea;
										regularArea = orientation1;
									}
								} else {
									orientation1 = i4;
									i4 = maxArea;
									maxArea = i3;
									i3 = regularArea;
									regularArea = orientation1;
								}
							}

							if (position == 4) {
								if (class_bd.int_kb != -1 || class_bd.Jb != null) {
									o = new ta(fileRequest, 4, 0, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								} else {
									o = class_bd.a(0, i3, maxArea, (int) 'ﾀ', i4, regularArea, 4);
								}

								class_ua.a(plane, x, y, i5, (ha) o, gd.ints_h[orientation], 512 * orientation, 0, 0, i2, i6);
							} else if (position == 5) {
								h = class_ua.p(plane, x, y);
								orientation1 = 16;
								if (h != 0) {
									orientation1 = ub.a(-95, 32767).Tb;
								}

								if (class_bd.int_kb == -1 && class_bd.Jb == null) {
									o1 = class_bd.a(0, i3, maxArea, (int) 'ﾀ', i4, regularArea, 4);
								} else {
									o1 = new ta(fileRequest, 4, 0, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								}

								class_ua.a(plane, x, y, i5, (ha) o1, gd.ints_h[orientation], 512 * orientation, orientation1 * af.ints_g[orientation], ec.ints_r[orientation] * orientation1, i2, i6);
							} else if (position == 6) {
								if (class_bd.int_kb == -1 && class_bd.Jb == null) {
									o = class_bd.a(0, i3, maxArea, (int) 'ﾀ', i4, regularArea, 4);
								} else {
									o = new ta(fileRequest, 4, 0, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								}

								class_ua.a(plane, x, y, i5, (ha) o, 256, orientation, 0, 0, i2, i6);
							} else if (position == 7) {
								if (class_bd.int_kb == -1 && class_bd.Jb == null) {
									o = class_bd.a(0, i3, maxArea, -55 + 'ﾷ', i4, regularArea, 4);
								} else {
									o = new ta(fileRequest, 4, 0, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								}

								class_ua.a(plane, x, y, i5, (ha) o, 512, orientation, 0, 0, i2, i6);
							} else if (position == 8) {
								if (class_bd.int_kb != -1 || class_bd.Jb != null) {
									o = new ta(fileRequest, 4, 0, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
								} else {
									o = class_bd.a(0, i3, maxArea, (int) 'ﾀ', i4, regularArea, 4);
								}

								class_ua.a(plane, x, y, i5, (ha) o, 768, orientation, 0, 0, i2, i6);
							}
						}
					}
				} else {
					if (class_bd.int_kb == -1 && class_bd.Jb == null) {
						o = class_bd.a(orientation, i3, maxArea, (int) 'ﾀ', i4, regularArea, 10);
					} else {
						o = new ta(fileRequest, 10, orientation, regularArea, i3, maxArea, i4, class_bd.int_kb, true, null);
					}

					if (o != null) {
						int w;
						if (orientation == 1 || orientation == 3) {
							h = class_bd.h;
							w = class_bd.w;
						} else {
							w = class_bd.h;
							h = class_bd.w;
						}

						int i = 0;
						if (position == 11) {
							i += 256;
						}

						if (class_ua.a(plane, x, y, i5, h, w, (ha) o, i, i2, i6) && class_bd.boolean_bb) {
							int i1 = 15;
							if (o instanceof ue) {
								i1 = ((ue) o).g() / 4;
								if (i1 > 30) {
									i1 = 30;
								}
							}

							int hh = 0;
							if (hh <= h) {
								do {
									int ww = 0;
									if (w < ww) {
										++hh;
									} else {
										do {
											if (i1 > ud.M[plane][x + hh][y + ww]) {
												ud.M[plane][hh + x][y + ww] = (byte) i1;
											}

											++ww;
										} while (w >= ww);

										++hh;
									}
								} while (hh <= h);
							}
						}
					}

					if (class_bd.boolean_ib && class_nc != null) {
						class_nc.markSolidOccupant(class_bd.h, 20850, class_bd.w, x, class_bd.impenetrable, orientation, y);
					}
				}
			}
		} catch (RuntimeException var25) {
			throw id.a(var25, "ca.B(" + y + ',' + position + ',' + plane + ',' + (class_ua != null ? "{...}" : "null") + ',' + (class_nc != null ? "{...}" : "null") + ',' + orientation + ',' + fileRequest + ',' + x + ',' + unused + ')');
		}
	}

	public static void b (int unused) {
		try {
			attack2 = null;
			preparedVisibilityMap2 = null;
			ints_o = null;
			ints_b = null;
			preparedVisibilityMap = null;
			attack = null;
			rd_d = null;
			rd_p = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ca.A(" + unused + ')');
		}
	}
}
