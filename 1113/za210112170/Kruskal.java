import java.util.Arrays;

// Crea una nueva clase Dedges
class DEdge {
    char start;// un punto en el borde
    char end;// otro punto en el borde
    int weight;// peso del borde

    public DEdge(char start, char end, int weight) {
        super();
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DEdge [start=" + start + ", end=" + end + ", weight=" + weight + "]";
    }

}
