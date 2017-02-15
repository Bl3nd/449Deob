final class re extends mc {
	private md D = new md();
	private md E = new md();
	private int F = 0;
	private int G = -1;

	private void a (c var1) {
		var1.d(-26669);
		var1.a();
		je class_je = this.E.e.je_f;
		if (class_je == this.E.e) {
			this.G = -1;
		} else {
			this.G = ((c) class_je).z;
		}
	}

	final synchronized void a (int[] data, int i, int len) {
		do {
			if (this.G < 0) {
				this.c(data, i, len);
				return;
			}

			if (this.F + len < this.G) {
				this.F += len;
				this.c(data, i, len);
				return;
			}

			int len1 = this.G - this.F;
			this.c(data, i, len1);
			i += len1;
			len -= len1;
			this.F += len1;
			this.e();
			c class_c = (c) this.E.c((byte) 86);
			synchronized (class_c) {//done
				int i1 = class_c.a(this);
				if (i1 < 0) {
					class_c.z = 0;
					this.a(class_c);
				} else {
					class_c.z = i1;
					this.a(class_c.je_f, class_c);
				}
			}
		} while (len != 0);

	}

	private void f (int var1) {
		for (mc var2 = (mc) this.D.c((byte) 106) ; var2 != null ; var2 = (mc) this.D.a((byte) -68)) {
			var2.e(var1);
		}

	}

	final synchronized void e (int var1) {
		do {
			if (this.G < 0) {
				this.f(var1);
				return;
			}

			if (this.F + var1 < this.G) {
				this.F += var1;
				this.f(var1);
				return;
			}

			int var2 = this.G - this.F;
			this.f(var2);
			var1 -= var2;
			this.F += var2;
			this.e();
			c var3 = (c) this.E.c((byte) 120);
			synchronized (var3) {//done
				int var6 = var3.a(this);
				if (var6 < 0) {
					var3.z = 0;
					this.a(var3);
				} else {
					var3.z = var6;
					this.a(var3.je_f, var3);
				}
			}
		} while (var1 != 0);

	}

	private void c (int[] data, int i, int len) {
		for (mc class_mc = (mc) this.D.c((byte) 31) ; class_mc != null ; class_mc = (mc) this.D.a((byte) -68)) {
			class_mc.b(data, i, len);
		}
	}

	final mc b () {
		return (mc) this.D.c((byte) 116);
	}

	private void e () {
		if (this.F > 0) {
			for (c var1 = (c) this.E.c((byte) 29) ; var1 != null ; var1 = (c) this.E.a((byte) -68)) {
				var1.z -= this.F;
			}

			this.G -= this.F;
			this.F = 0;
		}

	}

	final synchronized void a (mc var1) {
		var1.d(-26669);
	}

	final int a () {
		return 0;
	}

	final synchronized void b (mc var1) {
		this.D.a(0, var1);
	}

	private void a (je var1, c var2) {
		while (var1 != this.E.e && ((c) var1).z <= var2.z) {
			var1 = var1.je_f;
		}

		this.E.a((byte) 125, var1, var2);
		this.G = ((c) this.E.e.je_f).z;
	}

	final mc d () {
		return (mc) this.D.a((byte) -68);
	}
}
