import java.awt.Component;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public final class client extends r {
	public static int int_tb;
	static short[] W = new short[]{
			(short) 9104,
			(short) 10275,
			(short) 7595,
			(short) 3610,
			(short) 7975,
			(short) 8526,
			(short) 918,
			(short) -26734,
			(short) 24466,
			(short) 10145,
			(short) -6882,
			(short) 5027,
			(short) 1457,
			(short) 16565,
			(short) -30545,
			(short) 25486
	};
	static int X = 0;
	static gb Y;
	static boolean loopInfinite;
	static rd p12_full = md.a((String) "p12_full", (byte) 116);
	static int int_bb;
	static int int_cb;
	static int int_db;
	static int int_eb;
	static rd m_ = md.a((String) "m", (byte) 124);
	static int int_gb;
	static int int_hb;
	static int int_ib = 99;
	static int int_jb;
	static jd jd_kb;
	static int int_lb;
	static int int_mb;
	static int int_nb;
	static int int_ob = 0;
	static int int_pb;
	static int int_qb = 0;
	static int int_rb;
	static int int_sb;

	private static void a (Component component, int unused) {
		try {
			++int_lb;
			component.removeKeyListener(nd.Bc);
			component.removeFocusListener(nd.Bc);
		} catch (RuntimeException var3) {
			throw id.a(var3, "client.J(" + (component != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void h (int unused) {
		try {
			Y = null;
			W = null;
			p12_full = null;
			jd_kb = null;
			m_ = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "client.H(" + unused + ')');
		}
	}

	public static void main (String[] strings) {
		try {
			try {
				if (strings.length != 6) {
					bc.exit((byte) 11);
				}

				sa.worldId_tb = Integer.parseInt(strings[0]);

				if (strings[1].equals("live")) {
					i.modeWhere_F = 0;
				} else if (!strings[1].equals("office")) {
					if (!strings[1].equals("local")) {
						bc.exit((byte) 11);
					} else {
						i.modeWhere_F = 2;
					}
				} else {
					i.modeWhere_F = 1;
				}

				switch (strings[2]) {
					case "live":
						ld.modeWhat_a = 0;
						break;
					case "rc":
						ld.modeWhat_a = 1;
						break;
					case "wip":
						ld.modeWhat_a = 2;
						break;
					default:
						bc.exit((byte) 11);
						break;
				}

				if (!strings[3].equals("lowmem")) {
					if (strings[3].equals("highmem")) {
						kb.b(-107);
					} else {
						bc.exit((byte) 11);
					}
				} else {
					dd.b(126);
				}

				if (!strings[4].equals("free")) {
					if (strings[4].equals("members")) {
						va.isMembers_j = true;
					} else {
						bc.exit((byte) 11);
					}
				} else {
					va.isMembers_j = false;
				}

				switch (strings[5]) {
					case "english":
						gd.languageId_int_a = 0;
						break;
					case "german":
						ta.f(-1);
						gd.languageId_int_a = 1;
						break;
					default:
						bc.exit((byte) 11);
						break;
				}

				client instance = new client();
				instance.a(449, 14, 765, (byte) 120, 503, "runescape", ld.modeWhat_a + 32, InetAddress.getLocalHost());
			} catch (Exception e) {
				se.a((byte) -125, e, null);
			}

			++int_bb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "client.main(" + "{...}" + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	private static void h (byte unused) {
		try {
			++int_rb;
			if (ja.fc_a != null) {
				synchronized (ja.fc_a) {
					ja.fc_a = null;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "client.I(" + unused + ')');
		}
	}

	static boolean b (int cacheId, int unused) {
		try {
			++int_db;
			if (!a.a(0, cacheId)) {
				return false;
			} else {
				boolean flag = false;
				nd[] class_nds = ld.c[cacheId];
				int i = 0;
				if (class_nds.length <= i) {
					return false;
				} else {
					do {
						nd class_nd = class_nds[i];
						if (class_nd != null && class_nd.tb == 6) {
							int fileRequest;
							if (class_nd.rb != -1 || class_nd.Tb != -1) {
								boolean flag2 = p.a(-118, class_nd);
								if (flag2) {
									fileRequest = class_nd.Tb;
								} else {
									fileRequest = class_nd.rb;
								}

								if (fileRequest != -1) {
									e class_e = bd.a(fileRequest, false);
									class_nd.cb += va.g;
									if (class_e.Eb[class_nd.Lb] < class_nd.cb) {
										do {
											flag = true;
											class_nd.cb -= class_e.Eb[class_nd.Lb];
											++class_nd.Lb;
											if (class_nd.Lb >= class_e.Gb.length) {
												class_nd.Lb -= class_e.Bb;
												if (class_nd.Lb < 0 || class_nd.Lb >= class_e.Gb.length) {
													class_nd.Lb = 0;
												}
											}
										} while (class_e.Eb[class_nd.Lb] < class_nd.cb);
									}
								}
							}

							if (class_nd.Nc != 0 && !class_nd.gb) {
								flag = true;
								int i1 = class_nd.Nc >> 16;
								i1 *= va.g;
								class_nd.int_id = 2047 & class_nd.int_id + i1;
								fileRequest = class_nd.Nc << 16 >> 16;
								fileRequest *= va.g;
								class_nd.int_sd = 2047 & class_nd.int_sd + fileRequest;
							}
						}

						++i;
					} while (class_nds.length > i);

					return flag;
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "client.F(" + cacheId + ',' + unused + ')');
		}
	}

	final void d (int unused) {
		try {
			++int_mb;
			h(-96);
			rd.a(0);
			r.f(-15040);
			ee.f(-10377);
			jd.a((byte) -110);
			df.a(false);
			id.k(24480);
			ff.b((byte) -90);
			ke.e(17579);
			bb.c(0);
			d.a(-18233);
			b.g((byte) -63);
			uc.n((byte) 65);
			gb.d();
			ua.b();
			nc.b(-123);
			td.g(34);
			md.b(-3 + 7);
			nd.f(-3 + 23817);
			va.a(0);
			pc.b((byte) 126);
			h.a(true);
			o.c((byte) -69);
			e.c((byte) -83);
			f.nullLoader(-1);
			p.g(-1);
			tb.g(-3 ^ -106);
			je.a(65536);
			dc.a(-125);
			ba.b((byte) 114);
			dd.a((byte) 125);
			ue.e();
			kc.c();
			kd.a((byte) 125);
			ib.a((byte) 66);
			ad.a(1);
			me.e(-3 ^ -109);
			la.a(-118);
			qe.a(-3 ^ -10520);
			ha.c(false);
			t.a(63);
			bc.a((byte) 122);
			ra.a((byte) -51);
			nb.a(9380);
			ob.a();
			w.b(77);
			fc.a(true);
			pa.a((byte) -104);
			jb.e(-3 ^ -35);
			pb.a(0);
			cf.a(0);
			ld.a((byte) 4);
			eb.a((byte) 4);
			gf.b((byte) -60);
			gd.a(8);
			se.a((byte) -110);
			be.c((byte) -116);
			u.c((byte) -110);
			m.a(-627);
			v.f();
			ic.c();
			lc.a((byte) 14);
			cc.a(91);
			pd.a((byte) -85);
			hf.c((byte) -32);
			sa.g(256);
			wa.c((byte) -114);
			bd.c(true);
			hc.f(128);
			a.f(16711680);
			j.c(true);
			s.f(-93);
			n.f(-15421);
			le.c((byte) 12);
			wd.a((byte) -113);
			qd.b();
			kb.a((byte) -20);
			ec.a((byte) -121);
			hb.a(true);
			ja.a(-3 + -14062);
			ud.c(true);
			jc.f(15310);
			wb.g(-8185);
			rb.a(18818);
			ca.b(0);
			k.a();
			ka.d((byte) -128);
			te.f(-3 + 78);
			we.a(48);
			ce.a(-3 + 2);
			ub.e(-3 ^ -8);
			od.d(true);
			ta.d((byte) -101);
			vc.c(true);
			pe.a((byte) -32);
			fb.a((byte) -42);
			ge.g(25);
			qc.c((byte) -120);
			bf.a((byte) 84);
			mb.a(112);
			ie.b(-3 + '耂');
			ab.a(-3 ^ -29337);
			ae.a();
			af.b(-468);
			fe.a();
			i.a((byte) -119);
			fd.a();
			l.a(false);
			tc.c(true);
			sb.b(-8635);
			qb.f(-3 + 13405);
			fa.d();
			oe.f();
			wc.a(true);
			sd.a((byte) -25);
			q.g(3);
			sc.d();
			db.b(true);
		} catch (RuntimeException var3) {
			throw id.a(var3, "client.L(" + unused + ')');
		}
	}

	final void g (int unused) {
		try {
			++int_jb;
			if (h.boolean_d) {
				a(rd.canvas, -121);
				i.a(196, rd.canvas);
				if (sb.va_s != null) {
					sb.va_s.b(-1, rd.canvas);
				}

				this.b((byte) 75);
				jd.a(rd.canvas, -100);
				wc.a(50, rd.canvas);
				if (sb.va_s != null) {
					sb.va_s.addMouseWheelListener(81, rd.canvas);
				}
			}

			if (lc.currentGameState != 0) {
				if (lc.currentGameState != 5) {
					if (lc.currentGameState == 10) {
						tb.a(e.Ib, Y, 1);
					} else if (lc.currentGameState == 20) {
						tb.a(e.Ib, Y, 1);
					} else if (lc.currentGameState == 25) {
						if (wa.rb == 1) {
							if (i.M < d.int_k) {
								i.M = d.int_k;
							}

							int percentage = (i.M - d.int_k) * 50 / i.M;
							nd.a(0, pc.a((byte) 127, new rd[]{pb.G, bf.a(percentage, -31766), ud.Q}), true, sa.loading_PleaseWait2);
						} else if (wa.rb == 2) {
							if (dc.int_h < hc.kb) {
								dc.int_h = hc.kb;
							}

							int percentage = 50 + (dc.int_h - hc.kb) * 50 / dc.int_h;
							nd.a(0, pc.a((byte) 127, new rd[]{pb.G, bf.a(percentage, -31766), ud.Q}), true, sa.loading_PleaseWait2);
						} else {
							nd.a(0, null, false, sa.loading_PleaseWait2);
						}
					} else if (lc.currentGameState == 30) {
						ka.e((byte) 92);
					} else if (lc.currentGameState != 35) {
						if (lc.currentGameState == 40) {
							nd.a(0, we.pleaseWait_attemptingToReestablish2, false, lc.connectionLost2);
						}
					} else {
						sb.a(true);
					}
				} else {
					tb.a(e.Ib, Y, 1);
				}
			} else {
				je.a(null, rd.percentageBar, ff.loadingText, -3857);
			}

			wd.int_a = 0;
			j.lb = 0;
		} catch (RuntimeException var4) {
			throw id.a(var4, "client.B(" + unused + ')');
		}
	}

	final void d (byte unused) {
		try {
			++ce.y;
			++int_sb;
			this.i(-1001);
			p.f(-122);
			ld.c((byte) 69);
			t.b(1000);
			r.c((byte) 20);
			td.h(49);
			if (sb.va_s != null) {
				int wheelRotation = sb.va_s.getWheelRotation(false);
				ce.int_g = wheelRotation;
				wd.int_a += wheelRotation;
			}

			if (lc.currentGameState != 0) {
				if (lc.currentGameState == 5) {
					af.a((byte) -64);
					ab.a((byte) -16);
				} else if (lc.currentGameState != 10) {
					if (lc.currentGameState != 20) {
						if (lc.currentGameState == 25) {
							kd.a(255);
						}
					} else {//Username & Password entered and entering game
						ta.e((byte) -67);
						r.a((byte) -80);
					}
				} else {
					ta.e((byte) -127);
				}
			} else {
				af.a((byte) -64);
				ab.a((byte) -16);
			}

			if (lc.currentGameState != 30) {
				if (lc.currentGameState == 35) {
					ja.b((byte) -69);
				} else if (lc.currentGameState == 40) {
					r.a((byte) -80);
				}
			} else {
				ja.b((byte) -124);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "client.E(" + unused + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	public final void init () {
		try {
			++int_pb;
			if (this.c(14)) {
				sa.worldId_tb = Integer.parseInt(this.getParameter("worldid"));
				ld.modeWhat_a = Integer.parseInt(this.getParameter("modewhat"));
				i.modeWhere_F = Integer.parseInt(this.getParameter("modewhere"));
				String lowmem = this.getParameter("lowmem");
				if (lowmem != null && lowmem.equals("1")) {
					dd.b(-39);
				} else {
					kb.b(-107);
				}

				String members = this.getParameter("members");
				va.isMembers_j = !(members == null || !members.equals("1"));

				String lang = this.getParameter("lang");
				if (lang != null && lang.equals("1")) {
					ta.f(-1);
					gd.languageId_int_a = 1;
				}

				this.a(765, 32 + ld.modeWhat_a, 503, 14, 449);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "client.init(" + ')');
		}
	}

	private void a (int unused, int i) {
		try {
			h.int_m = 0;
			++int_gb;
			ec.ff_p = null;
			if (id.V == te.Ob) {
				te.Ob = n.db;
			} else {
				te.Ob = id.V;
			}

			++l.int_e;
			ja.ma_p = null;
			if (l.int_e >= 2 && (i == 7 || i == 9)) {
				if (lc.currentGameState <= 5) {
					this.a(77, "js5connect_full");
					lc.currentGameState = 1000;
				} else {
					fc.A = 3000;
				}
			} else if (l.int_e >= 2 && i == 6) {
				this.a(77, "js5connect_outofdate");
				lc.currentGameState = 1000;
			} else if (l.int_e >= 4) {
				if (lc.currentGameState <= 5) {
					this.a(77, "js5connect");
					lc.currentGameState = 1000;
				} else {
					fc.A = 3000;
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "client.K(" + unused + ',' + i + ')');
		}
	}

	final void f (byte unused) {
		try {
			id.V = i.modeWhere_F != 0 ? sa.worldId_tb + '鱀' : 'ꩊ';
			te.Ob = id.V;
			++int_nb;
			n.db = i.modeWhere_F == 0 ? 443 : '썐' + sa.worldId_tb;
			ba.a((byte) 123);
			jd.a(rd.canvas, -13);
			wc.a(50, rd.canvas);
			sb.va_s = qc.c(53);
			if (sb.va_s != null) {
				sb.va_s.addMouseWheelListener(105, rd.canvas);
			}

			qe.p = g.int_i;

			try {
				if (f.Nc.cacheDat2_f != null) {
					b.cacheDat2 = new bb(f.Nc.cacheDat2_f, 5200, 0);
					int idx = 0;
					do {
						dc.cacheIDXIndices_r[idx] = new bb(f.Nc.cacheIDXIndices_j[idx], 6000, 0);
						++idx;
					} while (idx < 14);

					hf.cacheIDX255 = new bb(f.Nc.cacheIDX255, 6000, 0);
					ka.Tb = new d(255, b.cacheDat2, hf.cacheIDX255, 500000);
					f.Nc.cacheIDX255 = null;
					f.Nc.cacheDat2_f = null;
					f.Nc.cacheIDXIndices_j = null;
				}
			} catch (IOException e) {
				hf.cacheIDX255 = null;
				ka.Tb = null;
				b.cacheDat2 = null;
				e.printStackTrace();
			}

			if (i.modeWhere_F != 0) {
				t.g = true;
			}

			wb.ab = new nd();
		} catch (RuntimeException var6) {
			throw id.a(var6, "client.A(" + unused + ')');
		}
	}

	private void i (int unused) {
		try {
			++int_hb;
			if (lc.currentGameState != 1000) {
				boolean flag = sa.c(true);
				if (!flag) {
					this.j(100);
				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "client.C(" + unused + ')');
		}
	}

	final void b (int unused) {
		try {
			++int_eb;
			if (h.df_s != null) {
				h.df_s.boolean_d = false;
			}

			h.df_s = null;
			if (cc.ff_k != null) {
				cc.ff_k.a(25830);
				cc.ff_k = null;
			}

			ud.g(-17);
			h((byte) 120);
			sb.va_s = null;
			ld.b((byte) -104);
			kb.c(-104);
			ud.f(-29025);
			ee.d(30770);

			try {
				if (b.cacheDat2 != null) {
					b.cacheDat2.close((byte) -121);
				}

				if (dc.cacheIDXIndices_r != null) {
					int idx = 0;
					if (dc.cacheIDXIndices_r.length > idx) {
						do {
							if (dc.cacheIDXIndices_r[idx] != null) {
								dc.cacheIDXIndices_r[idx].close((byte) -121);
							}

							++idx;
						} while (dc.cacheIDXIndices_r.length > idx);
					}
				}

				if (hf.cacheIDX255 != null) {
					hf.cacheIDX255.close((byte) -121);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "client.D(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	private void j (int unused) {
		try {
			++int_cb;
			if (hf.int_kb >= 4) {
				this.a(77, "js5crc");
				lc.currentGameState = 1000;
			} else {
				if (be.int_m >= 4) {
					if (lc.currentGameState > 5) {
						be.int_m = 3;
						fc.A = 3000;
					} else {
						this.a(77, "js5io");
						lc.currentGameState = 1000;
						return;
					}
				}

				if (fc.A-- <= 0) {
					try {
						if (h.int_m == 0) {
							ja.ma_p = f.Nc.b(0, te.Ob);
							++h.int_m;
						} else if (h.int_m == 1) {
							if (ja.ma_p.f == 2) {
								this.a(-22, -1);
							} else if (ja.ma_p.f == 1) {
								++h.int_m;
							}
						} else if (h.int_m == 2) {
							ec.ff_p = new ff((Socket) ja.ma_p.c, f.Nc);
							id var2 = new id(5);
							var2.writeByte((byte) 104, 15);
							var2.writeInt(-7155, 449);
							ec.ff_p.writeToStream(false, 5, 0, var2.buffer);
							++h.int_m;
							ec.long_k = pa.c(0);
						} else if (h.int_m == 3) {
							if (lc.currentGameState > 5 && ec.ff_p.available((byte) -82) <= 0) {
								if (pa.c(0) - ec.long_k > 30000L) {
									this.a(-20, -2);
								}
							} else {
								int dataRead = ec.ff_p.read(116);
								if (dataRead != 0) {
									this.a(-125, dataRead);
									return;
								}

								++h.int_m;
							}
						} else if (h.int_m == 4) {
							id.a((byte) -94, lc.currentGameState > 20, ec.ff_p);
							h.int_m = 0;
							ec.ff_p = null;
							ja.ma_p = null;
							l.int_e = 0;
						}
					} catch (IOException var3) {
						this.a(-116, -3);
					}
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "client.G(" + unused + ')');
		}
	}
}
