package grafos;

import java.util.ArrayList;

/**
 * Representa um ciclo
* @author  samuellucas97
 *         candinhojr
 *@since   16.11.2018
 */
public class Ciclo {
	private ArrayList<Arco> arcos;

	public Ciclo( ) {
		this.arcos = new ArrayList<Arco>();
	}
	
	public Ciclo(ArrayList<Arco> arcos) {
		this.arcos = arcos;
	}
	
	public ArrayList<Arco> getArcos() {
		return this.arcos;
	}
}
