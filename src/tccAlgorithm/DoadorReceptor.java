/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;
import java.util.ArrayList;
/**
 *
 * @author samuellucas97
 */
public class DoadorReceptor {
    
    private String nomeReceptor;
    private String nomeDoador;
    private TiposDeSangue tipoDeSangueReceptor;
    private TiposDeSangue tipoDeSangueDoador;
    private ArrayList<String> listaHLADoador;
    private ArrayList<String> listaHLAReceptor;
    private ArrayList<String> listaDePreferencias;

    public DoadorReceptor(String nomeReceptor, String nomeDoador, TiposDeSangue tipoDeSangueReceptor, TiposDeSangue tipoDeSangueDoador) {
        this.listaHLADoador = new ArrayList<String>();
        this.listaHLAReceptor = new ArrayList<String>();
        this.listaDePreferencias = new ArrayList<String>();
        
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

    public ArrayList<String> getListaHLADoador() {
        return listaHLADoador;
    }

    public void setListaHLADoador(ArrayList<String> listaHLADoador) {
        this.listaHLADoador = listaHLADoador;
    }

    public ArrayList<String> getListaHLAReceptor() {
        return listaHLAReceptor;
    }

    public void setListaHLAReceptor(ArrayList<String> listaHLAReceptor) {
        this.listaHLAReceptor = listaHLAReceptor;
    }
    
    public ArrayList<String> listaDePreferencias(){
        return listaDePreferencias;
    }
    
}
