public class AnonymousTwo {

    public static void main(String[] args) {
        Discount disc = new Discount() {

            @Override
            public void applyDiscount() {
                System.out.println("Discount applied");

            }

        }; disc.applyDiscount();
    }
}

abstract class Discount
{
    public abstract void applyDiscount();
}