package P3;

public class FarmTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Farm myFarm = new Farm("stat.dat");
		myFarm.printSummary();
		for(Animal a: myFarm.getAnimals())
		a.setEnergy(Math.random()*100);
		System.out.println("\nAvailable food before feeding: " +
		myFarm.getAvailableFood() + "\n");
		System.out.println("\nInitial list of animals:\n--------------");
		myFarm.printAnimals();
		System.out.println("\nAdding a clone of the second animal\n--------------");
		myFarm.addClone(myFarm.getAnimals()[1]);
		myFarm.printAnimals();
		myFarm.feedAnimals();
		System.out.println("\nAvailable food after feeding: " +
		myFarm.getAvailableFood() + "\n");
		System.out.println("\nAfter SORTING:\n--------------");
		myFarm.animSort();
		myFarm.printAnimals();
		System.out.println("\nFarm summary:\n--------------");
		myFarm.printSummary();
		myFarm.exit("stat.dat");
	}
	
	
	
	
	// I know I made some mistakes in my code so I don't see the "error" of having an increment of animals.
	// I would assume the problem would have to lie with the add() or clone() method being called at some point.
	// QQ
	
	
	
}
