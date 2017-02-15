import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Method;

abstract class jd {
	static int int_a;
	static int int_b;
	static int int_d;
	static int int_g;
	static int currentIncomingPacket = 0;
	static he[] headicons_prayer;
	static int k;
	static rd rd_l = md.a((String) "Keine Antwort vom Anmelde)2Server)3", (byte) 123);
	static he mapedge;
	static int int_n;
	static int int_o;
	static int int_p;
	static int int_q;
	static rd backvmid3 = md.a((String) "backvmid3", (byte) 116);
	static rd rd_s = md.a((String) "*6n", (byte) 124);
	static int int_t = 0;
	int[] imagePixels;
	int image_h;
	int image_w;
	Image image_j;

	public static void a (byte var0) {
		try {
			rd_l = null;
			int var1 = 31 / ((37 - var0) / 49);
			rd_s = null;
			mapedge = null;
			headicons_prayer = null;
			backvmid3 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "jd.M(" + var0 + ')');
		}
	}

	static void a (int var0, byte var1) {
		try {
			++k;
			ud var2 = (ud) ud.P.a(-1, (long) var0);
			int var3 = -48 / ((49 - var1) / 38);
			if (var2 != null) {
				var2.d(-26669);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "jd.N(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (byte var0, long var1) {
		int var6 = client.int_tb;

		try {
			++int_g;
			if (~var1 != -1L) {
				if (nc.p >= 100) {
					n.a(kd.rd_v, uc.jc, true, 0);
				} else {
					rd var3 = ff.a(-26567, var1).e(-74);
					if (var0 > -127) {
						rd_l = null;
					}

					int var4 = 0;
					if (var6 != 0 || ~var4 > ~nc.p) {
						do {
							if (~md.p[var4] == ~var1) {
								n.a(kd.rd_v, pc.a((byte) 125, new rd[]{var3, kb.s}), true, 0);
								return;
							}

							++var4;
						} while (~var4 > ~nc.p);
					}

					int var5 = 0;
					if (var6 != 0) {
						if (var1 == cc.longs_f[var5]) {
							n.a(kd.rd_v, pc.a((byte) 125, new rd[]{h.rd_n, var3, mb.r}), true, 0);
							return;
						}

						++var5;
					}

					while (~u.int_eb < ~var5) {
						if (var1 == cc.longs_f[var5]) {
							n.a(kd.rd_v, pc.a((byte) 125, new rd[]{h.rd_n, var3, mb.r}), true, 0);
							return;
						}

						++var5;
					}

					if (!var3.a(af.td_p.Gd, false)) {
						++mb.q;
						md.p[nc.p++] = var1;
						db.F = true;
						ie.writeStream.writeOpcode(8, 90);
						ie.writeStream.writeLong(var1, 2);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "jd.K(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (Component component, int unused) {
		try {
			++int_o;
			Method setFocusTraversalKeysEnabled = g.setFocusTraversalKeysEnabled_p;
			if (setFocusTraversalKeysEnabled != null) {
				try {
					setFocusTraversalKeysEnabled.invoke(component, Boolean.FALSE);
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				}
			}

			component.addKeyListener(nd.Bc);
			component.addFocusListener(nd.Bc);
		} catch (RuntimeException var5) {
			throw id.a(var5, "jd.J(" + (component != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void b (byte unused) {
		try {
			++int_a;
			if (ke.tb) {
				b.ints_od = null;
				tb.Zb = null;
				te.Vb = null;
				ce.he_b = null;
				ke.wb = null;
				sd.L = null;
				jb.W = null;
				dc.oa_d = null;
				ja.jd_q = null;
				od.jd_sb = null;
				l.v = null;
				dc.jd_k = null;
				rb.A = null;
				kb.j = null;
				ce.oas_m = null;
				ff.ints_h = null;
				lc.he_a = null;
				jb.B = null;
				s.db = null;
				lc.ints_f = null;
				ja.ints_o = null;
				ie.m = null;
				ld.a(10, (byte) 13);
				md.a((byte) 101, true);
				ke.tb = false;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "jd.L(" + unused + ')');
		}
	}

	abstract void a (int unused, int x, int y, Graphics graphics);

	final void a (int unused) {
		try {
			++int_q;
			ic.a(this.imagePixels, this.image_w, this.image_h);
		} catch (RuntimeException var3) {
			throw id.a(var3, "jd.I(" + unused + ')');
		}
	}

	abstract void a (int width, int unused, int height, Component component);
}
