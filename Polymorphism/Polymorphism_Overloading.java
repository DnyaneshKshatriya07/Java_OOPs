class Shape {
    public void area(double a, double b, double c){
        System.out.println("Area of Cube is:- "+ a*b*c); }
    public void area(double a, double b){
        System.out.println("Area of Triangle is:- "+ 0.5*a*b); }
    public void area(double a){
        System.out.println("Area of Circle is:- "+ 3.14*a*a); }
}


public class Polymorphism_Overloading {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Shape s1=new Shape();
        s1.area(2,5,3);

        System.out.println("____________________________________");
        Shape s2=new Shape();
        s2.area(2,5);

        System.out.println("____________________________________");
        Shape s3=new Shape();
        s3.area(2);
    }
}