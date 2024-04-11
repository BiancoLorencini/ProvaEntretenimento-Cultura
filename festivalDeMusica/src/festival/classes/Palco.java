package festival.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade = 20000;
	public List<String> eventoHorario = new ArrayList<>();

	// Construtor
	public Palco(String nome, int capacidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
	}
	
	// Get & Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	

	// Método

	public void adicionaArtista(Artista artista) {
		this.eventoHorario.add(nome);
	}
	
	
	public String toString() {
		return String.format("""
				Nome: %s
				Capacidade do Palco: %d
				Horarios: %s
				""", nome, capacidade, eventoHorario);
	}
}
