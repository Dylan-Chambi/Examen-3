package exam.exercise1;

public class Turista implements IVisitor{
    private String nombre;
    private int montoDineroActual;

    public Turista(String nombre, int montoDineroActual) {
        this.nombre = nombre;
        this.montoDineroActual = montoDineroActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoDineroActual() {
        return montoDineroActual;
    }

    public void setMontoDineroActual(int montoDineroActual) {
        this.montoDineroActual = montoDineroActual;
    }

    @Override
    public void realizarGasto(LaPaz laPaz) {
        int gastoRandom = (int) (Math.random() * 1000);
        int nuevoMonto = this.getMontoDineroActual() - gastoRandom;
        if(nuevoMonto >= 0){
            this.setMontoDineroActual(nuevoMonto);
            System.out.println("El turista " + this.nombre + " realiza gastos de "
                    + gastoRandom + " Bs. en " + laPaz.getNombre()
                    + " y le queda " + this.getMontoDineroActual()
                    + " Bs.");
        }else{
            System.out.println("El turista " + this.nombre + " tiene " + this.getMontoDineroActual() + " Bs. y lo que quiere gastar es " + gastoRandom + " Bs.");
        }

    }

    @Override
    public void realizarGasto(Cochabamba cochabamba) {
        int gasto10Porciento = (int) (cochabamba.getNumeroHabitantes() * 0.1);
        int nuevoMonto = this.getMontoDineroActual() - gasto10Porciento;
        if(nuevoMonto >= 0){
            this.setMontoDineroActual(nuevoMonto);
            System.out.println("El turista " + this.nombre + " realiza gastos de "
                    + gasto10Porciento + " Bs. en " + cochabamba.getNombre()
                    + " y le queda " + this.getMontoDineroActual()
                    + " Bs.");
        }else{
            System.out.println("El turista " + this.nombre + " tiene " + this.getMontoDineroActual() + " Bs. y lo que quiere gastar es " + gasto10Porciento + " Bs.");
        }
    }

    @Override
    public void realizarGasto(SantaCruz santaCruz) {
        int gasto50Porciento = (int) (santaCruz.getNumeroProvincias() * 0.5);
        int nuevoMonto = this.getMontoDineroActual() - gasto50Porciento;
        if(nuevoMonto >= 0){
            this.setMontoDineroActual(nuevoMonto);
            System.out.println("El turista " + this.nombre + " realiza gastos de "
                    + gasto50Porciento + " Bs. en " + santaCruz.getNombre()
                    + " y le queda " + this.getMontoDineroActual()
                    + " Bs.");
        }else{
            System.out.println("El turista " + this.nombre + " tiene " + this.getMontoDineroActual() + " Bs. y lo que quiere gastar es " + gasto50Porciento + " Bs.");
        }
    }
}
