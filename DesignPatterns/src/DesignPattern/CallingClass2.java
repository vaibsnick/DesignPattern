package DesignPattern;

public class CallingClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonPatternLazy sgObj1 = SingletonPatternLazy.getObject();
		System.out.println(sgObj1);
		SingletonPatternLazy sgObj2 = SingletonPatternLazy.getObject();
		System.out.println(sgObj2);
		SingletonPatternLazy sgObj3 = SingletonPatternLazy.getObject();
		System.out.println(sgObj3);

	}

}
