import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class ne {
	private File file;
	private long b;
	private long c;
	private RandomAccessFile randomAccessFile;

	@SuppressWarnings("ResultOfMethodCallIgnored")
	ne (File file, String mode, long l) throws IOException {
		if (l == -1L) {
			l = Long.MAX_VALUE;
		}

		if (l <= file.length()) {
			file.delete();
		}

		this.randomAccessFile = new RandomAccessFile(file, mode);
		this.b = l;
		this.file = file;
		this.c = 0L;
		int dataRead = this.randomAccessFile.read();
		if (dataRead != -1 && !mode.equals("r")) {
			this.randomAccessFile.seek(0L);
			this.randomAccessFile.write(dataRead);
		}

		this.randomAccessFile.seek(0L);
	}

	@SuppressWarnings("unused")
	public final void write (int unused, int len, byte[] buffer, int off) throws IOException {
		if (this.b < this.c + (long) len) {
			this.randomAccessFile.seek(1L + this.b);
			this.randomAccessFile.write(1);
			throw new EOFException();
		} else {
			this.randomAccessFile.write(buffer, off, len);
			this.c += (long) len;
		}
	}

	public final void close (int unused) throws IOException {
		this.randomAccessFile.close();
		this.randomAccessFile = null;
	}

	public final long getLength (byte unused) throws IOException {
		return this.randomAccessFile.length();
	}

	final int read (int unused, byte[] buffer, int off, int len) throws IOException {
		int dataRead = this.randomAccessFile.read(buffer, off, len);
		if (dataRead > 0) {
			this.c += (long) dataRead;
		}

		return dataRead;
	}

	public final File getFile (int unused) {
		return this.file;
	}

	public final void seek (long pos, byte var3) throws IOException {
		this.randomAccessFile.seek(pos);
		this.c = pos;
	}
}
