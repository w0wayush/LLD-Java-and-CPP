import Models.DefenderEngine;
import Models.IEngine;
import java.util.Calendar;

public class DefenderFactory implements IVehicleFactory{

    public IEngine createEngine() {
        System.out.println("Defender ka Engine bana rha hu");
        return new DefenderEngine();
    }
}
