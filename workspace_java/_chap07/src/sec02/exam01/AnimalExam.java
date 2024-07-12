package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
//		dog = cat;
		
		Animal a1 = (Animal)new Dog();
		Animal a2 = new Cat();
		
//		// 같은 타입이니까 당연히 가능
//		a1 = a2;
		
		a1.sound();
//		a1.walk();
		a2.sound();
		
		
		Animal a3 = new Animal();
		a3.sound();
		
	}

}
