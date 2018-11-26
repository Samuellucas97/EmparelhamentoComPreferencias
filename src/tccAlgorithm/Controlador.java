import java.util.ArrayList;

/**
 * Representa uma preferência
 * @author  samuellucas97
 *          candinhojr
 * @since   03.11.2018
 */
public class Controlador {
	
    /**
     * Cria a lista de preferências do receptor
     * @param receptor  Receptor
     * @param doadores  Lista de doadores
     */
    public void defineListaDePreferenciasDoReceptor(String nomeDoArquivoDeDoadoresReceptores,
                                                    String nomeDoArquivoDeDoadoresCadaveres) {
        
        ArrayList<DoadorReceptor> paresDoadoresReceptores = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./src/doadoresReceptores.dat");
        ArrayList<Doador> doadoresCadaveres = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresCadaver("./src/doadoresCadaver.dat");
        
        ArrayList<DoadorReceptor> paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
        ArrayList<Doador> doadoresCadaveresAuxiliar = doadoresCadaveres;
        
        for( int i = 0; i < paresDoadoresReceptores.size(); ++i ){
            
            paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
            doadoresCadaveresAuxiliar = doadoresCadaveres;
            
            //if(){            
                Medico.defineListaDePreferenciasDoReceptor( paresDoadoresReceptores.get(i), paresDoadoresReceptoresAuxiliar, doadoresCadaveresAuxiliar);
            //}    
        }    
    }
    /**
     * Verifica a compatibilidade sanguínea entre o receptor e o doador
     * @param doador    Doador
     * @param receptor  Receptor
     * @return True caso seja compatível senão false
     */
    public boolean compatibilidadeSanguinea(Doador doador, DoadorReceptor receptor){	
            return Compatibilidade.compatibilidadeSanguinea(doador, receptor);
    }


   /**
     * Verifiaca a compatibilidade de HLA entre o doador e o receptor
     * @param doador    Doador
     * @param receptor  Receptor
     * @return True caso sejam compatíveis senão false
     */
    public int compatibilidadeHLA(Doador doador, DoadorReceptor receptor) {
            return Compatibilidade.compatibilidadeHLA(doador, receptor);
    }

}
