import java.io.PrintWriter;
import java.util.Scanner;
 
public class P1737 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
 
    public static void main(String[] args) {
 
        while (cin.hasNext()) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            int[] arr = new int[100];
            int v = 1;
            for (int i = 0; i < n; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                for (int j = 0; j < b; j++) {
                    arr[v] = a;
                    v++;
                }
            }
            int[][][] array = new int[v][v][m + 1];
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    for (int j2 = 0; j2 <= m; j2++) {
                        array[i][j][j2] = 0;
                    }
                }
            }
         
            for (int i = 1; i < v; i++) {
                for (int j = 1; j <= m; j++) {
                    if (arr[i] <= j && arr[i] > array[i][1][j]) {
                        array[i][1][j] = arr[i];
                    } else {
                        array[i][1][j] = array[i - 1][1][j];
                    }
                }
            }
            for (int i = 2; i < v; i++) {
                for (int j = 2; j <= i; j++) {
                    for (int j2 = 1; j2 <= m; j2++) {
                        int a = 0;
                        int b = array[i - 1][j][j2];
                        if (j2 - arr[i] >= 0) {
                            a = array[i - 1][j - 1][j2 - arr[i]] + arr[i];
                        }
                        if (a > b) {
                            array[i][j][j2] = a;
                        } else {
                            array[i][j][j2] = b;
                        }
                    }
 
                }
            }
            int o = 0;
            h: for (int i = 1; i < v; i++) {
                for (int j = 1; j < v; j++) {
                    if (array[j][i][m] == m) {
                        System.out.println(i);
                        o = 1;
                        break h;
                    }
 
                }
 
            }
            if (o == 0) {
                System.out.println("><");
            }
 
        }
        cin.close();
        cout.close();
 
    }
 
}