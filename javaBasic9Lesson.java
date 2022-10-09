/**
 *Java Basic. Home work - 9.
 *
 * @author Maksym Samohorodskyi
 * @todo 05.10
 * @date 09.10
 **/

public class javaBasic9Lesson {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red" ,2);
        Dog dog = new Dog("Polkan", "black", 5 );
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}