package P4;

import java.io.Serializable;
import java.util.Iterator;


public class AnimalList implements Iterable<Animal>, Serializable {
//	LinkedList<Animal> list = new LinkedList<>();
	private AnimalNode<Animal> head, tail;
	private int size;

	// methods
	public int size() {
		return size;
	}

	boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	void addFirst(Animal animal) {
		AnimalNode<Animal> node = new AnimalNode<>(animal);

		if (head == null)
			head = tail = node;
		else
			node.next = head;

		head = node;
		node.next = head;
		head = node;
		size++;
	}

	void addLast(Animal animal) {
		AnimalNode<Animal> node = new AnimalNode<>(animal);

		if (tail == null)
			head = tail = node;
		else
			node.next = head; // node which is referenced with head.
		head = node;

		tail.next = node; // current tail element points to node
		tail = node; // tail equals node (last eme)
		size++;
	}

	public void add(int idx, Animal animal) {

		if (idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		else if (idx == 0)
			addFirst(animal);
		else if (idx == size)
			addLast(animal);
		else {
			AnimalNode<Animal> node = new AnimalNode<>(animal);
			AnimalNode<Animal> previous = head;

			for (int i = 0; i < idx - 1; i++) {
				previous = previous.next;
			}
			node.next = previous.next;
			previous.next = node;
			size++;
		}
	}

	public Animal removeFirst() { // removes first and returns the removed element
		if (head == null)
			return null;

		AnimalNode<Animal> temp = head;
		head = head.next;

		if (head == null)
			tail = null;

		size--;
		return temp.element;
	}

	public Animal removeLast() {
		if (head == null)
			return null;
		else if (size == 1)
			return removeFirst();
		else {

			AnimalNode<Animal> node = head;
			AnimalNode<Animal> temp = tail;
			for (int i = 0; i < size - 2; i++) {
				node = node.next;
			}
			tail = node;
			node.next = null;
			size--;
			return temp.element;

		}
	}
		
		
	Animal remove(int index) {
		if(index < 0 || index > 0)
			throw new IndexOutOfBoundsException();
		else if (index == 0) 
			return removeFirst();
		else if (index == size)
			return removeLast();
		else {
			AnimalNode<Animal> node = head;
			
			for(int i = 0; i < index-1; i++)
				node = node.next;
			
			AnimalNode<Animal> current = node.next;
			node.next = current.next;
			size--;
			return current.element;
		}
	}
		
		
		Animal getFirst() {
			if(head == null)
				return null;
			else {
				AnimalNode<Animal> node = head;
				return node.element;
			}
		}
		Animal getLast() {
			if(head == null)
				return null;
			else {
			AnimalNode<Animal> node = tail;
			return node.element;
			}
		}
	
		Animal get(int index) {
			if(index < 0 || index > size)
				throw new IndexOutOfBoundsException();
			else if(index == 0)
				return getFirst();
			else if(index == size)
				return getLast();
			else {
				AnimalNode<Animal> node = head;
				
			for(int i =0; i < index; i++)
				node = node.next;
			return node.element;
			}
		}
		
		Animal set(int index, Animal animal) {
			if(index < 0 || index > size)
				throw new IndexOutOfBoundsException();
			else if (index == 0) {
				Animal rf = removeFirst();
				addFirst(animal);
				return rf;
			}else if(index == size)  {
				Animal rl = removeLast();
				addLast(animal);
				return rl;
			}
			else {
				AnimalNode<Animal> addNew = head;
				AnimalNode<Animal> node = head;
				AnimalNode<Animal> current = head;
				
			for(int i = 0; i < index -1 ; i++) {
				node = node.next;
			}
			node.next = current;
			node.next.next = addNew.next;
			node.next = addNew;
			return current.element;							// returns what was replaced. NOt sure why this isnt void
			}
			
		}

		public String toString() {
			String allAnimals = "";
			AnimalNode<Animal> node = head;
			
			for(int i = 0; i < size; i++) {
			String boo = node.element.isAlive()?"alive":"dead";
			allAnimals += node.element.getName() + "\t: " + boo + " at (" + node.element.getX() + "," + node.element.getY() + ")" +
					" Energy=" + node.element.getEnergy() + "\n";
			node = node.next;
			}
			
			return allAnimals;
		}
		
		String getHungryAnimals() {				// return value?	
			boolean anyHungry = false;
			String allAnimals = "";
			
			AnimalNode<Animal> node = head;
			for(int i =0; i < size; i++) {
				if(node.element.getEnergy() < 50) {
					anyHungry = true;
					String boo = node.element.isAlive()?"alive":"dead";
					allAnimals += node.element.getName() + "\t: " + boo + " at (" + node.element.getX() + "," + node.element.getY() + ")" +
							" Energy=" + node.element.getEnergy() + "\n";
					node=node.next;
				}	
			}
			if(anyHungry == false)
				return null;
			return allAnimals;

		}
		
		
		String getStarvingAnimals() {
			boolean anyHungry = false;
			String allAnimals = "";
			AnimalNode<Animal> node = head;
			for(int i =0; i < size; i++) {
				if(node.element.getEnergy() < 17) {
					anyHungry = true;
					String boo = node.element.isAlive()?"alive":"dead";
					allAnimals += node.element.getName() + "\t: " + boo + " at (" + node.element.getX() + "," + node.element.getY() + ")" +
							" Energy=" + node.element.getEnergy() + "\n";
					node=node.next;
				}	
				
			}
			if(anyHungry == false)
				return null;
			return allAnimals;
		}			
		
		String getAnimalsInBarn() {
			boolean anyHungry = false;
			String allAnimals = "";
			AnimalNode<Animal> node = head;
			for(int i = 0; i < size; i++) {
				
			}
			if(node.element.getX() > 450 && node.element.getX() < 550 && node.element.getY() > 50 && node.element.getY() < 150) {
				anyHungry = true;
				String boo = node.element.isAlive()?"alive":"dead";
				allAnimals += node.element.getName() + "\t: " + boo + " at (" + node.element.getX() + "," + node.element.getY() + ")" +
						" Energy=" + node.element.getEnergy() + "\n";
				node=node.next;
			}	
			if(anyHungry == false)
			return null;
		return allAnimals;	
		}
		
		double getRequiredFood() {
			AnimalNode<Animal> node = head;
			double food = 0;
			for(int i = 0; i < size; i++) {
				if(node.element.getEnergy() < 100) {
					food += 100 - node.element.getEnergy();
					
				}
			}
			return food;
		}
		
		int getByType(Animal anim) {						//bonus
			int counter = 0;

			if(anim instanceof Cow)  {
				for(int i = 0; i < size; i++) 
					if(anim instanceof Cow) 
						++counter;
			}
			else if (anim instanceof Chicken) {
				for(int i = 0; i < size; i++) 
					if(anim instanceof Chicken) 
						++counter;
				return counter;
			}
			else {
				for(int i = 0; i < size; i++) 
				if(anim instanceof Llama) 
					++counter;
		}
			return counter;
		}
			
		

		
		
		public Iterator<Animal> iterator() {
			return new MyIterator();
		}
		class MyIterator implements Iterator<Animal> {
			private AnimalNode<Animal> current = head;
			public boolean hasNext() {
				return (current != null);
			}
			public Animal next() {
				Animal temp = current.element;	
				current = current.next;
				return temp;
			}
		}
		
		

	class AnimalNode<Animal> {
		Animal element;
		AnimalNode<Animal> next;

		public AnimalNode(Animal animal) {
			element = animal;
		}
	}


}

