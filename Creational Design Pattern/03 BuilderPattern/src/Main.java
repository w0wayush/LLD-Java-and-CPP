import Models.ICar;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);
        //guidance dedo
        director.construct(false, false, false);

        ICar car = builder.build();

    }
}