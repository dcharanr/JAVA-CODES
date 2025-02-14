import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(10,"charan");
		hm.put(20, "Reddy");
		hm.put(30, "Virat");
		//		hm.clear();
		
//		System.out.println(hm.isEmpty());
		
//		System.out.println(hm.get(10));
		
//		hm.replace(20, "Kumar");
//		hm.replace(20,"Reddy","Kumar");
//		hm.replace(20,"Devarapalli","Kumar");
		
//		System.out.println(hm.getOrDefault(10, "Invalid"));
//		System.out.println(hm.getOrDefault(11, "Invalid"));
		
//		hm.putIfAbsent(40,"Devaraplli");
		
//		KeySet();
//		Set s=hm.keySet();
//		Iterator itr =s.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
//		Values();
//		Collection c=hm.values();
//		Iterator itr =c.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		entrySet();
//		Set s=hm.entrySet();
//		Iterator itr =s.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
//		System.out.println(hm.containsKey(10));
		
//		System.out.println(hm.containsValue("Char"));
		
//		System.out.println(hm);
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(10,"charan");
		lhm.put(20, "Reddy");
		lhm.put(30, "Virat");
		System.out.println(lhm);
	}

}
