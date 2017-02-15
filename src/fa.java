import java.awt.Component;

abstract class fa extends eb implements Runnable {
	static int[] A;
	private int int_v;
	private long long_w;
	private int x = 0;
	private int[] y = new int[512];
	private long z = 0L;
	private boolean B = false;
	private int C = 0;
	private long D;
	private int E = 0;
	private int F;
	private int G = 0;
	private int H = 256;
	private int I;

	fa () {
		int capacity = 256;
		if (qb.mb) {
			capacity <<= 1;
		}

		A = new int[capacity];
	}

	public static void d () {
		A = null;
	}

	abstract void a (int bufferSize) throws Exception;

	private void b (long l) {
		if (this.z != 0L) {
			while (this.D < l) {
				eb.a(256, 0);
				this.D += (long) (256000 / hc.sampleRate);
			}

			if (l < this.z) {
				return;
			}

			try {
				this.c(l);
			} catch (Exception e) {
				this.c();
				this.z += 5000L;
				return;
			}

			this.z = 0L;
		}

		while (this.D < l) {
			this.D += (long) (250880 / hc.sampleRate);
			int dataAvailable;
			try {
				dataAvailable = this.dataAvailable();
			} catch (Exception e) {
				this.c();
				this.z = l;
				return;
			}

			this.b(dataAvailable);
			int i = this.G * 3 / 512 - this.C * 2;
			if (i < 0) {
				i = 0;
			} else if (i > this.E) {
				i = this.E;
			}

			this.H = this.F - 256 - i;
			if (this.H < 256) {
				this.H = 256;
			}

			if (this.F < 16384) {
				if (dataAvailable >= this.F) {
					this.int_v += 5;
					if (this.int_v >= 100) {
						this.c();
						this.F += 2048;
						this.z = l;
						return;
					}
				} else if (dataAvailable != this.I && this.int_v > 0) {
					--this.int_v;
				}
			}

			this.I = dataAvailable;
			if (dataAvailable < this.H) {
				break;
			}

			eb.a(A, 256);

			try {
				this.write();
			} catch (Exception var6) {
				this.c();
				this.z = l;
				return;
			}

			this.long_w = l;
			this.I -= 256;
		}

		if (l >= this.long_w + 5000L) {
			this.c();
			this.z = l;

			for (int i = 0; i < 512 ; ++i) {
				this.y[i] = 0;
			}

			this.C = this.E = this.G = 0;
		}

	}

	final void a () {
		synchronized (this) {
			this.B = true;
		}

		while (true) {
			synchronized (this) {
				if (!this.B) {
					break;
				}
			}

			wa.sleep(17525, 50L);
		}

		A = null;
	}

	final synchronized void a (long l) {
		this.b(l);
		if (this.D < l) {
			this.D = l;
		}
	}

	abstract int dataAvailable () throws Exception;

	private void b (int dataAvailable) {
		int i = dataAvailable - this.H;
		int i1 = this.y[this.x];
		this.y[this.x] = i;
		this.G += i - i1;
		int i2 = this.x + 1 & 511;
		if (i > this.E) {
			this.E = i;
		}

		if (i < this.C) {
			this.C = i;
		}

		int i3;
		int i4;
		int i5;
		if (i1 == this.E) {
			i3 = i;
			for (i4 = i2; i4 != this.x && i3 < this.E ; i4 = i4 + 1 & 511) {
				i5 = this.y[i4];
				if (i5 > i3) {
					i3 = i5;
				}
			}

			this.E = i3;
		}

		if (i1 == this.C) {
			i3 = i;
			for (i4 = i2; i4 != this.x && i3 > this.C ; i4 = i4 + 1 & 511) {
				i5 = this.y[i4];
				if (i5 < i3) {
					i3 = i5;
				}
			}
			this.C = i3;
		}
		this.x = i2;
	}

	public final void run () {
		try {
			while (true) {
				synchronized (this) {
					if (!this.B) {
						this.a(pa.c(0));
					} else {
						if (this.z == 0L) {
							this.c();
						}

						this.B = false;
						return;
					}
				}

				wa.sleep(17525, 5L);
			}
		} catch (Exception var6) {
			se.a((byte) -100, var6, null);
		}
	}

	abstract void c ();

	abstract void a (Component component, int sampleRate, boolean unused) throws Exception;

	final void a (g class_g, int i) throws Exception {
		this.F = i;
		this.c(pa.c(0));
		class_g.a(10, (byte) -112, this);
	}

	abstract void write () throws Exception;

	private void c (long l) throws Exception {
		this.a(this.F);
		while (true) {
			int dataAvailable = this.dataAvailable();
			if (dataAvailable < this.H) {
				this.int_v = 0;
				this.I = 0;
				this.D = l;
				this.long_w = l;
				return;
			}

			this.write();
		}
	}
}
