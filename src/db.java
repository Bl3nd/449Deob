import java.awt.Graphics;

final class db extends sb {
	static int int_v;
	static int int_w;
	static pb archiveFile2;
	static int y;
	static rd lightRedText = md.a((String) "@lre@", (byte) 122);
	static rd compass = md.a((String) "compass", (byte) 115);
	static int B;
	static int C;
	static int D;
	static boolean F = false;
	static int G = 32;
	static int H = 0;
	static int[] I = new int[5];
	static pb archiveFile7;
	static int K;
	static boolean L = false;
	static long[] M = new long[32];
	static int O;
	static int P;
	static int R;
	static oa T;
	static int U;
	static int V;
	static rd X;
	static int Z;
	static int int_cb;
	static rd on2;
	static int int_eb;
	static int int_fb;
	static int int_gb;
	static pb archiveFile1;
	private static rd on = md.a((String) "On", (byte) 120);

	static {
		on2 = on;
		X = md.a("Fehler beim Laden Ihres Spielcharakters)3", (byte) 126);
	}

	private g E;
	private int midiboxVolume;
	private ma Q;
	private boolean loopInfinite;
	private byte[] Y;
	private boolean boolean_ab;

	db (g class_g) {
		try {
			this.E = class_g;
		} catch (RuntimeException var3) {
			throw id.a(var3, "db.<init>(" + (class_g != null ? "{...}" : "null") + ')');
		}
	}

	static void a (boolean unused, f class_f) {
		try {
			++B;
			class_f.Jb = 0;
			int i = class_f.int_uc + -ce.y;
			if (class_f.int_dc == 0) {
				class_f.int_ac = 1024;
			} else if (class_f.int_dc == 1) {
				class_f.int_ac = 1536;
			} else if (class_f.int_dc == 2) {
				class_f.int_ac = 0;
			} else if (class_f.int_dc == 3) {
				class_f.int_ac = 512;
			}

			int i1 = class_f.Zb * 128 + 64 * class_f.int_kc;
			int i2 = class_f.int_kc * 64 + class_f.Eb * 128;
			class_f.x_ += (i1 - class_f.x_) / i;
			class_f.y_ += (-class_f.y_ + i2) / i;
		} catch (RuntimeException var5) {
			throw id.a(var5, "db.N(" + unused + ',' + (class_f != null ? "{...}" : "null") + ')');
		}
	}

	static int a (int w, int h, int unused, int i, int i1, int i2, int i3) {
		try {
			++int_eb;
			i2 &= 3;
			int i4;
			if ((i & 1) == 1) {
				i4 = w;
				w = h;
				h = i4;
			}

			return i2 == 0 ? i3 : i2 == 1 ? 1 - w + -i1 + 7 : i2 == 2 ? -i3 + 7 - (h - 1) : i1;
		} catch (RuntimeException var8) {
			throw id.a(var8, "db.L(" + w + ',' + h + ',' + unused + ',' + i + ',' + i1 + ',' + i2 + ',' + i3 + ')');
		}
	}

