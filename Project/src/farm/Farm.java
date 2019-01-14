package farm;

public class Farm {
	Animal[] animals = new Animal[4];
	
	private int availableFood;
	
	Farm() {
		availableFood = 1000;	
		animals[0] = new Chicken(); 
		animals[1] = new Cow();
		animals[2] = new Llama();
		animals[3] = new Llama();
	}
	
	
	public void makeNoise() {
		for (Animal x: animals) {
			x.sound();
		}
	}
	public void feedAnimals() {
		for(Animal x: animals) {
			x.eat();
			if(availableFood < x.getMealAmount())
				System.out.println("There is not enough food in the Farm");
			else
			availableFood -= x.getMealAmount();
		}
	}
	
	void setAvailableFood(int availableFood) {
		if (availableFood > 1000)
			this.availableFood = 1000;
		if (availableFood < 0)
			this.availableFood = 0;
	}
	int getAvailableFood() {
		return availableFood;
	}
	
	//getter method for animals
	Animal[] getAnimals() {
		return animals;
	}
	
}
