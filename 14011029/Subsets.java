import java.util.Scanner;
import java.util.ArrayList;

class Subsets {
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> S) {
		if (S.size() == 0) {
			ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
			ans.add(new ArrayList<Integer>());
			return ans;
		}
		int x = S.get(0);
		ArrayList<Integer> T = new ArrayList<Integer>();
		for (int i = 1; i < S.size(); i++)
			T.add(S.get(i));
		ArrayList<ArrayList<Integer>> A = getSubsets(T);
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			ArrayList<Integer> Y = A.get(i);
			ArrayList<Integer> Z = new ArrayList<Integer>(Y);
			B.add(Z);
			Y.add(x);
			B.add(Y);
		}
		return B;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		ArrayList<Integer> S = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int t = stdin.nextInt();
			S.add(t);
		}
		ArrayList<ArrayList<Integer>> subsets = getSubsets(S);
		for (ArrayList<Integer> X: subsets) {
			System.out.print("{");
			for (Integer i: X)
				System.out.print(i + ", ");
			System.out.println("}");
		}
	}
}
