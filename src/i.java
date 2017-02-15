import java.awt.Component;

final class i extends je {
	static boolean z = true;
	static rd title_jpg = md.a((String) "title)3jpg", (byte) 122);
	static pb archiveFile2;
	static int E;
	static int modeWhere_F = 0;
	static int[] G = new int[]{
			0,
			1,
			2,
			3,
			4,
			5,
			6,
			7,
			8,
			9,
			10,
			11,
			12,
			13,
			14,
			15,
			16,
			17,
			18,
			19,
			20,
			21,
			22,
			23,
			24,
			25,
			26,
			27,
			28,
			29,
			30,
			31,
			32,
			33,
			34,
			35,
			36,
			37,
			38,
			39,
			40,
			41,
			42,
			43,
			44,
			45,
			46,
			47,
			48,
			49,
			50,
			51,
			52,
			53,
			54,
			55,
			56,
			57,
			58,
			59,
			60,
			61,
			62,
			63,
			64,
			65,
			73,
			74,
			76,
			78,
			83,
			84,
			85,
			86,
			91,
			92,
			93,
			94,
			95,
			97,
			103,
			104,
			105,
			106,
			107,
			108,
			113,
			114,
			115,
			116,
			118,
			119,
			120,
			121,
			122,
			123,
			124,
			125,
			133,
			134,
			136,
			138,
			143,
			144,
			145,
			146,
			151,
			152,
			153,
			154,
			155,
			157,
			163,
			164,
			165,
			166,
			168,
			169,
			174,
			175,
			176,
			177,
			180,
			181,
			182,
			183,
			184,
			185,
			186,
			187,
			188,
			189,
			190,
			191,
			192,
			193,
			194,
			195,
			196,
			197,
			198,
			199,
			200,
			201,
			202,
			203,
			204,
			205,
			206,
			207,
			208,
			209,
			210,
			211,
			212,
			213,
			214,
			215,
			216,
			217,
			218,
			219,
			220,
			221,
			222,
			223,
			224,
			225,
			226,
			227,
			228,
			229,
			230,
			231,
			232,
			233,
			234,
			235,
			236,
			237,
			238,
			239,
			240,
			241,
			242,
			243,
			244,
			245,
			246,
			247,
			248,
			249,
			66,
			67,
			68,
			69,
			70,
			71,
			72,
			75,
			79,
			80,
			81,
			82,
			87,
			88,
			89,
			90,
			77,
			96,
			98,
			99,
			100,
			101,
			102,
			250,
			251,
			109,
			110,
			111,
			112,
			117,
			252,
			167,
			126,
			127,
			128,
			129,
			130,
			131,
			132,
			135,
			139,
			140,
			141,
			142,
			147,
			148,
			149,
			150,
			137,
			156,
			158,
			159,
			160,
			161,
			162,
			253,
			254,
			170,
			171,
			172,
			173,
			178,
			255,
			179
	};
	static jd H;
	static int[] I = new int[5];
	static int[] incomingPacketSizes = new int[]{
			0,
			0,
			-2,
			-1,
			0,
			0,
			0,
			2,
			7,
			0,
			1,
			0,
			0,
			3,
			0,
			10,
			-1,
			4,
			0,
			2,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			5,
			0,
			0,
			3,
			0,
			5,
			0,
			2,
			0,
			-2,
			0,
			0,
			0,
			0,
			2,
			0,
			0,
			0,
			0,
			-1,
			0,
			0,
			0,
			2,
			0,
			6,
			2,
			0,
			0,
			6,
			0,
			15,
			4,
			6,
			0,
			0,
			0,
			11,
			0,
			0,
			6,
			0,
			0,
			0,
			0,
			0,
			7,
			0,
			0,
			1,
			-1,
			0,
			0,
			0,
			0,
			-1,
			2,
			5,
			10,
			0,
			0,
			0,
			0,
			0,
			4,
			0,
			-2,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			3,
			0,
			0,
			0,
			2,
			0,
			0,
			0,
			0,
			1,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			1,
			0,
			0,
			-2,
			-2,
			0,
			0,
			0,
			-1,
			6,
			0,
			0,
			4,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			4,
			0,
			0,
			6,
			3,
			0,
			0,
			0,
			0,
			0,
			-2,
			2,
			0,
			0,
			1,
			8,
			0,
			0,
			0,
			0,
			0,
			6,
			0,
			0,
			0,
			2,
			14,
			0,
			5,
			0,
			0,
			0,
			-2,
			0,
			0,
			0,
			0,
			4,
			6,
			2,
			0,
			0,
			6,
			0,
			0,
			0,
			6,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			2,
			0,
			0,
			6,
			1,
			0,
			0,
			2,
			0,
			0,
			4,
			-2,
			0,
			-2,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			6,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			4,
			0,
			0,
			3,
			-2,
			8,
			0,
			-2,
			0,
			0,
			0,
			0,
			0,
			10,
			5
	};
	static rd L = md.a((String) "Der Server wird gerade aktualisiert)3", (byte) 126);
	static int M = 1;
	static rd headicons_hint = md.a((String) "headicons_hint", (byte) 125);
	static int O = 2;
	static int P;
	static int R = -1;
	static rd S = md.a((String) "Keine Antwort vom Server)3", (byte) 114);
	static int T;
	int[] A;
	int D;
	int[][] Q;
	private int J;

