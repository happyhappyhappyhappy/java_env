import java.util.*;
import java.lang.Math;
// 参考:https://github.com/happyhappyhappyhappy/sakura-cpp/tree/master/comp_pro/atcoder/joi2009ho_b

public class Main{
    
    public static int low_pos(long[] S,long x){
        int result=0;
        int right=S.length;
        int left=-1;
        while(Math.abs(right-left)>1){
            System.out.println(x + " right = " + right + " left = "+left);
            int mid=(right+left)/2;
            if(x <= S[mid]){
                right = mid;
            }
            else{
                left=mid;
            }
        }
        result = right;
        return result;
    }
    public static long solver(long[] S,long[] T){
        long result=0;
        Arrays.sort(S);
        Arrays.sort(T);
        System.out.println("T's Data");
        for(int j=0;j<T.length;j++)
        {
            System.out.println(T[j]);
        }
        System.out.println("T's Data End");
        for(int j=0;j<T.length;j++){
            int pos = low_pos(S,T[j]);
            long under_path=Math.abs(T[j]-S[pos]);
            long upper_path=Math.abs(S[pos-1]-T[j]);
            if(under_path < upper_path){
                result = result + under_path;
            }
            else{
                result = result + upper_path;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // データ入力
        // 全長
        long d1=sc.nextLong();
        // 店舗の個数
        int d2=sc.nextInt();
        // 注文の個数
        int d3=sc.nextInt();
        // 店舗の位置 1を加えているのは本店の位置、最初と最後
        long S[]=new long[d2+1];
        for(int j=0;j<d2-1;j=j+1){
            S[j]=sc.nextLong();
        }
        S[d2-1]=d1; // 最後
        S[d2]=0; // 最初
        // 注文者の位置
        long T[]=new long[d3];
        for(int j=0;j<d3;j=j+1){
            T[j]=sc.nextLong();
        }
        sc.close();
        System.out.println(solver(S,T));
    }
}
