package algoritmos;

import grafos.Grafo;

public class BuscaEmProfundidade {
	
	/// ATRIBUTOS
	
	private static final int branco = 0; //-> Indica que o vértice não foi visitado
	private static final int cinza = 1; //-> Indica que o vértice foi complemente visitado mas seus vértices adjacentes não 
	private static final int preto = 2; //-> Indica que o vértice e seus adjacentes foram completamente visitados 
	
	private int[] verticeDescobertoPoremNaoComplematemnteVisitado;
	private int[] veticesCompletamenteVisitados; //-> VetorArmazena Tempo de término do exame da lista de adjac�ncia 
	private int[] verticeAntecessorPeloCaminho;
	
	private Grafo grafo;
	
	/// CONSTRUTOR
	
	/**
	 * Construtor parametrizado
	 * @param grafo Grafo a ser trabalhado
	 */
	public BuscaEmProfundidade(Grafo grafo) {
		
		this.grafo = grafo;
		verticeDescobertoPoremNaoComplematemnteVisitado = new int[ grafo.numVertices() ];
		veticesCompletamenteVisitados = new int[ grafo.numVertices() ];
		verticeAntecessorPeloCaminho = new int[ grafo.numVertices() ];
		
	}
	
	/// MÉTODOS
	
	/**
	 * Realiza o procedimento de visita da busca em profundidade
	 * @param vertice	Posição do vértice no vetor
	 * @param tempo	
	 * @param corDosVertices	Vetor que armazena a cor de cada vértice do grafo
	 * @return
	 */
	private int visita(int vertice, int tempo, int[] corDosVertices) {
		
		corDosVertices[vertice] = cinza;
		this.verticeAntecessorPeloCaminho[vertice] = tempo + 1;
		
		
		return 5;
	}
	
	/**
	 * algoritmo de busca em profundidade baseado no conceito de backtrack
	 */
	public void buscaEmProfundidade() {
		
		int tempo = 0;
		int[] coresDosVerticesDoGrafo = new int[ grafo.numVertices() ];
		
		/// INICIANDO A BUSCA PINTANDO TODOS OS VÉRTICES DE BRANCO TENDO EM VISTA QUE NÍNGUÉM FOI VISITADO AINDA.
		for( int i=0; i < grafo.numVertices(); ++i ) {
		
			coresDosVerticesDoGrafo[i] = branco;
			
			verticeAntecessorPeloCaminho[i] = -1; /// Além disso, inicializaremos também o vetor de vértices antecessores
		}

		/// PERCORRENDO TODO O GRAFO
		for( int i=0; i < grafo.numVertices(); ++i ) {
			
			if(coresDosVerticesDoGrafo[i] == branco){ 	///  O FATO DE QUE O VÉRTICE ESTAVA COM A COR BRANCA INDICA QUE ELE 
														/// ESTÁ SENDO VISITADO PELA PRIMEIRA VEZ.
				tempo = visita(i, tempo, coresDosVerticesDoGrafo);
				
			}
		
		}
		
			
	}
	
}
