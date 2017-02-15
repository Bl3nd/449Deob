import sun.audio.AudioPlayer;

final class vb extends eb {
	private da v;

	vb () {
		this.v = new da();
		AudioPlayer.player.start(this.v);
	}

	final void a () {
		AudioPlayer.player.stop(this.v);
		synchronized (this.v) {
			this.v.boolean_a = true;
		}
	}
}
