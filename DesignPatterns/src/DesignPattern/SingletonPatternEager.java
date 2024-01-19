package DesignPattern;

public class SingletonPatternEager {

	private static SingletonPatternEager singletonPatternEager = new SingletonPatternEager();
	
	public static SingletonPatternEager getObject() {
		return singletonPatternEager;
	}
}
