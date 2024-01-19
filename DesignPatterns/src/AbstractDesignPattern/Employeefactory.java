package AbstractDesignPattern;

public class Employeefactory {
	//get Employee
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		System.out.println("Inside Employeefactory");
		return factory.createEmployee();
	}
}
