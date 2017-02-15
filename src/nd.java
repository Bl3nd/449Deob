import java.awt.Font;

final class nd extends jb {
	static int lb;
	static int nb;
	static int qb;
	static int vb;
	static int wb;
	static int Fb;
	static int Kb;
	static int Xb;
	static int Zb;
	static volatile long long_ec = 0L;
	static int fc;
	static int int_lc;
	static int mc;
	static int tc;
	static int vc;
	static w Bc = new w();
	static int int_ad;
	static Font font;
	static jd gd;
	static int qd;
	static rd td;
	static rd ud = md.a((String) "Lade Schrifts-=tze )2 ", (byte) 119);
	static int wd;
	static nc[] xd;
	private static rd rd_pd = md.a((String) "wave:", (byte) 123);

	static {
		td = rd_pd;
		wd = 0;
		qd = 0;
		xd = new nc[4];
	}

	int Z;
	int ab = -1;
	int bb;
	int cb = 0;
	int int_db;
	Object[] objects_eb;
	boolean gb = false;
	int int_hb = 0;
	int int_ib;
	boolean jb = false;
	int kb;
	int mb = 0;
	int[] ob;
	Object[] pb;
	int rb = -1;
	int int_sb;
	int tb;
	rd rd_ub;
	int[] xb;
	boolean yb;
	nd zb = null;
	nd[] Ab;
	int Bb;
	Object[] Cb;
	boolean Db;
	Object[] Eb;
	rd Gb;
	int Hb;
	int Ib;
	Object[] Jb;
	int Lb;
	int Mb;
	int Nb;
	int Ob = 0;
	boolean Pb;
	boolean Qb;
	boolean Rb;
	int Sb;
	int Tb;
	int Ub;
	int Vb;
	Object[] Wb;
	int[][] Yb;
	int ac;
	Object[] objects_cc;
	int dc;
	int gc;
	Object[] hc;
	int[] ints_ic;
	int jc;
	int int_kc;
	int int_nc;
	boolean oc;
	int pc;
	int qc;
	int rc;
	int sc;
	Object[] uc;
	Object[] wc;
	int xc;
	int yc;
	int[] zc;
	rd[] Ac;
	int Cc;
	int[] Dc;
	Object[] Ec;
	Object[] Fc;
	rd Gc;
	int[] Hc;
	boolean Ic;
	boolean Jc;
	Object[] Kc;
	rd Lc;
	Object[] Mc;
	int Nc;
	Object[] Oc;
	int Pc;
	int Qc;
	int Rc;
	boolean Sc;
	int Tc;
	int Uc;
	int Vc;
	int Wc;
	rd Xc;
	int Yc;
	int[] Zc;
	int int_bd;
	Object[] cd;
	boolean dd;
	int ed;
	int hd;
	int int_id;
	int jd;
	rd[] kd;
	Object[] objects_ld;
	Object[] objects_md;
	rd nd;
	int int_od;
	int rd;
	int int_sd;
	Object[] vd;
	private int int_fb;
	private int bc;

	public nd () {
		this.rd_ub = nc.n;
		this.dc = -1;
		this.Rb = false;
		this.Gb = nc.n;
		this.Tb = -1;
		this.jc = 0;
		this.Hb = 0;
		this.int_sb = 0;
		this.Mb = 0;
		this.bc = 1;
		this.Ub = 0;
		this.int_db = 100;
		this.ac = 0;
		this.pc = -1;
		this.oc = false;
		this.Ib = -1;
		this.rc = 0;
		this.Nb = 0;
		this.int_kc = -1;
		this.Gc = nc.n;
		this.Bb = 0;
		this.Lb = 0;
		this.Qb = false;
		this.Sb = 0;
		this.sc = 1;
		this.Vc = 0;
		this.gc = 0;
		this.Rc = 0;
		this.Z = 0;
		this.Sc = false;
		this.kb = 0;
		this.Wc = 0;
		this.Pc = 0;
		this.Lc = nc.n;
		this.int_nc = -1;
		this.Jc = false;
		this.Db = false;
		this.Nc = 0;
		this.Qc = -1;
		this.int_fb = -1;
		this.xc = 0;
		this.Xc = nc.n;
		this.Yc = -1;
		this.Ic = false;
		this.ed = 0;
		this.Cc = 0;
		this.Uc = -1;
		this.hd = 0;
		this.jd = 0;
		this.bb = 0;
		this.yc = -1;
		this.int_ib = 0;
		this.Vb = 0;
		this.int_id = 0;
		this.int_od = 1;
		this.int_bd = 0;
		this.Tc = 0;
		this.qc = 0;
		this.dd = false;
		this.nd = fb.ok2;
		this.rd = 0;
		this.int_sd = 0;
	}

