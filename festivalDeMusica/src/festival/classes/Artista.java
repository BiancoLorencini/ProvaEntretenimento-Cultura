package festival.classes;

public abstract class Artista {
	private String nome;
	private Enum GeneroMusical;

	// Construtor
	public Artista(String nome, Enum generoMusical) {
		super();
		this.nome = nome;
		GeneroMusical = generoMusical;
		
	}

	// Get & Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Enum getGeneroMusical() {
		return GeneroMusical;
	}

	public void setGeneroMusical(Enum generoMusical) {
		GeneroMusical = generoMusical;
	}
	

	// Método
	public String toString() {
		return String.format("""
				Nome: %s
				Gênero Musical: %s
				""", nome, GeneroMusical);
	}
}
