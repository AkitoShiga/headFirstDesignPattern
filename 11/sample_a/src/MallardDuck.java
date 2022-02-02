public class MallardDuck implements Quackable {
    Observer observable;
    public MallardDuck() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("ガーガー");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObservers();
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
