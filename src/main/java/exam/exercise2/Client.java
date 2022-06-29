package exam.exercise2;

public class Client {

    public static void main (String [] args){
        CuadratrackGasolina cuadratrackGasolina = new CuadratrackGasolina();
        CuadratrackDiesel cuadratrackDiesel = new CuadratrackDiesel();
        CuadratrackGasolinaEspecial cuadratrackGasolinaEspecial = new CuadratrackGasolinaEspecial();

        AdapterCuadratrackElectrico cuadratrackElectrico = new AdapterCuadratrackElectrico(new CuadratrackEletrico());

        System.out.println("----------------Cuadratrack Gasolina----------------");
        int gasolinaActual =cuadratrackGasolina.estadoCombustible();
        System.out.println("Gasolina actual: " + gasolinaActual);
        cuadratrackGasolina.llenarCombustible(45);

        System.out.println("----------------Cuadratrack Diesel----------------");
        int dieselActual = cuadratrackDiesel.estadoCombustible();
        System.out.println("Diesel actual: " + dieselActual);
        cuadratrackDiesel.llenarCombustible(36);

        System.out.println("----------------Cuadratrack Gasolina Especial----------------");
        int gasolinaEspecialActual = cuadratrackGasolinaEspecial.estadoCombustible();
        System.out.println("Gasolina especial actual: " + gasolinaEspecialActual);
        cuadratrackGasolinaEspecial.llenarCombustible(13);

        System.out.println("----------------Cuadratrack Electrico----------------");
        int cargaActual = cuadratrackElectrico.estadoCombustible();
        System.out.println("Carga actual: " + cargaActual);
        cuadratrackElectrico.llenarCombustible(30); //se vuelve 6
    }

}
