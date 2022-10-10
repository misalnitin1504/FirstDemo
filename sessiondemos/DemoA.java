package sessiondemos;

public class DemoA {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        System.out.println(A.count);
    }
}
class A{
    static int count=0;
    A(){
        count++;
    }
}
