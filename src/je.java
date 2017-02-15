import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigInteger;

class je {
	static int int_b;
	static int int_c;
	static int int_d;
	static int int_g;
	static rd acceptTrade2;
	static int[] ints_i;
	static int int_j;
	static rd rd_k;
	static int int_l;
	static int int_n;
	static int int_o;
	static BigInteger bigInteger_p;
	static rd rd_q;
	static rd rd_s;
	static int int_t;
	static rd cabbage;
	static rd rd_v;
	static dd dd_w;
	static pb archiveFile2_;
	private static rd rd_e = md.a((String) "Please wait)3)3)3", (byte) 127);
	private static rd acceptTrade;
	private static rd rd_y;

	static {
		rd_k = rd_e;
		ints_i = new int[200];
		rd_q = rd_e;
		acceptTrade = md.a("Accept trade", (byte) 122);
		acceptTrade2 = acceptTrade;
		bigInteger_p = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		rd_v = md.a(" )2> @yel@", (byte) 119);
		cabbage = md.a("Cabbage", (byte) 126);
		int_t = 0;
		rd_y = md.a("wave2:", (byte) 121);
		rd_s = rd_y;
		dd_w = new dd(64);
	}

	je je_a;
	je je_f;
	long script;

	public static void a (int var0) {
		try {
			rd_y = null;
			rd_s = null;
			rd_e = null;
			if (var0 != 65536) {
				int_t = 79;
			}

			rd_v = null;
			acceptTrade = null;
			cabbage = null;
			dd_w = null;
			ints_i = null;
			rd_q = null;
			bigInteger_p = null;
			archiveFile2_ = null;
			rd_k = null;
			acceptTrade2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "je.AC(" + var0 + ')');
		}
	}

	static int b (int var0) {
		int var10 = client.int_tb;

		try {
			++int_b;
			int var1 = 3;
			if (var0 > -15) {
				return 84;
			} else {
				if (~nb.p > -311) {
					label135:
					{
						int var2 = wc.d >> 7;
						int var4 = af.td_p.x_ >> 7;
						int var3 = pa.n >> 7;
						if ((d.bytes_j[ce.plane][var2][var3] & 4) != 0) {
							var1 = ce.plane;
						}

						int var6;
						label126:
						{
							if (var4 <= var2) {
								var6 = var2 + -var4;
								if (var10 == 0) {
									break label126;
								}
							}

							var6 = -var2 + var4;
						}

						int var5;
						int var7;
						label121:
						{
							var5 = af.td_p.y_ >> 7;
							if (~var5 >= ~var3) {
								var7 = var3 - var5;
								if (var10 == 0) {
									break label121;
								}
							}

							var7 = -var3 + var5;
						}

						int var8;
						int var9;
						if (var7 < var6) {
							var8 = var7 * 65536 / var6;
							var9 = '耀';
							if (var10 != 0 || var2 != var4) {
								do {
									label102:
									{
										var9 += var8;
										if (~var4 < ~var2) {
											++var2;
											if (var10 == 0) {
												break label102;
											}
										}

										if (var2 > var4) {
											--var2;
										}
									}

									if (~(4 & d.bytes_j[ce.plane][var2][var3]) != -1) {
										var1 = ce.plane;
									}

									if (var9 >= 65536) {
										label94:
										{
											var9 -= 65536;
											if (var5 > var3) {
												++var3;
												if (var10 == 0) {
													break label94;
												}
											}

											if (var3 > var5) {
												--var3;
											}
										}

										if ((4 & d.bytes_j[ce.plane][var2][var3]) != 0) {
											var1 = ce.plane;
										}
									}
								} while (var2 != var4);
							}

							if (var10 == 0) {
								break label135;
							}
						}

						var8 = var6 * 65536 / var7;
						var9 = '耀';
						if (var10 != 0 || var3 != var5) {
							do {
								label79:
								{
									if (~var5 >= ~var3) {
										if (var5 >= var3) {
											break label79;
										}

										--var3;
										if (var10 == 0) {
											break label79;
										}
									}

									++var3;
								}

								var9 += var8;
								if (~(4 & d.bytes_j[ce.plane][var2][var3]) != -1) {
									var1 = ce.plane;
								}

								if (var9 >= 65536) {
									label69:
									{
										var9 -= 65536;
										if (~var2 > ~var4) {
											++var2;
											if (var10 == 0) {
												break label69;
											}
										}

										if (var2 > var4) {
											--var2;
										}
									}

									if ((4 & d.bytes_j[ce.plane][var2][var3]) != 0) {
										var1 = ce.plane;
									}
								}
							} while (var3 != var5);
						}
					}
				}

				if (~(d.bytes_j[ce.plane][af.td_p.x_ >> 7][af.td_p.y_ >> 7] & 4) != -1) {
					var1 = ce.plane;
				}

				return var1;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "je.DC(" + var0 + ')');
		}
	}

	static void a (boolean var0) {
		int var5 = client.int_tb;

		try {
			++int_c;
			if (bf.int_l == 0) {
				id.rb = 1;
				ta.xb[0] = ge.rd_db;
				sa.mb[0] = 1004;
				if (ee.int_h != -1) {
					gf.int_f = -1;
					we.int_t = -1;
					l.a(503, la.t, 765, 0, 2331, 0, 0, ee.int_h, pb.H);
					be.int_k = gf.int_f;
					bf.int_m = we.int_t;
				} else {
					boolean var1 = false;
					le.c(!var0);
					we.int_t = -1;
					gf.int_f = -1;
					if (pb.H > 4 && ~la.t < -5 && pb.H < 516 && ~la.t > -339) {
						label146:
						{
							if (~sa.zb == 0) {
								ee.a(false);
								if (var5 == 0) {
									break label146;
								}
							}

							l.a(338, la.t, 516, 4, 2331, 4, 0, sa.zb, pb.H);
						}
					}

					be.int_k = gf.int_f;
					gf.int_f = -1;
					bf.int_m = we.int_t;
					we.int_t = -1;
					if (!var0) {
						b(true);
					}

					if (~pb.H < -554 && ~la.t < -206 && ~pb.H > -744 && ~la.t > -467) {
						label136:
						{
							if (~ta.Yb == 0) {
								if (ta.Zb[pd.g] == -1) {
									break label136;
								}

								l.a(466, la.t, 743, 553, 2331, 205, 1, ta.Zb[pd.g], pb.H);
								if (var5 == 0) {
									break label136;
								}
							}

							l.a(466, la.t, 743, 553, 2331, 205, 1, ta.Yb, pb.H);
						}
					}

					if (qc.Q != gf.int_f) {
						db.F = true;
						qc.Q = gf.int_f;
					}

					if (~we.int_t != ~ca.int_l) {
						ca.int_l = we.int_t;
						db.F = true;
					}

					we.int_t = -1;
					gf.int_f = -1;
					if (~pb.H < -18 && ~la.t < -358 && pb.H < 496 && ~la.t > -454) {
						label122:
						{
							if (~ta.Sb == 0) {
								if (~b.int_ld != 0) {
									l.a(453, la.t, 496, 17, 2331, 357, 3, b.int_ld, pb.H);
									if (var5 == 0) {
										break label122;
									}
								}

								if (~la.t <= -435 || pb.H >= 426) {
									break label122;
								}

								df.a(pb.H + -17, -357 + la.t, (byte) 106);
								if (var5 == 0) {
									break label122;
								}
							}

							l.a(453, la.t, 496, 17, 2331, 357, 2, ta.Sb, pb.H);
						}
					}

					if ((ta.Sb != -1 || b.int_ld != -1) && ~u.Z != ~gf.int_f) {
						u.Z = gf.int_f;
						w.h = true;
					}

					if (~ta.Sb == 0 && ~b.int_ld == 0) {
						if (var1) {
							return;
						}
					} else if (~te.Cb != ~we.int_t) {
						te.Cb = we.int_t;
						w.h = true;
						if (var5 == 0 && var1) {
							return;
						}
					} else if (var1) {
						return;
					}

					do {
						var1 = true;
						int var2 = 0;
						if (var5 != 0 || ~var2 > ~(id.rb + -1)) {
							do {
								if (~sa.mb[var2] > -1001 && ~sa.mb[var2 - -1] < -1001) {
									var1 = false;
									rd var3 = ta.xb[var2];
									ta.xb[var2] = ta.xb[var2 + 1];
									ta.xb[var2 + 1] = var3;
									int var4 = sa.mb[var2];
									sa.mb[var2] = sa.mb[var2 + 1];
									sa.mb[var2 - -1] = var4;
									var4 = kd.ints_f[var2];
									kd.ints_f[var2] = kd.ints_f[var2 - -1];
									kd.ints_f[1 + var2] = var4;
									var4 = sb.ints_k[var2];
									sb.ints_k[var2] = sb.ints_k[1 + var2];
									sb.ints_k[var2 - -1] = var4;
									var4 = pe.q[var2];
									pe.q[var2] = pe.q[var2 + 1];
									pe.q[1 + var2] = var4;
								}

								++var2;
							} while (~var2 > ~(id.rb + -1));
						}
					} while (!var1);

				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "je.EC(" + var0 + ')');
		}
	}

	static jd a (int unused, int width, int height, Component component) {
		try {
			++int_d;
			try {
				Class class_rc = Class.forName("rc");
				jd class_jd = (jd) class_rc.newInstance();
				class_jd.a(width, 0, height, component);
				return class_jd;
			} catch (Throwable throwable) {
				qc class_qc = new qc();
				class_qc.a(width, 0, height, component);
				return class_qc;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "je.VB(" + unused + ',' + width + ',' + height + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	static void b (boolean var0) {
		try {
			++int_g;
			sb.jd_q.a(-1926);
			if (var0) {
				b(false);
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "je.WB(" + var0 + ')');
		}
	}

	static void a (Color color, int w, rd loadingText, int unused) {
		try {
			try {
				Graphics canvasGraphics = rd.canvas.getGraphics();
				if (nd.font == null) {
					nd.font = new Font("Helvetica", 1, 13);
					ta.fontMetrics = rd.canvas.getFontMetrics(nd.font);
				}

				if (ee.boolean_o) {
					ee.boolean_o = false;
					canvasGraphics.setColor(Color.black);
					canvasGraphics.fillRect(0, 0, pa.canvasWidth, ka.canvasHeight);
				}

				if (color == null) {
					color = new Color(140, 17, 17);
				}

				try {
					if (f.image == null) {
						f.image = rd.canvas.createImage(304, 34);
					}

					Graphics imageGraphics = f.image.getGraphics();
					imageGraphics.setColor(color);
					imageGraphics.drawRect(0, 0, 303, 33);
					imageGraphics.fillRect(2, 2, w * 3, 30);
					imageGraphics.setColor(Color.black);
					imageGraphics.drawRect(1, 1, 301, 31);
					imageGraphics.fillRect(2 + (3 * w), 2, -(3 * w) + 300, 30);
					imageGraphics.setFont(nd.font);
					imageGraphics.setColor(Color.white);
					loadingText.drawString((304 + -loadingText.stringWidth(ta.fontMetrics, -82)) / 2, -71, 22, imageGraphics);
					canvasGraphics.drawImage(f.image, pa.canvasWidth / 2 + -152, ka.canvasHeight / 2 + -18, null);
				} catch (Exception var7) {
					int x = -152 + pa.canvasWidth / 2;
					int y = -18 + ka.canvasHeight / 2;
					canvasGraphics.setColor(color);
					canvasGraphics.drawRect(x, y, 303, 33);
					canvasGraphics.fillRect(2 + x, 2 + y, 3 * w, 30);
					canvasGraphics.setColor(Color.black);
					canvasGraphics.drawRect(x + 1, 1 + y, 301, 31);
					canvasGraphics.fillRect(x + 2 + w * 3, y + 2, -(3 * w) + 300, 30);
					canvasGraphics.setFont(nd.font);
					canvasGraphics.setColor(Color.white);
					loadingText.drawString(x + (304 + -loadingText.stringWidth(ta.fontMetrics, -91)) / 2, -108, y + 22, canvasGraphics);
				}
			} catch (Exception e) {
				rd.canvas.repaint();
			}

			++int_o;
		} catch (RuntimeException var9) {
			throw id.a(var9, "je.UB(" + (color != null ? "{...}" : "null") + ',' + w + ',' + (loadingText != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final boolean c (int var1) {
		try {
			++int_j;
			if (var1 != -32303) {
				a(false);
			}

			return this.je_a != null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "je.CC(" + var1 + ')');
		}
	}

	final void d (int unused) {
		try {
			++int_l;
			if (this.je_a != null) {
				this.je_a.je_f = this.je_f;
				this.je_f.je_a = this.je_a;
				this.je_f = null;
				this.je_a = null;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "je.BC(" + unused + ')');
		}
	}
}
