public class Robot {
    String name;
    String model;
    int age;

    public Robot(String name, String surename, int age) {
        this.name = name;
        this.model = surename;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
