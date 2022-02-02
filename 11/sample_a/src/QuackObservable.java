import java.util.*;
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
