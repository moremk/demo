package mvp;

interface Subject
{
	void sound();
}

class A implements Subject
{
public void sound()
{
	System.out.println("Barks..");
}
}
class B implements Subject
{
public void sound()
{
	System.out.println("Meu Meu..");
}
}

public class Interface {

	public static void main(String[] args) {
	A d=new A();
	d.sound();
	
	B c=new B();
	c.sound();

	}

}
