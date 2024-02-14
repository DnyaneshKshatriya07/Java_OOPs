public class Outer_class {

    public void process()
    {
        InnerDemo obj = new InnerDemo();
        obj.display();
    }
    public void print()
    {
        System.out.println("Printing....");
    }
    class InnerDemo
    {
        public void display()
        {
            System.out.println("Displaying....");
            print();
        }
    }

    public static void main(String[] args) {
        Outer_class outDemo = new Outer_class();
        outDemo.process();

    }
}