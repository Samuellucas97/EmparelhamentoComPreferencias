/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccAlgorithm;

/**
 *
 * @author samuellucas97
 */
public class Compatibilidade {
	
     public boolean compatibilidadeSanguinea(DoadorReceptor doador, DoadorReceptor receptor){
    	if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.A_positivo) {
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
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.A_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.B_positivo) {
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
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.B_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.AB_positivo) {
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
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.AB_negativo) {
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
		} else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.O_positivo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) {
    			return true;
    		} else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		}  else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.O_negativo) {
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) {
    			return true;
    		} else {
    			return false;
    		}
		} else
        return false;
    }
     
     public boolean compatibilidadeHLA(DoadorReceptor doador, DoadorReceptor receptor) {
    	// TODO: Fazer o método de comparação para o HLA do receptor e doador
    	return false;
     }
}
