final class dd {
	static int[] ints_a = new int[4000];
	static rd b12_full = md.a((String) "b12_full", (byte) 114);
	static rd pressChangeYourPasswordOnFrontPage2;
	static int int_d;
	static int int_e;
	static pb archiveFile6;
	static rd privateChat2;
	static int int_h;
	static rd backbase2 = md.a((String) "backbase2", (byte) 123);
	static int int_j;
	static int[] ints_l;
	static rd rd_m = md.a((String) "Bitte versuchen Sie es erneut)3", (byte) 122);
	static int int_n;
	static int int_o;
	static int int_p;
	static int int_q = 0;
	static int int_s;
	static int int_t;
	static ke cacheFile12;
	static rd _fromYourignoreListFirst2;
	static int x;
	static int y;
	static int z;
	static int B;
	private static rd pressChangeYourPasswordOnFrontPage = md.a((String) "Press (Wchange your password(W on front page)3", (byte) 118);
	private static rd privateChat = md.a((String) "Private chat", (byte) 117);
	private static rd _fromYourignoreListFirst = md.a((String) " from your ignore list first", (byte) 120);

	static {
		_fromYourignoreListFirst2 = _fromYourignoreListFirst;
		pressChangeYourPasswordOnFrontPage2 = pressChangeYourPasswordOnFrontPage;
		privateChat2 = privateChat;
		B = 0;
	}

	private jb A = new jb();
	private pc C;
	private be D = new be();
	private int E;
	private int F;

	@SuppressWarnings("StatementWithEmptyBody")
	dd (int len) {
		try {
			this.F = len;
			this.E = len;

			int size;
			for (size = 1; size + size < len ; size += size) {
			}
			this.C = new pc(size);
		} catch (RuntimeException var3) {
			throw id.a(var3, "dd.<init>(" + len + ')');
		}
	}

	static void a (int i, int plane, nc[] class_ncs, int i2, int i3, ua class_ua, byte unused, byte[] buffer, int i4, int i5, int i6) {
		try {
			id class_id = new id(buffer);
			int fileRequest = -1;
			do {
				int i8 = class_id.readUnsignedSmart((byte) -52);
				if (i8 == 0) {
					break;
				}

				fileRequest += i8;
				int i9 = 0;
				while (true) {
					int i10 = class_id.readUnsignedSmart((byte) -80);
					if (i10 == 0) {
						break;
					}

					i9 += -1 + i10;
					int i11 = 63 & i9;
					int i12 = i9 >> 6 & 63;
					int i13 = i9 >> 12;
					int i14 = class_id.readUnsignedByte((byte) 116);
					int position = i14 >> 2;
					int i16 = 3 & i14;
					if (i5 == i13 && i12 >= i2 && i12 < i2 + 8 && i6 <= i11 && i11 < 8 + i6) {
						bd class_bd = ub.a(-70, fileRequest);
						int x = i4 + pe.a(7 & i11, class_bd.w, 7 & i12, -101, i16, i, class_bd.h);
						int y = i3 + db.a(class_bd.w, class_bd.h, -128, i16, i12 & 7, i, i11 & 7);
						if (x > 0 && y > 0 && x < 103 && y < 103) {
							int i17 = plane;
							if ((2 & d.bytes_j[1][x][y]) == 2) {
								i17 = plane - 1;
							}

							nc class_nc = null;
							if (i17 >= 0) {
								class_nc = class_ncs[i17];
							}

							ca.a(y, position, plane, class_ua, class_nc, 3 & i + i16, fileRequest, x, (byte) -55);
						}
					}
				}
			} while (true);

			++int_h;
		} catch (RuntimeException var28) {
			throw id.a(var28, "dd.G(" + i + ',' + plane + ',' + (class_ncs != null ? "{...}" : "null") + ',' + i2 + ',' + i3 + ',' + (class_ua != null ? "{...}" : "null") + ',' + unused + ',' + (buffer != null ? "{...}" : "null") + ',' + i4 + ',' + i5 + ',' + i6 + ')');
		}
	}

