import java.io.ByteArrayInputStream;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

final class vd extends q implements Receiver {
	private static volatile boolean M = false;
	private static Sequencer sequencer = null;
	private static Receiver receiver = null;

	vd () {
		try {
			receiver = MidiSystem.getReceiver();
			sequencer = MidiSystem.getSequencer(false);
			sequencer.getTransmitter().setReceiver(this);
			sequencer.open();
			this.a(-17, -1L);
		} catch (Exception var2) {
			s.c((byte) -62);
		}

	}

	final void silence (byte unused) {
		if (sequencer != null) {
			M = false;
			sequencer.stop();
			this.a(-17, -1L);
		}
	}

	final void a (boolean loopInfinite, int var2, byte var3, byte[] var4) {
		if (null != sequencer) {
			try {
				Sequence sequence = MidiSystem.getSequence(new ByteArrayInputStream(var4));
				if (var3 >= -19) {
					return;
				}

				sequencer.setSequence(sequence);
				sequencer.setLoopCount(loopInfinite ? -1 : 0);
				this.a(-1L, (byte) -8, var2, 0);
				M = true;
				sequencer.start();
			} catch (Exception var6) {
				var6.printStackTrace();
			}

		}
	}

	final void c (int unused) {}

	public final synchronized void send (MidiMessage var1, long var2) {
		if (M) {
			byte[] var4 = var1.getMessage();
			if (!this.b(var4[0] & 255, var4[1], var4.length >= 3 ? var4[2] : 0, var2)) {
				receiver.send(var1, var2);
			}
		}
	}

	final void e (int unused) {
		if (sequencer != null) {
			sequencer.close();
			sequencer = null;
		}

		if (receiver != null) {
			receiver.close();
			receiver = null;
		}

		int var2 = -36 / ((unused - 62) / 59);
	}

	final void a (int unused, int var2) {
		if (sequencer != null) {
			this.a(var2, -1L, false);
		}
	}

	@Override
	public final void close () {System.err.println("Receiver is closed!");}

	final void send (int status, int data1, int data2, long timeStamp) {
		try {
			ShortMessage shortMessage = new ShortMessage();
			shortMessage.setMessage(status, data1, data2);
			receiver.send(shortMessage, timeStamp);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}

	final synchronized void a (int var1, int var2, int unused) {
		if (sequencer != null) {
			if (unused == 14) {
				this.a(-1L, (byte) -8, var2, var1);
			}
		}
	}
}
