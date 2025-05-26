public class Nodo {
    Estado estado;
    Nodo padre;
    int costo;

    public Nodo(Estado estado, Nodo padre, int costo) {
        this.estado = estado;
        this.padre = padre;
        this.costo = costo;
    }
}