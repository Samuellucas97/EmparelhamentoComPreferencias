/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author samuellucas97
 */
public class PacienteDoador {
    
    private String nomePaciente;
    private String nomeDoador;
    private tiposDeSangue tipoDeSanguePaciente;
    private tiposDeSangue tipoDeSangueDoador;
    private ArrayList<String> listaHLADoador;
    private ArrayList<String> listaHLAReceptor;
    private ArrayList<String> listaDePreferencias;

    public PacienteDoador(String nomePaciente, String nomeDoador, tiposDeSangue tipoDeSanguePaciente, tiposDeSangue tipoDeSangueDoador) {
        this.listaHLADoador = new ArrayList<String>();
        this.listaHLAReceptor = new ArrayList<String>();
        this.listaDePreferencias = new ArrayList<String>();
        
        this.nomePaciente = nomePaciente;
        this.nomeDoador = nomeDoador;
        this.tipoDeSanguePaciente = tipoDeSanguePaciente;
        this.tipoDeSangueDoador = tipoDeSangueDoador;
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public tiposDeSangue getTipoDeSanguePaciente() {
        return tipoDeSanguePaciente;
    }

    public void setTipoDeSanguePaciente(tiposDeSangue tipoDeSanguePaciente) {
        this.tipoDeSanguePaciente = tipoDeSanguePaciente;
    }

    public tiposDeSangue getTipoDeSangueDoador() {
        return tipoDeSangueDoador;
    }

    public void setTipoDeSangueDoador(tiposDeSangue tipoDeSangueDoador) {
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
