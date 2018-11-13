package tccAlgorithm;

import java.util.ArrayList;

/**
 * Representa uma preferência
 * @author  samuellucas97
 *          candinho
 * @since   03.11.2018
 */
public class Controlador {
	Compatibilidade compatibilidade;
	Medico medico;
	
        /**
         * Cria a lista de preferências do receptor
         * @param receptor  Receptor
         * @param doadores  Lista de doadores
         */
        public void defineListaDePreferenciasDoReceptor(DoadorReceptor receptor, ArrayList<DoadorReceptor> doadores) {
		medico.defineListaDePreferenciasDoReceptor(receptor, doadores);
	}
	/**
         * Verifica a compatibilidade sanguínea entre o receptor e o doador
         * @param doador    Doador
         * @param receptor  Receptor
         * @return True caso seja compatível senão false
         */
	public boolean compatibilidadeSanguinea(DoadorReceptor doador, DoadorReceptor receptor){	
		return compatibilidade.compatibilidadeSanguinea(doador, receptor);
	}
	/**
         * Verifiaca a compatibilidade de HLA entre o doador e o receptor
         * @param doador    Doador
         * @param receptor  Receptor
         * @return True caso sejam compatíveis senão false
         */
	public int compatibilidadeHLA(DoadorReceptor doador, DoadorReceptor receptor) {
		return compatibilidade.compatibilidadeHLA(doador, receptor);
	}
	
	public static void main(String[] args) {
            //TODO
	}
}
