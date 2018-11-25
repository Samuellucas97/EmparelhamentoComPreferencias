/**
 * Representa um arco no grafo
 * @author	Samuel
 * @see  	Vertice
 *
 */
public class Arco {
	private Vertice verticeDoInicio;
	private Vertice verticeDoFim;

	
	public Arco( ) {
		
		verticeDoInicio = new Vertice();
		verticeDoFim = new Vertice();
		
	}
	
	public Arco( Vertice verticeDoInicio, Vertice verticeDoFim ) {
		this.verticeDoInicio = verticeDoInicio;
		this.verticeDoFim = verticeDoFim;
	}
	
	/**
	 * Método get do atributo verticeDoInicio 
	 * @return vertice inicial do arco da onde o arco emerge
	 */
	public Vertice getVerticeDoInicio() {
		return verticeDoInicio;
	}
	
	/**
	 * Método get do atributo verticeDoFim 
	 * @return vertice final do arco da onde o arco incide
	 */
	public Vertice getVerticeDoFim() {
		return verticeDoFim;
	}
	
}
