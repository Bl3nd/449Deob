import java.io.DataInputStream;
import java.net.URL;

final class se {
	static rd rd_a;
	static rd rd_b;
	static rd c = md.a((String) "Freund hinzuf-Ugen", (byte) 118);
	static int d;
	static rd continueText2;
	static int f;
	static int int_g = 0;
	static rd rd_h = md.a((String) "An", (byte) 122);
	static oa k;
	static int l;
	static int m;
	static rd rd_n;
	static int o = -1;
	static int[] p = new int[1000];
	static jd q;
	static boolean r;
	static int int_s;
	static int t;
	static int v;
	static rd w;
	static rd x;
	static int y;
	private static rd i = md.a((String) "Moderator option: Mute player for 48 hours: <OFF>", (byte) 127);
	private static rd continueText = md.a((String) "Continue", (byte) 114);
	private static rd rd_u;
	private static rd z;

	static {
		continueText2 = continueText;
		rd_n = md.a("Einloggen", (byte) 125);
		rd_u = md.a("Create a free account", (byte) 120);
		rd_a = i;
		rd_b = rd_u;
		x = md.a("lila:", (byte) 126);
		z = md.a("and choose the (Wcreate account(W", (byte) 123);
		w = z;
	}

	static int a (int unused, int sampleRateValue, int sampleRate) {
		try {
			int i;
			if (sampleRate > sampleRateValue) {
				i = sampleRateValue;
				sampleRateValue = sampleRate;
				sampleRate = i;
			}

			while (sampleRate != 0) {
				i = sampleRateValue % sampleRate;
				sampleRateValue = sampleRate;
				sampleRate = i;
			}
			++int_s;
			return sampleRateValue;
		} catch (RuntimeException var5) {
			throw id.a(var5, "se.H(" + unused + ',' + sampleRateValue + ',' + sampleRate + ')');
		}
	}

	static int a (byte var0, int var1) {
		try {
			++l;
			if (var0 != 69) {
				a((byte) -32, -100);
			}

			return (var1 & 129353) >> 11;
		} catch (RuntimeException var3) {
			throw id.a(var3, "se.D(" + var0 + ',' + var1 + ')');
		}
	}

	static boolean b (int var0, int var1, int var2) {
		try {
			if (var2 != -4) {
				return true;
			} else {
				++d;
				return var0 == 0 && ~be.int_k == ~var1 ? true : (~var0 == -2 && ~var1 == ~qc.Q ? true : (~var0 == -3 || ~var0 == -4) && rd_u.Z == var1);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "se.G(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a (byte var0, Throwable var1, String var2) {
		int var7 = client.int_tb;

		++m;

		try {
			String var3 = "";
			if (var1 != null) {
				var3 = we.a(-22155, var1);
			}

			if (var2 != null) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var2;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (kd.o.applet_b != null) {
				int var4 = -15 / ((var0 - -44) / 45);
				ma var5 = kd.o
						.a(0, new URL(kd.o.applet_b.getCodeBase(), "clienterror.ws?c=" + s.Z + "&u=" + b.long_fd + "&v1=" + g.javaVendorProperty_a + "&v2=" + g.javaVersionProperty_g + "&e=" + var3));
				if (var7 != 0) {
					wa.sleep(17525, 1L);
				}

				while (~var5.f == -1) {
					wa.sleep(17525, 1L);
				}

				if (~var5.f == -2) {
					DataInputStream dataInputStream = (DataInputStream) var5.c;
					dataInputStream.read();
					dataInputStream.close();
				}
			}
		} catch (Exception var8) {
			var8.printStackTrace();
		}
	}

	static void a (int var0, long var1) {
		int var6 = client.int_tb;

		try {
			++f;
			if (~var1 != -1L) {
				if ((~u.int_eb > -101 || ub.D == 1) && ~u.int_eb > -201) {
					rd var3 = ff.a(-26567, var1).e(-79);
					int var4 = 0;
					if (var6 != 0 || ~u.int_eb < ~var4) {
						do {
							if (var1 == cc.longs_f[var4]) {
								n.a(kd.rd_v, pc.a((byte) 126, new rd[]{var3, ba.rd_n}), true, 0);
								return;
							}

							++var4;
						} while (~u.int_eb < ~var4);
					}

					int var5 = 0;
					if (var6 != 0) {
						if (~var1 == ~md.p[var5]) {
							n.a(kd.rd_v, pc.a((byte) 126, new rd[]{h.rd_r, var3, dd._fromYourignoreListFirst2}), true, 0);
							return;
						}

						++var5;
					}

					while (nc.p > var5) {
						if (~var1 == ~md.p[var5]) {
							n.a(kd.rd_v, pc.a((byte) 126, new rd[]{h.rd_r, var3, dd._fromYourignoreListFirst2}), true, 0);
							return;
						}

						++var5;
					}

					if (!var3.a(af.td_p.Gd, false)) {
						ad.rds_k[u.int_eb] = var3;
						cc.longs_f[u.int_eb] = var1;
						ee.ints_k[u.int_eb] = 0;
						++bc.u;
						je.ints_i[u.int_eb] = 0;
						ec.int_i = ce.y - -1;
						++u.int_eb;
						db.F = true;
						ie.writeStream.writeOpcode(8, 238);
						if (var0 > -121) {
							r = true;
						}

						ie.writeStream.writeLong(var1, 2);
					}
				} else {
					n.a(kd.rd_v, ja.rd_g, true, 0);
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "se.F(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a (byte var0) {
		try {
			continueText = null;
			c = null;
			z = null;
			w = null;
			rd_n = null;
			if (var0 >= -51) {
				w = null;
			}

			i = null;
			q = null;
			x = null;
			rd_h = null;
			k = null;
			continueText2 = null;
			rd_u = null;
			rd_b = null;
			rd_a = null;
			p = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "se.B(" + var0 + ')');
		}
	}

	static byte[] a (byte[] data, int var1) {
		try {
			int length = data.length;
			if (var1 != -16044) {
				return null;
			} else {
				++y;
				byte[] dest = new byte[length];
				ef.copyBytes(data, 0, dest, 0, length);
				return dest;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "se.C(" + "{...}" + ',' + var1 + ')');
		}
	}

	static boolean a (nd var0, boolean var1) {
		try {
			if (!var1) {
				return true;
			} else {
				++t;
				if (a.boolean_jb) {
					if (~fc.a(var0, 1572721824) != -1) {
						return false;
					}

					if (var0.tb == 0) {
						return false;
					}
				}

				return var0.Jc;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "se.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
}
