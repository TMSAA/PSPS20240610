package ascensores;

import java.util.Random;

public class Personas extends Thread{
	
	private int plantaActual;
	private int plantaDestino;
	private Random r = new Random();
	private Edificio e;
	
	public Personas(Edificio e, int id) {
		super("P"+id);
		this.e = e;
		this.plantaActual = r.nextInt(21);
		this.plantaDestino =r.nextInt(21);
		while(plantaActual == plantaDestino) {
			this.plantaDestino = r.nextInt(21);
		}
	}

	@Override
	public void run() {
		e.subirAscensor(plantaActual, plantaDestino);
		e.bajarse(plantaActual, plantaDestino);
	}
	
	
}
