public class SuperStack<T> {
	
	private T[] items;
	private int top;
	
	public MyStack(int size) {
		
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == items.length;
	}
	
	public Object pop() {
		return true; 
	}
	
	public boolean push(Object o) {
	  if(top!= items.length)
		return true;
	}
	

	
}
