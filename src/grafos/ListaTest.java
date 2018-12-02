package grafos;

public class ListaTest {
	public static void main(String[] args) {
		Lista lista = new Lista();
		Integer vetor[] = new Integer[1000];
		Integer n = null;
		int i, j, k, max;
		java.util.Random random = new java.util.Random();
		max = 10;
		try {
			// Gera uma permutacao aleatoria de chaves entre 0 e max - 1
			for (i = 0; i < max; i++)
				vetor[i] = new Integer(i);
			for (i = 0; i < max; i++) {
				k = Math.abs(random.nextInt()) % max;
				j = Math.abs(random.nextInt()) % max;
				n = vetor[k];
				vetor[k] = vetor[j];
				vetor[j] = n;
			}
			// Insere cada chave na lista
			for (i = 0; i < max; i++) {
				lista.insere(vetor[i]);
				System.out.println("Inseriu " + vetor[i].toString());
			}
			lista.imprime();
			// Pesquisa cada chave da lista
			for (i = 0; i < max; i++) {
				n = (Integer) lista.pesquisa(vetor[i]);
				System.out.println("Item: " + n.toString());
			}
			// Pesquisa sem sucesso
			Object item = lista.pesquisa(new Integer(100));
			if (item == null)
				System.out.println("Item nao encontrado");
			// Retira cada chave da lista
			for (i = 0; i < max; i++) {
				n = (Integer) lista.retira(vetor[i]);
				System.out.println("Retirou: " + n.toString());
			}
			n = (Integer) lista.retiraPrimeiro();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		lista.imprime();
	}
}