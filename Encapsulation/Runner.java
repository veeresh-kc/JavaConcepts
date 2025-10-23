package encapsulation;

public class Runner {
public static void main(String[] args) {
	Student s=new Student();
	System.out.println("***Exsitng data***");
	System.out.println(s.getsId());
	System.out.println(s.getsName());
	System.out.println(s.getsMarks());
	System.out.println("***Modified  data***");
	s.setsId(200);
	s.setsName("veeresh k c");
	s.setsMarks(85);
	System.out.println(s.getsId());
	System.out.println(s.getsName());
	System.out.println(s.getsMarks());
}
}
