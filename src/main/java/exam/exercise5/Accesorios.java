package exam.exercise5;

public abstract class Accesorios implements Celular {

    protected Celular componentBase;

    public Accesorios(Celular componentBase){
        this.componentBase=componentBase;
    }

    @Override
    public void mostrarCaracteristicas() {
        componentBase.mostrarCaracteristicas();
    }

    @Override
    public void addPrecio(int precio) {
        componentBase.addPrecio(precio);
    }
}
