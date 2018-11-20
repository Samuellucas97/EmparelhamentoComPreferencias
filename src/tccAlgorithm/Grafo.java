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
    private ArrayList<ArrayList<Integer>> lista;
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
        int tamanho = numParesDoadorReceptor + numRinsCadaveres;
        
        this.numParesDoadorReceptor = numParesDoadorReceptor;
        this.numRinsCadaveres = numRinsCadaveres;
        this.lista = new ArrayList<ArrayList<Integer>>(tamanho);
        this.posicaoDoadorERinsCadaveres = new Doador[tamanho];
        this.posicaoDoadorReceptor = new DoadorReceptor[numParesDoadorReceptor];
        
        for(int i = 0; i < tamanho; i++) {
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
                System.out.print(this.lista.get(i).get(j) + " ");
            }
            System.out.println();
        }
    } 

    public int numVertices() {
        return this.numParesDoadorReceptor;
    }
    
    public Grafo ttcChains() {
        int j = 0;
        boolean encontrado = false;
        // Passo 1: Cada paciente aponta para o melhor rim (vindo de um DoadorReceptor ou de um rimCadaver)
        for(int i = 0; i < this.lista.size(); i++) {
            j = 0;
            encontrado = false;
            // Enquanto o mais preferido doador do paciente não for encontrado, ou j < tamanho do array ele continua
            while (encontrado || j < this.numParesDoadorReceptor || j < lista.get(i).size() ) {
                // Percorre o vetor do paciente a procura do doador mais preferido, e caso ele encontre, ele seta o ponteiro na matriz
                if (this.posicaoDoadorReceptor[i].getMaisPreferido().getNomeDoador().equals( this.posicaoDoadorERinsCadaveres[i].getNomeDoador()) ) {
                    this.lista.get(i).add(j); 
                    encontrado = true;
                }
                j++;
            }
        }
        return new Grafo(numParesDoadorReceptor, numRinsCadaveres);
    }

}
