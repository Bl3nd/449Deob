import java.awt.Graphics;

final class o {
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	static rd loginServerOffline2;
	static byte[][][] h;
	static int[] i;
	static int j;
	static int k;
	static int l;
	static int m;
	static int n;
	static int p;
	static int int_r = 0;
	static int s;
	static int t;
	static rd rd_u = md.a((String) "Geben Sie Ihren Benutzernamen", (byte) 114);
	static int v;
	static int w = 0;
	static int x;
	static rd z = md.a((String) " )2> @cya@", (byte) 127);
	static int B;
	static int D = 0;
	private static rd loginServerOffline = md.a((String) "Login server offline)3", (byte) 127);

	static {
		loginServerOffline2 = loginServerOffline;
	}

	boolean y;
	private long f;
	private int[] o;
	private int q;
	private int[] A;
	private long C;

	static void b (byte var0) {
		try {
			try {
				Graphics graphics = rd.canvas.getGraphics();
				ib.jd_n.a(0, 553, 205, graphics);
			} catch (Exception var2) {
				rd.canvas.repaint();
			}

			++e;
			if (var0 != -7) {
				w = -107;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "o.H(" + var0 + ')');
		}
	}

	public static void c (byte var0) {
		try {
			h = null;
			loginServerOffline = null;
			rd_u = null;
			if (var0 != -69) {
				z = null;
			}

			z = null;
			i = null;
			loginServerOffline2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "o.A(" + var0 + ')');
		}
	}

	static int a (int length, byte unused, byte[] bytes) {
		try {
			++m;
			return dc.a(bytes, 0, -23173, length);
		} catch (RuntimeException var4) {
			throw id.a(var4, "o.F(" + length + ',' + unused + ',' + (bytes != null ? "{...}" : "null") + ')');
		}
	}

	static int a (byte var0, int var1) {
		try {
			++l;
			if (var0 < 16) {
				return 54;
			} else {
				s var2 = pb.c(var1, false);
				int var4 = var2.cb;
				int var5 = var2.gb;
				int var6 = ka.Ub[var5 - var4];
				int var3 = var2.int_mb;
				return var6 & ta.Pb[var3] >> var4;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "o.L(" + var0 + ',' + var1 + ')');
		}
	}

	static void c (int var0) {
		try {
			++a;
			if (var0 != 357) {
				c(106);
			}

			try {
				Graphics graphics = rd.canvas.getGraphics();
				ud.R.a(0, 17, 357, graphics);
			} catch (Exception var2) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "o.K(" + var0 + ')');
		}
	}

	static nd a (byte var0, int fileId, int someCacheId) {
		try {
			nd var3 = bf.b('\uffff', fileId);
			++x;
			if (someCacheId == -1) {
				return var3;
			} else if (var3 != null && var3.Ab != null && ~someCacheId > ~var3.Ab.length) {
				if (var0 > -56) {
					a((byte) -2, 69, 100);
				}

				return var3.Ab[someCacheId];
			} else {
				return null;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "o.G(" + var0 + ',' + fileId + ',' + someCacheId + ')');
		}
	}

	private void a (int unused) {
		try {
			++n;
			long l = this.C;
			int i = this.o[5];
			this.C = 0L;
			int i1 = this.o[9];
			this.o[5] = i1;
			this.o[9] = i;
			int i2 = 0;
			for ( ; ~i2 > -13 ; ++i2) {
				this.C <<= 4;
				if (~this.o[i2] <= -257) {
					this.C += (long) (-256 + this.o[i2]);
				}
			}

			if (this.o[0] >= 256) {
				this.C += (long) (-256 + this.o[0] >> 4);
			}

			if (~this.o[1] <= -257) {
				this.C += (long) (-256 + this.o[1] >> 8);
			}

			int i3 = 0;
			while (i3 < 5) {
				this.C <<= 3;
				this.C += (long) this.A[i3];
				++i3;
			}

			this.o[5] = i;
			this.o[9] = i1;
			this.C <<= 1;
			this.C += (long) (!this.y ? 0 : 1);
			if (l != 0L && l != this.C) {
				r.F.a(l, 2);
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "o.J(" + unused + ')');
		}
	}

	final kc a (byte var1) {
		int var9 = client.int_tb;

		try {
			++v;
			if (~this.q != 0) {
				return hb.a(this.q, (byte) 48).h(0);
			} else {
				boolean var2 = false;
				int var3 = 0;
				int var4;
				if (var9 != 0) {
					var4 = this.o[var3];
					if (~var4 <= -257 && var4 < 512 && !qb.a(var4 - 256, -1).h(0)) {
						var2 = true;
					}

					if (~var4 <= -513 && !u.a(var4 - 512, false).a(108, this.y)) {
						var2 = true;
					}

					++var3;
				}

				for ( ; ~var3 > -13 ; ++var3) {
					var4 = this.o[var3];
					if (~var4 <= -257 && var4 < 512 && !qb.a(var4 - 256, -1).h(0)) {
						var2 = true;
					}

					if (~var4 <= -513 && !u.a(var4 - 512, false).a(108, this.y)) {
						var2 = true;
					}
				}

				if (var2) {
					return null;
				} else {
					int var5 = 0;
					kc[] var11 = new kc[12];
					if (var1 <= 43) {
						w = 29;
					}

					int var6 = 0;
					if (var9 != 0 || ~var6 > -13) {
						do {
							int var7 = this.o[var6];
							kc var8;
							if (~var7 <= -257 && ~var7 > -513) {
								var8 = qb.a(var7 + -256, -1).i(-128);
								if (var8 != null) {
									var11[var5++] = var8;
								}
							}

							if (var7 >= 512) {
								var8 = u.a(-512 + var7, false).b(100, this.y);
								if (var8 != null) {
									var11[var5++] = var8;
								}
							}

							++var6;
						} while (~var6 > -13);
					}

					kc var12 = new kc(var11, var5);
					int var13 = 0;
					do {
						if (~this.A[var13] != -1) {
							var12.a(pd.B[var13][0], pd.B[var13][this.A[var13]]);
							if (~var13 == -2) {
								var12.a(client.W[0], client.W[this.A[var13]]);
							}
						}

						++var13;
					} while (var13 < 5);

					return var12;
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "o.C(" + var1 + ')');
		}
	}

	final void a (id var1, byte var2) {
		int var5 = client.int_tb;

		try {
			++d;
			var1.writeByte((byte) 118, !this.y ? 0 : 1);
			int var3 = 0;
			int var4;
			if (var5 != 0 || ~var3 > -8) {
				do {
					label35:
					{
						var4 = this.o[sa.ob[var3]];
						if (~var4 != -1) {
							var1.writeByte((byte) 120, var4 + -256);
							if (var5 == 0) {
								break label35;
							}
						}

						var1.writeByte((byte) 115, -1);
					}

					++var3;
				} while (~var3 > -8);
			}

			var4 = 0;
			if (var2 <= 102) {
				this.a(null, (byte) -86);
			}

			do {
				var1.writeByte((byte) 104, this.A[var4]);
				++var4;
			} while (var4 < 5);

		} catch (RuntimeException var6) {
			throw id.a(var6, "o.M(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final void a (boolean flag, int i, byte unused, int[] data, int[] data2) {
		try {
			++c;
			if (data2 == null) {
				data2 = new int[12];
				int i1 = 0;
				do {
					int fileRequest = 0;
					if (rd.p > fileRequest) {
						do {
							wa class_wa = qb.a(fileRequest, -1);
							//System.out.println("ArchiveFile2 decode fileRequest: " + fileRequest);
							if (class_wa != null && !class_wa.boolean_tb && class_wa.ab == (!flag ? 0 : 7) + i1) {
								data2[sa.ob[i1]] = fileRequest + 256;
								break;
							}

							++fileRequest;
						} while (rd.p > fileRequest);
					}

					++i1;
				} while (i1 < 7);
			}

			this.q = i;
			this.y = flag;
			this.A = data;
			this.o = data2;
			this.a(-28241);
		} catch (RuntimeException var10) {
			throw id.a(var10, "o.D(" + flag + ',' + i + ',' + unused + ',' + (data != null ? "{...}" : "null") + ',' + (data2 != null ? "{...}" : "null") + ')');
		}
	}

	final void a (boolean var1, int var2, int var3) {
		try {
			if (var2 < 93) {
				this.b(109);
			}

			int var4;
			label23:
			{
				++B;
				var4 = this.A[var3];
				if (var1) {
					++var4;
					if (var4 < pd.B[var3].length) {
						break label23;
					}

					var4 = 0;
					if (client.int_tb == 0) {
						break label23;
					}
				}

				--var4;
				if (var4 < 0) {
					var4 = pd.B[var3].length + -1;
				}
			}

			this.A[var3] = var4;
			this.a(-28241);
		} catch (RuntimeException var5) {
			throw id.a(var5, "o.N(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final int b (int var1) {
		try {
			int var2 = 74 % ((var1 - -9) / 41);
			++s;
			return ~this.q != 0 ? 305419896 + hb
					.a(this.q, (byte) 48).zb : this.o[1] + (this.o[11] << 5) + (this.o[0] << 15) + (this.A[0] << 25) - -(this.A[4] << 20) + (this.o[8] << 10);
		} catch (RuntimeException var3) {
			throw id.a(var3, "o.E(" + var1 + ')');
		}
	}

	final void a (boolean var1, int var2, byte var3) {
		int var6 = client.int_tb;

		try {
			++b;
			if (~var2 != -2 || !this.y) {
				int var4 = this.o[sa.ob[var2]];
				if (var4 != 0) {
					var4 -= 256;

					wa var5;
					do {
						label44:
						{
							if (var1) {
								++var4;
								if (var4 < rd.p) {
									break label44;
								}

								var4 = 0;
								if (var6 == 0) {
									break label44;
								}
							}

							--var4;
							if (var4 < 0) {
								var4 = rd.p - 1;
							}
						}

						var5 = qb.a(var4, -1);
					} while (var5 == null || var5.boolean_tb || var5.ab != (!this.y ? 0 : 7) + var2);

					this.o[sa.ob[var2]] = var4 + 256;
					this.a(-28241);
					int var8 = -117 % ((var3 - -17) / 44);
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "o.B(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a (boolean var1, int var2) {
		try {
			++t;
			if (this.y != var1) {
				if (var2 != -1) {
					c((byte) 65);
				}

				this.a(var1, -1, (byte) -34, this.A, null);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "o.O(" + var1 + ',' + var2 + ')');
		}
	}

	final ue a (int var1, e var2, int var3, int var4, e var5) {
		int var17 = client.int_tb;

		try {
			++k;
			if (var3 != ~this.q) {
				return hb.a(this.q, (byte) 48).a(var1, var2, var4, (byte) 24, var5);
			} else {
				int[] var8 = this.o;
				long var6 = this.C;
				if (var2 != null && (var2.int_bb >= 0 || ~var2.Cb <= -1)) {
					var8 = new int[12];
					int var9 = 0;
					do {
						var8[var9] = this.o[var9];
						++var9;
					} while (var9 < 12);

					if (var2.int_bb >= 0) {
						var6 += (long) (-this.o[5] + var2.int_bb << 8);
						var8[5] = var2.int_bb;
					}

					if (var2.Cb >= 0) {
						var6 += (long) (var2.Cb + -this.o[3] << 16);
						var8[3] = var2.Cb;
					}
				}

				ue var19 = (ue) r.F.a((byte) -109, var6);
				if (var19 == null) {
					boolean var10 = false;
					int var11 = 0;
					if (var17 != 0 || ~var11 > -13) {
						do {
							int var12 = var8[var11];
							if (~var12 <= -257 && ~var12 > -513 && !qb.a(var12 + -256, var3 + -1).c(false)) {
								var10 = true;
							}

							if (var12 >= 512 && !u.a(-512 + var12, false).a(this.y, (byte) 40)) {
								var10 = true;
							}

							++var11;
						} while (~var11 > -13);
					}

					if (var10) {
						if (this.f != -1L) {
							var19 = (ue) r.F.a((byte) -92, this.f);
						}

						if (var19 == null) {
							return null;
						}
					}

					if (var19 == null) {
						kc[] var21 = new kc[12];
						int var13 = 0;
						int var14 = 0;
						if (var17 != 0 || ~var14 > -13) {
							do {
								int var15 = var8[var14];
								kc var16;
								if (var15 >= 256 && ~var15 > -513) {
									var16 = qb.a(-256 + var15, ~var3).g(31811);
									if (var16 != null) {
										var21[var13++] = var16;
									}
								}

								if (var15 >= 512) {
									var16 = u.a(var15 + -512, false).c(var3, this.y);
									if (var16 != null) {
										var21[var13++] = var16;
									}
								}

								++var14;
							} while (~var14 > -13);
						}

						kc var22 = new kc(var21, var13);
						int var23 = 0;
						do {
							if (this.A[var23] != 0) {
								var22.a(pd.B[var23][0], pd.B[var23][this.A[var23]]);
								if (~var23 == -2) {
									var22.a(client.W[0], client.W[this.A[var23]]);
								}
							}

							++var23;
						} while (var23 < 5);

						var19 = var22.a(64, 850, -30, -50, -30);
						r.F.a(var3 ^ -92, var19, var6);
						this.f = var6;
					}
				}

				if (var2 != null || var5 != null) {
					ue var20;
					if (var2 != null && var5 != null) {
						var20 = var2.a(var1, var4, var5, -92, var19);
						if (var17 == 0) {
							return var20;
						}
					}

					if (var2 == null) {
						var20 = var5.a(var19, var1, (byte) -43);
						if (var17 == 0) {
							return var20;
						}
					}

					var20 = var2.a(var19, var4, (byte) -43);
					if (var17 != 0) {
						return var19;
					} else {
						return var20;
					}
				} else {
					return var19;
				}
			}
		} catch (RuntimeException var18) {
			throw id.a(var18, "o.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
}
