interface Animal1{
    //this method present in all classes.
    public void walk();
    //We can't make constructor in an interface.
//    Animal(){
//        System.out.println("This is a constructor of Animal.");
//    }

    //We can't make simple method in an interface.
    //In short all methods in  an Interface are public & abstract methods.
//    public void eat(){
//            System.out.println("Animal eats");

//    }
}
class Horse1 implements Animal1{
    Horse1(){
        System.out.println("This is the constructor of Horse.");
    }
    //Method present in the class that implements from interface that is always public.
    public void walk(){
        System.out.println("Walking on 4 legs.");
    }
}
class Chicken1 implements Animal1{
    public void walk(){
        System.out.println("Walking on 2 legs.");
    }
}

public class Interface_Pure_Abstraction{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        //We can't make object of interface
        //We make object of interface but we have to use @Override keyword with new one method;
        Horse1 h1=new Horse1();
        h1.walk();


    }
}