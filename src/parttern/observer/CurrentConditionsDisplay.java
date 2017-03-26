package parttern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前气象状况布告
 * 项目名称:  [${project_name}]
 * 包:        [${package_name}]
 * 类名称:    [${type_name}]
 * 类描述:    [一句话描述该类的功能]
 * 创建人:    [${user}]
 * 创建时间:  [${date} ${time}]
 * 修改人:    [${user}]
 * 修改时间:  [${date} ${time}]
 * 修改备注:  [说明本次修改内容]
 * 版本:      [v1.0]
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;

    private float humidity;

    private float pressure;

    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("------Current Condition-------");
        System.out.println("temperature: " + this.temperature);
        System.out.println("humidity: " + this.humidity);
        System.out.println("pressure: " + this.pressure);
        System.out.println("------------End---------------");
    }
}
