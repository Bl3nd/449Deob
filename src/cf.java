import java.awt.Component;

final class cf implements Runnable {
	static int int_a;
	static int int_b;
	static rd take2;
	static int int_e;
	static long long_g = 0L;
	static int int_h = -1;
	static int int_i;
	static rd worldFull_pleaseUseADifferentWorld;
	static rd enterNameOfFriendToAddToList2;
	static int int_l;
	static rd rd_n;
	static rd enterObjectName2;
	static int int_p;
	static rd clientdrop;
	static int int_r;
	static int int_s;
	static int int_t;
	static rd rd_u;
	static rd rd_v;
	static rd pleaseUseADifferentWorld_thisWorldIsRunningAClosedBeta;
	private static rd take = md.a((String) "Take", (byte) 126);
	private static rd pleaseUseADifferentWorld = md.a((String) "Please use a different world)3", (byte) 121);
	private static rd enterNameOfFriendToAddToList;
	private static rd enterObjectName;

	static {
		worldFull_pleaseUseADifferentWorld = pleaseUseADifferentWorld;
		enterNameOfFriendToAddToList = md.a("Enter name of friend to add to list", (byte) 117);
		rd_n = md.a("(X100(U(Y", (byte) 122);
		enterNameOfFriendToAddToList2 = enterNameOfFriendToAddToList;
		rd_u = md.a("Ung-Ultige Session)2ID)3", (byte) 114);
		clientdrop = md.a("::clientdrop", (byte) 123);
		rd_v = md.a("blinken3:", (byte) 117);
		enterObjectName = md.a("Enter object name", (byte) 114);
		pleaseUseADifferentWorld_thisWorldIsRunningAClosedBeta = pleaseUseADifferentWorld;
		enterObjectName2 = enterObjectName;
		take2 = take;
	}

	static void a (int y, int i, int x, int unused) {
		try {
			++int_i;
			if (x >= 128 && y >= 128 && x <= 13056 && y <= 13056) {
				int i1 = -i + vc.a(ce.plane, x, y, (byte) 37);
				x -= wc.d;
				y -= pa.n;
				i1 -= u.vb;
				int i2 = v.pb[w.j];
				int i3 = v.wb[nb.p];
				int i4 = v.pb[nb.p];
				int i5 = v.wb[w.j];
				int i6 = x * i5 + y * i2 >> 16;
				y = y * i5 - x * i2 >> 16;
				x = i6;
				i6 = -(y * i4) + i3 * i1 >> 16;
				y = y * i3 + i4 * i1 >> 16;
				if (y < 50) {
					fb.int_o = -1;
					int_h = -1;
				} else {
					int_h = (x << 9) / y + 256;
					fb.int_o = 167 + ((i6 << 9) / y);
				}
			} else {
				int_h = -1;
				fb.int_o = -1;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "cf.F(" + y + ',' + i + ',' + x + ',' + unused + ')');
		}
	}

	static nd a (int unused, nd class_nd, nd class_nd2, int i, int i1) {
		try {
			++int_l;
			nd class_nd3 = pb.a(class_nd2, 0, 0, class_nd.Nb, i, class_nd.dc, ld.c[class_nd.dc >> 16], -1, class_nd.Mb, i1, class_nd.Bb, class_nd.int_ib);
			if (class_nd3 != null) {
				return class_nd3;
			} else {
				if (class_nd.Ab != null) {
					class_nd3 = pb.a(class_nd2, 0, 0, class_nd.Nb, i, class_nd.dc, class_nd.Ab, -1, class_nd.Mb, i1, class_nd.Bb, class_nd.int_ib);
				}

				return class_nd3;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "cf.B(" + unused + ',' + "{...}" + ',' + (class_nd2 != null ? "{...}" : "null") + ',' + i + ',' + i1 + ')');
		}
	}

	public static void a (int unused) {
		try {
			take2 = null;
			take = null;
			enterObjectName = null;
			worldFull_pleaseUseADifferentWorld = null;
			pleaseUseADifferentWorld_thisWorldIsRunningAClosedBeta = null;
			rd_u = null;
			rd_n = null;
			enterObjectName2 = null;
			enterNameOfFriendToAddToList2 = null;
			clientdrop = null;
			enterNameOfFriendToAddToList = null;
			pleaseUseADifferentWorld = null;
			rd_v = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "cf.A(" + unused + ')');
		}
	}

	static void b (int unused) {
		try {
			jb.D.c(-112);
			++int_p;
		} catch (RuntimeException var2) {
			throw id.a(var2, "cf.D(" + unused + ')');
		}
	}

	static rd a (nd class_nd, boolean unused) {
		try {
			++int_a;
			return se.a((byte) 69, fc.a(class_nd, 1572721824)) == 0 ? null : (class_nd.Gc != null && class_nd.Gc.d(-6488).b(-29348) != 0 ? class_nd.Gc : (a.boolean_jb ? sd.hiddenUse : null));
		} catch (RuntimeException var3) {
			throw id.a(var3, "cf.E(" + (class_nd != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static re a (boolean unused, int unused2, Component component, g class_g, int unused3) {
		try {
			++int_r;
			l.a((byte) -88, component, false, 22050, class_g);
			re class_re = new re();
			eb.a(0, class_re);
			return class_re;
		} catch (RuntimeException var6) {
			throw id.a(var6, "cf.C(" + unused + ',' + unused2 + ',' + (component != null ? "{...}" : "null") + ',' + (class_g != null ? "{...}" : "null") + ',' + unused3 + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	public final void run () {
		try {
			++int_s;
			try {
				while (true) {
					synchronized (sb.md_e) {
						tc class_tc = (tc) sb.md_e.c((byte) 91);
						if (class_tc == null) {
							wa.sleep(17525, 100L);
							synchronized (f.Ac) {
								if (fc.int_n > 1) {
									--fc.int_n;
									continue;
								}

								fc.int_n = 0;
								f.Ac.notifyAll();
							}

							return;
						} else {
							if (class_tc.D != 0) {
								if (class_tc.D == 1) {
									class_tc.N = class_tc.P.a((byte) -119, (int) class_tc.script);
									synchronized (sb.md_e) {
										pe.i.a(class_tc, (byte) -13);
									}
								}
							} else {
								class_tc.P.a(class_tc.N.length, (int) class_tc.script, class_tc.N, -1);
								synchronized (sb.md_e) {
									class_tc.d(-26669);
								}
							}

							synchronized (f.Ac) {
								if (fc.int_n <= 1) {
									fc.int_n = 0;
									f.Ac.notifyAll();
								} else {
									fc.int_n = 600;
									continue;
								}
							}

							return;
						}
					}
				}
			} catch (Exception e) {
				se.a((byte) -90, e, null);
			}
		} catch (RuntimeException var45) {
			throw id.a(var45, "cf.run(" + ')');
		}
	}
}
