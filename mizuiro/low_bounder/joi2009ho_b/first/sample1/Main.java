import java.util.*;
import java.lang.Math;

public class Main{
    
    public static int low_pos(int[] S,int x){
        int result=0;
        int right=S.length;
        int left=-1;
        while(Math.abs(right-left)>1){
            int mid=(right+left)/2;
            if(x<=S[mid]){
                right = mid;
            }
            else{
                left=mid;
            }
        }
        result = right;
        return result;
    }
    public static int solver(int[] S,int[] T){
        int result=0;
        Arrays.sort(S);
        Arrays.sort(T);
        for(int j=0;j<T.length;j++){
            int pos = low_pos(S,T[j]);
            int under_path=Math.abs(T[j]-S[pos]);
            int upper_path=Math.abs(S[pos-1]-T[j]);
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
        int d1;
        d1 = sc.nextInt();
        // 店舗の個数
        int d2=sc.nextInt();
        // 注文の個数
        int d3=sc.nextInt();
        int S[] = new int[d2+1];
        for(int j=0;j<d2-1;j++){
            S[j] = sc.nextInt();
        }
        S[d2] = d1;
        S[d2-1]=0;
        Arrays.sort(S);
        // 注文者の位置
        int T[]=new int[d3];
        for(int j=0;j<d3;j=j+1){
            T[j]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(T);
        /** 
        for(int j=0;j<d2+1;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println();
        for(int j=0;j<d3;j++){
            System.out.print(T[j]+" ");
        }
        System.out.println();
        **/
        /** for(int j=0;j<d3;j++){
            System.out.println(T[j]+"-->"+low_pos(S,T[j]));
        }**/
        System.out.println(solver(S,T));
    }
}