final class pe {
	static rd mapfunction = md.a((String) "mapfunction", (byte) 121);
	static int b;
	static int c;
	static rd backright2 = md.a((String) "backright2", (byte) 121);
	static int e;
	static int f;
	static oa g;
	static rd h = md.a((String) "Wordpack geladen)3", (byte) 115);
	static md i = new md();
	static rd j = md.a((String) ":  ", (byte) 123);
	static pb archiveFile2;
	static boolean l = false;
	static rd m = md.a((String) "Sie haben gerade eine andere Welt verlassen)3", (byte) 122);
	static boolean n = false;
	static rd o = md.a((String) "rot:", (byte) 118);
	static int int_p;
	static int[] q = new int[500];

	static void a (int var0, int var1, byte var2) {
		try {
			++int_p;
			s var3 = pb.c(var1, false);
			int var5 = var3.cb;
			int var4 = var3.int_mb;
			int var6 = var3.gb;
			int var7 = ka.Ub[-var5 + var6];
			if (var0 < 0 || ~var0 < ~var7) {
				var0 = 0;
			}

			var7 <<= var5;
			ta.Pb[var4] = fb.b(od.a(var7, var0 << var5), od.a(~var7, ta.Pb[var4]));
			if (var2 > -57) {
				a(-87, 11, (byte) 35);
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "pe.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void a (byte var0) {
		try {
			i = null;
			backright2 = null;
			j = null;
			q = null;
			h = null;
			o = null;
			mapfunction = null;
			archiveFile2 = null;
			if (var0 == -32) {
				m = null;
				g = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "pe.B(" + var0 + ')');
		}
	}

	static int b (int i, int i1, byte unused) {
		try {
			++c;
			if (i == -1) {
				return 12345678;
			} else {
				i1 = i1 * (i & 127) / 128;
				if (i1 >= 2) {
					if (i1 <= 126) {
						return i1 + (i & 'ﾀ');
					}

					i1 = 126;
				}

				i1 = 2;
				return i1 + (i & 'ﾀ');
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "pe.D(" + i + ',' + i1 + ',' + unused + ')');
		}
	}

	static synchronized byte[] a (int var0, boolean var1) {
		try {
			++f;
			byte[] var2;
			if (~var0 == -101 && me.H > 0) {
				var2 = p.D[--me.H];
				p.D[me.H] = null;
				return var2;
			} else {
				if (!var1) {
					h = null;
				}

				if (var0 == 5000 && ~jd.int_t < -1) {
					var2 = te.yb[--jd.int_t];
					te.yb[jd.int_t] = null;
					return var2;
				} else if (var0 == 30000 && id.N > 0) {
					var2 = ib.bytes_i[--id.N];
					ib.bytes_i[id.N] = null;
					return var2;
				} else {
					return new byte[var0];
				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "pe.C(" + var0 + ',' + var1 + ')');
		}
	}

	static int a (int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if ((1 & var4) == 1) {
				int var7 = var1;
				var1 = var6;
				var6 = var7;
			}

			++e;
			var5 &= 3;
			return var3 != -101 ? 48 : (~var5 == -1 ? var2 : (var5 == 1 ? var0 : (var5 == 2 ? 1 - (var1 - (-var2 + 7)) : 1 - (var6 - (-var0 + 7)))));
		} catch (RuntimeException var8) {
			throw id.a(var8, "pe.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
}
