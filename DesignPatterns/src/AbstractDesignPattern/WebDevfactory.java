package AbstractDesignPattern;

public class WebDevfactory extends EmployeeAbstractFactory{
	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}
}