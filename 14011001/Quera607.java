import java.util.Scanner;

class Quera607 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		int k = stdin.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][k];
		int[][] S = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = stdin.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				B[i][j] = stdin.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				for (int l = 0; l < m; l++) {
					S[i][j] += A[i][l] * B[l][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(S[i][j] + " ");
			}
			System.out.println();
		}
	}
}
