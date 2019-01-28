package fruit;

public class Answers {

 /* Q1) a) Yes
  * b) No
  * c) Yes
  * d) Yes
  * e) No
  * f) Yes
  * g) Yes
  * h) No
  * --------
  * i) Yes
  * j) No
  * k) No
  * l) Yes
  * -------
  * m) No
  * n) No
  * o) Yes
  * 
  * 
  * Q2) apples[0] = new Orange(); is not valid becuase 'Fruit[] apples = new Apple[3];' forms objects of Apples and its inheritance
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 	
  */
	public static void main(String[] args) {
		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		System.out.println(orange instanceof Fruit
				);
	}
	
}
