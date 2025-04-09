package LinkedList_theory_KK;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DLL l = new DLL();
//		l.insertFirst(2);
//		l.insertFirst(3);
//		l.insertFirst(4);
//		l.insertFirst(5);
//		l.insertLast(99);
//		l.insertAfter(4, 12);
//		l.display();
		// l.insertLast(99);
//		l.insert(100, 3);
//		l.display();
//		System.out.println(l.deleteFirst());
//		l.display();
//		l.deleteLast();
//		l.display();
//		l.deleteLast();
//		l.display();
//		l.delete(1);
//		l.display();
//		System.out.println(l.find(100));
		
		
//		CLL l = new CLL();
//		l.insert(2);
//		l.insert(3);
//		l.insert(4);
//		l.insert(5);
//		l.insert(99);
//		l.insert(4);
//		l.display();
//		l.delete(5);
//		l.display();
		
		LL first = new LL();
		LL second = new LL();
		
		first.insertLast(1);
		first.insertLast(3);
		first.insertLast(5);
		
		second.insertLast(1);
		second.insertLast(2);
		second.insertLast(9);
		second.insertLast(14);
		
		LL ans = LL.merge(first, second);
		ans.display();
	}

}
