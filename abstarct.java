 abstract class Animal{
	private String color;
	private String breed;
	private String name;
	Animal(String c,String b,String n){
		color=c;
		breed=b;
		name=n;
	}
	void speak(){
		System.out.println("name "+name+"color  "+color+" breed "+breed+".");
	}
	abstract void eat();
}

class dog extends Animal{
	dog(String c,String b,String n){
		super(c,b,n);
	}
	void eat(){
		System.out.println("i am vegan!");
	}
}
public class abstract {
	public static void main(String[] args) {
		dog d=new dog("dog", "german shepard", "sonam");
		d.speak();
		d.eat();
}
}
