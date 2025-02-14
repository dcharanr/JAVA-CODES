import java.util.LinkedList;

public class LinkedListtt {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.addFirst(20);
		System.out.println(li);
		System.out.println(li.peek());
		System.out.println(li.peekLast());
//		System.out.println(li.poll());
//		System.out.println(li.pollLast());
//		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.addLast(50);
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		
		
	}

}
