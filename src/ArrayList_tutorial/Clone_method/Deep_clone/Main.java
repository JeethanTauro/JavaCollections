package ArrayList_tutorial.Clone_method.Deep_clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.rollNo = 10;
        Address address = new Address();
        address.addressId = 45;
        s1.address = address;

        //no issues here as these are primitive data types
        Student s2 = (Student)s1.clone();
        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);
        System.out.println("-----------");
        //here there is issue because it is of objec type
        System.out.println(s1.address.addressId);
        System.out.println(s2.address.addressId);
        s2.address.addressId = 50;
        System.out.println(s1.address.addressId);
        System.out.println(s2.address.addressId);

        //to avoid this we will do deep cloning



    }
}
