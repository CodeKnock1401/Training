import java.util.Scanner;

class Main {
	public static boolean isPalindrome(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t += s.charAt(i);
		}
		if (s.equals(t)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int distanceSquared(int x1, int y1, int x2, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int x1 = stdin.nextInt();
		int y1 = stdin.nextInt();
		int x2 = stdin.nextInt();
		int y2 = stdin.nextInt();
		int x3 = stdin.nextInt();
		int y3 = stdin.nextInt();
		int rs1 = distanceSquared(x1, y1, x2, y2);
		int rs2 = distanceSquared(x1, y1, x3, y3);
		int rs3 = distanceSquared(x2, y2, x3, y3);
		System.out.println(Math.max(rs1, Math.max(rs2, rs3)));
		/*
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] S = new int[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				A[row][col] = stdin.nextInt();
			}
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				B[row][col] = stdin.nextInt();
			}
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				S[row][col] = A[row][col] + B[row][col];
			}
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(S[row][col] + " ");
			}
			System.out.println();
		}
		int[] arr = {2, 3, 4, 5, 6};
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int element: arr) {
			System.out.println(element);
		}
		// int n = stdin.nextInt();
		String s = stdin.next();
		int[] count = new int[10];
		// while (n > 0) {
			// int rightDigit = n % 10;
			// count[rightDigit]++;
			// n = n / 10;
		// }
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int digit = c - '0';
			count[digit]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + count[i]);
		}
		int[] a = new int[4];
		a[0];
		a[1];
		a[2];
		a[3];
		int[][] b = new int[4][2];
		b[0][0];
		b[0][1];
		b[1][0];
		b[1][1];
		b[2][0];
		b[2][1];
		b[3][0];
		b[3][1];
		*/

	}
}
