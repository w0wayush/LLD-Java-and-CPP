import Model.ScorpioClassicEngine;
import Model.ScorpioClasssicBodyShell;

public class ScorpioClassic extends Scorpio {

    @Override
    public void makeScorpio() {
        System.out.println("ScorpioClassic Class mei hu");
        this.engine = new ScorpioClassicEngine();
        this.body = new ScorpioClasssicBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving ScorpioClassic");
    }
}
