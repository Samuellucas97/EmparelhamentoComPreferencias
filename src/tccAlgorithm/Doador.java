/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;

/**
 * Representa um doador ou um rimCadaver
 * @author  samuellucas97
 *          candinho
 * @since   13.11.2018
 */
public class Doador {
    
    protected String nomeDoador;
    protected TiposDeSangue tipoDeSangueDoador;
    protected String listaHLADoador;

    /**
     * 
     * @param nomeDoador Nome do doador
     * @param tipoDeSangueDoador Tipo de sangue do doador
     * @param listaHLADoador Lista de HLA do doador
     */
    public Doador(String nomeDoador, TiposDeSangue tipoDeSangueDoador, String listaHLADoador) {
        this.nomeDoador = nomeDoador;
        this.tipoDeSangueDoador = tipoDeSangueDoador;
        this.listaHLADoador = listaHLADoador;
    }
    
    public Doador() {
        
    }
    
    public String getNomeDoador() {
        return nomeDoador;
    }
    
    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
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
}
