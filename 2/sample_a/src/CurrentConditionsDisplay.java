public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;// 相互に保持しているのがへえーてかんじ

    // Newしたときに登録するのがへえーってかんじ
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // セッターと画面表示の更新を同時にやっちゃう
    public void update(float temperture, float humidity, float pressure) {
        // パラメータ一個つかってない。使わないのは自由だもんな
        this.temperature = temperture;
        this.humidity    = humidity;
        display();
    }
    public void display() {
        System.out.println(
            "現在の気象状況\n"
            + "温度：" + temperature + "\n"
            + "湿度：" + humidity    + "\n"
        );
    }

}
/**
 * なぜSubjectへの参照を保持するのか？
 * Observerから解除をしたくなるんやろうなあ
 */
