final class kc extends ha {
	private static int[] rb = new int[10000];
	private static int sb = 0;
	private static int[] wb = new int[10000];
	private static int[] Wb = new int[128];

	static {
		int var0 = 0;

		int var1;
		for (var1 = 248; var0 < 9 ; Wb[var0++] = 255) {
			;
		}

		while (var0 < 16) {
			Wb[var0++] = var1;
			var1 -= 8;
		}

		while (var0 < 32) {
			Wb[var0++] = var1;
			var1 -= 4;
		}

		while (var0 < 64) {
			Wb[var0++] = var1;
			var1 -= 2;
		}

		while (var0 < 128) {
			Wb[var0++] = var1--;
		}

	}

	short xb;
	short Lb;
	private int[] tb;
	private int[] ub;
	private int vb = 0;
	private int[] yb;
	private int zb;
	private int Ab = 0;
	private int[] Bb;
	private int[] Cb;
	private byte[] Db;
	private int Eb;
	private boolean Fb = false;
	private int Gb;
	private int[] Hb;
	private int[] Ib;
	private int[] Jb;
	private int[] Kb;
	private short[] Mb;
	private byte[] Nb;
	private ab[] Ob;
	private ie[] Pb;
	private int Qb;
	private byte Rb = 0;
	private byte[] Sb;
	private int Tb = 0;
	private ab[] Ub;
	private int[][] Vb;
	private int[][] Xb;
	private int[] Yb;
	private int Zb;
	private int[] ac;
	private byte[] bc;

	private kc () {
	}

	private kc (byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		id var4 = new id(var1);
		id var5 = new id(var1);
		id var6 = new id(var1);
		id var7 = new id(var1);
		id var8 = new id(var1);
		var4.pointer = var1.length - 18;
		int var9 = var4.readUnsignedLEShort(255);
		int var10 = var4.readUnsignedLEShort(255);
		int var11 = var4.readUnsignedByte((byte) 116);
		int var12 = var4.readUnsignedByte((byte) 116);
		int var13 = var4.readUnsignedByte((byte) 116);
		int var14 = var4.readUnsignedByte((byte) 116);
		int var15 = var4.readUnsignedByte((byte) 116);
		int var16 = var4.readUnsignedByte((byte) 116);
		int var17 = var4.readUnsignedLEShort(255);
		int var18 = var4.readUnsignedLEShort(255);
		int var19 = var4.readUnsignedLEShort(255);
		int var20 = var4.readUnsignedLEShort(255);
		byte var21 = 0;
		int var47 = var21 + var9;
		int var23 = var47;
		var47 += var10;
		int var24 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var25 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var26 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var27 = var47;
		if (var16 == 1) {
			var47 += var9;
		}

		int var28 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var20;
		int var30 = var47;
		var47 += var10 * 2;
		int var31 = var47;
		var47 += var11 * 6;
		int var32 = var47;
		var47 += var17;
		int var33 = var47;
		var47 += var18;
		int var10000 = var47 + var19;
		this.vb = var9;
		this.Ab = var10;
		this.Tb = var11;
		this.Jb = new int[var9];
		this.Kb = new int[var9];
		this.Yb = new int[var9];
		this.Bb = new int[var10];
		this.ub = new int[var10];
		this.Ib = new int[var10];
		if (var11 > 0) {
			this.Cb = new int[var11];
			this.yb = new int[var11];
			this.Hb = new int[var11];
		}

		if (var16 == 1) {
			this.ac = new int[var9];
		}

		if (var12 == 1) {
			this.Db = new byte[var10];
			this.bc = new byte[var10];
		}

		if (var13 == 255) {
			this.Sb = new byte[var10];
		} else {
			this.Rb = (byte) var13;
		}

		if (var14 == 1) {
			this.Nb = new byte[var10];
		}

		if (var15 == 1) {
			this.tb = new int[var10];
		}

		this.Mb = new short[var10];
		var4.pointer = var21;
		var5.pointer = var32;
		var6.pointer = var33;
		var7.pointer = var47;
		var8.pointer = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var39;
		int var40;
		int var41;
		int var42;
		for (int var38 = 0 ; var38 < var9 ; ++var38) {
			var39 = var4.readUnsignedByte((byte) 116);
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.readSmartA(false);
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.readSmartA(false);
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.readSmartA(false);
			}

			this.Jb[var38] = var35 + var40;
			this.Kb[var38] = var36 + var41;
			this.Yb[var38] = var37 + var42;
			var35 = this.Jb[var38];
			var36 = this.Kb[var38];
			var37 = this.Yb[var38];
			if (var16 == 1) {
				this.ac[var38] = var8.readUnsignedByte((byte) 116);
			}
		}

