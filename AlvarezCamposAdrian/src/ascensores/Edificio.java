package ascensores;

import java.util.Random;

public class Edificio {

	private int capacidad = 8;
	private Random r = new Random();
	
	public synchronized void subirAscensor(int plantaActual, int plantaDestino) {
		while(capacidad == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.interrupted();
			}
		}
		capacidad--;
		System.out.println(" se sube al ascenasor en la planta "+plantaActual);
		notifyAll();
	}
	
	public synchronized void bajarse(int plantaActual, int plantaDestino) {
		while(plantaActual != plantaDestino) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.interrupted();
			}
		}
		capacidad++;
		System.out.println(" se baja el ascensor");
		notifyAll();
	}
}
