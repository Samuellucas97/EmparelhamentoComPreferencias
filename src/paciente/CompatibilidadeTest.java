package paciente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName ("Testando métodos da classe Compatibilidade") 
public class CompatibilidadeTest {
	
	public CompatibilidadeTest() { /** Vazio */ }
	
	@Test
	@DisplayName("Testando compatibilidade sanguínea")
	void compatibilidadeSanguineaTest() {
		
		/// CASO POSITIVO
		assertEquals(true, 
						Compatibilidade.compatibilidadeSanguinea( 
							new Doador("Doador_0", TiposDeSangue.AB_positivo,"CBBCAAAC"), 
							new DoadorReceptor("Doador_1",TiposDeSangue.B_positivo,"BAABBCAA","Receptor_1",TiposDeSangue.AB_positivo,"CBBCAAAC") 
						),
							
						"O resultado esperado é que o doador 0 seja compatível com o receptor 1... Está correto?"
					);
	
		/// CASO NEGATIVO	
		assertEquals(false, 
				Compatibilidade.compatibilidadeSanguinea( 
					new Doador("Doador_0", TiposDeSangue.AB_positivo,"CBBCAAAC"), 
					new DoadorReceptor("Doador_1",TiposDeSangue.B_positivo,"BAABBCAA","Receptor_1",TiposDeSangue.O_positivo,"CBBCAAAC") 
				),
					
				"O resultado esperado é que o doador 0 NÃO seja compatível com o receptor 1... Está correto?"
			);

	
	}
	
	
	@Test
	@DisplayName("Testando compatibilidade de HLA")
	void compatibilidadeDeHLATest(){
		
		/// CASO POSITIVO
		assertEquals(true, 
						Compatibilidade.compatibilidadeHLA( 
							new Doador("Doador_0", TiposDeSangue.AB_positivo,"CBBCAAAC"), 
							new DoadorReceptor("Doador_1",TiposDeSangue.B_positivo,"BAABBCAA","Receptor_1",TiposDeSangue.AB_positivo,"CBBCAAAC") 
						) == 100,
							
						"O resultado esperado é que o doador 0 seja compatível com o receptor 1 em 100 porcento... Está correto?"
					);
	
		/// OUTRO CASO POSITIVO	
		assertEquals(true, 
				Compatibilidade.compatibilidadeHLA( 
						new Doador("Doador_0", TiposDeSangue.AB_positivo,"CBBCAAAC"), 
						new DoadorReceptor("Doador_1", TiposDeSangue.B_positivo,"BAABBCAA","Receptor_1",TiposDeSangue.AB_positivo,"CBBCAAAC") 
					) > 70,
					
				"O resultado esperado é que o doador 0 seja compatível com o receptor 1 mais de 70 porcento... Está correto?"
			);
	
		
	}
	
}
