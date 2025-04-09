package HashMaps_tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
    int rollNo;
    String name;
    public Student (int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    // same object
        if (obj == null || getClass() != obj.getClass()) return false;  // null or wrong class

        Student s = (Student) obj;
        return this.rollNo == s.rollNo && this.name.equals(s.name);
    }

    public int hashCode(){
        return Objects.hash(rollNo,name);
    }
}
public class HashMaps_03 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student(2,"jeethan");
        Student s2 = new Student(2,"jeethan");
        Student s3 = new Student(4,"rahul");
        Student s4 = new Student(6,"ramesh");
        map.put(s1 , "UVCE");
        map.put(s3, "OOIS");
        map.put(s4 , "IHS");
        System.out.println(map.get(s2));
        for(Map.Entry<Student , String> entry : map.entrySet()){
            System.out.println(entry.getKey().name + " --> " + entry.getValue());
        }



    }
}
