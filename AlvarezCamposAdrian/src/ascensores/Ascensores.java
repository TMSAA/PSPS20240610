package ascensores;

public class Ascensores extends Thread{
	private Estado e;
	private int planta;
	
	public Ascensores() {
		super();
		this.e = Estado.Parado;
		this.planta = 10;
	} 
	
	@Override
	public void run() {
		
	}
	
}
