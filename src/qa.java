import java.nio.ByteBuffer;

final class qa extends bf {
	private ByteBuffer byteBuffer;

	final byte[] get (byte unused) {
		assert this.byteBuffer != null;
		byte[] dst = new byte[this.byteBuffer.capacity()];
		this.byteBuffer.position(0);
		this.byteBuffer.get(dst);
		return dst;
	}

	final void put (int unused, byte[] buffer) {
		this.byteBuffer = ByteBuffer.allocateDirect(buffer.length);
		this.byteBuffer.position(0);
		this.byteBuffer.put(buffer);
	}
}
