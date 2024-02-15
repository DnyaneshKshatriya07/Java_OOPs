package Inheritance;
interface Animal2{
    void walk();
}
interface Herbivore{
    void walk();
}
class Horse2 implements Animal2,Herbivore{
    Horse2(){
        System.out.println("This is the constructor of Horse.");
    }
    public void walk(){
        System.out.println("Walking on 4 legs.");
    }
}

public class Multiple_Inheritance{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        //We can't make object of interface
        //We make object of interface but we have to use @Override keyword with new one method;
        Horse2 h1=new Horse2();
        h1.walk();


    }
}