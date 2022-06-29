package exam.exercise5;

public class Carcasa extends Accesorios {

    private int precioCarcasa;

    public Carcasa(Celular componentBase, int precioCarcasa) {
        super(componentBase);
        this.precioCarcasa = precioCarcasa;
    }


    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Añadido el accesorio carcasa con un precio de: " + precioCarcasa);
        addPrecio(precioCarcasa);
        super.mostrarCaracteristicas();
    }
}
