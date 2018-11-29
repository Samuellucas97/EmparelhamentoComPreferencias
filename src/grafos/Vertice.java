package grafos;

import java.util.ArrayList;

import paciente.DoadorReceptor;

/**
 * Representa um vértice do grafo
* @author  samuellucas97
 *          candinhojr
 * @see	Arco
 */
public class Vertice {
	
	/// ATRIBUTOS
	
	private DoadorReceptor chave; //-> Chave do vértice 
	private ArrayList<Arco> arcosAdjacentes; // -> Arco que sae desse vértice

	/**
	 * Obs.: Não se usou uma lista de arcos adjacentes pois, como se fará um emparelhamento,
	 * cada vértice poderá emergir dele apenas um arco - o que liga ao vértice contendo doador 
	 * mais preferido atualmente.
	 */ 

	/// CONSTRUTORES
	
	/**
	 * Construtor padrão
	 */
	public Vertice() {
		this.chave = new DoadorReceptor();
		this.arcosAdjacentes = new ArrayList<Arco>();
	}
	
	/**
	 * Construtor parametrizado
	 * @param	chave	Chave (id) do vértice
	 */
	public Vertice(DoadorReceptor chave){
		this.chave = chave;
		this.arcosAdjacentes = new ArrayList<Arco>();
	}
	
	/// MÉTODOS
	
	public DoadorReceptor getChave() {
		return chave;
	} 
	
	public ArrayList<Arco> getArcosAdjacentes(){
		return arcosAdjacentes;
	}
        
    public void adicionarArcoAdjacente(Arco arcosAdjacente) {
        this.arcosAdjacentes.add(arcosAdjacente);
    }
	
    /// SOBRECARGA    
        
	@Override
	public String toString() {
		return "" + chave.toString();
	}
	
}
