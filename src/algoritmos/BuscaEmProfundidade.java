package algoritmos;

import java.util.HashSet;
import java.util.Set;

import grafos.Arco;
import grafos.Grafo;
import grafos.Vertice;

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
	private Set<Arco> arestasDeArvore;
    private Set<Arco> arestasDeAvanco;
    private Set<Arco> arestasDeCruzamento;
    private Set<Arco> arestasDeRetorno;
	
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
		this.arestasDeArvore = new HashSet<Arco>();
		this.arestasDeAvanco = new HashSet<Arco>();
		this.arestasDeCruzamento = new HashSet<Arco>();
		this.arestasDeRetorno = new HashSet<Arco>();
		this.corDosVertices = new int[grafo.getNumeroDeVertices()];
	}
	
	/// MÉTODOS
	/**
	 * Realiza o procedimento de visita da busca em profundidade
	 * @param vertice	Posição do vértice no vetor
	 * @param tempo	
	 * @param corDosVertices	Vetor que armazena a cor de cada vértice do grafo
	 * @return
	 */
	private int visita(Vertice vertice) {
		this.corDosVertices[vertice.getChave()] = cinza;
		this.tempo++;
		this.verticeDescobertoPoremNaoComplematemnteVisitado[vertice.getChave()] = tempo;
		java.util.List<Arco> adjacentes = grafo.getVertice(vertice.getChave()).getArcosAdjacentes();
		
		for (Arco a : adjacentes) {
			if(corDosVertices[a.getVerticeDoFim().getChave()] == cinza) {
				arestasDeRetorno.add(new Arco(vertice, a.getVerticeDoFim()));
			} 
			
			if(corDosVertices[a.getVerticeDoFim().getChave()] == preto) {
				if (verticeDescobertoPoremNaoComplematemnteVisitado[vertice.getChave()] < 
						tempoDeDescoberta(a.getVerticeDoFim().getChave())) {
                    arestasDeAvanco.add(new Arco(vertice, a.getVerticeDoFim()));
                } else {
                    arestasDeCruzamento.add(new Arco(vertice, a.getVerticeDoFim()));
                }
			}
			
			if(corDosVertices[a.getVerticeDoFim().getChave()] == branco) {
				arestasDeArvore.add(new Arco(vertice, a.getVerticeDoFim()));
				visita(a.getVerticeDoFim());
			}
		}
		corDosVertices[vertice.getChave()] = preto;
		return verticesCompletamenteVisitados[vertice.getChave()] = ++tempo;
	}
	
	/**
	 * @return the arestasDeArvore
	 */
	public Set<Arco> getArestasDeArvore() {
		return arestasDeArvore;
	}

	/**
	 * @return the arestasDeAvanco
	 */
	public Set<Arco> getArestasDeAvanco() {
		return arestasDeAvanco;
	}

	/**
	 * @return the arestasDeCruzamento
	 */
	public Set<Arco> getArestasDeCruzamento() {
		return arestasDeCruzamento;
	}

	/**
	 * @return the arestasDeRetorno
	 */
	public Set<Arco> getArestasDeRetorno() {
		return arestasDeRetorno;
	}

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
				tempo = visita(grafo.getVertice(i));
			}
		}
	}
	
}
