abstract class Animal{
    abstract void walk();//this method present in all classes.
    Animal(){
        System.out.println("This is a constructor of Animal.");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("This is the constructor of Horse.");
    }
    public void walk(){
        System.out.println("Walking on 4 legs.");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walking on 2 legs.");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Horse h1=new Horse();//we can't make object of abstract class.This is runtime error.
        h1.walk();
        h1.eat();

    }
}