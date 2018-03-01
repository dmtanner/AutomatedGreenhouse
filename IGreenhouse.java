public interface IGreenhouse {
    int getTemp();
    int getHumidity();
    int getSoilMoisture();
    int getLightIntensity();

    void fan(boolean onOff);
    void heater(boolean onOff);
    void lights(int percentIntensity);
    void door(boolean openClose);
    void water(boolean onOff);
}
