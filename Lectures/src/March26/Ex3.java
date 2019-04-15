package March26;

public class Ex3 {

	public static void main(String[] args) {
//		MathOp add = new MathOp() {
//			
//			public int apply(int a, int b) {
//			return a + b;
//			}
//		};

		MathOp add = (int a, int b) -> {
			return a + b;
		};
		MathOp sub = (a, b) -> a - b;
		MathOp mul = (a, b) -> a * b;
		MathOp div = (a, b) -> a / b;

		System.out.println((add.apply(3, 4)));
		System.out.println((mul.apply(3, 4)));

//		Math sub = new MathOp() {
//			public int apply(int a, int b)  {
//				return a - b;
//			}
//			
//		};

		Visual square = (a) -> System.out.println("Square. Side=" + a);
		Visual circle = (a) -> System.out.println("Circle. Radius=" + a);

		square.draw(2);
		circle.draw(5);

		// 3
		A a = new A() { // 'a' IS AN OBJECT. So it has a function
			public int m(int x, int y) {
				return x + y;
			}
		};
		B b = new B() {
			public int m() {
				return 20;
			}
		};// DONT FORGET SEMICOLON
		
		
		
		C c = x -> c_helper(x);

	}
	
	private static void c_helper(int x) {
		x++;
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);

		
	}
}

interface MathOp {
	int apply(int a, int b);
}

interface Visual {
	void draw(int size);
}

//3
//interface A {
//	int m(int x, int y);
//}

interface B {
	int m();
}

interface C {
	void m(int x);
}