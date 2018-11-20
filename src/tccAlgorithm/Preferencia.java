/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;

/**
 * Representa uma preferência
 * @author  samuellucas97
 *          candinhojr
 * @since   06.11.2018
 */
public class Preferencia implements Comparable<Preferencia>{

    private DoadorReceptor doador;
    private int porcentagem;
    /**
     * 
     * @param doador        Nome do doador
     * @param porcentagem   Porcentagem de compatibilidade entre o doador e o receptor
     */
    public Preferencia(DoadorReceptor doador, int porcentagem){
        this.doador = doador;
        this.porcentagem = porcentagem;
    }
    
    public DoadorReceptor getDoador() {
        return doador;
    }

    public void setDoador(DoadorReceptor doador) {
        this.doador = doador;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    /**
     * Define a lei de comparação
     * @param   p   Preferência a ser comparada
     * @return -1 caso o objeto atual seja tenha preferência menor
     *          0 caso sejam iguais as prefêrencia
     *          1 caso contrário
     */
    public int compareTo( Preferencia p){
        if( this.porcentagem < p.getPorcentagem() ){
          return -1;
        }
        else if( this.porcentagem == p.getPorcentagem() ){
          return 0;
        }
        else{
          return 1;
        }
    }   
}
