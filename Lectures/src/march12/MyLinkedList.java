package march12;

import java.util.Iterator;

public class MyLinkedList<E>{
	
	private Node<E> head, tail;
	private int size;
	//methods
	//size
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	//adding
	public void addFirst(E e) {
		Node<E> node= new Node<>(e);
		
		if(head == null) {
			head = tail = node;
		} else
			node.next = head;
		head = node;
		
		node.next = head;
		head = node;
		size++;
	}

	
	public void addLast(E e) {
		Node<E> node = new Node<>(e);
		
		if(head == null) {
			head = tail = node;
		} else
			node.next = head;
		head = node;
		
		tail.next = node;
		tail = node;
		size++;							// since we are adding a new node, size++;
	}
								
	public void add(int idx, E e) {
		
		if(idx<0||idx>size)
			throw new IndexOutOfBoundsException();
		else if (idx==0)
			addFirst(e);
		else if (idx == size) 
			addLast(e);
		else {
	
		Node<E> node = new Node<>(e);
			
		Node<E> previous = head;

		for(int i = 0; i < idx-1;i++ ) 
			previous = previous.next;
		
		node.next = previous.next;						// node.next pointing to it's next
		previous.next = node;							// previous.next pointing to the new node
		size++;											// increase size++; Does not do it automatically
		
		}
		
	}
	public void add(E e) {
		//addLast(e);
		add(size,e);			// same as add
	}
	
	//removing
	 public E removeFirst() {
		if(head == null)
			 return null;
		 
			Node<E> temp= head;
			head = head.next;
			
		if (head == null) 
			tail = null;
		
			size--;
			return temp.element;
	 }
	 
	 public E removeLast() {
		 if(head ==null)
			 return null;
		 else if (size == 1) 
			 return removeFirst();
			 else {
//		 
		 Node<E> node = head;
		 Node<E> temp = tail;
		 for(int i = 0; i < size -2; i++) {    // 2nd last node
			 node = node.next;
		 }
		 tail = node;
		 node.next = null;
		 size--;
		 return temp.element;
		 	}
		 
	 }
//	 public E remove(int index) {
//		 if(index<0 || index>size) 
//			 return null;
//		 else if (index == 0) 
//			 return removeFirst();
//		 else if(index == size-1) 
//			 return removeLast();
//		 else {
//		 Node<E> node = head;
//		 for(int i = 0; i < index-1;i++) {
//			 node= node.next;
//		 }
//		 Node<E> current = node.next;
//		 node.next = current.next;
//		 size--;
//		 }
//				 
//	 }
//	 public boolean remove(E e) {}
//	public void clear() {
//		head= tail = null;
//		size = 0;
//		}
//	
//	
	
	private class Node<E> {
		
		public MyLinkedList<E>.Node<E> next;
		E element;
//		Node(E) ;
			public Node(E e) {
				element = e;
			}
	}

//	public E get(int index) {
//		Node<E> current = head;
//		for(int i = 0; i < index; i++) {
//			current = current.next;
//		}
//	}
	
	private class MyIterator implements Iterator<E> {				//Node<E> is a type
		Node<E> current = head;
		
		public boolean hasNext() {
			return current != null;
		}
		public E next() {
			Node<E> temp = current;
			current = current.next;
			return temp.element;
		}
		
	}
//	private class Node<E> {
//		E element;
//		Node<E> next;
//		public void Node(E e) {
//			element = e;
//		}
//	}
}
