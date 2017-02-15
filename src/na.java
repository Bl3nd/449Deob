final class na extends de {
	int A;
	byte[] B;
	int C;
	int D;
	boolean E;

	na (int var1, byte[] var2, int var3, int var4) {
		this.C = var1;
		this.B = var2;
		this.D = var3;
		this.A = var4;
	}

	final na a (h var1) {
		this.B = var1.a((byte) 127, this.B);
		this.C = var1.c(-128, this.C);
		if (this.D == this.A) {
			this.D = this.A = var1.b(0, this.D);
		} else {
			this.D = var1.b(0, this.D);
			this.A = var1.b(0, this.A);
			if (this.D == this.A) {
				--this.D;
			}
		}

		return this;
	}
}
