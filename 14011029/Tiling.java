import java.util.Scanner;

class Tiling {
	public static int f(int n) {
		if (n == 1) 
			return 2;
		if (n == 2)
			return 7;
		return f(n - 1) + g(n - 1) + f(n - 2) + g(n - 2);
	}

	public static int g(int n) {
		if (n == 0) 
			return 1;
		if (n == 1)
			return 3;
		return f(n) + g(n - 1);
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		System.out.println(f(n));
	}
}
