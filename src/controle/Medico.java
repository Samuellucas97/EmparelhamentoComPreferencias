package controle;

import java.util.ArrayList;
import java.util.Collections;

/// CLASSES PRÓPRIAS
import paciente.DoadorReceptor;
import paciente.Doador;
import paciente.Compatibilidade;
import paciente.Preferencia;

/**
 * Representa um médico
 * @author  samuellucas97
 *          candinhojr
 * @since   01.11.2018
 * @see     DoadorReceptor
 * @see     Doador
 */
public class Medico {
	    
    /**
     * Construtor padrão
     */
    public Medico() { }
        
    /**
     * Cria e ordena a lista de preferências do receptor
     * @param   receptor  Receptor a receber o rim doado 
     * @param   doadoresVivos   Doador vivo
     * @param   doadoresCadaveres Doador cadáver 
     */
    public static void defineListaDePreferenciasDoReceptor(DoadorReceptor receptor, 
                                            ArrayList<DoadorReceptor> doadoresVivos) {
            
        for( DoadorReceptor doador : doadoresVivos ){  /// ADICIONANDO AS PREFERÊNCIAS DO RECEPTOR DO PAR DOADOR-RECEPTOR OS CANDIDATOS VIVOS A TRANSPLANTE 
            if (Compatibilidade.compatibilidadeSanguinea(doador, receptor)) { /// Verificando compatibilidade sanguínea entre os candidatos a doadores 
                int taxaDeCompatibilidade = Compatibilidade.compatibilidadeHLA(doador, receptor);
                
                if (taxaDeCompatibilidade > 70) {  /// Condição de taxa de compatibilidade convencionada para ser compatível 
                    receptor.getListaDePreferencias().add(new Preferencia(doador, taxaDeCompatibilidade)); 
               }
            }
        Collections.sort( receptor.getListaDePreferencias(), Collections.reverseOrder() ); /// ORDENANDO A LISTA DE PREFERÊNCIAS
        }
    }
}
