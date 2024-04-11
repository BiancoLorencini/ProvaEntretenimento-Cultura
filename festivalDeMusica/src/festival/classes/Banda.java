package festival.classes;

public class Banda extends Artista {
	private double cache;

	public Banda(String nome, Enum generoMusical, double cache) {
		super(nome, generoMusical);
		this.cache = cache;
	}

	public double getCache() {
		return cache;
	}

}
