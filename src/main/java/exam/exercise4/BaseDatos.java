package exam.exercise4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private static List<Integer> idUsuariosRegistrados = new ArrayList<>(List.of(5, 7, 8, 10, 45));

    public static List<Integer> getIdUsuariosRegistrados() {
        return idUsuariosRegistrados;
    }
}
