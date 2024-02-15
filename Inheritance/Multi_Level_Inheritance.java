class Shape2 {
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle1 extends Shape2{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class Equilateral_Triangle1 extends Triangle1{
//    public void area(int l, int h){
//        System.out.println(0.5*l*h);
//    }
}

public class Multi_Level_Inheritance{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Equilateral_Triangle1 t1 =new Equilateral_Triangle1();
        t1.area();
        t1.area(5,4);
    }
}