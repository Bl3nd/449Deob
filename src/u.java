final class u extends jb {
	static int Z = -1;
	static int bb;
	static rd cb = md.a((String) " Sekunde(Xn(Y -Ubertragen)3", (byte) 126);
	static int int_db = -1;
	static int int_eb = 0;
	static rd tooManyIncorrectLoginsFromYourAddress2;
	static rd rd_hb = md.a((String) "welle:", (byte) 124);
	static rd rd_jb;
	static byte[][][] bytes_kb;
	static int lb;
	static rd loadedInterfaces2;
	static int nb;
	static rd qb = md.a((String) "@gr1@", (byte) 127);
	static int int_rb;
	static rd sb = md.a((String) "Welt", (byte) 116);
	static rd whiteText = md.a((String) "@whi@", (byte) 116);
	static ke cacheFile10;
	static int vb;
	static int xb;
	private static rd gb = md.a((String) "Members object", (byte) 118);
	private static rd tooManyIncorrectLoginsFromYourAddress = md.a((String) "Too many incorrect logins from your address)3", (byte) 116);
	private static rd loadedInterfaces;

	static {
		rd_jb = gb;
		tooManyIncorrectLoginsFromYourAddress2 = tooManyIncorrectLoginsFromYourAddress;
		loadedInterfaces = md.a("Loaded interfaces", (byte) 126);
		loadedInterfaces2 = loadedInterfaces;
	}

	ke ab;
	byte compressionType;
	int crcChecksum;

	public static void c (byte var0) {
		try {
			loadedInterfaces = null;
			tooManyIncorrectLoginsFromYourAddress2 = null;
			qb = null;
			bytes_kb = null;
			whiteText = null;
			cb = null;
			sb = null;
			tooManyIncorrectLoginsFromYourAddress = null;
			loadedInterfaces2 = null;
			rd_hb = null;
			if (var0 == -110) {
				cacheFile10 = null;
				gb = null;
				rd_jb = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "u.F(" + var0 + ')');
		}
	}

	static hc a (int fileRequest, boolean var1) {
		try {
			++lb;
			if (var1) {
				vb = -94;
			}

			hc var2 = (hc) ee.dd_c.a((byte) -95, (long) fileRequest);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = sd.archiveFile2.a(10, fileRequest, (byte) 66);
				var2 = new hc();
				var2.jb = fileRequest;
				if (var3 != null) {
					var2.a(-1, new id(var3));
				}

				var2.c((byte) 13);
				if (var2.rb != -1) {
					var2.a(-53, a(var2.rb, false), a(var2.Eb, var1));
				}

				if (!nc.isMembers && var2.dc) {
					var2.Gb = null;
					var2.Bb = null;
					var2.Rb = rd_jb;
					var2.Nb = 0;
				}

				ee.dd_c.a(-125, var2, (long) fileRequest);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "u.E(" + fileRequest + ',' + var1 + ')');
		}
	}

	static void a (ke class_ke, int fileId, int crcChecksum, byte unused, int archiveCacheId, byte compressionType, boolean flag) {
		try {
			++bb;
			long fileRequest = (long) ((archiveCacheId << 16) + fileId);
			//System.out.println("ArchiveCacheID: " + archiveCacheId + " fileID: " + fileId + " = fileRequest: " + fileRequest);
			u class_u = (u) ud.N.a(-1, fileRequest);//N = [4096]
			if (class_u == null) {
				class_u = (u) rd.F.a(-1, fileRequest);//F = [32]
				if (class_u == null) {
					class_u = (u) kb.c.a(-1, fileRequest);//c = [4096]
					if (class_u != null) {
						if (flag) {
							class_u.a((byte) -123);
							ud.N.a((byte) -7, fileRequest, class_u);
							++we.g;
							--o.int_r;
						}
					} else {
						if (!flag) {
							class_u = (u) qe.B.a(-1, fileRequest);//B = [4096]
							if (class_u != null) {
								return;
							}
						}

						class_u = new u();
						class_u.compressionType = compressionType;
						class_u.crcChecksum = crcChecksum;
						class_u.ab = class_ke;
						if (!flag) {
							jb.J.a(class_u, (byte) -128);
							kb.c.a((byte) -7, fileRequest, class_u);
							++o.int_r;
						} else {
							ud.N.a((byte) -7, fileRequest, class_u);
							++we.g;
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "u.A(" + (class_ke != null ? "{...}" : "null") + ',' + fileId + ',' + crcChecksum + ',' + unused + ',' + archiveCacheId + ',' + compressionType + ',' + flag + ')');
		}
	}

	static void a (byte unused, f class_f) {
		try {
			class_f.int_lc = class_f.yb;
			++nb;
			if (class_f.Dc == 0) {
				class_f.Jb = 0;
			} else {
				if (class_f.zc != -1 && class_f.Gb == 0) {
					e class_e = bd.a(class_f.zc, false);
					if (class_f.int_rc > 0 && class_e.Ob == 0) {
						++class_f.Jb;
						return;
					}

					if (class_f.int_rc <= 0 && class_e.int_jb == 0) {
						++class_f.Jb;
						return;
					}
				}

				int i = 64 * class_f.int_kc + 128 * class_f.xc[class_f.Dc + -1];
				int i1 = class_f.y_;
				int i2 = class_f.x_;
				int i3 = 128 * class_f.Hc[class_f.Dc - 1] - -(class_f.int_kc * 64);
				if (i + -i2 <= 256 && i + -i2 >= -256 && -i1 + i3 <= 256 && -i1 + i3 >= -256) {
					if (i <= i2) {
						if (i >= i2) {
							if (i1 >= i3) {
								if (i3 < i1) {
									class_f.int_ac = 0;
								}
							} else {
								class_f.int_ac = 1024;
							}
						} else {
							if (i1 >= i3) {
								if (i3 < i1) {
									class_f.int_ac = 256;
								} else {
									class_f.int_ac = 512;
								}
							} else {
								class_f.int_ac = 768;
							}
						}
					} else {
						if (i3 <= i1) {
							if (i1 > i3) {
								class_f.int_ac = 1792;
							} else {
								class_f.int_ac = 1536;
							}
						} else {
							class_f.int_ac = 1280;
						}
					}

					int i4 = class_f.int_ac - class_f.Bb & 2047;
					if (i4 > 1024) {
						i4 -= 2048;
					}

					int i6 = 4;
					boolean flag = true;
					int i5 = class_f.int_oc;
					if (i4 >= 254 && i4 <= 256) {
						i5 = class_f.xb;
					} else if (i4 < 256 || i4 >= 768) {
						if (i4 >= -768 && i4 <= -256) {
							i5 = class_f.int_fc;
						}
					} else {
						i5 = class_f.Rb;
					}

					if (i5 == -1) {
						i5 = class_f.xb;
					}

					class_f.int_lc = i5;
					if (class_f instanceof b) {
						flag = ((b) class_f).tb_md.jb;
					}

					if (flag) {
						if (class_f.int_ac != class_f.Bb && class_f.Kb == -1 && class_f.Xb != 0) {
							i6 = 2;
						}

						if (class_f.Dc > 2) {
							i6 = 6;
						}

						if (class_f.Dc > 3) {
							i6 = 8;
						}

						if (class_f.Jb > 0 && class_f.Dc > 1) {
							--class_f.Jb;
							i6 = 8;
						}
					} else {
						if (class_f.Dc > 1) {
							i6 = 6;
						}

						if (class_f.Dc > 2) {
							i6 = 8;
						}

						if (class_f.Jb > 0 && class_f.Dc > 1) {
							i6 = 8;
							--class_f.Jb;
						}
					}

					if (class_f.Ic[class_f.Dc - 1]) {
						i6 <<= 1;
					}

					if (i2 < i) {
						class_f.x_ += i6;
						if (class_f.x_ > i) {
							class_f.x_ = i;
						}
					} else if (i2 > i) {
						class_f.x_ -= i6;
						if (class_f.x_ < i) {
							class_f.x_ = i;
						}
					}

					if (i3 > i1) {
						class_f.y_ += i6;
						if (class_f.y_ > i3) {
							class_f.y_ = i3;
						}
					} else if (i3 < i1) {
						class_f.y_ -= i6;
						if (class_f.y_ < i3) {
							class_f.y_ = i3;
						}
					}

					if (i == class_f.x_ && i3 == class_f.y_) {
						--class_f.Dc;
						if (class_f.int_rc > 0) {
							--class_f.int_rc;
						}
					}

					if (i6 >= 8 && class_f.xb == class_f.int_lc && class_f.Cc != -1) {
						class_f.int_lc = class_f.Cc;
					}
				} else {
					class_f.y_ = i3;
					class_f.x_ = i;
				}
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "u.B(" + unused + ',' + "{...}" + ')');
		}
	}

	static void f (int var0) {
		int var2 = client.int_tb;

		try {
			++int_rb;
			te var1 = (te) ib.md_a.c((byte) 27);
			if (var0 != -1) {
				rd_hb = null;
				if (var2 == 0 && var1 == null) {
					return;
				}
			} else if (var1 == null) {
				return;
			}

			do {
				label54:
				{
					if (~var1.Bb != ~ce.plane || var1.Db) {
						var1.d(-26669);
						if (var2 == 0) {
							break label54;
						}
					}

					if (~ce.y <= ~var1.wb) {
						label25:
						{
							var1.a((byte) 108, va.g);
							if (var1.Db) {
								var1.d(var0 ^ 26668);
								if (var2 == 0) {
									break label25;
								}
							}

							pc.o.a(var1.Bb, var1.Fb, var1.vb, var1.sb, 60, var1, 0, -1, false);
						}
					}
				}

				var1 = (te) ib.md_a.a((byte) -68);
			} while (var1 != null);

		} catch (RuntimeException var3) {
			throw id.a(var3, "u.C(" + var0 + ')');
		}
	}

	static void g (int unused) {
		try {
			dd.a(-1);
			cc.a((byte) 74);
			++xb;
			cf.b(~-116);
			db.g(0);
			d.c(6);
			we.b(503);
			j.g(-29992);
			hb.a(117);
			te.e((byte) 127);
			dc.b(-12);
			le.f(~-2001);
			e.f(1);
			((wd) v.cd_ub).b((byte) 69);
			fc.dd_h.c(-112);
			rb.cacheFile0.c((byte) 0);
			gf.cacheFile1.c((byte) 0);
			ge.cacheFile3.c((byte) 0);
			bd.cacheFile4.c((byte) 0);
			pb.cacheFile5.c((byte) 0);
			vc.cacheFile6.c((byte) 0);
			s.cacheFile7.c((byte) 0);
			q.cacheFile8.c((byte) 0);
			eb.cacheFile9.c((byte) 0);
			cacheFile10.c((byte) 0);
			hf.cacheFile11.c((byte) 0);
			dd.cacheFile12.c((byte) 0);
		} catch (RuntimeException e) {
			throw id.a(e, "u.D(" + unused + ')');
		}
	}
}
