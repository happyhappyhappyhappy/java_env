import java.util.*;

public class Main{
    public static void main(String[] args){
        int testarray,testnumber;
        Scanner sc = new Scanner(System.in);
        testarray = sc.nextInt(); // 1行目 テストで扱う配列数
        testnumber = sc.nextInt(); // 2行目 配列の内訳
        for(int j=0;j<testarray;j++){
            long num[] = new long[testnumber];
            for(int k=0;k<testnumber;k=k+1){
                num[k] = sc.nextLong();
            }
            Arrays.sort(num);
            System.out.println(testnumber);
            for(int k=0;k<testnumber;k=k+1){
                System.out.print(num[k]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}