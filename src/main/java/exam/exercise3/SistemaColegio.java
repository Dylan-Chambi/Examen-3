package exam.exercise3;

public class SistemaColegio extends SistemaControlEstudiantes {


    public SistemaColegio(String nombre, int capacidad, String requisitos) {
        super(nombre, capacidad, requisitos);
    }

    @Override
    void mostrarDatosRedSocial() {
        System.out.println("Sistema de Colegio " + getNombre());
        this.redSocial.mostratDatosRedSocial();
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Requisitos: " + getRequisitos());
        System.out.println("Inscritos: ");
        for (int i = 0; i < getContador(); i++) {
            System.out.println("\t" + "- " + getEstudiantes()[i].getNombre());
        }
    }
}
