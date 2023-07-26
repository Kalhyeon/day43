package demo;

// 부모 클래스는 자식 클래스들의 사용법을 정해준다.
// 클래스들을 출력하는 방법이 모두 다르다.

// 개방 폐쇄 원칙 : 코드의 개선에 대해서는 열려있고, 변경에 대해서는 닫혀있다.
// 결합도 (Coupling) : A와 B가 관련된 정도
// 도형 패키지

class 삼각형 {
	public void print() {System.out.println("삼각형 출력");}
}

class 사각형 {
	public void output() {System.out.println("사각형 출력");}
}

class 원 {
	public void display() {System.out.println("원 출력");}
}
// 오각형 클래스를 추가한다면

// ============================================================
// 캐드 패키지
class CAD {
  private 삼각형 t1;
  private 사각형 t2;
  private 원 t3;
  
  public void 도형출력() {
    if(t1!=null) {
      t1.print();
    }else if(t2!=null) {
      t2.output();
    }else if(t3!=null) {
      t3.display();
    }
  }
}

public class 상속Test10 {
  
}
