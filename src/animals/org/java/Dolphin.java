package animals.org.java;

import org.java.object.Animal;

import manager.org.java.Nuotare;

public class Dolphin extends Animal implements Nuotare {
	@Override
	public void verso() {
		System.out.println("Fischi");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
		
	}

	@Override
	public void swim() {
		System.out.println("Sto nuotando");
		
	}
	

}
