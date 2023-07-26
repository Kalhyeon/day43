package oop;

// 다형성 : OverLoad - 만드는 사람은 메서드를 하나씩 다 만든다.
//                   그러나 사용하는 사람은 이름을 하나만 알면 된다.
//                   대표적인 예로, println 등이 있다.
//                   유사한 기능은 이름을 같게 하자는 것이다.
//                   반드시 매개변수가 달라야 한다 (타입 혹은 개수).
//        OverRide - 부모를 구현한 자식들은 메서드가 같다.
//                   함수가 반드시 완벽하게 같아야 한다.
class Calc {
// 매개변수가 다르다면 메서드의 이름은 같아도 된다.
  public int sum(int a, int b) {
    return a+b;
  }
  public int sum(int a, int b, int c) {
    return a+b+c;
  }
}

public class OOPTest2 {
  public static void main(String[] args) {
    
  }
}
