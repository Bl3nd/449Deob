final class j extends jb {
	static dd Z = new dd(64);
	static int eb;
	static int fb;
	static int kb;
	static int lb = 0;
	static int mb;
	static int ob = -16 + (int) (Math.random() * 33.0D);
	static int pb;
	static int qb;
	static int rb;
	static rd rd_sb;
	static int int_tb;
	static int vb;
	static int int_wb;
	static rd yb;
	static int zb;
	static rd accountLockedAsWeSuspectItHasBeenStolen2;
	static int Db;
	static boolean Eb;
	private static rd ub = md.a((String) "Your profile will be transferred in:", (byte) 116);
	private static rd Bb;
	private static rd accountLockedAsWeSuspectItHasBeenStolen;

	static {
		rd_sb = ub;
		Bb = md.a("Moderator option: Mute player for 48 hours: <ON>", (byte) 121);
		zb = 0;
		Eb = false;
		yb = Bb;
		accountLockedAsWeSuspectItHasBeenStolen = md.a("Account locked as we suspect it has been stolen)3", (byte) 123);
		accountLockedAsWeSuspectItHasBeenStolen2 = accountLockedAsWeSuspectItHasBeenStolen;
	}

	int nb;
	int xb = -1;
	private int int_ab;
	private int int_bb = 128;
	private int cb = 128;
	private int int_db = 0;
	private int gb = 0;
	private short[] hb = new short[6];
	private short[] shorts_ib = new short[6];
	private int jb = 0;

	public static void c (boolean var0) {
		try {
			accountLockedAsWeSuspectItHasBeenStolen = null;
			Z = null;
			if (!var0) {
				c((byte) 104);
			}

			Bb = null;
			rd_sb = null;
			yb = null;
			accountLockedAsWeSuspectItHasBeenStolen2 = null;
			ub = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "j.E(" + var0 + ')');
		}
	}

	static int f (int unused) {
		try {
			++qb;
			return 5;
		} catch (RuntimeException var2) {
			throw id.a(var2, "j.A(" + unused + ')');
		}
	}

	static void g (int unused) {
		try {
			n.ab.c(-112);
			md.c.c(-127);
			++vb;
		} catch (RuntimeException var2) {
			throw id.a(var2, "j.B(" + unused + ')');
		}
	}

	static rd a (int var0, int var1) {
		int var4 = client.int_tb;

		try {
			++Db;
			rd var2 = bf.a(var0, -31766);
			int var3 = -3 + var2.b(-29348);
			if (var1 != 3056) {
				return null;
			} else {
				while (var3 > 0) {
					var2 = pc.a((byte) 127, new rd[]{var2.b(var3, -23745, 0), tb.ub, var2.a(false, var3)});
					var3 -= 3;
				}

				if (~var2.b(-29348) < -9) {
					var2 = pc.a((byte) 125, new rd[]{
							me.z,
							var2.b(-8 + var2.b(var1 ^ -31060), var1 + -26801, 0),
							bb._million2,
							e.rd_tb,
							var2,
							md.o
					});
					if (var4 == 0) {
						return pc.a((byte) 126, new rd[]{wa.lb, var2});
					}
				}

				if (var2.b(-29348) > 4) {
					var2 = pc.a((byte) 127, new rd[]{
							ra.cyanText,
							var2.b(-4 + var2.b(-29348), -23745, 0),
							f.Tc,
							e.rd_tb,
							var2,
							md.o
					});
				}

				return pc.a((byte) 126, new rd[]{wa.lb, var2});
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "j.K(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (int fileRequest, ke class_ke, d class_d, boolean unused) {
		try {
			++rb;
			tc class_tc = new tc();
			class_tc.D = 1;
			class_tc.B = class_ke;
			class_tc.P = class_d;
			class_tc.script = (long) fileRequest;
			synchronized (sb.md_e) {
				sb.md_e.a(class_tc, (byte) 120);
			}

			ad.a((byte) 120);
		} catch (RuntimeException var9) {
			throw id.a(var9, "j.C(" + fileRequest + ',' + (class_ke != null ? "{...}" : "null") + ',' + (class_d != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void c (byte unused) {
		try {
			++int_wb;
			if (bf.boolean_h) {
				ka.Zb = null;
				db.T = null;
				le.oa_pb = null;
				ib.oa_r = null;
				ba.oa_h = null;
				ha.ints_ob = null;
				le.eb = null;
				hf.yb = null;
				e.jd_fb = null;
				sb.jd_q = null;
				l.o = null;
				fc.oa_v = null;
				pe.g = null;
				bf.boolean_h = false;
				nc.g = null;
				bb.ints_x = null;
				client.jd_kb = null;
				ra.f = null;
				pc.x = null;
				bc.q = null;
				ab.oa_q = null;
				ib.jd_n = null;
				h.oa_l = null;
				le.nb = null;
				id.fb = null;
				rd.ints_f = null;
				n.hb = null;
				ke.zb = null;
				wb.kb = null;
				se.k = null;
				dc.oas_b = null;
				i.H = null;
				ce.jd_f = null;
				nd.gd = null;
				se.q = null;
				ud.R = null;
				dc.A = null;
				ie.p = null;
				ff.ints_v = null;
				ha.jd_mb = null;
				qe.D = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "j.J(" + unused + ')');
		}
	}

	static int a (int i, int unused, int i1, int i2) {
		try {
			++kb;
			if (i1 > 179) {
				i /= 2;
			}

			if (i1 > 192) {
				i /= 2;
			}

			if (i1 > 217) {
				i /= 2;
			}

			if (~i1 < -244) {
				i /= 2;
			}

			return (i2 / 4 << 10) + (i / 32 << 7) + (i1 / 2);
		} catch (RuntimeException var6) {
			throw id.a(var6, "j.H(" + i + ',' + unused + ',' + i1 + ',' + i2 + ')');
		}
	}

	static void h (int var0) {
		try {
			if (var0 != -826) {
				Bb = null;
			}

			client.int_ob = 0;
			++pb;
			int var1 = (af.td_p.x_ >> 7) - -kd.int_w;
			int var2 = jc.X + (af.td_p.y_ >> 7);
			if (~var1 <= -3054 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
				client.int_ob = 1;
			}

			if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
				client.int_ob = 1;
			}

			if (~client.int_ob == -2 && ~var1 <= -3140 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
				client.int_ob = 0;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "j.F(" + var0 + ')');
		}
	}

	final void a (int var1, id var2) {
		int var4 = client.int_tb;

		try {
			if (var1 != 2530) {
				zb = -122;
			}

			do {
				int var3 = var2.readUnsignedByte((byte) 116);
				if (~var3 == -1) {
					break;
				}

				this.a(-3, var3, var2);
			} while (var4 == 0);

			++eb;
		} catch (RuntimeException var5) {
			throw id.a(var5, "j.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	private void a (int var1, int var2, id var3) {
		int var5 = client.int_tb;

		try {
			label72:
			{
				++mb;
				if (~var2 != -2) {
					if (~var2 != -3) {
						if (var2 == 4) {
							this.int_bb = var3.readUnsignedLEShort(255);
							if (var5 == 0) {
								break label72;
							}
						}

						if (var2 == 5) {
							this.cb = var3.readUnsignedLEShort(255);
							if (var5 == 0) {
								break label72;
							}
						}

						if (var2 != 6) {
							if (var2 == 7) {
								this.int_db = var3.readUnsignedByte((byte) 116);
								if (var5 == 0) {
									break label72;
								}
							}

							if (var2 != 8) {
								if (~var2 > -41 || ~var2 <= -51) {
									if (var2 < 50 || ~var2 <= -61) {
										break label72;
									}

									this.hb[-50 + var2] = (short) var3.readUnsignedLEShort(255);
									if (var5 == 0) {
										break label72;
									}
								}

								this.shorts_ib[var2 + -40] = (short) var3.readUnsignedLEShort(var1 + 258);
								if (var5 == 0) {
									break label72;
								}
							}

							this.gb = var3.readUnsignedByte((byte) 116);
							if (var5 == 0) {
								break label72;
							}
						}

						this.jb = var3.readUnsignedLEShort(255);
						if (var5 == 0) {
							break label72;
						}
					}

					this.xb = var3.readUnsignedLEShort(var1 ^ -254);
					if (var5 == 0) {
						break label72;
					}
				}

				this.int_ab = var3.readUnsignedLEShort(255);
			}

			if (var1 != -3) {
				zb = 74;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "j.I(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final ue b (int var1, int var2) {
		int var6 = client.int_tb;

		try {
			++int_tb;
			ue var3 = (ue) va.dd_d.a((byte) -98, (long) this.nb);
			if (var1 != -1565796086) {
				this.shorts_ib = null;
			}

			if (var3 == null) {
				kc var4 = kc.a(w.archiveFile7, this.int_ab, 0);
				if (var4 == null) {
					return null;
				}

				int var5 = 0;
				if (var6 != 0 || var5 < 6) {
					do {
						if (~this.shorts_ib[0] != -1) {
							var4.a(this.shorts_ib[var5], this.hb[var5]);
						}

						++var5;
					} while (var5 < 6);
				}

				var3 = var4.a(64 - -this.int_db, this.gb + 850, -30, -50, -30);
				va.dd_d.a(-84, var3, (long) this.nb);
			}

			ue var8;
			label79:
			{
				if (this.xb == -1 || ~var2 == 0) {
					var8 = var3.d(true);
					if (var6 == 0) {
						break label79;
					}
				}

				var8 = bd.a(this.xb, false).a(-108, var2, var3);
			}

			if (this.int_bb != 128 || ~this.cb != -129) {
				var8.a(this.int_bb, this.cb, this.int_bb);
			}

			if (this.jb != 0) {
				if (this.jb == 90) {
					var8.b();
				}

				if (this.jb == 180) {
					var8.b();
					var8.b();
				}

				if (~this.jb == -271) {
					var8.b();
					var8.b();
					var8.b();
				}
			}

			return var8;
		} catch (RuntimeException var7) {
			throw id.a(var7, "j.G(" + var1 + ',' + var2 + ')');
		}
	}
}
