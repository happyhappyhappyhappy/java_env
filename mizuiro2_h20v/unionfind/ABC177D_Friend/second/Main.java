import java.util.*;

public class Main{
    public static class UnionFind{
        int[] parent;
        int[] rank;
        public UnionFind(int n){
            this.parent = new int[n];
            this.rank = new int[n];
            for(int j=0;j<n;j=j+1){
                parent[j]=j;
                rank[j]=j;
            }
        }
        public int find(int x){
            if(x == parent[x]){
                return x;
            }
            else{
                int xroot = find(parent[x]);
                parent[x] = xroot;
                return xroot;
            }
        }
        public boolean same(int x,int y){
            boolean q = (find(x)==find(y));
            return q;
        }
        public void union(int x,int y){
            int xRoot = find(x);
            int yRoot = find(y);
            if(xRoot == yRoot){
                return;
            }
            if(rank[yRoot] < rank[xRoot]){
                parent[yRoot]=xRoot;
            }
            else if(rank[xRoot]<rank[yRoot]){
                parent[xRoot]=yRoot;
            }
            else{
                parent[xRoot]=yRoot;
                rank[xRoot]=rank[xRoot]+1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] col = new int[N];
        UnionFind uf = new UnionFind(N);
        for(int j=0;j<M;j=j+1){
            int f = sc.nextInt()-1;
            int t = sc.nextInt()-1;
            uf.union(f,t);
        }
        for(int j=0;j<N;j=j+1){
            int x=uf.find(j);
            col[x]=col[x]+1;
        //    System.err.printf("%d の 親は %d\n",j,x);
        }
        int ans = 0;
        for(int j=0;j<N;j=j+1){
            if(ans < col[j]){
                ans = col[j];
            }
        }
        System.out.printf("%d\n",ans);
    }
}
