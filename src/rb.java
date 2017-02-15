final class rb {
	static int c;
	static rd[] d;
	static rd g;
	static int h;
	static rd i = md.a((String) "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", (byte) 120);
	static int j = 0;
	static int m = 2;
	static ke cacheFile0;
	static rd p;
	static rd r;
	static int s;
	static int int_u;
	static rd runes;
	static he[] cross;
	static oa A;
	static rd B;
	private static rd a = md.a((String) "Jun", (byte) 115);
	private static rd b = md.a((String) "Mar", (byte) 124);
	private static rd e = md.a((String) "Dec", (byte) 119);
	private static rd f;
	private static rd k = md.a((String) "Aug", (byte) 122);
	private static rd l;
	private static rd n = md.a((String) "Feb", (byte) 126);
	private static rd q = md.a((String) "Apr", (byte) 115);
	private static rd rd_t = md.a((String) "Jul", (byte) 126);
	private static rd v = md.a((String) "button near the top of that page)3", (byte) 126);
	private static rd rd_w;
	private static rd x;
	private static rd C;

	static {
		g = v;
		rd_w = md.a("Oct", (byte) 127);
		runes = md.a("runes", (byte) 117);
		r = md.a("und die Schaltfl-=che (WSpielkonto erstellen(W am", (byte) 127);
		B = md.a("Lade Sprites )2 ", (byte) 119);
		p = md.a("@or3@", (byte) 118);
		f = md.a("May", (byte) 120);
		x = md.a("Sep", (byte) 123);
		l = md.a("Jan", (byte) 122);
		C = md.a("Nov", (byte) 117);
		d = new rd[]{l, n, b, q, f, a, rd_t, k, x, rd_w, C, e};
	}

	public static void a (int var0) {
		try {
			if (var0 != 18818) {
				rd_t = null;
			}

			x = null;
			l = null;
			runes = null;
			p = null;
			rd_t = null;
			r = null;
			cacheFile0 = null;
			g = null;
			B = null;
			b = null;
			d = null;
			k = null;
			A = null;
			i = null;
			e = null;
			f = null;
			C = null;
			q = null;
			a = null;
			n = null;
			rd_w = null;
			cross = null;
			v = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "rb.B(" + var0 + ')');
		}
	}

	static void b (int var0) {
		try {
			int var1 = wc.f * 128 - -64;
			++s;
			int var2 = 64 + 128 * hf.int_pb;
			int var3 = vc.a(ce.plane, var1, var2, (byte) 37) + -pb.r;
			if (~var1 < ~wc.d) {
				wc.d += jc.M - -(me.D * (-wc.d + var1) / 1000);
				if (~wc.d < ~var1) {
					wc.d = var1;
				}
			}

			if (wc.d > var1) {
				wc.d -= jc.M + (-var1 + wc.d) * me.D / 1000;
				if (wc.d < var1) {
					wc.d = var1;
				}
			}

			if (~u.vb > ~var3) {
				u.vb += jc.M - -(me.D * (var3 - u.vb) / 1000);
				if (var3 < u.vb) {
					u.vb = var3;
				}
			}

			if (~pa.n > ~var2) {
				pa.n += jc.M - -((var2 + -pa.n) * me.D / 1000);
				if (~pa.n < ~var2) {
					pa.n = var2;
				}
			}

			var1 = 128 * ec.int_n + 64;
			if (~u.vb < ~var3) {
				u.vb -= me.D * (-var3 + u.vb) / 1000 + jc.M;
				if (~var3 < ~u.vb) {
					u.vb = var3;
				}
			}

			if (var2 < pa.n) {
				pa.n -= (-var2 + pa.n) * me.D / 1000 + jc.M;
				if (~pa.n > ~var2) {
					pa.n = var2;
				}
			}

			var2 = wd.c * 128 + var0;
			var3 = vc.a(ce.plane, var1, var2, (byte) 37) + -wc.l;
			int var5 = var3 - u.vb;
			int var4 = -wc.d + var1;
			int var6 = var2 - pa.n;
			int var7 = (int) Math.sqrt((double) (var4 * var4 + var6 * var6));
			int var8 = 2047 & (int) (325.949D * Math.atan2((double) var5, (double) var7));
			if (~var8 > -129) {
				var8 = 128;
			}

			if (var8 > 383) {
				var8 = 383;
			}

			int var9 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 2047;
			if (~var8 < ~nb.p) {
				nb.p += lc.i + w.int_e * (-nb.p + var8) / 1000;
				if (~var8 > ~nb.p) {
					nb.p = var8;
				}
			}

			if (~nb.p < ~var8) {
				nb.p -= lc.i - -(w.int_e * (-var8 + nb.p) / 1000);
				if (nb.p < var8) {
					nb.p = var8;
				}
			}

			int var10 = -w.j + var9;
			if (var10 > 1024) {
				var10 -= 2048;
			}

			if (~var10 > 1023) {
				var10 += 2048;
			}

			if (~var10 < -1) {
				w.j += var10 * w.int_e / 1000 + lc.i;
				w.j &= 2047;
			}

			if (var10 < 0) {
				w.j -= lc.i + -var10 * w.int_e / 1000;
				w.j &= 2047;
			}

			int var11 = var9 - w.j;
			if (~var11 < -1025) {
				var11 -= 2048;
			}

			if (~var11 > 1023) {
				var11 += 2048;
			}

			if (var11 < 0 && ~var10 < -1 || ~var11 < -1 && var10 < 0) {
				w.j = var9;
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "rb.A(" + var0 + ')');
		}
	}

	static he[] a (pb archiveFile8, int i, int index, int unused) {
		try {
			++h;
			return !t.a(index, (byte) -124, i, archiveFile8) ? null : w.a(-107);
		} catch (RuntimeException var5) {
			throw id.a(var5, "rb.D(" + (archiveFile8 != null ? "{...}" : "null") + ',' + i + ',' + index + ',' + unused + ')');
		}
	}

	static void c (int unused) {
		try {
			++int_u;
			if (jb.L && af.int_m != ce.plane) {
				dd.a(af.td_p.Hc[0], -1, af.td_p.xc[0], ce.plane, ub.G, jc.Y);
			} else {
				if (ce.plane != ab.int_d) {
					ab.int_d = ce.plane;
					ff.a(127, ce.plane);
				}
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "rb.C(" + unused + ')');
		}
	}
}
