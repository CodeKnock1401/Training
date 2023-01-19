import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hello");
		System.out.println("1");
		// int [-2^31, 2^31)
		// long [-2^63, 2^63)
		// double 64-bit 
		// float 32-bit 
		// boolean true false
		// String "asdasd   123dasd"

		String parsa;
		parsa = " ";
		String parsaa = " ";

		parsa = "lala";
		int r = 2;
		long a = 2;
		double t = 2.0;
		boolean c;
		c = true;
		c = false;
		double da = 0.1;
		double db = 0.2;
		double dsum = da + db;
		System.out.println(dsum); // 0.3?
		
		// + - * / %
		// += -= *= /= %=
		a = a + 1;
		a += 1;
		// 7 % 2
		// < > <= >= == !=
		// 1 == 2
		// 1 != 2

		// ++ --
		int aa = 1;
		aa++; 
		aa = aa + 1;
		aa += 1;
		aa--;
		aa = aa - 1;
		aa -= 1;

		int first = input.nextInt();
		int second = input.nextInt();
		int sum = first + second;
		System.out.println(sum);
		int n = input.nextInt();
		if (n % 3 == 0) {
			System.out.println("salam");
		}
		else if (n % 3 == 1) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		int m = input.nextInt();
		int sum1 = 0;
		int j = 1;
		while (j <= m) {
			sum1 += j;
			j++;
		}
		System.out.println(sum1);

		int k = 1;
		while (k <= n) {
			// code
			k++;
		}

		// for (int i = 1; i <= n; i++) {
			// code
		// }

		// for (int i = 100; i >= 0; i /= 2) {
		// } 

		Math.max(2, 3);
		Math.min(2, 3);
		String s = "hello";
		char ch = 'a';
		// s.charAt(0) == 'h';
		s.length();
		// s.substring(i, j); // [i, j)
		// s.substring(1, 2) == "e"; // wrong, correct form:
		// s.substring(1, 2).equals("e");
		// s.charAt(1) == 'e';
		// .equals();
		String s1 = input.next();
		String s2 = input.next();
		// Math.pow(a, b); // a^b
		boolean boo = false;
		// !t
		// if (!s.equals(t)) { // != 

		// }
		// int a = 1; 
		// int b = 2;
		// if (a != b)
		// if (!(a == b))
		String st = "hello world";
		if (st.substring(1, 4).equals("ell")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		// Math.sqrt(n);

		double rootOfFour = Math.sqrt(4); // 2.0

		// i = 1 ... sqrt(n)
		for (int i = 1; i <= Math.sqrt(n); i++) {
			System.out.println(i);
		}
		// OR
		for (int i = 1; i * i <= n; i++) {
			System.out.println(i);
		}
		// Second approach is better, because it doesn't have imprecision,
		// and it's faster because Math.sqrt is expensive in terms of time.
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// || && ! 
		// if (1 == 2 || 2 == 2) {
			// condition is true;
		// }
		// if (1 == 2 && 2 == 2) {
			// condition is false;
		// }
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = (i + 1) * (i + 1);
		}
		// OR
		for (int i = 1; i <= 5; i++) {
			array[i - 1] = i * i;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
