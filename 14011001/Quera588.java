import java.util.Scanner;

class Quera588 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int t = stdin.nextInt();
			if (t > max) {
				max = t;
			}
		}
		System.out.println(max);
	}
}
