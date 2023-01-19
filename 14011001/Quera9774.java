import java.util.Scanner;

class Quera9774 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int digit = c - '0';
			System.out.print(c + ": ");
			for (int j = 0; j < digit; j++) {
				System.out.print(digit);
			}
			System.out.println();
		}
	}
}
