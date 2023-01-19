class Benchmark2 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000 * 1000; i++) {
			long r = (long) i * i;
		}
	}
}
