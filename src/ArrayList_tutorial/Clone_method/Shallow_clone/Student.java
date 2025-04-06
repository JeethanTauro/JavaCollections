package ArrayList_tutorial.Clone_method.Shallow_clone;

public class Student implements Cloneable{
    int rollNo;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
