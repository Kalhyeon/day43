package 상속;

class Pet {
  public void cry() {}
}

class Cat extends Pet {
  @Override
  public void cry() {
    System.out.println("야옹");
  }
}
class Dog extends Pet {
  @Override
  public void cry() {
    System.out.println("멍멍");
  }
}
// ====================================================
class Hospital {
  public void vaccination(Pet pet) {
    pet.cry();
  }
}

public class Exam {

}
