/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author samuellucas97
 */
public class CompatibilidadeSanguinea {
	
     public boolean compatibilidadeSanguinea(PacienteDoador receptor, PacienteDoador doador){
    	if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.A_positivo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.A_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.B_positivo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.B_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.AB_positivo) {
			if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.AB_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.AB_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
			/**
			 * Já que o receptor com sangue tipo AB+ pode receber de todos os outros
			 * Assim, não precisaria das condições, e sim apenas um 
			 * return true;
			 * */  
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.AB_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.AB_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.O_positivo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		}  else if (receptor.getTipoDeSanguePaciente() == TiposDeSangue.O_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else
        return false;
    }
}
