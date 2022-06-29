package exam.exercise2;

public class CuadratrackGasolinaEspecial implements Cuadratrack {

    private int gasolinaEspecialActual;

    public CuadratrackGasolinaEspecial(){
        this.gasolinaEspecialActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolinaEspecial) {
        if(cantidadGasolinaEspecial >= 0 && cantidadGasolinaEspecial <= 50){
            this.gasolinaEspecialActual = cantidadGasolinaEspecial;
            System.out.println("Monto de gasolina especial actual: " + cantidadGasolinaEspecial);
        }else{
            System.out.println("Rango de diesel " + cantidadGasolinaEspecial + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*50);
        return cantidadRandom;
    }
}
