interface Animals{
	void speak();
	void eat();
}

class Dog implements Animals{
	public void speak(){
		System.out.println("woof!");
	}
	public void eat(){
		System.out.println("i love food");
	}
}

class Cat implements Animals{
	public void speak(){
		System.out.println("meow");
	}
	public void eat(){
		System.out.println("fish is delicious");
	}
}
public class interfaces {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.speak();
		d.eat();
		
		Cat c=new Cat();
		c.speak();
		c.eat();
	}
}

