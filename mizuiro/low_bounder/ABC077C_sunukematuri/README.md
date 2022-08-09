# \[ARC084A(ABC077C)\]\<Snuke Festival\>

## [問題のURL](https://atcoder.jp/contests/abc077/tasks/arc084_a)

## [解説のURL(公式)](https://blog.hamayanhamayan.com/entry/2017/11/06/020314)


## [参考](https://drken1215.hatenablog.com/entry/2021/02/25/223800)

## [この問題の結果](https://atcoder.jp/contests/abc077/submissions?f.Task=arc084_a&f.LanguageName=C%2B%2B&f.Status=AC&f.User=)

<!---- 「問題の結果の見方」
 PROBLEMS→問題番号一覧→回答者数→accepted＋言語をセレクトする 
 ---->

-----
ヒント

* lower_boundとupper_boundを使う

## [作成結果](https://atcoder.jp/contests/abc077/submissions/32672861)

少々後悔あり、upper_boundはlower_boundと逆かと思って作って見たが、上手くいかなかった。他の言語に使いたかったのだが。

[cf](https://akhtikd.com/posts/2019-12-11/)
ok,ngよりやはりleft,right がしっくりくる.

現在、C++と同じ箇所で引っかかっている。しかしそこを見直してもどうも上手くいかない。

```text
7c7
<     ll left,right;
---
>     int left,right;
11c11
<         ll mid;
---
>         int mid;
24c24
<     ll left,right;
---
>     int left,right;
28c28
<         ll mid;
---
>         int mid;
40c40
< ll solver(ll N,vector<ll> &U,vector<ll> &M,vector<ll> &B){
---
> ll solver(int N,vector<ll> &U,vector<ll> &M,vector<ll> &B){
46,49c46,49
<     for(ll j=0;j<N;j++){
<         ll u_able;
<         ll b_able;
<         ll b_result;
---
>     for(int j=0;j<M.size();j++){
>         int u_able;
>         int b_able;
>         int b_result;
52c52
<         b_able=B.size()-b_result;
---
>         b_able=B.size()-upper_bound2(B,M[j]);
66c66
<     ll N;
---
>     int N;
```

***

他の方のソースでめぐる式に近い物をセレクトしてみた。それを変数を自分の物に取り替えて作成→成功

[1回目成功](https://atcoder.jp/contests/abc077/submissions/33894166)

今まで6回失敗していたのでうれしい。