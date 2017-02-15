import java.util.zip.CRC32;

final class qe {
	static int d;
	static int g;
	static CRC32 crc32 = new CRC32();
	static int k;
	static int p;
	static int r;
	static int t = 0;
	static rd z;
	static pc B;
	static int C;
	static int[] D;
	static int[] E = new int[128];
	static int F = 0;
	static rd G = md.a((String) "Fallen lassen", (byte) 126);
	static rd _hasLoggedOut2;
	static oa[] mod_icons;
	static gb L;
	private static rd _hasLoggedOut = md.a((String) " has logged out)3", (byte) 123);
	private static rd y = md.a((String) "flash3:", (byte) 125);

	static {
		z = y;
		_hasLoggedOut2 = _hasLoggedOut;
		B = new pc(4096);
	}

	int a;
	int b;
	int c;
	int e;
	int f;
	int i;
	int j;
	int l;
	int m;
	int int_n;
	int o;
	int q;
	int int_s;
	int u;
	int int_v;
	int w;
	int A;
	int J;

	public static void a (int var0) {
		try {
			G = null;
			E = null;
			L = null;
			z = null;
			y = null;
			D = null;
			B = null;
			crc32 = null;
			if (var0 != 10517) {
				a(-94);
			}

			_hasLoggedOut2 = null;
			_hasLoggedOut = null;
			mod_icons = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "qe.D(" + var0 + ')');
		}
	}

	static rd a (byte var0, int var1) {
		try {
			rd var2 = new rd();
			++r;
			var2.stringBuffer = new byte[var1];
			if (var0 != -8) {
				return null;
			} else {
				var2.stringPointer = 0;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "qe.A(" + var0 + ',' + var1 + ')');
		}
	}

	static int a (int unused, int x, int y) {
		try {
			int var3 = sa.a('넵' + x, 17470, 91923 + y, 4) + -128 + (-128 + sa
					.a(10294 + x, 17470, y - -37821, 2) >> 1) + (sa
					.a(x, 17470, y, 1) + -128 >> 2);
			var3 = (int) ((double) var3 * 0.3D) - -35;
			++k;
			if (var3 < 10) {
				var3 = 10;
			} else if (var3 > 60) {
				var3 = 60;
			}

			return var3;
		} catch (RuntimeException var4) {
			throw id.a(var4, "qe.E(" + unused + ',' + x + ',' + y + ')');
		}
	}

	static int a (int var0, int var1, int var2, int var3, int var4) {
		try {
			++g;
			if (var0 != -35) {
				b(113);
			}

			int var5 = -v.wb[1024 * var3 / var2] + 65536 >> 1;
			return ((-var5 + 65536) * var1 >> 16) - -(var4 * var5 >> 16);
		} catch (RuntimeException var6) {
			throw id.a(var6, "qe.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void b (int var0) {
		int var6 = client.int_tb;

		try {
			++d;
			int var1 = client.Y.b(jb.V);
			int var2 = 0;
			int var3;
			if (var6 != 0) {
				var3 = client.Y.a(ta.xb[var2]);
				if (var1 < var3) {
					var1 = var3;
				}

				++var2;
			}

			for ( ; id.rb > var2 ; ++var2) {
				var3 = client.Y.a(ta.xb[var2]);
				if (var1 < var3) {
					var1 = var3;
				}
			}

			var1 += 8;
			if (var0 >= -37) {
				F = -10;
			}

			var3 = 21 + id.rb * 15;
			int var4;
			int var5;
			if (ee.int_h == -1) {
				if (~wb.nb < -5 && sb.int_b > 4 && wb.nb < 516 && ~sb.int_b > -339) {
					s.ub = true;
					var4 = -4 + wb.nb + -(var1 / 2);
					ud.I = var1;
					if (var1 + var4 > 512) {
						var4 = -var1 + 512;
					}

					bf.int_d = 0;
					wc.n = id.rb * 15 - -22;
					var5 = -4 + sb.int_b;
					if (var5 + var3 > 334) {
						var5 = 334 + -var3;
					}

					if (~var4 > -1) {
						var4 = 0;
					}

					uc.gc = var4;
					if (~var5 > -1) {
						var5 = 0;
					}

					n.eb = var5;
					return;
				}

				if (wb.nb > 553 && ~sb.int_b < -206 && wb.nb < 743 && ~sb.int_b > -467) {
					label99:
					{
						bf.int_d = 1;
						s.ub = true;
						wc.n = id.rb * 15 + 22;
						var4 = wb.nb - (553 + var1 / 2);
						var5 = sb.int_b + -205;
						ud.I = var1;
						if (var4 < 0) {
							var4 = 0;
							if (var6 == 0) {
								break label99;
							}
						}

						if (~(var4 + var1) < -191) {
							var4 = 190 + -var1;
						}
					}

					label94:
					{
						uc.gc = var4;
						if (var5 < 0) {
							var5 = 0;
							if (var6 == 0) {
								break label94;
							}
						}

						if (~(var3 + var5) < -262) {
							var5 = 261 + -var3;
						}
					}

					n.eb = var5;
					return;
				}

				if (wb.nb > 17 && ~sb.int_b < -358 && ~wb.nb > -497 && sb.int_b < 453) {
					label116:
					{
						ud.I = var1;
						wc.n = 22 + 15 * id.rb;
						bf.int_d = 2;
						s.ub = true;
						var4 = -(var1 / 2) + -17 + wb.nb;
						var5 = sb.int_b - 357;
						if (~var5 <= -1) {
							if (~(var3 + var5) >= -97) {
								break label116;
							}

							var5 = 96 - var3;
							if (var6 == 0) {
								break label116;
							}
						}

						var5 = 0;
					}

					label109:
					{
						n.eb = var5;
						if (~var4 > -1) {
							var4 = 0;
							if (var6 == 0) {
								break label109;
							}
						}

						if (~(var1 + var4) < -480) {
							var4 = 479 - var1;
						}
					}

					uc.gc = var4;
				}
			} else {
				ud.I = var1;
				wc.n = 22 + 15 * id.rb;
				s.ub = true;
				bf.int_d = 0;
				var4 = -(var1 / 2) + wb.nb;
				if (~(var1 + var4) < -766) {
					var4 = -var1 + 765;
				}

				if (~var4 > -1) {
					var4 = 0;
				}

				uc.gc = var4;
				var5 = sb.int_b;
				if (~(var3 + var5) < -504) {
					var5 = 503 - var3;
				}

				if (~var5 > -1) {
					var5 = 0;
				}

				n.eb = var5;
			}

		} catch (RuntimeException var7) {
			throw id.a(var7, "qe.C(" + var0 + ')');
		}
	}
}
