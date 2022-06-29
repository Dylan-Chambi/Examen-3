package exam.exercise4;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Usuario usuario1 = new Usuario(45, "Juan", "123"); //no primo
        Usuario usuario2 = new Usuario(7, "Pedro", "456"); //primo

        proxy.loqin(usuario1);
        proxy.loqin(usuario2);

        proxy.showUsuariosLogueados();

    }
}
