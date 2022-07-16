import java.util.*;
// テストデータ取り出し→標準出力まで
public class Main{
 
    public static int listup(int[] S,int[] B){
        int result=0;
        int s_length = S.length;
        int b_length=B.length;
        Arrays.sort(S);
        Arrays.sort(B);
        System.out.print("S : ");
        for(int j=0;j<s_length;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println("");
        System.out.print("B :");
        for(int j=0;j<b_length;j++){
            System.out.print(B[j]+" ");
        }
        System.out.print("\n");
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // データ取得プロセス
        int n = sc.nextInt();
        int S[];
        S = new int[n];
        for(int j=0;j<n;j++){
            S[j] = sc.nextInt();
        }
        int q = sc.nextInt();
        int T[];
        T = new int[q];
        for(int j=0;j<q;j++){
            T[j] = sc.nextInt();
        }
        // データ出力プロセス
        sc.close();
        int k=listup(S,T);
        System.out.println(k);
        /**
        System.out.print("S : ");
        for(int j=0;j<n;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println("");
        System.out.print("T : ");
        for(int j=0;j<q;j++){
            System.out.print(T[j]+" ");
        }
        System.out.print("\n");    
        // System.out.println(line1);
        **/
    }

}