/*
    1.	Automatic Casting (Implicit/widening)
    2.	Manual Casting (Explicit/Narrowing)
    3.	//Impossible Conversions:
        a. primitive to boolean & vice versa
        b. Primitive to reference
        c. null to primitive

*/

public class TypeCasting {
    public static void main(String args[]){
        //Automatic Casting
        byte b=10;
        short s=b;
        int i=s;
        long l=i;
        float f=l;
        double d=f;
        System.out.println("Automatic Casting: "+"b="+b+" s="+s+" i="+i+" l="+l+" f="+f+" d="+d );
        //Manual Casting (Explicit/Narrowing)
        double dd=100.12d;
        float ff=(float) dd;
        long ll=(long) ff;
        int ii= (int) ll;  //cast to int
        short ss=(short) ii;
        byte bb=(byte) ss;

        System.out.println("Manual Casting: "+"dd="+dd+" ff="+ff+" ll="+ll+" ii="+ii+" ss="+ss+" bb="+bb);
    }
}
