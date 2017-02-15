final class aa extends ee {
	private long B;

	aa () {
		this.e(15);
	}

	final int b (int i, int i1, int unused) {
		long l = 1000000L * (long) i;
		int i2 = 0;
		long l1 = this.B - System.nanoTime();
		if (l > l1) {
			l1 = l;
		}

		wa.sleep(17525, l1 / 1000000L);

		long l2;
		for (l2 = System.nanoTime(); 10 > i2 && (1 > i2 || this.B < l2) ; this.B += (long) i1 * 1000000L) {
			++i2;
		}

		if (this.B < l2) {
			this.B = l2;
		}

		return i2;
	}

	final void c (int unused) {
		this.e(15);
	}

	final void e (int unused) {
		this.B = System.nanoTime();
	}
}
