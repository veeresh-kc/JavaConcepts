package overrideconcepts;

public class Creature {
void eat()
{
	System.out.println("creatures are eating");
}
public static void main(String[] args) {
	Snake s=new Snake();
	s.eat();
	Cow c=new Cow();
	c.eat();
	Crocodile cr=new Crocodile();
	cr.eat();
}
}
