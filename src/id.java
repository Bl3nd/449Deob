import java.awt.Graphics;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

class id extends je {
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static long F = 0L;
	static int G;
	static int I;
	static int J;
	static int K;
	static int L;
	static int[] M;
	static int N = 0;
	static int O;
	static int P;
	static rd loadingConfig2;
	static int R;
	static int S;
	static int T;
	static int V;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static int ab;
	static int bb;
	static int db;
	static rd eb = null;
	static oa fb;
	static int gb = (int) (Math.random() * 17.0D) + -8;
	static int ib;
	static int int_jb;
	static int int_kb;
	static rd z = md.a((String) "Texturen geladen)3", (byte) 120);
	static rd U = md.a((String) "Stufe)2", (byte) 122);
	static rd p11_full = md.a((String) "p11_full", (byte) 126);
	static int lb;
	static int mb;
	static int nb;
	static int ob;
	static int pb;
	static int qb;
	static int rb = 0;
	static int sb;
	static int tb;
	static int ub;
	static int vb;
	static int int_wb;
	static int xb;
	static int yb;
	static int zb;
	static int Ab;
	static int Bb;
	static int Cb;
	static int Db;
	static int Eb;
	static int Fb;
	static int Gb;
	static int Hb;
	static int Jb;
	static rd Kb = md.a((String) " hat sich eingeloggt)3", (byte) 114);
	static rd Lb = md.a((String) "Ihr Charakter)2Profil wird in:", (byte) 120);
	static int Mb;
	static int Nb;
	static int Ob;
	static int Pb;
	static int Qb;
	static int[] Rb;
	static int Sb;
	static int Tb;
	private static rd loadingConfig = md.a((String) "Loading config )2 ", (byte) 123);

	static {
		loadingConfig2 = loadingConfig;
	}

	int pointer;
	byte[] buffer;

	id (int var1) {
		try {
			this.buffer = pe.a(var1, true);
			this.pointer = 0;
		} catch (RuntimeException var3) {
			throw a(var3, "id.<init>(" + var1 + ')');
		}
	}

	id (byte[] buffer) {
		try {
			this.buffer = buffer;
			this.pointer = 0;
		} catch (RuntimeException var3) {
			throw a(var3, "id.<init>(" + (buffer != null ? "{...}" : "null") + ')');
		}
	}

	static ib a (Throwable var0, String var1) {
		++int_kb;
		ib var2;
		if (var0 instanceof ib) {
			var2 = (ib) var0;
			var2.string_f = var2.string_f + ' ' + var1;
		} else {
			var2 = new ib(var0, var1);
		}

		return var2;
	}

	static void a (byte unused, boolean clientLoggedIn, ff class_ff) {
		try {
			++vb;
			if (jc.cb != null) {
				try {
					jc.cb.a(25830);
				} catch (Exception e) {
					e.printStackTrace();
				}

				jc.cb = null;
			}

			jc.cb = class_ff;
			md.a((byte) 94, clientLoggedIn);
			je.int_t = 0;
			wa.cb.pointer = 0;
			te.Qb = null;
			pd.V = null;

			u class_u;
			do {
				class_u = (u) rd.F.a((byte) 104);
				if (class_u == null) {
					break;
				}

				ud.N.a((byte) -7, class_u.script, class_u);
				--gf.int_r;
				++we.g;
			} while (true);

			do {
				class_u = (u) qe.B.a((byte) 104);
				if (class_u == null) {
					break;
				}

				jb.J.b(class_u, (byte) -20);
				kb.c.a((byte) -7, class_u.script, class_u);
				++o.int_r;
				--sd.O;
			} while (true);

			if (sd.encryption != 0) {
				try {
					id class_id = new id(4);
					class_id.writeByte((byte) -29, 4);
					class_id.writeByte((byte) -86, (int) sd.encryption);
					class_id.writeShort(0, (byte) 86);
					jc.cb.writeToStream(false, 4, 0, class_id.buffer);
				} catch (IOException var6) {
					try {
						jc.cb.a(25830);
					} catch (Exception var5) {
						var5.printStackTrace();
					}

					jc.cb = null;
					++be.int_m;
				}
			}

			jc.Q = 0;
			ge.W = pa.c(0);
		} catch (RuntimeException var8) {
			throw a(var8, "id.VA(" + unused + ',' + clientLoggedIn + ',' + (class_ff != null ? "{...}" : "null") + ')');
		}
	}

