package Project2;

import java.util.Arrays;
import java.util.Comparator;

public class Farm implements Cloneable {
	private double availableFood;
	private Animal[] animals = new Animal[100];
	public Farm() {
		setAvailableFood(1000);
		add(new Chicken());
		add(new Cow());
		add(new Llama());
		add(new Llama());
	}
	public void makeNoise(){			// all animals make their sound (Moo, Cluck, etc)
		for(Animal animal: animals)
			animal.sound();
	}
	public void feedAnimals(){ 			// restore energy of all animals and deduct amount eaten from availableFood
		for(Animal animal : animals)
			if(availableFood >= Math.min(animal.getMealAmount(), (100-animal.getEnergy()))) 
			// no penalty if student uses:  if(availableFood >= animal.getMealAmount())
				availableFood -= animal.eat();
			else
				System.out.println("Not enough food for your animals! You need to collect more food items.");
	}
	public double getAvailableFood() {
		return availableFood;
	}
	public void setAvailableFood(double availableFood) {
		if(availableFood>=0 && availableFood<=1000)
			this.availableFood = availableFood;
	}
	
	//----------- Added methods and class-----------------//
	
	public Animal[] getAnimals() {
		int counter = 0;
		for(Animal a:animals) {
			if(a instanceof Animal)
				counter++;
		}
		animals = new Animal[counter];
		return animals;
	}	
	
	
	boolean add(Animal anim) {
		boolean status = false;
		for(int i = 0; i<animals.length;i++) {
			if(animals[i] == null)
				animals[i] = anim;
				status = true;
		}
		return status;	
	}
	
	void animSort() {
		Arrays.sort(animals, new AnimalComparator());
		}
	
	
	
	boolean addClone(Animal anim) throws CloneNotSupportedException{
		boolean status = false;
		Animal animalsClone = (Animal) anim.clone();
		for(Animal a: animals) {
			if(a == null) {
				a = animalsClone;
				status = true;
				break;
			}
		}
		return status;
	}
	
	void displayAnimals() {
		for(Animal a: animals) {
			if(a != null) {
				System.out.printf("%s: %b at (%.1f,%.1f) Energy=%f",a.getName(),a.isAlive(),a.getX(),a.getY(),a.getEnergy());
			}
		}
	}
	
	int getNumChicken() {
		int counter = 0;
		for(Animal a: animals) {
			if(a instanceof Chicken)
				counter++;
		}
		return counter;
	}
	int getNumCows() {
		int counter = 0;
		for(Animal a: animals) {
			if(a instanceof Cow)
				counter++;
		}
		return counter;
	}
	int getNumLlamas() {
		int counter = 0;
		for(Animal a: animals) {
			if(a instanceof Llama)
				counter++;
		}
		return counter;
	}
	
	void displaySummary() {
		System.out.printf("- %d animals (%d Chicken, %d Cows, and %d Llamas)",getAnimals().length,getNumChicken(),getNumCows(),getNumLlamas());
		System.out.println(getAvailableFood() + "units of available food");
	}
	
	
}

class  AnimalComparator implements Comparator<Animal>{				// Used to make an object for the Arrays.sort(animals, new AnimalComparator())
	public int compare(Animal o1, Animal o2) {						// I used this because I don't know how to have Arrays.sort() attributes of an array of object
		int num = (int)(o1.getEnergy() - o2.getEnergy());
		return num;
	}
}

