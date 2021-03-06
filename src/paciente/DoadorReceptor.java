package paciente;

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
    
	/// ATRIBUTOS
	
    private String nomeReceptor; //-> Nome do receptor 
    private TiposDeSangue tipoDeSangueReceptor; //-> Tipo de sangue do receptor
    private String listaHLAReceptor; // -> Lista de HLA do receptor
    private ArrayList<Preferencia> listaDePreferencias; //-> Lista de preferências do do receptor do par doador-receptor
    
    /// CONSTRUTORES
        
    /**
     * Construtor padrão
     */
    public DoadorReceptor() {

        super("DoadorDesconhecido", TiposDeSangue.O_negativo, "BBBBABAABB");

        this.nomeReceptor = new String("ReceptorDesconhecido");
        this.tipoDeSangueReceptor = TiposDeSangue.O_negativo;
        this.listaHLAReceptor = "BBBBABAABB";
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
        
        super( "DoadorDesconhecido", false,tipoDeSangueDoador, "BBBBABAABB" );
        
        this.nomeReceptor = nomeReceptor;
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
        this.listaHLAReceptor = listaHLAReceptor;
        this.listaDePreferencias = new ArrayList<Preferencia>();
        
    }
    
    /// GETTERS E SETTERS 
    
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
    
    //// OUTROS MÉTODOS
    
    /**
     * Envia da o doador mais preferido qusca na lista Retira da lista de preferências o 
     * mais preferido, após retornar o mesmo
     * @return O doador mais Preferido
     */
    public DoadorReceptor getMaisPreferido() throws NullPointerException{
        
        if(!listaDePreferencias.isEmpty()) {
        	DoadorReceptor doadorReceptor = listaDePreferencias.get(0).getDoador();
            listaDePreferencias.remove(0);
            return doadorReceptor;
        }
        return null;
    }

    /// SOBRECARGA
    
    @Override
    public String toString(){
        return "{(D/R) " + nomeDoador + "/" + nomeReceptor + "; " + tipoDeSangueDoador.getDescricao() + "/" + tipoDeSangueReceptor.getDescricao() +
        		"; " + listaHLADoador + "/" + listaHLAReceptor + "}\n";
    }    
}
