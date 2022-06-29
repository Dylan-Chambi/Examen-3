package exam.exercise5;

public class Client {

    public static void main(String[]args){

        System.out.println("-----------------------Celular Apple-----------------------");
        Celular iPhone = new Apple("8GB", "32GB", "intel", 1000);
        iPhone = new Carcasa(iPhone, 130);
        iPhone = new VidrioTemplado(iPhone, 150);

        iPhone.mostrarCaracteristicas();

        System.out.println("-----------------------Celular Samsung-----------------------");
        Celular samsung = new Samsung("16GB", "256GB", "snapdragon", 1000);
        samsung = new Carcasa(samsung, 130);
        samsung = new VidrioTemplado(samsung, 150);
        samsung = new MemoriaExterna(samsung, 200);

        samsung.mostrarCaracteristicas();

        System.out.println("-----------------------Celular Xiaomi-----------------------");
        Celular xiaomi = new Xiaomi("12GB", "128GB", "mediatek", 1000);
        xiaomi = new Carcasa(xiaomi, 130);

        xiaomi.mostrarCaracteristicas();




    }
}
