package Hello;

public class Hello1App {
    String name ;
    int age ;
    static String HELLO_TITLE = "헬로우 어플";

    public String hello(String name, int age){
    this.name = name;
    this.age = age;
    return String.format("안녕 내 이름은 %s이고 나이는 %d 살이야");
    }
}
