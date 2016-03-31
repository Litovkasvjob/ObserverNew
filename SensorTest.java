package Observation.ObserverNew;

/**
 * Created by SergLion on 01.04.2016.
 */
public class SensorTest {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        Panel panel1 = new Panel(sensor);
        Panel panel2 = new Panel(sensor);
        Panel panel3 = new Panel(sensor);

        sensor.setTemperature(20);
        sensor.setTemperature(21.5f);
        sensor.setTemperature(22);
        sensor.setTemperature(25);
        sensor.setTemperature(30);
        sensor.setTemperature(15);
        sensor.setTemperature(15.5f);
    }
}
