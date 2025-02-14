import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		
		//1.add(data)
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		
		//2.add(index , data)
		al1.add(3, 200);
		System.out.println(al1);
		
		//10.set()
		al1.set(3,30);
		System.out.println(al1);
		
		//11.get(int ,index)
		System.out.println(al1.get(2));
		
		//12.indexOf()
		System.out.println(al1.indexOf(30));
		//13.LastIndexOf()
		System.out.println(al1.lastIndexOf(30));
		
		//14.contains()
		System.out.println(al1.contains(30));
		
		//15.remove(int index)
		System.out.println(al1.remove(0));
		
 
		
		ArrayList al2=new ArrayList();
		
		//3.add(data)
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		System.out.println(al2);
		
		//4.addAll(data)
		al1.addAll(al2);
		System.out.println(al1);
		
		//5.addAll(index , data)
		al1.add(0,al2);
		System.out.println(al1);
		
		ArrayList al3 =new ArrayList();
		ArrayList al4 =new ArrayList();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		
		al4.add(10);
		al4.add(20);
		al4.add(300);
		al4.add(400);
		al4.add(500);
		
		//6.retainAll()
		al3.retainAll(al4);
		System.out.println(al3);
		
		//7.reverse of retailAll and give output as 30,40,50
//		al3.removeAll(al4);
//		System.out.println(al3);
		
		//8.size of ArrayList
		System.out.println(al1.size());
		System.out.println(al2.size());
		System.out.println(al3.size());
		System.out.println(al4.size());
		
		//9.isEmpty()
		System.out.println(al1.isEmpty());
		
		
	}

}
