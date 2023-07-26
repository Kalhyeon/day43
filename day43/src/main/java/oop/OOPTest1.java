package oop;

// 객체 지향 - 소프트웨어의 부품을 만들어 부품을 조립하여 소프트웨어를 만들자.

// 객체 지향의 판단 기준
//  구성 요소
//    캡슐화 : 관련된 필드와 기능을 모아 클래스를 만들어라.
//    정보 은닉 : 내부를 private 으로 보호,
//             public 으로 사용하는 방법 (메서드)을 제공한다.
//    상속
//    다형성 : 동작이 다른 메서드가 같은 이름을 가진다.
//      오버로드 (OverLoad) - 메서드의 이름은 같고, 매개변수는 다르다.
//      오버라이드 (OverRide) - 완벽하게 같은 메서드이다.

//  객체 지향 설계 원칙 (SOLID) => SOL 은 부모를 만들고 부모에 따라 구현하면
//                          달성되는 목표이다.
//  S (Single) : 단일 책임 원칙 => 1인분만 하자.
//  O (Open) : 개방 폐쇄 원칙 => 코드 변경이 다른 사람에게 영향을 주면 안된다.
//  L (Liskov) : 리스코프 치환 원칙 => 부모는 표준, 자식은 그 구현이다.
//               따라서 둘은 치환이 가능하다.
//  I, D : 나중에 기술

/*
 * class 부모 {
 *    public void func1(int a) {}
 * }
 * 
 * class 자식 extends 부모 {
 *    public void func2(int a, int b) {}        // OverLoad
 *    public void func2(double a, double b) {}  // OverLoad
 *    
 *    public void func2(int a, int b) {}        // 에러
 *    public void func1(int a) {}               // OverRide
 * }
 * */

public class OOPTest1 {
  
}
