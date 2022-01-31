public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    };

    public void insertQuarter() {
            System.out.println("25セントを投入しました");
    };

    public void ejectQuarter() {
            System.out.println("クランクを回しましたが25千とを投入していません");
    };

    public void turnCrank() {
            System.out.println("クランクを回しましたが、25セントを投入していません");
    };

    public void dispense() {
            System.out.println("まず支払いをする必要があります");
    };

}
