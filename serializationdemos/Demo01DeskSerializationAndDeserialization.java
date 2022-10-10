package com.prominentpixel.serializationdemos;

import java.io.*;

class Desk implements Serializable {
     String deskPic;
    String os;
    Desk(String deskPic, String os){
        this.deskPic=deskPic;
        this.os=os;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "deskPic='" + deskPic + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
public class Demo01DeskSerializationAndDeserialization {
    public static void main(String[] args) {


        try { //creating Object
            Desk d1 = new Desk("Window11Home", "Window11");
            FileOutputStream fout = new FileOutputStream("f2.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(d1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f2.txt"));
            Desk d=(Desk)in.readObject();
            //printing the data of the serialized object
            System.out.println(d.deskPic+" "+d.os );
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }

}