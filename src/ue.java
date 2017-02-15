final class ue extends ha {
	static int Vb = 0;
	static int hc;
	static int[] ic = new int[1000];
	static int yc;
	static boolean Ac;
	private static ue Fb = new ue();
	private static byte[] Nb = new byte[1];
	private static ue Qb = new ue();
	private static int[] Tb;
	private static int Ub;
	private static int[] Wb = new int[4096];
	private static int[] Xb = new int[4096];
	private static int[] Yb = new int[12];
	private static boolean[] Zb;
	private static int ac;
	private static int[] bc = new int[2000];
	private static int[][] cc = new int[12][2000];
	private static int[] ec = new int[2000];
	private static int[] fc;
	private static int[] gc;
	private static int[] jc;
	private static int[] lc;
	private static int[] mc;
	private static int[] nc;
	private static int[][] oc;
	private static byte[] pc;
	private static int[] qc;
	private static int[] rc;
	private static int[] sc;
	private static boolean[] tc;
	private static int[] uc;
	private static int[] vc;
	private static int[] xc;
	private static int zc;

	static {
		lc = v.jb;
		Tb = new int[10];
		Zb = new boolean[4096];
		mc = new int[4096];
		pc = new byte[1];
		qc = v.wb;
		oc = new int[1600][512];
		rc = new int[10];
		gc = new int[10];
		tc = new boolean[4096];
		hc = 0;
		sc = new int[4096];
		uc = v.pb;
		jc = new int[12];
		fc = new int[4096];
		nc = v.hb;
		vc = new int[4096];
		xc = new int[1600];
		yc = 0;
		Ac = false;
	}

	int[][] rb;
	int[] tb;
	short[] ub;
	int[] vb;
	int wb = 0;
	byte xb = 0;
	int yb = 0;
	int[] zb;
	byte[] Ab;
	boolean Db = false;
	int[] Eb;
	int[] Gb;
	int[] Hb;
	int[] Jb;
	int Kb = 0;
	int[] Lb;
	int[] Mb;
	int[] Ob;
	byte[] Pb;
	int[] Rb;
	byte[] dc;
	int[] kc;
	int[][] wc;
	private int sb;
	private int Bb;
	private int Cb;
	private int Ib;
	private int Sb;

	ue () {
	}

	ue (ue[] var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		this.Kb = 0;
		this.yb = 0;
		this.wb = 0;
		this.xb = -1;

		for (int var6 = 0 ; var6 < var2 ; ++var6) {
			ue var7 = var1[var6];
			if (var7 != null) {
				this.Kb += var7.Kb;
				this.yb += var7.yb;
				this.wb += var7.wb;
				if (var7.Ab != null) {
					var3 = true;
				} else {
					if (this.xb == -1) {
						this.xb = var7.xb;
					}

					if (this.xb != var7.xb) {
						var3 = true;
					}
				}

				var4 |= var7.Pb != null;
				var5 |= var7.dc != null;
			}
		}

		this.Ob = new int[this.Kb];
		this.zb = new int[this.Kb];
		this.Lb = new int[this.Kb];
		this.Jb = new int[this.yb];
		this.tb = new int[this.yb];
		this.vb = new int[this.yb];
		this.Gb = new int[this.yb];
		this.Rb = new int[this.yb];
		this.Eb = new int[this.yb];
		if (this.wb > 0) {
			this.Mb = new int[this.wb];
			this.Hb = new int[this.wb];
			this.kc = new int[this.wb];
		}

		if (var3) {
			this.Ab = new byte[this.yb];
		}

		if (var4) {
			this.Pb = new byte[this.yb];
		}

		if (var5) {
			this.dc = new byte[this.yb];
			this.ub = new short[this.yb];
		}

		this.Kb = 0;
		this.yb = 0;
		this.wb = 0;
		int var14 = 0;

		for (int var8 = 0 ; var8 < var2 ; ++var8) {
			ue var9 = var1[var8];
			if (var9 != null) {
				int var10 = this.Kb;

				for (int var11 = 0 ; var11 < var9.Kb ; ++var11) {
					this.Ob[this.Kb] = var9.Ob[var11];
					this.zb[this.Kb] = var9.zb[var11];
					this.Lb[this.Kb] = var9.Lb[var11];
					++this.Kb;
				}

				for (int var12 = 0 ; var12 < var9.yb ; ++var12) {
					this.Jb[this.yb] = var9.Jb[var12] + var10;
					this.tb[this.yb] = var9.tb[var12] + var10;
					this.vb[this.yb] = var9.vb[var12] + var10;
					this.Gb[this.yb] = var9.Gb[var12];
					this.Rb[this.yb] = var9.Rb[var12];
					this.Eb[this.yb] = var9.Eb[var12];
					if (var3) {
						if (var9.Ab == null) {
							this.Ab[this.yb] = var9.xb;
						} else {
							this.Ab[this.yb] = var9.Ab[var12];
						}
					}

					if (var4) {
						if (var9.Pb == null) {
							this.Pb[this.yb] = 0;
						} else {
							this.Pb[this.yb] = var9.Pb[var12];
						}
					}

					if (var5) {
						if (var9.dc != null && var9.dc[var12] != -1) {
							this.dc[this.yb] = (byte) (var9.dc[var12] + var14);
							this.ub[this.yb] = var9.ub[var12];
						} else {
							this.dc[this.yb] = -1;
						}
					}

					++this.yb;
				}

				for (int var13 = 0 ; var13 < var9.wb ; ++var13) {
					this.Mb[this.wb] = var9.Mb[var13] + var10;
					this.Hb[this.wb] = var9.Hb[var13] + var10;
					this.kc[this.wb] = var9.kc[var13] + var10;
					++this.wb;
				}

				var14 += var9.wb;
			}
		}

	}

	public static void e () {
		Fb = null;
		Nb = null;
		Qb = null;
		pc = null;
		Zb = null;
		tc = null;
		vc = null;
		sc = null;
		fc = null;
		Wb = null;
		mc = null;
		Xb = null;
		xc = null;
		oc = null;
		jc = null;
		cc = null;
		ec = null;
		bc = null;
		Yb = null;
		Tb = null;
		gc = null;
		rc = null;
		ic = null;
		uc = null;
		qc = null;
		nc = null;
		lc = null;
	}

	private void f (int var1) {
		int var2 = v.kb;
		int var3 = v.zb;
		int var4 = 0;
		int var5 = this.Jb[var1];
		int var6 = this.tb[var1];
		int var7 = this.vb[var1];
		int var8 = Xb[var5];
		int var9 = Xb[var6];
		int var10 = Xb[var7];
		if (this.Pb == null) {
			v.lb = 0;
		} else {
			v.lb = this.Pb[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			Tb[var4] = vc[var5];
			gc[var4] = sc[var5];
			rc[var4++] = this.Gb[var1];
		} else {
			var11 = Wb[var5];
			var12 = mc[var5];
			var13 = this.Gb[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * lc[var10 - var8];
				Tb[var4] = var2 + (var11 + ((Wb[var7] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var7] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Eb[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * lc[var9 - var8];
				Tb[var4] = var2 + (var11 + ((Wb[var6] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var6] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Rb[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			Tb[var4] = vc[var6];
			gc[var4] = sc[var6];
			rc[var4++] = this.Rb[var1];
		} else {
			var11 = Wb[var6];
			var12 = mc[var6];
			var13 = this.Rb[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * lc[var8 - var9];
				Tb[var4] = var2 + (var11 + ((Wb[var5] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var5] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Gb[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * lc[var10 - var9];
				Tb[var4] = var2 + (var11 + ((Wb[var7] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var7] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Eb[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			Tb[var4] = vc[var7];
			gc[var4] = sc[var7];
			rc[var4++] = this.Eb[var1];
		} else {
			var11 = Wb[var7];
			var12 = mc[var7];
			var13 = this.Eb[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * lc[var9 - var10];
				Tb[var4] = var2 + (var11 + ((Wb[var6] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var6] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Rb[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * lc[var8 - var10];
				Tb[var4] = var2 + (var11 + ((Wb[var5] - var11) * var14 >> 16) << 9) / 50;
				gc[var4] = var3 + (var12 + ((mc[var5] - var12) * var14 >> 16) << 9) / 50;
				rc[var4++] = var13 + ((this.Gb[var1] - var13) * var14 >> 16);
			}
		}

		var11 = Tb[0];
		var12 = Tb[1];
		var13 = Tb[2];
		var14 = gc[0];
		int var15 = gc[1];
		int var16 = gc[2];
		v.gb = false;
		int var17;
		int var18;
		int var19;
		int var20;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > v.vb || var12 > v.vb || var13 > v.vb) {
				v.gb = true;
			}

			if (this.dc != null && this.dc[var1] != -1) {
				var17 = this.dc[var1] & 255;
				var18 = this.Mb[var17];
				var19 = this.Hb[var17];
				var20 = this.kc[var17];
				if (this.Eb[var1] == -1) {
					v.a(var14, var15, var16, var11, var12, var13, this.Gb[var1], this.Gb[var1], this.Gb[var1], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], this.ub[var1]);
				} else {
					v.a(var14, var15, var16, var11, var12, var13, rc[0], rc[1], rc[2], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], this.ub[var1]);
				}
			} else if (this.Eb[var1] == -1) {
				v.a(var14, var15, var16, var11, var12, var13, nc[this.Gb[var1]]);
			} else {
				v.a(var14, var15, var16, var11, var12, var13, rc[0], rc[1], rc[2]);
			}
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > v.vb || var12 > v.vb || var13 > v.vb || Tb[3] < 0 || Tb[3] > v.vb) {
				v.gb = true;
			}

			if (this.dc == null || this.dc[var1] == -1) {
				if (this.Eb[var1] == -1) {
					var17 = nc[this.Gb[var1]];
					v.a(var14, var15, var16, var11, var12, var13, var17);
					v.a(var14, var16, gc[3], var11, var13, Tb[3], var17);
					return;
				}

				v.a(var14, var15, var16, var11, var12, var13, rc[0], rc[1], rc[2]);
				v.a(var14, var16, gc[3], var11, var13, Tb[3], rc[0], rc[2], rc[3]);
				return;
			}

			var17 = this.dc[var1] & 255;
			var18 = this.Mb[var17];
			var19 = this.Hb[var17];
			var20 = this.kc[var17];
			short var21 = this.ub[var1];
			if (this.Eb[var1] == -1) {
				v.a(var14, var15, var16, var11, var12, var13, this.Gb[var1], this.Gb[var1], this.Gb[var1], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], var21);
				v.a(var14, var16, gc[3], var11, var13, Tb[3], this.Gb[var1], this.Gb[var1], this.Gb[var1], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], var21);
				return;
			}

			v.a(var14, var15, var16, var11, var12, var13, rc[0], rc[1], rc[2], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], var21);
			v.a(var14, var16, gc[3], var11, var13, Tb[3], rc[0], rc[2], rc[3], Wb[var18], Wb[var19], Wb[var20], mc[var18], mc[var19], mc[var20], Xb[var18], Xb[var19], Xb[var20], var21);
		}

	}

	final void a (int var1, int var2, int var3) {
		for (int var4 = 0 ; var4 < this.Kb ; ++var4) {
			this.Ob[var4] = this.Ob[var4] * var1 / 128;
			this.zb[var4] = this.zb[var4] * var2 / 128;
			this.Lb[var4] = this.Lb[var4] * var3 / 128;
		}

		this.Ib = 0;
	}

	final void a () {
		for (int var1 = 0 ; var1 < this.Kb ; ++var1) {
			this.Ob[var1] = -this.Ob[var1];
			this.Lb[var1] = -this.Lb[var1];
		}

		this.Ib = 0;
	}

	final void b () {
		for (int var1 = 0 ; var1 < this.Kb ; ++var1) {
			int var2 = this.Ob[var1];
			this.Ob[var1] = this.Lb[var1];
			this.Lb[var1] = -var2;
		}

		this.Ib = 0;
	}

	final void g (int var1) {
		int var2 = uc[var1];
		int var3 = qc[var1];

		for (int var4 = 0 ; var4 < this.Kb ; ++var4) {
			int var5 = this.zb[var4] * var3 - this.Lb[var4] * var2 >> 16;
			this.Lb[var4] = this.zb[var4] * var2 + this.Lb[var4] * var3 >> 16;
			this.zb[var4] = var5;
		}

		this.Ib = 0;
	}

	private void h (int var1) {
		if (tc[var1]) {
			this.f(var1);
		} else {
			int var2 = this.Jb[var1];
			int var3 = this.tb[var1];
			int var4 = this.vb[var1];
			v.gb = Zb[var1];
			if (this.Pb == null) {
				v.lb = 0;
			} else {
				v.lb = this.Pb[var1] & 255;
			}

			if (this.dc != null && this.dc[var1] != -1) {
				int var5 = this.dc[var1] & 255;
				int var6 = this.Mb[var5];
				int var7 = this.Hb[var5];
				int var8 = this.kc[var5];
				if (this.Eb[var1] == -1) {
					v.a(sc[var2], sc[var3], sc[var4], vc[var2], vc[var3], vc[var4], this.Gb[var1], this.Gb[var1], this.Gb[var1], Wb[var6], Wb[var7], Wb[var8], mc[var6], mc[var7], mc[var8], Xb[var6], Xb[var7], Xb[var8], this.ub[var1]);
				} else {
					v.a(sc[var2], sc[var3], sc[var4], vc[var2], vc[var3], vc[var4], this.Gb[var1], this.Rb[var1], this.Eb[var1], Wb[var6], Wb[var7], Wb[var8], mc[var6], mc[var7], mc[var8], Xb[var6], Xb[var7], Xb[var8], this.ub[var1]);
				}
			} else if (this.Eb[var1] == -1) {
				v.a(sc[var2], sc[var3], sc[var4], vc[var2], vc[var3], vc[var4], nc[this.Gb[var1]]);
			} else {
				v.a(sc[var2], sc[var3], sc[var4], vc[var2], vc[var3], vc[var4], this.Gb[var1], this.Rb[var1], this.Eb[var1]);
			}
		}
	}

	private void c () {
		if (this.Ib != 2) {
			this.Ib = 2;
			this.Bb = 0;

			for (int var1 = 0 ; var1 < this.Kb ; ++var1) {
				int var2 = this.Ob[var1];
				int var3 = this.zb[var1];
				int var4 = this.Lb[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.Bb) {
					this.Bb = var5;
				}
			}

			this.Bb = (int) (Math.sqrt((double) this.Bb) + 0.99D);
			this.sb = this.Bb;
			this.Cb = this.Bb + this.Bb;
		}
	}

	final void d () {
		if (this.Ib != 1) {
			this.Ib = 1;
			super.int_qb = 0;
			this.Sb = 0;
			this.Bb = 0;

			for (int var1 = 0 ; var1 < this.Kb ; ++var1) {
				int var2 = this.Ob[var1];
				int var3 = this.zb[var1];
				int var4 = this.Lb[var1];
				if (-var3 > super.int_qb) {
					super.int_qb = -var3;
				}

				if (var3 > this.Sb) {
					this.Sb = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.Bb) {
					this.Bb = var5;
				}
			}

			this.Bb = (int) (Math.sqrt((double) this.Bb) + 0.99D);
			this.sb = (int) (Math.sqrt((double) (this.Bb * this.Bb + super.int_qb * super.int_qb)) + 0.99D);
			this.Cb = this.sb + (int) (Math.sqrt((double) (this.Bb * this.Bb + this.Sb * this.Sb)) + 0.99D);
		}
	}

	final ue d (boolean var1) {
		if (!var1 && pc.length < this.yb) {
			pc = new byte[this.yb + 100];
		}

		return this.a(var1, Qb, pc);
	}

	private void a (boolean var1, boolean var2, int var3) {
		if (this.Cb < 1600) {
			for (int var4 = 0 ; var4 < this.Cb ; ++var4) {
				xc[var4] = 0;
			}

			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var16;
			int var17;
			int var19;
			for (int var5 = 0 ; var5 < this.yb ; ++var5) {
				if (this.Eb[var5] != -2) {
					var6 = this.Jb[var5];
					var7 = this.tb[var5];
					var8 = this.vb[var5];
					var9 = vc[var6];
					var10 = vc[var7];
					var11 = vc[var8];
					if (var1 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
						var12 = Wb[var6];
						var13 = Wb[var7];
						int var14 = Wb[var8];
						int var15 = mc[var6];
						var16 = mc[var7];
						var17 = mc[var8];
						int var18 = Xb[var6];
						var19 = Xb[var7];
						int var20 = Xb[var8];
						var12 -= var13;
						var14 -= var13;
						var15 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						int var21 = var15 * var20 - var18 * var17;
						int var22 = var18 * var14 - var12 * var20;
						int var23 = var12 * var17 - var15 * var14;
						if (var13 * var21 + var16 * var22 + var19 * var23 > 0) {
							tc[var5] = true;
							int var24 = (fc[var6] + fc[var7] + fc[var8]) / 3 + this.sb;
							oc[var24][xc[var24]++] = var5;
						}
					} else {
						if (var2 && this.a(Vb, hc, sc[var6], sc[var7], sc[var8], var9, var10, var11)) {
							ic[yc++] = var3;
							var2 = false;
						}

						if ((var9 - var10) * (sc[var8] - sc[var7]) - (sc[var6] - sc[var7]) * (var11 - var10) > 0) {
							tc[var5] = false;
							if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= v.vb && var10 <= v.vb && var11 <= v.vb) {
								Zb[var5] = false;
							} else {
								Zb[var5] = true;
							}

							var12 = (fc[var6] + fc[var7] + fc[var8]) / 3 + this.sb;
							oc[var12][xc[var12]++] = var5;
						}
					}
				}
			}

			if (this.Ab == null) {
				for (var6 = this.Cb - 1; var6 >= 0 ; --var6) {
					var7 = xc[var6];
					if (var7 > 0) {
						int[] var26 = oc[var6];

						for (var9 = 0; var9 < var7 ; ++var9) {
							this.h(var26[var9]);
						}
					}
				}

			} else {
				for (var6 = 0; var6 < 12 ; ++var6) {
					jc[var6] = 0;
					Yb[var6] = 0;
				}

				for (var7 = this.Cb - 1; var7 >= 0 ; --var7) {
					var8 = xc[var7];
					if (var8 > 0) {
						int[] var25 = oc[var7];

						for (var10 = 0; var10 < var8 ; ++var10) {
							var11 = var25[var10];
							byte var27 = this.Ab[var11];
							var13 = jc[var27]++;
							cc[var27][var13] = var11;
							if (var27 < 10) {
								Yb[var27] += var7;
							} else if (var27 == 10) {
								ec[var13] = var7;
							} else {
								bc[var13] = var7;
							}
						}
					}
				}

				var8 = 0;
				if (jc[1] > 0 || jc[2] > 0) {
					var8 = (Yb[1] + Yb[2]) / (jc[1] + jc[2]);
				}

				var9 = 0;
				if (jc[3] > 0 || jc[4] > 0) {
					var9 = (Yb[3] + Yb[4]) / (jc[3] + jc[4]);
				}

				var10 = 0;
				if (jc[6] > 0 || jc[8] > 0) {
					var10 = (Yb[6] + Yb[8]) / (jc[6] + jc[8]);
				}

				var12 = 0;
				var13 = jc[10];
				int[] var28 = cc[10];
				int[] var29 = ec;
				if (var12 == var13) {
					var12 = 0;
					var13 = jc[11];
					var28 = cc[11];
					var29 = bc;
				}

				if (var12 < var13) {
					var11 = var29[var12];
				} else {
					var11 = -1000;
				}

				for (var16 = 0; var16 < 10 ; ++var16) {
					while (var16 == 0 && var11 > var8) {
						this.h(var28[var12++]);
						if (var12 == var13 && var28 != cc[11]) {
							var12 = 0;
							var13 = jc[11];
							var28 = cc[11];
							var29 = bc;
						}

						if (var12 < var13) {
							var11 = var29[var12];
						} else {
							var11 = -1000;
						}
					}

					while (var16 == 3 && var11 > var9) {
						this.h(var28[var12++]);
						if (var12 == var13 && var28 != cc[11]) {
							var12 = 0;
							var13 = jc[11];
							var28 = cc[11];
							var29 = bc;
						}

						if (var12 < var13) {
							var11 = var29[var12];
						} else {
							var11 = -1000;
						}
					}

					while (var16 == 5 && var11 > var10) {
						this.h(var28[var12++]);
						if (var12 == var13 && var28 != cc[11]) {
							var12 = 0;
							var13 = jc[11];
							var28 = cc[11];
							var29 = bc;
						}

						if (var12 < var13) {
							var11 = var29[var12];
						} else {
							var11 = -1000;
						}
					}

					var17 = jc[var16];
					int[] var30 = cc[var16];

					for (var19 = 0; var19 < var17 ; ++var19) {
						this.h(var30[var19]);
					}
				}

				while (var11 != -1000) {
					this.h(var28[var12++]);
					if (var12 == var13 && var28 != cc[11]) {
						var12 = 0;
						var28 = cc[11];
						var13 = jc[11];
						var29 = bc;
					}

					if (var12 < var13) {
						var11 = var29[var12];
					} else {
						var11 = -1000;
					}
				}

			}
		}
	}

	private boolean a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false : (var2 > var3 && var2 > var4 && var2 > var5 ? false : (var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8));
	}

	final ue e (boolean var1) {
		if (!var1 && Nb.length < this.yb) {
			Nb = new byte[this.yb + 100];
		}

		return this.a(var1, Fb, Nb);
	}

	final void a (a var1, int var2, a var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				fe var6 = var1.fes_ab[var2];
				fe var7 = var3.fes_ab[var4];
				i var8 = var6.i_b;
				ac = 0;
				zc = 0;
				Ub = 0;
				byte var9 = 0;
				int var14 = var9 + 1;
				int var10 = var5[var9];

				int var12;
				for (int var11 = 0 ; var11 < var6.int_i ; ++var11) {
					for (var12 = var6.ints_d[var11]; var12 > var10 ; var10 = var5[var14++]) {
						;
					}

					if (var12 != var10 || var8.A[var12] == 0) {
						this.a(var8.A[var12], var8.Q[var12], var6.ints_g[var11], var6.ints_j[var11], var6.ints_h[var11]);
					}
				}

				ac = 0;
				zc = 0;
				Ub = 0;
				var9 = 0;
				var14 = var9 + 1;
				var10 = var5[var9];

				for (var12 = 0; var12 < var7.int_i ; ++var12) {
					int var13;
					for (var13 = var7.ints_d[var12]; var13 > var10 ; var10 = var5[var14++]) {
						;
					}

					if (var13 == var10 || var8.A[var13] == 0) {
						this.a(var8.A[var13], var8.Q[var13], var7.ints_g[var12], var7.ints_j[var12], var7.ints_h[var12]);
					}
				}

				this.Ib = 0;
			} else {
				this.a(var1, var2);
			}
		}
	}

	private void a (int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			ac = 0;
			zc = 0;
			Ub = 0;

			for (var8 = 0; var8 < var6 ; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.rb.length) {
					int[] var19 = this.rb[var18];

					for (var11 = 0; var11 < var19.length ; ++var11) {
						var12 = var19[var11];
						ac += this.Ob[var12];
						zc += this.zb[var12];
						Ub += this.Lb[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				ac = ac / var7 + var3;
				zc = zc / var7 + var4;
				Ub = Ub / var7 + var5;
			} else {
				ac = var3;
				zc = var4;
				Ub = var5;
			}
		} else {
			int[] var9;
			int var10;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6 ; ++var7) {
					var8 = var2[var7];
					if (var8 < this.rb.length) {
						var9 = this.rb[var8];

						for (var10 = 0; var10 < var9.length ; ++var10) {
							var11 = var9[var10];
							this.Ob[var11] += var3;
							this.zb[var11] += var4;
							this.Lb[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6 ; ++var7) {
					var8 = var2[var7];
					if (var8 < this.rb.length) {
						var9 = this.rb[var8];

						for (var10 = 0; var10 < var9.length ; ++var10) {
							var11 = var9[var10];
							this.Ob[var11] -= ac;
							this.zb[var11] -= zc;
							this.Lb[var11] -= Ub;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = uc[var14];
								var16 = qc[var14];
								var17 = this.zb[var11] * var15 + this.Ob[var11] * var16 >> 16;
								this.zb[var11] = this.zb[var11] * var16 - this.Ob[var11] * var15 >> 16;
								this.Ob[var11] = var17;
							}

							if (var12 != 0) {
								var15 = uc[var12];
								var16 = qc[var12];
								var17 = this.zb[var11] * var16 - this.Lb[var11] * var15 >> 16;
								this.Lb[var11] = this.zb[var11] * var15 + this.Lb[var11] * var16 >> 16;
								this.zb[var11] = var17;
							}

							if (var13 != 0) {
								var15 = uc[var13];
								var16 = qc[var13];
								var17 = this.Lb[var11] * var15 + this.Ob[var11] * var16 >> 16;
								this.Lb[var11] = this.Lb[var11] * var16 - this.Ob[var11] * var15 >> 16;
								this.Ob[var11] = var17;
							}

							this.Ob[var11] += ac;
							this.zb[var11] += zc;
							this.Lb[var11] += Ub;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6 ; ++var7) {
					var8 = var2[var7];
					if (var8 < this.rb.length) {
						var9 = this.rb[var8];

						for (var10 = 0; var10 < var9.length ; ++var10) {
							var11 = var9[var10];
							this.Ob[var11] -= ac;
							this.zb[var11] -= zc;
							this.Lb[var11] -= Ub;
							this.Ob[var11] = this.Ob[var11] * var3 / 128;
							this.zb[var11] = this.zb[var11] * var4 / 128;
							this.Lb[var11] = this.Lb[var11] * var5 / 128;
							this.Ob[var11] += ac;
							this.zb[var11] += zc;
							this.Lb[var11] += Ub;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.wc != null && this.Pb != null) {
					for (var7 = 0; var7 < var6 ; ++var7) {
						var8 = var2[var7];
						if (var8 < this.wc.length) {
							var9 = this.wc[var8];

							for (var10 = 0; var10 < var9.length ; ++var10) {
								var11 = var9[var10];
								var12 = (this.Pb[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.Pb[var11] = (byte) var12;
							}
						}
					}
				}

			}
		}
	}

	private ue a (boolean var1, ue var2, byte[] var3) {
		var2.Kb = this.Kb;
		var2.yb = this.yb;
		var2.wb = this.wb;
		if (var2.Ob == null || var2.Ob.length < this.Kb) {
			var2.Ob = new int[this.Kb + 100];
			var2.zb = new int[this.Kb + 100];
			var2.Lb = new int[this.Kb + 100];
		}

		for (int var4 = 0 ; var4 < this.Kb ; ++var4) {
			var2.Ob[var4] = this.Ob[var4];
			var2.zb[var4] = this.zb[var4];
			var2.Lb[var4] = this.Lb[var4];
		}

		if (var1) {
			var2.Pb = this.Pb;
		} else {
			var2.Pb = var3;
			int var5;
			if (this.Pb == null) {
				for (var5 = 0; var5 < this.yb ; ++var5) {
					var2.Pb[var5] = 0;
				}
			} else {
				for (var5 = 0; var5 < this.yb ; ++var5) {
					var2.Pb[var5] = this.Pb[var5];
				}
			}
		}

		var2.Jb = this.Jb;
		var2.tb = this.tb;
		var2.vb = this.vb;
		var2.Gb = this.Gb;
		var2.Rb = this.Rb;
		var2.Eb = this.Eb;
		var2.Ab = this.Ab;
		var2.dc = this.dc;
		var2.ub = this.ub;
		var2.xb = this.xb;
		var2.Mb = this.Mb;
		var2.Hb = this.Hb;
		var2.kc = this.kc;
		var2.rb = this.rb;
		var2.wc = this.wc;
		var2.Db = this.Db;
		var2.Ib = 0;
		return var2;
	}

	final void b (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.Ib != 2 && this.Ib != 1) {
			this.c();
		}

		int var9 = v.kb;
		int var10 = v.zb;
		int var11 = uc[var1];
		int var12 = qc[var1];
		int var13 = uc[var2];
		int var14 = qc[var2];
		int var15 = uc[var3];
		int var16 = qc[var3];
		int var17 = uc[var4];
		int var18 = qc[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0 ; var20 < this.Kb ; ++var20) {
			int var21 = this.Ob[var20];
			int var22 = this.zb[var20];
			int var23 = this.Lb[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			fc[var20] = var23 - var19;
			vc[var20] = var9 + (var21 << 9) / var8;
			sc[var20] = var10 + (var24 << 9) / var8;
			if (this.wb > 0) {
				Wb[var20] = var21;
				mc[var20] = var24;
				Xb[var20] = var23;
			}
		}

		try {
			this.a(false, false, 0);
		} catch (Exception var25) {
			var25.printStackTrace();
		}
	}

	final void a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		if (this.Ib != 1) {
			this.d();
		}

		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = this.Bb * var3 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var6 * var5 >> 16;
			int var15 = var14 - this.Bb << 9;
			if (var15 / var13 < v.tb) {
				int var16 = var14 + this.Bb << 9;
				if (var16 / var13 > v.ib) {
					int var17 = var7 * var3 - var10 * var2 >> 16;
					int var18 = this.Bb * var2 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > v.qb) {
						int var20 = var18 + (super.int_qb * var3 >> 16);
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < v.ob) {
							int var22 = var12 + (super.int_qb * var2 >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || this.wb > 0;
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if (var9 > 0 && Ac) {
								var27 = var11 - var12;
								if (var27 <= 50) {
									var27 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = Vb - v.kb;
								var29 = hc - v.zb;
								if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
									if (this.Db) {
										ic[yc++] = var9;
									} else {
										var26 = true;
									}
								}
							}

							var27 = v.kb;
							var28 = v.zb;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = uc[var1];
								var30 = qc[var1];
							}

							for (int var31 = 0 ; var31 < this.Kb ; ++var31) {
								int var32 = this.Ob[var31];
								int var33 = this.zb[var31];
								int var34 = this.Lb[var31];
								int var35;
								if (var1 != 0) {
									var35 = var34 * var29 + var32 * var30 >> 16;
									var34 = var34 * var30 - var32 * var29 >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = var34 * var4 + var32 * var5 >> 16;
								var34 = var34 * var5 - var32 * var4 >> 16;
								var32 = var35;
								var35 = var33 * var3 - var34 * var2 >> 16;
								var34 = var33 * var2 + var34 * var3 >> 16;
								fc[var31] = var34 - var11;
								if (var34 >= 50) {
									vc[var31] = var27 + (var32 << 9) / var34;
									sc[var31] = var28 + (var35 << 9) / var34;
								} else {
									vc[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									Wb[var31] = var32;
									mc[var31] = var35;
									Xb[var31] = var34;
								}
							}

							try {
								this.a(var23, var26, var9);
							} catch (Exception var36) {
								var36.printStackTrace();
							}
						}
					}
				}
			}
		}
	}

	final void f () {
		for (int var1 = 0 ; var1 < this.Kb ; ++var1) {
			int var2 = this.Lb[var1];
			this.Lb[var1] = this.Ob[var1];
			this.Ob[var1] = -var2;
		}

		this.Ib = 0;
	}

	final int g () {
		this.d();
		return this.Bb;
	}

	final ue a (int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == var2 && var1 == var3 && var1 == var4) {
			return this;
		} else {
			ue var6;
			if (var5) {
				var6 = new ue();
				var6.Kb = this.Kb;
				var6.yb = this.yb;
				var6.wb = this.wb;
				var6.Ob = this.Ob;
				var6.Lb = this.Lb;
				var6.Jb = this.Jb;
				var6.tb = this.tb;
				var6.vb = this.vb;
				var6.Gb = this.Gb;
				var6.Rb = this.Rb;
				var6.Eb = this.Eb;
				var6.Ab = this.Ab;
				var6.Pb = this.Pb;
				var6.dc = this.dc;
				var6.ub = this.ub;
				var6.xb = this.xb;
				var6.Mb = this.Mb;
				var6.Hb = this.Hb;
				var6.kc = this.kc;
				var6.rb = this.rb;
				var6.wc = this.wc;
				var6.Db = this.Db;
				var6.zb = new int[var6.Kb];
			} else {
				var6 = this;
			}

			int var7 = (var1 + var2 + var3 + var4) / 4;

			for (int var8 = 0 ; var8 < var6.Kb ; ++var8) {
				int var9 = this.Ob[var8];
				int var10 = this.zb[var8];
				int var11 = this.Lb[var8];
				int var12 = var1 + (var2 - var1) * (var9 + 64) / 128;
				int var13 = var4 + (var3 - var4) * (var9 + 64) / 128;
				int var14 = var12 + (var13 - var12) * (var11 + 64) / 128;
				var6.zb[var8] = var10 + var14 - var7;
			}

			var6.Ib = 0;
			return var6;
		}
	}

	final void a (int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.Ib != 2 && this.Ib != 1) {
			this.c();
		}

		int var8 = v.kb;
		int var9 = v.zb;
		int var10 = uc[var1];
		int var11 = qc[var1];
		int var12 = uc[var2];
		int var13 = qc[var2];
		int var14 = uc[var3];
		int var15 = qc[var3];
		int var16 = uc[var4];
		int var17 = qc[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0 ; var19 < this.Kb ; ++var19) {
			int var20 = this.Ob[var19];
			int var21 = this.zb[var19];
			int var22 = this.Lb[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			fc[var19] = var22 - var18;
			vc[var19] = var8 + (var20 << 9) / var22;
			sc[var19] = var9 + (var23 << 9) / var22;
			if (this.wb > 0) {
				Wb[var19] = var20;
				mc[var19] = var23;
				Xb[var19] = var22;
			}
		}

		try {
			this.a(false, false, 0);
		} catch (Exception var24) {
			var24.printStackTrace();
		}
	}

	final void a (a var1, int var2) {
		if (this.rb != null) {
			if (var2 != -1) {
				fe var3 = var1.fes_ab[var2];
				i var4 = var3.i_b;
				ac = 0;
				zc = 0;
				Ub = 0;

				for (int var5 = 0 ; var5 < var3.int_i ; ++var5) {
					int var6 = var3.ints_d[var5];
					this.a(var4.A[var6], var4.Q[var6], var3.ints_g[var5], var3.ints_j[var5], var3.ints_h[var5]);
				}

				this.Ib = 0;
			}
		}
	}

	final void b (int var1, int var2, int var3) {
		for (int var4 = 0 ; var4 < this.Kb ; ++var4) {
			this.Ob[var4] += var1;
			this.zb[var4] += var2;
			this.Lb[var4] += var3;
		}

		this.Ib = 0;
	}
}
