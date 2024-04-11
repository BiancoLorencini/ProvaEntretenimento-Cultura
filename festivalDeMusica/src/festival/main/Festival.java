package festival.main;

import java.util.ArrayList;
import java.util.List;

import festival.classes.Artista;
import festival.classes.Banda;
import festival.classes.Enum.GeneroMusical;

public class Festival {
	public static void main(String[] args) {
		Artista artista1 = new Banda("Skillet", GeneroMusical.ROCK, 150000.00);

		List<String> evento = new ArrayList<>();

		System.out.println("Nome da banda: " + artista1.getNome());
		System.out.println("Gênero Musical: " + artista1.getGeneroMusical());
		System.out.println("Cache: R$" + ((Banda)artista1).getCache());
	}
}
