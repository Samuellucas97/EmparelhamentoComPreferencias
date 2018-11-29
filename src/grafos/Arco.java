package grafos;

/**
 * Representa um arco no grafo
 * @author	Samuel
 * @see  	Vertice
 *
 */
public class Arco {
	
	/// ATRIBUTOS
	
	private Vertice verticeDoInicio; //-> Vértice do início 
	private Vertice verticeDoFim; //-> Vértice do fim
	
	/// CONSTRUTORES
		/**
	 * Construtor parametrizado
	 * @param verticeDoInicio Vértice do início
	 * @param verticeDoFim Vértice do fim
	 */
	public Arco( Vertice verticeDoInicio, Vertice verticeDoFim ) {
		this.verticeDoInicio = verticeDoInicio;
		this.verticeDoFim = verticeDoFim;
	}
	
	/// MÉTODOS
	
	public Vertice getVerticeDoInicio() {
		return verticeDoInicio;
	}
	
	public Vertice getVerticeDoFim() {
		return verticeDoFim;
	}
	
}