		var4.pointer = var30;
		var5.pointer = var26;
		var6.pointer = var24;
		var7.pointer = var28;
		var8.pointer = var25;

		for (var39 = 0; var39 < var10 ; ++var39) {
			this.Mb[var39] = (short) var4.readUnsignedLEShort(255);
			if (var12 == 1) {
				var40 = var5.readUnsignedByte((byte) 116);
				if ((var40 & 1) == 1) {
					this.Db[var39] = 1;
					var3 = true;
				} else {
					this.Db[var39] = 0;
				}

				if ((var40 & 2) == 2) {
					this.bc[var39] = (byte) (var40 >> 2);
					var2 = true;
				} else {
					this.bc[var39] = -1;
				}
			}

			if (var13 == 255) {
				this.Sb[var39] = var6.readByte(true);
			}

			if (var14 == 1) {
				this.Nb[var39] = var7.readByte(true);
			}

			if (var15 == 1) {
				this.tb[var39] = var8.readUnsignedByte((byte) 116);
			}
		}

		var4.pointer = var29;
		var5.pointer = var23;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		int var43 = 0;

		int var45;
		for (int var44 = 0 ; var44 < var10 ; ++var44) {
			var45 = var5.readUnsignedByte((byte) 116);
			if (var45 == 1) {
				var40 = var4.readSmartA(false) + var43;
				var41 = var4.readSmartA(false) + var40;
				var42 = var4.readSmartA(false) + var41;
				var43 = var42;
				this.Bb[var44] = var40;
				this.ub[var44] = var41;
				this.Ib[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.readSmartA(false) + var43;
				var43 = var42;
				this.Bb[var44] = var40;
				this.ub[var44] = var41;
				this.Ib[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.readSmartA(false) + var43;
				var43 = var42;
				this.Bb[var44] = var40;
				this.ub[var44] = var41;
				this.Ib[var44] = var42;
			}

			if (var45 == 4) {
				int var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.readSmartA(false) + var43;
				var43 = var42;
				this.Bb[var44] = var40;
				this.ub[var44] = var46;
				this.Ib[var44] = var42;
			}
		}

		var4.pointer = var31;

		for (var45 = 0; var45 < var11 ; ++var45) {
			this.Cb[var45] = var4.readUnsignedLEShort(255);
			this.yb[var45] = var4.readUnsignedLEShort(255);
			this.Hb[var45] = var4.readUnsignedLEShort(255);
		}

		if (!var2) {
			this.bc = null;
		}

		if (!var3) {
			this.Db = null;
		}

	}

	kc (kc[] var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.vb = 0;
		this.Ab = 0;
		this.Tb = 0;
		this.Rb = -1;

		for (int var8 = 0 ; var8 < var2 ; ++var8) {
			kc var9 = var1[var8];
			if (var9 != null) {
				this.vb += var9.vb;
				this.Ab += var9.Ab;
				this.Tb += var9.Tb;
				if (var9.Sb != null) {
					var4 = true;
				} else {
					if (this.Rb == -1) {
						this.Rb = var9.Rb;
					}

					if (this.Rb != var9.Rb) {
						var4 = true;
					}
				}

				var3 |= var9.Db != null;
				var5 |= var9.Nb != null;
				var6 |= var9.tb != null;
				var7 |= var9.bc != null;
			}
		}

		this.Jb = new int[this.vb];
		this.Kb = new int[this.vb];
		this.Yb = new int[this.vb];
		this.ac = new int[this.vb];
		this.Bb = new int[this.Ab];
		this.ub = new int[this.Ab];
		this.Ib = new int[this.Ab];
		if (this.Tb > 0) {
			this.Cb = new int[this.Tb];
			this.yb = new int[this.Tb];
			this.Hb = new int[this.Tb];
		}

		if (var3) {
			this.Db = new byte[this.Ab];
		}

		if (var4) {
			this.Sb = new byte[this.Ab];
		}

		if (var5) {
			this.Nb = new byte[this.Ab];
		}

		if (var7) {
			this.bc = new byte[this.Ab];
		}

		if (var6) {
			this.tb = new int[this.Ab];
		}

		this.Mb = new short[this.Ab];
		this.vb = 0;
		this.Ab = 0;
		this.Tb = 0;
		int var14 = 0;

		for (int var10 = 0 ; var10 < var2 ; ++var10) {
			kc var11 = var1[var10];
			if (var11 != null) {
				for (int var12 = 0 ; var12 < var11.Ab ; ++var12) {
					if (var3 && var11.Db != null) {
						this.Db[this.Ab] = var11.Db[var12];
					}

					if (var4) {
						if (var11.Sb != null) {
							this.Sb[this.Ab] = var11.Sb[var12];
						} else {
							this.Sb[this.Ab] = var11.Rb;
						}
					}

					if (var5 && var11.Nb != null) {
						this.Nb[this.Ab] = var11.Nb[var12];
					}

					if (var7) {
						if (var11.bc != null && var11.bc[var12] != -1) {
							this.bc[this.Ab] = (byte) (var11.bc[var12] + var14);
						} else {
							this.bc[this.Ab] = -1;
						}
					}

					if (var6 && var11.tb != null) {
						this.tb[this.Ab] = var11.tb[var12];
					}

					this.Mb[this.Ab] = var11.Mb[var12];
					this.Bb[this.Ab] = this.a(var11, var11.Bb[var12]);
					this.ub[this.Ab] = this.a(var11, var11.ub[var12]);
					this.Ib[this.Ab] = this.a(var11, var11.Ib[var12]);
					++this.Ab;
				}

				for (int var13 = 0 ; var13 < var11.Tb ; ++var13) {
					this.Cb[this.Tb] = this.a(var11, var11.Cb[var13]);
					this.yb[this.Tb] = this.a(var11, var11.yb[var13]);
					this.Hb[this.Tb] = this.a(var11, var11.Hb[var13]);
					++this.Tb;
				}

				var14 += var11.Tb;
			}
		}

	}

	kc (kc var1, boolean var2, boolean var3, boolean var4) {
		this.vb = var1.vb;
		this.Ab = var1.Ab;
		this.Tb = var1.Tb;
		int var5;
		if (var2) {
			this.Jb = var1.Jb;
			this.Kb = var1.Kb;
			this.Yb = var1.Yb;
		} else {
			this.Jb = new int[this.vb];
			this.Kb = new int[this.vb];
			this.Yb = new int[this.vb];

			for (var5 = 0; var5 < this.vb ; ++var5) {
				this.Jb[var5] = var1.Jb[var5];
				this.Kb[var5] = var1.Kb[var5];
				this.Yb[var5] = var1.Yb[var5];
			}
		}

		if (var3) {
			this.Mb = var1.Mb;
		} else {
			this.Mb = new short[this.Ab];

			for (var5 = 0; var5 < this.Ab ; ++var5) {
				this.Mb[var5] = var1.Mb[var5];
			}
		}

		if (var4) {
			this.Nb = var1.Nb;
		} else {
			this.Nb = new byte[this.Ab];
			if (var1.Nb == null) {
				for (var5 = 0; var5 < this.Ab ; ++var5) {
					this.Nb[var5] = 0;
				}
			} else {
				for (var5 = 0; var5 < this.Ab ; ++var5) {
					this.Nb[var5] = var1.Nb[var5];
				}
			}
		}

		this.Bb = var1.Bb;
		this.ub = var1.ub;
		this.Ib = var1.Ib;
		this.Db = var1.Db;
		this.Sb = var1.Sb;
		this.bc = var1.bc;
		this.Rb = var1.Rb;
		this.Cb = var1.Cb;
		this.yb = var1.yb;
		this.Hb = var1.Hb;
		this.ac = var1.ac;
		this.tb = var1.tb;
		this.Vb = var1.Vb;
		this.Xb = var1.Xb;
		this.Ob = var1.Ob;
		this.Pb = var1.Pb;
		this.Ub = var1.Ub;
		this.Lb = var1.Lb;
		this.xb = var1.xb;
	}

	private static int a (int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	private static int f (int var0) {
		if (var0 < 0) {
			var0 = 0;
		} else if (var0 > 127) {
			var0 = 127;
		}

		var0 = Wb[var0];
		return var0;
	}

	public static void c () {
		rb = null;
		wb = null;
		Wb = null;
	}

	static void a (kc var0, kc var1, int var2, int var3, int var4, boolean var5) {
		var0.i();
		var0.g();
		var1.i();
		var1.g();
		++sb;
		int var6 = 0;
		int[] var7 = var1.Jb;
		int var8 = var1.vb;

		int var11;
		for (int var9 = 0 ; var9 < var0.vb ; ++var9) {
			ab var10 = var0.Ob[var9];
			if (var10.int_h != 0) {
				var11 = var0.Kb[var9] - var3;
				if (var11 <= var1.Zb) {
					int var12 = var0.Jb[var9] - var2;
					if (var12 >= var1.Qb && var12 <= var1.Gb) {
						int var13 = var0.Yb[var9] - var4;
						if (var13 >= var1.zb && var13 <= var1.Eb) {
							for (int var14 = 0 ; var14 < var8 ; ++var14) {
								ab var15 = var1.Ob[var14];
								if (var12 == var7[var14] && var13 == var1.Yb[var14] && var11 == var1.Kb[var14] && var15.int_h != 0) {
									if (var0.Ub == null) {
										var0.Ub = new ab[var0.vb];
									}

									if (var1.Ub == null) {
										var1.Ub = new ab[var8];
									}

									ab var16 = var0.Ub[var9];
									if (var16 == null) {
										var16 = var0.Ub[var9] = new ab(var10);
									}

									ab var17 = var1.Ub[var14];
									if (var17 == null) {
										var17 = var1.Ub[var14] = new ab(var15);
									}

									var16.int_g += var15.int_g;
									var16.int_s += var15.int_s;
									var16.int_i += var15.int_i;
									var16.int_h += var15.int_h;
									var17.int_g += var10.int_g;
									var17.int_s += var10.int_s;
									var17.int_i += var10.int_i;
									var17.int_h += var10.int_h;
									++var6;
									rb[var9] = sb;
									wb[var14] = sb;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (int var18 = 0 ; var18 < var0.Ab ; ++var18) {
				if (rb[var0.Bb[var18]] == sb && rb[var0.ub[var18]] == sb && rb[var0.Ib[var18]] == sb) {
					if (var0.Db == null) {
						var0.Db = new byte[var0.Ab];
					}

					var0.Db[var18] = 2;
				}
			}

			for (var11 = 0; var11 < var1.Ab ; ++var11) {
				if (wb[var1.Bb[var11]] == sb && wb[var1.ub[var11]] == sb && wb[var1.Ib[var11]] == sb) {
					if (var1.Db == null) {
						var1.Db = new byte[var1.Ab];
					}

					var1.Db[var11] = 2;
				}
			}

		}
	}

	static kc a (pb var0, int var1, int var2) {
		byte[] var3 = var0.a(var1, var2, (byte) 66);
		return var3 == null ? null : new kc(var3);
	}

	private void a () {
		this.Ob = null;
		this.Ub = null;
		this.Pb = null;
		this.Fb = false;
	}

	final void b () {
		for (int var1 = 0 ; var1 < this.vb ; ++var1) {
			int var2 = this.Jb[var1];
			this.Jb[var1] = this.Yb[var1];
			this.Yb[var1] = -var2;
		}

		this.a();
	}

	final kc d () {
		kc var1 = new kc();
		if (this.Db != null) {
			var1.Db = new byte[this.Ab];

			System.arraycopy(this.Db, 0, var1.Db, 0, this.Ab);
		}

		var1.vb = this.vb;
		var1.Ab = this.Ab;
		var1.Tb = this.Tb;
		var1.Jb = this.Jb;
		var1.Kb = this.Kb;
		var1.Yb = this.Yb;
		var1.Bb = this.Bb;
		var1.ub = this.ub;
		var1.Ib = this.Ib;
		var1.Sb = this.Sb;
		var1.Nb = this.Nb;
		var1.bc = this.bc;
		var1.Mb = this.Mb;
		var1.Rb = this.Rb;
		var1.Cb = this.Cb;
		var1.yb = this.yb;
		var1.Hb = this.Hb;
		var1.ac = this.ac;
		var1.tb = this.tb;
		var1.Vb = this.Vb;
		var1.Xb = this.Xb;
		var1.Ob = this.Ob;
		var1.Pb = this.Pb;
		var1.Lb = this.Lb;
		var1.xb = this.xb;
		return var1;
	}

	final ue a (int var1, int var2, int var3, int var4, int var5) {
		this.g();
		int var6 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		ue var8 = new ue();
		var8.Gb = new int[this.Ab];
		var8.Rb = new int[this.Ab];
		var8.Eb = new int[this.Ab];

		for (int var9 = 0 ; var9 < this.Ab ; ++var9) {
			byte var10;
			if (this.Db == null) {
				var10 = 0;
			} else {
				var10 = this.Db[var9];
			}

			ab var11;
			int var12;
			ie var14;
			if (this.bc != null && this.bc[var9] != -1) {
				if (var10 == 0) {
					if (this.Ub != null && this.Ub[this.Bb[var9]] != null) {
						var11 = this.Ub[this.Bb[var9]];
					} else {
						var11 = this.Ob[this.Bb[var9]];
					}

					var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
					var8.Gb[var9] = f(var12);
					if (this.Ub != null && this.Ub[this.ub[var9]] != null) {
						var11 = this.Ub[this.ub[var9]];
					} else {
						var11 = this.Ob[this.ub[var9]];
					}

					var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
					var8.Rb[var9] = f(var12);
					if (this.Ub != null && this.Ub[this.Ib[var9]] != null) {
						var11 = this.Ub[this.Ib[var9]];
					} else {
						var11 = this.Ob[this.Ib[var9]];
					}

					var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
					var8.Eb[var9] = f(var12);
				} else if (var10 == 1) {
					var14 = this.Pb[var9];
					var12 = var1 + (var3 * var14.g + var4 * var14.j + var5 * var14.d) / (var7 + var7 / 2);
					var8.Gb[var9] = f(var12);
					var8.Eb[var9] = -1;
				} else {
					var8.Eb[var9] = -2;
				}
			} else if (var10 == 0) {
				int var13 = this.Mb[var9];
				if (this.Ub != null && this.Ub[this.Bb[var9]] != null) {
					var11 = this.Ub[this.Bb[var9]];
				} else {
					var11 = this.Ob[this.Bb[var9]];
				}

				var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
				var8.Gb[var9] = a(var13, var12);
				if (this.Ub != null && this.Ub[this.ub[var9]] != null) {
					var11 = this.Ub[this.ub[var9]];
				} else {
					var11 = this.Ob[this.ub[var9]];
				}

				var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
				var8.Rb[var9] = a(var13, var12);
				if (this.Ub != null && this.Ub[this.Ib[var9]] != null) {
					var11 = this.Ub[this.Ib[var9]];
				} else {
					var11 = this.Ob[this.Ib[var9]];
				}

				var12 = var1 + (var3 * var11.int_g + var4 * var11.int_s + var5 * var11.int_i) / (var7 * var11.int_h);
				var8.Eb[var9] = a(var13, var12);
			} else if (var10 == 1) {
				var14 = this.Pb[var9];
				var12 = var1 + (var3 * var14.g + var4 * var14.j + var5 * var14.d) / (var7 + var7 / 2);
				var8.Gb[var9] = a(this.Mb[var9], var12);
				var8.Eb[var9] = -1;
			} else {
				var8.Eb[var9] = -2;
			}
		}

		this.e();
		var8.Kb = this.vb;
		var8.Ob = this.Jb;
		var8.zb = this.Kb;
		var8.Lb = this.Yb;
		var8.yb = this.Ab;
		var8.Jb = this.Bb;
		var8.tb = this.ub;
		var8.vb = this.Ib;
		var8.Ab = this.Sb;
		var8.Pb = this.Nb;
		var8.dc = this.bc;
		if (var8.dc != null) {
			var8.ub = this.Mb;
		} else {
			var8.ub = null;
		}

		var8.xb = this.Rb;
		var8.wb = this.Tb;
		var8.Mb = this.Cb;
		var8.Hb = this.yb;
		var8.kc = this.Hb;
		var8.rb = this.Vb;
		var8.wc = this.Xb;
		return var8;
	}

	private void e () {
		int[] var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (this.ac != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.vb ; ++var3) {
				var4 = this.ac[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.Vb = new int[var2 + 1][];

			for (var4 = 0; var4 <= var2 ; ++var4) {
				this.Vb[var4] = new int[var1[var4]];
				var1[var4] = 0;
			}

			for (var5 = 0; var5 < this.vb ; this.Vb[var6][var1[var6]++] = var5++) {
				var6 = this.ac[var5];
			}

			this.ac = null;
		}

		if (this.tb != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.Ab ; ++var3) {
				var4 = this.tb[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.Xb = new int[var2 + 1][];

			for (var4 = 0; var4 <= var2 ; ++var4) {
				this.Xb[var4] = new int[var1[var4]];
				var1[var4] = 0;
			}

			for (var5 = 0; var5 < this.Ab ; this.Xb[var6][var1[var6]++] = var5++) {
				var6 = this.tb[var5];
			}

			this.tb = null;
		}

	}

	final void f () {
		for (int var1 = 0 ; var1 < this.vb ; ++var1) {
			this.Jb[var1] = -this.Jb[var1];
			this.Yb[var1] = -this.Yb[var1];
		}

		this.a();
	}

	final void g () {
		if (this.Ob == null) {
			this.Ob = new ab[this.vb];

			for (int var1 = 0 ; var1 < this.vb ; ++var1) {
				this.Ob[var1] = new ab();
			}

			for (int var2 = 0 ; var2 < this.Ab ; ++var2) {
				int var3 = this.Bb[var2];
				int var4 = this.ub[var2];
				int var5 = this.Ib[var2];
				int var6 = this.Jb[var4] - this.Jb[var3];
				int var7 = this.Kb[var4] - this.Kb[var3];
				int var8 = this.Yb[var4] - this.Yb[var3];
				int var9 = this.Jb[var5] - this.Jb[var3];
				int var10 = this.Kb[var5] - this.Kb[var3];
				int var11 = this.Yb[var5] - this.Yb[var3];
				int var12 = var7 * var11 - var10 * var8;
				int var13 = var8 * var9 - var11 * var6;

				int var14;
				for (var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192 ; var14 >>= 1) {
					var12 >>= 1;
					var13 >>= 1;
				}

				int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
				if (var15 <= 0) {
					var15 = 1;
				}

				var12 = var12 * 256 / var15;
				var13 = var13 * 256 / var15;
				var14 = var14 * 256 / var15;
				byte var16;
				if (this.Db == null) {
					var16 = 0;
				} else {
					var16 = this.Db[var2];
				}

				if (var16 == 0) {
					ab var17 = this.Ob[var3];
					var17.int_g += var12;
					var17.int_s += var13;
					var17.int_i += var14;
					++var17.int_h;
					var17 = this.Ob[var4];
					var17.int_g += var12;
					var17.int_s += var13;
					var17.int_i += var14;
					++var17.int_h;
					var17 = this.Ob[var5];
					var17.int_g += var12;
					var17.int_s += var13;
					var17.int_i += var14;
					++var17.int_h;
				} else if (var16 == 1) {
					if (this.Pb == null) {
						this.Pb = new ie[this.Ab];
					}

					ie var18 = this.Pb[var2] = new ie();
					var18.g = var12;
					var18.j = var13;
					var18.d = var14;
				}
			}

		}
	}

	final void h () {
		for (int var1 = 0 ; var1 < this.vb ; ++var1) {
			this.Yb[var1] = -this.Yb[var1];
		}

		for (int var2 = 0 ; var2 < this.Ab ; ++var2) {
			int var3 = this.Bb[var2];
			this.Bb[var2] = this.Ib[var2];
			this.Ib[var2] = var3;
		}

		this.a();
	}

	final void a (int var1, int var2, int var3) {
		for (int var4 = 0 ; var4 < this.vb ; ++var4) {
			this.Jb[var4] = this.Jb[var4] * var1 / 128;
			this.Kb[var4] = this.Kb[var4] * var2 / 128;
			this.Yb[var4] = this.Yb[var4] * var3 / 128;
		}

		this.a();
	}

	final void b (int var1, int var2, int var3) {
		for (int var4 = 0 ; var4 < this.vb ; ++var4) {
			this.Jb[var4] += var1;
			this.Kb[var4] += var2;
			this.Yb[var4] += var3;
		}

		this.a();
	}

	private void i () {
		if (!this.Fb) {
			super.int_qb = 0;
			this.Zb = 0;
			this.Qb = 999999;
			this.Gb = -999999;
			this.Eb = -99999;
			this.zb = 99999;

			for (int var1 = 0 ; var1 < this.vb ; ++var1) {
				int var2 = this.Jb[var1];
				int var3 = this.Kb[var1];
				int var4 = this.Yb[var1];
				if (var2 < this.Qb) {
					this.Qb = var2;
				}

				if (var2 > this.Gb) {
					this.Gb = var2;
				}

				if (var4 < this.zb) {
					this.zb = var4;
				}

				if (var4 > this.Eb) {
					this.Eb = var4;
				}

				if (-var3 > super.int_qb) {
					super.int_qb = -var3;
				}

				if (var3 > this.Zb) {
					this.Zb = var3;
				}
			}

			this.Fb = true;
		}
	}

	final kc a (int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == var2 && var1 == var3 && var1 == var4) {
			return this;
		} else {
			kc var6;
			if (var5) {
				var6 = new kc();
				var6.vb = this.vb;
				var6.Ab = this.Ab;
				var6.Tb = this.Tb;
				var6.Jb = this.Jb;
				var6.Yb = this.Yb;
				var6.Bb = this.Bb;
				var6.ub = this.ub;
				var6.Ib = this.Ib;
				var6.Db = this.Db;
				var6.Sb = this.Sb;
				var6.Nb = this.Nb;
				var6.bc = this.bc;
				var6.Mb = this.Mb;
				var6.Rb = this.Rb;
				var6.Cb = this.Cb;
				var6.yb = this.yb;
				var6.Hb = this.Hb;
				var6.ac = this.ac;
				var6.tb = this.tb;
				var6.Vb = this.Vb;
				var6.Xb = this.Xb;
				var6.Lb = this.Lb;
				var6.xb = this.xb;
				var6.Kb = new int[var6.vb];
			} else {
				var6 = this;
			}

			int var7 = (var1 + var2 + var3 + var4) / 4;

			for (int var8 = 0 ; var8 < var6.vb ; ++var8) {
				int var9 = this.Jb[var8];
				int var10 = this.Kb[var8];
				int var11 = this.Yb[var8];
				int var12 = var1 + (var2 - var1) * (var9 + 64) / 128;
				int var13 = var4 + (var3 - var4) * (var9 + 64) / 128;
				int var14 = var12 + (var13 - var12) * (var11 + 64) / 128;
				var6.Kb[var8] = var10 + var14 - var7;
			}

			var6.a();
			return var6;
		}
	}

	final void a (short var1, short var2) {
		for (int var3 = 0 ; var3 < this.Ab ; ++var3) {
			if (this.Mb[var3] == var1) {
				this.Mb[var3] = var2;
			}
		}

	}

	final void j () {
		for (int var1 = 0 ; var1 < this.vb ; ++var1) {
			int var2 = this.Yb[var1];
			this.Yb[var1] = this.Jb[var1];
			this.Jb[var1] = -var2;
		}

		this.a();
	}

	private int a (kc var1, int var2) {
		int var3 = -1;
		int var4 = var1.Jb[var2];
		int var5 = var1.Kb[var2];
		int var6 = var1.Yb[var2];

		for (int var7 = 0 ; var7 < this.vb ; ++var7) {
			if (var4 == this.Jb[var7] && var5 == this.Kb[var7] && var6 == this.Yb[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.Jb[this.vb] = var4;
			this.Kb[this.vb] = var5;
			this.Yb[this.vb] = var6;
			if (var1.ac != null) {
				this.ac[this.vb] = var1.ac[var2];
			}

			var3 = this.vb++;
		}

		return var3;
	}
}
