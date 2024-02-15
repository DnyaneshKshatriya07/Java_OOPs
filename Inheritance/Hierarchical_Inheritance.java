class Shape3 {
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle2 extends Shape3{
    public void area(int l, int h){
        System.out.println("Area of triangle:- "+0.5*l*h);
    }
}
class Circle extends Shape3{
    public void area(int r){
        System.out.println("Area of Circle:- "+3.14*r*r);
    }
}

public class Hierarchical_Inheritance{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Triangle2 t1 =new Triangle2();
        t1.area();
        t1.area(5,4);
        System.out.println("____________________________________");

        Circle c1=new Circle();
        c1.area();
        c1.area(10);

    }
}