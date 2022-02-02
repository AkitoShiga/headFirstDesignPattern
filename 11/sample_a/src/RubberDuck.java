import java.util.Observable;

public class RubberDuck implements Quackable {
    Observable observable;
    public Rubberduck(Observable observable) {
        this.observable = observable;
    }
    public void quack() {
        System.out.println("キューキュー");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObservers();
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
