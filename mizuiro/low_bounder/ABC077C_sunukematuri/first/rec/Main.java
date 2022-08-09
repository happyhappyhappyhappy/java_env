import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int peace = sc.nextInt();
        int[] A=new int[peace];
        int[] B=new int[peace];
        int[] C=new int[peace];
        for(int j=0;j<peace;j=j+1){
            A[j] = sc.nextInt();
        }
        for(int j=0;j<peace;j=j+1){
            B[j] = sc.nextInt();
        }
        for(int j=0;j<peace;j=j+1){
            C[j] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long answer=0L;
        for(int j=0;j<B.length;j++){
            long lowbound=0L;
// lower_bounderの元になるロジック
            int right = B.length;
            int left = -1;
            while(right-left>1){
                int mid=(right+left)/2;
                if(B[j]<=A[mid]){ // 目標より中間値が高いもしくは等しい→rightを左に寄せる
                    right=mid;
                }
                else{ // A[mid] < B[j] → 目標未満の場合(含んでもダメ)→leftを右に寄せる
                    left=mid;
                }
            }
            lowbound=(long)right;
            // upper_boundの立式
            long upperbound=0L;
            right = B.length;
            left = -1;
            while(right-left>1){
                int mid=(right+left)/2;
                if(B[j]<C[mid]){ // 目標より中間値が高い場合(等しくもない)→右側を左に寄せる
                    right=mid;
                }
                else{ // C[mid] <= B[j] →目標以下の場合(含んでも良い)→左側を右側に移動
                    left=mid;
                }
            }
            upperbound=(long)(peace-right);
            answer = answer + upperbound*lowbound;
        }
        System.out.println(answer);
    }
}