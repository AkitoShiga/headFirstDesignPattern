public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMacine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("お待ち下さい。すでにガムボールを出しています");
    }

    public void ejectQuarter() {
        System.out.println("申し訳ありません。すでにクランクを回しています");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("2回回してもガムボールをもう一つ手に入れることは出来ません");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else{
            System.out.println("おっと、ガムボールがなくなりました！");
            gumballMachine.setState(gumballMachine.getSoldeOutState());
        }
    }
}
