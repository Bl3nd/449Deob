import java.io.EOFException;
import java.io.IOException;

final class bb {
	static int int_a;
	static int int_c;
	static int int_d;
	static rd rd_h = md.a((String) "", (byte) 118);
	static rd rd_j = md.a((String) "nicht hergestellt werden)3", (byte) 116);
	static int int_m = 0;
	static int int_q;
	static int int_r;
	static int int_s;
	static rd _million2;
	static int int_u;
	static int int_v;
	static int int_w;
	static int[] ints_x;
	static int A;
	private static rd _million = md.a((String) " million", (byte) 114);

	static {
		_million2 = _million;
	}

	private long long_b;
	private long long_e;
	private long long_g;
	private long long_i = -1L;
	private ne cacheFile;
	private byte[] bytes_l;
	private byte[] bytes_n;
	private int int_o = 0;
	private long long_p;
	private long long_y = -1L;
	private int z;

	bb (ne cacheFile, int bufferSize, int unused) throws IOException {
		try {
			this.cacheFile = cacheFile;
			this.long_e = this.long_g = cacheFile.getLength((byte) 122);
			this.bytes_l = new byte[0];
			this.long_b = 0L;
			this.bytes_n = new byte[bufferSize];
		} catch (RuntimeException var5) {
			throw id.a(var5, "bb.<init>(" + (cacheFile != null ? "{...}" : "null") + ',' + bufferSize + ',' + unused + ')');
		}
	}

	static int a (byte unused, int i, int i1, int i2) {
		try {
			++int_w;
			i1 &= 3;
			return i1 == 0 ? i2 : i1 == 1 ? i : i1 == 2 ? 7 + -i2 : 7 - i;
		} catch (RuntimeException var5) {
			throw id.a(var5, "bb.I(" + unused + ',' + i + ',' + i1 + ',' + i2 + ')');
		}
	}