	static void b (int val, int unused) {
		int dummy = client.int_tb;
		try {
			++O;
			if (val >= 0) {
				int i3 = kd.ints_f[val];
				int i2 = sa.mb[val];
				int i4 = sb.ints_k[val];
				if (i2 >= 2000) {
					i2 -= 2000;
				}

				int value = pe.q[val];
				if (wb.int_db != 0 && i2 != 1004) {
					w.h = true;
					wb.int_db = 0;
				}

				td var6;
				if (i2 == 11) {
					td class_td = f.Lc[value];
					if (class_td != null) {
						bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, -97, 0, 0, 1);
						b.int_ed = 0;
						++bb.int_a;
						ja.int_k = sb.int_b;
						q.y = 2;
						ka.Rb = wb.nb;
						ie.writeStream.writeOpcode(8, 31);
						ie.writeStream.writeLEShortA(-19962, value);
					}
				}

				nd var18;
				if (i2 == 4) {
					nd class_nd = o.a((byte) -74, i4, i3);
					if (class_nd != null) {
						od.d((byte) -124);
						ba.a(se.a((byte) 69, fc.a(class_nd, 1572721824)), i3, 126, i4);
						we.f = 0;
						F = true;
						sd.P = cf.a(class_nd, true);
						if (sd.P == null) {
							sd.P = qb.null_;
						}

						if (class_nd.gb) {
							ee.rd_t = pc.a((byte) 125, new rd[]{class_nd.Xc, u.whiteText});
						} else {
							ee.rd_t = pc.a((byte) 127, new rd[]{me.z, class_nd.Gb, u.whiteText});
						}

						if (d.int_g == 16 && !class_nd.gb) {
							F = true;
							pd.g = 3;
							pe.l = true;
						}
					}
				} else {
					if (i2 == 51 && d.a((byte) -41, i4, value, i3)) {
						++qe.C;
						ie.writeStream.writeOpcode(8, 174);
						ie.writeStream.writeInt_V1(23538, m.int_l);
						ie.writeStream.writeShortA((byte) 16, jd.int_b);
						ie.writeStream.writeShortA((byte) 93, i3 + kd.int_w);
						ie.writeStream.writeShort(32767 & value >> 14, (byte) 125);
						ie.writeStream.writeLEShort(jc.X + i4, (byte) -116);
						ie.writeStream.writeShortA((byte) 98, hc.tb);
					} else if (i2 == 57) {
						ie.writeStream.writeOpcode(8, 29);
						ie.writeStream.writeLEShort(value, (byte) 93);
						ie.writeStream.writeInt(-7155, i4);
						++jb.C;
						ie.writeStream.writeLEShort(i3, (byte) -112);
						sa.rb = 0;
						ja.int_h = i3;
						wa.xb = 2;
						if (sa.zb == i4 >> 16) {
							wa.xb = 1;
						}

						if (ta.Sb == i4 >> 16) {
							wa.xb = 3;
						}

						ta.Ob = i4;
					} else if (i2 == 1002) {
						++cf.int_b;
						d.a((byte) 113, i4, value, i3);
						ie.writeStream.writeOpcode(8, 248);
						ie.writeStream.writeShort(jc.X + i4, (byte) 18);
						ie.writeStream.writeShortA((byte) 14, (536865628 & value) >> 14);
						ie.writeStream.writeShortA((byte) 22, i3 + kd.int_w);
					}

					boolean var14;
					if (i2 == 44) {
						++ha.int_hb;
						boolean flag = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, 30, 0, 0, 0);
						if (!flag) {
							bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, 17, 0, 0, 1);
						}

						q.y = 2;
						ka.Rb = wb.nb;
						ja.int_k = sb.int_b;
						b.int_ed = 0;
						ie.writeStream.writeOpcode(8, 234);
						ie.writeStream.writeShortA((byte) 100, value);
						ie.writeStream.writeLEShort(kd.int_w + i3, (byte) -104);
						ie.writeStream.writeShortA((byte) 36, i4 + jc.X);
					}

					int var7;
					long var8;
					rd var15;
					if (i2 == 7 || i2 == 2 || i2 == 9 || i2 == 21) {
						rd class_rd = ta.xb[val];
						int i1 = class_rd.a((byte) 89, u.whiteText);
						if (i1 != -1) {
							long l = class_rd.a(false, i1 + 5).d(-6488).i(29486);
							if (i2 == 7) {
								se.a(-125, l);
							}

							if (i2 == 2) {
								jd.a((byte) -128, l);
							}

							if (i2 == 9) {
								nd.a(l, true);
							}

							if (i2 == 21) {
								i.a(0, l);
							}
						}
					} else if (i2 == 1003) {
						ja.int_k = sb.int_b;
						ka.Rb = wb.nb;
						q.y = 2;
						b.int_ed = 0;
						++ha.int_ab;
						ie.writeStream.writeOpcode(8, 246);
						ie.writeStream.writeLEShort(value >> 14 & 32767, (byte) -115);
					} else if (i2 == 26) {
						td class_td = f.Lc[value];
						if (class_td != null) {
							++ee.int_a;
							bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, -89, 0, 0, 1);
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							q.y = 2;
							ka.Rb = wb.nb;
							ie.writeStream.writeOpcode(8, 138);
							ie.writeStream.writeLEShortA(-19962, value);
						}
					} else if (i2 == 43) {
						td class_td = f.Lc[value];
						if (class_td != null) {
							bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, -85, 0, 0, 1);
							++wc.k;
							b.int_ed = 0;
							ja.int_k = sb.int_b;
							q.y = 2;
							ka.Rb = wb.nb;
							ie.writeStream.writeOpcode(8, 51);
							ie.writeStream.writeShort(value, (byte) 100);
						}
					}

					b var16;
					if (i2 == 54) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, 113, 0, 0, 1);
							q.y = 2;
							ja.int_k = sb.int_b;
							++uc.xc;
							b.int_ed = 0;
							ka.Rb = wb.nb;
							ie.writeStream.writeOpcode(8, 161);
							ie.writeStream.writeLEShort(value, (byte) -125);
						}
					} else if (i2 == 53) {
						++C;
						ie.writeStream.writeOpcode(8, 224);
						ie.writeStream.writeInt(-7155, i4);
						nd class_nd = bf.b('\uffff', i4);
						if (class_nd != null && class_nd.Yb != null && class_nd.Yb[0][0] == 5) {
							int index = class_nd.Yb[0][1];
							if (ta.Pb[index] != class_nd.ints_ic[0]) {
								ta.Pb[index] = class_nd.ints_ic[0];
								kd.a((byte) -110, index);
								F = true;
							}
						}
					} else if (i2 == 5) {
						d.a((byte) -127, i4, value, i3);
						++o.j;
						ie.writeStream.writeOpcode(8, 98);
						ie.writeStream.writeShortA((byte) 62, i4 + jc.X);
						ie.writeStream.writeLEShortA(-19962, i3 + kd.int_w);
						ie.writeStream.writeShortA((byte) 90, (536869743 & value) >> 14);
					} else if (i2 == 46) {
						++df.int_t;
						d.a((byte) -65, i4, value, i3);
						ie.writeStream.writeOpcode(8, 226);
						ie.writeStream.writeLEShort(i3 + kd.int_w, (byte) 116);
						ie.writeStream.writeLEShortA(-19962, jc.X + i4);
						ie.writeStream.writeShort((value & 536869676) >> 14, (byte) 127);
					} else if (i2 == 28) {
						++pd.M;
						ie.writeStream.writeOpcode(8, 21);
						ie.writeStream.writeLEShortA(-19962, -3);
						ie.writeStream.writeShort(i3, (byte) 42);
						ie.writeStream.writeInt_V1(23538, i4);
						ta.Ob = i4;
						wa.xb = 2;
						if (i4 >> 16 == sa.zb) {
							wa.xb = 1;
						}

						ja.int_h = i3;
						sa.rb = 0;
						if (i4 >> 16 == ta.Sb) {
							wa.xb = 3;
						}
					} else if (i2 == 42) {
						nd class_nd = bf.b('\uffff', i4);
						boolean flag = true;
						if (class_nd != null && class_nd.Sb > 0) {
							flag = l.a((byte) -39, class_nd);
						}

						if (flag) {
							ie.writeStream.writeOpcode(8, 224);
							++C;
							ie.writeStream.writeInt(-7155, i4);
						}
					} else if (i2 == 8 && d.a((byte) 117, i4, value, i3)) {
						++od.zb;
						ie.writeStream.writeOpcode(8, 7);
						ie.writeStream.writeLEShortA(-19962, kd.int_w + i3);
						ie.writeStream.writeShortA((byte) 46, 32767 & value >> 14);
						ie.writeStream.writeLEInt(vc.C, 357);
						ie.writeStream.writeShort(i4 + jc.X, (byte) 83);
						ie.writeStream.writeLEShort(lc.j, (byte) 66);
					} else if (i2 == 10) {
						++int_v;
						ie.writeStream.writeOpcode(8, 6);
						ie.writeStream.writeShort(i3, (byte) 37);
						ie.writeStream.writeLEShortA(-19962, value);
						ie.writeStream.writeInt_V1(23538, i4);
						wa.xb = 2;
						ja.int_h = i3;
						if (i4 >> 16 == sa.zb) {
							wa.xb = 1;
						}

						ta.Ob = i4;
						sa.rb = 0;
						if (ta.Sb == i4 >> 16) {
							wa.xb = 3;
						}
					} else if (i2 == 47) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							++od.Fb;
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, 123, 0, 0, 1);
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							ka.Rb = wb.nb;
							q.y = 2;
							ie.writeStream.writeOpcode(8, 168);
							ie.writeStream.writeLEShortA(-19962, value);
						}
					} else if (i2 == 35) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							++ja.int_i;
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, -82, 0, 0, 1);
							ka.Rb = wb.nb;
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							q.y = 2;
							ie.writeStream.writeOpcode(8, 109);
							ie.writeStream.writeShort(value, (byte) 103);
						}
					} else if (i2 == 22) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, 15, 0, 0, 1);
							q.y = 2;
							++rb.c;
							ka.Rb = wb.nb;
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							ie.writeStream.writeOpcode(8, 113);
							ie.writeStream.writeLEShort(value, (byte) -106);
						}
					}

					if (i2 == 47 && ce.int_l == -1) {
						ja.a(i4, 58, i3);
						n.ob = i3;
						ce.int_l = i4;
					}

					if (i2 == 14) {
						td class_td = f.Lc[value];
						if (class_td != null) {
							bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, 8, 0, 0, 1);
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							ka.Rb = wb.nb;
							q.y = 2;
							ie.writeStream.writeOpcode(8, 30);
							ie.writeStream.writeLEShortA(-19962, hc.tb);
							++n.lb;
							ie.writeStream.writeInt_V2(m.int_l, -1762115368);
							ie.writeStream.writeShort(value, (byte) 50);
							ie.writeStream.writeLEShortA(-19962, jd.int_b);
						}
					} else if (i2 == 25) {
						ie.writeStream.writeOpcode(8, 224);
						ie.writeStream.writeInt(-7155, i4);
						nd class_nd = bf.b('\uffff', i4);
						++C;
						if (class_nd != null && class_nd.Yb != null && class_nd.Yb[0][0] == 5) {
							int index = class_nd.Yb[0][1];
							ta.Pb[index] = 1 - ta.Pb[index];
							kd.a((byte) -77, index);
							F = true;
						}
					} else if (i2 == 37) {
						++ge.A;
						ie.writeStream.writeOpcode(8, 181);
						ie.writeStream.writeInt_V2(i4, -1762115368);
						ie.writeStream.writeLEShort(value, (byte) 124);
						ie.writeStream.writeLEShortA(-19962, i3);
						ja.int_h = i3;
						ta.Ob = i4;
						wa.xb = 2;
						if (sa.zb == i4 >> 16) {
							wa.xb = 1;
						}

						if (ta.Sb == i4 >> 16) {
							wa.xb = 3;
						}

						sa.rb = 0;
					} else if (i2 == 58) {
						boolean flag = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, -115, 0, 0, 0);
						++kd.int_b;
						if (!flag) {
							bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, -98, 0, 0, 1);
						}

						b.int_ed = 0;
						ja.int_k = sb.int_b;
						q.y = 2;
						ka.Rb = wb.nb;
						ie.writeStream.writeOpcode(8, 48);
						ie.writeStream.writeShortA((byte) 105, i3 + kd.int_w);
						ie.writeStream.writeShortA((byte) 90, i4 + jc.X);
						ie.writeStream.writeShort(value, (byte) 99);
					} else if (i2 == 1001) {
						b.int_ed = 0;
						ja.int_k = sb.int_b;
						++bc.z;
						ka.Rb = wb.nb;
						q.y = 2;
						ie.writeStream.writeOpcode(8, 215);
						ie.writeStream.writeLEShortA(-19962, value);
					}

					int var10;
					if (i2 == 22 || i2 == 27) {
						rd class_rd = ta.xb[val];
						int i = class_rd.a((byte) 46, u.whiteText);
						if (i != -1) {
							class_rd = class_rd.a(false, 5 + i).d(-6488);
							//noinspection ConstantConditions
							rd class_rd2 = class_rd.c(unused + 4012).e(-88);
							boolean found = false;
							int i1 = 0;
							if (b.int_hd > i1) {
								do {
									td class_td = f.Lc[gelb_.stringBuffer[i1]];
									if (class_td != null && class_td.Gd != null && class_td.Gd.b(class_rd2, true)) {
										bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, 8, 0, 0, 1);
										if (i2 == 22) {
											++qb.int_db;
											ie.writeStream.writeOpcode(8, 210);
											ie.writeStream.writeShortA((byte) 67, r.R[i1]);
										}

										if (i2 == 27) {
											++wc.k;
											ie.writeStream.writeOpcode(8, 51);
											ie.writeStream.writeShort(r.R[i1], (byte) 79);
										}

										found = true;
										break;
									}

									++i1;
								} while (b.int_hd > i1);
							}

							if (!found) {
								n.a(kd.rd_v, pc.a((byte) 127, new rd[]{ce.unableToFind_2, class_rd2}), true, 0);
							}
						}
					} else if (i2 == 49) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							++eb.int_u;
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, -91, 0, 0, 1);
							b.int_ed = 0;
							ja.int_k = sb.int_b;
							q.y = 2;
							ka.Rb = wb.nb;
							ie.writeStream.writeOpcode(8, 218);
							ie.writeStream.writeLEShortA(-19962, value);
						}
					} else if (i2 == 16) {
						td class_td = f.Lc[value];
						if (class_td != null) {
							bb.a(class_td.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_td.Hc[0], 1, 0, 47, 0, 0, 1);
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							ka.Rb = wb.nb;
							q.y = 2;
							++tc.M;
							ie.writeStream.writeOpcode(8, 99);
							ie.writeStream.writeInt_V2(vc.C, -1762115368);
							ie.writeStream.writeLEShortA(-19962, value);
							ie.writeStream.writeLEShortA(-19962, lc.j);
						}
					} else if (i2 == 18) {
						++pc.int_j;
						boolean flag = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, 98, 0, 0, 0);
						if (!flag) {
							bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, -95, 0, 0, 1);
						}

						q.y = 2;
						b.int_ed = 0;
						ja.int_k = sb.int_b;
						ka.Rb = wb.nb;
						ie.writeStream.writeOpcode(8, 192);
						ie.writeStream.writeShortA((byte) 121, i3 + kd.int_w);
						ie.writeStream.writeLEShort(jc.X + i4, (byte) 54);
						ie.writeStream.writeLEShortA(-19962, value);
					} else if (i2 == 30) {
						b class_b = ta.Nb[value];
						if (class_b != null) {
							++ib.k;
							bb.a(class_b.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, class_b.Hc[0], 1, 0, -126, 0, 0, 1);
							ka.Rb = wb.nb;
							b.int_ed = 0;
							ja.int_k = sb.int_b;
							q.y = 2;
							ie.writeStream.writeOpcode(8, 103);
							ie.writeStream.writeShort(value, (byte) 108);
							ie.writeStream.writeLEShortA(-19962, hc.tb);
							ie.writeStream.writeInt_V2(m.int_l, -1762115368);
							ie.writeStream.writeShortA((byte) 106, jd.int_b);
						}
					}

					if (i2 == 13) {
						++t.k;
						d.a((byte) -37, i4, value, i3);
						ie.writeStream.writeOpcode(8, 136);
						ie.writeStream.writeLEShort(jc.X + i4, (byte) 95);
						ie.writeStream.writeLEShortA(-19962, (536861457 & value) >> 14);
						ie.writeStream.writeShort(kd.int_w + i3, (byte) 72);
					}

					if (~i2 == -24) {
						od.d((byte) -124);
						hc.tb = i3;
						F = true;
						jd.int_b = value;
						m.int_l = i4;
						we.f = 1;
						ca.rd_d = pc.a((byte) 125, new rd[]{lightRedText, u.a(value, false).Rb, u.whiteText});
						if (ca.rd_d == null) {
							ca.rd_d = we.i;
						}

					} else {
						if (i2 == 1) {
							++bf.int_a;
							ie.writeStream.writeOpcode(8, 229);
							ie.writeStream.writeShort(i3, (byte) 60);
							ie.writeStream.writeInt_V2(i4, unused + -1762115365);
							ie.writeStream.writeLEShort(value, (byte) 39);
							sa.rb = 0;
							ja.int_h = i3;
							wa.xb = 2;
							if (i4 >> 16 == sa.zb) {
								wa.xb = 1;
							}

							ta.Ob = i4;
							if (~(i4 >> 16) == ~ta.Sb) {
								wa.xb = 3;
							}
						}

						if (~i2 == -34) {
							var14 = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, -117, 0, 0, 0);
							if (!var14) {
								bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, -113, 0, 0, 1);
							}

							ka.Rb = wb.nb;
							ja.int_k = sb.int_b;
							++n.jb;
							q.y = 2;
							b.int_ed = 0;
							ie.writeStream.writeOpcode(unused + 11, 57);
							ie.writeStream.writeShort(lc.j, (byte) 32);
							ie.writeStream.writeShortA((byte) 114, value);
							ie.writeStream.writeLEShort(jc.X + i4, (byte) 110);
							ie.writeStream.writeShort(kd.int_w + i3, (byte) 101);
							ie.writeStream.writeLEInt(vc.C, unused ^ -360);
						}

						if (i2 == 1005) {
							q.y = 2;
							ka.Rb = wb.nb;
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							var16 = ta.Nb[value];
							if (var16 != null) {
								tb var20 = var16.tb_md;
								if (var20.Fb != null) {
									var20 = var20.f(-1);
								}

								++bc.w;
								ie.writeStream.writeOpcode(8, 105);
								ie.writeStream.writeLEShort(var20.zb, (byte) -119);
							}
						}

						if (~i2 == -16) {
							++eb.int_d;
							ie.writeStream.writeOpcode(8, 106);
							ie.writeStream.writeLEShortA(unused + -19959, lc.j);
							ie.writeStream.writeInt(-7155, i4);
							ie.writeStream.writeInt_V1(23538, vc.C);
							ie.writeStream.writeLEShort(i3, (byte) -128);
						}

						if (i2 == 17) {
							var15 = ta.xb[val];
							var7 = var15.a((byte) 122, u.whiteText);
							if (var7 != -1) {
								label493:
								{
									if (~sa.zb == 0) {
										te.d((byte) 99);
										if (~u.int_db == 0) {
											break label493;
										}

										kd.C = var15.a(false, 5 + var7).d(-6488);
										ce.boolean_s = false;
										se.o = sa.zb = u.int_db;
										if (dummy == 0) {
											break label493;
										}
									}

									n.a(kd.rd_v, ba.pleaseCloseTheInterfaceBeforeUsingReportAbuse2, true, 0);
									if (h.y != null) {
										n.a(kd.rd_v, h.y, true, 0);
									}
								}
							}
						}

						if (~i2 == -25) {
							d.a(i3, i4, value, 0);
						}

						if (~i2 == -35) {
							var6 = f.Lc[value];
							if (var6 != null) {
								++qb.int_db;
								bb.a(var6.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, var6.Hc[0], 1, 0, 104, 0, 0, 1);
								ka.Rb = wb.nb;
								q.y = 2;
								ja.int_k = sb.int_b;
								b.int_ed = 0;
								ie.writeStream.writeOpcode(unused + 11, 210);
								ie.writeStream.writeShortA((byte) 48, value);
							}
						}

						if (i2 == 38) {
							++hf.int_bb;
							var14 = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, 12, 0, 0, 0);
							if (!var14) {
								bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, -122, 0, 0, 1);
							}

							ka.Rb = wb.nb;
							b.int_ed = 0;
							ja.int_k = sb.int_b;
							q.y = 2;
							ie.writeStream.writeOpcode(unused ^ -11, 159);
							ie.writeStream.writeShort(jd.int_b, (byte) 17);
							ie.writeStream.writeShort(kd.int_w + i3, (byte) 62);
							ie.writeStream.writeLEShort(hc.tb, (byte) 107);
							ie.writeStream.writeLEShortA(-19962, jc.X + i4);
							ie.writeStream.writeLEInt(m.int_l, 357);
							ie.writeStream.writeLEShortA(unused ^ 19963, value);
						}

						if (i2 == 50) {
							ie.writeStream.writeOpcode(8, 117);
							ie.writeStream.writeLEShort(i3, (byte) -117);
							++we.k;
							ie.writeStream.writeInt_V1(23538, i4);
							ie.writeStream.writeLEShortA(unused + -19959, value);
							wa.xb = 2;
							sa.rb = 0;
							if (~(i4 >> 16) == ~sa.zb) {
								wa.xb = 1;
							}

							ja.int_h = i3;
							if (~ta.Sb == ~(i4 >> 16)) {
								wa.xb = 3;
							}

							ta.Ob = i4;
						}

						if (~i2 == -7) {
							++cc.int_b;
							ie.writeStream.writeOpcode(8, 243);
							ie.writeStream.writeInt_V2(i4, -1762115368);
							ie.writeStream.writeShort(value, (byte) 123);
							ie.writeStream.writeShort(i3, (byte) 124);
							ta.Ob = i4;
							ja.int_h = i3;
							wa.xb = 2;
							sa.rb = 0;
							if (~(i4 >> 16) == ~sa.zb) {
								wa.xb = 1;
							}

							if (ta.Sb == i4 >> 16) {
								wa.xb = 3;
							}
						}

						if (~i2 == -41) {
							var15 = ta.xb[val];
							var7 = var15.a((byte) 84, u.whiteText);
							if (var7 != -1) {
								var8 = var15.a(false, var7 + 5).d(-6488).i(29486);
								var10 = -1;
								int var21 = 0;
								if (dummy != 0 || ~var21 > ~u.int_eb) {
									do {
										if (var8 == cc.longs_f[var21]) {
											var10 = var21;
											if (dummy == 0) {
												break;
											}
										}

										++var21;
									} while (~var21 > ~u.int_eb);
								}

								if (~var10 != 0 && ee.ints_k[var10] > 0) {
									w.h = true;
									ad.boolean_v = true;
									kd.E = kd.rd_v;
									wb.int_db = 0;
									hb.int_d = 3;
									ff.long_e = cc.longs_f[var10];
									kd.z = pc.a((byte) 125, new rd[]{vc.L, ad.rds_k[var10]});
								}
							}
						}

						if (i2 == 36) {
							++ud.A;
							ie.writeStream.writeOpcode(8, 33);
							ie.writeStream.writeLEShort(value, (byte) 43);
							ie.writeStream.writeInt(unused + -7152, i4);
							ie.writeStream.writeLEShortA(-19962, i3);
							sa.rb = 0;
							ta.Ob = i4;
							ja.int_h = i3;
							wa.xb = 2;
							if (~(i4 >> 16) == ~sa.zb) {
								wa.xb = 1;
							}

							if (~(i4 >> 16) == ~ta.Sb) {
								wa.xb = 3;
							}
						}

						if (i2 == 39) {
							te.d((byte) 99);
						}

						if (i2 == 55) {
							q.a(b.int_ld, (byte) -90);
							w.h = true;
							b.int_ld = -1;
						}

						if (i2 == 32) {
							var16 = ta.Nb[value];
							if (var16 != null) {
								++sd.G;
								bb.a(var16.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, var16.Hc[0], 1, 0, -9, 0, 0, 1);
								ja.int_k = sb.int_b;
								ka.Rb = wb.nb;
								q.y = 2;
								b.int_ed = 0;
								ie.writeStream.writeOpcode(8, 176);
								ie.writeStream.writeLEInt(vc.C, 357);
								ie.writeStream.writeLEShort(lc.j, (byte) -124);
								ie.writeStream.writeShort(value, (byte) 44);
							}
						}

						if (~i2 == -53) {
							d.a((byte) 127, i4, value, i3);
							++ca.int_n;
							ie.writeStream.writeOpcode(unused + 11, 70);
							ie.writeStream.writeLEShort(32767 & value >> 14, (byte) 50);
							ie.writeStream.writeLEShortA(-19962, i4 + jc.X);
							ie.writeStream.writeShortA((byte) 92, kd.int_w + i3);
						}

						if (~i2 == -30) {
							++be.int_p;
							ie.writeStream.writeOpcode(8, 184);
							ie.writeStream.writeShort(i3, (byte) 90);
							ie.writeStream.writeLEInt(m.int_l, 357);
							ie.writeStream.writeLEShortA(-19962, hc.tb);
							ie.writeStream.writeShortA((byte) 91, jd.int_b);
							ie.writeStream.writeLEShort(value, (byte) -113);
							ie.writeStream.writeInt_V1(23538, i4);
							ja.int_h = i3;
							sa.rb = 0;
							wa.xb = 2;
							if (sa.zb == i4 >> 16) {
								wa.xb = 1;
							}

							if (ta.Sb == i4 >> 16) {
								wa.xb = 3;
							}

							ta.Ob = i4;
						}

						if (i2 == 31) {
							ie.writeStream.writeOpcode(8, 74);
							++me.T;
							ie.writeStream.writeLEShort(value, (byte) -114);
							ie.writeStream.writeLEShortA(-19962, i3);
							ie.writeStream.writeInt_V2(i4, unused ^ 1762115365);
							ja.int_h = i3;
							ta.Ob = i4;
							sa.rb = 0;
							wa.xb = 2;
							if (i4 >> 16 == sa.zb) {
								wa.xb = 1;
							}

							if (ta.Sb == i4 >> 16) {
								wa.xb = 3;
							}
						}

						if (i2 == 12) {
							var6 = f.Lc[value];
							if (var6 != null) {
								++hf.ib;
								bb.a(var6.xc[0], af.td_p.Hc[0], af.td_p.xc[0], 2, false, var6.Hc[0], 1, 0, unused + 16, 0, 0, 1);
								q.y = 2;
								ja.int_k = sb.int_b;
								b.int_ed = 0;
								ka.Rb = wb.nb;
								ie.writeStream.writeOpcode(8, 183);
								ie.writeStream.writeShort(value, (byte) 109);
							}
						}

						if (~i2 == -57) {
							var14 = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, -104, 0, 0, 0);
							++ta.int_sb;
							if (!var14) {
								bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, 35, 0, 0, 1);
							}

							ja.int_k = sb.int_b;
							q.y = 2;
							b.int_ed = 0;
							ka.Rb = wb.nb;
							ie.writeStream.writeOpcode(8, 62);
							ie.writeStream.writeShortA((byte) 40, i3 + kd.int_w);
							ie.writeStream.writeShortA((byte) 127, i4 - -jc.X);
							ie.writeStream.writeLEShort(value, (byte) -110);
						}

						if (~i2 == -1007) {
							label607:
							{
								var18 = bf.b('\uffff', i4);
								if (var18 == null || var18.zc[i3] < 100000) {
									ie.writeStream.writeOpcode(unused + 11, 215);
									++bc.z;
									ie.writeStream.writeLEShortA(-19962, value);
									if (dummy == 0) {
										break label607;
									}
								}

								n.a(kd.rd_v, pc.a((byte) 125, new rd[]{
										bf.a(var18.zc[i3], unused + -31763),
										af.rd_h,
										u.a(value, false).Rb
								}), true, 0);
							}

							ta.Ob = i4;
							sa.rb = 0;
							ja.int_h = i3;
							wa.xb = 2;
							if (~sa.zb == ~(i4 >> 16)) {
								wa.xb = 1;
							}

							if (~ta.Sb == ~(i4 >> 16)) {
								wa.xb = 3;
							}
						}

						if (~i2 == -49) {
							ie.writeStream.writeOpcode(unused ^ -11, 25);
							++a.bb;
							ie.writeStream.writeLEShortA(-19962, value);
							ie.writeStream.writeShort(i3, (byte) 99);
							ie.writeStream.writeInt_V2(i4, -1762115368);
							wa.xb = 2;
							ja.int_h = i3;
							ta.Ob = i4;
							sa.rb = 0;
							if (i4 >> 16 == sa.zb) {
								wa.xb = 1;
							}

							if (i4 >> 16 == ta.Sb) {
								wa.xb = 3;
							}
						}

						if (~i2 == -42) {
							ie.writeStream.writeOpcode(8, 84);
							ie.writeStream.writeLEShort(i3, (byte) -128);
							++jd.int_n;
							ie.writeStream.writeInt_V2(i4, -1762115368);
							ie.writeStream.writeLEShortA(-19962, lc.j);
							ie.writeStream.writeShort(value, (byte) 38);
							ie.writeStream.writeInt(-7155, vc.C);
							ta.Ob = i4;
							wa.xb = 2;
							if (~(i4 >> 16) == ~sa.zb) {
								wa.xb = 1;
							}

							ja.int_h = i3;
							sa.rb = 0;
							if (~(i4 >> 16) == ~ta.Sb) {
								wa.xb = 3;
							}
						}

						if (i2 == 19) {
							label436:
							{
								if (!s.ub) {
									pc.o.r(ce.plane, -4 + wb.nb, -4 + sb.int_b);
									if (dummy == 0) {
										break label436;
									}
								}

								pc.o.r(ce.plane, i3 - 4, i4 - 4);
							}
						}

						if (i2 == 3) {
							++me.B;
							var14 = bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 0, 0, 112, 0, 0, 0);
							if (!var14) {
								bb.a(i3, af.td_p.Hc[0], af.td_p.xc[0], 2, false, i4, 1, 0, -89, 0, 0, 1);
							}

							q.y = 2;
							ka.Rb = wb.nb;
							ja.int_k = sb.int_b;
							b.int_ed = 0;
							ie.writeStream.writeOpcode(8, 13);
							ie.writeStream.writeShort(i3 - -kd.int_w, (byte) 121);
							ie.writeStream.writeLEShortA(-19962, value);
							ie.writeStream.writeShortA((byte) 23, i4 + jc.X);
						}

						if (~we.f != -1) {
							F = true;
							we.f = 0;
						}

						if (tc.K) {
							od.d((byte) -124);
							F = true;
						}

						if (unused != -3) {
							f(-86);
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "db.Q(" + val + ',' + unused + ')');
		}
	}

	static void f (int unused) {
		try {
			++int_fb;
			int x = uc.gc;
			int width = ud.I;
			int y = n.eb;
			int height = wc.n;
			int color = 0x5d5447;
			ic.c(x, y, width, height, color);
			ic.c(1 + x, y + 1, -2 + width, 16, 0);
			ic.a(x + 1, 18 + y, -2 + width, -19 + height, 0);
			client.Y.b(jb.V, x + 3, y + 14, color);
			int i = pb.H;
			int i1 = la.t;
			if (bf.int_d == 0) {
				i -= 4;
				i1 -= 4;
			}

			if (bf.int_d == 1) {
				i -= 553;
				i1 -= 205;
			}

			if (bf.int_d == 2) {
				i1 -= 357;
				i -= 17;
			}

			int i2 = 0;
			if (i2 < id.rb) {
				do {
					int i3 = y - (-31 + -((-i2 + id.rb + -1) * 15));
					int color1 = 16777215;
					if (x < i && i < x + width && -13 + i3 < i1 && i1 < i3 + 3) {
						color1 = 16776960;
					}

					client.Y.c(ta.xb[i2], 3 + x, i3, color1, true);
					++i2;
				} while (i2 < id.rb);
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "db.O(" + unused + ')');
		}
	}

	static void a (byte unused, int i, int[] ints, int i1, boolean flag) {
		try {
			++K;
			ka.Zb.a(-1926);
			pe.g.a(0, 0);
			if (flag) {
				if (ints[i] != -1) {
					if (i == 0) {
						pc.x.a(22, 10);
					} else if (i == 1) {
						id.fb.a(54, 8);
					} else if (i == 2) {
						id.fb.a(82, 8);
					} else if (i == 3) {
						le.oa_pb.a(110, 8);
					} else if (i == 4) {
						ab.oa_q.a(153, 8);
					} else if (i == 5) {
						ab.oa_q.a(181, 8);
					} else if (i == 6) {
						se.k.a(209, 9);
					}
				}

				if (ints[0] != -1 && i1 != 0) {
					dc.oas_b[0].a(29, 13);
				}

				if (ints[1] != -1 && i1 != 1) {
					dc.oas_b[1].a(53, 11);
				}

				if (ints[2] != -1 && i1 != 2) {
					dc.oas_b[2].a(82, 11);
				}

				if (ints[3] != -1 && i1 != 3) {
					dc.oas_b[3].a(115, 12);
				}

				if (ints[4] != -1 && i1 != 4) {
					dc.oas_b[4].a(153, 13);
				}

				if (ints[5] != -1 && i1 != 5) {
					dc.oas_b[5].a(180, 11);
				}

				if (ints[6] != -1 && i1 != 6) {
					dc.oas_b[6].a(208, 13);
				}
			}

			dc.A.a(-1926);
			ke.zb.a(0, 0);
			if (flag) {
				if (ints[i] != -1) {
					if (i == 7) {
						hf.yb.a(42, 0);
					}

					if (i == 8) {
						ib.oa_r.a(74, 0);
					}

					if (i == 9) {
						ib.oa_r.a(102, 0);
					}

					if (i == 10) {
						ba.oa_h.a(130, 1);
					}

					if (i == 11) {
						fc.oa_v.a(173, 0);
					}

					if (i == 12) {
						fc.oa_v.a(201, 0);
					}

					if (i == 13) {
						ie.p.a(229, 0);
					}
				}

				if (ints[8] != -1 && i1 != 8) {
					dc.oas_b[7].a(74, 2);
				}

				if (~ints[9] != 0 && i1 != 9) {
					dc.oas_b[8].a(102, 3);
				}

				if (ints[10] != -1 && ~i1 != -11) {
					dc.oas_b[9].a(137, 4);
				}

				if (ints[11] != -1 && ~i1 != -12) {
					dc.oas_b[10].a(174, 2);
				}

				if (~ints[12] != 0 && ~i1 != -13) {
					dc.oas_b[11].a(201, 2);
				}

				if (ints[13] != -1 && ~i1 != -14) {
					dc.oas_b[12].a(226, 2);
				}
			}

			try {
				Graphics graphics = rd.canvas.getGraphics();
				ka.Zb.a(0, 516, 160, graphics);
				dc.A.a(0, 496, 466, graphics);
			} catch (Exception var6) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "db.P(" + unused + ',' + i + ',' + (ints != null ? "{...}" : "null") + ',' + i1 + ',' + flag + ')');
		}
	}

	public static void b (boolean unused) {
		try {
			archiveFile1 = null;
			M = null;
			on = null;
			lightRedText = null;
			X = null;
			archiveFile7 = null;
			I = null;
			archiveFile2 = null;
			compass = null;
			on2 = null;
			T = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "db.U(" + unused + ')');
		}
	}

	static boolean a (byte unused, rd class_rd) {
		try {
			++D;
			if (class_rd == null) {
				return false;
			} else {
				int index = 0;
				while (index < u.int_eb) {
					if (class_rd.b(ad.rds_k[index], true)) {
						return true;
					}

					++index;
				}

				return class_rd.b(af.td_p.Gd, true);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "db.S(" + unused + ',' + "{...}" + ')');
		}
	}

	static void g (int unused) {
		try {
			le.cb.c(-92);
			ec.dd_j.c(-104);
			td.qd.c(-101);
			qc.J.c(-99);
			++int_w;
		} catch (RuntimeException var2) {
			throw id.a(var2, "db.T(" + unused + ')');
		}
	}

	static void h (int unused) {
		try {
			++int_gb;
			int i = ub.L + af.td_p.x_;
			if (pc.C[96]) {
				sa.Gb += (-sa.Gb + -24) / 2;
			} else if (!pc.C[97]) {
				sa.Gb /= 2;
			} else {
				sa.Gb += (-sa.Gb + 24) / 2;
			}

			if (pc.C[98]) {
				jc.C += (-jc.C + 12) / 2;
			} else if (pc.C[99]) {
				jc.C += (-12 - jc.C) / 2;
			} else {
				jc.C /= 2;
			}

			o.w = sa.Gb / 2 + o.w & 2047;
			nb.m += jc.C / 2;
			int i1 = af.td_p.y_ + gd.int_f;
			if (nb.m < 128) {
				nb.m = 128;
			}

			if (~(-i + ta.Vb) > 499 || ta.Vb + -i > 500 || -i1 + r.z < -500 || ~(r.z + -i1) < -501) {
				r.z = i1;
				ta.Vb = i;
			}

			if (nb.m > 383) {
				nb.m = 383;
			}

			int i2 = 0;
			if (i != ta.Vb) {
				ta.Vb += (-ta.Vb + i) / 16;
			}

			if (i1 != r.z) {
				r.z += (-r.z + i1) / 16;
			}

			int xx = ta.Vb >> 7;
			int yy = r.z >> 7;
			int i5 = vc.a(ce.plane, ta.Vb, r.z, (byte) 37);
			if (xx > 3 && yy > 3 && xx < 100 && yy < 100) {
				int x = xx + -4;
				if (xx + 4 >= x) {
					do {
						int y = yy + -4;
						if (y > 4 + yy) {
							++x;
						} else {
							do {
								int plane = ce.plane;
								if (plane < 3 && (d.bytes_j[1][x][y] & 2) == 2) {
									++plane;
								}

								int i6 = i5 + -tb.Yb[plane][x][y];
								if (i6 > i2) {
									i2 = i6;
								}

								++y;
							} while (y <= 4 + yy);

							++x;
						}
					} while (xx + 4 >= x);
				}
			}

			int i6 = 192 * i2;
			if (i6 > 98048) {
				i6 = 98048;
			}

			if (i6 < '耀') {
				i6 = '耀';
			}

			if (i6 > o.D) {
				o.D += (i6 + -o.D) / 24;
			} else if (o.D > i6) {
				o.D += (-o.D + i6) / 80;
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "db.M(" + unused + ')');
		}
	}

	static void a (rd class_rd, boolean unused) {
		try {
			++int_cb;
			if (class_rd != null && class_rd.b(-29348) != 0) {
				rd[] class_rds = new rd[100];
				rd class_rd2 = class_rd;
				int i = 0;
				do {
					int i1 = class_rd2.a(32, (byte) 99);
					if (i1 == -1) {
						break;
					}

					rd class_rd3 = class_rd2.b(i1, -23745, 0).d(-6488);
					if (class_rd3.b(-29348) > 0) {
						class_rds[i++] = class_rd3.l(-34);
					}

					class_rd2 = class_rd2.a(false, i1 + 1);
				} while (true);

				class_rd2 = class_rd2.d(-6488);
				if (class_rd2.b(-29348) > 0) {
					class_rds[i++] = class_rd2.l(-34);
				}

				dd.B = 0;
				int fileRequest = 0;
				if (fileRequest < af.int_r) {
					do {
						hc class_hc = u.a(fileRequest, false);
						if (class_hc.rb == -1 && class_hc.Rb != null) {
							rd class_rd4 = class_hc.Rb.l(-34);
							int i2 = 0;
							while (true) {
								if (i <= i2) {
									b.rds_gd[dd.B] = class_rd4;
									sd.E[dd.B] = fileRequest;
									++dd.B;
									if (dd.B >= b.rds_gd.length) {
										return;
									}
									break;
								}

								if (class_rd4.a((byte) 81, class_rds[i2]) == -1) {
									break;
								}

								++i2;
							}
						}
						++fileRequest;
					} while (fileRequest < af.int_r);
				}
			} else {
				dd.B = 0;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "db.R(" + "{...}" + ',' + unused + ')');
		}
	}

	final void a (int unused, int i) {
		try {
			++U;
		} catch (RuntimeException var4) {
			throw id.a(var4, "db.J(" + unused + ',' + i + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	final void c (int unused) {
		try {
			++V;
			if (this.Q != null) {
				if (this.Q.f != 0) {
					if (this.Q.f == 1) {
						ne midiboxSrc = (ne) this.Q.c;
						try {
							midiboxSrc.write(70, this.Y.length, this.Y, 0);
							midiboxSrc.close(72);

							try {
								lb.a(this.E.applet_b, "midibox.loop=" + (this.loopInfinite ? "\"infinite\"" : "0") + "; midibox.src=\"" + midiboxSrc.getFile(1).getPath()
																																					.replace('\\', '/') + "\"; midibox.volume=" + this.midiboxVolume + ";", true);
								this.boolean_ab = true;
							} catch (Throwable throwable) {
								throwable.printStackTrace();
							}
						} catch (Exception e) {
							try {
								midiboxSrc.close(72);
							} catch (Exception var3) {
								var3.printStackTrace();
							}
						}
					}

					this.Q = null;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "db.F(" + unused + ')');
		}
	}

	final void e (int unused) {
		try {
			++P;
		} catch (RuntimeException var3) {
			throw id.a(var3, "db.E(" + unused + ')');
		}
	}

	final void a (int i, int i1, int unused) {
		try {
			++y;
			if (unused != 14) {
				g(-27);
			}

			if (i1 == 0) {
				i1 = 1;
			}

			int midiboxVolume = qb.a(i1, (byte) -128) + -i;
			if (this.Q != null) {
				this.midiboxVolume = midiboxVolume;
			} else if (this.boolean_ab) {
				try {
					lb.a(this.E.applet_b, "midibox.volume=" + midiboxVolume + ";", true);
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "db.G(" + i + ',' + i1 + ',' + unused + ')');
		}
	}

	final void a (boolean loopInfinite, int i, byte unused, byte[] data) {
		try {
			++Z;
			this.Q = this.E.c(0);
			if (this.Q != null) {
				if (i == 0) {
					i = 1;
				}

				this.midiboxVolume = qb.a(i, (byte) -118);
				this.loopInfinite = loopInfinite;
				this.Y = data;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "db.H(" + loopInfinite + ',' + i + ',' + unused + ',' + (data != null ? "{...}" : "null") + ')');
		}
	}

	final void silence (byte unused) {
		try {
			if (this.boolean_ab) {
				try {
					lb.a(this.E.applet_b, "midibox.src=\"c:/silence.mid\";", true);
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				}

				this.boolean_ab = false;
			}

			++R;
			this.Q = null;
		} catch (RuntimeException var4) {
			throw id.a(var4, "db.B(" + unused + ')');
		}
	}
}
