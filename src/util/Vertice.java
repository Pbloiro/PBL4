package util;

import java.util.ArrayList;

public class Vertice implements Comparable <Vertice> {
	private String nome;
	private Vertice pai;
	private int distancia, /*(?)*/ tempo;
	private ArrayList<Aresta> incidentes = new ArrayList<Aresta>();
	private ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();
	private boolean visitado;
	
	public Vertice(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Vertice getPai() {
		return pai;
	}
	public void setPai(Vertice pai) {
		this.pai = pai;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public ArrayList<Aresta> getIncidentes() {
		return incidentes;
	}
	public void setIncidentes(ArrayList<Aresta> incidentes) {
		this.incidentes = incidentes;
	}
	public ArrayList<Vertice> getVizinhos() {
		return vizinhos;
	}
	public void setVizinhos(ArrayList<Vertice> vizinhos) {
		this.vizinhos = vizinhos;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	public boolean isVizinho(Vertice vizinho){
		for(int i = 0; i < this.vizinhos.size(); i++){
			if(this.vizinhos.get(i).getNome().equals(vizinho.getNome())){
				return true;
			}
		}
		return false;
	}
	
	public void addVizinhos(Vertice vizinho){
		this.vizinhos.add(vizinho);
	}
	
	public void addIncidentes(Aresta incide){
		this.incidentes.add(incide);
		
		if((incide.getOrigem().getNome().equals(this.getNome())) && (!isVizinho(incide.getOrigem()))){
			addVizinhos(incide.getDestino());
		}
		
		else if((incide.getDestino().getNome().equals(this.getNome())) && (!isVizinho(incide.getDestino()))){
			addVizinhos(incide.getOrigem());
		}
	}
	
	
	
	@Override
	public int compareTo(Vertice vertice) {
		
		if(this.getTempo() > vertice.getTempo()){
			return 1;
		}
		
		else if(this.getTempo() < vertice.getTempo()){
			return -1;
		}
		
		return 0;
	
	}
	
}
