package sessiondemos;

public class DemoStatic {

    public static void display(){
        System.out.println("In Static method.......");
        DemoStatic d=new DemoStatic();
        d.display1();
    }
    public void display1(){
        try {
            System.out.println("In Non-Static");
            //display();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DemoStatic ds=new DemoStatic();
        display ();
    }
}
