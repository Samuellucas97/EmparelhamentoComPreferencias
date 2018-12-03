package algoritmos;

import java.util.ArrayList;

import controle.Conversor;
import grafos.Grafo;
import grafos.Vertice;

public class AlgoritmoTTC {

	private Grafo grafo;
	private BuscaEmProfundidade busca;
	private Conversor conversor;
	
	public AlgoritmoTTC( ) {	
		this.conversor = new Conversor();
		ArrayList<Vertice> vertices = this.conversor.getVertices();
		this.grafo = new Grafo(vertices);
		this.busca = new BuscaEmProfundidade(grafo);
		this.busca.buscaEmProfundidade();
	}
	
	public static void main(String[] args) {
		new AlgoritmoTTC();
	}
}
