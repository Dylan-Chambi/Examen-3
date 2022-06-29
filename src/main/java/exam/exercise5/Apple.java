package exam.exercise5;

public class Apple implements Celular {

    private String ram;
    private String almacenamiento;
    private String cpu;
    private int precioBase;

    public Apple(String ram, String almacenamiento, String cpu, int precioBase) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precioBase = precioBase;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Marca: Samsung");
        System.out.println("RAM: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("CPU: " + cpu);
        System.out.println("Precio total: " + precioBase);
    }

    @Override
    public void addPrecio(int precio) {
        this.precioBase += precio;
    }
}
