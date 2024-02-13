class Stud{
    String pen;
    String color;

    public void write() {
        System.out.println("Writing...");
    }

    public void PrintColor() {
        System.out.println(this.color);
    }
}
public class Class_N_Object {
    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.color="Black";
        s1.pen="BallPoint";
        s1.write();

        Stud s2=new Stud();
        s2.color="Red";
        s2.pen="Gel";
        s2.write();
        s2.PrintColor();

        s1.PrintColor();
    }
}