package exam.exercise1;

public class Client {

    public static void main(String[]args){
        Turista turista = new Turista("Monty", 10000);

        //Departamentos de Bolivia como singleton con enum
        LaPaz laPaz = LaPaz.getInstance();
        Cochabamba cochabamba = Cochabamba.getInstance();
        SantaCruz santaCruz = SantaCruz.getInstance();

        System.out.println("------------------------La Paz------------------------");
        laPaz.showInfo();
        laPaz.realizarGasto(turista);

        System.out.println("------------------------Cochabamba------------------------");
        cochabamba.showInfo();
        cochabamba.realizarGasto(turista);

        System.out.println("------------------------Santa Cruz------------------------");
        santaCruz.showInfo();
        santaCruz.realizarGasto(turista);


    }
}
