package sec03.exam02._abstract;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal a = dog;
		a.sound();
		
//		Animal a2 = new Animal();
	}

}
