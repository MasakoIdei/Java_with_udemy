/*
エントリーポイントとは…？
 public static void main(String[] args) の部分。
プログラムの実行をした時に一番最初に呼ばれるメゾット。
メゾット→違うメゾットの呼び出しを繰り返していく流れで実行される。
この時の一番最初のメゾットをエントリーポイント（開始点）と呼ぶらしい。
Javaだと、mainメゾット。
※プログラム全体のエントリーポイントになる場所のルーチン（処理、手順）を
メインルーチン
メインルーチンから呼び出されて実行されるルーチンは、サブルーチンというらしい
参考資料：https://qiita.com/mojirico/items/b1c6f1816d4027254ea5
　　　　：https://www.bold.ne.jp/engineer-club/java-main#8221public_static_void_mainString8221

【public static void main(String[] args) について】
　・publicとは？？？
　アクセス修飾子。クラス・メンバフィールド・メソッドの他クラスへの公開範囲を決める修飾子
　public以外にも、protected、privateなど幾つか種類がある
・staticとは？？？
　Java用の静的メゾット。
　https://works.forward-soft.co.jp/blog/detail/10150
・Voidとは？？？
　voidとは「何もない」という意味。戻り値がないメソッド。
　戻り値のみに指定できる特別な型。
　メソッド内で必要な処理　→　終わったら戻り値を返さずにメゾットを抜ける。
　 そのため、 return を使用するコンパイルエラーが発生する。

現時点だとよく分からないけれど、やっていく内に実感する系の物らしい
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,Tim");

        //変数を利用しての計算
        int myFristNumber = (5 + 10) + (2 * 10); //「；」をつけることでこの文（式）はここまでですと宣言している。
        int mySecondNumber = 12;
        int myThirdNumber = myFristNumber * 2;
        int myTotal = myFristNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        //プチ課題
        //myLastOneという変数に1000からmytotalの値を代入し、出力しよう。
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);


    }
}
/*
変数…データを入れるための箱のような物。情報を保存する方法。
　　実際の処理の時プログラムは、RAMやアクセスメモリに一次的に保存されて実行されているらしい。
　※ランダムアクセスメモリ、RAM…メインメモリ、メモリと呼ばれる記憶装置。PCの電源がONの間だけ一時的に保存される（揮発性）
　
 */