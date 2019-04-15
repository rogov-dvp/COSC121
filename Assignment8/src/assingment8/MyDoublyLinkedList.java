package assingment8;

public class MyDoublyLinkedList<E> {
	private int size;
	private Node<E> head, tail;
						// i commented on areas where I made new code. This has an error, but at remove(index). Not sure what is the problem . I ran out of time to find it :/
	// Constructors
	public MyDoublyLinkedList() {
		head = tail = null;
	}
	public MyDoublyLinkedList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);	
	}

	// Methods
	
	//*** ADDING *** 
	public void add(E e) { 
		addLast(e);			 
	}
	public void addFirst(E e) {		/** add code to set 'previous' [1 mark] */
		Node<E> newNode = new Node<E>(e); // Create a new node
		if (tail == null) 			// if empty list
			head = tail = newNode; 	// new node is the only node in list
		else {
			newNode.next = head; 	// link the new node with the head
			head = newNode; 		// head points to the new node
			newNode.previous = null;	//ADDED CODE************** Since it is first, going backwards would point to null
		}
		size++;
	}
	public void addLast(E e) {		/** add code to set 'previous' [1 mark]*/
		Node<E> newNode = new Node<E>(e); // Create a new for element e
		if (tail == null) 			// if empty list
			head = tail = newNode; 	// new node is the only node in list
		else {
			newNode.next = null;
			tail.next = newNode; 	// Link the new with the last node
			newNode.previous = tail;	//ADDED CODE************ Before anything is changed, we declare the pre-changed tail to be the previous element of the newNode
			tail = newNode; 		// tail now points to the last node
			
		}
		size++;
	}
	public void add(int index, E e){/** add code to set 'previous' & to improve performance [2 marks] */
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException(); //according to Java doc.
		else if (index == 0)	addFirst(e);
		else if (index == size) addLast(e);
		else {
			Node<E> newNode = new Node<E>(e);
			Node<E> current = getNodeAt(index);
												  // ]Replaced and ADDED NEW CODE*********
			current.previous.next = newNode;      // ]
			current.previous = newNode.previous;  // ]	I replaced is because it was moving current behind newNode. And since
			newNode.next = current;               // ]	current was moved to the left, it increased the index of newNode
			current.previous = newNode;           // ]
			
			size++;
		}
	}
	
	//*** REMOVING *** 
	public E removeFirst() {		/** add code to set 'previous' [1 mark]*/
		if (size == 0)
			return null;
		else {
			Node<E> temp = head; 	// element will be returned
			head = head.next;
			head.previous = null;	//ADDED CODE **********************
			size--;
			if (head == null) 		// if list becomes empty
				tail = null;
			return temp.element; 	// return the removed element
		}
	}
	public E removeLast() {			/** improve performance using 'previous' [1 mark]*/
		if (size == 0)
			return null;
		else if (size == 1) {
	        Node<E> temp = head;
	        head = tail = null;
	        size = 0;
	        return temp.element;
		} else {
			Node<E> temp = tail; 		// to return it
			Node<E> current = head; 	// get ref. to second to last
			for (int i = 0; i < size - 2; i++)
				current = current.next;
			tail = current;
			current.previous = tail.previous.previous;	//ADDED CODE ******************************************
			tail.next = null; 			// remove last
			size--;
			return temp.element; 		// return last
		}
	}
	public E remove(int index) {	/** add code to use and set 'previous' [2 marks]*/
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Node<E> current = getNodeAt(index);
			
			current.previous.next = current.next;		// Not sure what the error is....
			current.next.previous = current.previous; // ADDED NEW CODE ***************************************** 
			size--;
			return current.element;
		}
	}
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {	//if the element exists
			remove(indexOf(e));	//call the other remove method
			return true;		
		} else
			return false;
	}
	public void clear() {
		size = 0;
		head = tail = null;
	}
	
	//*** GETTING ***
	public E getFirst() {
		if (size == 0)
			return null;
		else
			return head.element;
	}
	public E getLast() {
		if (size == 0)
			return null;
		else
			return tail.element;
	}
	public E get(int index) {		/** improve performance using 'previous' [1 mark]*/
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return getFirst();
		else if (index == size - 1)
			return getLast();
		else {
			Node<E> current = getNodeAt(index);
			return current.element;
		}
	}

	//*** SETTING *** 
	public E set(int index, E e) {	/** improve performance using 'previous' [1 mark]*/
		if (index < 0 || index > size - 1)
			return null;
		Node<E> current = getNodeAt(index);
		E temp = current.element;
		current.element = e;
		return temp;
	}

	//*** TOSTRING *** 
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null)
				result.append(", "); 	// Separate two elements with a comma
			else
				result.append("]"); 	// Insert the closing ] in the string
		}
		return result.toString();
	}
	public String toReversedString(){/** write code to return a string representing the list from right to left [3 marks]*/
		StringBuilder result = new StringBuilder("[");
		Node<E> current = head;
		for (int i = size-1; i > 0; i--) {
			result.append(current.element);			//ADDED NEW CODE *********** Basically copy-pasted toString()^^^^. Then changed for loop to descend then changed current = current.previous
			current = current.previous;
			if (current != null)
				result.append(", "); 	// Separate two elements with a comma
			else
				result.append("]"); 	// Insert the closing ] in the string
		}
		return result.toString();
	
	}
	
	//*** CHECKING *** 
	public int size(){return size;}
	public boolean contains(E e) {
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(e))
				return true;
			current = current.next;
		}
		return false;
	}
	public int indexOf(E e) {
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(e))
				return i;
			current = current.next;
		}
		return -1;
	}
	public int lastIndexOf(E e) {	/** improve performance using 'previous' [3 marks]*/
		Node<E> current = tail;
		
		for (int i = size-1; i >= 0; i--) {
			System.out.println(current.element);
			if (current.element.equals(e)) 
				return i;
			current = current.previous;
		}
		return -1;
	}	
	
	//*** HELPER METHODS ***
	private void checkIndex(int idx) {
		if (idx < 0 || idx >= size)
			throw new IndexOutOfBoundsException("Index: " + idx + ", Size: "
					+ size);
	}
	private Node<E> getNodeAt(int index){ /** write code for this method to return a reference to a node at a given index [3 marks]*/
		Node<E> node = head;
		if(index == size-2) {
			return tail.previous;
		}	else if (index > size/2) {
			
				node = tail;
				for(int i = size-3; i > index; i--) {				//ADDED CODE *********    I put i = size-3, size-1, and size-2 are taken care of already
					node = node.previous;
				}
			return node;
		} 	else {

				for(int i = 0; i < index; i++)
					node = node.next;
			return node;
		}
	}

	//*** INNER NODE CLASS *** 
	private static class Node<E> {	/** add code to consider 'previous' [1 mark]*/          
		E element;
		Node<E> next;
		Node<E> previous;

		public Node(E e) {
			element = e;
		}
	}
}