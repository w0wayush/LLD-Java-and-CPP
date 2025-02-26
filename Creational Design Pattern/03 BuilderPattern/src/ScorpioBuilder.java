import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder{

    Scorpio s1;
    @Override
    public void buildEngine() {
        //s1.engine = new ScorpioEngine();
        System.out.println("Scorpio Engine getting inserted");
    }

    @Override
    public void buildTyre() {
        //s1.tyre = new SCorpioTyre();
        System.out.println("Scorpio Tyre getting inserted");
    }

    @Override
    public void buildChassis() {
        //s1.Chassis = new SCorpioChassis();
        System.out.println("Scorpio Chassis getting inserted");
    }

    @Override
    public void buildBodyShell() {
        //s1.body = new SCorpioBodyShell();
        System.out.println("Scorpio Body getting inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio tyaar h, le jao");
        return s1;
    }
}
