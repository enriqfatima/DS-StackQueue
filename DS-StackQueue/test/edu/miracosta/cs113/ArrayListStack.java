package edu.miracosta.cs113;
import java.util.ArrayList;
import java.util.EmptyStackException; 
public class ArrayListStack<E> implements StackInterface<E> {
	
	private static final int INITIAL_CAPACITY = 0; // constant for the initial capacity of the stack
	int topOfStack = 0 ; //empty stack (initial value)
	private E[] theData ; // holds the actual storage for the stack 
	

	public E[] getTheData() {
		return theData;
	}

	public void setTheData(E[] theData) {
		this.theData = theData;
	} 
	
	@SuppressWarnings("unchecked")
	public ArrayListStack()
	{
		theData = (E[]) new Object[INITIAL_CAPACITY] ;
	}

	@Override
	public boolean empty() { //returns true if the stack is empty else it returns false 
		
		return false;
	}

	@Override
	public E peek() { //returns the obj to the top of the stack without actually removing it 
		if(empty()) //if stack is empty then throw the exception of EmptyStackException
		{
			throw new EmptyStackException(); 
		}		
		return theData[topOfStack]; //no removal 
	}

	@Override
	public E pop() {//returns the obj to the top of the stack and removed it
		if(empty()) //if stack is empty then throw the exception of EmptyStackException
		{
			throw new EmptyStackException(); 
		}
		//else return the obj to the top of the stack and then it is removed 
		return theData[topOfStack--]; //remove the item from the top of the stack
	}

	@Override
	public E push(E obj) {
		if(topOfStack == theData.length - 1)
		{
			//move the new item to the top of the stack and other reallocate 
		}
		topOfStack ++ ; //increment the topOfStack
		return obj; //want to return the obj.
	}

}