	public static void k (int var0) {
		try {
			loadingConfig2 = null;
			M = null;
			Rb = null;
			eb = null;
			z = null;
			Lb = null;
			if (var0 != 24480) {
				k(-106);
			}

			U = null;
			Kb = null;
			fb = null;
			loadingConfig = null;
			p11_full = null;
		} catch (RuntimeException var2) {
			throw a(var2, "id.Q(" + var0 + ')');
		}
	}

	static void j (byte var0) {
		try {
			try {
				Graphics graphics = rd.canvas.getGraphics();
				l.o.a(0, 0, 4, graphics);
				n.hb.a(0, 0, 357, graphics);
				if (var0 <= 72) {
					return;
				}

				le.nb.a(0, 722, 4, graphics);
				nd.gd.a(0, 743, 205, graphics);
				ha.jd_mb.a(0, 0, 0, graphics);
				e.jd_fb.a(0, 516, 4, graphics);
				ce.jd_f.a(0, 516, 205, graphics);
				i.H.a(0, 496, 357, graphics);
				client.jd_kb.a(0, 0, 338, graphics);
			} catch (Exception var2) {
				rd.canvas.repaint();
			}

			++G;
		} catch (RuntimeException var3) {
			throw a(var3, "id.BA(" + var0 + ')');
		}
	}

	static rd d (byte var0, int var1) {
		try {
			++Qb;
			if (var0 > -85) {
				a(null, null);
			}

			return pc.a((byte) 126, new rd[]{
					bf.a(var1 >> 24 & 255, -31766), l.X,
					bf.a((16721453 & var1) >> 16, -31766), l.X,
					bf.a(var1 >> 8 & 255, -31766), l.X,
					bf.a(var1 & 255, -31766)
			});
		} catch (RuntimeException var3) {
			throw a(var3, "id.NA(" + var0 + ',' + var1 + ')');
		}
	}

