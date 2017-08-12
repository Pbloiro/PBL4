package util;

public class Aresta {
	private int peso, minutos;
	private Vertice origem;
	private Vertice destino;
	private boolean visitado;
	
	public Aresta(Vertice origem, Vertice destino, int peso, int minutos){
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
		this.minutos = minutos;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public Vertice getOrigem() {
		return origem;
	}
	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}
	public Vertice getDestino() {
		return destino;
	}
	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	
	
}
