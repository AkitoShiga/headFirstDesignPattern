public class CountingDuckFactory extends AbstractDuckFactory {

    /**
     * シミュレーターはQuackableオブジェクト
     * を取得することだけを知っている
     */
    public Quackable createMallardDuck() {
        return new QuackCounter( new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter( new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter( new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter( new RubberDuck());
    }

}
