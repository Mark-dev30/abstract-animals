package animals.org.java;

import org.java.object.Animal;

import manager.org.java.Volare;

public class Eagle extends Animal implements Volare{
	@Override
	public void verso() {
		System.out.println("Strido");
		
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	@Override
	public void fly() {
		System.out.println("Sto volando");
		
	}

	@Override
	public void typology() {
		System.out.println("(Eagle) ");
		
	}

}
