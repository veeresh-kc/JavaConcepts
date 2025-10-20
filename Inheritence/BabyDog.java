package inheritence;

public class BabyDog extends Dog{
void weeps() {
	System.out.println("weeping...");
}
public static void main(String[] args) {
	Animal a=new Animal();
	a.eat();
	Dog d=new Dog();
	
	d.eat();
	d.bark();
	BabyDog b=new BabyDog();
	b.eat();
	b.bark();
	b.weeps();
	Cat c=new Cat();
	c.eat();
	c.meow();
}
}
