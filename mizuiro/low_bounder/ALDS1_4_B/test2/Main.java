import java.util.*;
// 二分探索をめぐる式でやった場合のソース検証
public class Main{
    
    public static boolean m_format_c(int n,int[] S,int base){
        boolean result = false;
        int left=-1;
        int right=n;
        while(Math.abs(right-left)>1){
            int mid;
            mid = (right+left)/2;
            System.out.println("mid:"+mid);
            if(base<=S[mid]){
                // まだまだ低いところを探す
                right = mid;
            }
            else{
                // 高いところを探す
                left = mid;
            }
            System.out.println("Now left = "+left+" right = "+right);
        }
        // 抜けた後にrightがbaseが一致しているか確認する
        if(right < n && S[right]==base){// FixME:nのままだったらここ入れない
            result = true;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S[];
        S =new int[n];
        for(int j=0;j<n;j++){
            S[j] = sc.nextInt();
        }
        int u_int=sc.nextInt(); // 最終行 チェックしたい数字
        Arrays.sort(S);
        for(int j=0;j<n;j++){
            System.out.print(S[j]+" ");
        }
        System.out.print("\n");
        boolean result=m_format_c(n,S,u_int);
        if(result){
            System.out.println(u_int+" は Sの中に入ります");
        } 
        else{
            System.out.println(u_int+" は Sの中に入りません");
        }      
        sc.close();
    }
}