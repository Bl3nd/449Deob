final class ie {
	static md a = new md();
	static rd b = md.a((String) "Name des Gegenstands eingeben:", (byte) 127);
	static int c;
	static int e;
	static int f;
	static int h;
	static int i;
	static boolean redrawIcons = false;
	static uc writeStream = new uc(5000);
	static int[] m;
	static rd n = md.a((String) "Wen m-Ochten Sie hinzuf-Ugen?", (byte) 119);
	static volatile int o = 0;
	static oa p;
	int d;
	int g;
	int j;

	static rd a (int var0, id var1) {
		try {
			if (var0 != 0) {
				a((byte) 47);
			}

			++c;
			return bd.a(32767, (byte) 113, var1);
		} catch (RuntimeException var3) {
			throw id.a(var3, "ie.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int var0) {
		try {
			++f;
			s.vb.c(-96);
			if (var0 != 0) {
				a(-71, null);
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ie.B(" + var0 + ')');
		}
	}

	public static void b (int var0) {
		try {
			n = null;
			a = null;
			b = null;
			p = null;
			writeStream = null;
			m = null;
			if (var0 != 32767) {
				a((byte) 63);
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ie.C(" + var0 + ')');
		}
	}

	static void a (byte unused) {
		try {
			++h;
			se.q.a(-1926);
			le.eb = v.c(le.eb);
		} catch (RuntimeException var2) {
			throw id.a(var2, "ie.A(" + unused + ')');
		}
	}

	static rd a (rd[] rds, byte unused, int length, int pos) {
		try {
			int var4;
			++i;
			var4 = 0;
			int var5 = 0;
			if (length > var5) {
				do {
					if (rds[var5 + pos] == null) {
						rds[pos + var5] = ha.rd_fb;
					}

					var4 += rds[pos - -var5].stringPointer;
					++var5;
				} while (length > var5);
			}

			byte[] destBuffer = new byte[var4];
			int destPointer = 0;
			int var8 = 0;
			rd class_rd;
			if (length <= var8) {
				class_rd = new rd();
				class_rd.stringPointer = var4;
				class_rd.stringBuffer = destBuffer;
				return class_rd;
			} else {
				do {
					class_rd = rds[var8 + pos];
					ef.copyBytes(class_rd.stringBuffer, 0, destBuffer, destPointer, class_rd.stringPointer);
					destPointer += class_rd.stringPointer;
					++var8;
				} while (~length < ~var8);

				class_rd = new rd();
				class_rd.stringPointer = var4;
				class_rd.stringBuffer = destBuffer;
				return class_rd;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ie.E(" + (rds != null ? "{...}" : "null") + ',' + unused + ',' + length + ',' + pos + ')');
		}
	}
}
