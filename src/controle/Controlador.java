package controle;

import manipulacaoDeArquivo.ManipulacaoDeArquivo;
import java.util.ArrayList;

/// CLASSES PRÓPRIAS 
import paciente.DoadorReceptor;
import paciente.Doador;

/**
 * Representa uma preferência
 * @author  samuellucas97
 *          candinhojr
 * @since   03.11.2018
 */
public class Controlador {
    
    private ArrayList<DoadorReceptor> paresDoadoresReceptores;
    private ArrayList<Doador> doadoresCadaveres;

    public Controlador() {
        
        this.paresDoadoresReceptores = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./data/testeDoadoresReceptores.dat");
        this.doadoresCadaveres = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresCadaver("./data/testeDoadoresCadaveres.dat");
    }

    /**
     * Cria a lista de preferências do receptor
     * @param receptor  Receptor
     * @param doadores  Lista de doadores
     */
    public void defineListaDePreferenciasDoReceptor() {     
        ArrayList<DoadorReceptor> paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
        
       // System.out.println(paresDoadoresReceptores + "\n" + doadoresCadaveres);
        
        for( int i = 0; i < paresDoadoresReceptores.size(); ++i ){
            
       // 	System.out.println(i + " " + paresDoadoresReceptores.get(i) + "  LINHA 37 - Controlador");  
        	
            paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
            paresDoadoresReceptoresAuxiliar.remove(i);
            
            Medico.defineListaDePreferenciasDoReceptor( paresDoadoresReceptores.get(i), paresDoadoresReceptoresAuxiliar, doadoresCadaveres);
     
        }    
    }
    
    public ArrayList<DoadorReceptor> getParesDoadoresReceptores() {
        return paresDoadoresReceptores;
    }

    public ArrayList<Doador> getDoadoresCadaveres() {
        return doadoresCadaveres;
    }
}
