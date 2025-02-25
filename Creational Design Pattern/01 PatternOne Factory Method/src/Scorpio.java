import Model.IBodyShell;
import Model.IEngine;
import Model.ScorpioBodyShell;
import Model.ScorpioEngine;

public class Scorpio {

    IEngine engine;
    IBodyShell body;

    public void makeScorpio() {
        System.out.println("Scorpio Class mei hu");
        this.engine = new ScorpioEngine();
        this.body = new ScorpioBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving Scorpio");
    }
}
