package edu.pragmatic.homework.exceptions.student.customexception;

public class Student {

	private int age;
	private String name;
	private String lastName;
	private String sex;
	
	public Student(int age, String name, String lastName, String sex) {
		setAge(age);
		setName(name);
		setLastName(lastName);
		setSex(sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if ( age >= 7 && age <= 18)
			throw new InvalidStudentDateException("Student age must be between 7 and 18 years");
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() > 12)
			throw new InvalidStudentDateException("Name can't be null or longer than 12 symbols");
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (name == null || name.length() > 20)
			throw new InvalidStudentDateException("Last name can't be null or longer than 20 symbols");
		this.lastName = lastName;
	}
	
	
}
