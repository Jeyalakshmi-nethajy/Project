package Design;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Design");
		
		Employee emp1 = new Employee(100, "Jei");
		Employee emp2 = new Employee(100, "Jei");
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		
	}

}