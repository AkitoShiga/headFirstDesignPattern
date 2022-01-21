public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);

        // StaticsDisplay statisticsDisplay = new StaticsDisplay(weatherData);
        // ForecatsDisplay forecastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurements(27, 65, 30.4f);
        weatherData.setMeasurements(28, 70, 29.2f);
        weatherData.setMeasurements(26, 90, 39.2f);
    }
}
