class Benchmark1 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000 * 1000; i++) {
			double r = Math.sqrt(i);
		}
	}
}
