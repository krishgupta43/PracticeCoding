package Collection;

class A {
	
	void send(String s) {
		System.out.println("Class A "+s);
	}
//	void send(Integer s) {
//		System.out.println("Class A "+s);
//	}

}
class B extends A {
	
	void send(String s) {
		System.out.println("Class B "+s);
	}
	void send(Integer s) {
		System.out.println("Class B "+s);
	}
	

}

public class ClassA {
	public static void main(String[] args) {
	   A a1=new B();
	   a1.send(3);
	  
	}
	

}

