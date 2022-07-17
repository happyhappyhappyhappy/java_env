import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S[] = new int[n];
        for(int j=0;j<n;j++){
            S[j] = sc.nextInt();
        }
        Arrays.sort(S);
        for(int j=0;j<n;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println("");
        int check_n=sc.nextInt();
        sc.close();
        System.out.print(check_n+" の二分探索の結果 : ");
        int result=Arrays.binarySearch(S, check_n);
        // System.out.print
        System.out.println(result);
    }
}