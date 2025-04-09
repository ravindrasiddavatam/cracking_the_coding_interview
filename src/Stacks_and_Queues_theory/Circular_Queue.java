package Stacks_and_Queues_theory;

public class Circular_Queue {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	protected int front = 0;
	protected int end = 0;
	protected int size = 0;
	
	public Circular_Queue() {
		this(DEFAULT_SIZE);
	}
	
	public Circular_Queue(int size) {
		this.data = new int[size];
	}
	
	public boolean isFull() {
		return size == data.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean enqueue(int item) {
		
		if(isFull()) {
			return false;
		}
		data[end] = item;
		end = (end + 1) % data.length;
		size++;
		return true;
	}
	
	public int dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty!");
		}
		int removed = data[front];
		front = (front + 1) % data.length;
		size--;
		return removed;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		int i = front;
		
		do {
			System.out.print(data[i] + " -> ");
			i = (i + 1) % data.length;
		}while (i != end);
		System.out.println("END");
	}
	
}
