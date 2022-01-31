public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMacine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("もう一度25セントを投入することは出来ません");
    }

    public void ejectQuarter() {
        System.out.println("25セントを返却しました");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("クランクを回しました");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("販売するガムボールはありません");
    }
}
