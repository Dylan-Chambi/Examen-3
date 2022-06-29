package exam.exercise3;

public class InstalacionElectrica extends SistemaControlEstudiantes {


    @Override
    public void pagar() {
        System.out.println("Instalacion Electrica> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + " con un descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}
