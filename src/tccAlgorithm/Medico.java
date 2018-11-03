package tccAlgorithm;

import java.util.ArrayList;

public class Medico {

	Controlador owner;
	
	public Medico(Controlador owner) {
		this.owner = owner;
	}
	
	public void defineListaDePreferenciasDoReceptor(DoadorReceptor receptor, ArrayList<DoadorReceptor> doadores) {
		for (DoadorReceptor doador : doadores) {
			if (owner.compatibilidadeSanguinea(doador, receptor)) {
				if (owner.compatibilidadeHLA(doador, receptor)) {
					receptor.listaDePreferencias().add(doador.getNomeDoador());
				}
			}
		}
	}
}
