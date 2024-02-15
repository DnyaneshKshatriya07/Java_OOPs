class Shape1 {
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape1{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}


public class Single_Level_Inheritance{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Triangle t1 =new Triangle();
        t1.area();
        t1.area(5,4);
    }
}