	static void a (int unused) {
		try {
			je.dd_w.c(-108);
			++int_e;
		} catch (RuntimeException var2) {
			throw id.a(var2, "dd.H(" + unused + ')');
		}
	}

	static void a (int i, int unused, int x, e class_e, int y) {
		try {
			++dd.x;
			if (me.lb < 50 && md.b != 0) {
				if (class_e.ints_sb != null && class_e.ints_sb.length > i) {
					int i1 = class_e.ints_sb[i];
					if (i1 != 0) {
						int i2 = i1 >> 8;
						int i3 = (114 & i1) >> 4;
						kd.B[me.lb] = i2;
						int i4 = 15 & i1;
						int i5 = (-64 + x) / 128;
						int i6 = (-64 + y) / 128;
						wc.o[me.lb] = i3;
						ba.ints_r[me.lb] = 0;
						eb.ias_c[me.lb] = null;
						gd.ints_n[me.lb] = (i5 << 16) + (i6 << 8) + i4;
						++me.lb;
					}
				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "dd.D(" + i + ',' + unused + ',' + x + ',' + (class_e != null ? "{...}" : "null") + ',' + y + ')');
		}
	}

	static void b (int unused) {
		try {
			++int_t;
			jb.L = true;
			ua.w = true;
		} catch (RuntimeException var2) {
			throw id.a(var2, "dd.I(" + unused + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	static void a (int localY, int unused, int localX, int plane, int regionX, int regionY) {
		try {
			++int_p;
			if (regionX != ub.G || regionY != jc.Y || plane != af.int_m && jb.L) {
				ub.G = regionX;
				af.int_m = plane;
				if (!jb.L) {
					af.int_m = 0;
				}

				jc.Y = regionY;
				bd.a(false, 25);
				nd.a(0, null, false, sa.loading_PleaseWait2);
				int i = kd.int_w;
				kd.int_w = 8 * (regionX + -6);
				int i1 = jc.X;
				jc.X = regionY * 8 - 48;
				int y = -i1 + jc.X;
				i1 = jc.X;
				int x = kd.int_w - i;
				i = kd.int_w;
				int i4 = 0;
				do {
					b class_b = ta.Nb[i4];
					if (class_b != null) {
						int i5 = 0;
						do {
							class_b.xc[i5] -= x;
							class_b.Hc[i5] -= y;
							++i5;
						} while (i5 < 10);

						class_b.y_ -= y * 128;
						class_b.x_ -= 128 * x;
					}

					++i4;
				} while (i4 < '耀');

				for (int index = 0 ; index < 2048 ; ++index) {
					td class_td = f.Lc[index];
					if (class_td != null) {
						int i2 = 0;
						do {
							class_td.xc[i2] -= x;
							class_td.Hc[i2] -= y;
							++i2;
						} while (i2 < 10);

						class_td.x_ -= x * 128;
						class_td.y_ -= 128 * y;
					}
				}

				ce.plane = plane;
				byte b = 0;
				af.td_p.a((byte) -121, false, localY, localX);
				byte b1 = 104;
				byte b2 = 1;
				byte b3 = 0;
				if (x < 0) {
					b = 103;
					b2 = -1;
					b1 = -1;
				}

				byte b4 = 1;
				byte b5 = 104;
				if (y < 0) {
					b4 = -1;
					b5 = -1;
					b3 = 103;
				}

				int x2 = b;
				do {
					int y2 = b3;
					do {
						int x3 = x2 + x;
						int y3 = y + y2;
						int plane2 = 0;
						do {
							if (x3 >= 0 && y3 >= 0 && x3 < 104 && y3 < 104) {
								lc.s[plane2][x2][y2] = lc.s[plane2][x3][y3];
							} else {
								lc.s[plane2][x2][y2] = null;
							}

							++plane2;
						} while (plane2 < 4);

						y2 += b4;
					} while (b5 != y2);

					x2 += b2;
				} while (x2 != b1);

				p class_p = (p) kd.j.c((byte) 92);
				if (class_p == null) {
					bc.k = false;
					if (jb.M != 0) {
						jb.M -= x;
						me.L -= y;
					}

					me.lb = 0;
					ab.int_d = -1;
					ib.md_a.a(114);
					jc.J.a(~-86);
				} else {
					do {
						class_p.J -= y;
						class_p.X -= x;
						if (class_p.X < 0 || class_p.J < 0 || class_p.X >= 104 || class_p.J >= 104) {
							class_p.d(~26668);
						}

						class_p = (p) kd.j.a((byte) -68);
					} while (class_p != null);

					bc.k = false;
					if (jb.M != 0) {
						jb.M -= x;
						me.L -= y;
					}

					me.lb = 0;
					ab.int_d = -1;
					ib.md_a.a(114);
					jc.J.a(~-86);
				}
			}
		} catch (RuntimeException var24) {
			throw id.a(var24, "dd.B(" + localY + ',' + unused + ',' + localX + ',' + plane + ',' + regionX + ',' + regionY + ')');
		}
	}

	static rd a (int i, int unused, int i1) {
		try {
			++int_j;
			int difference = i - i1;
			if (~difference > 8) {
				return pd.s;
			} else if (~difference > 5) {
				return rb.p;
			} else if (~difference > 2) {
				return jb.Q;
			} else {
				return difference < 0 ? wd.rd_e : difference > 9 ? me.z : difference > 6 ? r.S : difference > 3 ? p.U : difference > 0 ? u.qb : ab.rd_j;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "dd.C(" + i + ',' + unused + ',' + i1 + ')');
		}
	}

	public static void a (byte unused) {
		try {
			archiveFile6 = null;
			rd_m = null;
			_fromYourignoreListFirst2 = null;
			_fromYourignoreListFirst = null;
			ints_l = null;
			b12_full = null;
			pressChangeYourPasswordOnFrontPage = null;
			privateChat = null;
			privateChat2 = null;
			cacheFile12 = null;
			backbase2 = null;
			ints_a = null;
			pressChangeYourPasswordOnFrontPage2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "dd.K(" + unused + ')');
		}
	}

	final void a (int unused, jb class_jb, long fileRequest) {
		try {
			++int_n;
			if (this.F != 0) {
				--this.F;
			} else {
				jb class_jb2 = this.D.a((byte) -53);
				assert class_jb2 != null;
				class_jb2.d(-26669);
				class_jb2.a((byte) -127);
				if (this.A == class_jb2) {
					class_jb2 = this.D.a((byte) -53);
					assert class_jb2 != null;
					class_jb2.d(-26669);
					class_jb2.a((byte) -123);
				}
			}
			this.C.a((byte) -7, fileRequest, class_jb);
			this.D.a(class_jb, (byte) -124);
		} catch (RuntimeException var6) {
			throw id.a(var6, "dd.J(" + unused + ',' + (class_jb != null ? "{...}" : "null") + ',' + fileRequest + ')');
		}
	}

	final jb a (byte unused, long fileRequest) {
		try {
			++int_s;
			jb class_jb = (jb) this.C.a(-1, fileRequest);
			if (class_jb != null) {
				this.D.a(class_jb, (byte) -117);
			}

			return class_jb;
		} catch (RuntimeException var5) {
			throw id.a(var5, "dd.A(" + unused + ',' + fileRequest + ')');
		}
	}

	final void c (int unused) {
		try {
			++int_d;
			do {
				jb class_jb = this.D.a((byte) -53);
				if (class_jb == null) {
					break;
				}

				class_jb.d(-26669);
				class_jb.a((byte) -104);
			} while (true);

			this.F = this.E;
		} catch (RuntimeException var4) {
			throw id.a(var4, "dd.F(" + unused + ')');
		}
	}

	final void a (long fileRequest, int unused) {
		try {
			++y;
			jb class_jb = (jb) this.C.a(-1, fileRequest);
			if (class_jb != null) {
				class_jb.d(-26669);
				class_jb.a((byte) -119);
				++this.F;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "dd.E(" + fileRequest + ',' + unused + ')');
		}
	}
}
