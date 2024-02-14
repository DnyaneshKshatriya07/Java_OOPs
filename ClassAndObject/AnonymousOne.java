public class AnonymousOne {

    public static void main(String[] args) {
        Employee en = new Employee() {

            @Override
            public void processDetails() {
                System.out.println("Processing details....");

            }

        };en.processDetails();
    }
}

interface Employee
{
    public void processDetails();
}

