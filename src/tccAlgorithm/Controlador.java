package tccAlgorithm;

import java.util.ArrayList;

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
        this.paresDoadoresReceptores = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./src/doadoresReceptores.dat");;
        this.doadoresCadaveres = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresCadaver("./src/doadoresCadaver.dat");
    }

    /**
     * Cria a lista de preferências do receptor
     * @param receptor  Receptor
     * @param doadores  Lista de doadores
     */
    public void defineListaDePreferenciasDoReceptor() {     
        ArrayList<DoadorReceptor> paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
        ArrayList<Doador> doadoresCadaveresAuxiliar = doadoresCadaveres;
        
        for( int i = 0; i < paresDoadoresReceptores.size(); i++ ){
            paresDoadoresReceptoresAuxiliar = paresDoadoresReceptores;
            doadoresCadaveresAuxiliar = doadoresCadaveres;
            
            paresDoadoresReceptoresAuxiliar.remove(i); // Removendo a possibilidade de adicionar o próprio par na lista de preferências.      
            Medico.defineListaDePreferenciasDoReceptor(
                    paresDoadoresReceptores.get(i), paresDoadoresReceptoresAuxiliar, doadoresCadaveresAuxiliar);   
        }    
    }
    
    public ArrayList<DoadorReceptor> getParesDoadoresReceptores() {
        return paresDoadoresReceptores;
    }

    public ArrayList<Doador> getDoadoresCadaveres() {
        return doadoresCadaveres;
    }
    
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
//        System.out.println(controlador.getParesDoadoresReceptores());
        System.out.println(controlador.getParesDoadoresReceptores().get(0).getListaHLADoador().length());
        System.out.println(controlador.getParesDoadoresReceptores().get(1).getListaHLADoador().length());
        System.out.println(controlador.getParesDoadoresReceptores().get(2).getListaHLADoador().length());
        System.out.println(controlador.getDoadoresCadaveres().get(0).getListaHLADoador().length());
        System.out.println(controlador.getDoadoresCadaveres().get(1).getListaHLADoador().length());
        System.out.println(controlador.getDoadoresCadaveres().get(2).getListaHLADoador().length());
        System.out.println(controlador.getDoadoresCadaveres().get(3));
        System.out.println(controlador.getDoadoresCadaveres().get(3).getListaHLADoador().length());
        controlador.defineListaDePreferenciasDoReceptor();
        
    }
}
