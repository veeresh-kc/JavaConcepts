package inheritence;

class Son extends Father{

@Override
	void smoke() {
		System.out.println("son smoke's cigar ");
	}

public static void main(String[] args) {
	Son s=new Son();
	s.smoke();
	Father f=new Father();
	f.smoke();
}
}
