package tccAlgorithm;

import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Representa uma compatibilidade
 * @author samuellucas97
 *         candinhojr
 * @since   01.11.2018
 */
public class Compatibilidade {
    
    /**
     * Calcula a compatibilidade em relação ao tipo de sangue do doador e receptor
     * @param doador    Doador
     * @param receptor  Receptor
     * @return true caso seja compatível senão false
     */    
    public static boolean compatibilidadeSanguinea(Doador doador, DoadorReceptor receptor){
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
            return true;
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
    
    /**
     * Verifica a porcentagem de compatibilidade entre o doador cadáver e o paciente
     * @param doador   Doador cadáver
     * @param receptor Receptor
     */
    public static int compatibilidadeHLA(Doador doador, DoadorReceptor receptor) { 
        int quantidadeProteinasIguais = 0;
        System.out.println("FORA - HLA DOADOR:   "+doador.getListaHLADoador());
        System.out.println("FORA - HLA RECEPTOR: "+receptor.getListaHLAReceptor());
    	for(int i = 0; i < doador.getListaHLADoador().length(); i++){
    		System.out.println("DENTRO - INDICE: " + i + " - " +
    				doador.getListaHLADoador().charAt(i) + " e " + receptor.getListaHLAReceptor().charAt(i) +
    				", são iguais? "+(doador.getListaHLADoador().charAt(i) == receptor.getListaHLAReceptor().charAt(i) ));
            if (doador.getListaHLADoador().charAt(i) == receptor.getListaHLAReceptor().charAt(i) ){
                quantidadeProteinasIguais+=10;
            }
    	} 
    	return quantidadeProteinasIguais;
    }

//    public static int compatibilidadeHLA(Doador doador, DoadorReceptor receptor) {   
//    	return 100-(-10*doador.getListaHLADoador().compareTo(receptor.getListaHLAReceptor()));
//    }
    public static long teste(Doador doador, DoadorReceptor receptor) {
    	List<String> lista2 = Arrays.asList(receptor.getListaHLAReceptor().split(""));
    	return 10*Arrays.asList(doador.getListaHLADoador().split("")).stream().filter(lista2::contains).count();
    }
    
//    public static void main(String[] args) {
//        Compatibilidade compatibilidade = new Compatibilidade();
//        Doador a = new Doador(" ", TiposDeSangue.A_negativo, "ABABABABAB");
//        DoadorReceptor b = new DoadorReceptor(" ", TiposDeSangue.A_positivo, " ", "", TiposDeSangue.A_positivo, "ABABABABAB");
//        System.out.println(compatibilidade.compatibilidadeHLA(a, b));
//        System.out.println("Doador:   "+ a.getListaHLADoador());
//        System.out.println("Receptor: "+ b.getListaHLAReceptor());
//        System.out.println(teste(a,b));
//    }
} 
