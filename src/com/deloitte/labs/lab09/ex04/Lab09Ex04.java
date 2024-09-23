package com.deloitte.labs.lab09.ex04;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

interface PersonFactory {
	Person create(String name, int age);
}

public class Lab09Ex04 {

	public static void main(String[] args) {
		PersonFactory personFactory = Person::new;

		Person person = personFactory.create("John", 25);

		System.out.println(person);

		person.setAge(26);
		System.out.println("Updated age: " + person.getAge());
	}
}
