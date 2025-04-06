package ArrayList_tutorial.Clone_method.Deep_clone;

public class Student implements Cloneable {
    int rollNo;
    Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
