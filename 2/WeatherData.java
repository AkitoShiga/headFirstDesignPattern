/**
 * Weather-O-Rama社の次世代インターネットベース気象観測所の契約を勝ち取った
 *
 * 概要
 * WeatherDataオブジェクトを基盤とする
 *   このオブジェクトは気温、湿度、気圧のデータを監視する
 *   このデータは気象観測所のデータを監視して、リアルタイムに更新される
 * このオブジェクトを元にアプリケーションを作成する
 *   現在の気象条件、気象統計データ、 簡単な予報を表示する
 *   拡張可能であり、独自の気象表示を追加できるAPIを具有する
 */

public class WeatherData {
    public void getTemperature() {}
    public void getHumidity() {}
    public void getPressure() {}

    /**
     * このメソッドは気象観測所が
     * 更新されるたびに呼び出されます
     */
    public void measurementsChanged() {
        // この中でget~を呼び出すのかな？
        // 更新した情報を元に統計、予報、気象条件の表示を更新する？
    }
}
/* 最初の間違ったSWAG */
public class WeatherData {

    public void measurementsChanged {
        // ローカル変数で良いのか？
        float tmp      = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // これは自分のプロパティ？
        currentConditionsDisplay.update(temp, humidity, pressure);// 気象条件画面
        statisticsDisplay.update(temp, humidity, pressure);       // 統計画面
        forecastDisplay.update(temp, humidity, pressure);         // 予報画面
    }
    /* 自分で考えてみよう
     * B、C
     */

}
