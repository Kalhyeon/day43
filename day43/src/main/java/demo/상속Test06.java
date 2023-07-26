package demo;

class 부모6 {
	private int p;
	public 부모6(int p) {
		this.p = p;
	}
}

class 자식6 extends 부모6{
	private int c;
	public 자식6(int p, int c) {
//	private 은 외부의 접근이 불가능하다.
//	따라서 자식도 접근할 수 없다 => 부모의 생성자를 부른다.
		super(p); // super 는 부모의 생성자를 가리킨다.
		this.c = c;
	}
}

public class 상속Test06 {
	public static void main(String[] args) {
		부모6 ob = new 자식6(10, 20);
		
//	this : 보증금 (번 돈 + 주모에게 받은 돈)
//				this + super
	}
}
