package inheritence;

public class Dog1 extends Animal1 {
@Override
void eat()
{
	System.out.println("Dog eat pedigree");
}
void findBehaviours() {
	this.eat();
	super.eat();
} 
public static void main(String[] args) {
	Dog1 d=new Dog1();
	d.findBehaviours() ;
}
}
