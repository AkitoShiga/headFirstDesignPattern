public class DuckSimulator {
    public static void main(String[] args) throws Exception {
        DuckSimulator simulator         = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }
    public void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall    = duckFactory.createDuckCall();
        Quackable rubberDuck  = duckFactory.createRubberDuck();
        Quackable gooseDuck   = new GooseAdaptor(new Goose());

        System.out.println("\n鴨シミュレーター");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\n鴨シミュレーター");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserber(quackologist);

        System.out.println(
                  "鴨がないた回数："
                + QuackCounter.getQuacks()
                + "回"
        );

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
