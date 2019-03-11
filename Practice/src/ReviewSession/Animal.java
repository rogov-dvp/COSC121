package ReviewSession;

public abstract class Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
		Bird b = new Bird();
		Snake s = new Snake();
		
		c.sound();c.summary();
		b.sound();b.summary();
		s.sound();s.summary();
	}

	private String name;
	private int legs;
	private boolean legal;

	public Animal(String name, int legs, boolean legal) {
		this.name = name;
		this.legs = legs;
		this.legal = legal;
	}

	public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public boolean isLegal() {
		return legal;
	}

	public abstract void sound();

	public abstract void summary();
}

class Cat extends Animal {

	public Cat() {
		super("Mittens", 4, true);
	}

	public void sound() {
		System.out.println("Meow");
	}

	public void summary() {
		System.out.println("Name: " + getName() + " leg #: " + getLegs() + " legal? " + isLegal());
	}

}

class Bird extends Animal {
	public Bird() {
		super("Mich", 2, true);
	}

	public void sound() {
		System.out.println("Cockadoodaldoo!!!");
	}

	public void summary() {
		System.out.println("Name: " + getName() + " leg #: " + getLegs() + " legal? " + isLegal());
	}
}

class Snake extends Animal {
	public Snake() {
		super("hehe", 0, false);
	}

	public void sound() {
		System.out.println("Sssssss");
	}

	public void summary() {
		System.out.println("Name: " + getName() + " leg #: " + getLegs() + " legal? " + isLegal());
	}
}
