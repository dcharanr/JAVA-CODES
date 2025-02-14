import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class SortAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		return id1.compareTo(id2);
	}
}
class SortDes implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		return -1*id1.compareTo(id2);
	}
}
class SortName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
class Employee {
	private int id;
	private String name;
	private String email;
	private int sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String email, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+email+" "+sal+" ";
	}
	
}
public class Employeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAsc d1=new SortAsc();
		SortDes d2=new SortDes();
		SortName d3=new SortName();
		Scanner scan=new Scanner(System.in);
		TreeSet<Employee> ts=null;
		System.out.println("Sort by: \n 1.ID(L to H)\n 2.ID(H to L)\n 3.Name");
		int option=scan.nextInt();
		if(option==1) {
			ts= new TreeSet<Employee>(d1);
		}
		else if(option==2) {
			ts=new TreeSet<Employee>(d2);
		}
		else if(option==3) {
			ts=new TreeSet<Employee>(d3);
		}
		else {
			System.out.println("Invalid option");
			System.exit(0);
		}
		System.out.println("Enter the number of employees");
		int n=scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the deatils of"+(i+1)+"Employee");
			String details=scan.nextLine();
			String [] input=details.split(",");
			Employee e=new Employee(Integer.parseInt(input[0]), input[1], input[2],Integer.parseInt(input[3]));
			ts.add(e);
		}
		System.out.println(ts);
	}

}
