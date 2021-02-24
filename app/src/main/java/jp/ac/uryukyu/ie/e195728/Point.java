package jp.ac.uryukyu.ie.e195728;

/**
 * 得点クラス
 * floor(床)に着いた時に、2点入るようにする.xには点を入れられた回数を代入する。
 * opponent(敵)の得点とmyself(自分)の得点を計算するクラス
 * opponent;//敵
 * myself;//自分
 */
public class Point {
/**
 * 敵の得点を計算するメソッド
 * @retrun 2*x
 */
    public int opponent(int x){
        return 2*x;
    }
/**
 * 自分の得点を計算するメソッド
 * @return 2*x
 */
    public int myself(int x){
        return 2*x;
    }
}