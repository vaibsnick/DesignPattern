package builderDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User.UserBuilder()
				.setEmailId("dev@dev.com")
				.setUserId("1")
				.setUserName("Developer")
				.build();
	}

}
