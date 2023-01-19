import java.util.Scanner;
import java.util.ArrayList;

class MergeSort {
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
		int n = a.size();
		if (n <= 1)
			return a;
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < n / 2; i++)
			l.add(a.get(i));
		for (int i = n / 2; i < n; i++)
			r.add(a.get(i));
		ArrayList<Integer> ls = mergeSort(l);
		ArrayList<Integer> rs = mergeSort(r);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (ans.size() < n) {
			if (i < ls.size() && j < rs.size()) {
				if (ls.get(i) < rs.get(j)) {
					ans.add(ls.get(i));
					i++;
				}
				else {
					ans.add(rs.get(j));
					j++;
				}
			}
			else if (i < ls.size()) {
				ans.add(ls.get(i));
				i++;
			}
			else if (j < rs.size()) {
				ans.add(rs.get(j));
				j++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int t = stdin.nextInt();
			input.add(t);
		}
		ArrayList<Integer> sorted = mergeSort(input);
		for (Integer i: sorted)
			System.out.print(i + " ");
		System.out.println();
	}
}
