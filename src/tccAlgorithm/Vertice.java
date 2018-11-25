import java.util.LinkedList;;

/**
 * Representa um vértice do grafo
 * @author Samuel
 * @see	Arco
 */
public class Vertice {
	
	private DoadorReceptor chave; /** Chave do vértice */
	private LinkedList<Arco> arcosEmergentes; /** Lista de arcos que saem desse vértices */ 
	
	public Vertice() {
		chave = new DoadorReceptor();
		arcosEmergentes = new LinkedList<Arco>(); 
	}
	
	public Doador getChave() {
		return chave;
	} 
	
	public LinkedList<Arco> getListaDeAdjacencia(){
		return arcosEmergentes;
	}
	
	@Override
	public String toString() {
		return "" + chave;
	}
	
}
