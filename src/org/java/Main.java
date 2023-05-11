package org.java;

import org.java.object.Animal;

import animals.org.java.Dog;
import animals.org.java.Dolphin;
import animals.org.java.Eagle;
import animals.org.java.Sparrow;
import manager.org.java.AnimalManager;
import manager.org.java.Nuotare;
import manager.org.java.Volare;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		Sparrow s = new Sparrow();
		Eagle e = new Eagle();
		Dolphin o = new Dolphin();
		Animal[] animals = {d,s,e,o};
		AnimalManager a = new AnimalManager();
		for(int i=0; i<animals.length; i++) {
			animals[i].typology();
			animals[i].verso();
			animals[i].mangia();
			animals[i].dormi();
			if(animals[i] instanceof Nuotare) {
				Nuotare n = (Nuotare) animals[i];
				a.doswim(n);
			}
			else if(animals[i] instanceof Volare) {
				
				Volare n = (Volare) animals[i];
				a.dofly(n);
			}
			else {
				System.out.println("Non sto nuotanto e non sto volando");
			}
			System.out.println("---------------");
		}
	}
}
