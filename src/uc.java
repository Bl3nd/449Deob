import java.io.IOException;

final class uc extends id {
	static int Vb = 0;
	static rd scape_main;
	static rd loadingTextures2;
	static int Yb;
	static int Zb;
	static rd ac;
	static int bc;
	static int dc;
	static int ec;
	static int gc;
	static int[] hc;
	static int ic;
	static rd jc;
	static int lc = 0;
	static int mc;
	static rd publicChat2;
	static rd pc;
	static rd mod_icons;
	static int rc;
	static int tc;
	static rd uc;
	static rd vc;
	static int xc;
	private static rd Ub = md
			.a((String) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", (byte) 119);
	private static rd publicChat;
	private static rd kc = md.a((String) "red:", (byte) 127);
	private static rd loadingTextures = md.a((String) "Loading textures )2 ", (byte) 119);
	private static rd wc;

	static {
		pc = Ub;
		mod_icons = md.a("mod_icons", (byte) 124);
		publicChat = md.a("Public chat", (byte) 117);
		hc = new int[5];
		publicChat2 = publicChat;
		loadingTextures2 = loadingTextures;
		ac = md.a("m-Ochte sich mit Ihnen duellieren)3", (byte) 122);
		uc = md.a("::fpson", (byte) 117);
		scape_main = md.a("scape main", (byte) 114);
		vc = kc;
		wc = md.a("Your ignore list is full)3 Max of 100 hit", (byte) 115);
		jc = wc;
	}

	private int bitOffset;
	private dc nc;

	uc (int var1) {
		super(var1);
	}

	static boolean n (int unused) {
		try {
			++dc;
			return p.z != null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "uc.I(" + unused + ')');
		}
	}

	static void a (int unused, boolean flag) {
		try {
			++ec;
			++wb.mb;
			if (wb.mb >= 50 || flag) {
				wb.mb = 0;
				if (!j.Eb && cc.ff_k != null) {
					++df.int_f;
					ie.writeStream.writeOpcode(8, 249);

					try {
						cc.ff_k.writeToStream(false, ie.writeStream.pointer, 0, ie.writeStream.buffer);
						ie.writeStream.pointer = 0;
					} catch (IOException e) {
						j.Eb = true;
					}
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "uc.F(" + unused + ',' + flag + ')');
		}
	}

	public static void n (byte var0) {
		try {
			publicChat = null;
			vc = null;
			pc = null;
			wc = null;
			ac = null;
			uc = null;
			hc = null;
			publicChat2 = null;
			loadingTextures2 = null;
			scape_main = null;
			if (var0 > 4) {
				loadingTextures = null;
				Ub = null;
				mod_icons = null;
				kc = null;
				jc = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "uc.B(" + var0 + ')');
		}
	}

	final int readBits (byte unused, int size) {
		try {
			++ic;
			int byteOffset = this.bitOffset >> 3;
			int bitsToRead = 8 - (this.bitOffset & 7);
			this.bitOffset += size;
			int value = 0;
			while (bitsToRead < size) {
				value += (df.BIT_MASKS[bitsToRead] & super.buffer[byteOffset++]) << -bitsToRead + size;
				size -= bitsToRead;
				bitsToRead = 8;
			}

			if (bitsToRead == size) {
				value += super.buffer[byteOffset] & df.BIT_MASKS[bitsToRead];
			} else {
				value += super.buffer[byteOffset] >> -size + bitsToRead & df.BIT_MASKS[size];
			}
			return value;
		} catch (RuntimeException var7) {
			throw id.a(var7, "uc.H(" + unused + ',' + size + ')');
		}
	}

	final int o (int unused) {
		try {
			++mc;
			return super.buffer[super.pointer++] - this.nc.c(-4) & 255;
		} catch (RuntimeException var3) {
			throw id.a(var3, "uc.C(" + unused + ')');
		}
	}

	final void a (int[] isaacIndice, boolean unused) {
		try {
			++rc;
			this.nc = new dc(isaacIndice);
		} catch (RuntimeException var4) {
			throw id.a(var4, "uc.E(" + (isaacIndice != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final void writeOpcode (int unused, int opcode) {
		try {
			++bc;
			super.buffer[super.pointer++] = (byte) (opcode + this.nc.c(-4));
			System.err.println("writeOpcode(" + opcode + ")");
		} catch (RuntimeException var4) {
			throw id.a(var4, "uc.J(" + unused + ',' + opcode + ')');
		}
	}

	final void finishBitAccess (byte unused) {
		try {
			super.pointer = (7 + this.bitOffset) / 8;
			++tc;
		} catch (RuntimeException var3) {
			throw id.a(var3, "uc.D(" + unused + ')');
		}
	}

	final void initializeBITAccess (int unused) {
		try {
			++Yb;
			this.bitOffset = 8 * super.pointer;
		} catch (RuntimeException var3) {
			throw id.a(var3, "uc.A(" + unused + ')');
		}
	}

	final int k (int unused, int packetSize) {
		try {
			++Zb;
			return 8 * packetSize + -this.bitOffset;
		} catch (RuntimeException var4) {
			throw id.a(var4, "uc.G(" + unused + ',' + packetSize + ')');
		}
	}
}
