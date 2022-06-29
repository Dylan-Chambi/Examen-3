package exam.exercise4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Usuario> usuariosRegistrados;

    public BaseDatos() {
        this.usuariosRegistrados = new ArrayList<>();
        usuariosRegistrados.add(new Usuario("1", "Juan", "123"));
        usuariosRegistrados.add(new Usuario("2", "Pedro", "456"));
        usuariosRegistrados.add(new Usuario("3", "Maria", "789"));
        usuariosRegistrados.add(new Usuario("4", "Juan", "123"));
    }
}
