package ex3;

public class Main {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		
		controle.CanalAtual();
		controle.VolumeAtual();
		
		controle.AumentarVolume();
		controle.VolumeAtual();
		
		controle.DiminuirVolume();
		controle.VolumeAtual();
		
		controle.MudarCanal(8);
		controle.AumentarVolume();
		
		controle.CanalAtual();
		controle.VolumeAtual();


	}
}
