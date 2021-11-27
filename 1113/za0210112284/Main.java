
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		final File f = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		final String ruta="";
		System.out.println("Ruta es:"+ruta);

		/*
		GrafoNPGenerator.aleatorioConProbabilidad(50, 0.5);
		GrafoNPGenerator.aleatorioConPorcentajeAdyacencia(60, 0.5);
		GrafoNPGenerator.regularConGrado(30, 5);
		GrafoNPGenerator.regularConPorcentajeAdyacencia(40, 0.5);
		GrafoNPGenerator.nPartito(60, 35);
		
		GrafoPGenerator.aleatorioConProbabilidad(50, 0.5, 60);
		GrafoPGenerator.aleatorioConPorcentajeAdyacencia(60, 0.5, 50);
		GrafoPGenerator.regularConGrado(30, 5, 70);
		GrafoPGenerator.regularConPorcentajeAdyacencia(40, 0.5, 30);
		GrafoPGenerator.nPartito(60, 35, 40);
		*/

		
		/*
		GrafoNDNP grafo = new GrafoNDNP("grafo.in");
		grafo.coloreoSecuencial(10);
		grafo.coloreoWelshPowell(10);
		grafo.coloreoMatula(10);
		*/
		
		/*
		GrafoNDP grafo = new GrafoNDP("grafo.in");
		grafo.coloreoSecuencial(10);
		grafo.coloreoWelshPowell(10);
		grafo.coloreoMatula(10);
		*/
		
		// ProbadorColoreoGrafoNP probador = new ProbadorColoreoGrafoNP("grafo.in", "coloreado.out");
		
		// ProbadorColoreoGrafoP probador = new ProbadorColoreoGrafoP("grafo.in", "coloreado.out");
		
		/*
		if (probador.probar())
			System.out.println("BIEN COLOREADO");
		else
			System.out.println("MAL COLOREADO");
		*/
		


		GrafoNDP grafo1 = new GrafoNDP(ruta+"grafo_dijkstra.in");
		Dijkstra dijkstra = new Dijkstra(grafo1, 0);
		dijkstra.ejecutar();




		GrafoNDP grafo2 = new GrafoNDP(ruta+"grafo_kruskal.in");
		Kruskal kruskal = new Kruskal(grafo2);
		kruskal.ejecutar();




		GrafoNDP grafo3 = new GrafoNDP(ruta+"grafo_prim.in");
		Prim prim = new Prim(grafo3);
		prim.ejecutar();

		
		/*
		GrafoDP digrafo = new GrafoDP("grafo.in");
		digrafo.coloreoSecuencial(10);
		digrafo.coloreoWelshPowell(10);
		digrafo.coloreoMatula(10);
		*/
		
		/*
		GrafoDP digrafo = new GrafoDP("grafo.in");
		Floyd floyd = new Floyd(digrafo);
		floyd.ejecutar();
		*/
		
		/*
		GrafoDP digrafo = new GrafoDP("grafo.in");
		Warshall warshall = new Warshall(digrafo);
		warshall.ejecutar();
		*/
		

		/*
		GrafoNDNP grafo = new GrafoNDNP(ruta+"grafo_prim.in");
		DFS dfs = new DFS(grafo, 4);
		dfs.ejecutar();
		*/
		
		/*
		GrafoNDNP grafo = new GrafoNDNP("grafo.in");
		BFS bfs = new BFS(grafo, 4);
		bfs.ejecutar();
		*/
	}
}
