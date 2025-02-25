import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<Scorpio> list = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        list.add(car1);
        list.add(car2);

        for(Scorpio it : list) {
            it.driveCar();
        }

//        ScorpioFactory factory = new ScorpioFactory();
//        Scorpio obj = factory.createScorpio('N');
//        obj.driveCar();

//        ScorpioClassic car1 = new ScorpioClassic();
//        car1.driveCar();
//
//        ScorpioN car2 = new ScorpioN();
//        car2.driveCar();

    }
}