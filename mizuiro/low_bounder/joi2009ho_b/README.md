# \[情報オリンピック2009B\]\<ピザJava版\>

[C++からの移植](https://github.com/happyhappyhappyhappy/sakura-cpp/tree/master/comp_pro/atcoder/joi2009ho_b)

## [問題のURL](https://atcoder.jp/contests/joi2009ho/tasks/joi2009ho_b)

## [解説のURL](https://drken1215.hatenablog.com/entry/2020/12/22/011600)

## [この問題の結果](https://atcoder.jp/contests/joi2009ho/submissions)

<!---- 「問題の結果の見方」
 PROBLEMS→問題番号一覧→回答者数→accepted＋言語をセレクトする 
 ---->

----
ヒント

どうもJavaの二分探索メソッド(ArrayList.binarySearch)は同じ数が並ぶ場合異なる値を返すことがある。厳密にやりたければやはりめぐる式を使うのが得策。

----

[1回目失敗](https://atcoder.jp/contests/joi2009ho/submissions/33532632)

set3だけどうも実行時エラーが発生する。境界値はチェックしている筈だが。
というわけで**一旦ペンディング**しよう。他人のソースを見れば分かるかもしれない。

[1回目成功(2022/07/28)](https://atcoder.jp/contests/joi2009ho/submissions/33565587)→ただしこれは中間値比較としては少し納得いかない

[low_bounder式として不等号を扱う箇所の完成形](https://atcoder.jp/contests/joi2009ho/submissions/33764991)→これが正しい想定

理由は下に記述あり。

---
## /[理由/]

本文に
> 宅配先の位置は ***0*** 以上 d−1 以下の整数 k で表される．
とある。
ということは0も入れて良かったことが分かる。それは-1の配列見ようとして失敗する。

[情報](https://www.ioi-jp.org/joi/2008/2009-ho-prob_and_sol/index.html)の問2のテストケース[例3](./first/veryfy3/testcase.txt)を参照。



| 回数 | 達成日 |
| --- | ----- |
| 1回目 |  |
| 2回目 |  |
| 3回目 |  |
