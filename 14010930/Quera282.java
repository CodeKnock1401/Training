import java.util.Scanner;

class Quera282 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int sumOfDivisors = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sumOfDivisors += i;
			}
		}
		if (sumOfDivisors == n) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
