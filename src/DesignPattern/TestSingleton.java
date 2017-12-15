package DesignPattern;

import java.util.Arrays;

/**
 * Ensure that a class has only one instance and provide a global point of
 * access
 * 
 * @author mouni
 *
 */

class Singleton {
	public static volatile Singleton soleInstance = null;

	private Singleton() {
		System.out.println("Creating.....");
	}

	public static Singleton getInstance() {
		if (soleInstance == null) {
			synchronized (Singleton.class) {
				if (soleInstance == null) {
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}
}

class TestSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1 ->" + s1.hashCode());
		System.out.println("s2 ->" + s2.hashCode());
		

	}

}