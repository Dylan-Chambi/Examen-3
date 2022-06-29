package exam.exercise3;

public abstract class SistemaControlEstudiantes { //Abstraccion
    protected MetodoPagoImplementator metodoPagoImplementator;

    public SistemaControlEstudiantes() {
        this.metodoPagoImplementator = new PagoEfectivo(); // Por defecto
    }

    abstract void mostrarDatosRedSocial();

}
