/**
 *Java Basic. Homework - 9.
 *Task 2
 * @author Maksym Samohorodskyi
 * @todo 05.10
 * @date 09.10
 **/

public class LiveObjects {
    public static void main(String[] args) {
        Human human = new Human("Smith", "John", 35);
        System.out.println(human);
        System.out.println("Human can running and jumping");

        Robot robot = new Robot("Terminator", "T800", 5);
        System.out.println(robot);
        System.out.println("Robot can running and jumping");

        Cat1 cat1 = new Cat1("Leopold", "grey", 2.5f);
        System.out.println(cat1);
        System.out.println("Cat can running and jumping");
    }
}
