/**
 * ジョーは鴨池シミュレーションゲームSimUDuckのエンジニア
 */

// すべての鴨のスーパークラス
abstract class Duck {
    abstract display();
    void quack(){};
    void swim();
}

class MalloardDuck extends Duck {
    void display() {
        // マガモの表示
    }
}

class RedheadHuck extends Duck {
    void display() {
        // アメリカホシハジロの表示
    }
}


/**
 * 競合他社との競争が激しくなってきた
 * 来週の株主総会の話題として空飛ぶ鴨を実装することになった
 */

// すべての鴨のスーパークラス
abstract class Duck {
    abstract display();
    void quack(){};
    void swim();
    void fly(); // 空を飛ぶメソッドを実装！！
}

/* 問題発生
 * この空を飛ぶメソッドを実装したことによって、
 * 本来飛ぶべきではないゴム製の鴨が株主総会のスクリーンで
 * 飛び回ってしまうことになった。
 *
 */

// おもちゃの鴨。おもちゃの鴨が飛ぶわけないよなあ？
class RubberDuck extends Duck {
    void quack (){
        // おもちゃの鴨はガーガー鳴かないので
        // キューキュー鳴くようにオーバーライド
    }
    void display() {}
}

class RubberDuck extends Duck {
    void quack (){
        // おもちゃの鴨はガーガー鳴かないので
        // キューキュー鳴くようにオーバーライド
    }
    void display() {}
    void fly() {
        // 何もしない処理をオーバーライドすることで
        // 飛ばないようにできるけど、めんどくさいよなあ?
    }
}

// 新しい木製の鴨を追加した場合
class DecoyDuck extends Duck {
    void quack() {
        // 鳴かない処理
    }
    void display() {}
    void fly() {
        // 何もしない処理をオーバーライド
    }
}
// ...めんどくせえよなあ？？？

/* ~自分で考えてみよう~
 * 継承のデメリット
 * D すべての鴨の振る舞いを把握することが困難である
 * F 変更によって無意識に他の鴨に影響を与える可能性がる
 */

/**
 * 今後も鴨は6ヶ月ごとに仕様変更を行う
 * 鴨の一部だけが飛んだり鳴いたりさせるにはどうすれば良い？
 *
 * FlyableとQuackableインターフェースを実装する？
 * → 鴨がたくさんいたら、ちょっとした変更で全部の修正をしないといけないよね
 */

/* ~自分で考えてみよう~
 * どんなときに仕様変更が起こる？
 * 1. 自分の想定していた仕様が間違いだったとき
 * 2. 消費税など、アプリケーション外部の仕様が変更になったとき
 * 3. 新規サービスの追加
 */

/**
 * 設計原則
 * アプリケーションの変化する部分を特定して、不変部分と分離する
 * 変化する部分を不変部分からカプセル化する
 * 変化する部分は分離してカプセル化 -> 独立して変更出来るようにするため
 *
 * 今の変化する部分flyとquack
 * fly は 飛ぶ、飛ばない
 * quackはガーガー、キューキュー、鳴かないの3通りある
 * -> クラス作って実装しちゃおうよ
 *
 * 柔軟性を保つには、鴨の振る舞いを動的に保つ
 * 鴨の振る舞いを動的に保つには、振る舞いの設定メソッドを鴨クラスに持たせる
 * 鴨は振る舞いを実行時に変更出来るようにする
 *
 * 設計原則
 * 実装ではなくインターフェースに対してプログラミングする
 * インターフェースを使用するが、実装するのはDuckではなく振る舞いクラス
 * FlyBehavior
 * QuackBehavior
 *
 * Duck は振る舞いクラスが実装したインターフェースをを使用する
 * Duckはインターフェースの実装を意識しない
 * 特定の実装に依存しない
 */

// 飛ぶ振る舞い
interface FlyBehavior {
    fry();
}
class FlyWithWings implements FlyBehavior {
    fly() {
        // 飛びます
    }
}
class FlyNoWay implements FlyBehavior {
    fly() {
        // 飛ばない
    }
}

// 鳴く振る舞い
interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {
    void quack() {
        // ガーガー
    }
}

class Squack implements QuackBehavior {
    void quack() {
        // キューキュー
    }
}

class MuteQuack implements QuackBehavior {
    void quack() {
        // 沈黙
    }
}

/**
 * ~自分で考えてみよう~
 * 新しい設計でロケットで動く振る舞いを追加するようにするには？
 * FlyBehaviorを実装したFlyRocketを作成。実装でロケットを使用する
 * なく振る舞いを使用したい、鴨ではないクラスを想像することは出来るか？
 * できます
 * */

// スーパークラスの定義
abstract class Duck {
    /* プロパティ */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /* メソッド */
    abstract void display();
    void swim() {}
    void performQuack() {
        // 処理を移譲する
        quackBehavior.quack();
    }
    void performFly() {
        // 処理を移譲する
        flyBehavior.fly();
    }
}

// 継承クラスの定義
// どこで振る舞いを設定するのか気になるよなあ？
class MallarDuck extends Duck() {
    MallarDuck() {
        // コンストラクタで設定するんだよなあ
        quackBehavior = new Quack();
        flyBehavior   = new FlyWithWings();
    }
    void display() {}

}
