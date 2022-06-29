package exam.exercise3;

public class SistemaUniversidad extends SistemaControlEstudiantes {


    public SistemaUniversidad(String nombre, int capacidad, String requisitos) {
        super(nombre, capacidad, requisitos);
    }

    @Override
    void mostrarDatosRedSocial() {
        System.out.println("Sistema de Universidad " + getNombre());
        this.redSocial.mostratDatosRedSocial();
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Requisitos: " + getRequisitos());
        System.out.println("Inscritos: ");
        for (int i = 0; i < getContador(); i++) {
            System.out.println("\t" + "- " + getEstudiantes()[i].getNombre());
        }
    }
}
