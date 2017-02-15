abstract class q extends sb {
	static mc[] mcs_v = new mc[8];
	static int int_w;
	static int x;
	static int y;
	static int z;
	static rd A;
	static int B;
	static ke cacheFile8;
	static int D;
	static rd E;
	static int F;
	static int I;
	static rd yourAccountIsAlreadyLoggedIn2;
	static pb archiveFile7;
	static rd trade_compete2;
	private static rd trade_compete = md.a((String) "Trade)4compete", (byte) 118);
	private static rd yourAccountIsAlreadyLoggedIn = md.a((String) "Your account is already logged in)3", (byte) 120);

	static {
		yourAccountIsAlreadyLoggedIn2 = yourAccountIsAlreadyLoggedIn;
		E = md.a("Freunde", (byte) 126);
		A = md.a("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", (byte) 114);
		y = 0;
		trade_compete2 = trade_compete;
	}

	static boolean a (byte unused, int i) {
		try {
			++z;
			return (1 & i >> 28) != 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "q.W(" + unused + ',' + i + ')');
		}
	}

	private static int f (int statusIndex) {
		int i = kd.i[statusIndex];
		i = (i * ta.Db >> 8) * i;
		return (int) (Math.sqrt((double) i) + 0.5D);
	}

	static void a (int i, byte unused) {
		try {
			++B;
			System.err.println(i);
			nd.a((byte) -51, i);
			ad.a(i, (byte) -106);
		} catch (RuntimeException var3) {
			throw id.a(var3, "q.P(" + i + ',' + unused + ')');
		}
	}

	static void sleep (long millis, byte unused) {
		try {
			++int_w;

			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "q.U(" + millis + ',' + unused + ')');
		}
	}

	static void a (td var0, int var1, int var2, int var3) {
		int var13 = client.int_tb;

		try {
			++D;
			if ((var1 & 16) != 0) {
				label123:
				{
					var0.Qb = lc.readStream.readRSString(-1);
					if (~var0.Qb.readUnsignedByte(0, -14412) == -127) {
						var0.Qb = var0.Qb.a(false, 1);
						n.a(var0.Gd, var0.Qb, true, 2);
						if (var13 == 0) {
							break label123;
						}
					}

					if (af.td_p == var0) {
						n.a(var0.Gd, var0.Qb, true, 2);
					}
				}

				var0.int_wc = 150;
				var0.Db = 0;
				var0.Mb = 0;
			}

			if ((512 & var1) != 0) {
				var0.Zb = lc.readStream.readUnsignedByteS(255);
				var0.Eb = lc.readStream.c((byte) 91);
				var0.int_jc = lc.readStream.readUnsignedByte((byte) 116);
				var0.int_sb = lc.readStream.readUnsignedByteS(255);
				var0.int_uc = lc.readStream.readUnsignedLEShortA((byte) 84) - -ce.y;
				var0.Ib = lc.readStream.readUnsignedLEShort(255) - -ce.y;
				var0.int_dc = lc.readStream.c((byte) 86);
				var0.f((byte) -105);
			}

			int var4;
			if ((var1 & 256) != 0) {
				var0.Wb = lc.readStream.f(false);
				var4 = lc.readStream.readInt((byte) -108);
				var0.Hb = ce.y - -(var4);
				var0.int_tc = 0;
				if (~var0.Wb == -65536) {
					var0.Wb = -1;
				}

				var0.int_gc = var4 >> 16;
				if (~var0.Hb < ~ce.y) {
					var0.int_tc = -1;
				}

				var0.Sb = 0;
			}

			if (~(var1 & 4) != -1) {
				var0.Kb = lc.readStream.readUnsignedLEShort(255);
				if (var0.Kb == '\uffff') {
					var0.Kb = -1;
				}
			}

			var4 = 77 / ((26 - var2) / 62);
			int var5;
			if (~(1 & var1) != -1) {
				var5 = lc.readStream.c((byte) 74);
				byte[] var6 = new byte[var5];
				id var7 = new id(var6);
				lc.readStream.b(0, var6, var5, -38);
				sd.X[var3] = var7;
				var0.a(var7, -1);
			}

			if ((var1 & 64) != 0) {
				var0.Cb = lc.readStream.readUnsignedLEShortA((byte) 111);
				var0.Lb = lc.readStream.f(false);
			}

			int var15;
			if ((32 & var1) != 0) {
				var5 = lc.readStream.readUnsignedLEShortA((byte) 83);
				var15 = lc.readStream.c((byte) 98);
				int var16 = lc.readStream.c((byte) 121);
				int var8 = lc.readStream.pointer;
				if (var0.Gd != null && var0.o_jd != null) {
					long var9 = var0.Gd.i(29486);
					boolean var11 = false;
					if (var15 <= 1) {
						int var12 = 0;
						if (var13 != 0 || ~var12 > ~nc.p) {
							do {
								if (var9 == md.p[var12]) {
									var11 = true;
									if (var13 == 0) {
										break;
									}
								}

								++var12;
							} while (~var12 > ~nc.p);
						}
					}

					if (!var11 && client.int_ob == 0) {
						label136:
						{
							cc.id_a.pointer = 0;
							lc.readStream.a(-95, cc.id_a.buffer, var16, 0);
							cc.id_a.pointer = 0;
							rd var17 = ie.a(0, cc.id_a).f(-79);
							var0.Qb = var17.d(-6488);
							var0.Db = var5 >> 8;
							var0.Mb = var5 & 255;
							var0.int_wc = 150;
							if (var15 == 2 || var15 == 3) {
								n.a(pc.a((byte) 126, new rd[]{le.rd_ab, var0.Gd}), var17, true, 1);
								if (var13 == 0) {
									break label136;
								}
							}

							if (var15 == 1) {
								n.a(pc.a((byte) 127, new rd[]{ha.Z, var0.Gd}), var17, true, 1);
								if (var13 == 0) {
									break label136;
								}
							}

							n.a(var0.Gd, var17, true, 2);
						}
					}
				}

				lc.readStream.pointer = var8 - -var16;
			}

			if ((var1 & 1024) != 0) {
				var5 = lc.readStream.i(0);
				var15 = lc.readStream.readUnsignedByteS(255);
				var0.a(ce.y, 70, var15, var5);
				var0.int_qc = 300 + ce.y;
				var0.int_hc = lc.readStream.readUnsignedByte((byte) 116);
				var0.Ob = lc.readStream.readUnsignedByteS(255);
			}

			if (~(2 & var1) != -1) {
				var5 = lc.readStream.readUnsignedByteS(255);
				var15 = lc.readStream.c((byte) 75);
				var0.a(ce.y, 70, var15, var5);
				var0.int_qc = ce.y + 300;
				var0.int_hc = lc.readStream.readUnsignedByte((byte) 116);
				var0.Ob = lc.readStream.i(0);
			}

			if (~(var1 & 8) != -1) {
				var5 = lc.readStream.readUnsignedLEShortA((byte) 95);
				var15 = lc.readStream.i(0);
				if (~var5 == -65536) {
					var5 = -1;
				}

				ke.a(var15, var5, var0, 2);
			}
		} catch (RuntimeException var14) {
			throw id.a(var14, "q.BA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void g (int var0) {
		try {
			yourAccountIsAlreadyLoggedIn = null;
			cacheFile8 = null;
			archiveFile7 = null;
			yourAccountIsAlreadyLoggedIn2 = null;
			A = null;
			if (var0 == 3) {
				trade_compete2 = null;
				E = null;
				mcs_v = null;
				trade_compete = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "q.Q(" + var0 + ')');
		}
	}

	abstract void send (int status, int data1, int data2, long timeStamp);

	final void a (int var1, long timeStamp, boolean var4) {
		try {
			ta.Db = var1;
			++x;
			int var5 = 0;
			while (~var5 > -17) {
				kd.i[var5] = 12800;
				++var5;
			}

			if (!var4) {
				int statusIndex = 0;
				do {
					int data2Offset = f(statusIndex);
					this.send(statusIndex + 176, 7, data2Offset >> 7, timeStamp);
					this.send(176 + statusIndex, 39, 127 & data2Offset, timeStamp);
					++statusIndex;
				} while (statusIndex < 16);

			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "q.R(" + var1 + ',' + timeStamp + ',' + var4 + ')');
		}
	}

	final boolean b (int var1, int var2, int var3, long var4) {
		int var6;
		int var7;
		if ((var1 & 224) == 128) {
			var6 = 1 << (var1 & 15);
			var7 = te.zb[var2];
			if (var1 >= 144 && var3 != 0) {
				if ((var7 & var6) != 0) {
					this.send(var1, var2, 0, var4);
				} else {
					te.zb[var2] = var7 | var6;
				}
			} else {
				te.zb[var2] = var7 & ~var6;
			}

			return false;
		} else {
			if ((var1 & 240) == 176) {
				if (var2 == 121) {
					this.send(var1, var2, var3, var4);
					var6 = var1 & 15;
					kd.i[var6] = 12800;
					var7 = f(var6);
					this.send(var1, 7, var7 >> 7, var4);
					this.send(var1, 39, var7 & 127, var4);
					return true;
				}

				if (var2 == 7 || var2 == 39) {
					var6 = var1 & 15;
					if (var2 == 7) {
						kd.i[var6] = (kd.i[var6] & 127) + (var3 << 7);
					} else {
						kd.i[var6] = (kd.i[var6] & 16256) + var3;
					}

					var7 = f(var6);
					this.send(var1, 7, var7 >> 7, var4);
					this.send(var1, 39, var7 & 127, var4);
					return true;
				}
			}

			return false;
		}
	}

	final void a (int unused, long timeStamp) {
		try {
			++F;
			int i = 0;
			int i1;
			int i2;
			while (i < 128) {
				i1 = te.zb[i];
				te.zb[i] = 0;
				i2 = 0;
				do {
					if ((1 << i2 & i1) != 0) {
						this.send(i2 + 144, i, 0, timeStamp);
					}

					++i2;
				} while (i2 < 16);

				++i;
			}

			i1 = 0;
			do {
				this.send(176 + i1, 123, 0, timeStamp);
				++i1;
			} while (i1 < 16);

			i2 = 0;

			while (i2 < 16) {
				this.send(176 + i2, 120, 0, timeStamp);
				++i2;
			}

			int var7 = 0;
			if (~var7 > -17) {
				do {
					this.send(176 + var7, 121, 0, timeStamp);
					++var7;
				} while (~var7 > -17);
			}

			int var8 = 0;
			while (~var8 > -17) {
				this.send(var8 + 176, 0, 0, timeStamp);
				++var8;
			}

			int var9 = 0;
			if (~var9 > -17) {
				do {
					this.send(var9 + 176, 32, 0, timeStamp);
					++var9;
				} while (~var9 > -17);
			}

			int var10 = 0;
			if (~var10 > -17) {
				do {
					this.send(192 - -var10, 0, 0, timeStamp);
					++var10;
				} while (~var10 > -17);

			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "q.S(" + unused + ',' + timeStamp + ')');
		}
	}

	final void a (long timeStamp, byte unused, int i, int i1) {
		int var8 = client.int_tb;

		try {
			i = (int) (Math.pow(0.1D, 5.0E-4D * (double) i1) * (double) i + 0.5D);
			++I;
			if (i != ta.Db) {
				ta.Db = i;
				int var6 = 0;
				if (var8 != 0 || ~var6 > -17) {
					do {
						int var7 = f(var6);
						this.send(var6 + 176, 7, var7 >> 7, timeStamp);
						this.send(176 - -var6, 39, 127 & var7, timeStamp);
						++var6;
					} while (~var6 > -17);
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "q.T(" + timeStamp + ',' + unused + ',' + i + ',' + i1 + ')');
		}
	}
}
