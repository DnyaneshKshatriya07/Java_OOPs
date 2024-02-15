class A {
    public int add(int a, int b) {
        return a + b;
    }
}
class B extends A{
    public int add(int a, int b) {
        return a + b + 1;
        //If you are comment this method then the output is 10
        //that is parent class method is run.
        //After you uncomment it then the output is 11 that is
        //child class method is run means there will be child class method
        // override the parent class method.
    }
}


public class Polymorphism_Overriding {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        B s1=new B();
        System.out.println(s1.add(3,7));
    }
}