final class ka extends ha {
	static int rb;
	static rd logo = md.a((String) "logo", (byte) 120);
	static int xb;
	static int yb;
	static int[] Fb;
	static int Kb = 0;
	static int Pb;
	static int Qb;
	static int Rb = 0;
	static d Tb;
	static int[] Ub = new int[32];
	static pb archiveFile2;
	static jd Zb;
	static int bc;
	static rd overlay_multiway;
	static int canvasHeight;
	static rd pleaseContactCustomerSupport2;
	static int int_fc;
	private static rd pleaseContactCustomerSupport;

	static {
		int var0 = 2;

		for (int var1 = 0 ; var1 < 32 ; ++var1) {
			Ub[var1] = var0 - 1;
			var0 += var0;
		}

		pleaseContactCustomerSupport = md.a("Please contact customer support)3", (byte) 122);
		pleaseContactCustomerSupport2 = pleaseContactCustomerSupport;
		overlay_multiway = md.a("overlay_multiway", (byte) 123);
	}

	int int_ub;
	double vb;
	int int_wb;
	int Bb;
	double Eb;
	int Mb;
	double Ob;
	int Wb;
	int int_hc;
	private double tb;
	private int zb;
	private int Ab;
	private double Cb;
	private int Db;
	private double Gb;
	private int Hb = 0;
	private int Ib;
	private int Jb;
	private double Lb;
	private double Nb;
	private boolean Sb = false;
	private int Xb;
	private int Yb = 0;
	private int ac;
	private e ic;

