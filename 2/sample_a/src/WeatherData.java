import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/*
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;// observerを管理する
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    // 気象観測所からデータを取得
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity    = humidity;
        this.pressure    = pressure;
        measurementsChanged();
    }

}
*/
public class WeatherData extends Observable {
    //private ArrayList<Observer> observers;// observerを管理する
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //observers = new ArrayList();
    }
    /*
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    */

    public void measurementsChanged() {
        //notifyObserver();
        setChanged(); // 更新の通知
        notifyObservers(); // 監視者に通知。pullするのでプロパティを渡さない
    }

    // 気象観測所からデータを取得
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity    = humidity;
        this.pressure    = pressure;
        measurementsChanged();
    }
    // ゲッターを実装して監視者に取りに来てもらう
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