	static boolean a (int goalX, int currentY2, int currentX2, int i3, boolean flag, int goalY, int goalDY, int surroundings, int i7, int goalOrientation, int goalPosition, int goalDX) {
		int dummy = client.int_tb;
		try {

			for (int x = 0 ; x < 104 ; x++) {
				for (int y = 0 ; y < 104 ; y++) {
					fc.B[x][y] = 0;
					t.d[x][y] = 99999999;
				}
			}

			++int_q;
			fc.B[currentX2][currentY2] = 99;
			int currentX = currentX2;
			t.d[currentX2][currentY2] = 0;
			byte b = 0;
			ee.ints_j[b] = currentX2;
			int currentY = currentY2;
			int i13 = 0;
			int i14 = b + 1;
			dd.ints_a[b] = currentY2;
			boolean flag2 = false;
			int length = ee.ints_j.length;
			int[][] adjacency = nd.xd[ce.plane].adjacency;
			if (i13 != i14) {
				do {
					currentY = dd.ints_a[i13];
					currentX = ee.ints_j[i13];
					i13 = (i13 + 1) % length;
					if (currentX == goalX && currentY == goalY) {
						flag2 = true;
						if (dummy == 0) {
							break;
						}
					}

					if (goalPosition != 0) {
						if (goalPosition >= 5 && goalPosition != 10 || !nd.xd[ce.plane].reachedWall(-359, currentY, currentX, goalPosition + -1, goalX, goalOrientation, goalY)) {
							if (goalPosition < 10 && nd.xd[ce.plane].reachedWallDecoration(goalX, currentY, goalY, -103, goalOrientation, goalPosition - 1, currentX)) {
								flag2 = true;
								if (dummy == 0) {
									break;
								}
							}
						} else {
							flag2 = true;
							if (dummy == 0) {
								break;
							}
						}
					}

					if (goalDX != 0 && goalDY != 0 && nd.xd[ce.plane].reachedFacingObject((byte) -122, goalDX, goalX, goalY, currentX, surroundings, goalDY, currentY)) {
						flag2 = true;
						if (dummy == 0) {
							break;
						}
					}

					int i15 = t.d[currentX][currentY] + 1;
					if (currentX > 0 && fc.B[currentX + -1][currentY] == 0 && (19398920 & adjacency[currentX + -1][currentY]) == 0) {
						ee.ints_j[i14] = -1 + currentX;
						dd.ints_a[i14] = currentY;
						i14 = (i14 + 1) % length;
						fc.B[-1 + currentX][currentY] = 2;
						t.d[currentX - 1][currentY] = i15;
					}

					if (currentX < 103 && fc.B[1 + currentX][currentY] == 0 && ~(adjacency[1 + currentX][currentY] & 19399040) == -1) {
						ee.ints_j[i14] = currentX + 1;
						dd.ints_a[i14] = currentY;
						fc.B[1 + currentX][currentY] = 8;
						i14 = (1 + i14) % length;
						t.d[currentX - -1][currentY] = i15;
					}

					if (currentY > 0 && fc.B[currentX][currentY + -1] == 0 && (19398914 & adjacency[currentX][-1 + currentY]) == 0) {
						ee.ints_j[i14] = currentX;
						dd.ints_a[i14] = currentY + -1;
						fc.B[currentX][-1 + currentY] = 1;
						i14 = (i14 + 1) % length;
						t.d[currentX][currentY + -1] = i15;
					}

					if (currentY < 103 && fc.B[currentX][1 + currentY] == 0 && (19398944 & adjacency[currentX][1 + currentY]) == 0) {
						ee.ints_j[i14] = currentX;
						dd.ints_a[i14] = 1 + currentY;
						i14 = (i14 + 1) % length;
						fc.B[currentX][currentY - -1] = 4;
						t.d[currentX][1 + currentY] = i15;
					}

					if (currentX > 0 && currentY > 0 && fc.B[currentX - 1][-1 + currentY] == 0 && (19398926 & adjacency[currentX + -1][currentY - 1]) == 0
							&& (19398920 & adjacency[-1 + currentX][currentY]) == 0 && (19398914 & adjacency[currentX][currentY - 1]) == 0) {
						ee.ints_j[i14] = -1 + currentX;
						dd.ints_a[i14] = -1 + currentY;
						i14 = (1 + i14) % length;
						fc.B[currentX + -1][currentY + -1] = 3;
						t.d[-1 + currentX][-1 + currentY] = i15;
					}

					if (currentX < 103 && currentY > 0 && fc.B[currentX + 1][-1 + currentY] == 0 && (19399043 & adjacency[1 + currentX][currentY + -1]) == 0
							&& (adjacency[currentX + 1][currentY] & 19399040) == 0 && (adjacency[currentX][currentY + -1] & 19398914) == 0) {
						ee.ints_j[i14] = currentX + 1;
						dd.ints_a[i14] = -1 + currentY;
						fc.B[1 + currentX][currentY - 1] = 9;
						i14 = (1 + i14) % length;
						t.d[1 + currentX][-1 + currentY] = i15;
					}

					if (currentX > 0 && currentY < 103 && fc.B[-1 + currentX][currentY + 1] == 0 && (19398968 & adjacency[currentX - 1][currentY + 1]) == 0
							&& (adjacency[-1 + currentX][currentY] & 19398920) == 0 && (19398944 & adjacency[currentX][1 + currentY]) == 0) {
						ee.ints_j[i14] = currentX - 1;
						dd.ints_a[i14] = 1 + currentY;
						i14 = (i14 + 1) % length;
						fc.B[-1 + currentX][1 + currentY] = 6;
						t.d[-1 + currentX][1 + currentY] = i15;
					}

					if (currentX < 103 && currentY < 103 && fc.B[currentX + 1][currentY + 1] == 0 && (adjacency[currentX + 1][1 + currentY] & 19399136) == 0
							&& (19399040 & adjacency[1 + currentX][currentY]) == 0 && (adjacency[currentX][1 + currentY] & 19398944) == 0) {
						ee.ints_j[i14] = currentX + 1;
						dd.ints_a[i14] = 1 + currentY;
						i14 = (i14 + 1) % length;
						fc.B[1 + currentX][currentY + 1] = 12;
						t.d[currentX + 1][1 + currentY] = i15;
					}
				} while (i13 != i14);
			}

			ca.int_g = 0;
			int i1;
			if (!flag2) {
				label279:
				{
					if (flag) {
						int i15 = 1000;
						byte b1 = 10;
						int i = 100;
						int i4 = goalX - b1;
						if (goalX + b1 >= i4) {
							do {
								int i5 = -b1 + goalY;
								if (i5 > goalY - -b1) {
									++i4;
								} else {
									do {
										if (i4 >= 0 && i5 >= 0 && i4 < 104 && i5 < 104 && t.d[i4][i5] < 100) {
											int i6 = 0;
											if (i4 < goalX) {
												i6 = goalX + -i4;
											} else {
												if (-1 + goalDX + goalX < i4) {
													i6 = -goalDX - (goalX - 1 - i4);
												}
											}

											int i8 = 0;
											if (goalY > i5) {
												i8 = goalY + -i5;
											} else {
												if (i5 > goalY + goalDY + -1) {
													i8 = 1 + -goalDY + -goalY + i5;
												}
											}

											int i9 = i6 * i6 + i8 * i8;
											if (i9 < i15 || i15 == i9 && t.d[i4][i5] < i) {
												currentY = i5;
												i = t.d[i4][i5];
												i15 = i9;
												currentX = i4;
											}
										}

										++i5;
									} while (~i5 >= ~(goalY - -b1));

									++i4;
								}
							} while (goalX + b1 >= i4);
						}

						if (i15 == 1000) {
							return false;
						}

						if (currentX == currentX2 && currentY2 == currentY) {
							return false;
						}

						ca.int_g = 1;
						if (dummy == 0) {
							break label279;
						}
					}

					return false;
				}
			}

			byte b1 = 0;
			ee.ints_j[b1] = currentX;
			i13 = b1 + 1;
			dd.ints_a[b1] = currentY;
			int i = i1 = fc.B[currentX][currentY];
			for ( ; currentX != currentX2 || currentY != currentY2 ; i = fc.B[currentX][currentY]) {
				if (i1 != i) {
					i1 = i;
					ee.ints_j[i13] = currentX;
					dd.ints_a[i13++] = currentY;
				}

				if (~(i & 1) == -1) {
					if ((i & 4) != 0) {
						--currentY;
					}
				} else {
					++currentY;
				}

				if ((2 & i) != 0) {
					++currentX;
				} else if (~(i & 8) != -1) {
					--currentX;
				}
			}

			if (i13 <= 0) {
				return i3 != 1;
			} else {
				length = i13;
				if (i13 > 25) {
					length = 25;
				}

				--i13;
				int i2 = ee.ints_j[i13];
				int i4 = dd.ints_a[i13];
				if (i3 == 0) {
					++jc.O;
					ie.writeStream.writeOpcode(8, 9);
					ie.writeStream.writeByte((byte) 114, length + length + 3);
				}

				if (i3 == 1) {
					ie.writeStream.writeOpcode(8, 200);
					++te.Kb;
					ie.writeStream.writeByte((byte) 106, length - (-length + -3) - -14);
				}

				if (i3 == 2) {
					ie.writeStream.writeOpcode(8, 239);
					++qb.Z;
					ie.writeStream.writeByte((byte) -49, 3 + length + length);
				}

				me.L = dd.ints_a[0];
				jb.M = ee.ints_j[0];
				int i5 = 1;
				while (i5 < length) {
					--i13;
					ie.writeStream.writeByteS(-i2 + ee.ints_j[i13], -4);
					ie.writeStream.writeByte((byte) 116, -i4 + dd.ints_a[i13]);
					++i5;
				}

				ie.writeStream.writeByteA(0, !pc.C[82] ? 0 : 1);
				ie.writeStream.writeLEShortA(-19962, i4 + jc.X);
				ie.writeStream.writeLEShort(i2 + kd.int_w, (byte) 100);
				return true;
			}
		} catch (RuntimeException var30) {
			throw id.a(var30, "bb.G(" + goalX + ',' + currentY2 + ',' + currentX2 + ',' + i3 + ',' + flag + ',' + goalY + ',' + goalDY + ',' + surroundings + ',' + i7 + ',' + goalOrientation + ',' + goalPosition + ',' + goalDX + ')');
		}
	}

