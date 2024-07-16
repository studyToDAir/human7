package _chap09;

import java.util.Objects;

public class MemberDTO {

	String name;
	int age;
	
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
		return "MemberDTO [name=" + name + ", age=" + age + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	
	// 
	@Override
	public boolean equals(Object obj) {
		MemberDTO m = (MemberDTO)obj;
		return this.name.equals(m.name) && this.age == m.age;
	}
	
}




