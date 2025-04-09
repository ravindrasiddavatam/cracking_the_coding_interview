package Stacks_and_Queues_theory;

public class CustomStack {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int ptr = -1;
	
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	
	public CustomStack(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		
		if(isFull()) {
			System.out.println("Stack is full!!");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
	}
	
	public int pop() throws CustomException {
		if(isEmpty()) {
			throw new CustomException("Cannot pop from an empty stack!!");
		}
		return data[ptr--];
	}
	
	public int peek() throws CustomException{
		
		if(isEmpty()) {
			throw new CustomException("Cannot peek from an empty stack!!");
		}
		return data[ptr];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return ptr == -1;
	}

	protected boolean isFull() {
		// TODO Auto-generated method stub
		
		return ptr == data.length-1;
	}
}
