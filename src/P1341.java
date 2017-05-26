import java.util.HashMap;

import java.util.Scanner;

public class P1341 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<Integer, Integer> map;
		int n = cin.nextInt();
		int maxc = 0, max = 0;
		map = new HashMap<Integer, Integer>();
		for (int i=0; i<n; i++) {
			int data = cin.nextInt();
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			}else 
				map.put(data, 1);
			if (map.get(data) > maxc) {
				maxc = map.get(data);
				max = data;
			}
			System.out.println(max);
			System.out.println(maxc);
		}
		
		cin.close();
	}
}
