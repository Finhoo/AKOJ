import java.util.*;
public class Test {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),
                m=sc.nextInt();
           // int[] food[]=new int[n+1][n+1];
           // int[] flag=new int[n+1];
            int[] food[]=new int[1000][1000];
            int[] flag=new int[1000];
            while(m-->0){
                int a=sc.nextInt(),b=sc.nextInt();
                if(food[a][b]==0){    //防止有重复的数据
                  food[a][b]=1;
                  flag[b]++;
                }
            }
            topsort(food,flag,n);
        }
        sc.close();
    }
    private static void topsort(int[][] food, int[] flag, int n) {
        String str="";
        int count=0;
        for(int k=0;k<n;k++){
            boolean f=true;
            int s=-1;
            for(int i=n;i>0;i--){
               if(flag[i]==0){
                   flag[i]--;
                   str+=i+" ";
                   count++;s=i;
                   f=false;
                   break;
               } 
            }
            if(f) break;
            for(int j=1;j<=n;j++){
               if(food[s][j]==1){
                    flag[j]--;
                    food[s][j]=0;
               }
            }
        }
        if(count==n) System.out.println(str.trim());
        else System.out.println("-1");
    }   
}