package Stacks_and_Queues_theory;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Circular_Queue queue = new Circular_Queue();
		queue.enqueue(10);
		queue.enqueue(20); 
		queue.enqueue(30);
		queue.enqueue(40);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		
		queue.display();
		

	}

}