	public static void c (int unused) {
		try {
			_million = null;
			rd_j = null;
			rd_h = null;
			_million2 = null;
			ints_x = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "bb.D(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	private void a (int unused) throws IOException {
		try {
			this.z = 0;
			if (this.long_b != this.long_p) {
				this.cacheFile.seek(this.long_b, (byte) 80);
				this.long_p = this.long_b;
			}

			this.long_y = this.long_b;
			++int_c;
			if (this.bytes_n.length > this.z) {
				do {
					int dataRead = this.cacheFile.read(0, this.bytes_n, this.z, this.bytes_n.length - this.z);
					if (dataRead == -1) {
						break;
					}

					this.long_p += (long) dataRead;
					this.z += dataRead;
				} while (this.bytes_n.length > this.z);
			}

		} catch (RuntimeException var5) {
			throw id.a(var5, "bb.E(" + unused + ')');
		}
	}

	final void a (byte[] buffer, int off, int unused, int length) throws IOException {
		try {
			++int_r;
			try {
				if (buffer.length < length + off) {
					throw new ArrayIndexOutOfBoundsException(-buffer.length + length + off);
				}

				if (this.long_i != -1L && this.long_b >= this.long_i && (long) this.int_o + this.long_i >= (long) length + this.long_b) {
					ef.copyBytes(this.bytes_l, (int) (-this.long_i + this.long_b), buffer, off, length);
					this.long_b += (long) length;
					return;
				}

				long l = this.long_b;
				int length1 = length;
				int length2;
				if (this.long_y <= this.long_b && this.long_b < this.long_y + (long) this.z) {
					length2 = (int) (this.long_y - this.long_b + (long) this.z);
					if (length < length2) {
						length2 = length;
					}

					length -= length2;
					ef.copyBytes(this.bytes_n, (int) (this.long_b + -this.long_y), buffer, off, length2);
					off += length2;
					this.long_b += (long) length2;
				}

				if (length > this.bytes_n.length) {
					this.cacheFile.seek(this.long_b, (byte) 77);
					this.long_p = this.long_b;
					if (length > 0) {
						do {
							length2 = this.cacheFile.read(0, buffer, off, length);
							if (length2 == -1) {
								break;
							}

							this.long_p += (long) length2;
							length -= length2;
							off += length2;
							this.long_b += (long) length2;
						} while (length > 0);
					}
				} else {
					if (length > 0) {
						this.a(89);
						length2 = length;
						if (this.z < length) {
							length2 = this.z;
						}

						ef.copyBytes(this.bytes_n, 0, buffer, off, length2);
						off += length2;
						length -= length2;
						this.long_b += (long) length2;
					}
				}

				if (this.long_i != -1L) {
					if (this.long_b < this.long_i && length > 0) {
						length2 = off + (int) (-this.long_b + this.long_i);
						if (length2 > off + length) {
							length2 = length + off;
						}

						while (off < length2) {
							--length;
							buffer[off++] = 0;
							++this.long_b;
						}
					}

					long l1 = -1L;
					long l2 = -1L;
					if (this.long_i < l || (long) length1 + l <= this.long_i) {
						if (l >= this.long_i && l < (long) this.int_o + this.long_i) {
							l2 = l;
						}
					} else {
						l2 = this.long_i;
					}

					if (l < (long) this.int_o + this.long_i && l + (long) length1 >= (long) this.int_o + this.long_i) {
						l1 = (long) this.int_o + this.long_i;
					} else {
						if (this.long_i < (long) length1 + l && this.long_i + (long) this.int_o >= (long) length1 + l) {
							l1 = l + (long) length1;
						}
					}

					if (l2 > -1L && l2 < l1) {
						int length3 = (int) (l1 - l2);
						ef.copyBytes(this.bytes_l, (int) (-this.long_i + l2), buffer, off + (int) (-l + l2), length3);
						if (l1 > this.long_b) {
							length = (int) ((long) length - (-this.long_b + l1));
							this.long_b = l1;
						}
					}
				}
			} catch (IOException e) {
				this.long_p = -1L;
				throw e;
			}

			if (length > 0) {
				throw new EOFException();
			}
		} catch (RuntimeException var16) {
			throw id.a(var16, "bb.A(" + "{...}" + ',' + off + ',' + unused + ',' + length + ')');
		}
	}

	final void a (long l, byte unused) {
		try {
			++A;
			if (l >= 0L) {
				this.long_b = l;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bb.J(" + l + ',' + unused + ')');
		}
	}

	final long size (int unused) {
		try {
			++int_v;
			return this.long_e;
		} catch (RuntimeException var3) {
			throw id.a(var3, "bb.C(" + unused + ')');
		}
	}

	final void a (int len, int off, byte[] buffer, int unused) throws IOException {
		try {
			++int_s;
			try {
				if (this.long_b + (long) len > this.long_e) {
					this.long_e = (long) len + this.long_b;
				}

				if (this.long_i != -1L && (this.long_i > this.long_b || (long) this.int_o + this.long_i < this.long_b)) {
					this.a(true);
				}

				if (this.long_i != -1L && this.long_b + (long) len > (long) this.bytes_l.length + this.long_i) {
					int length = (int) (this.long_i + -this.long_b + (long) this.bytes_l.length);
					len -= length;
					ef.copyBytes(buffer, off, this.bytes_l, (int) (this.long_b - this.long_i), length);
					this.long_b += (long) length;
					off += length;
					this.int_o = this.bytes_l.length;
					this.a(true);
				}

				if (this.bytes_l.length >= len) {
					if (len > 0) {
						if (this.long_i == -1L) {
							this.long_i = this.long_b;
						}

						ef.copyBytes(buffer, off, this.bytes_l, (int) (-this.long_i + this.long_b), len);
						this.long_b += (long) len;
						if (this.long_b + -this.long_i > (long) this.int_o) {
							this.int_o = (int) (-this.long_i + this.long_b);
						}

					}
				} else {
					if (this.long_b != this.long_p) {
						this.cacheFile.seek(this.long_b, (byte) -62);
						this.long_p = this.long_b;
					}

					this.cacheFile.write(-126, len, buffer, off);
					this.long_p += (long) len;
					long l = -1L;
					long l1 = -1L;
					if (this.long_g < this.long_p) {
						this.long_g = this.long_p;
					}

					if (this.long_b < this.long_y || this.long_b >= this.long_y + (long) this.z) {
						if (this.long_b <= this.long_y && (long) len + this.long_b > this.long_y) {
							l = this.long_y;
						}
					} else {
						l = this.long_b;
					}

					if ((long) len + this.long_b <= this.long_y || (long) len + this.long_b > this.long_y + (long) this.z) {
						if (this.long_y + (long) this.z > this.long_b && (long) this.z + this.long_y <= this.long_b + (long) len) {
							l1 = this.long_y + (long) this.z;
						}
					} else {
						l1 = this.long_b + (long) len;
					}

					if (l > -1L && l < l1) {
						int length = (int) (-l + l1);
						ef.copyBytes(buffer, (int) (-this.long_b + (long) off + l), this.bytes_n, (int) (-this.long_y + l), length);
					}

					this.long_b += (long) len;
				}
			} catch (IOException e) {
				this.long_p = -1L;
				throw e;
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "bb.F(" + len + ',' + off + ',' + (buffer != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final void close (byte unused) throws IOException {
		try {
			++int_u;
			this.a(true);
			this.cacheFile.close(70);
		} catch (RuntimeException var3) {
			throw id.a(var3, "bb.B(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	private void a (boolean unused) throws IOException {
		try {
			++int_d;
			if (this.long_i != -1L) {
				if (this.long_i != this.long_p) {
					this.cacheFile.seek(this.long_i, (byte) 26);
					this.long_p = this.long_i;
				}

				this.cacheFile.write(-82, this.int_o, this.bytes_l, 0);
				this.long_p += (long) this.int_o;
				long l = -1L;
				if (this.long_y > this.long_i || this.long_i >= (long) this.z + this.long_y) {
					if (this.long_i <= this.long_y && this.long_i + (long) this.int_o > this.long_y) {
						l = this.long_y;
					}
				} else {
					l = this.long_i;
				}

				if (this.long_g < this.long_p) {
					this.long_g = this.long_p;
				}

				long l1 = -1L;
				if (this.long_y < (long) this.int_o + this.long_i && (long) this.int_o + this.long_i <= this.long_y + (long) this.z) {
					l1 = this.long_i + (long) this.int_o;
				} else {
					if (this.long_i < (long) this.z + this.long_y && this.long_y + (long) this.z <= this.long_i + (long) this.int_o) {
						l1 = this.long_y + ((long) this.z);
					}
				}

				if (l > -1L && l < l1) {
					int length = (int) (-l + l1);
					ef.copyBytes(this.bytes_l, (int) (l - this.long_i), this.bytes_n, (int) (-this.long_y + l), length);
				}

				this.int_o = 0;
				this.long_i = -1L;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "bb.H(" + unused + ')');
		}
	}
}
