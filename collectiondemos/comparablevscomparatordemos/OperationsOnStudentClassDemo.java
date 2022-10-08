package com.prominentpixel.collectiondemos.comparablevscomparatordemos;
/*
//Have List of Students, Find out the unique name of the students
Have list of Students, Find out collage wise counts
//Have list of Students, Find out collage wise students list
Have list of Students, Find out collage wise, grade, student count
//Print Students in name wise sorting
//Print Student name and collage wise sorting, if name are same then sort based on collage wise
*/
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnStudentClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(01, "Nitin", "GCE", "First Class");
        Student s2 = new Student(02, "Sachin", "TCE", "Second Class");
        Student s3 = new Student(03, "Kajal", "KCE", "First Class");
        Student s4 = new Student(04, "Jatin", "KCE", "Second Class");
        Student s5 = new Student(05, "Nitin", "ICE", "First Class");
        Student s6 = new Student(06, "Dipika", "GCE", "Second Class");

        List<Student> list = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));
        // Set<Student> set=new HashSet<>(L)
        //list.add(s1);       // list.add(s2);
        // list.add(s3);
        /*
        Iterator<Student> itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.print("Print Unique Names:");
        HashSet<String> name = new LinkedHashSet<>();
        for (Student st1 : list) {
            name.add(st1.getName());
        }
        System.out.println(name);


        //  });

        System.out.println("College wise counts");
        Map<String, Long> collegeCounts = list.stream()//.filter(student -> student.getCollege() == student.getCollege())
                .collect(Collectors.groupingBy(Student::getCollege, Collectors.counting()));
        System.out.println(collegeCounts);


        System.out.println("Sort List after college comparator");
        Collections.sort(list,new CollegeComparator());
        for(Student s: list){
            //System.out.println(s);
            System.out.println(s.getCollege()+" "+s.getId()+" "+s.getName()+" \t"+s.getGrade());


    /*

        System.out.println("Sort List after name comparator");
        //Collections.sort(list,new NameComparator());
        Collections.sort(list,(st1,st2)->{
            return st1.getName().compareTo(st2.getName());
        });
        for(Student s: list){
            System.out.println(s.getName());//+" "+s.getId()+" "+s.getCollege()+" "+s.getGrade());
        }
*/

        /*
        System.out.println("Sort List after name comparator with Lamda Expression");

        // implementing lambda expression
        Collections.sort(list,(st2,st1)->{
        return s2.getName().compareTo(s1.getName());
        });

        for(Student s: list){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getCollege()+" "+s.getGrade());
        }
        //--------------------------------
        /*
        System.out.println("Sort List after name & college comparator");
        Collections.sort(list,new NameAndCollegeCompare());
        for(Student s: list){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getCollege()+" "+s.getGrade());
        }
*/
    }}}

