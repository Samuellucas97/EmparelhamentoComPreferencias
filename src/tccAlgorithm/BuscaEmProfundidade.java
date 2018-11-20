
public class BuscaEmProfundidade {
	
	
	private static final byte branco = 0;
	private static byte cinza = 1;
	private static byte preto = 2;
	
	private int tempoDeDescoberta[];
	private int tempoDeTermino[]; //! Tempo de término do exame da lista de adjacência 
	private int antecessor[];
	
	private Grafo grafo;
	
	public BuscaEmProfundidade(Grafo grafo) {
		
		this.grafo = grafo;
		int numeroDeVertices = grafo.numVertices();
		tempoDeDescoberta = new int[numeroDeVertices];
		tempoDeTermino = new int[numeroDeVertices];
		
		
		
	}
	
	
}
