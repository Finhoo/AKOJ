import java.util.Scanner;

public class P1066 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), m = cin.nextInt();
			cin.nextLine();
			String s[] = new String[n];
			for (int i=0; i<n; i++)
				s[i] = cin.nextLine();
			int max = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (s[i].charAt(j) == '.') {
						int x = i, y = j;
						int sum = 0;
						while(x >= 0 && s[x].charAt(y)!='#')
	                    {
	                        if(s[x].charAt(y)=='G')
	                            sum++;
	                        x--;
	                    }
	                    x=i;y=j;
	                    while(x < n && s[x].charAt(y)!='#')
	                    {
	                        if(s[x].charAt(y)=='G')
	                            sum++;
	                        x++;
	                    }
	                    x=i;y=j;
	                    while(y >= 0 && s[x].charAt(y) != '#')
	                    {
	                        if(s[x].charAt(y) == 'G')
	                            sum++;
	                        y--;
	                    }
	                    x=i;y=j;
	                    while(y<m && s[x].charAt(y)!='#')
	                    {
	                        if(s[x].charAt(y)=='G')
	                            sum++;
	                        y++;
	                    }
	                    if (sum >max)
	                    	max = sum;
					}
				}
			}
			System.out.println(max);
 		}
		cin.close();
	}
}
