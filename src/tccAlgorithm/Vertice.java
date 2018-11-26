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
	
	public Vertice() {
		chave = new DoadorReceptor();
		arcosEmergentes = new LinkedList<Arco>(); 
	}
	
	public Doador getChave() {
		return chave;
	} 
	
	public Arco getArcoEmergente(){
		return arcosEmergentes;
	}
	
	@Override
	public String toString() {
		return "" + chave.toString();
	}
	
}
