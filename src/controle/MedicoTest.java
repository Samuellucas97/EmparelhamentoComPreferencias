package controle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import paciente.Doador;
import paciente.DoadorReceptor;
import paciente.TiposDeSangue;


@DisplayName ("Testando métodos da classe Medico") 
public class MedicoTest {

	private DoadorReceptor receptor; 
    private ArrayList<DoadorReceptor> doadoresVivos;
    private ArrayList<Doador> doadoresCadaveres;
	
	public MedicoTest() { 

		receptor = new DoadorReceptor("Doador_0", TiposDeSangue.A_positivo,"BBCCBACB", 
									"Receptor_0", TiposDeSangue.AB_positivo,"AABBCCCB");
		
		doadoresVivos = new ArrayList<DoadorReceptor>();
		doadoresCadaveres = new ArrayList<Doador>();
		
		doadoresVivos.add( new DoadorReceptor("Doador_1",TiposDeSangue.O_positivo,"ABBCCBAB","Receptor_1",TiposDeSangue.B_positivo,"CBCCABAB") );
		doadoresVivos.add( new DoadorReceptor("Doador_2",TiposDeSangue.O_negativo,"CBABAABB","Receptor_2",TiposDeSangue.O_negativo,"CCCACCAA") );
		doadoresVivos.add( new DoadorReceptor("Doador_3",TiposDeSangue.O_positivo,"BBCABBAB","Receptor_3",TiposDeSangue.A_negativo,"BABAAAAC") );
	    
		doadoresCadaveres.add( new Doador("Doador_9",TiposDeSangue.O_negativo,"BCAAABAB") );
		doadoresCadaveres.add( new Doador ("Doador_8",TiposDeSangue.B_positivo, "BCCAAACA") );
		
	}
	
	@Test
	@DisplayName(" Testando definir a lista de prefências do receptor ")
	void defineListaDePreferenciasDoReceptorTest() {
		
		Medico.defineListaDePreferenciasDoReceptor(	receptor, 
													doadoresVivos);
				
		
		assertEquals(true, 
				receptor.getMaisPreferido() != null,
				"O resultado esperado é que o doador tenha um mais preferido... Está correto?"
			);
		
		System.out.println( receptor.getMaisPreferido() );
	
	}

}
