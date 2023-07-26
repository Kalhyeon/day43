package demo;

// 부모는 타입 + 메서드 이름
class MyServlet {
  public void doGet() {}
  public void doPost() {}
}

class MyBack extends MyServlet {
  public void doGet() {
    System.out.println("Did with Get");
  }
}

class YourBack extends MyServlet {
  public void doPost() {
    System.out.println("Did with Post");
  }
}

class Tomcat {
// 사용자가 작성한 백엔드 자바를 실행해준다.
  MyServlet svl;
  public Tomcat(MyServlet svl) {
    this.svl = svl;
  }
  public void run() {
    svl.doGet();
    svl.doPost();
  }
}

public class 상속Test12 {

}
