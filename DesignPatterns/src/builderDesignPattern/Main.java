package builderDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		//User user =  new User.UserBuilder().setUserid("1").setUserName("Vaibhav").setUserNumber("1234").build();
		//System.out.println(user);
		
//		User user2 =  new User.UserBuilder().setUserid("2").setUserName("Megha").setUserNumber("5678").build();
	//	System.out.println(user2);
		
		User user =   User.UserBuilder.building().setUserid("1").setUserName("Vaibhav").setUserNumber("1234").build();
		System.out.println(user);
	}
	

}
