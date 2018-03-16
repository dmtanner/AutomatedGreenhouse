package TestDoubles;

import Greenhouse.IGreenhouseController;


public class MockGreenhouseController implements IGreenhouseController {
    private boolean heaterState;

    public int getTemp() {
        return 0;
    }

    public int getHumidity() {
        return 0;
    }

    public int getSoilMoisture() {
        return 0;
    }

    public int getLightIntensity() {
        return 0;
    }

    public void fan(boolean onOff) {

    }

    public void heater(boolean onOff) {
        heaterState = onOff;
    }

    public void lights(int percentIntensity) {

    }

    public void door(boolean openClose) {

    }

    public void water(boolean onOff) {

    }

    public boolean isHeaterOn() {
        return heaterState;
    }
}
