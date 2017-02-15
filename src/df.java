import java.awt.Component;

final class df implements Runnable {
	static int int_a;
	static int int_c;
	static dd dd_e = new dd(50);
	static int int_f;
	static int[] ints_g = new int[5];
	static int int_h;
	static int[] ints_i = new int[100];
	static int int_j;
	static int int_k;
	static int int_l;
	static volatile int mousePressedY = 0;
	static rd[] rds_o = new rd[100];
	static int int_p;
	static int int_r;
	static int int_t;
	static rd rd_u = md.a((String) "Hierhin gehen", (byte) 123);
	static boolean[] booleans_v = new boolean[5];
	static rd rd_w = md.a((String) "An:", (byte) 121);
	static int[] BIT_MASKS = new int[]{
			0,
			1,
			3,
			7,
			15,
			31,
			63,
			127,
			255,
			511,
			1023,
			2047,
			4095,
			8191,
			16383,
			32767,
			'\uffff',
			131071,
			262143,
			524287,
			1048575,
			2097151,
			4194303,
			8388607,
			16777215,
			33554431,
			67108863,
			134217727,
			268435455,
			536870911,
			1073741823,
			Integer.MAX_VALUE,
			-1
	};
	static volatile int mouseX = -1;
	final Object object_b = new Object();
	boolean boolean_d = true;
	int[] ints_m = new int[500];
	int[] ints_q = new int[500];
	int int_s = 0;

	@SuppressWarnings("SameParameterValue")
	static rd getRSString (byte[] buffer, int length, int pointer, int unused) {
		try {
			++int_l;
			rd class_rd = new rd();
			class_rd.stringPointer = 0;
			class_rd.stringBuffer = new byte[length];
			int pointer1 = pointer;
			if (pointer >= pointer + length) {
				return class_rd;
			} else {
				do {
					if (buffer[pointer1] != 0) {
						class_rd.stringBuffer[class_rd.stringPointer++] = buffer[pointer1];
					}

					++pointer1;
				} while (pointer1 < pointer + length);

				return class_rd;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "df.A(" + (buffer != null ? "{...}" : "null") + ',' + length + ',' + pointer + ',' + unused + ')');
		}
	}

