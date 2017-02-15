import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class ff implements Runnable {
	static int int_c;
	static long long_e = 0L;
	static rd rd_f;
	static int int_g;
	static int[] ints_h;
	static rd rd_i;
	static int int_j;
	static int int_l;
	static rd rd_m;
	static rd loadingText;
	static int int_o;
	static boolean redrawSidePanel = false;
	static rd k_;
	static rd rd_t = md.a((String) "", (byte) 125);
	static int[] ints_v;
	static rd rd_w;
	static int y;
	static rd z;
	static int A;
	static rd B;
	static int E;
	static rd loadedFonts2;
	static int G;
	static int H;
	static int I;
	private static rd loadedFonts = md.a((String) "Loaded fonts", (byte) 123);

	static {
		rd_w = rd_t;
		k_ = md.a("k", (byte) 122);
		loadingText = rd_t;
		rd_i = rd_t;
		B = md.a("Bitte benutzen Sie eine andere Welt)3", (byte) 117);
		rd_f = rd_t;
		z = rd_t;
		rd_m = rd_t;
		loadedFonts2 = loadedFonts;
	}

	private int int_a = 0;
	private byte[] bytes_d;
	private g g_k;
	private OutputStream outputStream_q;
	private int int_s = 0;
	private InputStream inputStream_u;
	private boolean x = false;
	private ma C;
	private boolean D = false;
	private Socket socket;

	ff (Socket socket, g signlink) throws IOException {
		try {
			this.socket = socket;
			this.g_k = signlink;
			this.socket.setSoTimeout(30000);
			this.socket.setTcpNoDelay(true);
			this.inputStream_u = this.socket.getInputStream();
			this.outputStream_q = this.socket.getOutputStream();
		} catch (RuntimeException var4) {
			throw id.a(var4, "ff.<init>(" + (socket != null ? "{...}" : "null") + ',' + (signlink != null ? "{...}" : "null") + ')');
		}
	}

	static int a (int i, int i1, int i2) {
		try {
			++H;
			int i3 = i1 + (i * 57);
			i3 ^= i3 << 13;
			int i4 = i2 & i3 * (15731 * i3 * i3 + 789221) + 1376312589;
			return 255 & i4 >> 19;
		} catch (RuntimeException var5) {
			throw id.a(var5, "ff.C(" + i + ',' + i1 + ',' + i2 + ')');
		}
	}

	static void a (boolean flag, byte unused) {
		try {
			++int_o;
			we.r = flag;
			if (we.r) {
				int plane1 = lc.readStream.readUnsignedByteS(255);
				int localX = lc.readStream.readUnsignedLEShortA((byte) 98);
				int localY = lc.readStream.readUnsignedLEShortA((byte) 118);
				int regionY = lc.readStream.readUnsignedLEShortA((byte) 87);
				int regionX = lc.readStream.readUnsignedShort((byte) 52);
				lc.readStream.initializeBITAccess(-114);
				int chunkMapPlane = 0;
				do {
					int chunkX = 0;
					do {
						int chunkY = 0;
						do {
							int updateRequired = lc.readStream.readBits((byte) 42, 1);
							if (updateRequired == 1) {
								ab.mapChunks[chunkMapPlane][chunkX][chunkY] = lc.readStream.readBits((byte) 69, 26);
							} else {
								ab.mapChunks[chunkMapPlane][chunkX][chunkY] = -1;
							}

							++chunkY;
						} while (chunkY < 13);

						++chunkX;
					} while (chunkX < 13);

					++chunkMapPlane;
				} while (chunkMapPlane < 4);

				lc.readStream.finishBitAccess((byte) 61);
				int size = (-lc.readStream.pointer + l.incomingPacketSize) / 16;
				e.ints_ib = new int[size][4];
				int chunk = 0;
				if (size > chunk) {
					do {
						int plane = 0;
						do {
							e.ints_ib[chunk][plane] = lc.readStream.readInt_V1((byte) 121);
							++plane;
						} while (plane < 4);

						++chunk;
					} while (size > chunk);
				}

				l.U = new int[size];
				fc.bytes_q = new byte[size][];
				be.bytes_i = new byte[size][];
				ee.ints_f = new int[size];
				ke.Qb = new int[size];
				size = 0;
				int plane = 0;
				do {
					int chunkX = 0;
					do {
						int chunkY = 0;
						do {
							int i5 = ab.mapChunks[plane][chunkX][chunkY];
							if (i5 != -1) {
								int i6 = (i5 & 16762583) >> 14;
								int i7 = (16380 & i5) >> 3;
								int i8 = (i6 / 8 << 8) + i7 / 8;
								int i9 = 0;
								if (i9 < size) {
									do {
										if (i8 == l.U[i9]) {
											i8 = -1;
											break;
										}

										++i9;
									} while (i9 < size);
								}

								if (i8 != -1) {
									int xCalc = (i8 & 'Ｉ') >> 8;
									int yCalc = 255 & i8;
									l.U[size] = i8;
									ke.Qb[size] = pb.cacheFile5.a(pc.a((byte) 127, new rd[]{client.m_, bf.a(xCalc, -31766), ja.underscore, bf.a(yCalc, -31766)}), (byte) -101);
									ee.ints_f[size] = pb.cacheFile5.a(pc.a((byte) 127, new rd[]{ra.l_, bf.a(xCalc, -31766), ja.underscore, bf.a(yCalc, sd.b(-85, 31809))}), (byte) -109);
									++size;
								}
							}

							++chunkY;
						} while (chunkY < 13);

						++chunkX;
					} while (chunkX < 13);

					++plane;
				} while (plane < 4);

				dd.a(localY, -1, localX, plane1, regionX, regionY);
			} else {
				int plane = lc.readStream.readUnsignedByteS(255);
				int regionY = lc.readStream.readUnsignedLEShort(255);
				int localX = lc.readStream.readUnsignedShort((byte) 46);
				int mapData_chunks = (-lc.readStream.pointer + l.incomingPacketSize) / 16;
				e.ints_ib = new int[mapData_chunks][4];
				int idx = 0;
				if (idx < mapData_chunks) {
					for ( ; idx < mapData_chunks ; idx++) {
						for (int height = 0 ; height < 4 ; height++) {
							e.ints_ib[idx][height] = lc.readStream.readInt((byte) -122);
						}
					}
				}

				int localY = lc.readStream.readUnsignedLEShort(255);
				boolean forced = false;
				int regionX = lc.readStream.readUnsignedLEShortA((byte) 81);
				System.out.println("RegionX: " + regionX + " RegionY: " + regionY + " LocalX: " + localX + " LocalY: " + localY + " plane: " + plane);
				ke.Qb = new int[mapData_chunks];
				ee.ints_f = new int[mapData_chunks];
				l.U = new int[mapData_chunks];
				if ((regionX / 8 == 48 || regionX / 8 == 49) && regionY / 8 == 48) {
					forced = true;
				}

				fc.bytes_q = new byte[mapData_chunks][];
				if (regionX / 8 == 48 && regionY / 8 == 148) {
					forced = true;
				}

				be.bytes_i = new byte[mapData_chunks][];
				mapData_chunks = 0;
				int xCalc = (-6 + regionX) / 8;
				if ((6 + regionX) / 8 >= xCalc) {
					do {
						int yCalc = (regionY + -6) / 8;
						if ((regionY + 6) / 8 < yCalc) {
							++xCalc;
						} else {
							do {
								int regionId = (xCalc << 8) + yCalc;
								if (!forced || yCalc != 49 && yCalc != 149 && yCalc != 147 && xCalc != 50 && (xCalc != 49 || yCalc != 47)) {
									l.U[mapData_chunks] = regionId;
									ke.Qb[mapData_chunks] = pb.cacheFile5.a(pc.a((byte) 125, new rd[]{client.m_, bf.a(xCalc, -31766), ja.underscore, bf.a(yCalc, -31766)}), (byte) -94);
									ee.ints_f[mapData_chunks] = pb.cacheFile5.a(pc.a((byte) 125, new rd[]{ra.l_, bf.a(xCalc, -31766), ja.underscore, bf.a(yCalc, -31766)}), (byte) -128);
									++mapData_chunks;
								}

								++yCalc;
							} while (~((regionY + 6) / 8) <= ~yCalc);

							++xCalc;
						}
					} while ((6 + regionX) / 8 >= xCalc);
				}

				dd.a(localY, -1, localX, plane, regionX, regionY);
			}
		} catch (RuntimeException var21) {
			throw id.a(var21, "ff.B(" + flag + ',' + unused + ')');
		}
	}

	static rd a (int unused, long l) {
		try {
			++I;
			if (l > 0L && l < 6582952005840035281L) {
				if (l % 37L == 0L) {
					return null;
				} else {
					long l1 = l;
					int pointer = 0;
					while (l1 != 0L) {
						l1 /= 37L;
						++pointer;
					}

					byte[] data = new byte[pointer];
					rd class_rd;
					do {
						long l2 = l;
						l /= 37L;
						--pointer;
						data[pointer] = bd.bytes_mc[(int) (-(37L * l) + l2)];
					} while (l != 0L);

					class_rd = new rd();
					class_rd.stringBuffer = data;
					class_rd.stringPointer = data.length;
					return class_rd;
				}
			} else {
				return null;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "ff.J(" + unused + ',' + l + ')');
		}
	}

	public static void b (byte unused) {
		try {
			z = null;
			rd_f = null;
			rd_m = null;
			rd_t = null;
			rd_w = null;
			B = null;
			rd_i = null;
			ints_h = null;
			k_ = null;
			loadedFonts = null;
			ints_v = null;
			loadedFonts2 = null;
			loadingText = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ff.D(" + unused + ')');
		}
	}

	static void a (int unused, int plane) {
		try {
			++A;
			int[] imagePixels = pd.S.imagePixels;
			int length = imagePixels.length;
			for (int size = 0 ; size < length ; size++) {
				imagePixels[size] = 0;
			}

			int y = 1;
			while (y < 103) {
				int pointer = 512 * (103 + -y) * 4 + 24628;
				int x = 1;
				if (x >= 103) {
					++y;
				} else {
					do {
						if ((24 & d.bytes_j[plane][x][y]) == 0) {
							pc.o.a(imagePixels, pointer, 512, plane, x, y);
						}

						if (plane < 3 && (8 & d.bytes_j[plane + 1][x][y]) != 0) {
							pc.o.a(imagePixels, pointer, 512, plane + 1, x, y);
						}

						pointer += 4;
						++x;
					} while (x < 103);

					++y;
				}
			}

			int i = -10 + (int) (20.0D * Math.random()) + 238 + ((int) (Math.random() * 20.0D) + 228 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8);
			pd.S.f();
			int i3 = 238 + (int) (20.0D * Math.random()) - 10 << 16;
			int y1 = 1;
			if (y1 < 103) {
				do {
					int x = 1;
					if (x >= 103) {
						++y1;
					} else {
						do {
							if ((24 & d.bytes_j[plane][x][y1]) == 0) {
								hf.a(y1, 0, x, i, i3, plane);
							}

							if (plane < 3 && (d.bytes_j[1 + plane][x][y1] & 8) != 0) {
								hf.a(y1, 0, x, i, i3, plane + 1);
							}

							++x;
						} while (x < 103);

						++y1;
					}
				} while (y1 < 103);
			}

			lc.k = 0;
			int x = 0;
			if (x >= 104) {
				return;
			}

			do {
				int y2 = 0;
				if (y2 >= 104) {
					++x;
				} else {
					do {
						int fileRequest = pc.o.q(ce.plane, x, y2);
						if (fileRequest != 0) {
							fileRequest = (fileRequest & 536870001) >> 14;
							int mapfunctionIndex = ub.a(-66, fileRequest).int_ic;
							if (mapfunctionIndex >= 0) {
								int y3 = y2;
								int x1 = x;
								if (mapfunctionIndex != 22 && mapfunctionIndex != 29 && mapfunctionIndex != 34 && mapfunctionIndex != 36 && mapfunctionIndex != 46 && mapfunctionIndex != 47 && mapfunctionIndex != 48) {
									int[][] adjacency = nd.xd[ce.plane].adjacency;
									int i1 = 0;
									if (i1 < 10) {
										do {
											int i2 = (int) (4.0D * Math.random());
											if (i2 == 0 && x1 > 0 && x - 3 < x1 && (19398920 & adjacency[-1 + x1][y3]) == 0) {
												--x1;
											}

											if (i2 == 1 && x1 < 103 && x + 3 > x1 && (19399040 & adjacency[x1 + 1][y3]) == 0) {
												++x1;
											}

											if (i2 == 2 && y3 > 0 && y3 > -3 + y2 && (19398914 & adjacency[x1][-1 + y3]) == 0) {
												--y3;
											}

											if (i2 == 3 && y3 < 103 && 3 + y2 > y3 && (19398944 & adjacency[x1][y3 + 1]) == 0) {
												++y3;
											}

											++i1;
										} while (i1 < 10);
									}
								}

								ib.d[lc.k] = tc.mapfunction[mapfunctionIndex];
								tc.L[lc.k] = x1;
								se.p[lc.k] = y3;
								++lc.k;
							}
						}

						++y2;
					} while (y2 < 104);

					++x;
				}
			} while (x < 104);
		} catch (RuntimeException var19) {
			throw id.a(var19, "ff.E(" + unused + ',' + plane + ')');
		}
	}

	final int available (byte unused) throws IOException {
		try {
			++int_j;
			if (this.D) {
				return 0;
			} else {
				return this.inputStream_u.available();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ff.F(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	final void writeToStream (boolean unused, int length, int unused2, byte[] buffer) throws IOException {
		try {
			++E;
			if (!this.D) {
				if (this.x) {
					this.x = false;
					throw new IOException();
				} else {
					if (this.bytes_d == null) {
						this.bytes_d = new byte[5000];
					}

					synchronized (this) {
						int pos = 0;
						if (pos >= length) {
							if (this.C == null) {
								this.C = this.g_k.a(3, (byte) -122, this);
							}

							this.notifyAll();
							return;
						}

						do {
							this.bytes_d[this.int_s] = buffer[pos];
							this.int_s = (1 + this.int_s) % 5000;
							if (this.int_s == (4900 + this.int_a) % 5000) {
								throw new IOException();
							}

							++pos;
						} while (pos < length);

						if (this.C == null) {
							this.C = this.g_k.a(3, (byte) -122, this);
						}

						this.notifyAll();
					}
				}
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "ff.G(" + unused + ',' + length + ',' + unused2 + ',' + (buffer != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int unused) {
		try {
			++int_c;
			if (!this.D) {
				synchronized (this) {
					this.D = true;
					this.notifyAll();
				}

				if (this.C != null) {
					while (this.C.f == 0) {
						wa.sleep(17525, 1L);
					}

					if (this.C.f == 1) {
						try {
							((Thread) this.C.c).join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

				this.C = null;
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "ff.I(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	final void read (int off, byte[] data, int len, int unused) throws IOException {
		try {
			++int_l;
			if (!this.D) {
				while (len > 0) {
					int dataRead = this.inputStream_u.read(data, off, len);
					if (dataRead <= 0) {
						throw new EOFException();
					}

					len -= dataRead;
					off += dataRead;
				}

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "ff.H(" + off + ',' + (data != null ? "{...}" : "null") + ',' + len + ',' + unused + ')');
		}
	}

	protected final void finalize () {
		try {
			this.a(25830);
			++y;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ff.finalize(" + ')');
		}
	}

	public final void run () {
		try {
			++int_g;
			try {
				while (true) {
					int len;
					int off;
					synchronized (this) {
						if (this.int_s == this.int_a) {
							if (this.D) {
								break;
							}

							try {
								this.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}

						if (this.int_a <= this.int_s) {
							len = -this.int_a + this.int_s;
						} else {
							len = 5000 - this.int_a;
						}

						off = this.int_a;
					}

					if (len > 0) {
						try {
							this.outputStream_q.write(this.bytes_d, off, len);
						} catch (IOException var15) {
							this.x = true;
						}

						this.int_a = (len + this.int_a) % 5000;

						try {
							if (this.int_a == this.int_s) {
								this.outputStream_q.flush();
							}
						} catch (IOException e) {
							this.x = true;
						}
					}
				}

				try {
					if (this.inputStream_u != null) {
						this.inputStream_u.close();
					}

					if (this.outputStream_q != null) {
						this.outputStream_q.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				this.bytes_d = null;
			} catch (Exception e1) {
				se.a((byte) 13, e1, null);
			}
		} catch (RuntimeException var19) {
			throw id.a(var19, "ff.run(" + ')');
		}
	}

	final int read (int unused) throws IOException {
		try {
			++G;
			return this.D ? 0 : this.inputStream_u.read();
		} catch (RuntimeException var3) {
			throw id.a(var3, "ff.A(" + unused + ')');
		}
	}
}
