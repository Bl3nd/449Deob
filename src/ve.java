import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

final class ve extends fa {
	private byte[] J;
	private AudioFormat audioFormat;
	private SourceDataLine sourceDataLine;

	final void c () {
		if (null != this.sourceDataLine) {
			this.sourceDataLine.close();
			this.sourceDataLine = null;
		}

	}

	final void a (Component component, int sampleRate, boolean unused) {
		qb.mb = false;
		hc.sampleRate = sampleRate;
		this.audioFormat = new AudioFormat((float) hc.sampleRate, 16, !qb.mb ? 1 : 2, true, false);
		this.J = new byte[256 << (!qb.mb ? 1 : 2)];
	}

	final int dataAvailable () {
		return this.sourceDataLine.available() >> (qb.mb ? 2 : 1);
	}

	final void write () {
		int len = 256;
		if (qb.mb) {
			len <<= 1;
		}

		for (int index = 0 ; index < len ; ++index) {
			int i = A[index];
			if ((i + 8388608 & -16777216) != 0) {
				i = 8388607 ^ i >> 31;
			}

			this.J[index * 2] = (byte) (i >> 8);
			this.J[index * 2 + 1] = (byte) (i >> 16);
		}

		this.sourceDataLine.write(this.J, 0, len << 1);
	}

	final void a (int bufferSize) throws LineUnavailableException {
		try {
			Info info = new Info(SourceDataLine.class, this.audioFormat, bufferSize << (qb.mb ? 2 : 1));
			this.sourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
			this.sourceDataLine.open();
			this.sourceDataLine.start();
		} catch (LineUnavailableException e) {
			this.sourceDataLine = null;
			throw e;
		}
	}
}
