import java.awt.Image;

abstract class f extends ha {
	static int int_rb;
	static int int_ub;
	static rd rd_wb = md.a((String) "Wen m-Ochten Sie der Liste hinzuf-Ugen?", (byte) 127);
	static int Ab = -1;
	static int Ub;
	static int Yb;
	static boolean boolean_bc = false;
	static int cc;
	static int int_ec;
	static int int_nc;
	static int yc;
	static Object Ac = new Object();
	static int Bc;
	static rd Jc = md.a((String) "", (byte) 121);
	static rd enterYourUsername_password2;
	static td[] Lc;
	static rd K2;
	static g Nc;
	static rd youNeedAMembersAccountToLoginToThisWorld2;
	static Image image;
	static r Sc;
	static rd Tc;
	static int[] Vc;
	static int[] Wc;
	private static rd youNeedAMembersAccountToLoginToThisWorld;
	private static rd enterYourUsername_password = md.a((String) "Enter your username (V password)3", (byte) 124);
	private static rd K;

	static {
		enterYourUsername_password2 = enterYourUsername_password;
		Sc = null;
		Vc = new int[256];
		youNeedAMembersAccountToLoginToThisWorld = md.a("You need a members account to login to this world)3", (byte) 117);
		Lc = new td[2048];
		K = md.a("K", (byte) 127);
		Tc = K;
		K2 = K;
		youNeedAMembersAccountToLoginToThisWorld2 = youNeedAMembersAccountToLoginToThisWorld;
	}

	int int_sb;
	int int_tb = 0;
	int int_vb = 0;
	int xb = -1;
	int yb = -1;
	boolean zb = false;
	int Bb;
	int Cb = 0;
	int Db = 0;
	int Eb;
	int Fb = 0;
	int Gb = 0;
	int Hb;
	int Ib;
	int Jb = 0;
	int Kb = -1;
	int Lb = 0;
	int Mb = 0;
	int x_;
	int Ob;
	int Pb = 0;
	rd Qb = null;
	int Rb = -1;
	int Sb = 0;
	int[] Tb = new int[4];
	int Vb = 0;
	int Wb = -1;
	int Xb = 32;
	int Zb;
	int int_ac;
	int int_dc;
	int int_fc = -1;
	int int_gc;
	int int_hc;
	int int_ic = 0;
	int int_jc;
	int int_kc = 1;
	int int_lc = -1;
	int[] ints_mc = new int[4];
	int int_oc = -1;
	int[] ints_pc = new int[4];
	int int_qc = -1000;
	int int_rc = 0;
	int int_sc = -1;
	int int_tc = 0;
	int int_uc;
	int int_vc = 200;
	int int_wc = 100;
	int[] xc = new int[10];
	int zc = -1;
	int Cc = -1;
	int Dc = 0;
	int Ec = 0;
	int y_;
	int Gc = -1;
	int[] Hc = new int[10];
	boolean[] Ic = new boolean[10];

	static void e (byte unused) {
		try {
			ud.R.a(-1926);
			db.T.a(0, 0);
			++yc;
			bb.ints_x = v.c(bb.ints_x);
		} catch (RuntimeException var2) {
			throw id.a(var2, "f.P(" + unused + ')');
		}
	}

