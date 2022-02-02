public class DuckFactory extends AbstractDuckFactory {

    /**
     * シミュレーターはQuackableオブジェクト
     * を取得することだけを知っている
     */
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
