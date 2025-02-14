import java.util.ArrayList;

public class ArrayListt1EvenCheck {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(33);
		al1.add(40);
		al1.add(55);
		
		for(int i=0;i<al1.size();i++)
		{
			Integer a=(Integer)al1.get(i);
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
	}

}
