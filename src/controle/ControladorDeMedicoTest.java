package controle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import paciente.Doador;
import paciente.DoadorReceptor;
import paciente.TiposDeSangue;

@DisplayName ("Testando métodos da classe Controlador") 
class ControladorDeMedicoTest {
	
	private ControladorDeMedico c;
	
	public ControladorDeMedicoTest() {
		c = new ControladorDeMedico();
	}

	@Test
	@DisplayName (" Testando definir a lista de prefências do receptor ")
	void defineListaDePreferenciasDoReceptorTest() {
		
	}

}
