package chapter11;

public class Pig extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I'm a pig");
    }

    @Override
    public void eat() {
        System.out.println("It is a pig eating");
    }

}
