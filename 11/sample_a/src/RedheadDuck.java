import java.util.Observable;

public class RedheadDuck implements Quackable {
    Observable observerble;
    public RedheadDuck(Observable observerble) {
        this.observable = observable;
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
