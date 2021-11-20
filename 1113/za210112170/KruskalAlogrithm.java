import java.util.Arrays;

public class KruskalAlogrithm {
    private int numOfEdges;// número de aristas
    private char[] vertex;// colección de vértices
    private int[][] matrix;// matriz de adyacencia
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        char[] vertex = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
        int matrix[][] = {
                /* A *//* B *//* C *//* D *//* E *//* F *//* G */
                /* A */ { 0, 12, INF, INF, INF, 16, 14 }, /* B */ { 12, 0, 10, INF, INF, 7, INF },
                /* C */ { INF, 10, 0, 3, 5, 6, INF }, /* D */ { INF, INF, 3, 0, 4, INF, INF },
                /* E */ { INF, INF, 5, 4, 0, 2, 8 }, /* F */ { 16, 7, 6, INF, 2, 0, 9 },
                /* G */ { 14, INF, INF, INF, 8, 9, 0 } };
        KruskalAlogrithm kruskalAlogrithm = new KruskalAlogrithm(vertex, matrix);
        kruskalAlogrithm.showGraph();
        System.out.println("Antes de ordenar:" + Arrays.toString(kruskalAlogrithm.getEdges()));
        DEdge[] edges = kruskalAlogrithm.getEdges();
        kruskalAlogrithm.sort(edges);
        System.out.println("Después de ordenar:" + Arrays.toString(edges));
        kruskalAlogrithm.Kruskal();
    }

    // Diagrama de inicialización
    public KruskalAlogrithm(char[] vertex, int[][] matrix) {
        this.vertex = vertex;
        this.matrix = matrix;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = i + 1; j < vertex.length; j++) {
                if (matrix[i][j] != INF) {
                    this.numOfEdges++;
                }
            }
        }
    }

    // imprimir matriz de adyacencia
    public void showGraph() {
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < vertex.length; j++) {
                System.out.printf("%11d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     *
     * @Title: sort
     * @Description: use la clasificación de burbujas para ordenar cada borde de pequeño a grande por peso
     * @param @param bordes colección de bordes
     * @return
     */
    private void sort(DEdge[] edges) {
        for (int i = 0; i < edges.length - 1; i++) {
            for (int j = 0; j < edges.length - i - 1; j++) {
                if (edges[j].weight > edges[j + 1].weight) {
                    DEdge temp = edges[j];
                    edges[j] = edges[j + 1];
                    edges[j + 1] = temp;
                }
            }
        }
    }

    /**
     *
     * @Title: getEdges
     * @Description: Obtén una colección de bordes
     * @return
     */
    private DEdge[] getEdges() {
        int index = 0;
        DEdge[] edges = new DEdge[numOfEdges];
        for (int i = 0; i < vertex.length; i++) {
            for (int j = i + 1; j < vertex.length; j++) {
                if (matrix[i][j] != INF) {
                    edges[index++] = new DEdge(vertex[i], vertex[j], matrix[i][j]);
                }
            }
        }
        return edges;
    }

    /**
     *
     * @Title: getPosition
     * @Description: Devuelve el subíndice del nodo v
     * @param @param v nodo
     * @return
     */
    private int getPosition(char v) {
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i] == v) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @Title: getEnd
     * @Description: Devuelve el punto clave correspondiente al vértice con el subíndice i
     * @param @param ends El conjunto de puntos finales correspondientes a cada vértice, que se agregan dinámicamente al atravesar los bordes
     * @param @param i El vértice cuyo índice es i para encontrar
     * @return El punto final correspondiente al vértice cuyo subíndice es i
     */
    private int getEnd(int[] ends, int i) {
        while (ends[i] != 0) {
            i = ends[i];
        }
        return i;
    }

    private void Kruskal() {
        // Inicializar la colección de puntos finales
        int index = 0;
        int[] ends = new int[numOfEdges];
        DEdge[] edges = getEdges();
        System.out.println("Conjunto de aristas del gráfico =" + Arrays.toString(edges) + "Común"+ edges.length);
        DEdge[] res = new DEdge[vertex.length-1];
        sort(edges);
        for (int i = 0; i < numOfEdges; i++) {
            // Obtiene el índice del primer vértice de este borde
            int p1 = getPosition(edges[i].start);
            // Obtiene el subíndice del segundo vértice de esta arista
            int p2 = getPosition(edges[i].end);
            // obtiene los puntos finales de p1 y p2
            int m = getEnd(ends, p1);
            int n = getEnd(ends, p2);
            if(m!=n) {
                res[index++] = edges[i];
                // Establecer el final de m an
                ends[m] = n;
            }
        }
        System.out.println("Árbol de expansión mínimo:");
        for(int i = 0 ; i < index;i++) {
            System.out.println(res[i]);
        }
    }
}
