public class GumballMachine {
    final static int SOLD_OUT    = 0;
    final static int NO_QUARTER  = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD        = 3;

    int state = SOLD_OUT;
    int count = 0;

    // count（在庫）が1以上なら状態を投入待ちにする
    public GumballMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("もう一度25セントを投入することは出来ません");
        } else if(state == NO_QUARTER) {
            state = HAS_QUARTER;// NO_QUARTERの時のみ状態が変更になる
            System.out.println("25セントを投入しました");
        } else if(state == SOLD_OUT) {
            System.out.println("このマシンは売り切れです");
        } else if(state == SOLD) {
            System.out.println("お待ち下さい。すでにガムボールを出しています");
        }
    }

    public void ejectQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("25セントを返却しました");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER) {
            System.out.println("クランクを回しましたが25千とを投入していません");
        } else if(state == SOLD) {
            System.out.println("クランクを回しましたが、ガムボールあがありません");
        } else if(state == SOLD_OUT) {
            System.out.println("返金できません。まだ25セントを投入していません");
        }
    }

    public void turnCrank() {
        if(state == SOLD) {
            System.out.println("2回回してもガムボールをもう１つ手に入れることはできません");
        } else if(state == NO_QUARTER) {
            System.out.println("クランクを回しましたが、25セントを投入していません");
        } else if(state == SOLD_OUT) {
            System.out.println("クランクを回しましたが、ガムボールがありません");
        } else if(state == HAS_QUARTER) {
            System.out.println("クランクを回しました");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        // 販売
        if(state == SOLD) {
            System.out.println("ガムボールがスロットから転がり出てきます");
            count--;
            // 在庫を確認する
            if(count == 0) {
                System.out.println("おっと、ガムボールがなくなりました！");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        // 販売出来ない
        } else if(state == NO_QUARTER) {
            System.out.println("まず支払いをする必要があります");
        } else if(state == SOLD_OUT) {
            System.out.println("販売するガムボールはありません"); // 例外
        } else if(state == HAS_QUARTER) {
            System.out.println("販売するガムボールはありません"); // 例外
        }
    }

    public String toString() {
        String str =  "Java対応据付型ガムボール モデル#2004\n"
             + "在庫：" + count + "個のガムボール\n";
        str += count > 0 ? "マシンは25セントが投入されるのを待っています\n" :
                "このマシンは売り切れです";
        return str;
    }
}
