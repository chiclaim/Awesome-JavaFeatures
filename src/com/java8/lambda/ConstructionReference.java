package com.java8.lambda;

/**
 * 构造器引用
 * 
 * @author yuzhiqiang
 *
 */
public class ConstructionReference {

	public static void main(String[] args) {
		ConstructionReference reference = new ConstructionReference();
		reference.test();
	}

	public void test() {
		PersonFactory<Person> factory = Person::new;
		Person person = factory.createPerson("san", "zhang");
		System.out.println(person);
	}

	public interface PersonFactory<P extends Person> {
		Person createPerson(String firstName, String lastName);
	}

	public class Person {

		public String firstName;
		public String lastName;

		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
	}
}
