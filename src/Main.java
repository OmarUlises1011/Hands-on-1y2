import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[][] mundo = {
                //0    1    2    3  - Columnas
                {'P', 'E', 'E', 'E'}, // filas 0
                {'E', 'E', 'E', 'W'}, // filas 1      x = Filas
                {'E', 'I', 'E', 'E'}, // filas 2      y = Columnas
                {'W', 'E', 'E', 'G'}  // filas 3      Oro = (3,3)
        };

        Estado inicio = new Estado(1, 2, 'E');
        Estado meta = new Estado(3, 3, 'G');

        Problema problema = new Problema(inicio, meta, mundo);

        BusquedaDFS dfs = new BusquedaDFS();
        List<String> solucionDFS = dfs.buscar(problema);
        System.out.println("Solución DFS: " + (solucionDFS != null ? solucionDFS : "No encontrada"));

        BusquedaBFS bfs = new BusquedaBFS();
        List<String> solucionBFS = bfs.buscar(problema);
        System.out.println("Solución BFS: " + (solucionBFS != null ? solucionBFS : "No encontrada"));
    }
}