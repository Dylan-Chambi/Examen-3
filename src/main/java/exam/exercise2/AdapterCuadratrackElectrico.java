package exam.exercise2;

public class AdapterCuadratrackElectrico implements Cuadratrack {
    private CuadratrackEletrico cuadratrackEletrico;

    public AdapterCuadratrackElectrico(CuadratrackEletrico cuadratrackEletrico){
        this.cuadratrackEletrico = cuadratrackEletrico;
    }

    @Override
    public void llenarCombustible(int cantidadCombustible) {
        cuadratrackEletrico.cargar((int) (cantidadCombustible/5));
    }

    @Override
    public int estadoCombustible() {
        return cuadratrackEletrico.estadoDeEletricidad();
    }
}
