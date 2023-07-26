package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 부모 - 자식 관계는 is-a 관계
// A is-a B 가 성립할 때, A가 자식이고 B가 부모이다.
// 학생은 사람이다 - O
// 사람은 학생이다 - X

// 부모는 보다 추상적인 개념 (카테고리), 자식은 보다 구체적인 개념이다.

class 휴대폰 {
	
}

class 스마트폰 extends 휴대폰 {
	
}

class 아이폰 extends 스마트폰 {
	
}

class 갤럭시 extends 스마트폰 {
	
}

class 샤오미 extends 스마트폰 {
	
}

public class 상속Test04 {
	public static void main(String[] args) {
//	우리가 실제로 사용하는 것은 구체적인 자식이다.
//	우리가 어떤 일을 시작할 때에는 부모로 시작한다.
		
//	중식식당을 연다 => 주방장을 뽑자.
//	뽑았더니 계양구에 사는 40세의 홍길동씨이다.
//	그럼 처음부터 계양구에 사는 40세의 홍길동씨를 뽑는다라고 공고할 수 있나?
		
//	부모의 참조 변수는 자식을 가리킬 수 있다 => 참조 변수는 반드시 부모여야 한다.
		휴대폰 p1 = new 아이폰();
		p1 = new 갤럭시();
		
		List<String> list = new ArrayList<>();
		
		list = new Vector<>();
		
		list = new LinkedList<>();
	}
}