	public static void f (int var0) {
		try {
			rd_pd = null;
			font = null;
			xd = null;
			td = null;
			Bc = null;
			ud = null;
			if (var0 != 23814) {
				a(46L, false);
			}

			gd = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "nd.L(" + var0 + ')');
		}
	}

	static boolean a (int var0, boolean var1) {
		try {
			++tc;
			if (!var1) {
				g(-51);
			}

			return (1 & var0 >> 21) != 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "nd.H(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (byte unused, int var1) {
		int var4 = client.int_tb;

		try {
			++wb;
			if (var1 != -1) {
				if (l.Z[var1]) {
					eb.archiveFile3.b((byte) -69, var1);
					if (ld.c[var1] != null) {
						boolean var2 = true;
						int var3 = 0;
						if (var4 == 0 && ld.c[var1].length <= var3) {
							if (var2) {
								ld.c[var1] = null;
							}

							l.Z[var1] = false;
						} else {
							do {
								if (ld.c[var1][var3] != null) {
									label35:
									{
										if (ld.c[var1][var3].tb == 2) {
											var2 = false;
											if (var4 == 0) {
												break label35;
											}
										}

										ld.c[var1][var3] = null;
									}
								}

								++var3;
							} while (ld.c[var1].length > var3);

							if (var2) {
								ld.c[var1] = null;
							}

							l.Z[var1] = false;
						}
					}
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "nd.M(" + unused + ',' + var1 + ')');
		}
	}

	static boolean b (int var0, int var1) {
		try {
			++Zb;
			if (var1 < 102) {
				font = null;
			}

			return var0 >= 97 && ~var0 >= -123 ? true : (~var0 <= -66 && ~var0 >= -91 ? true : ~var0 <= -49 && var0 <= 57);
		} catch (RuntimeException var3) {
			throw id.a(var3, "nd.O(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (int var0, rd var1, boolean var2, rd var3) {
		try {
			++qb;
			if (ee.boolean_o) {
				ee.boolean_o = false;
				id.j((byte) 107);
				o.c(357);
				o.b((byte) -7);
				od.f(var0 + 125);
				ub.a(ub.privateChatStatus, 41, bd.publicChatStatus, ad.gb_a, pa.trade_competeStatus);
				db.a((byte) 127, pd.g, ta.Zb, -1, ta.Yb == -1);
				la.redrawChatPanel = true;
				ff.redrawSidePanel = true;
				ie.redrawIcons = true;
			}

			short var4 = 151;
			int var7 = var4 - 3;
			ie.a((byte) -34);
			ad.gb_a.c(var3, 257, var7, var0);
			ad.gb_a.c(var3, 256, -1 + var7, 16777215);
			if (var1 != null) {
				var7 += 15;
				if (var2) {
					int var5 = 4 + ad.gb_a.b(var1);
					ic.c(-(var5 / 2) + 257, -11 + var7, var5, 11, 0);
				}

				ad.gb_a.c(var1, 257, var7, 0);
				ad.gb_a.c(var1, 256, var7 + -1, 16777215);
			}

			pa.b(-90);
		} catch (RuntimeException var6) {
			throw id.a(var6, "nd.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static void g (int var0) {
		int var10 = client.int_tb;

		try {
			++Xb;
			lc.readStream.initializeBITAccess(-109);
			int var1 = lc.readStream.readBits((byte) 50, 8);
			int var2;
			if (~lc.q < ~var1) {
				var2 = var1;
				if (var10 != 0 || ~lc.q < ~var1) {
					do {
						pd.E[me.Q++] = ca.ints_b[var2];
						++var2;
					} while (~lc.q < ~var2);
				}
			}

			if (var0 != 2) {
				wd = 44;
			}

			if (~var1 < ~lc.q) {
				throw new RuntimeException("gnpov1");
			} else {
				lc.q = 0;
				var2 = 0;
				if (var10 != 0 || var2 < var1) {
					do {
						label86:
						{
							int var3 = ca.ints_b[var2];
							b var4 = ta.Nb[var3];
							int var5 = lc.readStream.readBits((byte) 41, 1);
							if (var5 == 0) {
								ca.ints_b[lc.q++] = var3;
								var4.Pb = ce.y;
								if (var10 == 0) {
									break label86;
								}
							}

							int var6 = lc.readStream.readBits((byte) 105, 2);
							if (~var6 == -1) {
								ca.ints_b[lc.q++] = var3;
								var4.Pb = ce.y;
								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							int var7;
							int var8;
							if (~var6 == -2) {
								ca.ints_b[lc.q++] = var3;
								var4.Pb = ce.y;
								var7 = lc.readStream.readBits((byte) 75, 3);
								var4.a(false, var7, false);
								var8 = lc.readStream.readBits((byte) 71, 1);
								if (var8 != 1) {
									break label86;
								}

								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							if (var6 == 2) {
								ca.ints_b[lc.q++] = var3;
								var4.Pb = ce.y;
								var7 = lc.readStream.readBits((byte) 44, 3);
								var4.a(true, var7, false);
								var8 = lc.readStream.readBits((byte) 55, 3);
								var4.a(true, var8, false);
								int var9 = lc.readStream.readBits((byte) 84, 1);
								if (~var9 != -2) {
									break label86;
								}

								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							if (var6 == 3) {
								pd.E[me.Q++] = var3;
							}
						}

						++var2;
					} while (var2 < var1);

				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "nd.P(" + var0 + ')');
		}
	}

	static void a (long var0, boolean var2) {
		int var5 = client.int_tb;

		try {
			++int_lc;
			if (~var0 != -1L) {
				int var3 = 0;
				if (var2) {
					while (u.int_eb > var3) {
						if (~var0 == ~cc.longs_f[var3]) {
							--u.int_eb;
							++le.gb;
							db.F = true;
							int var4 = var3;
							if (var5 == 0 && ~u.int_eb >= ~var3) {
								ec.int_i = 1 + ce.y;
								ie.writeStream.writeOpcode(8, 190);
								ie.writeStream.writeLong(var0, 2);
								return;
							} else {
								do {
									ad.rds_k[var4] = ad.rds_k[1 + var4];
									ee.ints_k[var4] = ee.ints_k[1 + var4];
									cc.longs_f[var4] = cc.longs_f[1 + var4];
									je.ints_i[var4] = je.ints_i[var4 + 1];
									++var4;
								} while (~u.int_eb < ~var4);

								ec.int_i = 1 + ce.y;
								ie.writeStream.writeOpcode(8, 190);
								ie.writeStream.writeLong(var0, 2);
								return;
							}
						}

						++var3;
					}

				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "nd.J(" + var0 + ',' + var2 + ')');
		}
	}

	final gb c (byte var1) {
		try {
			nc.G = false;
			++vb;
			if (~this.Ib == 0) {
				return null;
			} else {
				gb var2 = (gb) bd.dd_uc.a((byte) -94, (long) this.Ib);
				if (var2 != null) {
					return var2;
				} else {
					var2 = od.a(-104, this.Ib, ra.archiveFile8, 0);
					int var3 = -112 / ((15 - var1) / 36);
					if (var2 == null) {
						nc.G = true;
						if (client.int_tb == 0) {
							return var2;
						}
					}

					bd.dd_uc.a(-102, var2, (long) this.Ib);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "nd.I(" + var1 + ')');
		}
	}

	final void a (int var1, byte var2, int var3) {
		try {
			++fc;
			int var5 = -31 / ((var2 - -8) / 49);
			int var4 = this.ob[var3];
			this.ob[var3] = this.ob[var1];
			this.ob[var1] = var4;
			var4 = this.zc[var3];
			this.zc[var3] = this.zc[var1];
			this.zc[var1] = var4;
		} catch (RuntimeException var6) {
			throw id.a(var6, "nd.F(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final ue a (o var1, boolean var2, int var3, e var4, byte var5) {
		try {
			int var6;
			int var7;
			label84:
			{
				nc.G = false;
				if (!var2) {
					var6 = this.int_od;
					var7 = this.int_kc;
					if (client.int_tb == 0) {
						break label84;
					}
				}

				var7 = this.int_fb;
				var6 = this.bc;
			}

			++int_ad;
			if (~var6 == -1) {
				return null;
			} else if (~var6 == -2 && ~var7 == 0) {
				return null;
			} else {
				ue var8 = (ue) ra.h.a((byte) -96, (long) ((var6 << 16) + var7));
				if (var5 != -17) {
					this.Sc = true;
				}

				if (var8 == null) {
					kc var9;
					if (~var6 == -2) {
						var9 = kc.a(ta.archiveFile7, var7, 0);
						if (var9 == null) {
							nc.G = true;
							return null;
						}

						var8 = var9.a(64, 768, -50, -10, -50);
					}

					if (var6 == 2) {
						var9 = hb.a(var7, (byte) 48).h(0);
						if (var9 == null) {
							nc.G = true;
							return null;
						}

						var8 = var9.a(64, 768, -50, -10, -50);
					}

					if (var6 == 3) {
						if (var1 == null) {
							return null;
						}

						var9 = var1.a((byte) 92);
						if (var9 == null) {
							nc.G = true;
							return null;
						}

						var8 = var9.a(64, 768, -50, -10, -50);
					}

					if (~var6 == -5) {
						hc var10 = u.a(var7, false);
						var9 = var10.a((byte) -112, 10);
						if (var9 == null) {
							nc.G = true;
							return null;
						}

						var8 = var9.a(var10.fb + 64, 768 - -var10.sb, -50, -10, -50);
					}

					ra.h.a(-70, var8, (long) ((var6 << 16) - -var7));
				}

				if (var4 != null) {
					var8 = var4.a(var8, 1, var3);
				}

				return var8;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "nd.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	private Object[] a (int unused, id class_id) {
		try {
			++mc;
			int size = class_id.readUnsignedByte((byte) 116);
			if (size == 0) {
				return null;
			} else {
				Object[] objects = new Object[size];
				int index = 0;
				if (size <= index) {
					this.jb = true;
					return objects;
				} else {
					do {
						int value = class_id.readUnsignedByte((byte) 116);
						if (value == 0) {
							objects[index] = class_id.readInt((byte) -115);
						} else if (value == 1) {
							objects[index] = class_id.readRSString(-1);
						}

						++index;
					} while (size > index);

					this.jb = true;
					return objects;
				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "nd.D(" + unused + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	final void a (byte unused, id class_id) {
		try {
			++vc;
			class_id.readUnsignedByte((byte) 116);
			this.gb = true;
			this.tb = class_id.readUnsignedByte((byte) 116);
			this.Sb = class_id.readUnsignedLEShort(255);
			this.Ub = this.kb = class_id.readShort(1331464976);
			this.Pc = this.Hb = class_id.readShort(1331464976);
			this.Bb = class_id.readUnsignedLEShort(255);
			if (this.tb != 9) {
				this.Nb = class_id.readUnsignedLEShort(255);
			} else {
				this.Nb = class_id.readShort(1331464976);
			}

			this.Uc = class_id.readUnsignedLEShort(255);
			if (this.Uc == '\uffff') {
				this.Uc = -1;
			} else {
				this.Uc += this.dc & -65536;
			}

			this.Jc = class_id.readUnsignedByte((byte) 116) == 1;
			if (this.tb == 0) {
				this.hd = class_id.readUnsignedLEShort(255);
				this.mb = class_id.readUnsignedLEShort(255);
			} else if (this.tb == 5) {
				this.ab = class_id.readInt((byte) -22);
				this.int_bd = class_id.readUnsignedLEShort(255);
				this.Db = ~class_id.readUnsignedByte((byte) 116) == -2;
				this.qc = class_id.readUnsignedByte((byte) 116);
				this.Tc = class_id.readUnsignedByte((byte) 116);
				this.rd = class_id.readInt((byte) -121);
				this.Pb = ~class_id.readUnsignedByte((byte) 116) == -2;
				this.yb = ~class_id.readUnsignedByte((byte) 116) == -2;
			} else if (this.tb == 6) {
				this.int_od = 1;
				this.int_kc = class_id.readUnsignedLEShort(255);
				if (this.int_kc == 65535) {
					this.int_kc = -1;
				}

				this.ed = class_id.readShort(1331464976);
				this.ac = class_id.readShort(1331464976);
				this.int_id = class_id.readUnsignedLEShort(255);
				this.int_sd = class_id.readUnsignedLEShort(255);
				this.int_sb = class_id.readUnsignedLEShort(255);
				this.int_db = class_id.readUnsignedLEShort(255);
				this.rb = class_id.readUnsignedLEShort(255);
				if (this.rb == '\uffff') {
					this.rb = -1;
				}

				this.Qb = class_id.readUnsignedByte((byte) 116) == 1;
			} else if (this.tb == 4) {
				this.Ib = class_id.readUnsignedLEShort(255);
				if (this.Ib == '\uffff') {
					this.Ib = -1;
				}

				this.rd_ub = class_id.readRSString(-1);
				this.bb = class_id.readUnsignedByte((byte) 116);
				this.Rc = class_id.readUnsignedByte((byte) 116);
				this.rc = class_id.readUnsignedByte((byte) 116);
				this.Sc = class_id.readUnsignedByte((byte) 116) == 1;
				this.Z = class_id.readInt((byte) -55);
			} else if (this.tb == 3) {
				this.Z = class_id.readInt((byte) -81);
				this.dd = ~class_id.readUnsignedByte((byte) 116) == -2;
				this.qc = class_id.readUnsignedByte((byte) 116);
			} else if (this.tb == 9) {
				this.sc = class_id.readUnsignedByte((byte) 116);
				this.Z = class_id.readInt((byte) -122);
			}

			this.jd = class_id.readMedInt((byte) -112);
			this.Xc = class_id.readRSString(-1);
			int i = class_id.readUnsignedByte((byte) 116);
			if (i > 0) {
				this.kd = new rd[i];
				int index = 0;
				if (i > index) {
					do {
						this.kd[index] = class_id.readRSString(-1);
						++index;
					} while (i > index);
				}
			}

			this.xc = class_id.readUnsignedByte((byte) 116);
			this.Ob = class_id.readUnsignedByte((byte) 116);
			this.Rb = ~class_id.readUnsignedByte((byte) 116) == -2;
			this.Gc = class_id.readRSString(-1);
			this.pb = this.a(11700, class_id);
			this.Cb = this.a(11700, class_id);
			this.Mc = this.a(11700, class_id);
			this.Kc = this.a(11700, class_id);
			this.hc = this.a(11700, class_id);
			this.objects_ld = this.a(11700, class_id);
			this.objects_cc = this.a(11700, class_id);
			this.Oc = this.a(11700, class_id);
			this.Eb = this.a(11700, class_id);
			this.objects_md = this.a(11700, class_id);
			this.vd = this.a(11700, class_id);
			this.Jb = this.a(11700, class_id);
			this.Wb = this.a(11700, class_id);
			this.Ec = this.a(11700, class_id);
			this.cd = this.a(11700, class_id);
			this.uc = this.a(11700, class_id);
			this.objects_eb = this.a(11700, class_id);
			this.Fc = this.a(11700, class_id);
			this.wc = this.a(11700, class_id);
		} catch (RuntimeException var6) {
			throw id.a(var6, "nd.N(" + unused + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	final he a (int var1, int var2) {
		try {
			nc.G = false;
			++nb;
			if (var2 <= var1 && this.Zc.length > var1) {
				int var3 = this.Zc[var1];
				if (~var3 == 0) {
					return null;
				} else {
					he var4 = (he) s.Ab.a((byte) -101, (long) var3);
					if (var4 != null) {
						return var4;
					} else {
						var4 = ib.a(ra.archiveFile8, 0, var3, -218);
						if (var4 != null) {
							s.Ab.a(var2 + -119, var4, (long) var3);
							if (client.int_tb == 0) {
								return var4;
							}
						}

						nc.G = true;
						return var4;
					}
				}
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "nd.A(" + var1 + ',' + var2 + ')');
		}
	}

	final he b (int var1, boolean var2) {
		try {
			int var3;
			label64:
			{
				++Fb;
				nc.G = false;
				if (!var2) {
					var3 = this.ab;
					if (client.int_tb == 0) {
						break label64;
					}
				}

				var3 = this.int_nc;
			}

			if (~var3 == 0) {
				return null;
			} else {
				long var4 = ((long) this.rd << 40) + ((!this.Pb ? 0L : 1L) << 38) + ((long) this.Tc << 36) + (long) var3 + ((!this.yb ? 0L : 1L) << 39);
				he var6 = (he) s.Ab.a((byte) -76, var4);
				if (var6 != null) {
					return var6;
				} else {
					var6 = ib.a(ra.archiveFile8, 0, var3, -218);
					if (var6 == null) {
						nc.G = true;
						return null;
					} else {
						if (this.Pb) {
							var6.d();
						}

						if (this.yb) {
							var6.g();
						}

						if (this.Tc > 0) {
							var6.f(this.Tc);
						}

						if (~this.Tc <= -2) {
							var6.h(1);
						}

						if (~this.Tc <= -3) {
							var6.h(16777215);
						}

						if (this.rd != 0) {
							var6.g(this.rd);
						}

						s.Ab.a(-75, var6, var4);
						return var6;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "nd.B(" + var1 + ',' + var2 + ')');
		}
	}

	final void a (rd var1, boolean var2, int var3) {
		int var6 = client.int_tb;

		try {
			if (this.kd == null || var3 >= this.kd.length) {
				rd[] var4 = new rd[1 + var3];
				if (this.kd != null) {
					int var5 = 0;
					if (var6 != 0 || var5 < this.kd.length) {
						do {
							var4[var5] = this.kd[var5];
							++var5;
						} while (var5 < this.kd.length);
					}
				}

				this.kd = var4;
			}

			if (var2) {
				a(-20, false);
			}

			++lb;
			this.kd[var3] = var1;
		} catch (RuntimeException var7) {
			throw id.a(var7, "nd.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a (id class_id, int unused) {
		try {
			++Kb;
			this.gb = false;
			this.tb = class_id.readUnsignedByte((byte) 116);
			this.jc = class_id.readUnsignedByte((byte) 116);
			this.Sb = class_id.readUnsignedLEShort(255);
			this.Ub = this.kb = class_id.readShort(1331464976);
			this.Pc = this.Hb = class_id.readShort(1331464976);
			this.Bb = class_id.readUnsignedLEShort(255);
			this.Nb = class_id.readUnsignedLEShort(255);
			this.qc = class_id.readUnsignedByte((byte) 116);
			this.Uc = class_id.readUnsignedLEShort(255);
			if (this.Uc == '\uffff') {
				this.Uc = -1;
			} else {
				this.Uc += this.dc & -65536;
			}

			this.pc = class_id.readUnsignedLEShort(255);
			if (this.pc == 65535) {
				this.pc = -1;
			}

			int size = class_id.readUnsignedByte((byte) 116);
			if (size > 0) {
				this.ints_ic = new int[size];
				this.Dc = new int[size];
				int index = 0;
				if (size > index) {
					do {
						this.Dc[index] = class_id.readUnsignedByte((byte) 116);
						this.ints_ic[index] = class_id.readUnsignedLEShort(sd.b(16959, 17088));
						++index;
					} while (size > index);
				}
			}

			int i = class_id.readUnsignedByte((byte) 116);
			if (i > 0) {
				this.Yb = new int[i][];
				int i1 = 0;
				if (i > i1) {
					do {
						int i2 = class_id.readUnsignedLEShort(255);
						this.Yb[i1] = new int[i2];
						int i3 = 0;
						if (i2 <= i3) {
							++i1;
						} else {
							do {
								this.Yb[i1][i3] = class_id.readUnsignedLEShort(255);
								if (this.Yb[i1][i3] == 65535) {
									this.Yb[i1][i3] = -1;
								}

								++i3;
							} while (i2 > i3);

							++i1;
						}
					} while (i > i1);
				}
			}

			if (this.tb == 0) {
				this.mb = class_id.readUnsignedLEShort(255);
				this.Jc = class_id.readUnsignedByte((byte) 116) == 1;
			} else if (this.tb == 1) {
				class_id.readUnsignedLEShort(255);
				class_id.readUnsignedByte((byte) 116);
			} else if (this.tb == 2) {
				this.zc = new int[this.Bb * this.Nb];
				this.ob = new int[this.Bb * this.Nb];
				int i1 = class_id.readUnsignedByte((byte) 116);
				if (i1 == 1) {
					this.jd |= 268435456;
				}

				int i2 = class_id.readUnsignedByte((byte) 116);
				if (i2 == 1) {
					this.jd |= 1073741824;
				}

				int i3 = class_id.readUnsignedByte((byte) 116);
				if (i3 == 1) {
					this.jd |= Integer.MIN_VALUE;
				}

				int i4 = class_id.readUnsignedByte((byte) 116);
				if (i4 == 1) {
					this.jd |= 536870912;
				}

				this.int_hb = class_id.readUnsignedByte((byte) 116);
				this.Vc = class_id.readUnsignedByte((byte) 116);
				this.Zc = new int[20];
				this.xb = new int[20];
				this.Hc = new int[20];

				for (int index = 0; index < 20; index++) {
					int i5 = class_id.readUnsignedByte((byte) 116);
					if (i5 == 1) {
						this.xb[index] = class_id.readShort(1331464976);
						this.Hc[index] = class_id.readShort(1331464976);
						this.Zc[index] = class_id.readInt((byte) -113);
					} else {
						this.Zc[index] = -1;
					}
				}

				this.Ac = new rd[5];

				for (int index = 0; index < 5; index++) {
					rd class_rd = class_id.readRSString(-1);
					if (class_rd.b(-29348) > 0) {
						this.Ac[index] = class_rd;
						this.jd |= 1 << 23 + index;
					}
				}
			} else if (this.tb == 3) {
				this.dd = ~class_id.readUnsignedByte((byte) 116) == -2;
			}

			if (this.tb == 4 || this.tb == 1) {
				this.Rc = class_id.readUnsignedByte((byte) 116);
				this.rc = class_id.readUnsignedByte((byte) 116);
				this.bb = class_id.readUnsignedByte((byte) 116);
				this.Ib = class_id.readUnsignedLEShort(255);
				if (this.Ib == '\uffff') {
					this.Ib = -1;
				}

				this.Sc = class_id.readUnsignedByte((byte) 116) == 1;
			}

			if (this.tb == 4) {
				this.rd_ub = class_id.readRSString(-1);
				this.Lc = class_id.readRSString(-1);
			}

			if (this.tb == 1 || this.tb == 3 || this.tb == 4) {
				this.Z = class_id.readInt((byte) -89);
			}

			if (this.tb == 3 || this.tb == 4) {
				this.Wc = class_id.readInt((byte) -41);
				this.Vb = class_id.readInt((byte) -84);
				this.Cc = class_id.readInt((byte) -51);
			}

			if (this.tb == 5) {
				this.ab = class_id.readInt((byte) -105);
				this.int_nc = class_id.readInt((byte) -82);
			}

			if (this.tb == 6) {
				this.int_od = 1;
				this.int_kc = class_id.readUnsignedLEShort(255);
				this.bc = 1;
				if (this.int_kc == '\uffff') {
					this.int_kc = -1;
				}

				this.int_fb = class_id.readUnsignedLEShort(255);
				if (this.int_fb == 65535) {
					this.int_fb = -1;
				}

				this.rb = class_id.readUnsignedLEShort(255);
				if (this.rb == '\uffff') {
					this.rb = -1;
				}

				this.Tb = class_id.readUnsignedLEShort(255);
				if (this.Tb == '\uffff') {
					this.Tb = -1;
				}

				this.int_db = class_id.readUnsignedLEShort(255);
				this.int_id = class_id.readUnsignedLEShort(255);
				this.int_sd = class_id.readUnsignedLEShort(255);
			}

			if (this.tb == 7) {
				this.zc = new int[this.Bb * this.Nb];
				this.ob = new int[this.Nb * this.Bb];
				this.Rc = class_id.readUnsignedByte((byte) 116);
				this.Ib = class_id.readUnsignedLEShort(255);
				if (this.Ib == '\uffff') {
					this.Ib = -1;
				}

				this.Sc = class_id.readUnsignedByte((byte) 116) == 1;
				this.Z = class_id.readInt((byte) -45);
				this.int_hb = class_id.readShort(1331464976);
				this.Vc = class_id.readShort(1331464976);
				int i1 = class_id.readUnsignedByte((byte) 116);
				if (i1 == 1) {
					this.jd |= 1073741824;
				}

				this.Ac = new rd[5];

				for (int index = 0; index < 5; index++) {
					rd class_rd = class_id.readRSString(-1);
					if (class_rd.b(-29348) > 0) {
						this.Ac[index] = class_rd;
						this.jd |= 1 << 23 + index;
					}
				}
			}

			if (this.tb == 8) {
				this.rd_ub = class_id.readRSString(-1);
			}

			if (this.jc == 2 || this.tb == 2) {
				this.Gc = class_id.readRSString(-1);
				this.Gb = class_id.readRSString(-1);
				int i1 = 63 & class_id.readUnsignedLEShort(255);
				this.jd |= i1 << 11;
			}

			if (this.jc == 1 || this.jc == 4 || this.jc == 5 || this.jc == 6) {
				this.nd = class_id.readRSString(-1);
				if (this.nd.b(-29348) == 0) {
					if (this.jc == 1) {
						this.nd = fb.ok2;
					}

					if (this.jc == 4) {
						this.nd = ke.select2;
					}

					if (this.jc == 5) {
						this.nd = ke.select2;
					}

					if (this.jc == 6) {
						this.nd = se.continueText2;
					}
				}
			}

			if (this.jc == 1 || this.jc == 4 || this.jc == 5) {
				this.jd |= 4194304;
			}

			if (this.jc == 6) {
				this.jd |= 1;
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "nd.G(" + (class_id != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
}
