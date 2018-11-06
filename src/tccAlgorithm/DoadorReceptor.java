/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccalgorithm;
import tccalgorithm.TiposDeSangue;
import tccalgorithm.Preferencia;
import java.util.ArrayList;
/**
 * Representa um par doador-receptor
 * @author samuellucas97
 *          candinho
 */
public class DoadorReceptor {
    
    private String nomeReceptor;
    private String nomeDoador;
    private TiposDeSangue tipoDeSangueReceptor;
    private TiposDeSangue tipoDeSangueDoador;
    private String listaHLADoador;
    private String listaHLAReceptor;
    private ArrayList<Preferencia> listaDePreferencias;
    /**
     * Construtor parametrizado
     * @param nomeReceptor Nome do receptor
     * @param nomeDoador    Nome do doador
     * @param tipoDeSangueReceptor  Tipo de sangue do receptor
     * @param tipoDeSangueDoador    Tipo de sangue do doador
     */
    public DoadorReceptor(String nomeReceptor, String nomeDoador, TiposDeSangue tipoDeSangueReceptor, TiposDeSangue tipoDeSangueDoador) {
        this.listaHLADoador = new String();
        this.listaHLAReceptor = new String();
        this.listaDePreferencias = new ArrayList<Preferencia>();
        
        this.nomeReceptor = nomeReceptor;
        this.nomeDoador = nomeDoador;
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
        this.tipoDeSangueDoador = tipoDeSangueDoador;
    }
    
    public String getNomeReceptor() {
        return nomeReceptor;
    }

    public void setNomeReceptor(String nomeReceptor) {
        this.nomeReceptor = nomeReceptor;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public TiposDeSangue getTipoDeSangueReceptor() {
        return tipoDeSangueReceptor;
    }

    public void setTipoDeSangueReceptor(TiposDeSangue tipoDeSangueReceptor) {
        this.tipoDeSangueReceptor = tipoDeSangueReceptor;
    }

    public TiposDeSangue getTipoDeSangueDoador() {
        return tipoDeSangueDoador;
    }

    public void setTipoDeSangueDoador(TiposDeSangue tipoDeSangueDoador) {
        this.tipoDeSangueDoador = tipoDeSangueDoador;
    }

    public String getListaHLADoador() {
        return listaHLADoador;
    }

    public void setListaHLADoador(String listaHLADoador) {
        this.listaHLADoador = listaHLADoador;
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
    
}
