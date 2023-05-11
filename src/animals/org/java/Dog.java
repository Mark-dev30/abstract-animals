package animals.org.java;

import org.java.object.Animal;

import manager.org.java.Nuotare;

public class Dog extends Animal /*implements Nuotare*/ {

	@Override
	public void verso() {
		System.out.println("Bau-Bau");
		
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
		
	}
// 	-----OPTIONAL-----
	
//	@Override
//	public void swim() {
//		System.out.println("Sto nuotando");
//		
//	}

	@Override
	public void typology() {
		System.out.println("(Dog)");
		
	}
}
