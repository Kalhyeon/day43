package demo;

class 부모3 {
	int p = 10;
}

class 자식3 extends 부모3 {
	int c = 20;
}

public class 상속Test03 {
	public static void main(String[] args) {
//	자식의 객체 내부에 부모가 포함되어있다.
		자식3 ob = new 자식3();
		System.out.println(ob.p);
		System.out.println(ob.c);
		
//	부모를 parent class, base class, super class 라고 한다.
//	자식을 child class, 파생 클래스 (derived class), sub class 라고 한다.
	}
	
}
