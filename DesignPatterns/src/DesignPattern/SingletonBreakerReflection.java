package DesignPattern;

import java.lang.reflect.Constructor;

public class SingletonBreakerReflection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SingletonPatternLazy singletonPatternLazy =  SingletonPatternLazy.getObject();
		System.out.println(singletonPatternLazy);
		
		Constructor<SingletonPatternLazy> constructor = SingletonPatternLazy.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonPatternLazy singletonPatternLazy2 = constructor.newInstance();
		System.out.println(singletonPatternLazy2);
		
	}

}
