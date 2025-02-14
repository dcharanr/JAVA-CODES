import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private String email;
	private String address;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

public class Encapsulation1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employee to create");
		int n=scan.nextInt();
		scan.nextLine();
		Employee [] a=new Employee[n];
		for(int i=0;i<n;i++)
		{
			Employee e = new Employee();
			System.out.println("Enter the details");
			String details=scan.nextLine();
			String [] arr=details.split(" ");
			
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setAddress(arr[3]);
			
			a[i]=e;
		}
		for(Employee e:a)
		{
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getAddress());
		}
	}

}
