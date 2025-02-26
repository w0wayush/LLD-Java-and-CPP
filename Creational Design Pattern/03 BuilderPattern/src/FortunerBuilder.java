import Models.ICar;
import Models.Fortuner;

public class FortunerBuilder implements ICarBuilder{

    Fortuner s1;
    @Override
    public void buildEngine() {
        System.out.println("Fortuner Engine getting inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner Tyre getting inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner Chassis getting inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner Body getting inserted");
    }

    @Override
    public ICar build() {
        return s1;
    }
}
