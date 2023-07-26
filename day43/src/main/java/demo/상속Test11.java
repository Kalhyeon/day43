package demo;

// 1. 결합도를 낮추기 위하여 부모 클래스를 도입하자.
// 2. 부모 클래스에서 작성할 메서드를 정의한다
//    => 자식들은 부모가 정해준 메서드를 구현한다.

// 도형 패키지
class 도형 {
  public void print() {}
// 부모 클래스의 메서드는 자식들이 구현할 메서드의 이름을 정해준다
// 즉, 부모의 메서드는 내용이 없다.
}

class 삼각형2 extends 도형{
	public void print() {System.out.println("삼각형 출력");}
}
class 사각형2 extends 도형{
	public void print() {System.out.println("사각형 출력");}
}
class 원2 extends 도형{
	public void print() {System.out.println("원 출력");}
}
// 오각형 클래스를 추가한다면

// ============================================================
// 캐드 패키지
class CAD2 {
  private 도형 shape;
  
  public void 도형출력() {
    shape.print();
  }
}

public class 상속Test11 {
  
}
