abstract class pb {
	static int int_a;
	static int int_b;
	static int c;
	static int d = 0;
	static int g;
	static int i;
	static int int_j;
	static int k;
	static rd l;
	static int int_m;
	static rd n = md.a((String) "sch-Utteln:", (byte) 124);
	static int int_o;
	static int p;
	static int r;
	static int int_t;
	static int int_u;
	static int v;
	static rd w = md.a((String) "Sichtbare Karte vorbereitet)3", (byte) 119);
	static int x;
	static int z;
	static rd A = md.a((String) "Verbinde mit Server)3)3)3", (byte) 114);
	static int C;
	static int F;
	static rd G = md.a((String) "(X", (byte) 121);
	static int H = 0;
	static int K;
	static rd L = md.a((String) "oberen Rand der Webseite ausw-=hlen)3", (byte) 124);
	static int M;
	static int N;
	static int O = 0;
	static rd backvmid1 = md.a((String) "backvmid1", (byte) 127);
	static ke cacheFile5;
	static int T;
	static int V;
	static int W;
	static rd X = md.a((String) "Sie befinden sich in einem Mitglieder)2Gebiet(Q", (byte) 117);
	static int Y;
	static int Z;
	static int ab;
	private static rd J = md.a((String) "Password: ", (byte) 127);

	static {
		l = J;
	}

	int q;
	Object[] s;
	int[] y;
	int[] I;
	int[] bb;
	private Object[][] e;
	private int[] ints_f;
	private boolean h;
	private boolean B;
	private int[][] D;
	private lc[] E;
	private int[][] R;
	private int S;
	private lc U;
	private int[] cb;

