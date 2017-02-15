import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public abstract class r extends Applet implements Runnable, FocusListener, WindowListener {
	public static int U;
	public static boolean V;
	static int int_a;
	static int int_b;
	static int int_c;
	static int int_e;
	static int int_f;
	static int int_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static rd rd_k = md.a((String) "Ung-Ultiges Anmelde)2Paket)3", (byte) 123);
	static int int_l;
	static int int_m;
	static rd loadedTitleScreen2;
	static int int_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static dd F;
	static int G;
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	static rd M;
	static int O;
	static int P;
	static int Q;
	static int[] R;
	static rd S;
	static int T;
	private static rd loadedTitleScreen = md.a((String) "Loaded title screen", (byte) 117);

	static {
		loadedTitleScreen2 = loadedTitleScreen;
		M = md.a("M", (byte) 118);
		F = new dd(260);
		S = md.a("@gr3@", (byte) 117);
		R = new int[2048];
		T = 0;
	}

	private boolean N = false;

	static void a (byte unused) {
		try {
			++int_v;

			try {
				if (md.loginStage == 0) {
					if (cc.ff_k != null) {
						cc.ff_k.a(25830);
						cc.ff_k = null;
					}

					hc.Cb = null;
					md.loginStage = 1;
					se.int_g = 0;
					j.Eb = false;
				} else if (md.loginStage == 1) {
					if (hc.Cb == null) {
						hc.Cb = f.Nc.b(0, te.Ob);
					}

					if (hc.Cb.f == 1) {
						cc.ff_k = new ff((Socket) hc.Cb.c, f.Nc);
						md.loginStage = 2;
						hc.Cb = null;
					} else if (hc.Cb.f == 2) {
						throw new IOException();
					}
				} else if (md.loginStage == 2) {
					long l = b.long_fd = ff.rd_f.i(29486);
					ie.writeStream.pointer = 0;
					int i = (int) (31L & l >> 16);
					ie.writeStream.writeByte((byte) 90, 14);
					ie.writeStream.writeByte((byte) -86, i);
					cc.ff_k.writeToStream(false, 2, 0, ie.writeStream.buffer);
					md.loginStage = 3;
					lc.readStream.pointer = 0;
				} else if (md.loginStage == 3) {
					//This value is used to verify that the connection has been made and can continue.
					int connectionValue = cc.ff_k.read(125);
					if (connectionValue != 0) {
						ad.b(connectionValue, (byte) 34);
						return;
					}

					md.loginStage = 4;
					lc.readStream.pointer = 0;
				} else if (md.loginStage == 4) {
					if (lc.readStream.pointer < 8) {
						int available = cc.ff_k.available((byte) -113);
						System.out.println("available: " + available);
						if (~available < ~(8 + -lc.readStream.pointer)) {
							available = 8 - lc.readStream.pointer;
						}

						if (available > 0) {
							cc.ff_k.read(lc.readStream.pointer, lc.readStream.buffer, available, 0);
							lc.readStream.pointer += available;
						}
					}

					if (lc.readStream.pointer == 8) {
						lc.readStream.pointer = 0;
						md.t = lc.readStream.readLong(false);
						md.loginStage = 5;
					}
				} else if (md.loginStage == 5) {
					int[] isaacSeedIndice = new int[]{(int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), 0, 0};
					ie.writeStream.pointer = 0;
					isaacSeedIndice[2] = (int) (md.t >> 32);
					isaacSeedIndice[3] = (int) md.t;
					ie.writeStream.writeByte((byte) -30, 10);
					ie.writeStream.writeInt(-7155, isaacSeedIndice[0]);
					ie.writeStream.writeInt(-7155, isaacSeedIndice[1]);
					ie.writeStream.writeInt(-7155, isaacSeedIndice[2]);
					ie.writeStream.writeInt(-7155, isaacSeedIndice[3]);
					ie.writeStream.writeInt(-7155, f.Nc.uid);
					ie.writeStream.writeLong(ff.rd_f.i(29486), 2);
					ie.writeStream.a(-6595, ff.rd_w);//writeString ?
					ie.writeStream.a(je.bigInteger_p, hf.bigInteger_sb, true);
					n.buffer.pointer = 0;
					if (lc.currentGameState != 40) {
						n.buffer.writeByte((byte) 118, 16);//New login
					} else {
						n.buffer.writeByte((byte) 94, 18);//Reconnecting login
					}

					n.buffer.writeByte((byte) -58, 61 + ie.writeStream.pointer);
					n.buffer.writeInt(-7155, 449);
					n.buffer.writeByte((byte) -106, jb.L ? 1 : 0);
					n.buffer.writeInt(-7155, rb.cacheFile0.q);
					n.buffer.writeInt(-7155, gf.cacheFile1.q);
					n.buffer.writeInt(-7155, sa.cacheFile2.q);
					n.buffer.writeInt(-7155, ge.cacheFile3.q);
					n.buffer.writeInt(-7155, bd.cacheFile4.q);
					n.buffer.writeInt(-7155, pb.cacheFile5.q);
					n.buffer.writeInt(-7155, vc.cacheFile6.q);
					n.buffer.writeInt(-7155, s.cacheFile7.q);
					n.buffer.writeInt(-7155, q.cacheFile8.q);
					n.buffer.writeInt(-7155, eb.cacheFile9.q);
					n.buffer.writeInt(-7155, u.cacheFile10.q);
					n.buffer.writeInt(-7155, hf.cacheFile11.q);
					n.buffer.writeInt(-7155, dd.cacheFile12.q);
					n.buffer.writeInt(-7155, m.cacheFile13.q);
					n.buffer.writeBytes(ie.writeStream.buffer, (byte) -67, ie.writeStream.pointer, 0);
					cc.ff_k.writeToStream(false, n.buffer.pointer, 0, n.buffer.buffer);
					ie.writeStream.a(isaacSeedIndice, true);
					int isaacSize = 0;
					do {
						isaacSeedIndice[isaacSize] += 50;
						++isaacSize;
					} while (isaacSize < 4);

					lc.readStream.a(isaacSeedIndice, true);
					md.loginStage = 6;
				}

				if (md.loginStage == 6 && cc.ff_k.available((byte) -89) > 0) {
					int var7 = cc.ff_k.read(108);
					System.out.println(var7);
					if (var7 == 21 && lc.currentGameState == 20) {
						md.loginStage = 7;
					} else {
						if (var7 == 2) {
							md.loginStage = 9;
						} else {
							if (~var7 == -16 && ~lc.currentGameState == -41) {
								gf.a((byte) 123);
								return;
							}

							if (var7 != 23 || ~we.q <= -2) {
								ad.b(var7, (byte) 91);
								return;
							}

							md.loginStage = 0;
							++we.q;
						}
					}
				}

				if (~md.loginStage == -8 && cc.ff_k.available((byte) -57) > 0) {
					bd.int_kc = (3 + cc.ff_k.read(126)) * 60;
					md.loginStage = 8;
				}

				if (md.loginStage == 8) {
					se.int_g = 0;
					be.a(0, pc.a((byte) 125, new rd[]{bf.a(bd.int_kc / 60, -31766), bd._seconds2}), va.r, j.rd_sb);
					if (~(--bd.int_kc) >= -1) {
						md.loginStage = 0;
					}

				} else {
					if (~md.loginStage == -10 && cc.ff_k.available((byte) -98) >= 8) {
						ib.int_l = cc.ff_k.read(104);
						od.Ab = cc.ff_k.read(117) == 1;
						lc.n = cc.ff_k.read(124);
						lc.n <<= 8;
						lc.n += cc.ff_k.read(108);
						ub.D = cc.ff_k.read(108);
						System.out.println(ib.int_l + " " + od.Ab + " " + lc.n + " " + ub.D);
						cc.ff_k.read(0, lc.readStream.buffer, 1, 0);
						lc.readStream.pointer = 0;
						jd.currentIncomingPacket = lc.readStream.o(50);
						cc.ff_k.read(0, lc.readStream.buffer, 2, 0);
						lc.readStream.pointer = 0;
						l.incomingPacketSize = lc.readStream.readUnsignedLEShort(255);
						md.loginStage = 10;
					}

					if (md.loginStage == 10) {
						if (cc.ff_k.available((byte) -62) >= l.incomingPacketSize) {
							lc.readStream.pointer = 0;
							cc.ff_k.read(0, lc.readStream.buffer, l.incomingPacketSize, 0);
							qc.a(true);
							ub.G = -1;
							ff.a(false, (byte) -85);//162
							jd.currentIncomingPacket = -1;
						}

					} else {
						++se.int_g;
						if (~se.int_g < -2001) {
							if (we.q < 1) {
								++we.q;
								md.loginStage = 0;
								if (~id.V == ~te.Ob) {
									te.Ob = n.db;
								} else {
									te.Ob = id.V;
								}
							} else {
								ad.b(-3, (byte) 105);
							}
						}
					}
				}
			} catch (IOException var5) {
				if (we.q < 1) {
					++we.q;
					md.loginStage = 0;
					if (~id.V != ~te.Ob) {
						te.Ob = id.V;
					} else {
						te.Ob = n.db;
					}
				} else {
					ad.b(-2, (byte) 39);
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "r.N(" + unused + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void c (byte unused) {
		try {
			++int_e;
			synchronized (nd.Bc) {
				sa.lb = nd.wd;
				if (p.V >= 0) {
					if (bd.Eb != p.V) {
						do {
							int i = kd.ints_u[bd.Eb];
							bd.Eb = bd.Eb + 1 & 127;
							if (i >= 0) {
								pc.C[i] = true;
							} else {
								pc.C[~i] = false;
							}
						} while (bd.Eb != p.V);
					}
				} else {
					int i = 0;
					while (i < 112) {
						pc.C[i] = false;
						++i;
					}

					p.V = bd.Eb;
				}

				nd.wd = client.X;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "r.CA(" + unused + ')');
		}
	}

	static void a (boolean var0) {
		int var9 = client.int_tb;

		try {
			++int_q;
			la.redrawChatPanel = true;
			if (var0) {
				a((byte) -51);
			}

			label287:
			{
				f.e((byte) 74);
				if (ad.boolean_v) {
					client.Y.c(kd.z, 239, 40, 0);
					client.Y.c(pc.a((byte) 125, new rd[]{kd.E, le.rd_hb}), 239, 60, 128);
					if (var9 == 0) {
						break label287;
					}
				}

				if (~wb.int_db != -2) {
					if (wb.int_db != 2) {
						gb var1;
						int var2;
						int var3;
						if (~wb.int_db == -4) {
							if (kd.y != kd.x) {
								db.a(kd.x, var0);
								kd.y = kd.x;
							}

							var1 = ad.gb_a;
							ic.a(0, 0, 463, 77);
							var2 = 0;
							if (var9 != 0 || ~dd.B < ~var2) {
								do {
									var3 = 18 - (-(var2 * 14) + od.yb);
									if (~var3 < -1 && var3 < 110) {
										var1.c(b.rds_gd[var2], 239, var3, 0);
									}

									++var2;
								} while (~dd.B < ~var2);
							}

							ic.b();
							if (dd.B > 5) {
								ud.a(od.yb, 463, 7 + dd.B * 14, 77, (byte) 74, 0);
							}

							label237:
							{
								if (~kd.x.b(-29348) == -1) {
									client.Y.c(cf.enterObjectName2, 239, 40, 255);
									if (var9 == 0) {
										break label237;
									}
								}

								if (dd.B == 0) {
									client.Y.c(fc.noMatchingObjectsFound_pleaseShortenSearch2, 239, 40, 0);
								}
							}

							var1.c(pc.a((byte) 127, new rd[]{kd.x, le.rd_hb}), 239, 90, 0);
							ic.b(0, 77, 479, 0);
							if (var9 == 0) {
								break label287;
							}
						}

						if (~wb.int_db == -5) {
							client.Y.c(kd.A, 239, 40, 0);
							client.Y.c(pc.a((byte) 125, new rd[]{kd.x, le.rd_hb}), 239, 60, 128);
							if (var9 == 0) {
								break label287;
							}
						}

						if (id.eb == null) {
							boolean var11;
							if (~ta.Sb == 0) {
								if (~b.int_ld != 0) {
									var11 = wd.a(0, 96, 479, 0, false, 3, b.int_ld);
									if (var11) {
										break label287;
									}

									w.h = true;
									if (var9 == 0) {
										break label287;
									}
								}

								var1 = ad.gb_a;
								ic.a(0, 0, 463, 77);
								var2 = 0;
								var3 = 0;
								if (var9 != 0 || ~var3 > -101) {
									do {
										if (wd.j[var3] != null) {
											int var4 = df.ints_i[var3];
											rd var6 = df.rds_o[var3];
											int var5 = hc.Ub + -(14 * var2) + 70;
											byte var7 = 0;
											if (var6 != null && var6.b(27, ha.Z)) {
												var6 = var6.a(false, 5);
												var7 = 1;
											}

											if (var6 != null && var6.b(27, le.rd_ab)) {
												var6 = var6.a(var0, 5);
												var7 = 2;
											}

											if (var4 == 0) {
												if (~var5 < -1 && ~var5 > -111) {
													var1.b(wd.j[var3], 4, var5, 0);
												}

												++var2;
											}

											int var8;
											if ((var4 == 1 || var4 == 2) && (~var4 == -2 || ~bd.publicChatStatus == -1 || bd.publicChatStatus == 1 && db
													.a((byte) 32, var6))) {
												if (var5 > 0 && var5 < 110) {
													var8 = 4;
													if (~var7 == -2) {
														qe.mod_icons[0].a(var8, var5 + -12);
														var8 += 14;
													}

													if (var7 == 2) {
														qe.mod_icons[1].a(var8, var5 - 12);
														var8 += 14;
													}

													var1.b(pc.a((byte) 126, new rd[]{
															var6,
															pc.colon
													}), var8, var5, 0);
													var8 += var1.b(var6) - -8;
													var1.b(wd.j[var3], var8, var5, 255);
												}

												++var2;
											}

											if ((var4 == 3 || ~var4 == -8) && dd.int_q == 0 && (~var4 == -8 || ~ub.privateChatStatus == -1 || ~ub.privateChatStatus == -2 && db
													.a((byte) 32, var6))) {
												++var2;
												if (~var5 < -1 && ~var5 > -111) {
													byte var13 = 4;
													var1.b(kb.h, var13, var5, 0);
													var8 = var13 + var1.b(kb.h);
													var8 += var1.f(32);
													if (~var7 == -2) {
														qe.mod_icons[0].a(var8, var5 + -12);
														var8 += 14;
													}

													if (var7 == 2) {
														qe.mod_icons[1].a(var8, var5 - 12);
														var8 += 14;
													}

													var1.b(pc.a((byte) 125, new rd[]{
															var6,
															pc.colon
													}), var8, var5, 0);
													var8 += var1.b(var6) - -8;
													var1.b(wd.j[var3], var8, var5, 8388608);
												}
											}

											if (~var4 == -5 && (pa.trade_competeStatus == 0 || ~pa.trade_competeStatus == -2 && db.a((byte) 32, var6))) {
												++var2;
												if (~var5 < -1 && var5 < 110) {
													var1.b(pc.a((byte) 126, new rd[]{
															var6,
															wa.lb,
															wd.j[var3]
													}), 4, var5, 8388736);
												}
											}

											if (var4 == 5 && dd.int_q == 0 && ub.privateChatStatus < 2) {
												++var2;
												if (~var5 < -1 && ~var5 > -111) {
													var1.b(wd.j[var3], 4, var5, 8388608);
												}
											}

											if (var4 == 6 && dd.int_q == 0 && ~ub.privateChatStatus > -3) {
												++var2;
												if (var5 > 0 && var5 < 110) {
													var1.b(pc.a((byte) 127, new rd[]{
															ce.to2,
															wa.lb,
															var6,
															pc.colon
													}), 4, var5, 0);
													var1.b(wd.j[var3], 12 + var1.b(pc.a((byte) 125, new rd[]{
															ce.to2,
															wa.lb,
															var6
													})), var5, 8388608);
												}
											}

											if (var4 == 8 && (~pa.trade_competeStatus == -1 || ~pa.trade_competeStatus == -2 && db.a((byte) 32, var6))) {
												if (var5 > 0 && var5 < 110) {
													var1.b(pc.a((byte) 126, new rd[]{
															var6,
															wa.lb,
															wd.j[var3]
													}), 4, var5, 8270336);
												}

												++var2;
											}
										}

										++var3;
									} while (~var3 > -101);
								}

								ic.b();
								me.C = 7 + var2 * 14;
								if (~me.C > -79) {
									me.C = 78;
								}

								rd var12;
								label173:
								{
									ud.a(-77 + -hc.Ub + me.C, 463, me.C, 77, (byte) 110, 0);
									if (af.td_p != null && af.td_p.Gd != null) {
										var12 = af.td_p.Gd;
										if (var9 == 0) {
											break label173;
										}
									}

									var12 = ff.rd_f;
								}

								var1.b(pc.a((byte) 125, new rd[]{var12, pc.colon}), 4, 90, 0);
								var1.b(pc.a((byte) 126, new rd[]{kd.D, le.rd_hb}), var1
										.b(pc.a((byte) 127, new rd[]{var12, vc.colon_})) + 6, 90, 255);
								ic.b(0, 77, 479, 0);
								if (var9 == 0) {
									break label287;
								}
							}

							var11 = wd.a(0, 96, 479, 0, false, 2, ta.Sb);
							if (var11) {
								break label287;
							}

							w.h = true;
							if (var9 == 0) {
								break label287;
							}
						}

						client.Y.a(id.eb, 10, 20, 459, 40, 0, false, 1, 1, 0);
						client.Y.c(e.clickToContinue2, 239, 80, 128);
						if (var9 == 0) {
							break label287;
						}
					}

					client.Y.c(gd.rd_m, 239, 40, 0);
					client.Y.c(pc.a((byte) 127, new rd[]{kd.x, le.rd_hb}), 239, 60, 128);
					if (var9 == 0) {
						break label287;
					}
				}

				client.Y.c(bc.enterAmount_2, 239, 40, 0);
				client.Y.c(pc.a((byte) 127, new rd[]{kd.x, le.rd_hb}), 239, 60, 128);
			}

			if (s.ub && bf.int_d == 2) {
				db.f(-7);
			}

			o.c(357);
		} catch (RuntimeException var10) {
			throw id.a(var10, "r.R(" + var0 + ')');
		}
	}

	static void e (int var0) {
		try {
			jc var1 = (jc) ra.x.c((byte) 89);
			if (var1 == null) {
				++int_i;
				ra.x.a(-118);
			} else {
				do {
					if (var1.B != null) {
						e.Nb.a(var1.B);
						var1.B = null;
					}

					if (var1.F != null) {
						e.Nb.a(var1.F);
						var1.F = null;
					}

					var1 = (jc) ra.x.a((byte) -68);
				} while (var1 != null);

				++int_i;
				ra.x.a(-118);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "r.P(" + var0 + ')');
		}
	}

	public static void f (int var0) {
		try {
			R = null;
			F = null;
			if (var0 == -15040) {
				loadedTitleScreen2 = null;
				rd_k = null;
				S = null;
				loadedTitleScreen = null;
				M = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.W(" + var0 + ')');
		}
	}

	public static void providesignlink (g var0) {
		try {
			f.Nc = var0;
			kd.o = var0;
			++H;
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.providesignlink(" + (var0 != null ? "{...}" : "null") + ')');
		}
	}

	static void a (nd var0, byte var1) {
		try {
			if (var1 != -57) {
				F = null;
			}

			int var2 = var0.dc >> 16;
			if (~ta.Sb == ~var2 || b.int_ld == var2) {
				w.h = true;
			}

			if (~ta.Yb == ~var2 || ta.Zb[pd.g] == var2) {
				db.F = true;
			}

			++int_s;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.BA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final synchronized void b (byte unused) {
		try {
			++Q;
			Container container;
			if (ec.frame_m != null) {
				container = ec.frame_m;
			} else {
				container = f.Nc.applet_b;
			}

			if (rd.canvas != null) {
				rd.canvas.removeFocusListener(this);
				container.remove(rd.canvas);
			}

			label25:
			{
				rd.canvas = new fb(this);
				container.add(rd.canvas);
				rd.canvas.setSize(pa.canvasWidth, ka.canvasHeight);
				rd.canvas.setVisible(true);
				if (ec.frame_m == null) {
					rd.canvas.setLocation(0, 0);
				} else {
					Insets insets = ec.frame_m.getInsets();
					rd.canvas.setLocation(insets.left, insets.top);
				}
			}

			rd.canvas.addFocusListener(this);
			rd.canvas.requestFocus();
			ee.boolean_o = true;
			h.boolean_d = false;
			dc.long_c = pa.c(0);
		} catch (RuntimeException var5) {
			throw id.a(var5, "r.AA(" + unused + ')');
		}
	}

	abstract void d (byte unused);

	final void a (int var1, int var2, int var3, byte var4, int var5, String var6, int var7, InetAddress var8) {
		try {
			try {
				s.Z = var1;
				pa.canvasWidth = var3;
				f.Sc = this;
				ka.canvasHeight = var5;
				ec.frame_m = new Frame();
				ec.frame_m.setTitle("Jagex");
				ec.frame_m.setResizable(false);
				ec.frame_m.addWindowListener(this);
				ec.frame_m.setVisible(true);
				ec.frame_m.toFront();
				Insets var9 = ec.frame_m.getInsets();
				ec.frame_m.setSize(var3 - -var9.left - -var9.right, var5 + (var9.top - -var9.bottom));
				kd.o = f.Nc = new g(true, null, var8, var7, var6, var2);
				f.Nc.a(1, (byte) -108, this);
			} catch (Exception var11) {
				se.a((byte) 103, var11, null);
			}

			++int_r;
		} catch (RuntimeException var12) {
			throw id.a(var12, "r.V(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ')');
		}
	}

	private void e (byte unused) {
		try {
			++E;
			long var2 = pa.c(0);
			long var4 = db.M[pc.g];
			db.M[pc.g] = var2;
			boolean var10000;
			if (var4 != 0L && ~var2 < ~var4) {
				var10000 = true;
			} else {
				var10000 = false;
			}

			pc.g = 1 + pc.g & 31;
			synchronized (this) {
				se.r = me.J;
			}

			this.d((byte) 117);
		} catch (RuntimeException var10) {
			throw id.a(var10, "r.O(" + unused + ')');
		}
	}

	public final void windowClosed (WindowEvent var1) {
		try {
			++B;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowClosed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private synchronized void a (int var1) {
		try {
			++x;
			if (!s.eb) {
				s.eb = true;

				try {
					rd.canvas.removeFocusListener(this);
				} catch (Exception var6) {
					var6.printStackTrace();
				}

				try {
					this.b(0);
				} catch (Exception var5) {
					var5.printStackTrace();
				}

				if (ec.frame_m != null) {
					try {
						System.exit(0);
					} catch (Throwable var4) {
						var4.printStackTrace();
					}
				}

				if (f.Nc != null) {
					try {
						f.Nc.a(var1 + 67);
					} catch (Exception var3) {
						var3.printStackTrace();
					}
				}

				this.d(-3);
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "r.T(" + var1 + ')');
		}
	}

	public final void windowIconified (WindowEvent var1) {
		try {
			++y;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowIconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void b (int var1);

	public final void focusGained (FocusEvent var1) {
		try {
			++J;
			me.J = true;
			ee.boolean_o = true;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean c (int var1) {
		try {
			++L;
			if (var1 != 14) {
				return true;
			} else {
				String var2 = "127.0.0.1";/*this.getDocumentBase().getHost().toLowerCase();*/
				if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
					if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
						if (var2.endsWith("127.0.0.1")) {
							return true;
						} else {
							while (var2.length() > 0 && ~var2.charAt(-1 + var2.length()) <= -49 && var2
									.charAt(-1 + var2.length()) <= 57) {
								var2 = var2.substring(0, var2.length() + -1);
							}

							if (var2.endsWith("192.168.1.")) {
								return true;
							} else {
								this.a(77, "invalidhost");
								return false;
							}
						}
					} else {
						return true;
					}
				} else {
					return true;
				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.U(" + var1 + ')');
		}
	}

	public final synchronized void paint (Graphics var1) {
		try {
			++int_f;
			if (f.Sc == this && !s.eb) {
				ee.boolean_o = true;
				if (g.javaVersionProperty_g != null && g.javaVersionProperty_g.startsWith("1.5") && ~(pa.c(0) + -dc.long_c) < -1001L) {
					Rectangle var2 = var1.getClipBounds();
					if (var2 == null || ~pa.canvasWidth >= ~var2.width && ka.canvasHeight <= var2.height) {
						h.boolean_d = true;
					}

				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.paint(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void d (int var1);

	public final URL getDocumentBase () {
		try {
			++int_a;
			return ec.frame_m != null ? null : (f.Nc != null && this != f.Nc.applet_b ? f.Nc.applet_b
					.getDocumentBase() : super
														.getDocumentBase());
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.getDocumentBase(" + ')');
		}
	}

	public final void windowOpened (WindowEvent var1) {
		try {
			++C;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowOpened(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public abstract void init ();

	public final void update (Graphics var1) {
		try {
			++D;
			this.paint(var1);
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.update(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void windowClosing (WindowEvent var1) {
		try {
			++int_l;
			this.destroy();
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void f (byte var1);

	private void g (byte unused) {
		try {
			++int_m;
			long l = pa.c(0);
			long l1 = ec.longs_o[gd.int_d];
			ec.longs_o[gd.int_d] = l;
			gd.int_d = 31 & 1 + gd.int_d;
			if (l1 != 0L && l1 < l) {
				int i = (int) (-l1 + l);
				wc.gameFPS = ((i >> 1) + 32000) / i;
			}

			if (bf.int_j++ > 50) {
				ee.boolean_o = true;
				bf.int_j -= 50;
				rd.canvas.setSize(pa.canvasWidth, ka.canvasHeight);
				rd.canvas.setVisible(true);
				if (ec.frame_m != null) {
					Insets insets = ec.frame_m.getInsets();
					rd.canvas.setLocation(insets.left, insets.top);
				} else {
					rd.canvas.setLocation(0, 0);
				}
			}

			this.g(-103);
		} catch (RuntimeException var8) {
			throw id.a(var8, "r.M(" + unused + ')');
		}
	}

	public final void windowDeiconified (WindowEvent var1) {
		try {
			++int_u;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowDeiconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void run () {
		try {
			++G;
			try {
				if (g.javaVendorProperty_a != null) {
					String javaVendor = g.javaVendorProperty_a.toLowerCase();
					if (!javaVendor.contains("sun") && !javaVendor.contains("apple")) {
						if (javaVendor.contains("ibm") && (g.javaVersionProperty_g == null || g.javaVersionProperty_g.equals("1.4.2"))) {
							this.a(77, "wrongjava");
							return;
						}
					} else {
						String javaVersion = g.javaVersionProperty_g;
						if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
							this.a(77, "wrongjava");
							return;
						}

						e.int_cb = 5;
					}
				}

				if (f.Nc.applet_b != null) {
					Method setFocusCycleRoot = g.setFocusCycleRoot_t;
					if (setFocusCycleRoot != null) {
						try {
							setFocusCycleRoot.invoke(f.Nc.applet_b, Boolean.TRUE);
						} catch (Throwable throwable) {
							throwable.printStackTrace();
						}
					}
				}

				this.b((byte) 75);
				wc.b = je.a(-59, pa.canvasWidth, ka.canvasHeight, rd.canvas);
				this.f((byte) -110);
				bc.H = w.d(-128);
				bc.H.e(15);
				if (cf.long_g == 0L || cf.long_g > pa.c(0)) {
					do {
						le.int_mb = bc.H.b(e.int_cb, dc.int_t, 64);
						int i = 0;
						while (le.int_mb > i) {
							this.e((byte) 110);
							++i;
						}

						this.g((byte) 109);
					} while (cf.long_g == 0L || ~cf.long_g < ~pa.c(0));
				}
			} catch (Exception e) {
				se.a((byte) -92, e, null);
				this.a(77, "crash");
			}

			this.a(0);
		} catch (RuntimeException var6) {
			throw id.a(var6, "r.run(" + ')');
		}
	}

	public final void focusLost (FocusEvent var1) {
		try {
			++int_w;
			me.J = false;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	final void a (int width, int fileStore, int height, int unused, int revision) {
		try {
			++int_g;

			try {
				if (f.Sc != null) {
					++rb.j;
					if (rb.j >= 3) {
						this.a(77, "alreadyloaded");
					} else {
						this.getAppletContext().showDocument(this.getDocumentBase());
					}
				} else {
					s.Z = revision;
					ka.canvasHeight = height;
					f.Sc = this;
					pa.canvasWidth = width;
					if (f.Nc == null) {
						kd.o = f.Nc = new g(false, this, InetAddress
								.getByName(this.getCodeBase().getHost()), fileStore, null, 0);
					}

					f.Nc.a(1, (byte) -118, this);
				}
			} catch (Exception e) {
				se.a((byte) -101, e, null);
				this.a(77, "crash");
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "r.Q(" + width + ',' + fileStore + ',' + height + ',' + unused + ',' + revision + ')');
		}
	}

	final void a (int var1, String var2) {
		try {
			++I;
			if (!this.N) {
				this.N = true;
				if (var1 != 77) {
					this.a(-8, null);
				}

				System.out.println("error_game_" + var2);

				try {
					this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var2 + ".ws"));
				} catch (Exception var4) {
					var4.printStackTrace();
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "r.S(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public final URL getCodeBase () {
		++int_p;
		return ec.frame_m != null ? null : (f.Nc != null && this != f.Nc.applet_b ? f.Nc.applet_b.getCodeBase() : super.getCodeBase());
	}

	public final String getParameter (String var1) {
		try {
			++int_b;
			return ec.frame_m != null ? null : (f.Nc != null && this != f.Nc.applet_b ? f.Nc.applet_b
					.getParameter(var1) : super
														.getParameter(var1));
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void start () {
		try {
			++int_t;
			if (this == f.Sc && !s.eb) {
				cf.long_g = 0L;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.start(" + ')');
		}
	}

	public final void stop () {
		try {
			++int_j;
			if (this == f.Sc && !s.eb) {
				cf.long_g = pa.c(0) - -4000L;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.stop(" + ')');
		}
	}

	public final void windowActivated (WindowEvent var1) {
		try {
			++int_h;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowActivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void destroy () {
		try {
			++int_c;
			if (f.Sc == this && !s.eb) {
				cf.long_g = pa.c(0);
				wa.sleep(17525, 5000L);
				kd.o = null;
				this.a(0);
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.destroy(" + ')');
		}
	}

	public final AppletContext getAppletContext () {
		try {
			++int_o;
			return ec.frame_m != null ? null : (f.Nc != null && this != f.Nc.applet_b ? f.Nc.applet_b
					.getAppletContext() : super
														.getAppletContext());
		} catch (RuntimeException var2) {
			throw id.a(var2, "r.getAppletContext(" + ')');
		}
	}

	abstract void g (int unused);

	public final void windowDeactivated (WindowEvent var1) {
		try {
			++K;
		} catch (RuntimeException var3) {
			throw id.a(var3, "r.windowDeactivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
