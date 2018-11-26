/**
 * Representa um vértice do grafo
 * @author Samuel
 * @see	Arco
 */
public class Vertice {
	
	private Doador chave; /** Chave do vértice */
	
	private Arco arcoEmergente; /** Arco que sae desse vértice.
	 
	 				Obs.: Não se usou uma lista de arcos pois, como se fará um emparelhamento,
	 cada vértice poderá emergir dele apenas um arco - o que liga ao vértice contendo doador mais preferido atualmente
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
	 * @param	arcoEmergente	Arco que emerge desse vértice
	 */
	public Vertice(Doador chave, Arco arcoEmergente){
		this.chave = chave;
		this.arcoEmergente = arcoEmergente;
	}
	
	public Doador getChave() {
		return chave;
	} 
	
	public Arco getArcoEmergente(){
		return arcoEmergente;
	}
	
	@Override
	public String toString() {
		return "" + chave.toString();
	}
	
}
