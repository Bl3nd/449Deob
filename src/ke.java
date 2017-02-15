final class ke extends pb {
	static int db;
	static int int_eb;
	static int fb;
	static int[] hb;
	static int int_ib;
	static int lb;
	static int int_mb;
	static rd pleaseSubscribeOrUseADifferentWorld2;
	static volatile int qb = 0;
	static int rb;
	static int sb;
	static boolean tb;
	static int vb;
	static jd wb;
	static pb archiveFile2;
	static oa zb;
	static int Ab;
	static rd Bb = md.a((String) "Lade Wordpack )2 ", (byte) 125);
	static int Cb;
	static rd Db;
	static int Fb;
	static rd cross = md.a((String) "cross", (byte) 127);
	static rd select2;
	static int Jb;
	static rd Kb;
	static int Lb;
	static int Nb;
	static rd Ob;
	static int Pb;
	static int[] Qb;
	static int Rb;
	private static rd select = md.a((String) "Select", (byte) 120);
	private static rd pleaseSubscribeOrUseADifferentWorld;

	static {
		select2 = select;
		Db = md.a("Regelversto-8 melden", (byte) 114);
		Ob = md.a(",Zffentlicher Chat", (byte) 115);
		int_mb = 0;
		Jb = -1;
		Kb = md.a("Angreifen", (byte) 124);
		Pb = 0;
		pleaseSubscribeOrUseADifferentWorld = md.a("Please subscribe)1 or use a different world)3", (byte) 121);
		hb = new int[25];
		pleaseSubscribeOrUseADifferentWorld2 = pleaseSubscribeOrUseADifferentWorld;
	}

	private volatile boolean[] gb;
	private d jb;
	private int crcChecksum;
	private volatile boolean nb = false;
	private d pb;
	private int xb = -1;
	private boolean Eb = false;
	private int Hb;

	ke (d class_d, d class_d2, int archiveId, boolean flag, boolean flag2, boolean flag3) {
		super(flag, flag2);

		try {
			this.pb = class_d2;
			this.Hb = archiveId;
			this.jb = class_d;
			this.Eb = flag3;
			ld.a(9, this, this.Hb);
		} catch (RuntimeException var8) {
			throw id.a(var8, "ke.<init>(" + (class_d != null ? "{...}" : "null") + ',' + (class_d2 != null ? "{...}" : "null") + ',' + archiveId + ',' + flag + ',' + flag2 + ',' + flag3 + ')');
		}
	}

	static void d (byte unused) {
		int dummy = client.int_tb;
		try {
			++Lb;
			int i = 0;
			if (me.lb <= i) {
				if (mb.b > 0) {
					mb.b -= 20;
					if (mb.b < 0) {
						mb.b = 0;
					}

					if (mb.b == 0 && fc.int_u != 0 && b.dd != -1) {
						ld.a(0, b.dd, false, vc.cacheFile6, 0, fc.int_u, (byte) 124);
					}
				}
			} else {
				do {
					label130:
					{
						--ba.ints_r[i];
						if (ba.ints_r[i] < -8) {
							--me.lb;
							int var2 = i;
							if (~me.lb < ~i) {
								do {
									kd.B[var2] = kd.B[var2 + 1];
									eb.ias_c[var2] = eb.ias_c[1 + var2];
									wc.o[var2] = wc.o[1 + var2];
									ba.ints_r[var2] = ba.ints_r[1 + var2];
									gd.ints_n[var2] = gd.ints_n[var2 - -1];
									++var2;
								} while (~me.lb < ~var2);
							}

							--i;
							if (dummy == 0) {
								break label130;
							}
						}

						ia var12 = eb.ias_c[i];
						if (var12 == null) {
							var12 = ia.a(bd.cacheFile4, kd.B[i], 0);
							if (var12 == null && dummy == 0) {
								break label130;
							}

							ba.ints_r[i] += var12.c();
							eb.ias_c[i] = var12;
						}

						if (~ba.ints_r[i] > -1) {
							label79:
							{
								int var3;
								label133:
								{
									if (~gd.ints_n[i] == -1) {
										var3 = ib.o;
										if (dummy == 0) {
											break label133;
										}
									}

									int var4 = 128 * (gd.ints_n[i] & 255);
									int var5 = (16731272 & gd.ints_n[i]) >> 16;
									int var6 = 64 + var5 * 128 - af.td_p.x_;
									int var7 = 255 & gd.ints_n[i] >> 8;
									if (var6 < 0) {
										var6 = -var6;
									}

									int var8 = -af.td_p.y_ + 64 + 128 * var7;
									if (var8 < 0) {
										var8 = -var8;
									}

									int var9 = var6 + (var8 - 128);
									if (var9 > var4) {
										ba.ints_r[i] = -100;
										if (dummy == 0) {
											break label79;
										}
									}

									if (~var9 > -1) {
										var9 = 0;
									}

									var3 = (var4 + -var9) * md.b / var4;
								}

								na var13 = var12.a().a(m.h_m);
								ac var14 = ac.a(var13, 100, var3);
								var14.f(wc.o[i] + -1);
								e.Nb.b(var14);
								ba.ints_r[i] = -100;
							}
						}
					}

					++i;
				} while (~me.lb < ~i);

				if (mb.b > 0) {
					mb.b -= 20;
					if (~mb.b > -1) {
						mb.b = 0;
					}

					if (mb.b == 0 && fc.int_u != 0 && b.dd != -1) {
						ld.a(0, b.dd, false, vc.cacheFile6, 0, fc.int_u, (byte) 124);
					}
				}

			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ke.B(" + unused + ')');
		}
	}

	static void a (int var0, int var1, td var2, int var3) {
		try {
			label53:
			{
				if (~var1 != ~var2.zc || var1 == -1) {
					if (~var1 != 0 && ~var2.zc != 0 && ~bd.a(var1, false).Mb > ~bd.a(var2.zc, false).Mb) {
						break label53;
					}

					var2.Gb = var0;
					var2.int_rc = var2.Dc;
					var2.int_vb = 0;
					var2.Ec = 0;
					var2.int_tb = 0;
					var2.zc = var1;
					if (client.int_tb == 0) {
						break label53;
					}
				}

				int var4 = bd.a(var1, false).Db;
				if (~var4 == -2) {
					var2.int_vb = 0;
					var2.Gb = var0;
					var2.int_tb = 0;
					var2.Ec = 0;
				}

				if (var4 == 2) {
					var2.int_vb = 0;
				}
			}

			if (var3 != 2) {
				d((byte) -45);
			}

			++Ab;
		} catch (RuntimeException var5) {
			throw id.a(var5, "ke.D(" + var0 + ',' + var1 + ',' + "{...}" + ',' + var3 + ')');
		}
	}

	public static void e (int var0) {
		try {
			pleaseSubscribeOrUseADifferentWorld = null;
			Ob = null;
			pleaseSubscribeOrUseADifferentWorld2 = null;
			select = null;
			Qb = null;
			select2 = null;
			zb = null;
			Kb = null;
			cross = null;
			wb = null;
			if (var0 == 17579) {
				Bb = null;
				archiveFile2 = null;
				hb = null;
				Db = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ke.J(" + var0 + ')');
		}
	}

	static boolean f (int var0, int var1) {
		try {
			if (var0 <= 38) {
				pleaseSubscribeOrUseADifferentWorld = null;
			}

			++Cb;
			return ~(1 & var1 >> 20) != -1;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ke.I(" + var0 + ',' + var1 + ')');
		}
	}

	final int c (int unused) {
		try {
			++Nb;
			if (this.nb) {
				return 100;
			} else if (super.s != null) {
				return 99;
			} else {
				int i = ee.a(255, 32, this.Hb);
				if (i >= 100) {
					i = 99;
				}

				return i;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ke.A(" + unused + ')');
		}
	}

	private int d (int unused, int fileId) {
		try {
			++Rb;
			return super.s[fileId] != null ? 100 : this.gb[fileId] ? 100 : ee.a(this.Hb, 68, fileId);
		} catch (RuntimeException var4) {
			throw id.a(var4, "ke.K(" + unused + ',' + fileId + ')');
		}
	}

	final void e (int unused, int crcChecksum) {
		try {
			this.crcChecksum = crcChecksum;
			if (this.pb != null) {
				kb.a(this.pb, this.Hb, 0, this);
			} else {
				u.a(this, this.Hb, this.crcChecksum, (byte) -16, 255, (byte) 0, true);
			}

			++Fb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "ke.G(" + unused + ',' + crcChecksum + ')');
		}
	}

	final void b (int fileRequestId, int unused) {
		try {
			++int_ib;
			if (this.jb != null && this.gb != null && this.gb[fileRequestId]) {
				kb.a(this.jb, fileRequestId, 0, this);
			} else {
				u.a(this, fileRequestId, super.y[fileRequestId], (byte) -16, this.Hb, (byte) 2, true);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ke.L(" + fileRequestId + ',' + unused + ')');
		}
	}

	private void d (int unused) {
		try {
			++db;
			this.gb = new boolean[super.s.length];
			int i = 0;
			while (~this.gb.length < ~i) {
				this.gb[i] = false;
				++i;
			}

			if (this.jb == null) {
				this.nb = true;
			} else {
				this.xb = -1;
				int fileRequest = 0;
				if (fileRequest >= this.gb.length) {
					this.nb = true;
				} else {
					do {
						if (super.I[fileRequest] > 0) {
							j.a(fileRequest, this, this.jb, true);
							this.xb = fileRequest;
						}

						++fileRequest;
					} while (fileRequest < this.gb.length);

					if (this.xb == -1) {
						this.nb = true;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ke.M(" + unused + ')');
		}
	}

	final void a (int fileRequest, int unused, byte[] bytes, d class_d, boolean flag) {
		try {
			++vb;
			if (this.pb == class_d) {
				if (this.nb) {
					throw new RuntimeException();
				} else if (bytes == null) {
					u.a(this, this.Hb, this.crcChecksum, (byte) -16, 255, (byte) 0, true);
				} else {
					qe.crc32.reset();
					qe.crc32.update(bytes, 0, bytes.length);
					int crcValue = (int) qe.crc32.getValue();
					System.out.println("CRCUpdateValue: " + crcValue + " gameValue: " + this.crcChecksum);
					if (crcValue != this.crcChecksum) {
						u.a(this, this.Hb, this.crcChecksum, (byte) -16, 255, (byte) 0, true);
					} else {
						this.a(bytes, (byte) -125);
						this.d(0);
					}
				}
			} else {
				if (!flag && this.xb == fileRequest) {
					this.nb = true;
				}

				if (bytes != null && bytes.length > 2) {
					qe.crc32.reset();
					qe.crc32.update(bytes, 0, bytes.length + -2);
					int crcValue = (int) qe.crc32.getValue();
					int i1 = ((bytes[-2 + bytes.length] & 255) << 8) + (255 & bytes[bytes.length - 1]);
					if (crcValue == super.y[fileRequest] && i1 == super.bb[fileRequest]) {
						this.gb[fileRequest] = true;
						if (flag) {
							super.s[fileRequest] = wa.a(122, bytes, false);
						}
					} else {
						this.gb[fileRequest] = false;
						if (this.Eb || flag) {
							u.a(this, fileRequest, super.y[fileRequest], (byte) -16, this.Hb, (byte) 2, flag);
						}

					}
				} else {
					this.gb[fileRequest] = false;
					if (this.Eb || flag) {
						u.a(this, fileRequest, super.y[fileRequest], (byte) -16, this.Hb, (byte) 2, flag);
					}

				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "ke.E(" + fileRequest + ',' + unused + ',' + (bytes != null ? "{...}" : "null") + ',' + (class_d != null ? "{...}" : "null") + ',' + flag + ')');
		}
	}

	final void a (boolean var1, int var2, byte var3, byte[] var4, boolean var5) {
		try {
			++lb;
			if (var3 != 0) {
				this.d(-42);
			}

			if (var5) {
				if (this.nb) {
					throw new RuntimeException();
				} else {
					if (this.pb != null) {
						t.a(var4, this.pb, this.Hb, true);
					}

					this.a(var4, (byte) 118);
					this.d(0);
				}
			} else {
				var4[-2 + var4.length] = (byte) (super.bb[var2] >> 8);
				var4[var4.length - 1] = (byte) super.bb[var2];
				if (this.jb != null) {
					t.a(var4, this.jb, var2, true);
					this.gb[var2] = true;
				}

				if (var1) {
					super.s[var2] = wa.a(var3 + 114, var4, false);
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "ke.F(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	final void a (int var1, byte var2) {
		try {
			sa.a(125, this.Hb, var1);
			if (var2 > 1) {
				++int_eb;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ke.H(" + var1 + ',' + var2 + ')');
		}
	}

	final int a (boolean unused) {
		try {
			++sb;
			int i = 0;
			int i1 = 0;
			int fileId = 0;
			for ( ; super.s.length > fileId ; ++fileId) {
				if (super.I[fileId] > 0) {
					i += 100;
					i1 += this.d(30637, fileId);
				}
			}

			if (i == 0) {
				return 100;
			} else {
				return 100 * i1 / i;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "ke.C(" + unused + ')');
		}
	}
}
