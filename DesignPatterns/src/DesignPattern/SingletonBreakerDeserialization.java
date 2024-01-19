package DesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonBreakerDeserialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonPatternLazy singletonPatternLazy = SingletonPatternLazy.getObject();
		System.out.println(singletonPatternLazy);
		ObjectOutputStream objectOutputStream =  new ObjectOutputStream(new FileOutputStream("ab.ob"));
		objectOutputStream.writeObject(singletonPatternLazy);
		System.out.println("Serialization done");
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ab.ob"));
		SingletonPatternLazy singletonPatternLazy2 =  (SingletonPatternLazy) objectInputStream.readObject();
		System.out.println(singletonPatternLazy2);
	}
}
