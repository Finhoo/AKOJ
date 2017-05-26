
import java.util.Scanner;

public class P1845 {
	static int ans = 0;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int []a = new int[n];
			for (int i=0; i<n; i++)
				a[i] = cin.nextInt();
			ans = 0;
			MergeSort(a, 0, a.length-1);
			System.out.println(ans);
		}
		cin.close();
	}

	private static void MergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			MergeSort(a, low, mid);
			MergeSort(a, mid + 1, high);
			Merge(a, low, mid, high);
		}
	}

	private static void Merge(int[] a, int low, int mid, int high) {
		int []tmp = new int[high- low + 1];
		int i = low;
		int j = mid + 1;
		int index = 0;
		while (i <= mid && j <= high) {
			if (a[i] <= a[j])
				tmp[index++] = a[i++];
			else {
				ans += j-index-i;
				tmp[index++] = a[j++];
			}
		}
		while (i <= mid)
			tmp[index++] = a[i++];
		while (j <= high)
			tmp[index++] = a[j++];
		for (int c=0; c<tmp.length; c++)
			a[c + low] = tmp[c];
	}
}
