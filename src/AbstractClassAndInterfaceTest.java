public class AbstractClassAndInterfaceTest {

    public static void main(String[] args) {

        //two subclass extends from the same parent class
        Dog dog = new Dog("Jeniffer", 12);
        dog.hobby = "play basketball";
        dog.weight = 20;
        dog.makeNoise();
        dog.introduceSelf();
        System.out.println(dog.toString());
        Cat cat = new Cat("Mark", 70);
        cat.makeNoise();
        cat.introduceSelf();

        //one class implements from multiple interfaces
        dog.fly();
        dog.jump();
    }
}

interface ToolOfFly{
    void fly();
}

interface ToolOfJump{
    void jump();
}

abstract class Animal{
    String name;
    int age;
    int weight;
    String hobby;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeNoise();

    void introduceSelf(){
        System.out.println("I'm " + name + ", and my age is " + age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

class Dog extends Animal implements ToolOfFly, ToolOfJump{

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeNoise() {
        System.out.println("Wang Wang ...");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "could fly!!!");
    }

    @Override
    public void jump() {
        System.out.println(this.name + "could jump to 1000 meters !!!");
    }
}

class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeNoise() {

    }
}
