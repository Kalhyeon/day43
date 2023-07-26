package demo;

import java.util.ArrayList;
import java.util.List;

// 오버라이드 : OverRide

// 부모 클래스는 항상 메서드를 제공해야한다.
class Vehicle {
// 오버라이드는 완벽하게 같은 메서드를 2개 가지는 것이다.
// super.move(). this.move()
// 두 메서드를 super 와 this 로 구별한다 => this 의 메서드를 실행한다.
  public void move() {System.out.println("부모의 move");}
}

// 자식 클래스는 부모의 메서드를 제공받는다.
class Bus extends Vehicle{
  public void move() {System.out.println("버스의 move");}
}
class Taxi extends Vehicle{
  public void move() {System.out.println("택시의 move");}
}
class Airplane extends Vehicle{
  public void move() {System.out.println("비행기의 move");}
// 아무것도 없어도 부모의 메서드가 실행된다 => super 의 메서드를 실행한다.
}

public class 상속Test13 {
  public static void main(String[] args) {
//  클래스 Vehicle 의 모든 자식 요소들을 담을 수 있다.
    List<Vehicle> list = new ArrayList<>();
    list.add(new Bus());
    list.add(new Taxi());
    list.add(new Airplane());
    
    for(Vehicle ob:list) {
      ob.move();
    }
  }
}
