import Greenhouse.IGreenhouseController;

public class HeaterInteractor {

    private IGreenhouseController greenhouseController;

    public HeaterInteractor(IGreenhouseController greenhouseController) {
        this.greenhouseController = greenhouseController;
    }

    public void on() {
        greenhouseController.heater(true);
    }
}
