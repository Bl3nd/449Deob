final class ef {
	@SuppressWarnings("StatementWithEmptyBody")
	static void copyBytes (byte[] srcBuffer, int srcPointer, byte[] destBuffer, int destPointer, int length) {
		if (srcBuffer == destBuffer) {
			if (srcPointer == destPointer) {
				return;
			}

			if (destPointer > srcPointer && destPointer < srcPointer + length) {
				--length;
				srcPointer += length;
				destPointer += length;
				length = srcPointer - length;

				for (length += 7; srcPointer >= length ; destBuffer[destPointer--] = srcBuffer[srcPointer--]) {
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
					destBuffer[destPointer--] = srcBuffer[srcPointer--];
				}

				for (length -= 7; srcPointer >= length ; destBuffer[destPointer--] = srcBuffer[srcPointer--]) {}

				return;
			}
		}

		length += srcPointer;

		for (length -= 7; srcPointer < length ; destBuffer[destPointer++] = srcBuffer[srcPointer++]) {
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
			destBuffer[destPointer++] = srcBuffer[srcPointer++];
		}

		for (length += 7; srcPointer < length ; destBuffer[destPointer++] = srcBuffer[srcPointer++]) {}

	}
}
