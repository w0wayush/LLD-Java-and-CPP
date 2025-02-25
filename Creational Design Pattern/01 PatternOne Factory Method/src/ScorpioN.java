import Model.ScorpioNBodyShell;
import Model.ScorpioNEngine;

public class ScorpioN extends Scorpio {

    @Override
    public void makeScorpio() {
        System.out.println("ScorpioN Class mei hu");
        this.engine = new ScorpioNEngine();
        this.body = new ScorpioNBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving ScorpioN");
    }
}
