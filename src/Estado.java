import java.util.*;

public class Estado {
    int x, y;
    char tipo;

    public Estado(int x, int y, char tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estado estado = (Estado) obj;
        return x == estado.x && y == estado.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}