public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMacine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("このマシンは売り切れです");
    }

    public void ejectQuarter() {
        System.out.println("返金できません。まだ25セントを投入していません");
    }

    public void turnCrank() {
        System.out.println("クランクを回しましたが、ガムボールがありません");
    }

    public void dispense() {
        System.out.println("おっと、ガムボールがなくなりました！");
    }
}
