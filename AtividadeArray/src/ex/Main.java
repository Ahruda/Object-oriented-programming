package ex;

public class Main {
	public static void main(String[] args) {
	
		Album album = new Album();
		Figurinha f1 = new Figurinha(1,1);
		Figurinha f2 = new Figurinha(10,1);
		Figurinha f3 = new Figurinha(18,1);
		Figurinha f4 = new Figurinha(5,1);
		
		System.out.println("Quantidade de figurinhas no album: "+album.getNumeroFigurinhas());
		
		album.addFigurinha(f1);
		album.addFigurinha(f2);
		album.addFigurinha(f3);
		album.addFigurinha(f4);
		album.addFigurinha(f1);
		album.addFigurinha(f1);
		album.addFigurinha(f1);
		
		System.out.println("Quantidade de figurinhas no album: "+album.getNumeroFigurinhas());
		album.exibirAlbum();
	}
}
