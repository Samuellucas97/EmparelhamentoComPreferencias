package paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa uma preferência
 * @author  samuellucas97
 *          candinhojr
 * @since   06.11.2018
 */
public class Preferencia implements Comparable<Preferencia>{

    private Doador doador; //-> Doador 
    private int porcentagem; //-> Porcentagem de preferência
    
    /// CONSTRUTOR
    
    /**
     * Construtor parametrizado
     * @param doador        Nome do doador
     * @param porcentagem   Porcentagem de compatibilidade entre o doador e o receptor
     */
    public Preferencia(Doador doador, int porcentagem){
        this.doador = doador;
        this.porcentagem = porcentagem;
    }
    
    /// GETTERS E SETTERS
    
    public Doador getDoador() {
        return doador;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    /// OUTROS MÉTODOS	
    
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
    
    /// SOBRECARGA
    
    @Override
    public String toString(){
        return doador.toString() + " " + porcentagem;
    }
}
