package exam.exercise2;

public class Client {

    public static void main (String [] args){
        CuadratrackGasolina cuadratrackGasolina = new CuadratrackGasolina();
        CuadratrackDiesel cuadratrackDiesel = new CuadratrackDiesel();
        CuadratrackGasolinaEspecial cuadratrackGasolinaEspecial = new CuadratrackGasolinaEspecial();

        AdapterCuadratrackElectrico cuadratrackElectrico = new AdapterCuadratrackElectrico(new CuadratrackEletrico());

        int gasolinaActual =cuadratrackGasolina.estadoCombustible();
        System.out.println(gasolinaActual);
        cuadratrackGasolina.llenarCombustible(20);

        int cargaActual = cuadratrackElectrico.estadoCombustible();
        System.out.println(cargaActual);
        cuadratrackElectrico.llenarCombustible(50);
    }

}
