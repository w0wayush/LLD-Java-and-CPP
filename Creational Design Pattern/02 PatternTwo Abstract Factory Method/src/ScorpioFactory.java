import Models.IEngine;
import Models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory{

    public IEngine createEngine() {
        System.out.println("Scorpio ka engine bana raha hu");
        return new ScorpioEngine();
    }
}
