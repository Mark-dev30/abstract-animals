package animals.org.java;

import org.java.object.Animal;

import manager.org.java.Nuotare;
import manager.org.java.Volare;

public class Sparrow extends Animal implements Volare{
	@Override
	public void verso() {
		System.out.println("Cip-Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Semi");
		
	}

	@Override
	public void fly() {
		System.out.println("Sto volando");
		
	}
	
}
