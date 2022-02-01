import java.math.*;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
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
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMacnine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("販売するガムボールはありません");
    }
}
