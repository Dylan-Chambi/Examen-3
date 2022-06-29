package exam.exercise2;

public class CuadratrackEletrico {
    private int porcentajeCargado;

    public CuadratrackEletrico(){
        this.porcentajeCargado = 0;
    }

    public void cargar(int montoCarga){
        if(montoCarga >= 0 && montoCarga <= 20){
            this.porcentajeCargado = montoCarga;
            System.out.println("Monto de carga actual: " + montoCarga);
        }else{
            System.out.println("Rango de carga " + montoCarga + " no valido!");
        }
    }

    public int estadoDeEletricidad() {
        int cantidadRandom = (int) (Math.random()*10);
        return cantidadRandom;
    }
}
