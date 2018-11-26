/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 * Representa um par doador-receptor
 * @author samuellucas97
 *         candinhojr
 */
public class DoadorReceptor extends Doador{
    
    private String nomeReceptor;
    private TiposDeSangue tipoDeSangueReceptor;
    private String listaHLAReceptor;
    private ArrayList<Preferencia> listaDePreferencias;
    
    /**
     * Construtor padrão
     */
    public DoadorReceptor() {

        super();

        this.nomeReceptor = new String();
        this.tipoDeSangueReceptor = TiposDeSangue.O_negativo;
        this.listaHLAReceptor = new String();
        this.listaDePreferencias = new ArrayList<Preferencia>();
        
    }
    
    /**
     * Construtor parametrizado
     * @param nomeReceptor Nome do receptor
     * @param nomeDoador    Nome do doador
     * @param tipoDeSangueReceptor  Tipo de sangue do receptor
     * @param tipoDeSangueDoador    Tipo de sangue do doador
     */
    public DoadorReceptor( 
                            String nomeDoador,
                            TiposDeSangue tipoDeSangueDoador,
                            String listaHLADoador,
                            String nomeReceptor, 
                            TiposDeSangue tipoDeSangueReceptor,
                            String listaHLAReceptor) {
        
        super( nomeDoador, false,tipoDeSangueDoador, listaHLADoador );
        
        this.nomeReceptor = nomeReceptor;
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
        this.listaHLAReceptor = listaHLAReceptor;
        this.listaDePreferencias = new ArrayList<Preferencia>();
        
    }
    
    public String getNomeReceptor() {
        return nomeReceptor;
    }

    public TiposDeSangue getTipoDeSangueReceptor() {
        return tipoDeSangueReceptor;
    }

    public String getListaHLAReceptor() {
        return listaHLAReceptor;
    }
    
    public ArrayList<Preferencia> getListaDePreferencias(){
        return listaDePreferencias;
    }
    /**
     * Envia da o doador mais preferido qusca na lista Retira da lista de preferências o 
     * mais preferido, após retornar o mesmo
     * @return O doador mais Preferido
     */
    public Doador getMaisPreferido() throws NullPointerException{
        if(!listaDePreferencias.isEmpty()) {
            DoadorReceptor doador = listaDePreferencias.get(0).getDoador();
            listaDePreferencias.remove(0);
            return doador;
        }
        return null;
    }

    @Override
    public String toString(){
        return super.toString() + " " + nomeReceptor + " " + tipoDeSangueReceptor + " " + listaHLAReceptor;
    }    
}
