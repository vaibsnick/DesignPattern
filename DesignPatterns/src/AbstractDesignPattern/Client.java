package AbstractDesignPattern;

public class Client {
	public static void main(String[] args) {
		Employee employee = Employeefactory.getEmployee(new AndroidDevFactory());
		employee.salary();
		System.out.println("Employee is "+employee.name());
		////////////////////////////////////////////////
		Employee employee2 =  Employeefactory.getEmployee(new WebDevfactory());
		employee2.name();
		System.out.println("Employee is "+employee2.name());
	}
}
