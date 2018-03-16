import TestDoubles.MockGreenhouseController;
import org.junit.Assert;
import org.junit.Test;

public class HeatingInteractorTests {

    @Test
    public void turnHeaterOn() {
        MockGreenhouseController mockGreenhouseController = new MockGreenhouseController();

        HeaterInteractor interactor = new HeaterInteractor(mockGreenhouseController);
        interactor.on();

        Assert.assertTrue(mockGreenhouseController.isHeaterOn());
    }

}
