import java.util.*;
// テストデータ取り出し→標準出力まで
public class Main{
 
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
        Arrays.sort(S);
        int result=0;
        /** 
        一旦java.util.Arraysに備わる二分探索に頼る
        for(int j=0;j<q;j++){
            Boolean checkresult;
            checkresult=check(S,T[j]);
            if(checkresult){
                result = result + 1;
            }
        }
        **/
        for(int j=0;j<q;j++){
            int check_pos=Arrays.binarySearch(S, T[j]);
            if(0 <= check_pos){
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}