package exam.exercise1;

public class LaPaz extends Departamento {
    private static LaPaz instance;

    private LaPaz() {
        super("La Paz", 20, 3023800, getClimaRandom(), 243);
    }

    public static LaPaz getInstance(){
        if(instance==null) instance = new LaPaz();
        return instance;
    }

    @Override
    public void realizarGasto(IVisitor visitor) {
        visitor.realizarGasto(this);
    }
}
