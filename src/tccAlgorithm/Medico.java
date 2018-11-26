import java.util.ArrayList;
import java.util.Collections;
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
                                            ArrayList<DoadorReceptor> doadoresVivos,
                                            ArrayList<Doador> doadoresCadaveres ) {
            
        for( DoadorReceptor doador : doadoresVivos ){  /// ADICIONANDO AS PREFERÊNCIAS DO RECEPTOR DO PAR DOADOR-RECEPTOR OS CANDIDATOS VIVOS A TRANSPLANTE 
            if (Compatibilidade.compatibilidadeSanguinea(doador, receptor)) { /// Verificando compatibilidade sanguínea entre os candidatos a doadores 
                int taxaDeCompatibilidade = Compatibilidade.compatibilidadeHLA(doador, receptor);

                if (taxaDeCompatibilidade > 70) {  /// Condição de taxa de compatibilidade convencionada para ser compatível 
                    receptor.getListaDePreferencias().add(new Preferencia(doador, taxaDeCompatibilidade)); 
               }
            }
        }
        
        for( Doador doador : doadoresCadaveres ){    /// ADICIONANDO AS PREFERÊNCIAS DO RECEPTOR DO PAR DOADOR-RECEPTOR OS CANDIDATOS MORTOS A TRANSPLANTE
            if (Compatibilidade.compatibilidadeSanguinea(doador, receptor)) {  /// Verificando compatibilidade sanguínea entre as candidatas a doadores
                int taxaDeCompatibilidade = Compatibilidade.compatibilidadeHLA(doador, receptor);

                if (taxaDeCompatibilidade > 70) { /// Condição de taxa de compatibilidade convencionada para ser compatível
                    receptor.getListaDePreferencias().add(new Preferencia(doador, taxaDeCompatibilidade)); 
               }
            }
        }

        Collections.sort( receptor.getListaDePreferencias() ); /// Ordenando a lista de preferências
    }
}
