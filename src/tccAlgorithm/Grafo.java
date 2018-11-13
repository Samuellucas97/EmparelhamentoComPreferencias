/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;

/**
 * Representa um grafo
 * @author  samuellucas97
 *          candinho
 * @since   13.11.2018
 */
public class Grafo {
    private int matriz[][];
    private int numParesDoadorReceptor;
    private int numRinsCadaveres;
    private Doador posicaoDoadorERinsCadaveres[];
    private DoadorReceptor posicaoDoadorReceptor[];    
    /**
     * Construtor parametrizado
     * @param numParesDoadorReceptor Número de pares doador-receptor
     * @param numRinsCadaveres Número de rins cadaveres
     */
    public Grafo(int numParesDoadorReceptor, int numRinsCadaveres) {
        // Refatorar: Adicionar leitura de arquivo
        this.numParesDoadorReceptor = numParesDoadorReceptor;
        this.numRinsCadaveres = numRinsCadaveres;
        this.matriz = new int[numParesDoadorReceptor + numRinsCadaveres][numParesDoadorReceptor + numRinsCadaveres];
        this.posicaoDoadorERinsCadaveres = new Doador[numParesDoadorReceptor + numRinsCadaveres];
        this.posicaoDoadorReceptor = new DoadorReceptor[numParesDoadorReceptor];
        
        for(int i = 0; i < this.numParesDoadorReceptor; i++) {
            for(int j = 0; j < this.numParesDoadorReceptor; j++) {
                this.matriz[i][j] = 0;
            }
            this.posicaoDoadorERinsCadaveres[i] = new Doador();
            this.posicaoDoadorReceptor[i] = new DoadorReceptor();
        }
    }
    
    public void imprimeGrafo() {
        System.out.print(" ");
        for (int i = 0; i < this.numParesDoadorReceptor; i++) {
            System.out.print(i +  " " );
        }
        System.out.println();
        for (int i = 0; i < this.numParesDoadorReceptor; i++) {
            System.out.print(i +  " " );
            for (int j = 0; j < this.numParesDoadorReceptor; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    } 

    public int numVertices() {
        return this.numParesDoadorReceptor;
    }
    
    public Grafo ttcChains() {
        // Passo 1: Cada paciente aponta para o melhor rim (vindo de um DoadorReceptor ou de um rimCadaver)
        for(int i = 0; i < this.numParesDoadorReceptor; i++) {
            for(int j = 0; j < this.numParesDoadorReceptor; j++) {
                
            }
        }
        return new Grafo(numParesDoadorReceptor, numRinsCadaveres);
    }

}
