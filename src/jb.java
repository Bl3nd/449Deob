class jb extends je {
	static int z;
	static int[] B;
	static int C;
	static dd D = new dd(64);
	static int E;
	static int G;
	static int H;
	static rd I;
	static be J;
	static boolean L = false;
	static int M = 0;
	static rd tryAgainIn60Secs2;
	static rd space2;
	static rd Q = md.a((String) "@or2@", (byte) 127);
	static rd chatback;
	static rd U;
	static rd V;
	static int[] W;
	static rd X;
	private static rd space;
	private static rd N = md.a((String) "flash1:", (byte) 124);
	private static rd tryAgainIn60Secs;
	private static rd T;
	private static rd Y;

	static {
		I = N;
		space = md.a(" ", (byte) 118);
		space2 = space;
		tryAgainIn60Secs = md.a("Try again in 60 secs)3)3)3", (byte) 126);
		tryAgainIn60Secs2 = tryAgainIn60Secs;
		J = new be();
		chatback = md.a("chatback", (byte) 127);
		T = md.a("Choose Option", (byte) 119);
		Y = md.a("cyan:", (byte) 117);
		V = T;
		X = Y;
		U = md.a("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", (byte) 117);
	}

	jb A;
	jb F;

	public static void e (int var0) {
		try {
			Q = null;
			B = null;
			tryAgainIn60Secs = null;
			chatback = null;
			I = null;
			N = null;
			space2 = null;
			if (var0 != 32) {
				V = null;
			}

			T = null;
			V = null;
			D = null;
			W = null;
			U = null;
			Y = null;
			space = null;
			J = null;
			tryAgainIn60Secs2 = null;
			X = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "jb.BA(" + var0 + ')');
		}
	}

	static oa a (int unused, pb cacheFile, int value, int i) {
		try {
			++z;
			return !t.a(value, (byte) -119, i, cacheFile) ? null : pa.a(-19457);
		} catch (RuntimeException var5) {
			throw id.a(var5, "jb.CA(" + unused + ',' + (cacheFile != null ? "{...}" : "null") + ',' + value + ',' + i + ')');
		}
	}

	static he a (int var0, int var1, int var2, int var3, int var4, boolean var5) {
		int var25 = client.int_tb;

		try {
			long var6 = ((long) var4 << 40) + ((long) var2 << 38) + (long) var0 - -((long) var1 << 16);
			++H;
			he var8;
			if (!var5) {
				var8 = (he) s.vb.a((byte) -69, var6);
				if (var8 != null) {
					return var8;
				}
			}

			hc var9 = u.a(var0, false);
			if (var1 > 1 && var9.yb != null) {
				int var10 = -1;
				int var11 = 0;
				if (var25 != 0 || ~var11 > -11) {
					do {
						if (~var1 <= ~var9.Z[var11] && ~var9.Z[var11] != -1) {
							var10 = var9.yb[var11];
						}

						++var11;
					} while (~var11 > -11);
				}

				if (~var10 != 0) {
					var9 = u.a(var10, false);
				}
			}

			ue var27 = var9.a(1, -93);
			if (var27 == null) {
				return null;
			} else {
				he var28 = null;
				if (~var9.rb != 0) {
					var28 = a(var9.Eb, 10, 1, var3, 0, true);
					if (var28 == null) {
						return null;
					}
				}

				int[] var12 = ic.pixels;
				int var14 = ic.height;
				int var13 = ic.width;
				int var15 = ic.int_ab;
				int var16 = ic.Z;
				int var18 = ic.int_db;
				int var17 = ic.int_bb;
				int[] var19 = v.d();
				if (var3 != 2) {
					U = null;
				}

				int var20;
				int var21;
				int var22;
				label79:
				{
					var20 = v.vb;
					var21 = v.nb;
					var8 = new he(36, 32);
					ic.a(var8.imagePixels, 36, 32);
					o.i = v.c(o.i);
					ic.c(0, 0, 36, 32, 0);
					v.sb = false;
					v.a(16, 16);
					var22 = var9.Sb;
					if (!var5) {
						if (~var2 != -3) {
							break label79;
						}

						var22 = (int) (1.04D * (double) var22);
						if (var25 == 0) {
							break label79;
						}
					}

					var22 = (int) (1.5D * (double) var22);
				}

				int var23 = v.pb[var9.fc] * var22 >> 16;
				int var24 = v.wb[var9.fc] * var22 >> 16;
				var27.d();
				var27.a(0, var9.vb, var9.Lb, var9.fc, var9.ec, var9.wb + var23 + var27.int_qb / 2, var24 + var9.wb);
				if (var2 >= 1) {
					var8.h(1);
				}

				if (~var2 <= -3) {
					var8.h(16777215);
				}

				if (~var4 != -1) {
					var8.g(var4);
				}

				ic.a(var8.imagePixels, 36, 32);
				if (~var9.rb != 0) {
					var28.a(0, 0);
				}

				if (!var5 && (var9.gb == 1 || var1 != 1) && ~var1 != 0) {
					qe.L.b(a.b('\uff00', var1), 1, 10, 1);
					qe.L.b(a.b(65280, var1), 0, 9, 16776960);
				}

				if (!var5) {
					s.vb.a(var3 ^ -111, var8, var6);
				}

				ic.a(var12, var13, var14);
				ic.a(var15, var17, var16, var18);
				v.c(var19);
				v.vb = var20;
				v.nb = var21;
				v.e();
				v.sb = true;
				return var8;
			}
		} catch (RuntimeException var26) {
			throw id.a(var26, "jb.EA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	static void b (byte var0) {
		int var8 = client.int_tb;

		try {
			++G;
			int var1 = 0;
			if (var0 != 46) {
				a(-70, null, -36, 17);
				if (var8 == 0 && ~gf.int_q >= ~var1) {
					return;
				}
			} else if (~gf.int_q >= ~var1) {
				return;
			}

			do {
				int var2 = sb.ints_o[var1];
				b var3 = ta.Nb[var2];
				int var4 = lc.readStream.readUnsignedByte((byte) 116);
				if (~(16 & var4) != -1) {
					var3.Cb = lc.readStream.f(false);
					var3.Lb = lc.readStream.readUnsignedLEShort(255);
				}

				if (~(4 & var4) != -1) {
					var3.Kb = lc.readStream.readUnsignedLEShort(255);
					if (~var3.Kb == -65536) {
						var3.Kb = -1;
					}
				}

				int var5;
				int var6;
				if (~(var4 & 64) != -1) {
					label103:
					{
						var5 = lc.readStream.readUnsignedLEShortA((byte) 99);
						if (var5 == '\uffff') {
							var5 = -1;
						}

						var6 = lc.readStream.c((byte) 115);
						if (var5 != var3.zc || ~var5 == 0) {
							if (var5 != -1 && var3.zc != -1 && bd.a(var5, false).Mb < bd.a(var3.zc, false).Mb) {
								break label103;
							}

							var3.int_tb = 0;
							var3.zc = var5;
							var3.Gb = var6;
							var3.int_rc = var3.Dc;
							var3.int_vb = 0;
							var3.Ec = 0;
							if (var8 == 0) {
								break label103;
							}
						}

						int var7 = bd.a(var5, false).Db;
						if (var7 == 1) {
							var3.int_vb = 0;
							var3.Gb = var6;
							var3.int_tb = 0;
							var3.Ec = 0;
						}

						if (~var7 == -3) {
							var3.int_vb = 0;
						}
					}
				}

				if (~(var4 & 8) != -1) {
					var5 = lc.readStream.i(0);
					var6 = lc.readStream.c((byte) 115);
					var3.a(ce.y, 70, var6, var5);
					var3.int_qc = 300 + ce.y;
					var3.int_hc = lc.readStream.readUnsignedByte((byte) 116);
					var3.Ob = lc.readStream.i(0);
				}

				if (~(128 & var4) != -1) {
					var3.Wb = lc.readStream.readUnsignedShort((byte) -51);
					var5 = lc.readStream.readInt_V1((byte) 122);
					var3.int_tc = 0;
					if (var3.Wb == '\uffff') {
						var3.Wb = -1;
					}

					var3.Sb = 0;
					var3.Hb = ce.y + (var5);
					var3.int_gc = var5 >> 16;
					if (~var3.Hb < ~ce.y) {
						var3.int_tc = -1;
					}
				}

				if (~(32 & var4) != -1) {
					var3.Qb = lc.readStream.readRSString(-1);
					var3.int_wc = 100;
				}

				if (~(1 & var4) != -1) {
					var3.tb_md = hb.a(lc.readStream.readUnsignedLEShort(255), (byte) 48);
					var3.xb = var3.tb_md.Bb;
					var3.int_oc = var3.tb_md.xb;
					var3.int_sc = var3.tb_md.vb;
					var3.int_kc = var3.tb_md.Mb;
					var3.Gc = var3.tb_md.Ub;
					var3.yb = var3.tb_md.int_pb;
					var3.Rb = var3.tb_md.Ob;
					var3.int_fc = var3.tb_md.int_eb;
					var3.Xb = var3.tb_md.Ib;
				}

				if ((var4 & 2) != 0) {
					var5 = lc.readStream.c((byte) 80);
					var6 = lc.readStream.readUnsignedByteS(255);
					var3.a(ce.y, 70, var6, var5);
					var3.int_qc = ce.y - -300;
					var3.int_hc = lc.readStream.readUnsignedByteS(255);
					var3.Ob = lc.readStream.readUnsignedByte((byte) 116);
				}

				++var1;
			} while (~gf.int_q < ~var1);

		} catch (RuntimeException var9) {
			throw id.a(var9, "jb.FA(" + var0 + ')');
		}
	}

	final void a (byte unused) {
		try {
			++E;
			if (this.F != null) {
				this.F.A = this.A;
				this.A.F = this.F;
				this.A = null;
				this.F = null;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "jb.DA(" + unused + ')');
		}
	}
}
