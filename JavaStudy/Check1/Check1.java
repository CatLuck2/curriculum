/**
 * バブルソート：大小関係で行われる整列アルゴリズム
 * チェックテスト-Java1章
 * 
 *「説明2」
 * 右端から左端にかけて、隣り合う要素の大小関係を比較。
 * 小<->大（昇順）なら、値A>値Bで入れ替え
 * 大<->小（降順）なら、値A<値Bで入れ替え
 * 
 * ループiが終了したら、i番目の値は最小（もしくは最大）値となる。
 * （最初のループで終端（今回は左端）には、最小（もしくは最大）値が置かれる）
 * なので、次のループからはi番目の値を除外して、隣り合う値を比較。
 * iは比較時の始点、
 * 
 */
public class Check1{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = { 3, 1, 2, 7, 5 };
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[j-1] > data[j]){
                  int box = data[j];
                  data[j] = data[j-1];
                  data[j-1] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}