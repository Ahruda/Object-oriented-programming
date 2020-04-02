package ex;

import java.util.ArrayList;

public class Album {
	
	ArrayList<Figurinha> figurinhas = new ArrayList<Figurinha>();
	
	Album(){
		//construtor default
	}
	
	int getNumeroFigurinhas() {
		return figurinhas.size();
	}
	
	void exibirAlbum() {
		for(Figurinha f : figurinhas) {
			f.exibirFigurinha();
		}
	}
	
	boolean addFigurinha(Figurinha f) {
		
		for(Figurinha g : figurinhas) {
			if(g.getNumero() == f.getNumero()) {
				g.quantidade++;
				return false;
			}
		}
		return figurinhas.add(f);
	}
}
	