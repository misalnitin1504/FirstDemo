
/*
Write a program to perform below operations
        - //Create new arrayList, add custom objects of ProminentTrainee class. Class has TraineeId, TraineeName, TraineeAge, TraineeDOB properties
        - //Iterate through the arrayList and print it using for loop, foreach loop and lambda expression.
        - //Count element of a list using lambda expression
        - //Insert element into the array list at the second position
        - //Retrieve an element of 3rd index and print it
        - Print element whose TraineeId is 5 with the help of lambda
        - //Convert list to set and count total element of set
        - Sort list based on all the four properties. Use lambda expression and functional interface
        - //Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
         - Write all the records into plain text files. Record separator should be new line and field separator tab.
         - Read above created file. store all the records as a ProminentPixel and store it in list
         - Write all the records into binary files and read it back to list.
*/ /*
3) Write a program to perform below operations
        - //Create new arrayList, add custom objects of ProminentTrainee class. Class has TraineeId, TraineeName, TraineeAge, TraineeDOB properties
        - //Iterate through the arrayList and print it using for loop, foreach loop and lambda expression.
        - //Count element of a list using lambda expression
        - //Insert element into the array list at the second position
        - //Retrieve an element of 3rd index and print it
        - //Print element whose TraineeId is 5 with the help of lambda
        - //Convert list to set and count total element of set
        - Sort list based on all the four properties. Use lambda expression and functional interface
         - //Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
         - Write all the records into plain text files. Record separator should be new line and field separator tab.
           Read above created file. store all the records as a ProminentPixel and store it in list
         - Write all the records into binary files and read it back to list.
         -*/
package com.prominentpixel.lamdademos.lamdaexerciseedemos;

import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@FunctionalInterface
interface CompareProperty extends Comparator<ProminentTrainee>{
    @Override
      int compare(ProminentTrainee t1, ProminentTrainee t2);
}
public class Demo03ArrayList {
    public static void useForLoop(List list) {
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
    public static void useForEach(List list){
        System.out.println("\n\nUsing for-each loop:");
        for(Object trainee:list) {
            System.out.println(trainee);
        }
    }
    public static void useForEachWithLambda(List list){
        System.out.println("\n\nUsing for-each() method with Lambda Expression:");
        list.forEach((trainee) -> 				//name--we can take any object
                System.out.println(trainee));

    }
    public static void writeRecords(){
        try {
            FileOutputStream fout=new FileOutputStream("D:\\records.txt");

        }catch (Exception e){e.printStackTrace();}

    }
    public static void main(String[] args) {
        ProminentTrainee t1=new ProminentTrainee(01,"Nitin",32,"15/04/1990");
        ProminentTrainee t2=new ProminentTrainee(02,"Sachin",30,"15/02/1992");
        ProminentTrainee t3=new ProminentTrainee(03,"Kajal",28,"15/04/1994");
        ProminentTrainee t4=new ProminentTrainee(04,"ABF",28,"15/04/1994");
        ProminentTrainee t5=new ProminentTrainee(05,"ZZZ",25,"11/04/1994");


        ArrayList<ProminentTrainee> list=new ArrayList<>(List.of(t2,t4,t1,t3,t5));

        useForLoop(list);
        useForEach(list);
        useForEachWithLambda(list);

        System.out.println("\nCount Elements of list using Lambda Expression:");
       // ArrayList<Integer> countElements=list.stream().count();
        long count = list.stream().filter(trainee -> trainee.age<200).count();
        System.out.println("Count="+count);
        //list.forEach(x-> static long count = count++);
        System.out.println();
        System.out.println("\nInsert element into the array list at the second position:");
        ProminentTrainee newt2ndpost=new ProminentTrainee(06,"New",28,"16/04/1994");

        list.add(2,newt2ndpost);
        list.forEach(System.out::println);
        //- Retrieve an element of 3rd index and print it
        System.out.println("\nRetrieve an element of 3rd index and print it:");
        System.out.println(list.get(3));//

        //Print element whose TraineeId is 5 with the help of lambda
        System.out.println("Print element whose TraineeId is 5 with the help of lambda:");
        Stream<ProminentTrainee> traineeStream=list.stream().filter(t -> {return t.id==5;});
        //System.out.println(traineeStream.);
        traineeStream.forEach(t-> System.out.println("Trainee with id 5 is: "+t));

        //Convert list to set and count total element of set
        /*
//List<ProminentTrainee>        // Converting Trainee List into Set
        Set<Integer> traineeAgeList =
                list.stream()
                        .filter(trainee->trainee.age < 200)   // filter trainee on the base of age
                        .map(trainee->trainee.age)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        */
        Set<ProminentTrainee> trainees=list.stream().collect(Collectors.toSet());

        long countTrainees=trainees.stream().count();
        System.out.println("Count="+countTrainees);
        System.out.println(trainees);

        // implementing lambda expression
        Collections.sort(list,(tr2,tr1)->{
            return t2.getName().compareTo(t1.getName());
        });



        Collections.sort(list, new CompareProperty() {
            @Override
            public int compare(ProminentTrainee t1, ProminentTrainee t2) {
                if(t1.getId()== t2.getId())
                    return 0;
                else if(t1.getId()> t2.getId())
                    return 1;
                else return -1;
            }
        } );
        System.out.print("After id-compare list is:");
        System.out.println(list);

        Collections.sort(list,  (tr1, tr2)->{return tr1.getName().compareTo(tr2.getName());} );
        System.out.print("After Name-compare list is:");
        System.out.println(list);

        //Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
        System.out.println("Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value");
        Map<Integer,ProminentTrainee> map=new  HashMap<>();
        list.forEach(t->{map.put(t.id,t);});
        System.out.println(map);







    }

}

