public class JavaBasic8Lesson {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red" ,2, 1);
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(2));
    }
}

