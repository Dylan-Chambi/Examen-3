package exam.exercise3;

public class InstalacionAgua extends SistemaControlEstudiantes {


    @Override
    public void pagar() {
        System.out.println("Instalacion Agua> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + " con un descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}