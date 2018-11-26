/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 * Representa um grafo
 * @author  samuellucas97
 *          candinhojr
 * @since   13.11.2018
 */
public class Grafo {
    
    private ArrayList<Vertice> listaDeAdjacencia; 
    
    private int numParesDoadorReceptor; /** Número de pares doadores-receptores */
    private int numRinsCadaveres; /** Número de rins de pacientes cadáveres */
    
    //private Doador posicaoDoadorERinsCadaveres[];
    //private DoadorReceptor posicaoDoadorReceptor[]; 
    
    /**
     * Construtor parametrizado
     * @param numParesDoadorReceptor Número de pares doador-receptor
     * @param numRinsCadaveres Número de rins cadaveres
     */
    public Grafo(int numParesDoadorReceptor, int numRinsCadaveres) {
                 /// String nome dos arquivo contendo os dados dos doadores cadáver e dos doadores vivos   
    	// Refatorar: Adicionar leitura de arquivo
        int tamanho = numParesDoadorReceptor + numRinsCadaveres;
        
        listaDeAdjacencia = new ArrayList<Vertice>();
        this.numParesDoadorReceptor = numParesDoadorReceptor;
        this.numRinsCadaveres = numRinsCadaveres;
        
        //this.lista = new ArrayList<LinkedList<DoadorReceptor>>( );
        //this.posicaoDoadorERinsCadaveres = new Doador[tamanho];
        //this.posicaoDoadorReceptor = new DoadorReceptor[numParesDoadorReceptor];
        
        for(int i = 0; i < tamanho; i++) {
        	listaDeAdjacencia.add(new Vertice() );
       //     this.posicaoDoadorERinsCadaveres[i] = new Doador();
       //   this.posicaoDoadorReceptor[i] = new DoadorReceptor();
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
    
    public Grafo ttcChains() {
        
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
        return new Grafo(numParesDoadorReceptor, numRinsCadaveres);
    }

}
