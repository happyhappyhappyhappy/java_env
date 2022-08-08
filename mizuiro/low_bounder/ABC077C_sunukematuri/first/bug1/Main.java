import java.util.*;
// テストデータ取り出し→標準出力まで
public class Main{
    public static boolean isLowOK(long content,long search){
        if(content >= search){ // S[mid] >= basic
            return true;
        }
        else{
            return false;
        }

    }
    public static int j_lowbounder(long basic,long[] S){
        int right=S.length;
        int left=-1;
        while(Math.abs(right-left)>1){
            int mid = (right+left)/2;
            if(isLowOK(S[mid], basic)){
                right = mid;
            }
            else{
                left = mid;
            }
        }
        return right;
    }
    public static boolean isUppOK(long content,long search){
        if(content > search){ // S[mid] > basic
            return true;
        }
        else{
            return false;
        }

    }
    public static int j_upperbounder(long basic,long[] S){
        int right=S.length;
        int left=-1;
        while(Math.abs(right-left)>1){
            int mid = (right+left)/2;
            if(isUppOK(S[mid], basic)){
                right = mid;
            }
            else{
                left = mid;
            }
        }
        return right;
    }
    public static long solver(int peace,long[] A,long[] B,long[] C){
        long result=0;
        for(int j=0;j<peace;j=j+1){
            int acount=0;
            int ccount=0;
            acount=j_lowbounder(B[j],A);
            ccount=j_upperbounder(B[j], C);
            result = result + acount*(peace-ccount);            
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int peace = sc.nextInt();
        long[] A=new long[peace];
        long[] B=new long[peace];
        long[] C=new long[peace];
        for(int j=0;j<peace;j=j+1){
            A[j] = sc.nextLong();
        }
        for(int j=0;j<peace;j=j+1){
            B[j] = sc.nextLong();
        }
        for(int j=0;j<peace;j=j+1){
            C[j] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        System.out.println(solver(peace,A,B,C));
    }
}