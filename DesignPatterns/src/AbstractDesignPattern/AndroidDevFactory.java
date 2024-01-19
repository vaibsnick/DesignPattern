package AbstractDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {
	@Override
	public Employee createEmployee() {
		System.out.println("Inside AndroidDevFactory");
		return new AndroidDeveloper();
	}
}