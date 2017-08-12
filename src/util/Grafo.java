package util;

import java.util.ArrayList;

public class Grafo {
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	
	public void addAresta(String origem, String destino, int minutos, int peso){
		int i = addVertice(origem);
		int j = addVertice (destino);
		
		Aresta a = new Aresta((Vertice) this.vertices.get(i), (Vertice) this.vertices.get(j), minutos, peso);
		this.arestas.add(a);
		int k = this.arestas.size();
		
		this.vertices.get(i).addIncidentes(this.arestas.get(k-1));
		this.vertices.get(j).addIncidentes(this.arestas.get(k-1));
	}

	private int addVertice(String nome) {
		int i= this.indexVertice(nome); 

		if(i==0){
			this.vertices.add(new Vertice(nome));
			return (this.vertices.size() - 1);
		}

		return i;
	}

	private int indexVertice(String nome) {
		int i;

		for (i=0; i<this.vertices.size() ; i++){
			if (this.vertices.get(i).getNome().equals(nome)){
				return i;
			}
		}
		
		return 0;
	}
}