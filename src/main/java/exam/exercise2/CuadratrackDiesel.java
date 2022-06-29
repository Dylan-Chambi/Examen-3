package exam.exercise2;

public class CuadratrackDiesel implements Cuadratrack {

    private int dieselActual;

    public CuadratrackDiesel(){
        this.dieselActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadDiesel) {
        if(cantidadDiesel >= 0 && cantidadDiesel <= 50){
            this.dieselActual = cantidadDiesel;
            System.out.println("Monto de gasolina actual: " + cantidadDiesel);
        }else{
            System.out.println("Rango de diesel " + cantidadDiesel + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*50);
        return cantidadRandom;
    }
}
