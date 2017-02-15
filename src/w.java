import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class w implements KeyListener, FocusListener {
	static int[] ints_a;
	static int b;
	static int c;
	static int d;
	static int int_e;
	static rd preparedSoundEngine2;
	static int g;
	static boolean h = false;
	static int i;
	static int j;
	static int k;
	static int l;
	static rd backleft2 = md.a((String) "backleft2", (byte) 118);
	static int n;
	static int o;
	static int int_p;
	static int int_q;
	static pb archiveFile7;
	static byte[][] bytes_s;
	static int u;
	static int v;
	private static rd preparedSoundEngine = md.a((String) "Prepared sound engine", (byte) 119);

	static {
		preparedSoundEngine2 = preparedSoundEngine;
	}

	static he[] a (int unused) {
		try {
			++i;
			he[] hes = new he[sd.I];
			int i = 0;
			if (sd.I <= i) {
				ee.b(-1958111762);
				return hes;
			} else {
				do {
					he class_he = hes[i] = new he();
					class_he.kb = a.mb;
					class_he.lb = ld.g;
					class_he.gb = e.yb[i];
					class_he.jb = sd.bb[i];
					class_he.imageWidth = ra.q[i];
					class_he.imageHeight = ints_a[i];
					byte[] bytes = bytes_s[i];
					int i1 = class_he.imageHeight * class_he.imageWidth;
					class_he.imagePixels = new int[i1];
					int i2 = 0;
					if (i1 <= i2) {
						++i;
					} else {
						while (i1 > i2) {
							class_he.imagePixels[i2] = eb.ints_g[od.a(255, bytes[i2])];
							++i2;
						}

						++i;
					}
				} while (sd.I > i);
				ee.b(-1958111762);
				return hes;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "w.F(" + unused + ')');
		}
	}

	static void a (byte var0) {
		int var6 = client.int_tb;

		try {
			++int_p;
			int var1 = 83 % ((38 - var0) / 57);
			int var2 = 0;
			if (var6 != 0 || gf.int_q > var2) {
				do {
					int var3 = sb.ints_o[var2];
					td var4 = f.Lc[var3];
					int var5 = lc.readStream.readUnsignedByte((byte) 116);
					if ((var5 & 128) != 0) {
						var5 += lc.readStream.readUnsignedByte((byte) 116) << 8;
					}

					q.a(var4, var5, -67, var3);
					++var2;
				} while (gf.int_q > var2);

			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "w.G(" + var0 + ')');
		}
	}

	public static void b (int var0) {
		try {
			preparedSoundEngine = null;
			bytes_s = null;
			backleft2 = null;
			preparedSoundEngine2 = null;
			if (var0 > 74) {
				ints_a = null;
				archiveFile7 = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "w.A(" + var0 + ')');
		}
	}

	static void c (int unused) {
		try {
			++g;
			p class_p = (p) kd.j.c((byte) 49);
			if (class_p != null) {
				do {
					if (class_p.O != -1) {
						class_p.d(-26669);
					} else {
						class_p.B = 0;
						le.a((byte) 103, class_p);
					}

					class_p = (p) kd.j.a((byte) -68);
				} while (class_p != null);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "w.D(" + unused + ')');
		}
	}

	static void a (int var0, boolean var1, rd var2) {
		try {
			++d;
			++n;
			ie.writeStream.writeOpcode(8, 193);
			if (!var1) {
				ie.writeStream.writeLong(var2.i(29486), 2);
				ie.writeStream.writeByte((byte) 123, var0);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "w.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static ee d (int unused) {
		try {
			++k;
			try {
				return (ee) Class.forName("aa").newInstance();
			} catch (Throwable throwable) {
				return new ge();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "w.C(" + unused + ')');
		}
	}

	static rd a (nd var0, int var1, byte var2) {
		try {
			if (var2 < 60) {
				archiveFile7 = null;
			}

			++l;
			return !sb.a(false, fc
					.a(var0, 1572721824), var1) ? null : (var0.kd != null && ~var0.kd.length < ~var1 && var0.kd[var1] != null && var0.kd[var1]
					.d(-6488).b(-29348) != 0 ? var0.kd[var1] : (a.boolean_jb ? pc
					.a((byte) 126, new rd[]{fc.hidden_, bf.a(var1, -31766)}) : null));
		} catch (RuntimeException var4) {
			throw id.a(var4, "w.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public final synchronized void keyReleased (KeyEvent keyEvent) {
		try {
			if (nd.Bc != null) {
				int var2;
				label42:
				{
					td.yd = 0;
					var2 = keyEvent.getKeyCode();
					if (~var2 > -1 || var2 >= qc.W.length) {
						var2 = -1;
						if (client.int_tb == 0) {
							break label42;
						}
					}

					var2 = qc.W[var2] & -129;
				}

				if (p.V >= 0 && ~var2 <= -1) {
					kd.ints_u[p.V] = ~var2;
					p.V = 127 & 1 + p.V;
					if (~bd.Eb == ~p.V) {
						p.V = -1;
					}
				}
			}

			keyEvent.consume();
			++v;
		} catch (RuntimeException var3) {
			throw id.a(var3, "w.keyReleased(" + (keyEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final void focusGained (FocusEvent var1) {
		try {
			++b;
		} catch (RuntimeException var3) {
			throw id.a(var3, "w.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void focusLost (FocusEvent var1) {
		try {
			++o;
			if (nd.Bc != null) {
				p.V = -1;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "w.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void keyPressed (KeyEvent keyEvent) {
		int var5 = client.int_tb;

		try {
			++c;
			if (nd.Bc != null) {
				int var2;
				label62:
				{
					td.yd = 0;
					var2 = keyEvent.getKeyCode();
					if (~var2 <= -1 && ~qc.W.length < ~var2) {
						var2 = qc.W[var2];
						if ((var2 & 128) == 0) {
							break label62;
						}

						var2 = -1;
						if (var5 == 0) {
							break label62;
						}
					}

					var2 = -1;
				}

				int var3;
				label54:
				{
					if (var2 != 85 && var2 != 80 && ~var2 != -85 && var2 != 0 && ~var2 != -102) {
						var3 = bc.getKeyChar(keyEvent, 37);
						if (var5 == 0) {
							break label54;
						}
					}

					var3 = -1;
				}

				if (p.V >= 0 && ~var2 <= -1) {
					kd.ints_u[p.V] = var2;
					p.V = 1 + p.V & 127;
					if (~bd.Eb == ~p.V) {
						p.V = -1;
					}
				}

				if (~var2 <= -1 || ~var3 <= -1) {
					int var4 = 127 & client.X + 1;
					if (var4 != sa.lb) {
						s.yb[client.X] = var2;
						qe.E[client.X] = var3;
						client.X = var4;
					}
				}
			}

			keyEvent.consume();
		} catch (RuntimeException var6) {
			throw id.a(var6, "w.keyPressed(" + (keyEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final void keyTyped (KeyEvent var1) {
		try {
			++int_q;
			var1.consume();
		} catch (RuntimeException var3) {
			throw id.a(var3, "w.keyTyped(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
