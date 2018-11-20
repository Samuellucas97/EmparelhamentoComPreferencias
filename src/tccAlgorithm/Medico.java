
import java.util.ArrayList;
import java.util.Collections;
/**
 * Representa um médico
 * @author  samuellucas97
 *          candinhojr
 * @since   01.11.2018
 */
public class Medico {

	Controlador owner;
        
	/**
         * Construtor parametrizado
         * @param owner 
         */
	public Medico(Controlador owner) {
		this.owner = owner;
	}
        
	/**
         * Cria e ordena a lista de preferências do receptor
         * @param receptor  Receptor a receber o rim doado 
         * @param doadores  Doador de um rim
         */
	public void defineListaDePreferenciasDoReceptor(DoadorReceptor receptor, ArrayList<DoadorReceptor> doadores) {
            
            for (DoadorReceptor doador : doadores) {  /// Verificando compatibilidade entre as candidatas  
                if (owner.compatibilidadeSanguinea(doador, receptor)) {
                    int taxaDeCompatibilidade = owner.compatibilidadeHLA(doador, receptor);
                    
                    if (taxaDeCompatibilidade > 70) { 
                        receptor.getListaDePreferencias().add(new Preferencia(doador, taxaDeCompatibilidade)); 
                   }
                }
            }
            
            Collections.sort( receptor.getListaDePreferencias() ); /// Ordenando a lista de preferências
	}
}
