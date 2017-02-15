final class ga {
	int int_a;
	int int_b;
	int int_e;
	private int[] ints_c = new int[2];
	private int[] ints_d = new int[2];
	private int int_f = 2;
	private int int_g;
	private int int_h;
	private int int_i;
	private int int_j;
	private int int_k;

	public ga () {
		this.ints_d[0] = 0;
		this.ints_d[1] = '\uffff';
		this.ints_c[0] = 0;
		this.ints_c[1] = '\uffff';
	}

	final void a (id class_id) {
		this.int_e = class_id.readUnsignedByte((byte) 116);
		this.int_b = class_id.readInt((byte) -85);
		this.int_a = class_id.readInt((byte) -114);
		this.b(class_id);
	}

	final void b (id class_id) {
		this.int_f = class_id.readUnsignedByte((byte) 116);
		this.ints_d = new int[this.int_f];
		this.ints_c = new int[this.int_f];
		for (int index = 0 ; index < this.int_f ; ++index) {
			this.ints_d[index] = class_id.readUnsignedLEShort(255);
			this.ints_c[index] = class_id.readUnsignedLEShort(255);
		}
	}

	final int a (int i) {
		if (this.int_g >= this.int_k) {
			this.int_h = this.ints_c[this.int_j++] << 15;
			if (this.int_j >= this.int_f) {
				this.int_j = this.int_f - 1;
			}

			this.int_k = (int) ((double) this.ints_d[this.int_j] / 65536.0D * (double) i);
			if (this.int_k > this.int_g) {
				this.int_i = ((this.ints_c[this.int_j] << 15) - this.int_h) / (this.int_k - this.int_g);
			}
		}

		this.int_h += this.int_i;
		++this.int_g;
		return this.int_h - this.int_i >> 15;
	}

	final void a () {
		this.int_k = 0;
		this.int_j = 0;
		this.int_i = 0;
		this.int_h = 0;
		this.int_g = 0;
	}
}
