package Comparator_tutorial;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
    int rollNo;
    String name;
    public Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    String getName(){
        return name;
    }
    int getrollNo(){
        return rollNo;
    }
}
public class Comparator_04 {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();
        Student s1 = new Student(23,"Jeethan");
        Student s2 = new Student(21,"Jeethan");
        Student s3 = new Student(24,"Rahul");
        Student s4 = new Student(28,"Manju");
        studs.add(s1);
        studs.add(s2);
        studs.add(s3);
        studs.add(s4);
        studs.sort(Comparator.comparing(Student::getName).thenComparing(Student::getrollNo).reversed());
        for(Student s : studs)
        {
            System.out.println(s.rollNo + " " + s.name);
        }

    }
}
