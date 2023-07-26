package demo;

import java.util.ArrayList;

// 상속은 코드를 재사용하는 방법이다.
// 부모 클래스를 extends 받아 기능을 확장한다.
// 부모의 참조 변수로 작업하자.
// 부모의 private 은 자식에게도 private 이다.
// 부모를 super 라고 부른다.

class 문구 {
	int price;
}

class 볼펜 extends 문구 {
	String 색상;
}

class 물감 extends 문구 {
	String color;
}

public class 상속Test08 {
	public static void main(String[] args) {
//	<> 연산자로 입력을 제한하지 않으면 모든 객체를 다 담을 수 있다.
		ArrayList<Object> list = new ArrayList<>();
		
		문구 m1 = new 볼펜();
		문구 m2 = new 물감();
		System.out.println(m1.price);
		System.out.println(m2.price);
//	System.out.println(m1.색상);
//	System.out.println(m1.color); => 둘 다 에러
	}
}
