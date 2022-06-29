package exam.exercise3;

public class Client {

    public static void main (String[]args){
        Estudiante estudiante1 = new Estudiante("Juan", 20);
        Estudiante estudiante2 = new Estudiante("Pedro", 21);
        Estudiante estudiante3 = new Estudiante("Maria", 22);


        Facebook facebook = new Facebook();

        SistemaColegio sistemaColegio = new SistemaColegio("Sistema de Colegio", 100, "Todos los estudiantes ser mayor de 10");
        sistemaColegio.inscribir(estudiante1);
        sistemaColegio.inscribir(estudiante2);
        sistemaColegio.inscribir(estudiante3);

        sistemaColegio.setRedSocial(facebook);
        sistemaColegio.mostrarDatosRedSocial();


        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad("Sistema de Universidad", 100, "Todos los estudiantes ser mayor de 20");
        sistemaUniversidad.inscribir(estudiante1);
        sistemaUniversidad.inscribir(estudiante2);
        sistemaUniversidad.inscribir(estudiante3);

        sistemaUniversidad.setRedSocial(facebook);
        sistemaUniversidad.mostrarDatosRedSocial();

    }
}
