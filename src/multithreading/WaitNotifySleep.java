package multithreading;

public class WaitNotifySleep {

    public static void main(String[] args) throws InterruptedException {
        Course javaCourse=new Course("Java","MultiThreading Concepts");

        Thread student1=new Thread(() -> {
            System.out.println("Student 1 is waiting for the course");
            synchronized (javaCourse) {
                try {
                    javaCourse.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hey Student 1 new course is released " + javaCourse.name + " desc: " + javaCourse.desc);
            }
        });
        Thread.sleep(2000);
        Thread student2=new Thread(()->{
            System.out.println("Student 2 is waiting for the course");
            synchronized (javaCourse) {
                try {
                    javaCourse.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hey Student 2 new course is released " + javaCourse.name + " desc: " + javaCourse.desc);
            }
        });
        Thread.sleep(2000);

        Thread teacher=new Thread(()->{
            System.out.println("Teacher is preparing the "+javaCourse+" course will be notified once available");
            synchronized (javaCourse) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                javaCourse.notifyAll();
            }});

        student1.start();
        student2.start();
        teacher.start();
    }


}
class Course
{
    String name;
    String desc;

    public Course(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
