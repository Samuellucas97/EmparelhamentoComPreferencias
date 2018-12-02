package grafos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GrafoTest {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static Grafo.Aresta lerAresta() throws Exception {
		System.out.println("Aresta:");
		System.out.print("  V1:");
		int v1 = Integer.parseInt(in.readLine());
		System.out.print("  V2:");
		int v2 = Integer.parseInt(in.readLine());
		System.out.print("  Peso:");
		int peso = Integer.parseInt(in.readLine());
		return new Grafo.Aresta(v1, v2, peso);
	}

	public static void main(String[] args) throws Exception {
		System.out.print("No. vertices:");
		int nVertices = Integer.parseInt(in.readLine());
		System.out.print("No. arestas:");
		int nArestas = Integer.parseInt(in.readLine());
		Grafo grafo = new Grafo(nVertices, nArestas);
		for (int i = 0; i < nArestas; i++) {
			Grafo.Aresta a = lerAresta();
			grafo.insereAresta(a.v1(), a.v2(), a.peso()); // @{\it Duas chamadas porque}@
			grafo.insereAresta(a.v2(), a.v1(), a.peso()); // @{\it grafo n\~ao direcionado}@
		}
		grafo.imprime();
		in.readLine();
		/*
		 * Grafo grafoT = grafo.grafoTransposto(); grafoT.imprime (); in.readLine();
		 * Grafo.Aresta a = lerAresta (); if (grafo.existeAresta (a.v1 (), a.v2 ()))
		 * System.out.println ("Aresta ja existe"); else { grafo.insereAresta (a.v1 (),
		 * a.v2 (), a.peso ()); // @{\it Duas chamadas porque}@ grafo.insereAresta (a.v2
		 * (), a.v1 (), a.peso ()); // @{\it grafo n\~ao direcionado}@ } grafo.imprime
		 * (); in.readLine();
		 */
		System.out.print("Lista adjacentes de: ");
		int v1 = Integer.parseInt(in.readLine());
		if (!grafo.listaAdjVazia(v1)) {
			Grafo.Aresta adj = grafo.primeiroListaAdj(v1);
			while (adj != null) {
				System.out.println("  " + adj.v2() + " (" + adj.peso() + ")");
				adj = grafo.proxAdj(v1);
			}
			System.out.println();
			in.readLine();
		}
		System.out.println("Retira aresta: ");
		Grafo.Aresta a = lerAresta();
		if (grafo.existeAresta(a.v1(), a.v2())) {
			grafo.retiraAresta(a.v1(), a.v2()); // @{\it Duas chamadas porque}@
			grafo.retiraAresta(a.v2(), a.v1()); // @{\it grafo n\~ao direcionado}@
		} else
			System.out.println("Aresta nao existe");
		grafo.imprime();
		in.readLine();
		System.out.print("Existe aresta: ");
		a = lerAresta();
		if (grafo.existeAresta(a.v1(), a.v2()))
			System.out.println("  Sim");
		else
			System.out.println("  Nao");
	}
}
