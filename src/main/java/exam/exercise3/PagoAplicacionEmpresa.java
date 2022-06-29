package exam.exercise3;

public class PagoAplicacionEmpresa implements MetodoPagoImplementator {
    @Override
    public double descuento() {
        return 0.1;
    }

    @Override
    public String nombreFormaPago() {
        return "pago por la aplicacion de la empresa";
    }
}
