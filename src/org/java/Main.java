package org.java;

import org.java.object.Animal;

import animals.org.java.Dog;
import animals.org.java.Dolphin;
import animals.org.java.Eagle;
import animals.org.java.Sparrow;
import manager.org.java.AnimalManager;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		Sparrow s = new Sparrow();
		Eagle e = new Eagle();
		Dolphin o = new Dolphin();
		Animal[] animals = {d,s,e,o};
		for(int i=0; i<animals.length; i++) {
			animals[i].verso();
			animals[i].mangia();
			animals[i].dormi();
		}
		AnimalManager a = new AnimalManager();
		a.doswim(d);
		a.dofly(e);
		
	}
}
