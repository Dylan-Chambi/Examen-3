package exam.exercise1;

public class Cochabamba extends Departamento {
    private static Cochabamba instance;

    private Cochabamba() {
        super("Cochabamba", 16, 2086900, getClimaRandom(), 221);
    }

    public static Cochabamba getInstance(){
        if(instance==null) instance = new Cochabamba();
        return instance;
    }
    @Override
    public void realizarGasto(IVisitor visitor) {
        visitor.realizarGasto(this);
    }

}