	i (int fileRequest, byte[] buffer) {
		try {
			this.D = fileRequest;
			id class_id = new id(buffer);
			this.J = class_id.readUnsignedByte((byte) 116);
			this.Q = new int[this.J][];
			this.A = new int[this.J];

			for (int index = 0; index < this.J; index++) {
				this.A[index] = class_id.readUnsignedByte((byte) 116);
			}

			int i = 0;
			if (this.J > i) {
				while (this.J > i) {
					this.Q[i] = new int[class_id.readUnsignedByte((byte) 116)];
					++i;
				}
			}

			int i1 = 0;
			if (i1 < this.J) {
				do {
					int i2 = 0;
					while (this.Q[i1].length > i2) {
						this.Q[i1][i2] = class_id.readUnsignedByte((byte) 116);
						++i2;
					}

					++i1;
				} while (i1 < this.J);
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "i.<init>(" + fileRequest + ',' + (buffer != null ? "{...}" : "null") + ')');
		}
	}

	public static void a (byte var0) {
		try {
			G = null;
			title_jpg = null;
			int var1 = -114 / ((var0 - 22) / 42);
			L = null;
			archiveFile2 = null;
			headicons_hint = null;
			incomingPacketSizes = null;
			I = null;
			H = null;
			S = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "i.A(" + var0 + ')');
		}
	}

	static void a (int var0, Component component) {
		try {
			++T;
			component.removeMouseListener(ja.fc_a);
			component.removeMouseMotionListener(ja.fc_a);
			if (var0 == 196) {
				component.removeFocusListener(ja.fc_a);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "i.C(" + var0 + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int var0, long var1) {
		int var5 = client.int_tb;

		try {
			++P;
			if (var1 != 0L) {
				int var3 = var0;
				if (var5 != 0 || nc.p > var0) {
					while (~md.p[var3] != ~var1) {
						++var3;
						if (nc.p <= var3) {
							return;
						}
					}

					++tb.ob;
					db.F = true;
					--nc.p;
					int var4 = var3;
					if (var5 != 0) {
						md.p[var3] = md.p[var3 - -1];
						var4 = var3 + 1;
					}

					while (~nc.p < ~var4) {
						md.p[var4] = md.p[var4 - -1];
						++var4;
					}

					ie.writeStream.writeOpcode(var0 ^ 8, 76);
					ie.writeStream.writeLong(var1, var0 + 2);
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "i.B(" + var0 + ',' + var1 + ')');
		}
	}
}
