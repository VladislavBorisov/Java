
public class Person {
	
	private String firstName, lastName;
	private char sex;
	private int age;
	private String mail;
	public Address address;
	
	public Person(String fN,String lN,char sex,int age,String m){
		this.firstName = fN;
		this.lastName = lN;
		this.sex = sex;
		this.age = age;
		this.mail = m;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
