package grafos;

import java.awt.List;
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
	private int chave; //-> Chave do vértice 
	private DoadorReceptor conteudo; //-> Conteúdo do vértice 
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
	public Vertice(int chave) {
		this.chave = chave;
		this.conteudo = new DoadorReceptor();
		this.arcosAdjacentes = new ArrayList<Arco>();
	}
	
	/**
	 * Construtor parametrizado
	 * @param	chave	Chave (id) do vértice
	 */
	public Vertice(int chave, DoadorReceptor conteudo){
		this.chave = chave;
		this.conteudo = conteudo;
		this.arcosAdjacentes = new ArrayList<Arco>();
	}
	
	/// MÉTODOS
	public int getChave() {
		return chave;
	}
	public DoadorReceptor getConteudo() {
		return conteudo;
	} 
	
	public java.util.List<Arco> getArcosAdjacentes(){
		return arcosAdjacentes;
	}
        
    public void adicionarArcoAdjacente(Arco arcosAdjacente) {
        this.arcosAdjacentes.add(arcosAdjacente);
    }
	
    /// SOBRECARGA    
        
	@Override
	public String toString() {
		return "" + "(" + chave + ")" + " " + conteudo.toString();
	}
	
}
