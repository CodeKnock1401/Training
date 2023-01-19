import java.util.Scanner;

class Prime {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				break;
			}
			i++;
		}
		if (n == 1) {
			System.out.println("no");
		}
		else if (n == 2) {
			System.out.println("yes");
		}
		else if (n % i == 0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
	}
}
