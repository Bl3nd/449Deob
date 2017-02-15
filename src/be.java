final class be {
	static int int_a;
	static int int_b;
	static nd nd_c = null;
	static rd rd_d = md.a((String) "Spiel)2Fenster geladen)3", (byte) 127);
	static rd rd_e = md.a((String) "Gegenstand f-Ur Mitglieder", (byte) 117);
	static int int_g;
	static ce[] ces_h = new ce[50];
	static byte[][] bytes_i;
	static int int_j;
	static int int_k = -1;
	static int int_l = 3353893;
	static int int_m = 0;
	static int int_n;
	static rd rd_o = md.a((String) "Ihre Nachricht an: ", (byte) 123);
	static int int_p;
	static int int_q;
	static int int_r = 0;
	private jb jb_f = new jb();

	public be () {
		try {
			this.jb_f.F = this.jb_f;
			this.jb_f.A = this.jb_f;
		} catch (RuntimeException var2) {
			throw id.a(var2, "be.<init>(" + ')');
		}
	}

	static void a (int unused, rd topString, rd middleString, rd bottomString) {
		try {
			++int_b;
			ff.z = middleString;
			ff.rd_i = bottomString;
			ff.rd_m = topString;
		} catch (RuntimeException var5) {
			throw id.a(var5, "be.D(" + unused + ',' + (topString != null ? "{...}" : "null") + ',' + (middleString != null ? "{...}" : "null") + ',' + (bottomString != null ? "{...}" : "null") + ')');
		}
	}

	public static void c (byte unused) {
		try {
			ces_h = null;
			rd_e = null;
			nd_c = null;
			bytes_i = null;
			rd_o = null;
			rd_d = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "be.C(" + unused + ')');
		}
	}

	final jb a (byte unused) {
		try {
			++int_g;
			jb class_jb = this.jb_f.A;
			if (this.jb_f == class_jb) {
				return null;
			} else {
				class_jb.a((byte) -117);
				return class_jb;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "be.F(" + unused + ')');
		}
	}

	final void a (jb class_jb, byte unused) {
		try {
			++int_q;
			if (class_jb.F != null) {
				class_jb.a((byte) -89);
			}

			class_jb.A = this.jb_f;
			class_jb.F = this.jb_f.F;
			class_jb.F.A = class_jb;
			class_jb.A.F = class_jb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "be.B(" + "{...}" + ',' + unused + ')');
		}
	}

	final jb b (byte unused) {
		try {
			++int_a;
			jb class_jb = this.jb_f.A;
			return this.jb_f == class_jb ? null : class_jb;
		} catch (RuntimeException var3) {
			throw id.a(var3, "be.E(" + unused + ')');
		}
	}

	final void b (jb class_jb, byte unused) {
		try {
			if (class_jb.F != null) {
				class_jb.a((byte) -83);
			}

			++int_n;
			class_jb.A = this.jb_f.A;
			class_jb.F = this.jb_f;
			class_jb.F.A = class_jb;
			class_jb.A.F = class_jb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "be.A(" + "{...}" + ',' + unused + ')');
		}
	}
}
