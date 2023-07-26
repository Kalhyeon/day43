package demo;

// 객체 지향 구성 요소
// 1. 캡슐화 : 데이터와 기능을 모아 클래스를 만들어라.
//			 케이스 (private)를 씌워 내부를 보호하라 - 정보 은닉
// 2. 상속 : 부모 클래스를 자식이 상속받는다 (자식이 부모의 모든 것을 가진다).
// 3. 다형성 : 상황에 따라 메서드의 동작을 다르게 한다.

class 부모1 {
	int 부모필드 = 10;
}
class 자식1 extends 부모1 { // extends 부모1 => 부모1을 상속받는다.
	int 자식필드 = 20;
}

// 상속의 시작은 부모의 기본 기능을 상속받아 재사용하자.
public class 상속Test01 {
	public static void main(String[] args) {
		자식1 ob = new 자식1();
		System.out.println(ob.부모필드);
		System.out.println(ob.자식필드);
	}
	
}
