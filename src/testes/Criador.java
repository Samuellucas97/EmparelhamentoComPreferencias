/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import tccAlgorithm.Compatibilidade;
import tccAlgorithm.Doador;
import tccAlgorithm.DoadorReceptor;
import tccAlgorithm.TiposDeSangue;
/**
 * Contêm os métodos de leitura e escrita de arquivo
 * @author  candinhojr
 * @since   26.11.2018  
 */
public class Criador {

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
    private static char[] caracteresHLA = {'A', 'B', 'C'};
    
    public Criador() {}

    private static String[] tipagemSanguinea() {
        return tipagemSanguinea;
    }
    
    private static char[] caracteresHLA() {
        return caracteresHLA;
    }
    
    private static String doador() {
        return doador;
    }
    
    private static String receptor() {
        return receptor;
    }
    
    public static String tipoSanguineo() {
        String tmp = "";
            int c = (int) Math.floor(Math.random()*tipagemSanguinea().length);
            tmp += tipagemSanguinea()[c];
        return tmp;
    }
    
    public static String sequenciaHLA() {
        String tmp = "";
        for (int j = 0; j < 10; j++) {
            int c = (int) Math.floor(Math.random()*caracteresHLA().length);
            tmp += caracteresHLA()[c];
        }
        return tmp;
    }
    
    public static void criarArquivoDoadorReceptor(int numeroTotalDePares) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("./src/teste.dat"));
        for (int i = 0; i < numeroTotalDePares; i++) {
            boolean compativeis = true;
            
            String tipoSanguineoDoador = tipoSanguineo();
            String tipoSanguineoReceptor = tipoSanguineo();
            String sequenciaHLADoador = sequenciaHLA();
            String sequenciaHLAReceptor = "";
            
            Doador objetoDoador = new Doador("", (TiposDeSangue.valueOf(tipoSanguineoDoador)), sequenciaHLADoador);
            DoadorReceptor objetoReceptor = null;
            
            while(compativeis) {
                objetoReceptor = new DoadorReceptor("", (TiposDeSangue.valueOf(tipoSanguineoReceptor)), sequenciaHLAReceptor, "", (TiposDeSangue.valueOf(tipoSanguineoReceptor)), sequenciaHLAReceptor);
                if(Compatibilidade.compatibilidadeHLA(objetoDoador, objetoReceptor) < 70) {
                    sequenciaHLAReceptor = sequenciaHLA();
                    compativeis = false;
                } else {
                    compativeis = true;
                }    
            }
            
            //Insere para cada linha
            buffWrite.append(doador()+i+";"+
                    tipoSanguineoDoador+";"+
                    sequenciaHLA()+";"+
                    receptor()+i+";"+
                    tipoSanguineoReceptor+";"+
                    sequenciaHLA()+";"+"\n");
        }
        buffWrite.close();
    }

    public static void main(String[] args) throws IOException {

        criarArquivoDoadorReceptor(10);    

    }
    
}
