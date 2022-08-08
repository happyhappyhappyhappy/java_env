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
            System.out.println("left="+left+"\tright="+right);
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // データ取得プロセス
        int counter=sc.nextInt();
        long S[] = new long[counter];
        for(int j=0;j<counter;j++){
            S[j]=sc.nextLong();
        }
        long basic=sc.nextLong();
        sc.close();
        Arrays.sort(S);
        System.out.println("これから");
        for(int j=0;j<counter;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println();
        System.out.println("と "+basic+" をupper観点で見ます");
        int pos;
        pos = j_upperbounder(basic,S);
        System.out.println(pos);
        System.out.println("sunuke祭りのC部分で使える本数は");
        int pattern=counter-pos;
        System.out.println(pattern);
    }
}