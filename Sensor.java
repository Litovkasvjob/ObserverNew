package Observation.ObserverNew;

import java.util.Observable;

/**
 * Created by SergLion on 31.03.2016.
 */
public class Sensor extends Observable {
    private float temperature;

    public Sensor() {
    }

    public float getTemperature() {
        return temperature;
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        if (Math.abs(this.temperature - temperature) >= 1) {
            this.temperature = temperature;
            measurementChanged();
        }
    }


}
