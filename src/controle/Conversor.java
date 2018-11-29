package controle;

import java.util.ArrayList;

import grafos.Vertice;
import paciente.DoadorReceptor;

/**
 * Converte um par de Doador/Receptor para um vertice
 * @author  samuellucas97
 * @author  candinhojr
 *
 */
public class Conversor {
	
	private ControladorDeMedico controlador;
	private ArrayList<DoadorReceptor> paresDoadoresReceptores;
	private ArrayList<Vertice> vertices;
	
	/**
	 * Construtor padrão
	 */
	public Conversor() {
	    this.controlador = new ControladorDeMedico();
	    this.paresDoadoresReceptores = controlador.getParesDoadoresReceptores();
	    this.vertices = new ArrayList<Vertice>();
	    
	    for(int i = 0; i < paresDoadoresReceptores.size(); i++) {   
            vertices.add(new Vertice(i, paresDoadoresReceptores.get(i)));
        }
	}   
	
	public ArrayList<DoadorReceptor> getParesDoadoresReceptores() {
		return this.paresDoadoresReceptores;
	}
	
	public ArrayList<Vertice> getVertices() {
		return this.vertices;
	}
	
	public static void main(String[] args) {
		Conversor c = new Conversor();
		System.out.println(c.getParesDoadoresReceptores());
		System.err.println(c.getVertices());
	}
}
