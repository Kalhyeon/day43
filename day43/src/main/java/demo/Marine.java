package demo;

public class Marine {
//	1. 인스턴스 (객체) 초기화 : 초기화한 모든 필드는 같은 값을 가진다.
	String name;
	static int hp = 40;
	int currentHp = 40;
	static int atk;
	static int dfc;
	
//	2. 정적 초기화 영역 (static initializer) - 프레임워크들이 많이 사용한다.
	static {
//		정적 멤버만 초기화 => 일종의 함수와 비슷 => 여러 줄의 코드를 작성할 수 있다.
//		정적 멤버에 대한 복잡한 초기화
		atk = 4;
		dfc = 0;
//		currentHp = 40; => 정적 멤버가 아니라서 에러가 발생 (this 로 인식)
	}
	
//	3. 생성자
	public Marine(String name) { // 자동으로 this 를 붙이지 않는다.
//		일반 멤버에 대한 복잡한 초기화 
		System.out.println(hp); // hp => Marine.hp
		this.name = name;
	}
	
	public void a() {
		name = "홍길동";
	}
}
/*
 * 일반 멤버에 접근하려면 this 가, static 멤버에 접근하려면 클래스의 이름이 필요하다.
 */