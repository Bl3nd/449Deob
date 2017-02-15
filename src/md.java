import java.io.IOException;

final class md {
	static int a;
	static int b = 127;
	static dd c = new dd(100);
	static int d;
	static int f;
	static int g;
	static int h;
	static int i;
	static int j;
	static int k;
	static int l;
	static int m;
	static int n;
	static long[] p = new long[100];
	static int q;
	static int int_s;
	static rd o = a((String) "(Y", (byte) 123);
	static long t = 0L;
	static rd u;
	static rd x;
	static int loginStage = 0;
	static rd z;
	private static rd v;
	private static rd w = a((String) "wishes to trade with you)3", (byte) 117);

	static {
		u = w;
		v = a("Drop", (byte) 121);
		x = v;
		z = a("Fehler bei der Verbindung zum Server)3", (byte) 124);
	}

	je e = new je();
	private je r;

	public md () {
		try {
			this.e.je_a = this.e;
			this.e.je_f = this.e;
		} catch (RuntimeException var2) {
			throw id.a(var2, "md.<init>(" + ')');
		}
	}

	static void a (byte var0, boolean clientLoggedIn) {
		try {
			if (var0 > 52) {
				++d;
				if (jc.cb != null) {
					try {
						id class_id = new id(4);
						class_id.writeByte((byte) 125, clientLoggedIn ? 2 : 3);
						class_id.writeMedium(-2016590992, 0);
						jc.cb.writeToStream(false, 4, 0, class_id.buffer);
					} catch (IOException var4) {
						try {
							jc.cb.a(25830);
						} catch (Exception var3) {
							var3.printStackTrace();
						}

						jc.cb = null;
						++be.int_m;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "md.A(" + var0 + ',' + clientLoggedIn + ')');
		}
	}

	public static void b (int var0) {
		try {
			z = null;
			p = null;
			if (var0 != 4) {
				a((byte) 122, true);
			}

			v = null;
			u = null;
			w = null;
			c = null;
			o = null;
			x = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "md.K(" + var0 + ')');
		}
	}

	static void a (pb archiveFile2, pb archiveFile7, byte unused) {
		try {
			++a;
			ke.archiveFile2 = archiveFile2;
			s.archiveFile7 = archiveFile7;
			rd.p = ke.archiveFile2.getLengthForIndex(3, false);
		} catch (RuntimeException var4) {
			throw id.a(var4, "md.L(" + (archiveFile2 != null ? "{...}" : "null") + ',' + (archiveFile7 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static rd a (String s, byte var1) {
		try {
			++int_s;
			byte[] bytes = s.getBytes();
			int length = bytes.length;
			int size = 0;
			rd class_rd = new rd();
			class_rd.stringBuffer = new byte[length];
			if (var1 < 113) {
				p = null;
			}

			while (size < length) {
				int i = bytes[size++] & 255;
				if (i <= 45 && i >= 40) {
					if (size >= length) {
						break;
					}

					int i1 = bytes[size++] & 255;
					class_rd.stringBuffer[class_rd.stringPointer++] = (byte) (-48 + i1 + (43 * i - 1720));
				} else if (i != 0) {
					class_rd.stringBuffer[class_rd.stringPointer++] = (byte) i;
				}
			}

			class_rd.d((byte) 119);
			return class_rd.a((byte) 32);
		} catch (RuntimeException var8) {
			throw id.a(var8, "md.G(" + (s != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final je a (byte unused) {
		try {
			++m;
			je class_je = this.r;
			if (class_je == this.e) {
				this.r = null;
				return null;
			} else {
				this.r = class_je.je_f;
				return class_je;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.F(" + unused + ')');
		}
	}

	final void a (je class_je, byte unused) {
		try {
			++k;
			if (class_je.je_a != null) {
				class_je.d(-26669);
			}

			class_je.je_a = this.e.je_a;
			class_je.je_f = this.e;
			class_je.je_a.je_f = class_je;
			class_je.je_f.je_a = class_je;
		} catch (RuntimeException var4) {
			throw id.a(var4, "md.M(" + "{...}" + ',' + unused + ')');
		}
	}

	final je b (byte var1) {
		try {
			++j;
			je var2 = this.e.je_a;
			if (this.e == var2) {
				this.r = null;
				return null;
			} else {
				this.r = var2.je_a;
				if (var1 <= 6) {
					x = null;
				}

				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.B(" + var1 + ')');
		}
	}

	final void a (int var1, je var2) {
		try {
			if (var2.je_a != null) {
				var2.d(-26669);
			}

			++i;
			var2.je_a = this.e;
			var2.je_f = this.e.je_f;
			var2.je_a.je_f = var2;
			var2.je_f.je_a = var2;
			if (var1 != 0) {
				this.a(50, null);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "md.C(" + var1 + ',' + "{...}" + ')');
		}
	}

	final void a (int unused) {
		try {
			++l;
			while (true) {
				je class_je = this.e.je_f;
				if (this.e == class_je) {
					return;
				}

				class_je.d(-26669);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "md.D(" + unused + ')');
		}
	}

	final je c (int var1) {
		try {
			++f;
			if (var1 >= -92) {
				this.b((byte) 61);
			}

			je var2 = this.r;
			if (var2 == this.e) {
				this.r = null;
				return null;
			} else {
				this.r = var2.je_a;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.E(" + var1 + ')');
		}
	}

	final je a (boolean var1) {
		try {
			++h;
			je var2 = this.e.je_a;
			if (var2 == this.e) {
				return null;
			} else {
				var2.d(-26669);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.J(" + var1 + ')');
		}
	}

	final je d (int var1) {
		try {
			je var2 = this.e.je_f;
			if (var1 > -42) {
				return null;
			} else {
				++n;
				if (var2 == this.e) {
					return null;
				} else {
					var2.d(-26669);
					return var2;
				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.I(" + var1 + ')');
		}
	}

	final je c (byte unused) {
		try {
			++q;
			je class_je = this.e.je_f;
			if (this.e == class_je) {
				this.r = null;
				return null;
			} else {
				this.r = class_je.je_f;
				return class_je;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "md.N(" + unused + ')');
		}
	}

	final void a (byte var1, je var2, je var3) {
		try {
			++g;
			if (var3.je_a != null) {
				var3.d(-26669);
			}

			var3.je_a = var2.je_a;
			var3.je_f = var2;
			var3.je_a.je_f = var3;
			var3.je_f.je_a = var3;
			if (var1 < 102) {
				a(null, null, (byte) -12);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "md.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + "{...}" + ')');
		}
	}
}
