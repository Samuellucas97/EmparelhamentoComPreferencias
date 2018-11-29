package paciente;

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
     * @return {@code true} caso seja compatível senão {@code false}
     */    
    public static boolean compatibilidadeSanguinea(Doador doador, DoadorReceptor receptor){
    	
    	if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.A_positivo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_positivo) 
                    return true;
            
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) 
                    return true;
            
            
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) 
                    return true;
             
            
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            
            else 
                    return false;
            
    	} 
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.A_negativo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) 
                    return true;

            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            
            else 
                 return false;
            
        } 
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.B_positivo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_positivo) 
                    return true;
            
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) 
                    return true;
    		
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) 
                    return true;
    		
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
    		
             else 
                    return false;
            
        } 
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.B_negativo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) 
                    return true;
    		
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            
            else 
                    return false;
            
        } 
    	
    	/// NOTE QUE O TIPO SANGUÍNEO "AB" POSITIVO PODE RECEBER DE TODOS OS TIPOS POR ISSO, SEMPRE RETORNARÁ TRUE NESSE CASO.
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.AB_positivo) {  
            return true;
        } 
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.AB_negativo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.A_negativo) 
                    return true;
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.B_negativo) 
                    return true;
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.AB_negativo) 
                    return true;
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            else 
                    return false;
            
        }
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.O_positivo) {
            
    		if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_positivo) 
                    return true;
            
            else if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            
            else 
                    return false;
            
        }  
    	
    	else if (receptor.getTipoDeSangueReceptor() == TiposDeSangue.O_negativo) {
            if (doador.getTipoDeSangueDoador() == TiposDeSangue.O_negativo) 
                    return true;
            else 
                    return false;
            
        } 
    	
    	else
    		return false;
    }
    
    /**
     * Verifica a porcentagem de compatibilidade de HLA entre o doador cadáver e o paciente
     * @param doador   Doador cadáver
     * @param receptor Receptor
     */
    public static int compatibilidadeHLA(Doador doador, DoadorReceptor receptor) {
        return 100-10*doador.getListaHLADoador().compareTo(receptor.getListaHLAReceptor());
    
    } 
}
