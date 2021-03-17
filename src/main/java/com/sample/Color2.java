package com.sample;

/**
 * 色を取得する<br>
 *
 *
 * @author テスト君
 */
public class Color2 {
   
   /**
    * 色取得ためのクラス。
    *
    *
    * @param i 選択
	* @return 結果
    */
	String getColor(int i) {
        if (i == 3) {
            return "赤";
        } else if (i == 4) {
            return "青";
        } else {
            return "3or4を入力して下さい";
        }
    }
}
