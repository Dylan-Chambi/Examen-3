package exam.exercise3;

public class PagoTransferenciaBancaria implements MetodoPagoImplementator {
    @Override
    public double descuento() {
        return 0.05;
    }

    @Override
    public String nombreFormaPago() {
        return "pago por transferencia bancaria";
    }
}
