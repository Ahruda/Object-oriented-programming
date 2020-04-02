package ex3;

public class ControleRemoto {
	Televisao televisao1 = new Televisao();
	
	public ControleRemoto() {
		
	}
	public void AumentarVolume() {
		televisao1.setVolume(televisao1.getVolume()+5);
	}
	public void DiminuirVolume() {
		televisao1.setVolume(televisao1.getVolume()-5);
	}
	public void MudarCanal(int canal) {
		televisao1.setCanal(canal);
	}
	public void VolumeAtual() {
		System.out.println("Volume atual da TV eh: "+televisao1.getVolume());
	}
	public void CanalAtual() {
		System.out.println("Canal atual da TV eh: "+televisao1.getCanal());
	}
}
