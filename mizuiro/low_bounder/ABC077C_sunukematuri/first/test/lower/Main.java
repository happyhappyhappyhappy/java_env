import java.util.*;
// テストデータ取り出し→標準出力まで
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // データ取得プロセス
        int counter=sc.nextInt();
        long S[] = new long[counter];
        for(int j=0;j<counter;j++){
            S[j]=sc.nextLong();
        }
        long basic=sc.nextLong();
        Arrays.sort(S);
        System.out.println("これから");
        for(int j=0;j<counter;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println();
        System.out.println("と "+basic+" を比較します");
        sc.close();
    }
}