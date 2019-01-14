package farm;

public class Animal {
	
	private String name;
	private double energy, mealAmount, x, y, speedX, speedY;
	private boolean alive;
	
	Animal() {
		energy = 50;
	}
	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		if(energy <= 17)
			System.out.println(name + " is starving");
		else if (energy <= 50)
			System.out.println(name + " is hungry");
		if(energy > 100)
			energy = 100;
		this.energy = energy;
	}

	public double getMealAmount() {
		return mealAmount;
	}

	public void setMealAmount(double mealAmount) {
		if(mealAmount > 100)
			mealAmount = 100;
		else if (mealAmount < 0) 
			System.out.println("Invalid meal amount, Try again:(0-100) ");
		this.mealAmount = mealAmount;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}

	public boolean isAlive() {
		if(energy>0)
			alive = true;
		return alive;
	}

	public String toString() {
		return "Alive:" + isAlive() + " Name:" + getName() + " Energy:" + getEnergy() + " Location:(" + getX() + "," + getY() + ")";  
	}
	
	public void move() {
		x += speedX;
		y += speedY;
		energy -= 0.1;
		if(isAlive()) {
			System.out.println(getName() + " can't move. It is dead!");
		}
	}
	public void speak(String msg) {
		if(isAlive())
			System.out.println(getName() + " says: " + msg);
	}
	public void sound() {
		if(isAlive())
			System.out.println("Unknown");		
	}
	public double eat() {
		double mealAmountMax = 100 - energy;
		if(!isAlive()) {
			System.out.println(getName() + " is dead!");                       
			return 0;                                                      // didn't eat anything so return 0
		} else if (energy == 100) {
			System.out.println(getName() + " didn't eat as it is full!");  // didn't eat anything so return 0
			return 0;
		} else if (mealAmountMax < mealAmount) {
			energy += mealAmountMax;                                       // ate max amount, so return that value
			System.out.println(getName() + " ate " + mealAmountMax + " units, now it is full");
			return mealAmountMax;
		} else {
			energy += mealAmount;                                          // ate the amount the cow was asked to eat
			System.out.println(getName() + " ate " + mealAmount + " units");
			return mealAmount;
		}	
	}
}


