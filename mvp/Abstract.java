package mvp;


abstract class Animal{
	abstract void sound();
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Barks...");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meau Meau..");
	}
}

public class Abstract {	

	public static void main(String[] args) {
		
        Dog d=new Dog();
        d.sound();
        
        Cat c=new Cat();
        c.sound();
	}

}
