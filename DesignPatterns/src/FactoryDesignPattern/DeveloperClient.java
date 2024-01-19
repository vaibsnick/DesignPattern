package FactoryDesignPattern;

public class DeveloperClient {

	public static void main(String[] args) {
//		Employee employee = new AndroidDeveloper();
//		employee.salary();
//		Employee employee2 = new WebDeveloper();
//		employee2.salary();
		Employee employee =  EmployeeFactory.getEmployee("Web Developer");
		employee.salary();
	}
}
