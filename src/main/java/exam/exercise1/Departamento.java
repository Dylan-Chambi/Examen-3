package exam.exercise1;

public abstract class Departamento {
     private String nombre;
     private int numeroProvincias;
     private int numeroHabitantes;
     private String clima;
     private double dineroPorTurismo;



     Departamento(String nombre, int numeroProvincias, int numeroHabitantes, String clima, double dineroPorTurismo) {
          this.nombre = nombre;
          this.numeroProvincias = numeroProvincias;
          this.numeroHabitantes = numeroHabitantes;
          this.clima = clima;
          this.dineroPorTurismo = dineroPorTurismo;
     }

     public String getClima() {
          return clima;
     }

     public void setClima(String clima) {
          this.clima = clima;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public int getNumeroProvincias() {
          return numeroProvincias;
     }

     public void setNumeroProvincias(int numeroProvincias) {
          this.numeroProvincias = numeroProvincias;
     }

     public int getNumeroHabitantes() {
          return numeroHabitantes;
     }

     public void setNumeroHabitantes(int numeroHabitantes) {
          this.numeroHabitantes = numeroHabitantes;
     }

     public double getDineroPorTurismo() {
          return dineroPorTurismo;
     }

     public void setDineroPorTurismo(double dineroPorTurismo) {
          this.dineroPorTurismo = dineroPorTurismo;
     }

     abstract public void realizarGasto(IVisitor visitor);
     public void showInfo(){
          System.out.println("Departamento: " + this.getNombre());
          System.out.println("\t" + "- Numero de provincias: " + this.getNumeroProvincias());
          System.out.println("\t" + "- Numero de habitantes: " + this.getNumeroHabitantes());
          System.out.println("\t" + "- Clima: " + this.getClima());
          System.out.println("\t" + "- Dinero por turismo: " + this.getDineroPorTurismo() + " Millones de Bolivianos");
     }

     public static String getClimaRandom() {
          String[] climas = {"Lluvioso", "Nublado", "Soleado"};
          int random = (int) (Math.random() * 3);
          return climas[random];
     }
}
