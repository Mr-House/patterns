package parttern.observer;

import java.util.Observable;

/**
 * 气象数据
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
public class WeatherData extends Observable {
    private  float temperature;

    private float humidity;

    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

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
