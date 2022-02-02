import java.util.*;
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    Quackable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }
    public void registerObserver(Observer observer) {
        obsrevers.add(observser);
    }
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(itrator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            obsrever.update(duck);
        }
    }
}
