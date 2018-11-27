package tccAlgorithm;

//// IMPORTAÇÕES DE PACOTES

/// (MANIPULAÇÃO DE ARQUIVO)
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

/// CLASSE DE EXCEÇÃO (MANIPULAÇÃO DE ARQUIVO)
import java.io.FileNotFoundException;
import java.io.IOException;

/// VETOR IMPLEMENTADO COMO LISTA
import java.util.ArrayList;

/**
 * Contêm os métodos de leitura e escrita de arquivo
 * @author  Samuel Lucas de Moura Ferino
 * @since   21.05.2018   
 * @version 0.0.6
 */
public class ManipulacaoDeArquivo{
    
	/**
	 * Construtor da classe
	 */
	public ManipulacaoDeArquivo() { /** Vazio */}
	
    /**
     * Lê o arquivo entrado com o nome  
     * @param   nomeDoArquivo   Nome do arquivo a ser lido
     * @return  String com o conteudo do arquivo se a leitura for feita corretamente, senão string nula
     */
    public static String lerArquivo( String nomeDoArquivo ){

        String conteudo = new String("");
        
        try{

            BufferedReader buffReader = new BufferedReader(new FileReader( nomeDoArquivo ));
            String linha = new String();

            while( buffReader.ready() ){              /// LENDO CADA LINHA  
                linha = buffReader.readLine();
                conteudo += linha + "\n";
            }
            
            buffReader.close();
            return conteudo;

        }
        catch(FileNotFoundException e){  /// ARQUIVO NÃO EXISTE

            System.err.println( e.getMessage() );   
            return "";
        }  
        catch(IOException e){  /// OCORREU OUTRO ERRO, SENDO ESSE DESCONHECIDO

            System.err.println( e.getMessage() );
            return "";
        
        }

    }
    
    /**
     * Lê o arquivo entrado com o nome  
     * @param   nomeDoArquivo   Nome do arquivo a ser lido
     * @param   conteudo        Conteúdo 
     * @return  True se a leitura for feita corretamente, senão false
     */
    public static boolean salvarArquivo(String nomeDoArquivo, String conteudo){
        
        try{

          FileWriter writer = new FileWriter(nomeDoArquivo);     

          writer.write(conteudo);

          writer.close();  

          return true;

        }
        catch(FileNotFoundException e){   /// ARQUIVO NÃO EXISTE
            System.err.println( e.getMessage() );
            return false;        
        }
        catch(IOException e){  /// OCORREU OUTRO ERRO, SENDO ESSE DESCONHECIDO
            System.err.println( e.getMessage() );
            return false;
        }
    }

    /**
     * Promove a leitura com tratamento do arquivo contendo os dados dos pares doador-receptor
     * @param   nomeDoArquivoDeDoadoresReceptores   Nome do arquivo a ser lido
     * @return  Um vetor de pares doador-receptor
     */
    public static ArrayList<DoadorReceptor> leituraComTratamentoDeArquivoDeDoadoresReceptores( String nomeDoArquivoDeDoadoresReceptores) throws NullPointerException{
        
        String conteudoArquivoDeDoadoresReceptoresEmString = lerArquivo(nomeDoArquivoDeDoadoresReceptores);

        if( conteudoArquivoDeDoadoresReceptoresEmString.equals("") ){
            return null;
        }

        String[] dadosDeParesDoadorReceptor = conteudoArquivoDeDoadoresReceptoresEmString.split(";") ;
        ArrayList<DoadorReceptor> paresDoadorReceptor = new ArrayList<DoadorReceptor>();

        for(int i = 0; i < dadosDeParesDoadorReceptor.length; i+=6){
            paresDoadorReceptor.add( new DoadorReceptor(
                            dadosDeParesDoadorReceptor[i],
                            TiposDeSangue.valueOf(dadosDeParesDoadorReceptor[i+1]),
                            dadosDeParesDoadorReceptor[i+2],
                            dadosDeParesDoadorReceptor[i+3], 
                            TiposDeSangue.valueOf(dadosDeParesDoadorReceptor[i+4]),
                            dadosDeParesDoadorReceptor[i+5] ) 
                                    );
        }

        return paresDoadorReceptor;
    }

    /**
     * Promove a leitura com tratamento do arquivo contendo os dados dos doadores cadáver
     * @param   nomeDoArquivoDeDoadoresCadaver   Nome do arquivo a ser lido
     * @return  Um vetor de doadores cadáver
     */
    public static ArrayList<Doador> leituraComTratamentoDeArquivoDeDoadoresCadaver( String nomeDoArquivoDeDoadoresCadaver) throws NullPointerException{
        
        String conteudoArquivoDeDoadoresCadaverEmString = lerArquivo(nomeDoArquivoDeDoadoresCadaver);

        if( conteudoArquivoDeDoadoresCadaverEmString.equals("") ){
            return null;
        }
        
        String[] dadosDeDoadorCadaver = conteudoArquivoDeDoadoresCadaverEmString.split(";");
        ArrayList<Doador> doadoresCadaver = new ArrayList<Doador>();

        for(int i = 0; i < dadosDeDoadorCadaver.length; i+=3){
            doadoresCadaver.add( new Doador(
                            dadosDeDoadorCadaver[i],
                            TiposDeSangue.valueOf(dadosDeDoadorCadaver[i+1]),
                            dadosDeDoadorCadaver[i+2] ) 
                                );
        }

        return doadoresCadaver;

    }

    public static void main(String[] args) {

        //// TESTANDO LEITURA DE ARQUIVO

        System.out.println( ManipulacaoDeArquivo.lerArquivo("./src/doadoresReceptores.dat") + "AO");    

        ArrayList<DoadorReceptor> a = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./src/doadoresReceptores.dat");
        System.out.println(a);    


        ArrayList<Doador> b = ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresCadaver("./src/doadoresCadaver.dat");
        System.out.println(b);    

    }
    
}
