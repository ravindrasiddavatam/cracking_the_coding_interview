package LinkedList_theory_KK;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LL l = new LL();
		l.insertFirst(2);
		l.insertFirst(3);
		l.insertFirst(4);
		l.insertFirst(5);
		l.insertLast(99);
		l.insert(100, 3);
		l.display();
		System.out.println(l.deleteFirst());
		l.display();
		l.deleteLast();
		l.display();

	}

}
