package March26;

public class Ex1b {
	public static void main(String[] args) {

//		Edible orange = new Edible() {
//				public void eat() {
//					System.out.println("Peel and Eat!");
//				}
//		};
//		orange.eat();
		
//		Edible chicken = new Edible() {		// anonymous inner class is declared w/out class name. Can only be used once
//			public void eat() {
//				System.out.println("Cook and Eat!");
//			}
	//
//		};
//		chicken.eat();
		
		
		//same this as above:							args: (x,y)    arrow: ->     body: sysout
		//One method only though can be implemented. ie. Edible has one method only so its trivial for java to figure out what method to use
		Edible orange = n-> System.out.println("Peel and Eat!" + n);
		orange.eat(3);
		
		Edible chicken = (n)-> System.out.println("Cook and Eat!" + n);
		chicken.eat(4);
		
		
		A item = new A() {
			void a() {
				System.out.println("A");
			}
		};
	}

}

class A{
	void a() {}
}


//class Chicken implements Edible {
//	public void eat() {
//		System.out.println("Cook and Eat!");
//	}
//}





//class Orange implements Edible {
//	public void eat() {
//		System.out.println("Peel, and Eat!");
//	}
//}