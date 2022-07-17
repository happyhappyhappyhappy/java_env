# binarySearchを使って見る

[Arraysメソッドの説明](https://docs.oracle.com/javase/jp/8/docs/api/java/util/Arrays.html#binarySearch-int:A-int-)

## 実験結果

testcase.txtの一番下の行をいくつか替えてみると


| 与えた数 | 結果 | コメント              |
----------|-----|--------
| 18      | 1   | 確かに0-indexの1にある |
| 71 | 7 | 同上|
| 28 | -4 | 0未満になる |
| 100 | -16 | 同上 |

ということは0以上の値が返ってきたらあると計算する
| TH1 | TH2 |
----|---- 
| TD1 | TD3 |
| TD2 | TD4 |