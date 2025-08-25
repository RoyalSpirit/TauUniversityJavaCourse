package chapter11;

public class Duck extends Animal {

    @Override
    void makeSound() {
        System.out.println("I'm a duck");
    }

    @Override
    public void eat() {
        System.out.println("It is a duck eating");
    }

}
