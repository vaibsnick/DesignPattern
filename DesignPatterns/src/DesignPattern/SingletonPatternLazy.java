package DesignPattern;

import java.io.Serializable;

public class SingletonPatternLazy implements Serializable{
	private static SingletonPatternLazy singeltonPattern;
	private SingletonPatternLazy() {
		/*
		 * if(singeltonPattern != null) { throw new
		 * RuntimeException("You are trying to break Singleton Design Pattern"); }
		 */
	}
	public static SingletonPatternLazy getObject() {
		synchronized (SingletonPatternLazy.class) {
			if (singeltonPattern == null) {
				singeltonPattern = new SingletonPatternLazy();
			}
		}
		return singeltonPattern;
	}
	
	public Object readResolve() {
		return singeltonPattern;
	}
}