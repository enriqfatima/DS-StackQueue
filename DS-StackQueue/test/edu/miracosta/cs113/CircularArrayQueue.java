package edu.miracosta.cs113;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class CircularArrayQueue<E> implements Queue<String> {
	//use 4 int data members to rep the queue 
	private int front ; //font of queue
	private int rear ; // rear of queue
	private int size ; //size of queue
	private int cap ; //capacity of queue 
	
	private static final int DEFAULT_CAP = 0 ; //INITITAL CAPACITY OF THE QUEUE 
	private E[] theData ; //array that holds the data
	public E[] getTheData() {
		return theData;
	}

	public void setTheData(E[] theData) {
		this.theData = theData;
	}
	
	public CircularArrayQueue() {//constructor which the defualt initial capacity of the queue
		this(DEFAULT_CAP);
	}

	public CircularArrayQueue(int initiialCapacity) {//constructor with specific data of the queue 
		size = 0 ; //set the size of the queue = to 0 
		rear = 0 ; //set the rear = to 0 
		front = 0 ; //front tof the queue is 0 since there is no other data 
		cap = initiialCapacity ; // we want to set the capacity of the queue to the initial capacity of the queue 
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
