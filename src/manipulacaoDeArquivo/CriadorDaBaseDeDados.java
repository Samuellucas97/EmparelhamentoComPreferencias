/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaoDeArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/// CLASSES PRÓPRIAS
import paciente.Compatibilidade;
import paciente.Doador;
import paciente.DoadorReceptor;
import paciente.TiposDeSangue;

/**
 * Contêm os métodos de leitura e escrita de arquivo
 * @author  candinhojr
 * @since   26.11.2018  
 */
public class CriadorDaBaseDeDados {

    private static String[] tipagemSanguinea = {
            "A_positivo",
            "A_negativo",
            "B_positivo",
            "B_negativo",
            "O_positivo",
            "O_negativo",
            "AB_positivo",
            "AB_negativo"};
    private static String doador = "Doador_";
    private static String receptor = "Receptor_";
    private static String doadorCadaver = "DoadorCadaver_";
    private static char[] caracteresHLA = {'A', 'B', 'C'};
    
    public CriadorDaBaseDeDados() {
		// TODO Auto-generated constructor stub
	}

    private static String[] getTipagemSanguinea() {
        return tipagemSanguinea;
    }
    
    private static char[] getCaracteresHLA() {
        return caracteresHLA;
    }
    
    private static String getDoador() {
        return doador;
    }
    
    private static String getReceptor() {
        return receptor;
    }
    
    private static String getDoadorCadaver() {
        return doadorCadaver;
    }
    
    public static String tipoSanguineo() {
        String tmp = "";
            int c = (int) Math.floor(Math.random()*getTipagemSanguinea().length);
            tmp += getTipagemSanguinea()[c];
        return tmp;
    }
    
    public static String sequenciaHLA() {
        String tmp = "";
        for (int j = 0; j < 10; j++) {
            int c = (int) Math.floor(Math.random()*getCaracteresHLA().length);
            tmp += getCaracteresHLA()[c];
        }
        return tmp;
    }
    
    public static void criarArquivoDoadoresReceptores(int numeroTotalDePares) {
      
    	try {
    	
	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("./data/testeDoadoresReceptores.dat"));
	        
	        for (int i = 0; i < numeroTotalDePares; i++) {
	            boolean compativeis = true;
	            
	            String tipoSanguineoDoador = tipoSanguineo();
	            String tipoSanguineoReceptor = tipoSanguineo();
	            
	            String sequenciaHLADoador = sequenciaHLA();
	            String sequenciaHLAReceptor = "";
	            
	            Doador objetoDoador = new Doador("", (TiposDeSangue.valueOf(tipoSanguineoDoador)), sequenciaHLADoador);
	            DoadorReceptor objetoReceptor = null;
	            
	            while(compativeis) {
	            	sequenciaHLAReceptor = sequenciaHLA();
	                objetoReceptor = new DoadorReceptor("", (TiposDeSangue.valueOf(tipoSanguineoReceptor)), sequenciaHLAReceptor, "", (TiposDeSangue.valueOf(tipoSanguineoReceptor)), sequenciaHLAReceptor);
	                if(Compatibilidade.compatibilidadeHLA(objetoDoador, objetoReceptor) < 70) {
	                    compativeis = false;
	                } else {
	                    sequenciaHLAReceptor = sequenciaHLA();
	                    compativeis = true;
	                }    
	            }
	            
	            //Insere para cada linha
	            buffWrite.append(getDoador()+i+";"+
	                    tipoSanguineoDoador+";"+
	                    sequenciaHLADoador+";"+
	                    getReceptor()+i+";"+
	                    tipoSanguineoReceptor+";"+
	                    sequenciaHLAReceptor+";"+"\n");
	        }
	        buffWrite.close();
	        
    	}catch(IOException e) {
    		System.err.println( e.getMessage() );
    	}    
	    
    }

	private static void criarArquivoDoadoresCadaveres(int numeroTotalDeCadaveres){
	
		try {
			
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter("./data/testeDoadoresCadaveres.dat"));
		
			for (int i = 0; i < numeroTotalDeCadaveres; i++) {
				String tipoSanguineoDoador = tipoSanguineo();
				String sequenciaHLADoador = sequenciaHLA();
	        	
				/// Insere para cada linha
	            try {
					buffWrite.append(getDoadorCadaver()+i+";"+
					        tipoSanguineoDoador+";"+
					        sequenciaHLADoador+";"+"\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	        buffWrite.close();
		}
		catch(IOException e) {
			System.err.println( e.getMessage() );
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (
                new InputStreamReader (System.in));
		System.out.print ("No. de pares doador-receptor a serem criados:"); 
	    int nParesDoadorReceptor = Integer.parseInt (in.readLine());
        criarArquivoDoadoresReceptores(nParesDoadorReceptor);
        System.out.print ("No. de doadores-cadaveres a serem criados:"); 
	    int nDoadoresCadaveres = Integer.parseInt (in.readLine());
        criarArquivoDoadoresCadaveres(nDoadoresCadaveres);
        String resposta = "Ambos os arquivos: \n"
        		+ "- testeDoadoresReceptores.dat e \n"
        		+ "- testeDoadoresCadaveres.dat \n"
        		+ "foram criados com sucesso! \n"
        		+ "Para conferir se os mesmos foram criados, basta acessar a pasta ./data";
        System.out.println(resposta);
    }
}