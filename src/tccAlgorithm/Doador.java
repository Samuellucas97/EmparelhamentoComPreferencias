package tccAlgorithm;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa um doador vivo ou um rim de um doador cadáver
 * @author  samuellucas97
 *          candinhojr
 * @since   13.11.2018
 */
public class Doador {
    
    protected String nomeDoador;
    protected boolean ehDoadorCadaver;
    protected TiposDeSangue tipoDeSangueDoador;
    protected String listaHLADoador;

    /**
     * Construtor padrão
     */
    public Doador() {
    	nomeDoador = new String();
    	ehDoadorCadaver = true;
    	tipoDeSangueDoador =  TiposDeSangue.O_negativo;
    	listaHLADoador = new String();
    	
    }
    
    /**
     * Construtor parametrizado
     * @param nomeDoador Nome do doador
     * @param ehDoadorCadaver Tipo de doador: cadáver ou vivo 
     * @param tipoDeSangueDoador Tipo de sangue do doador
     * @param listaHLADoador Lista de HLA do doador
     */
    public Doador(  String nomeDoador,
                    boolean ehDoadorCadaver, 
                    TiposDeSangue tipoDeSangueDoador, 
                    String listaHLADoador) {
        this.nomeDoador = nomeDoador;
        this.ehDoadorCadaver = ehDoadorCadaver;
        this.tipoDeSangueDoador = tipoDeSangueDoador;
        this.listaHLADoador = listaHLADoador;
    }
    
    /**
     * Construtor parametrizado
     * @param nomeDoador Nome do doador
     * @param tipoDeSangueDoador Tipo de sangue do doador
     * @param listaHLADoador Lista de HLA do doador
     */
    public Doador(  String nomeDoador,
                    TiposDeSangue tipoDeSangueDoador, 
                    String listaHLADoador) {
        this.nomeDoador = nomeDoador;
        this.ehDoadorCadaver = true;
        this.tipoDeSangueDoador = tipoDeSangueDoador;
        this.listaHLADoador = listaHLADoador;
    }
    

    public String getNomeDoador() {
        return nomeDoador;
    }
    
    public boolean getEhDoadorCadaver(){
    	return ehDoadorCadaver;
    }
    
    public TiposDeSangue getTipoDeSangueDoador() {
        return tipoDeSangueDoador;
    }

    public String getListaHLADoador() {
        return listaHLADoador;
    }

    @Override
    public String toString(){
        return "" + nomeDoador + " " + tipoDeSangueDoador + " " + listaHLADoador;
    }

}