	ka (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
		int var11) {
		try {
			this.ac = var9;
			this.Mb = var10;
			this.int_wb = var6;
			this.zb = var3;
			this.Jb = var8;
			this.Db = var1;
			this.Ab = var5;
			this.Sb = false;
			this.Bb = var11;
			this.int_hc = var7;
			this.Wb = var2;
			this.Xb = var4;
			int var12 = l.a(true, this.Db).xb;
			if (~var12 != 0) {
				this.ic = bd.a(var12, false);
			} else {
				this.ic = null;
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "ka.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	public static void d (byte var0) {
		try {
			Tb = null;
			overlay_multiway = null;
			Zb = null;
			Ub = null;
			logo = null;
			archiveFile2 = null;
			pleaseContactCustomerSupport2 = null;
			Fb = null;
			if (var0 == -128) {
				pleaseContactCustomerSupport = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ka.C(" + var0 + ')');
		}
	}

	static boolean b (int var0, int var1) {
		try {
			if (var0 < 14) {
				return false;
			} else {
				++yb;
				return var1 < 32 ? false : (~var1 == -128 ? false : var1 < 129 || ~var1 < -160);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ka.H(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (int unused, mc class_mc) {
		try {
			++Qb;
			class_mc.C = false;
			if (class_mc.z != null) {
				class_mc.z.z = 0;
			}

			mc class_mc_2 = class_mc.b();
			if (class_mc_2 != null) {
				do {
					a(-22, class_mc_2);
					class_mc_2 = class_mc.d();
				} while (class_mc_2 != null);

			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ka.G(" + unused + ',' + "{...}" + ')');
		}
	}

	static void a (nd var0, int var1) {
		int var4 = client.int_tb;

		try {
			++Pb;
			int var2 = var0.Sb;
			int var3;
			if ((var2 < 1 || ~var2 < -101) && (~var2 > -702 || ~var2 < -801)) {
				if ((~var2 > -102 || ~var2 < -201) && (~var2 > -802 || ~var2 < -901)) {
					if (~var2 == -204) {
						var3 = u.int_eb;
						if (ke.int_mb != 2) {
							var3 = 0;
						}

						var0.mb = 20 + var3 * 15;
						if (var0.Nb >= var0.mb) {
							var0.mb = 1 + var0.Nb;
						}

					} else if (~var2 <= -402 && var2 <= 500) {
						var2 -= 401;
						if (~var2 == -1 && ke.int_mb == 0) {
							var0.rd_ub = eb.loadingIgnoreList2;
							var0.jc = 0;
						} else if (~var2 == -2 && ke.int_mb == 0) {
							var0.rd_ub = je.rd_q;
							var0.jc = 0;
						} else {
							var3 = nc.p;
							if (~ke.int_mb == -1) {
								var3 = 0;
							}

							if (~var3 >= ~var2) {
								var0.jc = 0;
								var0.rd_ub = kd.rd_v;
							} else {
								var0.rd_ub = ff.a(var1 ^ 5027, md.p[var2]).e(-100);
								var0.jc = 1;
							}
						}
					} else if (~var2 == -504) {
						var0.mb = nc.p * 15 + 20;
						if (~var0.mb >= ~var0.Nb) {
							var0.mb = 1 + var0.Nb;
						}

					} else {
						if (var1 != -29798) {
							overlay_multiway = null;
						}

						if (var2 == 324) {
							if (~ec.q == 0) {
								ke.Jb = var0.int_nc;
								ec.q = var0.ab;
							}

							if (s.ob.y) {
								var0.ab = ec.q;
							} else {
								var0.ab = ke.Jb;
							}
						} else if (var2 == 325) {
							if (ec.q == -1) {
								ke.Jb = var0.int_nc;
								ec.q = var0.ab;
							}

							if (!s.ob.y) {
								var0.ab = ec.q;
							} else {
								var0.ab = ke.Jb;
							}
						} else if (var2 == 327) {
							var0.int_id = 150;
							var0.int_sd = (int) (256.0D * Math.sin((double) ce.y / 40.0D)) & 2047;
							var0.int_od = 5;
							var0.int_kc = 0;
						} else if (~var2 == -329) {
							var0.int_id = 150;
							var0.int_sd = 2047 & (int) (Math.sin((double) ce.y / 40.0D) * 256.0D);
							var0.int_od = 5;
							var0.int_kc = 1;
						} else if (~var2 == -601) {
							var0.rd_ub = pc.a((byte) 126, new rd[]{kd.C, nb.g});
						} else if (var2 == 620) {
							if (~ib.int_l > -2) {
								var0.rd_ub = kd.rd_v;
							} else if (ce.boolean_s) {
								var0.rd_ub = j.yb;
								var0.Z = 16711680;
							} else {
								var0.Z = 16777215;
								var0.rd_ub = se.rd_a;
							}
						}
					}
				} else {
					label202:
					{
						if (~var2 < -801) {
							var2 -= 701;
							if (var4 == 0) {
								break label202;
							}
						}

						var2 -= 101;
					}

					var3 = u.int_eb;
					if (ke.int_mb != 2) {
						var3 = 0;
					}

					if (var2 >= var3) {
						var0.rd_ub = kd.rd_v;
						var0.jc = 0;
					} else {
						label194:
						{
							if (~ee.ints_k[var2] != -1) {
								if (ee.ints_k[var2] < 5000) {
									if (~sa.worldId_tb != ~ee.ints_k[var2]) {
										var0.rd_ub = pc
												.a((byte) 126, new rd[]{ab.rd_j, ld.h, bf.a(ee.ints_k[var2], -31766)});
										if (var4 == 0) {
											break label194;
										}
									}

									var0.rd_ub = pc.a((byte) 125, new rd[]{me.z, ld.h, bf.a(ee.ints_k[var2], -31766)});
									if (var4 == 0) {
										break label194;
									}
								}

								if (~ee.ints_k[var2] != ~sa.worldId_tb) {
									var0.rd_ub = pc.a((byte) 127, new rd[]{
											ab.rd_j,
											gf.rd_p,
											bf.a(-5000 + ee.ints_k[var2], -31766)
									});
									if (var4 == 0) {
										break label194;
									}
								}

								var0.rd_ub = pc
										.a((byte) 126, new rd[]{me.z, gf.rd_p, bf.a(ee.ints_k[var2] + -5000, -31766)});
								if (var4 == 0) {
									break label194;
								}
							}

							var0.rd_ub = pc.a((byte) 125, new rd[]{pd.s, cc.offline2});
						}

						var0.jc = 1;
					}
				}
			} else {
				if (ke.int_mb == 0) {
					if (var2 == 1) {
						var0.rd_ub = gf.rd_n;
						var0.jc = 0;
						return;
					}

					if (var2 == 2) {
						var0.jc = 0;
						var0.rd_ub = je.rd_q;
						return;
					}
				}

				if (~ke.int_mb == -2) {
					if (~var2 == -2) {
						var0.jc = 0;
						var0.rd_ub = d.connectingToFriendserver2;
						return;
					}

					if (var2 == 2) {
						var0.rd_ub = je.rd_k;
						var0.jc = 0;
						return;
					}

					if (~var2 == -4) {
						var0.rd_ub = pd.y;
						var0.jc = 0;
						return;
					}
				}

				label177:
				{
					if (~var2 >= -701) {
						--var2;
						if (var4 == 0) {
							break label177;
						}
					}

					var2 -= 601;
				}

				var3 = u.int_eb;
				if (~ke.int_mb != -3) {
					var3 = 0;
				}

				if (~var2 <= ~var3) {
					var0.jc = 0;
					var0.rd_ub = kd.rd_v;
				} else {
					var0.rd_ub = ad.rds_k[var2];
					var0.jc = 1;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ka.B(" + "{...}" + ',' + var1 + ')');
		}
	}

	static void e (byte var0) {
		try {
			++rb;
			if (ee.boolean_o) {
				ee.boolean_o = false;
				id.j((byte) 126);
				w.h = true;
				pe.l = true;
				db.L = true;
				db.F = true;
			}

			sa.f(-110);
			if (s.ub && ~bf.int_d == -2) {
				db.F = true;
			}

			boolean var1;
			if (~ta.Yb != 0) {
				var1 = client.b(ta.Yb, 0);
				if (var1) {
					db.F = true;
				}
			}

			if (wa.xb == 2) {
				db.F = true;
			}

			if (~bf.int_l == -3) {
				db.F = true;
			}

			if (db.F) {
				db.F = false;
				ra.a(9236);
			}

			int var4;
			if (ta.Sb == -1) {
				wb.ab.int_ib = -77 + me.C + -hc.Ub;
				if (pb.H > 17 && ~pb.H > -561 && la.t > 332) {
					nb.a(me.C, 77, 0, la.t - 357, -1, -97, pb.H - 17, wb.ab, 463);
				}

				var4 = -wb.ab.int_ib + (me.C - 77);
				if (var4 < 0) {
					var4 = 0;
				}

				if (~(me.C - 77) > ~var4) {
					var4 = -77 + me.C;
				}

				if (var4 != hc.Ub) {
					w.h = true;
					hc.Ub = var4;
				}
			}

			if (~ta.Sb == 0 && wb.int_db == 3) {
				wb.ab.int_ib = od.yb;
				var4 = 7 + 14 * dd.B;
				if (~pb.H < -18 && ~pb.H > -561 && la.t > 332) {
					nb.a(var4, 77, 0, la.t - 357, -1, -122, -17 + pb.H, wb.ab, 463);
				}

				int var2 = wb.ab.int_ib;
				if (~var2 > -1) {
					var2 = 0;
				}

				if (-77 + var4 < var2) {
					var2 = -77 + var4;
				}

				if (~var2 != ~od.yb) {
					w.h = true;
					od.yb = var2;
				}
			}

			if (ta.Sb != -1) {
				var1 = client.b(ta.Sb, 0);
				if (var1) {
					w.h = true;
				}
			}

			if (wa.xb == 3) {
				w.h = true;
			}

			if (~bf.int_l == -4) {
				w.h = true;
			}

			if (id.eb != null) {
				w.h = true;
			}

			if (s.ub && ~bf.int_d == -3) {
				w.h = true;
			}

			if (w.h) {
				w.h = false;
				r.a(false);
			}

			if (var0 != 92) {
				Tb = null;
			}

			pd.a(false);
			if (fc.int_r != -1) {
				pe.l = true;
			}

			if (pe.l) {
				if (fc.int_r != -1 && fc.int_r == pd.g) {
					++sd.S;
					fc.int_r = -1;
					ie.writeStream.writeOpcode(8, 148);
					ie.writeStream.writeByte((byte) -34, pd.g);
				}

				ie.redrawIcons = true;
				pe.l = false;
				db.a((byte) 123, pd.g, ta.Zb, ce.y % 20 < 10 ? -1 : fc.int_r, ~ta.Yb == 0);
			}

			if (db.L) {
				db.L = false;
				ie.redrawIcons = true;
				ub.a(ub.privateChatStatus, var0 + -51, bd.publicChatStatus, ad.gb_a, pa.trade_competeStatus);
			}

			we.a(ce.plane, af.td_p.x_, af.td_p.y_, 84, va.g);
			va.g = 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ka.E(" + var0 + ')');
		}
	}

	final void a (int var1, int var2) {
		int var4 = client.int_tb;

		try {
			this.vb += (double) var2 * this.Gb;
			this.Ob += (double) var2 * this.tb;
			this.Sb = true;
			this.Eb += (double) var2 * this.Nb * 0.5D * (double) var2 + this.Cb * (double) var2;
			++xb;
			this.Cb += this.Nb * (double) var2;
			this.int_ub = 2047 & 1024 + (int) (325.949D * Math.atan2(this.Gb, this.tb));
			this.Ib = 2047 & (int) (325.949D * Math.atan2(this.Cb, this.Lb));
			if (this.ic != null) {
				this.Hb += var2;
				if (var4 != 0 || this.Hb > this.ic.Eb[this.Yb]) {
					do {
						this.Hb -= this.ic.Eb[this.Yb];
						++this.Yb;
						if (~this.Yb <= ~this.ic.Gb.length) {
							this.Yb -= this.ic.Bb;
							if (~this.Yb > -1 || ~this.ic.Gb.length >= ~this.Yb) {
								this.Yb = 0;
							}
						}
					} while (this.Hb > this.ic.Eb[this.Yb]);
				}
			}

			if (var1 != 20) {
				this.a(-51, 68, 110, (byte) -44, 127);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ka.A(" + var1 + ',' + var2 + ')');
		}
	}

	final void a (int var1, int var2, int var3, byte var4, int var5) {
		try {
			++bc;
			double var6;
			if (!this.Sb) {
				var6 = (double) (-this.zb + var3);
				double var8 = (double) (var2 + -this.Xb);
				double var10 = Math.sqrt(var8 * var8 + var6 * var6);
				this.Ob = (double) this.ac * var8 / var10 + (double) this.Xb;
				this.Eb = (double) this.Ab;
				this.vb = var6 * (double) this.ac / var10 + (double) this.zb;
			}

			var6 = (double) (this.int_hc + 1 + -var5);
			this.Gb = ((double) var3 - this.vb) / var6;
			this.tb = ((double) var2 - this.Ob) / var6;
			int var13 = -122 % ((var4 - 44) / 36);
			this.Lb = Math.sqrt(this.Gb * this.Gb + this.tb * this.tb);
			if (!this.Sb) {
				this.Cb = -this.Lb * Math.tan((double) this.Jb * 0.02454369D);
			}

			this.Nb = (-this.Eb + (double) var1 - var6 * this.Cb) * 2.0D / (var6 * var6);
		} catch (RuntimeException var12) {
			throw id.a(var12, "ka.D(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	final ue c (byte var1) {
		try {
			++int_fc;
			j var2 = l.a(true, this.Db);
			if (var1 > -9) {
				this.a(99, 8, -51, (byte) 49, -14);
			}

			ue var3 = var2.b(-1565796086, this.Yb);
			if (var3 == null) {
				return null;
			} else {
				var3.g(this.Ib);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ka.F(" + var1 + ')');
		}
	}
}
