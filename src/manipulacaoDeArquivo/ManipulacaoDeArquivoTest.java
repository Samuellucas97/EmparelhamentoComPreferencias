package manipulacaoDeArquivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName ("Testando métodos da classe ManipulacaoDeArquivo") 
public class ManipulacaoDeArquivoTest {

	public ManipulacaoDeArquivoTest() { /** Vazio */ }
	
	@Test
	@DisplayName("Testando leitura com tratamento de arquivo de doadores cadáveres")
	void leituraComTratamentoDeArquivoDeDoadoresReceptoresTest() {
		
		assertEquals(true, 
				ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./data/teste.dat")!= null,
					"O resultado esperado é o vetor não seja nulo... Está correto?"
		);
		
		System.out.println(ManipulacaoDeArquivo.leituraComTratamentoDeArquivoDeDoadoresReceptores("./data/teste.dat"));
		
	}

}
