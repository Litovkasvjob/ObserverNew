package Observation.ObserverNew;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SergLion on 31.03.2016.
 */
public class Panel implements Observer {

    Observable observable;
    private float temperature;

    public Panel(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Sensor) {
            Sensor sensor = (Sensor) o;
            this.temperature = sensor.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("Current temperature: " + temperature);
    }
}
