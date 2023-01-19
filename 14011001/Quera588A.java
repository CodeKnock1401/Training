import java.util.Scanner;

class Quera588A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			if (arr1[i] > j) {
				j = arr1[i];
			}
		}
		System.out.println(j);
	}
}
