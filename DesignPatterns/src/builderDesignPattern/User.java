package builderDesignPattern;

public class User {
	private final String userid;
	private final String userName;
	private final String userNumber;
	
	private User(UserBuilder userBuilder) {
		this.userid = userBuilder.userid;
		this.userName = userBuilder.userName;
		this.userNumber = userBuilder.userNumber;
	}
	

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userNumber=" + userNumber + "]";
	}


	public String getUserid() {
		return userid;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserNumber() {
		return userNumber;
	}
	
	static class UserBuilder{
		private  String userid;
		private  String userName;
		private  String userNumber;
		
		private UserBuilder() {
			
		}
		
		public static UserBuilder building() {
			return new UserBuilder();
		}
		
		public UserBuilder setUserid(String userid) {
			this.userid = userid;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserNumber(String userNumber) {
			this.userNumber = userNumber;
			return this;
		}
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}
	
	
	

}
