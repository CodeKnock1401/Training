import java.util.Scanner;

class Quera589 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int answer = 1;
		int i = 1;
		while (i <= n) {
			answer = answer * i; // answer *= i;
			i++;
		}
		System.out.println(answer);
	}
}
