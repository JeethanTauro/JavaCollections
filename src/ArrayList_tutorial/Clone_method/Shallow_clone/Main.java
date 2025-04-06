package ArrayList_tutorial.Clone_method.Shallow_clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.rollNo = 10;
        Student s2 = new Student();
        s2 = (Student)s1.clone();
        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);

        s2.rollNo = 20;
        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo); //if i change the s2 roll does not affect s1


    }
}
