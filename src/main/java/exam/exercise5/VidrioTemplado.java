package exam.exercise5;

public class VidrioTemplado extends Accesorios {

    private int precioCarcasa;

    public VidrioTemplado(Celular componentBase, int precioCarcasa) {
        super(componentBase);
        this.precioCarcasa = precioCarcasa;
    }


    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Añadido el accesorio vidrio templado con un precio de: " + precioCarcasa);
        addPrecio(precioCarcasa);
        super.mostrarCaracteristicas();
    }
}
