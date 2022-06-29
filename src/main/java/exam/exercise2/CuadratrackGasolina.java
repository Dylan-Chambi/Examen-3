package exam.exercise2;

public class CuadratrackGasolina implements Cuadratrack {

    private int gasolinaActual;

    public CuadratrackGasolina(){
        this.gasolinaActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolina) {
        if(cantidadGasolina >= 0 && cantidadGasolina <= 50){
            this.gasolinaActual = cantidadGasolina;
            System.out.println("Monto de gasolina actual: " + cantidadGasolina);
        }else{
            System.out.println("Rango de gasolina " + cantidadGasolina + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*50);
        return cantidadRandom;
    }
}