	pb (boolean flag, boolean flag2) {
		try {
			this.B = flag;
			this.h = flag2;
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.<init>(" + flag + ',' + flag2 + ')');
		}
	}

	static nd a (nd var0, int var1, int var2, int var3, int var4, int var5, nd[] var6, int var7, int var8,
				 int var9, int var10, int var11) {
		int var17 = client.int_tb;

		try {
			if (var7 != -1) {
				G = null;
			}

			++int_j;
			if (var4 >= var1 && var9 >= var2 && ~var4 > ~var10 && var3 > var9) {
				int var12 = 0;
				if (var17 == 0 && var12 >= var6.length) {
					return null;
				} else {
					do {
						nd var13 = var6[var12];
						if (var13 != null && (~var5 == ~var13.Uc || var17 != 0) && !se
								.a(var13, true) && var13 != var0) {
							int var15 = -var11 + var2 + var13.Hb;
							int var14 = var1 + var13.kb - var8;
							if (var13.tb == 0) {
								nd var16 = a(var0, var14, var15, var15 - -var13.Nb, var4, var13.dc, var6, -1, var13.Mb, var9, var13.Bb + var14, var13.int_ib);
								if (var16 != null) {
									return var16;
								}

								if (var13.Ab != null) {
									var16 = a(var0, var14, var15, var15 + var13.Nb, var4, var13.dc, var13.Ab, -1, var13.Mb, var9, var14 - -var13.Bb, var13.int_ib);
									if (var16 != null) {
										return var16;
									}
								}
							}

							if (ke.f(58, fc
									.a(var13, 1572721824)) && ~var4 <= ~var14 && ~var15 >= ~var9 && ~var4 > ~(var14 - -var13.Bb) && var9 < var13.Nb + var15) {
								return var13;
							}
						}

						++var12;
					} while (var12 < var6.length);

					return null;
				}
			} else {
				return null;
			}
		} catch (RuntimeException var18) {
			throw id.a(var18, "pb.S(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + "{...}" + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	public static void a (int var0) {
		try {
			l = null;
			backvmid1 = null;
			cacheFile5 = null;
			A = null;
			X = null;
			J = null;
			n = null;
			G = null;
			w = null;
			if (var0 != 0) {
				a(-55);
			}

			L = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "pb.GA(" + var0 + ')');
		}
	}

	static void b (int var0) {
		int var5 = client.int_tb;

		try {
			++k;
			ka var1 = (ka) jc.J.c((byte) 90);
			int var2 = 16 % ((var0 - 51) / 45);
			if (var5 != 0 || var1 != null) {
				do {
					label61:
					{
						if (~var1.Wb == ~ce.plane && ~ce.y >= ~var1.int_hc) {
							if (ce.y < var1.int_wb) {
								break label61;
							}

							if (var1.Mb > 0) {
								b var3 = ta.Nb[-1 + var1.Mb];
								if (var3 != null && ~var3.x_ <= -1 && ~var3.x_ > -13313 && ~var3.y_ <= -1 && var3.y_ < 13312) {
									var1.a(vc.a(var1.Wb, var3.x_, var3.y_, (byte) 37) + -var1.Bb, var3.y_, var3.x_, (byte) -38, ce.y);
								}
							}

							if (~var1.Mb > -1) {
								td var7;
								label49:
								{
									int var4 = -1 + -var1.Mb;
									if (~var4 != ~lc.n) {
										var7 = f.Lc[var4];
										if (var5 == 0) {
											break label49;
										}
									}

									var7 = af.td_p;
								}

								if (var7 != null && ~var7.x_ <= -1 && ~var7.x_ > -13313 && var7.y_ >= 0 && var7.y_ < 13312) {
									var1.a(vc.a(var1.Wb, var7.x_, var7.y_, (byte) 37) + -var1.Bb, var7.y_, var7.x_, (byte) -113, ce.y);
								}
							}

							var1.a(20, va.g);
							pc.o.a(ce.plane, (int) var1.vb, (int) var1.Ob, (int) var1.Eb, 60, var1, var1.int_ub, -1, false);
							if (var5 == 0) {
								break label61;
							}
						}

						var1.d(-26669);
					}

					var1 = (ka) jc.J.a((byte) -68);
				} while (var1 != null);

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "pb.LA(" + var0 + ')');
		}
	}

	static int[] a (nd var0, int var1) {
		int var7 = client.int_tb;

		try {
			if (var1 != 18168) {
				return null;
			} else {
				int var2 = var0.dc >> 16;
				++V;
				if (!a.a(0, var2)) {
					return null;
				} else {
					int var3 = var0.kb;
					int var4 = var0.Hb;
					int var5 = var0.Uc;
					int[] var9;
					if (var7 == 0 && ~var5 == 0) {
						var9 = new int[]{var3, var4};
						return var9;
					} else {
						do {
							nd var6 = ld.c[var2][var5];
							var4 += var6.Hb - var6.int_ib;
							var5 = var6.Uc;
							var3 += -var6.Mb + var6.kb;
						} while (~var5 != 0);

						var9 = new int[]{var3, var4};
						return var9;
					}
				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "pb.V(" + "{...}" + ',' + var1 + ')');
		}
	}

	static s c (int var0, boolean var1) {
		try {
			++N;
			if (var1) {
				cacheFile5 = null;
			}

			s var2 = (s) ta.Kb.a((byte) -75, (long) var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = hf.archiveFile2.a(14, var0, (byte) 66);
				var2 = new s();
				if (var3 != null) {
					var2.a(new id(var3), 56);
				}

				ta.Kb.a(-94, var2, (long) var0);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.T(" + var0 + ',' + var1 + ')');
		}
	}

	final int[] a (int index, boolean unused) {
		try {
			++F;
			return this.D[index];
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.R(" + index + ',' + unused + ')');
		}
	}

	final int a (rd string, int unused, int index) {
		try {
			++T;
			string = string.l(-34);
			return this.E[index].a(-103, string.g(255));
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.IA(" + (string != null ? "{...}" : "null") + ',' + unused + ',' + index + ')');
		}
	}

	final int getLength (byte unused) {
		try {
			++p;
			return this.e.length;
		} catch (RuntimeException var3) {
			throw id.a(var3, "pb.DA(" + unused + ')');
		}
	}

	void a (int var1, byte var2) {
		try {
			if (var2 <= 1) {
				b(-56);
			}

			++int_b;
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.H(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean a (byte unused, int fileRequestId) {
		try {
			++C;
			if (this.s[fileRequestId] != null) {
				return true;
			} else {
				this.b(fileRequestId, -1126799000);
				return this.s[fileRequestId] != null;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.OA(" + unused + ',' + fileRequestId + ')');
		}
	}

	final boolean b (byte unused) {
		try {
			++g;
			boolean valid = true;
			int size = 0;
			if (this.cb.length <= size) {
				return true;
			} else {
				while (this.cb.length > size) {
					int fileRequestId = this.cb[size];
					if (this.s[fileRequestId] == null) {
						this.b(fileRequestId, -1126799000);
						if (this.s[fileRequestId] == null) {
							valid = false;
						}
					}

					++size;
				}

				return valid;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "pb.NA(" + unused + ')');
		}
	}

	final byte[] a (int var1, int var2) {
		try {
			++c;
			if (this.e.length == 1) {
				return this.a(0, var2, (byte) 66);
			} else if (~this.e[var2].length == -2) {
				return this.a(var2, 0, (byte) 66);
			} else if (var1 != 0) {
				return null;
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.FA(" + var1 + ',' + var2 + ')');
		}
	}

	final void a (byte[] bytes, byte unused) {
		int dummy = client.int_tb;
		try {
			++i;
			this.q = o.a(bytes.length, (byte) 65, bytes);
			id class_id = new id(ee.a(bytes, false));
			int i = class_id.readUnsignedByte((byte) 116);
			System.out.println("i : " + i);
			if (i == 5) {
				int i1 = 0;
				int i2 = -1;
				int i3 = class_id.readUnsignedByte((byte) 116);
				this.S = class_id.readUnsignedLEShort(255);
				System.out.println("i3 : " + i3 + " this.S : " + this.S);
				this.cb = new int[this.S];
				int i4 = 0;
				for ( ; i4 < this.S ; ++i4) {
					this.cb[i4] = i1 += class_id.readUnsignedLEShort(255);
					if (this.cb[i4] > i2) {
						i2 = this.cb[i4];
					}
				}

				this.bb = new int[1 + i2];
				this.D = new int[i2 - -1][];
				this.y = new int[i2 - -1];
				this.s = new Object[i2 - -1];
				this.I = new int[i2 + 1];
				this.e = new Object[1 + i2][];
				if (i3 != 0) {
					this.ints_f = new int[i2 + 1];
					int i5 = 0;
					if (i5 < this.S) {
						do {
							this.ints_f[this.cb[i5]] = class_id.readInt((byte) -35);
							++i5;
						} while (i5 < this.S);
					}

					this.U = new lc(this.ints_f);
				}
				int i5 = 0;
				if (i5 < this.S) {
					do {
						this.y[this.cb[i5]] = class_id.readInt((byte) -26);
						++i5;
					} while (i5 < this.S);
				}

				int i6 = 0;
				while (~this.S < ~i6) {
					this.bb[this.cb[i6]] = class_id.readInt((byte) -25);
					++i6;
				}

				int i7 = 0;
				if (this.S > i7) {
					do {
						this.I[this.cb[i7]] = class_id.readUnsignedLEShort(255);
						++i7;
					} while (this.S > i7);
				}

				int i8 = 0;
				int i9;
				int i10;
				int i11;
				int i12;
				int i13;
				while (i8 < this.S) {
					i1 = 0;
					i9 = this.cb[i8];
					i11 = -1;
					i10 = this.I[i9];
					this.D[i9] = new int[i10];
					i12 = 0;
					if (i10 <= i12) {
						this.e[i9] = new Object[1 + i11];
						++i8;
					} else {
						do {
							i13 = this.D[i9][i12] = i1 += class_id.readUnsignedLEShort(255);
							if (i13 > i11) {
								i11 = i13;
							}

							++i12;
						} while (i10 > i12);

						this.e[i9] = new Object[1 + i11];
						++i8;
					}
				}

				if (i3 != 0) {
					this.R = new int[i2 - -1][];
					this.E = new lc[i2 + 1];
					i9 = 0;
					if (i9 < this.S) {
						do {
							i10 = this.cb[i9];
							i11 = this.I[i10];
							this.R[i10] = new int[this.e[i10].length];
							i12 = 0;
							while (i12 < i11) {
								this.R[i10][this.D[i10][i12]] = class_id.readInt((byte) -36);
								++i12;
							}

							this.E[i10] = new lc(this.R[i10]);
							++i9;
						} while (i9 < this.S);
					}
				}
			}
		} catch (RuntimeException var20) {
			throw id.a(var20, "pb.EA(" + "{...}" + ',' + unused + ')');
		}
	}

	final void c (byte unused) {
		try {
			++x;
			int var2 = 0;
			if (this.e.length > var2) {
				do {
					if (this.e[var2] != null) {
						int var3 = 0;
						while (var3 < this.e[var2].length) {
							this.e[var2][var3] = null;
							++var3;
						}
					}

					++var2;
				} while (this.e.length > var2);

			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.BA(" + unused + ')');
		}
	}

	void b (int fileRequestId, int unused) {
		try {
			++int_o;
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.L(" + fileRequestId + ',' + unused + ')');
		}
	}

	final byte[] a (int cacheId, int fileId, byte unused) {
		try {
			++int_u;
			return this.a(0, cacheId, fileId, null);
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.MA(" + cacheId + ',' + fileId + ',' + unused + ')');
		}
	}

	final byte[] a (int unused, int cacheId, int fileId, int[] regionKeys) {
		try {
			++K;
			if (0 <= cacheId && this.e.length > cacheId && this.e[cacheId] != null && fileId >= 0 && fileId < this.e[cacheId].length) {
				if (this.e[cacheId][fileId] == null) {
					boolean flag = this.a(regionKeys, cacheId, (byte) -77);
					if (!flag) {
						this.b(cacheId, -1126799000);
						flag = this.a(regionKeys, cacheId, (byte) -66);
						if (!flag) {
							return null;
						}
					}
				}

				byte[] data = gf.a(this.e[cacheId][fileId], false, (byte) -55);
				if (this.h) {
					this.e[cacheId][fileId] = null;
				}

				return data;
			} else {
				return null;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "pb.O(" + unused + ',' + cacheId + ',' + fileId + ',' + (regionKeys != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int var1, rd var2) {
		try {
			++int_t;
			var2 = var2.l(-34);
			int var3 = this.U.a(-123, var2.g(255));
			if (var1 <= var3) {
				this.a(var3, (byte) 16);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.HA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final byte[] a (byte unused, rd file, rd class_rd) {
		try {
			++z;
			file = file.l(-34);
			class_rd = class_rd.l(-34);
			int index = this.U.a(-57, file.g(255));
			int i = this.E[index].a(-84, class_rd.g(255));
			return this.a(index, i, (byte) 66);
		} catch (RuntimeException var6) {
			throw id.a(var6, "pb.AA(" + unused + ',' + (file != null ? "{...}" : "null") + ',' + (class_rd != null ? "{...}" : "null") + ')');
		}
	}

	final int a (rd fileName, byte unused) {
		try {
			++int_m;
			fileName = fileName.l(-34);
			return this.U.a(-60, fileName.g(255));
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.W(" + (fileName != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final byte[] c (int var1, int var2) {
		try {
			if (var1 != -9464) {
				return null;
			} else {
				++Z;
				if (this.e.length == 1) {
					return this.a(0, -1, var2);
				} else if (this.e[var2].length == 1) {
					return this.a(var2, -1, 0);
				} else {
					throw new RuntimeException();
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.JA(" + var1 + ',' + var2 + ')');
		}
	}

	final int getLengthForIndex (int cacheId, boolean unused) {
		try {
			++int_a;
			return this.e[cacheId].length;
		} catch (RuntimeException var4) {
			throw id.a(var4, "pb.KA(" + cacheId + ',' + unused + ')');
		}
	}

	final void b (byte var1, int var2) {
		try {
			int var3 = 0;
			while (var3 < this.e[var2].length) {
				this.e[var2][var3] = null;
				++var3;
			}

			if (var1 >= -58) {
				this.a(49, 46);
			}

			++Y;
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.N(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean a (int i, byte unused, int fileRequestId) {
		try {
			++ab;
			if (fileRequestId >= 0 && fileRequestId < this.e.length && this.e[fileRequestId] != null && i >= 0 && this.e[fileRequestId].length > i) {
				if (this.e[fileRequestId][i] != null) {
					return true;
				} else if (this.s[fileRequestId] != null) {
					return true;
				} else {
					this.b(fileRequestId, -1126799000);
					return this.s[fileRequestId] != null;
				}
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.Q(" + i + ',' + unused + ',' + fileRequestId + ')');
		}
	}

	private boolean a (int[] regionKeys, int fileRequest, byte unused) {
		int dummy = client.int_tb;

		try {
			++M;
			if (this.s[fileRequest] == null) {
				return false;
			} else {
				int i1 = this.I[fileRequest];
				int[] ints = this.D[fileRequest];
				Object[] objects = this.e[fileRequest];
				boolean flag = true;
				int i2 = 0;
				if (i1 > i2) {
					do {
						if (objects[ints[i2]] == null) {
							flag = false;
							break;
						}

						++i2;
					} while (i1 > i2);
				}

				if (flag) {
					return true;
				} else {
					byte[] data;
					if (regionKeys == null || regionKeys[0] == 0 && regionKeys[1] == 0 && regionKeys[2] == 0 && regionKeys[3] == 0) {
						data = gf.a(this.s[fileRequest], false, (byte) -55);
					} else {
						data = gf.a(this.s[fileRequest], true, (byte) -55);
						id class_id = new id(data);
						class_id.a(regionKeys, class_id.buffer.length, false, 5);//xteaKeys
					}

					byte[] var26;
					try {
						var26 = ee.a(data, false);
					} catch (RuntimeException var24) {
						throw id.a(var24, "T3 - " + (regionKeys != null) + "," + fileRequest + "," + data.length + "," + o
								.a(data.length, (byte) 88, data) + "," + o
								.a(-2 + data.length, (byte) 99, data) + "," + this.y[fileRequest] + "," + this.q);
					}

					if (this.B) {
						this.s[fileRequest] = null;
					}

					if (i1 > 1) {
						int length = var26.length;
						--length;
						int byte_ = var26[length] & 255;
						length -= byte_ * i1 * 4;
						id class_id = new id(var26);
						class_id.pointer = length;
						int[] var15 = new int[i1];
						int var16 = 0;
						int var18;
						if (~var16 > ~byte_) {
							do {
								int var17 = 0;
								var18 = 0;
								if (~i1 >= ~var18) {
									++var16;
								} else {
									do {
										var17 += class_id.readInt((byte) -109);
										var15[var18] += var17;
										++var18;
									} while (~i1 < ~var18);

									++var16;
								}
							} while (~var16 > ~byte_);
						}

						byte[][] var27 = new byte[i1][];
						var18 = 0;
						if (~i1 < ~var18) {
							do {
								var27[var18] = new byte[var15[var18]];
								var15[var18] = 0;
								++var18;
							} while (~i1 < ~var18);
						}

						class_id.pointer = length;
						int var19 = 0;
						int var20 = 0;
						int var21;
						if (dummy != 0 || byte_ > var20) {
							do {
								var21 = 0;
								int var22 = 0;
								if (dummy == 0 && var22 >= i1) {
									++var20;
								} else {
									do {
										var21 += class_id.readInt((byte) -50);
										ef.copyBytes(var26, var19, var27[var22], var15[var22], var21);
										var19 += var21;
										var15[var22] += var21;
										++var22;
									} while (var22 < i1);

									++var20;
								}
							} while (byte_ > var20);
						}

						var21 = 0;
						if (dummy != 0 || ~i1 < ~var21) {
							do {
								objects[ints[var21]] = wa.a(112, var27[var21], false);
								++var21;
							} while (~i1 < ~var21);
						}

						return true;
					}

					objects[ints[0]] = wa.a(103, var26, false);
					return true;
				}
			}
		} catch (RuntimeException var25) {
			throw id.a(var25, "pb.U(" + (regionKeys != null ? "{...}" : "null") + ',' + fileRequest + ',' + unused + ')');
		}
	}

	final byte[] a (int fileRequestId, int unused, int i) {
		try {
			++W;
			if (~fileRequestId <= unused && fileRequestId < this.e.length && this.e[fileRequestId] != null && i >= 0 && this.e[fileRequestId].length > i) {
				if (this.e[fileRequestId][i] == null) {
					boolean flag = this.a((int[]) null, fileRequestId, (byte) -103);
					if (!flag) {
						this.b(fileRequestId, -1126799000);
						flag = this.a((int[]) null, fileRequestId, (byte) 93);
						if (!flag) {
							return null;
						}
					}
				}

				return gf.a(this.e[fileRequestId][i], false, (byte) -55);
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "pb.CA(" + fileRequestId + ',' + unused + ',' + i + ')');
		}
	}

	final boolean b (byte unused, rd spriteName, rd class_rd) {
		try {
			++v;
			spriteName = spriteName.l(-34);
			class_rd = class_rd.l(-34);
			int fileRequestId = this.U.a(-71, spriteName.g(255));
			int i = this.E[fileRequestId].a(-49, class_rd.g(255));
			return this.a(i, (byte) 62, fileRequestId);
		} catch (RuntimeException var6) {
			throw id.a(var6, "pb.P(" + unused + ',' + (spriteName != null ? "{...}" : "null") + ',' + (class_rd != null ? "{...}" : "null") + ')');
		}
	}
}
