package March14;

import java.util.Iterator;

public class MyArrayList<E> {
	private static final int INIT_CAP = 10;
	private E[] data = (E[]) new Object[INIT_CAP];
	
	private int size = 0;
	
	
	// size
	public int size() {return size;}
	public boolean isEmpty() {return size==0;}
	// adding
	public void add(int idx, E e) {
		//check if index is valid
		if(idx < 0 || idx > size) 
			throw new IndexOutOfBoundsException();
		
		//add
		//shift right
		for(int i = size-1; i >= idx; i--) {
			data[i + 1] = data[i];
		
			data[idx] = e;
			size++;
		}
		
	}

	//HELPER METHODS
	private void ensureCapactiy() {}
	private void checkIndex(int index) {
		if (index< 0 || index>=size)
			throw new IndexOutOfBoundsException();
	}
	
	private void checkIndexForAdd(int index) {
		//check if index is valid
			if (index< 0 || index>size)
				throw new IndexOutOfBoundsException();
			
	}
	
	public void ensureCapacity() {
		//check if there is enough room
		if(size == data.length)		{		//data.length == capacity, we just dont have capactiy as a var.
			//expand
			E[] newData = (E[]) new Object[2*size+1];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}

	}
	//removing
	public E remove(int index) {					// size: 0 1 2 3
		checkIndex(index);
		E temp = data[index];
		for(int i = index+1; i < size-1; i++) {
			data[i -1] = data[i];
		}
		data[size-1] = null;
		size--;
		return temp;
	}
	public boolean remove(E e) {		// get index i of e then remove(i)
		boolean status = false;
		return status;
	}
	
	public void trimToSize() {
		if(size != data.length) {
		E[] newData = (E[]) new Object[size];
		System.arraycopy(data, 0, newData, 0, size);
		data = newData;
		}
	}
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}
	
	public Iterator<E> iterator() {
		return new MyIterator();
	}
	private class MyIterator implements Iterator<E> {
		int nextIndex = 0; //index of next item
		public boolean hasNext() {
			return nextIndex < size;
		}
		public E next() {
			
			return data[nextIndex++];
		}
	}
	
}
