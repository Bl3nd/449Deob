import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class we {
	static rd toPlayOnThisWorldMoveToAFreeAreaFirst2;
	static rd backhmid1 = md.a((String) "backhmid1", (byte) 121);
	static rd c = md.a((String) ")2", (byte) 120);
	static rd pleaseWait_attemptingToReestablish2;
	static int f = 0;
	static int g = 0;
	static int h;
	static rd i;
	static int k;
	static rd l;
	static rd rd_m = md.a((String) "Ihr Spielkonto wird bereits benutzt)3", (byte) 124);
	static long n;
	static int o;
	static int p;
	static int q = 0;
	static boolean r = false;
	static rd rd_s;
	static int int_t = -1;
	static int u;
	static int v;
	static int w;
	private static rd pleaseWait_attemptingToReestablish = md.a((String) "Please wait )2 attempting to reestablish", (byte) 118);
	private static rd toPlayOnThisWorldMoveToAFreeAreaFirst = md.a((String) "To play on this world move to a free area first", (byte) 120);

	static {
		toPlayOnThisWorldMoveToAFreeAreaFirst2 = toPlayOnThisWorldMoveToAFreeAreaFirst;
		pleaseWait_attemptingToReestablish2 = pleaseWait_attemptingToReestablish;
		l = md.a("RuneScape wurde aktualisiert(Q", (byte) 126);
		rd_s = md.a("Der Anmelde)2Server ist offline)3", (byte) 120);
		i = md.a("null", (byte) 117);
	}

	static oa[] a (byte unused, int index, pb archiveFile8, int i1) {
		try {
			++h;
			return !t.a(index, (byte) -124, i1, archiveFile8) ? null : kd.c(0);
		} catch (RuntimeException var5) {
			throw id.a(var5, "we.F(" + unused + ',' + index + ',' + (archiveFile8 != null ? "{...}" : "null") + ',' + i1 + ')');
		}
	}

	public static void a (int var0) {
		try {
			rd_m = null;
			pleaseWait_attemptingToReestablish = null;
			toPlayOnThisWorldMoveToAFreeAreaFirst = null;
			if (var0 < 17) {
				r = true;
			}

			c = null;
			pleaseWait_attemptingToReestablish2 = null;
			backhmid1 = null;
			i = null;
			l = null;
			rd_s = null;
			toPlayOnThisWorldMoveToAFreeAreaFirst2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "we.E(" + var0 + ')');
		}
	}

	static String a (int var0, Throwable var1) throws IOException {
		int var13 = client.int_tb;

		String var2;
		label40:
		{
			++v;
			if (!(var1 instanceof ib)) {
				var2 = "";
				if (var13 == 0) {
					break label40;
				}
			}

			ib var3 = (ib) var1;
			var1 = var3.e;
			var2 = var3.string_f + " | ";
		}

		StringWriter var15 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var15);
		var1.printStackTrace(var4);
		var4.close();
		String var5 = var15.toString();
		if (var0 != -22155) {
			return null;
		} else {
			BufferedReader var6 = new BufferedReader(new StringReader(var5));
			String var7 = var6.readLine();

			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					break;
				}

				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 - -1);
				if (var9 >= 0 && ~var10 <= -1) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						var11 = var11.substring(0, var12) + var11.substring(5 + var12);
						var2 = var2 + var11 + ' ';
						if (var13 == 0) {
							continue;
						}
					}

					var8 = var8.substring(0, var9);
				}

				var8 = var8.trim();
				var8 = var8.substring(1 + var8.lastIndexOf(32));
				var8 = var8.substring(var8.lastIndexOf(9) - -1);
				var2 = var2 + var8 + ' ';
				if (var13 != 0) {
					break;
				}
			}

			var2 = var2 + "| " + var7;
			return var2;
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4) {
		int var12 = client.int_tb;

		try {
			++w;
			jc var5 = (jc) ra.x.c((byte) 53);
			if (var12 == 0 && var5 == null) {
				if (var3 < 53) {
					a(57);
				}
			} else {
				do {
					if (var5.L != -1 || var5.U != null) {
						label127:
						{
							int var6;
							label94:
							{
								var6 = 0;
								if (~var5.V > ~var1) {
									var6 += -var5.V + var1;
									if (var12 == 0) {
										break label94;
									}
								}

								if (~var1 > ~var5.T) {
									var6 += var5.T - var1;
								}
							}

							label89:
							{
								if (~var2 < ~var5.I) {
									var6 += var2 - var5.I;
									if (var12 == 0) {
										break label89;
									}
								}

								if (~var2 > ~var5.G) {
									var6 += var5.G - var2;
								}
							}

							if (~(var6 + -64) < ~var5.S || ~md.b == -1 || var5.R != var0) {
								if (var5.B != null) {
									e.Nb.a(var5.B);
									var5.B = null;
								}

								if (var5.F == null) {
									break label127;
								}

								e.Nb.a(var5.F);
								var5.F = null;
								if (var12 == 0) {
									break label127;
								}
							}

							var6 -= 64;
							if (var6 < 0) {
								var6 = 0;
							}

							int var7;
							label72:
							{
								var7 = (var5.S - var6) * md.b / var5.S;
								if (var5.B == null) {
									if (~var5.L > -1) {
										break label72;
									}

									ia var8 = ia.a(bd.cacheFile4, var5.L, 0);
									if (var8 == null) {
										break label72;
									}

									na var9 = var8.a().a(m.h_m);
									ac var10 = ac.a(var9, 100, var7);
									var10.f(-1);
									e.Nb.b(var10);
									var5.B = var10;
									if (var12 == 0) {
										break label72;
									}
								}

								var5.B.g(var7);
							}

							if (var5.F == null) {
								if (var5.U == null || (var5.N -= var4) > 0) {
									break label127;
								}

								int var14 = (int) (Math.random() * (double) var5.U.length);
								ia var15 = ia.a(bd.cacheFile4, var5.U[var14], 0);
								if (var15 == null) {
									break label127;
								}

								na var16 = var15.a().a(m.h_m);
								ac var11 = ac.a(var16, 100, var7);
								var11.f(0);
								e.Nb.b(var11);
								var5.N = (int) (Math.random() * (double) (-var5.z + var5.P)) + var5.z;
								var5.F = var11;
								if (var12 == 0) {
									break label127;
								}
							}

							var5.F.g(var7);
							if (!var5.F.c(-32303)) {
								var5.F = null;
							}
						}
					}

					var5 = (jc) ra.x.a((byte) -68);
				} while (var5 != null);

				if (var3 < 53) {
					a(57);
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "we.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void b (int unused) {
		try {
			++u;
			ee.dd_c.c(-119);
			df.dd_e.c(-117);
			s.vb.c(-99);
		} catch (RuntimeException var2) {
			throw id.a(var2, "we.B(" + unused + ')');
		}
	}

	static void c (int unused) {
		try {
			++p;
			//System.err.println(client.int_qb);
			if (client.int_qb == 1) {
				if (wb.nb >= 539 && wb.nb <= 573 && ~sb.int_b <= -170 && ~sb.int_b > -206 && ta.Zb[0] != -1) {
					pd.g = 0;
					db.F = true;
					pe.l = true;
				}

				if (~wb.nb <= -570 && wb.nb <= 599 && sb.int_b >= 168 && ~sb.int_b > -206 && ~ta.Zb[1] != 0) {
					db.F = true;
					pe.l = true;
					pd.g = 1;
				}

				if (~wb.nb <= -598 && wb.nb <= 627 && sb.int_b >= 168 && sb.int_b < 205 && ta.Zb[2] != -1) {
					pe.l = true;
					db.F = true;
					pd.g = 2;
				}

				if (wb.nb >= 625 && ~wb.nb >= -670 && sb.int_b >= 168 && sb.int_b < 203 && ~ta.Zb[3] != 0) {
					pd.g = 3;
					db.F = true;
					pe.l = true;
				}

				if (~wb.nb <= -667 && ~wb.nb >= -697 && ~sb.int_b <= -169 && ~sb.int_b > -206 && ~ta.Zb[4] != 0) {
					pe.l = true;
					db.F = true;
					pd.g = 4;
				}

				if (~wb.nb <= -695 && wb.nb <= 724 && ~sb.int_b <= -169 && ~sb.int_b > -206 && ta.Zb[5] != -1) {
					db.F = true;
					pe.l = true;
					pd.g = 5;
				}

				if (wb.nb >= 722 && ~wb.nb >= -757 && sb.int_b >= 169 && ~sb.int_b > -206 && ~ta.Zb[6] != 0) {
					pe.l = true;
					db.F = true;
					pd.g = 6;
				}

				if (~wb.nb <= -541 && ~wb.nb >= -575 && ~sb.int_b <= -467 && sb.int_b < 502 && ~ta.Zb[7] != 0) {
					db.F = true;
					pd.g = 7;
					pe.l = true;
				}

				if (wb.nb >= 572 && ~wb.nb >= -603 && ~sb.int_b <= -467 && sb.int_b < 503 && ta.Zb[8] != -1) {
					db.F = true;
					pe.l = true;
					pd.g = 8;
				}

				if (~wb.nb <= -600 && wb.nb <= 629 && ~sb.int_b <= -467 && ~sb.int_b > -504 && ta.Zb[9] != -1) {
					pe.l = true;
					pd.g = 9;
					db.F = true;
				}

				if (wb.nb >= 627 && wb.nb <= 671 && ~sb.int_b <= -468 && sb.int_b < 502 && ta.Zb[10] != -1) {
					pd.g = 10;
					pe.l = true;
					db.F = true;
				}

				if (~wb.nb <= -670 && ~wb.nb >= -700 && sb.int_b >= 466 && ~sb.int_b > -504 && ta.Zb[11] != -1) {
					pd.g = 11;
					db.F = true;
					pe.l = true;
				}

				if (~wb.nb <= -697 && ~wb.nb >= -727 && sb.int_b >= 466 && ~sb.int_b > -504 && ta.Zb[12] != -1) {
					pe.l = true;
					db.F = true;
					pd.g = 12;
				}

				if (wb.nb >= 724 && ~wb.nb >= -759 && sb.int_b >= 466 && sb.int_b < 502 && ~ta.Zb[13] != 0) {
					pd.g = 13;
					pe.l = true;
					db.F = true;
				}
			}

		} catch (RuntimeException var2) {
			throw id.a(var2, "we.C(" + unused + ')');
		}
	}
}
