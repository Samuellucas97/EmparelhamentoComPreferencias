package algoritmos;

import java.awt.List;

import grafos.Arco;
import grafos.Grafo;

/**
 * Implementação da Busca em Profundidade	
 * @author  candinhojr
 * @author  samuellucas97
 */
public class BuscaEmProfundidade {
	
	/// ATRIBUTOS
	
	private static final int branco = 0; //-> Indica que o vértice não foi visitado
	private static final int cinza = 1; //-> Indica que o vértice foi complemente visitado mas seus vértices adjacentes não 
	private static final int preto = 2; //-> Indica que o vértice e seus adjacentes foram completamente visitados 
	
	private int[] verticeDescobertoPoremNaoComplematemnteVisitado;
	private int[] verticesCompletamenteVisitados; //-> VetorArmazena Tempo de término do exame da lista de adjac�ncia 
	private int[] verticeAntecessorPeloCaminho;
	private int[] corDosVertices;
	private int tempo;
	
	private Grafo grafo;
	
	/// CONSTRUTOR
	
	/**
	 * Construtor parametrizado
	 * @param grafo Grafo a ser trabalhado
	 */
	public BuscaEmProfundidade(Grafo grafo) {
		this.grafo = grafo;
		this.verticeDescobertoPoremNaoComplematemnteVisitado = new int[ grafo.getNumeroDeVertices() ];
		this.verticesCompletamenteVisitados = new int[ grafo.getNumeroDeVertices() ];
		this.verticeAntecessorPeloCaminho = new int[ grafo.getNumeroDeVertices() ];
		this.tempo = 0;
		
		
	}
	
	/// MÉTODOS
	
	/**
	 * Realiza o procedimento de visita da busca em profundidade
	 * @param vertice	Posição do vértice no vetor
	 * @param tempo	
	 * @param corDosVertices	Vetor que armazena a cor de cada vértice do grafo
	 * @return
	 */
	private int visita(int vertice) {
		
		corDosVertices[vertice] = cinza;
		this.tempo++;
		this.verticeDescobertoPoremNaoComplematemnteVisitado[vertice] = tempo;
		/**
		 * Método copiado
		List<Integer> adjacentes = g.listDeAdjacentes(u);
        for (int v : adjacentes) {
            if (cor[v] == 1) {
                arestasDeRetorno.add(new Aresta(u, v));
            }
            if (cor[v] == 2) {
                if (tempoDescoberta[u] < tempoDeDescoberta(v)) {
                    arestasDeAvanco.add(new Aresta(u, v));
                } else {
                    arestasDeCruzamento.add(new Aresta(u, v));
                }
            }
            if (cor[v] == 0) {
                arestasDeArvore.add(new Aresta(u, v));
                visit(v);
            }
        }
		 */
		
		java.util.List<Arco> adjacentes = grafo.getVertice(vertice).getArcosAdjacentes();
		
		for (Arco a : adjacentes) {
			if(corDosVertices[a.getVerticeDoInicio().getChave()] == cinza) {
				//arestasDeRetorno.add(new Aresta(u, v));
			} 
			if(corDosVertices[a.getVerticeDoInicio().getChave()] == preto) {
				if (verticeDescobertoPoremNaoComplematemnteVisitado[vertice] < tempoDeDescoberta(a.getVerticeDoInicio().getChave())) {
                    //arestasDeAvanco.add(new Aresta(u, v));
                } else {
                    //arestasDeCruzamento.add(new Aresta(u, v));
                }
			}
			if(corDosVertices[a.getVerticeDoInicio().getChave()] == branco) {
				//arestasDeArvore.add(new Aresta(u, v));
				visita(a.getVerticeDoInicio().getChave());
			}
		}
		corDosVertices[vertice] = preto;
		return verticesCompletamenteVisitados[vertice] = ++tempo;
	}
//		
//		this.verticeAntecessorPeloCaminho[vertice] = tempo + 1;
//		
//		if(!this.grafo.getVertice(vertice).getArcosAdjacentes().isEmpty()) {
//			Arco a = this.grafo.getVertice(vertice).getArcosAdjacentes().get(0);
//			while(a != null) {
//				Integer v = a.getVerticeDoFim().getChave();
//				if(corDosVertices[v] == branco) {
//					this.verticeAntecessorPeloCaminho[v] = vertice;
//					tempo = this.visita(v, tempo, corDosVertices);
//				}
//				a = this.grafo.getVertice(vertice).getArcosAdjacentes().;
//			}
//		}
	
	public int tempoDeDescoberta(int origem) {
        return verticeDescobertoPoremNaoComplematemnteVisitado[origem];
    }
	
	/**
	 * algoritmo de busca em profundidade baseado no conceito de backtrack
	 */
	public void buscaEmProfundidade() {
		
		int tempo = 0;
		int[] coresDosVerticesDoGrafo = new int[ grafo.getNumeroDeVertices() ];
		
		/// INICIANDO A BUSCA PINTANDO TODOS OS VÉRTICES DE BRANCO TENDO EM VISTA QUE NÍNGUÉM FOI VISITADO AINDA.
		for( int i=0; i < grafo.getNumeroDeVertices(); ++i ) {
		
			coresDosVerticesDoGrafo[i] = branco;
			
			verticeAntecessorPeloCaminho[i] = -1; /// Além disso, inicializaremos também o vetor de vértices antecessores
		}

		/// PERCORRENDO TODO O GRAFO
		for( int i=0; i < grafo.getNumeroDeVertices(); ++i ) {
			
			if(coresDosVerticesDoGrafo[i] == branco){ 	///  O FATO DE QUE O VÉRTICE ESTAVA COM A COR BRANCA INDICA QUE ELE 
														/// ESTÁ SENDO VISITADO PELA PRIMEIRA VEZ.
				tempo = visita(i);
				
			}
		
		}
		
			
	}
	
}
