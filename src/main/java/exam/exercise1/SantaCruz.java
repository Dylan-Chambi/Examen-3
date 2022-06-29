package exam.exercise1;

public class SantaCruz extends Departamento {
    private static SantaCruz instance;

    private SantaCruz() {
        super("Santa Cruz", 15, 3363400, getClimaRandom(), 258);
    }

    public static SantaCruz getInstance(){
        if(instance==null) instance = new SantaCruz();
        return instance;
    }
    @Override
    public void realizarGasto(IVisitor visitor) {
        visitor.realizarGasto(this);
    }

}
