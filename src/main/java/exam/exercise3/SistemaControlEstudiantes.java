package exam.exercise3;

public abstract class SistemaControlEstudiantes { //Abstraccion
    protected RedSocial redSocial;
    protected String nombre;
    protected int capacidad;
    protected Estudiante[] estudiantes;
    protected String requisitos;

    protected int contador;

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public SistemaControlEstudiantes(String nombre, int capacidad, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        this.estudiantes = new Estudiante[capacidad];
        this.redSocial = new Facebook(); // Por defecto
        this.contador = 0;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }

    public void inscribir(Estudiante estudiante){
        estudiantes[contador] = estudiante;
        contador++;
    }

    abstract void mostrarDatosRedSocial();

}
