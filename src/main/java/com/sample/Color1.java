package com.sample;

/**
 * 色取得ためのクラス<br>
 *
 *
 * @author テスト君
 */
public class Color1 {

   /**
    * 色取得ためのクラス。
    *
    *
    * @param i 選択
	* @return 結果
    */
    String getColor(int i) {
        if (i == 1) {
            return "赤";
        } else if (i == 2) {
            return "青";
        } else {
            return "1or2を入力して下さい";
        }
    }
}
