package designpattern;

public class PrototypeDesignPattern {
    public static void main(String[] args) {

        Course course=new CourseImpl("Java","Multithreading Basic Concepts","Akansh");
        System.out.println(System.identityHashCode(course));
        System.out.println(course);
        Course cloneCourse=course.clone();
        System.out.println(System.identityHashCode(cloneCourse));
        System.out.println(cloneCourse);
    }

}
interface Course extends Cloneable{
    Course clone();
}
class CourseImpl implements Course{

    String name;
    String description;
    String writer;

    public CourseImpl() {
    }

    public CourseImpl(String name, String description, String writer) {
        this.name = name;
        this.description = description;
        this.writer = writer;
    }

    @Override
    public Course clone() {
        System.out.println("Creating clone object");
        CourseImpl course = null;
        try {
            course= (CourseImpl) super.clone();
            course.name=null;
            course.writer=null;
            course.description=null;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return course;
    }

    @Override
    public String toString() {
        return "CourseImpl{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
