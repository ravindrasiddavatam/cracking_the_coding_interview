package Stacks_and_Queues_theory;

public class StackMain {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		DynamicStack stack = new DynamicStack(5);
		
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.push(19);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
	}  

}
