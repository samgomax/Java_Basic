public class Human {
    String name;
    String surename;
    int age;
    public Human(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                '}';
    }
}