	static void nullLoader (int unused) {
		try {
			image = null;
			Lc = null;
			enterYourUsername_password2 = null;
			Tc = null;
			Jc = null;
			Ac = null;
			enterYourUsername_password = null;
			youNeedAMembersAccountToLoginToThisWorld = null;
			Wc = null;
			K2 = null;
			rd_wb = null;
			youNeedAMembersAccountToLoginToThisWorld2 = null;
			K = null;
			Vc = null;
			Nc = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "f.M(" + unused + ')');
		}
	}

	static void b (int yArea, int unused, int plane, int xArea) {
		try {
			++Bc;
			int tileXChunk = 0;
			int tileYChunk;
			while (tileXChunk < 8) {
				tileYChunk = 0;
				while (tileYChunk < 8) {
					tb.Yb[plane][tileXChunk + xArea][yArea + tileYChunk] = 0;
					++tileYChunk;
				}

				++tileXChunk;
			}

			if (xArea > 0) {
				tileYChunk = 1;
				while (tileYChunk < 8) {
					tb.Yb[plane][xArea][tileYChunk + yArea] = tb.Yb[plane][-1 + xArea][tileYChunk + yArea];
					++tileYChunk;
				}
			}

			if (yArea > 0) {
				tileYChunk = 1;
				while (tileYChunk < 8) {
					tb.Yb[plane][xArea + tileYChunk][yArea] = tb.Yb[plane][xArea + tileYChunk][-1 + yArea];
					++tileYChunk;
				}
			}

			if (xArea <= 0 || tb.Yb[plane][-1 + xArea][yArea] == 0) {
				if (yArea <= 0 || tb.Yb[plane][xArea][yArea - 1] == 0) {
					if (xArea > 0 && yArea > 0 && tb.Yb[plane][xArea - 1][yArea + -1] != 0) {
						tb.Yb[plane][xArea][yArea] = tb.Yb[plane][-1 + xArea][yArea - 1];
					}
				} else {
					tb.Yb[plane][xArea][yArea] = tb.Yb[plane][xArea][yArea + -1];
				}
			} else {
				tb.Yb[plane][xArea][yArea] = tb.Yb[plane][xArea + -1][yArea];
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "f.R(" + yArea + ',' + unused + ',' + plane + ',' + xArea + ')');
		}
	}

	static int a (int i, int i1, int i2, byte unused) {
		try {
			++int_rb;
			int i3 = -i2 + 256;
			return (i3 * ('\uff00' & i1) + ('\uff00' & i) * i2 & 16711680) + (-16711936 & i3 * (16711935 & i1) + i2 * (16711935 & i)) >> 8;
		} catch (RuntimeException var5) {
			throw id.a(var5, "f.N(" + i + ',' + i1 + ',' + i2 + ',' + unused + ')');
		}
	}

	boolean d (byte unused) {
		try {
			++int_nc;
			return false;
		} catch (RuntimeException var3) {
			throw id.a(var3, "f.A(" + unused + ')');
		}
	}

	final void a (int i, int unused, int i1, int i2) {
		try {
			++int_ub;
			int plane = 0;
			while (plane < 4) {
				if (this.ints_pc[plane] <= i) {
					this.Tb[plane] = i2;
					this.ints_mc[plane] = i1;
					this.ints_pc[plane] = 70 + i;
					return;
				}

				++plane;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "f.Q(" + i + ',' + unused + ',' + i1 + ',' + i2 + ')');
		}
	}

	final void a (boolean flag, int direction, boolean unused) {
		try {
			++int_ec;
			int x = this.xc[0];
			int y = this.Hc[0];
			if (direction == 0) {
				--x;
				++y;
			}

			if (direction == 1) {
				++y;
			}

			if (direction == 2) {
				++x;
				++y;
			}

			if (this.zc != -1 && bd.a(this.zc, false).int_jb == 1) {
				this.zc = -1;
			}

			if (this.Dc < 9) {
				++this.Dc;
			}

			if (direction == 3) {
				--x;
			}

			if (direction == 4) {
				++x;
			}

			if (direction == 5) {
				--y;
				--x;
			}

			int i = this.Dc;
			while (i > 0) {
				this.xc[i] = this.xc[i - 1];
				this.Hc[i] = this.Hc[-1 + i];
				this.Ic[i] = this.Ic[i - 1];
				--i;
			}

			this.Ic[0] = flag;
			if (direction == 6) {
				--y;
			}

			if (direction == 7) {
				--y;
				++x;
			}

			this.xc[0] = x;
			this.Hc[0] = y;
		} catch (RuntimeException var8) {
			throw id.a(var8, "f.O(" + flag + ',' + direction + ',' + unused + ')');
		}
	}

	final void a (byte unused, boolean flag, int y, int x) {
		try {
			++Yb;
			if (this.zc != -1 && bd.a(this.zc, false).int_jb == 1) {
				this.zc = -1;
			}

			if (!flag) {
				int tileXChunk = x - this.xc[0];
				int tileYChunk = -this.Hc[0] + y;
				if (~tileXChunk <= 7 && tileXChunk <= 8 && ~tileYChunk <= 7 && tileYChunk <= 8) {
					if (this.Dc < 9) {
						++this.Dc;
					}

					int i = this.Dc;
					if (i <= 0) {
						this.Ic[0] = false;
						this.xc[0] = x;
						this.Hc[0] = y;
						return;
					}

					while (i > 0) {
						this.xc[i] = this.xc[-1 + i];
						this.Hc[i] = this.Hc[i + -1];
						this.Ic[i] = this.Ic[i - 1];
						--i;
					}

					this.Ic[0] = false;
					this.xc[0] = x;
					this.Hc[0] = y;
					return;
				}
			}

			this.Jb = 0;
			this.xc[0] = x;
			this.int_rc = 0;
			this.Hc[0] = y;
			this.y_ = 128 * this.Hc[0] + (64 * this.int_kc);
			this.x_ = this.int_kc * 64 + this.xc[0] * 128;
			this.Dc = 0;
		} catch (RuntimeException var9) {
			throw id.a(var9, "f.K(" + unused + ',' + flag + ',' + y + ',' + x + ')');
		}
	}

	final void f (byte unused) {
		try {
			++Ub;
			this.int_rc = 0;
			this.Dc = 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "f.L(" + unused + ')');
		}
	}
}
