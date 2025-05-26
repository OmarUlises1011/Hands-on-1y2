import java.util.*;


public class Problema {
    Estado inicial;
    Estado meta;
    char[][] mundo;

    public Problema(Estado inicial, Estado meta, char[][] mundo) {
        this.inicial = inicial;
        this.meta = meta;
        this.mundo = mundo;
    }

    public List<Estado> sucesores(Estado estado) {
        List<Estado> sucesores = new ArrayList<>();
        int[][] movimientos = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        for (int[] m : movimientos) {
            int nx = estado.x + m[0], ny = estado.y + m[1];
            if (nx >= 0 && nx < mundo.length && ny >= 0 && ny < mundo[0].length) {
                char celda = mundo[nx][ny];
                if (celda != 'W' && celda != 'P') {
                    sucesores.add(new Estado(nx, ny, celda));
                }
            }
        }
        return sucesores;
    }
}