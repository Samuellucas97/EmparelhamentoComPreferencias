package tccAlgorithm;

import java.util.ArrayList;

public class Controlador {
	Compatibilidade compatibilidade;
	Medico medico;
	
	public void defineListaDePreferenciasDoReceptor(DoadorReceptor receptor, ArrayList<DoadorReceptor> doadores) {
		medico.defineListaDePreferenciasDoReceptor(receptor, doadores);
	}
	
	public boolean compatibilidadeSanguinea(DoadorReceptor doador, DoadorReceptor receptor){	
		return compatibilidade.compatibilidadeSanguinea(doador, receptor);
	}
	
	public boolean compatibilidadeHLA(DoadorReceptor doador, DoadorReceptor receptor) {
		return compatibilidade.compatibilidadeHLA(doador, receptor);
	}
	
	public static void main(String[] args) {
		
	}
}
