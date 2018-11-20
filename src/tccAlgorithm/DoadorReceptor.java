/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;
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
     * Construtor parametrizado
     * @param nomeReceptor Nome do receptor
     * @param nomeDoador    Nome do doador
     * @param tipoDeSangueReceptor  Tipo de sangue do receptor
     * @param tipoDeSangueDoador    Tipo de sangue do doador
     */
    public DoadorReceptor(String nomeReceptor, String nomeDoador, TiposDeSangue tipoDeSangueReceptor,
            TiposDeSangue tipoDeSangueDoador) {
        super(nomeDoador, tipoDeSangueDoador, new String());
        this.listaHLAReceptor = new String();
        this.listaDePreferencias = new ArrayList<Preferencia>();
        this.nomeReceptor = nomeReceptor;
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
    }
    
    public DoadorReceptor() {
        
    }
    
    public String getNomeReceptor() {
        return nomeReceptor;
    }

    public void setNomeReceptor(String nomeReceptor) {
        this.nomeReceptor = nomeReceptor;
    }

    public TiposDeSangue getTipoDeSangueReceptor() {
        return tipoDeSangueReceptor;
    }

    public void setTipoDeSangueReceptor(TiposDeSangue tipoDeSangueReceptor) {
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
    }

    public String getListaHLAReceptor() {
        return listaHLAReceptor;
    }

    public void setListaHLAReceptor( String listaHLAReceptor) {
        this.listaHLAReceptor = listaHLAReceptor;
    }
    
    public ArrayList<Preferencia> getListaDePreferencias(){
        return listaDePreferencias;
    }
    /**
     * 
     * @return maisPreferido
     * Retira da lista de preferências o mais preferido, após retornar o mesmo
     */
    public DoadorReceptor getMaisPreferido() {
        if(!listaDePreferencias.isEmpty()) {
            DoadorReceptor doador = listaDePreferencias.get(0).getDoador();
            listaDePreferencias.remove(0);
            return doador;
        }
        return null;
    }
    
}