	final void writeShortA (byte unused, int value) {
		try {
			++Jb;
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) (value + 128);
		} catch (RuntimeException var4) {
			throw a(var4, "id.DB(" + unused + ',' + value + ')');
		}
	}

	final int readInt (byte unused) {
		try {
			++int_jb;
			this.pointer += 4;
			return (0xff0000 & this.buffer[this.pointer - 3] << 16) + (0xff000000 & this.buffer[this.pointer - 4] << 24) + ((this.buffer[this.pointer - 2] & 255) << 8) + (255 & this.buffer[this.pointer - 1]);
		} catch (RuntimeException var3) {
			throw a(var3, "id.MA(" + unused + ')');
		}
	}

	final int b (byte var1) {
		try {
			this.pointer += 2;
			++bb;
			int var2 = (255 & -128 + this.buffer[-2 + this.pointer]) + ((255 & this.buffer[this.pointer + -1]) << 8);
			if (var2 > 32767) {
				var2 -= 65536;
			}

			int var3 = -14 % ((67 - var1) / 56);
			return var2;
		} catch (RuntimeException var4) {
			throw a(var4, "id.CB(" + var1 + ')');
		}
	}

	final void b (byte var1, int var2) {
		try {
			this.buffer[this.pointer++] = (byte) (-var2);
			++qb;
			if (var1 != 108) {
				M = null;
			}
		} catch (RuntimeException var4) {
			throw a(var4, "id.LB(" + var1 + ',' + var2 + ')');
		}
	}

	final byte e (int var1) {
		try {
			++Pb;
			if (var1 >= -106) {
				this.buffer = null;
			}

			return (byte) (-128 + this.buffer[this.pointer++]);
		} catch (RuntimeException var3) {
			throw a(var3, "id.GA(" + var1 + ')');
		}
	}

	final int c (boolean var1) {
		try {
			this.pointer += 2;
			if (var1) {
				loadingConfig = null;
			}

			++O;
			int var2 = (this.buffer[this.pointer - 1] + -128 & 255) + ((this.buffer[this.pointer - 2] & 255) << 8);
			if (~var2 < -32768) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var3) {
			throw a(var3, "id.S(" + var1 + ')');
		}
	}

	final int d (boolean var1) {
		try {
			++ib;
			if (var1) {
				this.readByte(false);
			}

			this.pointer += 2;
			int var2 = (this.buffer[this.pointer + -2] & 255) + ((this.buffer[-1 + this.pointer] & 255) << 8);
			if (var2 > 32767) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var3) {
			throw a(var3, "id.FB(" + var1 + ')');
		}
	}

	final byte readByte (boolean unused) {
		try {
			++int_wb;
			return this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw a(var3, "id.M(" + unused + ')');
		}
	}

	final void writeByteA (int unused, int value) {
		try {
			++ob;
			this.buffer[this.pointer++] = (byte) (128 + value);
		} catch (RuntimeException var4) {
			throw a(var4, "id.PB(" + unused + ',' + value + ')');
		}
	}

	final int c (byte var1) {
		try {
			if (var1 < 67) {
				return 2;
			} else {
				++B;
				return -128 + this.buffer[this.pointer++] & 255;
			}
		} catch (RuntimeException var3) {
			throw a(var3, "id.HA(" + var1 + ')');
		}
	}

	final void a (int unused, rd class_rd) {
		try {
			++Z;
			this.pointer += class_rd.a(-91, 0, this.buffer, this.pointer, class_rd.b(-29348));
			this.buffer[this.pointer++] = 0;
		} catch (RuntimeException var4) {
			throw a(var4, "id.TB(" + unused + ',' + (class_rd != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int var1, byte[] var2, int var3, int var4) {
		int var6 = client.int_tb;

		try {
			++X;
			int var5 = -1 + var4 + var3;
			if (var1 >= -67) {
				F = -71L;
				if (var6 == 0 && ~var5 > ~var4) {
					return;
				}
			} else if (~var5 > ~var4) {
				return;
			}

			do {
				var2[var5] = (byte) (this.buffer[this.pointer++] - 128);
				--var5;
			} while (~var5 <= ~var4);

		} catch (RuntimeException var7) {
			throw a(var7, "id.OA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void writeByteS (int value, int unused) {
		try {
			++Tb;
			this.buffer[this.pointer++] = (byte) (128 + -value);
		} catch (RuntimeException var4) {
			throw a(var4, "id.AA(" + value + ',' + unused + ')');
		}
	}

	final void writeLong (long value, int unused) {
		try {
			++zb;
			this.buffer[this.pointer++] = (byte) ((int) (value >> 56));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 48));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 40));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 32));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 24));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 16));
			this.buffer[this.pointer++] = (byte) ((int) (value >> 8));
			this.buffer[this.pointer++] = (byte) ((int) value);
			System.out.println("writeLong(" + value + ")");
		} catch (RuntimeException var5) {
			throw a(var5, "id.O(" + value + ',' + unused + ')');
		}
	}

	final rd readRSString (int unused) {
		try {
			++K;
			int pointer = this.pointer;
			while (this.buffer[this.pointer++] != 0) {}
			return df.getRSString(this.buffer, -1 + (this.pointer - pointer), pointer, 0);
		} catch (RuntimeException var3) {
			throw a(var3, "id.RA(" + unused + ')');
		}
	}

	final int f (boolean var1) {
		try {
			if (var1) {
				Lb = null;
			}

			this.pointer += 2;
			++D;
			return ((255 & this.buffer[this.pointer + -1]) << 8) - -(255 & -128 + this.buffer[-2 + this.pointer]);
		} catch (RuntimeException var3) {
			throw a(var3, "id.DA(" + var1 + ')');
		}
	}

	final int g (int var1) {
		try {
			this.pointer += 3;
			++ab;
			if (var1 != 22604) {
				this.h(false);
			}

			return (255 & this.buffer[-2 + this.pointer]) + ((255 & this.buffer[-1 + this.pointer]) << 8) + ((this.buffer[this.pointer - 3] & 255) << 16);
		} catch (RuntimeException var3) {
			throw a(var3, "id.CA(" + var1 + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	final int readSmartA (boolean unused) {
		try {
			++A;
			int value = this.buffer[this.pointer] & 255;
			return value < 128 ? this.readUnsignedByte((byte) 116) - 64 : this.readUnsignedLEShort(255) + -49152;
		} catch (RuntimeException var3) {
			throw a(var3, "id.HB(" + unused + ')');
		}
	}

	final byte h (int var1) {
		try {
			if (var1 > -103) {
				this.b((byte) 54, -120);
			}

			++J;
			return (byte) (-this.buffer[this.pointer++]);
		} catch (RuntimeException var3) {
			throw a(var3, "id.FA(" + var1 + ')');
		}
	}

	final void a (BigInteger exponent, BigInteger modulus, boolean unused) {
		try {
			++sb;
			int pointer = this.pointer;
			this.pointer = 0;
			byte[] val = new byte[pointer];
			this.readBytes(pointer, val, (byte) 70, 0);
			BigInteger bigInteger = new BigInteger(val);
			BigInteger bigInteger1 = bigInteger/*.modPow(exponent, modulus)*/;
			byte[] data = bigInteger1.toByteArray();
			this.pointer = 0;
			this.writeByte((byte) -69, data.length);
			this.writeBytes(data, (byte) -67, data.length, 0);
			System.out.println(Arrays.toString(data));
		} catch (RuntimeException var9) {
			throw a(var9, "id.NB(" + (exponent != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final int readUnsignedByte (byte unused) {
		try {
			++mb;
			return 255 & this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw a(var3, "id.BB(" + unused + ')');
		}
	}

	final void writeMedium (int unused, int value) {
		try {
			++E;
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) value;
			System.out.println("write24BitInt(" + value + ")");
		} catch (RuntimeException var4) {
			throw a(var4, "id.MB(" + unused + ',' + value + ')');
		}
	}

	final void writeShort (int value, byte unused) {
		try {
			++P;
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) value;
		} catch (RuntimeException var4) {
			throw a(var4, "id.EA(" + value + ',' + unused + ')');
		}
	}

	final void writeLEShortA (int unused, int value) {
		try {
			++xb;
			this.buffer[this.pointer++] = (byte) (value + 128);
			this.buffer[this.pointer++] = (byte) (value >> 8);
		} catch (RuntimeException var4) {
			throw a(var4, "id.IA(" + unused + ',' + value + ')');
		}
	}

	final int i (int var1) {
		try {
			++tb;
			if (var1 != 0) {
				this.pointer = -84;
			}

			return 255 & -this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw a(var3, "id.TA(" + var1 + ')');
		}
	}

	final int readUnsignedLEShort (int unused) {
		try {
			++Fb;
			this.pointer += 2;
			return (255 & this.buffer[-1 + this.pointer]) + ((this.buffer[-2 + this.pointer] & 255) << 8);
		} catch (RuntimeException var3) {
			throw a(var3, "id.WA(" + unused + ')');
		}
	}

	final void a (int[] regionKeys, int length, boolean unused, int unused2) {
		try {
			++Db;
			int pointer = this.pointer;
			this.pointer = 5;
			int i = (-5 + length) / 8;
			int i1 = 0;
			if (i <= i1) {
				this.pointer = pointer;
			} else {
				do {
					int i2 = -957401312;
					int i3 = -1640531527;
					int i4 = this.readInt((byte) -79);
					int i5 = 32;
					int i6 = this.readInt((byte) -109);
					if (i5-- <= 0) {
						this.pointer -= 8;
						this.writeInt(-7155, i4);
						this.writeInt(-7155, i6);
						++i1;
					} else {
						do {
							i6 -= regionKeys[(8015 & i2) >>> 11] + i2 ^ (i4 << 4 ^ i4 >>> 5) + i4;
							i2 -= i3;
							i4 -= i6 + (i6 << 4 ^ i6 >>> 5) ^ i2 + regionKeys[i2 & 3];
						} while (i5-- > 0);

						this.pointer -= 8;
						this.writeInt(-7155, i4);
						this.writeInt(-7155, i6);
						++i1;
					}
				} while (i > i1);

				this.pointer = pointer;
			}
		} catch (RuntimeException var14) {
			throw a(var14, "id.IB(" + (regionKeys != null ? "{...}" : "null") + ',' + length + ',' + unused + ',' + unused2 + ')');
		}
	}

	final int readUnsignedSmart (byte unused) {
		try {
			++Y;
			int value = 255 & this.buffer[this.pointer];
			return value < 128 ? this.readUnsignedByte((byte) 116) : this.readUnsignedLEShort(255) + -32768;
		} catch (RuntimeException var3) {
			throw a(var3, "id.K(" + unused + ')');
		}
	}

	final int readInt_V1 (byte unused) {
		try {
			++W;
			this.pointer += 4;
			return ((255 & this.buffer[-1 + this.pointer]) << 8) + ((this.buffer[this.pointer + -3] & 255) << 24) - (-((255 & this.buffer[this.pointer + -4]) << 16) - (this.buffer[-2 + this.pointer] & 255));
		} catch (RuntimeException var3) {
			throw a(var3, "id.JB(" + unused + ')');
		}
	}

	final void readBytes (int pointer, byte[] buffer, byte unused, int i) {
		try {
			++C;
			int size = i;
			if (~i > ~(i + pointer)) {
				do {
					buffer[size] = this.buffer[this.pointer++];
					++size;
				} while (~size > ~(i - -pointer));

			}
		} catch (RuntimeException var7) {
			throw a(var7, "id.KB(" + pointer + ',' + (buffer != null ? "{...}" : "null") + ',' + unused + ',' + i + ')');
		}
	}

	final int g (byte var1) {
		try {
			this.pointer += 4;
			++Eb;
			if (var1 != -89) {
				this.writeByteA(111, -105);
			}

			return (this.buffer[-3 + this.pointer] & 255) + ((this.buffer[this.pointer + -4] & 255) << 8) + (16711680 & this.buffer[-1 + this.pointer] << 16) + ((255 & this.buffer[-2 + this.pointer]) << 24);
		} catch (RuntimeException var3) {
			throw a(var3, "id.N(" + var1 + ')');
		}
	}

	final void b (int var1, byte[] var2, int var3, int var4) {
		try {
			++nb;
			int var5 = -1 + var1 + var3;
			if (var4 < -3) {
				while (var1 <= var5) {
					var2[var5] = this.buffer[this.pointer++];
					--var5;
				}

			}
		} catch (RuntimeException var6) {
			throw a(var6, "id.R(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	final int readUnsignedLEShortA (byte unused) {
		try {
			++Gb;
			this.pointer += 2;
			return (this.buffer[-1 + this.pointer] - 128 & 255) + (this.buffer[this.pointer + -2] << 8 & '\uff00');
		} catch (RuntimeException var3) {
			throw a(var3, "id.SA(" + unused + ')');
		}
	}

	final void writeInt (int unused, int value) {
		try {
			++Sb;
			this.buffer[this.pointer++] = (byte) (value >> 24);
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) value;
			System.out.println("writeInt(" + value + ")");
		} catch (RuntimeException var4) {
			throw a(var4, "id.PA(" + unused + ',' + value + ')');
		}
	}

	final void b (int pointer, byte unused) {
		try {
			++I;
			if (pointer >= 0 && pointer < 128) {
				this.writeByte((byte) -62, pointer);
			} else {
				if (pointer >= 0 && pointer < '耀') {
					this.writeShort(pointer + '耀', (byte) 83);
				} else {
					throw new IllegalArgumentException();
				}
			}
		} catch (RuntimeException var4) {
			throw a(var4, "id.V(" + pointer + ',' + unused + ')');
		}
	}

	final void writeByte (byte unused, int value) {
		try {
			this.buffer[this.pointer++] = (byte) value;
			System.out.println("writeByte(" + value + ")");
			++T;
		} catch (RuntimeException var4) {
			throw a(var4, "id.RB(" + unused + ',' + value + ')');
		}
	}

	final void writeInt_V1 (int unused, int value) {
		try {
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) value;
			this.buffer[this.pointer++] = (byte) (value >> 24);
			this.buffer[this.pointer++] = (byte) (value >> 16);
			++Bb;
		} catch (RuntimeException var4) {
			throw a(var4, "id.JA(" + unused + ',' + value + ')');
		}
	}

	final int readUnsignedShort (byte unused) {
		try {
			++Ob;
			this.pointer += 2;
			return (255 & this.buffer[-2 + this.pointer]) + (this.buffer[-1 + this.pointer] << 8 & '\uff00');
		} catch (RuntimeException var3) {
			throw a(var3, "id.EB(" + unused + ')');
		}
	}

	final int readUnsignedByteS (int unused) {
		try {
			++Mb;
			return 0xff & 128 + -this.buffer[this.pointer++];
		} catch (RuntimeException var3) {
			throw a(var3, "id.QA(" + unused + ')');
		}
	}

	final void writeBytes (byte[] buffer, byte unused, int length, int unused2) {
		try {
			int size = 0;
			while (length > size) {
				this.buffer[this.pointer++] = buffer[size];
				++size;
			}

			++lb;
		} catch (RuntimeException var7) {
			throw a(var7, "id.LA(" + (buffer != null ? "{...}" : "null") + ',' + unused + ',' + length + ',' + unused2 + ')');
		}
	}

	final byte h (boolean var1) {
		try {
			if (var1) {
				this.buffer = null;
			}

			++ub;
			return (byte) (-this.buffer[this.pointer++] + 128);
		} catch (RuntimeException var3) {
			throw a(var3, "id.W(" + var1 + ')');
		}
	}

	final int readShort (int unused) {
		try {
			this.pointer += 2;
			int value = (this.buffer[this.pointer + -1] & 255) + ((this.buffer[this.pointer + -2] & 255) << 8);
			if (value > 32767) {
				value -= 65536;
			}

			++Hb;
			return value;
		} catch (RuntimeException var3) {
			throw a(var3, "id.SB(" + unused + ')');
		}
	}

	final void writeLEInt (int value, int unused) {
		try {
			++R;
			this.buffer[this.pointer++] = (byte) value;
			this.buffer[this.pointer++] = (byte) (value >> 8);
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 24);
		} catch (RuntimeException var4) {
			throw a(var4, "id.P(" + value + ',' + unused + ')');
		}
	}

	final void writeInt_V2 (int value, int unused) {
		try {
			++db;
			this.buffer[this.pointer++] = (byte) (value >> 16);
			this.buffer[this.pointer++] = (byte) (value >> 24);
			this.buffer[this.pointer++] = (byte) value;
			this.buffer[this.pointer++] = (byte) (value >> 8);
		} catch (RuntimeException var4) {
			throw a(var4, "id.L(" + value + ',' + unused + ')');
		}
	}

	final long readLong (boolean unused) {
		try {
			++yb;
			long l = 4294967295L & (long) this.readInt((byte) -105);
			long l1 = (long) this.readInt((byte) -18) & 4294967295L;
			return l1 + (l << 32);
		} catch (RuntimeException var6) {
			throw a(var6, "id.UA(" + unused + ')');
		}
	}

	final void i (int var1, int var2) {
		try {
			this.buffer[var1 + (this.pointer - var2)] = (byte) var2;
			++Cb;
		} catch (RuntimeException var4) {
			throw a(var4, "id.KA(" + var1 + ',' + var2 + ')');
		}
	}

	final int k (byte var1) {
		try {
			++Nb;
			this.pointer += 4;
			return var1 != -53 ? 81 : (255 & this.buffer[this.pointer + -4]) + (this.buffer[-1 + this.pointer] << 24 & -16777216) - (-((this.buffer[-2 + this.pointer] & 255) << 16) - (this.buffer[this.pointer + -3] << 8 & '\uff00'));
		} catch (RuntimeException var3) {
			throw a(var3, "id.QB(" + var1 + ')');
		}
	}

	final int readMedInt (byte unused) {
		try {
			++L;
			this.pointer += 3;
			return (this.buffer[this.pointer + -2] << 8 & '\uff00') + ((this.buffer[-3 + this.pointer] & 255) << 16) + (this.buffer[this.pointer + -1] & 255);
		} catch (RuntimeException var3) {
			throw a(var3, "id.U(" + unused + ')');
		}
	}

	final int j (boolean var1) {
		int var4 = client.int_tb;

		try {
			if (!var1) {
				return 1;
			} else {
				++pb;
				byte var2 = this.buffer[this.pointer++];
				int var3 = 0;
				if (var4 == 0 && var2 >= 0) {
					return var3 | var2;
				} else {
					do {
						var3 = (var2 & 127 | var3) << 7;
						var2 = this.buffer[this.pointer++];
					} while (var2 < 0);

					return var3 | var2;
				}
			}
		} catch (RuntimeException var5) {
			throw a(var5, "id.T(" + var1 + ')');
		}
	}

	final int e (byte var1, int var2) {
		try {
			if (var1 > -114) {
				return -4;
			} else {
				++Ab;
				int var3 = dc.a(this.buffer, var2, -23173, this.pointer);
				this.writeInt(-7155, var3);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw a(var4, "id.GB(" + var1 + ',' + var2 + ')');
		}
	}

	final void writeLEShort (int value, byte unused) {
		try {
			++S;
			this.buffer[this.pointer++] = (byte) value;
			this.buffer[this.pointer++] = (byte) (value >> 8);
		} catch (RuntimeException var4) {
			throw a(var4, "id.OB(" + value + ',' + unused + ')');
		}
	}
}