	static void a (int y, int orientation, int plane, int x, byte unused, bd class_bd) {
		try {
			++int_p;
			jc class_jc = new jc();
			class_jc.z = class_bd.int_eb;
			class_jc.L = class_bd.int_fc;
			class_jc.S = 128 * class_bd.Yb;
			class_jc.U = class_bd.ints_sb;
			class_jc.R = plane;
			class_jc.P = class_bd.int_lb;
			int h = class_bd.h;
			class_jc.T = x * 128;
			int w = class_bd.w;
			if (orientation == 1 || orientation == 3) {
				w = class_bd.h;
				h = class_bd.w;
			}

			class_jc.I = (y + h) * 128;
			class_jc.V = (x + w) * 128;
			class_jc.G = 128 * y;
			if (class_bd.Jb != null) {
				class_jc.A = class_bd;
				class_jc.e(17015);
			}

			ra.x.a(class_jc, (byte) 94);
			if (class_jc.U != null) {
				class_jc.N = class_jc.z + (int) ((double) (-class_jc.z + class_jc.P) * Math.random());
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "df.F(" + y + ',' + orientation + ',' + plane + ',' + x + ',' + unused + ',' + (class_bd != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int i, int i1, byte unused) {
		try {
			++int_j;
			int i2 = 0;
			int i3 = 0;
			do {
				if (wd.j[i3] != null) {
					int i4 = -(14 * i2) + 70 + hc.Ub + 4;
					int i5 = ints_i[i3];
					if (i4 < -20) {
						break;
					}

					if (i5 == 0) {
						++i2;
					}

					rd class_rd = rds_o[i3];
					if (class_rd != null && class_rd.b(27, ha.Z)) {
						class_rd = class_rd.a(false, 5);
					}

					if (class_rd != null && class_rd.b(27, le.rd_ab)) {
						class_rd = class_rd.a(false, 5);
					}

					if ((i5 == 1 || i5 == 2) && (i5 == 1 || bd.publicChatStatus == 0 || bd.publicChatStatus == 1 && db.a((byte) 32, class_rd))) {
						if (class_rd != null && i4 + -14 < i1 && i1 <= i4 && !class_rd.a(af.td_p.Gd, false)) {
							++pc.k;
							++int_c;
							if (ib.int_l >= 1) {
								++la.r;
								ab.a(0, pc.a((byte) 126, new rd[]{u.whiteText, class_rd}), 0, (byte) 125, 17, mb.reportAbuse2, 0);
							}

							ab.a(0, pc.a((byte) 126, new rd[]{u.whiteText, class_rd}), 0, (byte) 125, 2, va.addIgnore2, 0);
							ab.a(0, pc.a((byte) 125, new rd[]{u.whiteText, class_rd}), 0, (byte) 120, 7, hb.addFriend2, 0);
						}

						++i2;
					}

					if ((i5 == 3 || i5 == 7) && dd.int_q == 0 && (i5 == 7 || ub.privateChatStatus == 0 || ub.privateChatStatus == 1 && db.a((byte) 32, class_rd))) {
						++i2;
						if (i4 - 14 < i1 && i4 >= i1) {
							++int_c;
							++pc.k;
							if (ib.int_l >= 1) {
								ab.a(0, pc.a((byte) 127, new rd[]{u.whiteText, class_rd}), 0, (byte) 119, 17, mb.reportAbuse2, 0);
								++la.r;
							}

							ab.a(0, pc.a((byte) 127, new rd[]{u.whiteText, class_rd}), 0, (byte) 120, 2, va.addIgnore2, 0);
							ab.a(0, pc.a((byte) 125, new rd[]{u.whiteText, class_rd}), 0, (byte) 120, 7, hb.addFriend2, 0);
						}
					}

					if (i5 == 4 && (pa.trade_competeStatus == 0 || pa.trade_competeStatus == 1 && db.a((byte) 32, class_rd))) {
						++i2;
						if (i4 + -14 < i1 && i1 <= i4) {
							++t.v;
							ab.a(0, pc.a((byte) 126, new rd[]{u.whiteText, class_rd}), 0, (byte) 122, 22, je.acceptTrade2, 0);
						}
					}

					if ((i5 == 5 || i5 == 6) && dd.int_q == 0 && ub.privateChatStatus < 2) {
						++i2;
					}

					if (i5 == 8 && (pa.trade_competeStatus == 0 || pa.trade_competeStatus == 1 && db.a((byte) 32, class_rd))) {
						++i2;
						if (i1 > -14 + i4 && i1 <= i4) {
							++ba.int_t;
							ab.a(0, pc.a((byte) 127, new rd[]{u.whiteText, class_rd}), 0, (byte) 127, 27, va.acceptChallenge2, 0);
						}
					}
				}

				++i3;
			} while (i3 < 100);
		} catch (RuntimeException var9) {
			throw id.a(var9, "df.D(" + i + ',' + i1 + ',' + unused + ')');
		}
	}

	public static void a (boolean unused) {
		try {
			rds_o = null;
			ints_i = null;
			ints_g = null;
			rd_u = null;
			rd_w = null;
			booleans_v = null;
			dd_e = null;
			BIT_MASKS = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "df.E(" + unused + ')');
		}
	}

	static void a (int i, int i1, int unused, he mapmarker) {
		try {
			++int_a;
			int i2 = i1 * i1 + i * i;
			if (i2 > 4225 && i2 < 90000) {
				int i3 = 2047 & ka.Kb + o.w;
				int i4 = v.pb[i3];
				int i5 = v.wb[i3];
				i5 = 256 * i5 / (gf.int_j + 256);
				i4 = 256 * i4 / (gf.int_j + 256);
				int i6 = -(i * i4) + i5 * i1 >> 16;
				int i7 = i1 * i4 + i * i5 >> 16;
				double v = Math.atan2((double) i7, (double) i6);
				int i8 = (int) (Math.sin(v) * 63.0D);
				int i9 = (int) (57.0D * Math.cos(v));
				jd.mapedge.a(i8 + 88, 83 + -i9 + -20, 20, 20, 15, 15, v, 256);
			} else {
				ld.a((byte) 96, i1, mapmarker, i);
			}
		} catch (RuntimeException var14) {
			throw id.a(var14, "df.C(" + i + ',' + i1 + ',' + unused + ',' + (mapmarker != null ? "{...}" : "null") + ')');
		}
	}

	static void a (Component component, boolean unused, pb cacheFile8) {

		try {
			++int_h;
			if (!bf.boolean_h) {
				nc.g = ge.a(lc.invback, cacheFile8, false, f.Jc);
				db.T = ge.a(jb.chatback, cacheFile8, false, f.Jc);
				h.oa_l = ge.a(kd.mapback, cacheFile8, false, f.Jc);
				wb.kb = ge.a(d.backbase1, cacheFile8, false, f.Jc);
				ke.zb = ge.a(dd.backbase2, cacheFile8, false, f.Jc);
				pe.g = ge.a(we.backhmid1, cacheFile8, false, f.Jc);
				ud.R = je.a(-127, 479, 96, component);
				db.T.a(0, 0);
				sb.jd_q = je.a(-111, 172, 156, component);
				ic.a();
				h.oa_l.a(0, 0);
				ib.jd_n = je.a(-116, 190, 261, component);
				nc.g.a(0, 0);
				se.q = je.a(-89, 512, 334, component);
				ic.a();
				bc.q = je.a(-100, 496, 50, component);
				dc.A = je.a(-100, 269, 37, component);
				ka.Zb = je.a(-95, 249, 45, component);
				he backleft1 = te.a(cacheFile8, ec.backleft1, f.Jc, true);
				l.o = je.a(-83, backleft1.imageWidth, backleft1.imageHeight, component);
				backleft1.b(0, 0);
				he backleft2 = te.a(cacheFile8, w.backleft2, f.Jc, true);
				n.hb = je.a(-113, backleft2.imageWidth, backleft2.imageHeight, component);
				backleft2.b(0, 0);
				he backright1 = te.a(cacheFile8, me.backright1, f.Jc, true);
				le.nb = je.a(-87, backright1.imageWidth, backright1.imageHeight, component);
				backright1.b(0, 0);
				he backright2 = te.a(cacheFile8, pe.backright2, f.Jc, true);
				nd.gd = je.a(-125, backright2.imageWidth, backright2.imageHeight, component);
				backright2.b(0, 0);
				he backtop1 = te.a(cacheFile8, td.backtop1, f.Jc, true);
				ha.jd_mb = je.a(-121, backtop1.imageWidth, backtop1.imageHeight, component);
				backtop1.b(0, 0);
				he backvmid1 = te.a(cacheFile8, pb.backvmid1, f.Jc, true);
				e.jd_fb = je.a(-75, backvmid1.imageWidth, backvmid1.imageHeight, component);
				backvmid1.b(0, 0);
				he backvmid2 = te.a(cacheFile8, m.backvmid2, f.Jc, true);
				ce.jd_f = je.a(-108, backvmid2.imageWidth, backvmid2.imageHeight, component);
				backvmid2.b(0, 0);
				he backvmid3 = te.a(cacheFile8, jd.backvmid3, f.Jc, true);//TODO: wtf?!?!?
				i.H = je.a(-84, backvmid3.imageWidth, backvmid3.imageHeight, component);
				backvmid3.b(0, 0);
				he backhmid2 = te.a(cacheFile8, t.backhmid2, f.Jc, true);
				client.jd_kb = je.a(-66, backhmid2.imageWidth, backhmid2.imageHeight, component);
				backhmid2.b(0, 0);
				pc.x = ge.a(cc.redstone1, cacheFile8, false, f.Jc);
				id.fb = ge.a(wc.redstone2, cacheFile8, false, f.Jc);
				le.oa_pb = ge.a(qc.redstone3, cacheFile8, false, f.Jc);
				se.k = pc.x.d();
				se.k.g();
				ab.oa_q = id.fb.d();
				ab.oa_q.g();
				hf.yb = pc.x.d();
				hf.yb.e();
				ib.oa_r = id.fb.d();
				ib.oa_r.e();
				ba.oa_h = le.oa_pb.d();
				ba.oa_h.e();
				ie.p = pc.x.d();
				ie.p.g();
				ie.p.e();
				fc.oa_v = id.fb.d();
				fc.oa_v.g();
				fc.oa_v.e();
				dc.oas_b = qb.a(f.Jc, ld.sideicons, cacheFile8, -105);
				ra.f = new int[151];
				qe.D = new int[33];
				rd.ints_f = new int[33];
				ha.ints_ob = new int[151];
				int i = 0;
				do {
					int i1 = 0;
					int i2 = 999;
					int i3 = 0;
					do {
						if (h.oa_l.jb[i3 + i * h.oa_l.mb] == 0) {
							if (i2 != 999) {
								++i3;
								continue;
							}

							i2 = i3;
						} else {
							if (i2 != 999) {
								i1 = i3;
								break;
							}
						}

						++i3;
					} while (i3 < 34);

					qe.D[i] = i2;
					rd.ints_f[i] = -i2 + i1;
					++i;
				} while (i < 33);

				int i1 = 5;
				do {
					int i2 = 0;
					int i3 = 999;
					int i4 = 25;
					do {
						if (h.oa_l.jb[i1 * h.oa_l.mb + i4] != 0 || i4 <= 34 && i1 <= 34) {
							if (i3 == 999) {
								++i4;
								continue;
							}

							i2 = i4;
							break;
						}

						if (i3 == 999) {
							i3 = i4;
						}

						++i4;
					} while (i4 < 172);

					ha.ints_ob[i1 - 5] = i3 + -25;
					ra.f[i1 + -5] = -i3 + i2;
					++i1;
				} while (i1 < 156);

				bf.boolean_h = true;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "df.B(" + (component != null ? "{...}" : "null") + ',' + unused + ',' + (cacheFile8 != null ? "{...}" : "null") + ')');
		}
	}

	public final void run () {
		try {
			++int_r;
			if (this.boolean_d) {
				while (this.boolean_d) {
					synchronized (this.object_b) {
						if (this.int_s < 500) {
							this.ints_q[this.int_s] = pb.H;
							this.ints_m[this.int_s] = la.t;
							++this.int_s;
						}
					}

					wa.sleep(17525, 50L);
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "df.run(" + ')');
		}
	}
}
