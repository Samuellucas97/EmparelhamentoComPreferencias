package grafos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

import controle.Controlador;
import paciente.DoadorReceptor;
import paciente.Doador;

/**
 * Representa um grafo
 * @author  samuellucas97
 *          candinhojr
 * @since   13.11.2018
 */
public class Grafo {
    
	private ArrayList<Arco> arcosDoGrafo;
    private ArrayList<Vertice> listaDeAdjacencia; 
    private Controlador owner;
    private int numParesDoadorReceptor;
    
    //private Doador posicaoDoadorERinsCadaveres[];
    //private DoadorReceptor posicaoDoadorReceptor[]; 
    
    public Grafo() {
        owner = new Controlador();
        /// String nome dos arquivo contendo os dados dos doadores cadáver e dos doadores vivos   
    	// Refatorar: Adicionar leitura de arquivo
        ArrayList<DoadorReceptor> paresDoadoresReceptores = owner.getParesDoadoresReceptores();
        ArrayList<Doador> doadoresCadaveres = owner.getDoadoresCadaveres();
        int tamanho = paresDoadoresReceptores.size() + doadoresCadaveres.size();
        
        owner.defineListaDePreferenciasDoReceptor();
        
        listaDeAdjacencia = new ArrayList<Vertice>();
        
        for(int i = 0; i < paresDoadoresReceptores.size(); i++) {         
            listaDeAdjacencia.add(new Vertice(paresDoadoresReceptores.get(i)));
        }
        
        for(int i = 0; i < doadoresCadaveres.size(); i++) {
            listaDeAdjacencia.add(new Vertice(doadoresCadaveres.get(i)));
        }
    }
    
    /**
     * Imprime os vértices do grafo 
     */
    public void imprimeGrafo() {
        
        System.out.print(" ");
        for (int i = 0; i < this.numParesDoadorReceptor; i++) {
            System.out.print(i +  " " );
        }
        System.out.println();
        for (int i = 0; i < this.numParesDoadorReceptor; i++) {
            System.out.print(i +  " " );
            for (int j = 0; j < this.numParesDoadorReceptor; j++) {
                System.out.print(this.listaDeAdjacencia.get(i).toString() + " ");
            }
            System.out.println();
        }
    } 
    /**
     * Usa-se o número de pares doadores-receptor com os doadores cadáveres para quantidade de vértices do grafo
     * @return Quantidade de vértices do grafo 
     */
    public int numVertices() {
        return this.numParesDoadorReceptor;
    }
    
//    public Grafo ttcChains() {
        
  //  	int j = 0;
  //      boolean encontrado = false;
        
        
        
        /** Passo 1: 
         * Cada paciente aponta para o melhor rim (vindo de um DoadorReceptor ou de um rimCadaver) 
         */
    //    for(int i = 0; i < this.listaDeAdjacencia.size(); i++) {
   //         j = 0;
   //         encontrado = false;
            
            
            
            
            // Enquanto o mais preferido doador do paciente não for encontrado, ou j < tamanho do array ele continua
    //        while (encontrado || j < this.numParesDoadorReceptor || j < lista.get(i).size() ) {
                // Percorre o vetor do paciente a procura do doador mais preferido, e caso ele encontre, ele seta o ponteiro na matriz
    //            if (this.posicaoDoadorReceptor[i].getMaisPreferido().getNomeDoador().equals( this.posicaoDoadorERinsCadaveres[i].getNomeDoador()) ) {
     //               this.lista.get(i).add( ); 
     //               encontrado = true;
     //           }
     //           j++;
     //       }
     //   }
//        return new Grafo(numParesDoadorReceptor, numRinsCadaveres);
//    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.imprimeGrafo();
    }
}
