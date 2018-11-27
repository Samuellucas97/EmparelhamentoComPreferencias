package tccAlgorithm;

/**
 * Representa um vértice do grafo
 * @author Samuel
 * @see	Arco
 */
public class Vertice {
	
	private Doador chave; /** Chave do vértice */
	private Arco arcoEmergente; 	/** Arco que sae desse vértice.
					 *
					 * Obs.: Não se usou uma lista de arcos pois, como se fará um emparelhamento,
					 * cada vértice poderá emergir dele apenas um arco - o que liga ao vértice contendo doador mais preferido atualmente
	 				 */ 
	
	/**
	 * Construtor padrão
	 */
	public Vertice() {
		chave = new Doador();
		arcoEmergente = new Arco(); 
	}
	
	/**
	 * Construtor parametrizado
	 * @param	chave	Chave (id) do vértice
	 */
	public Vertice(Doador chave){
		this.chave = chave;
		this.arcoEmergente = new Arco();
	}
	
	public Doador getChave() {
		return chave;
	} 
	
	public Arco getArcoEmergente(){
		return arcoEmergente;
	}
        
        public void setArcoEmergente(Arco arcoEmergente) {
            this.arcoEmergente = arcoEmergente;
        }
	
	@Override
	public String toString() {
		return "" + chave.toString();
	}
	
}
