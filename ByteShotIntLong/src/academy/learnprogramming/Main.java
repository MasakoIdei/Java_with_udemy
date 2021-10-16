/*
【補足】Javaのパッケージ
パッケージとはJavaのクラスをまとめて分類するための仕組み。
クラス数が大量にある場合、機能などで分類してまとめておくとクラスの管理がしやすいため
出来た仕組みらしい。あくまでも分類するのが目的のため、パッケージ同士に親子関係とかはないらしい。

通常、ドメイン名を逆に書いたものをパッケージ名として使うらしい。
例）test.comなら　→　package com.test;
新規プロジェクト作成、テンプレートから作成→　プロジェクト名＋パッケージ名の指定をして
新規で立ち上げると
-----------------------
package academy.learnprogramming;
public class Main {

    public static void main(String[] args) {

    }
}
---------------------
といった感じでパッケージ名とpsvmの部分が記載された状態で出てくる。
srcフォルダを確認すると「academy.learnprogramming」というフォルダの中に
Mainクラスが入っている状態になっている事も確認できる。
 */
package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000; //アンダーバーは、10,000の「,（カンマ）」代わり

        //int型で利用できる数値の範囲
        int myMinIntValue = Integer.MIN_VALUE; //int型の最小値を代入
        int myMaxIntValue = Integer.MAX_VALUE; //int型の最大値を代入
        System.out.println("Int型の最小値 =" + myMinIntValue );
        System.out.println("Int型の最大値 =" + myMaxIntValue);
    }
}
