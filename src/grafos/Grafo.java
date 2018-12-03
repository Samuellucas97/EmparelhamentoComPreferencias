package grafos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

import algoritmos.BuscaEmProfundidade;

/**
 * Representa um grafo por meio de uma lista de adjacência
 * @author  samuellucas97
 * @author  candinhojr
 * @since   13.11.2018
 */
public class Grafo {
    
	private ArrayList<Arco> arcosDoGrafo;
    private ArrayList<Vertice> vertices; 
    
    public Grafo() {
    	this.arcosDoGrafo = new ArrayList<Arco>();
    	this.vertices = new ArrayList<Vertice>();
    }
    
    public Grafo(ArrayList<Vertice> vertices) {
    	this.arcosDoGrafo = new ArrayList<Arco>();
    	this.vertices = new ArrayList<Vertice>();
        
        for(int i = 0; i < vertices.size(); i++) {         
            vertices.add(vertices.get(i));
        }
    }
    
    /**
     * Imprime os vértices do grafo 
     */
    public String toString() {
    	String r = "";
    	for (Vertice v : vertices) {
			r += v.toString() + " -> ";
			for (Arco arco : v.getArcosAdjacentes()) {
				Vertice vertice = arco.getVerticeDoFim();
				r+= vertice.toString() + ", ";
			}
			r += "\n";
		}
    	return r;
    } 
    
    /**
     * Imprime os vértices do grafo 
     */
    public void imprimeGrafo() {
    	System.out.println(this.toString());
    }
    
    public int getNumeroDeVertices() {
        return this.vertices.size();
    }
    
    public int getNumeroDeArestas() {
        return this.arcosDoGrafo.size();
    }
    
    public boolean adicionaArco(Arco arco) {
    	return this.arcosDoGrafo.add(arco);
	}
    
    public boolean adicionaVertice(Vertice vertice) {
    	return this.vertices.add(vertice);
	}
    
    public Vertice getVertice(int posicao) {
    	return vertices.get(posicao);
    }
    
}
