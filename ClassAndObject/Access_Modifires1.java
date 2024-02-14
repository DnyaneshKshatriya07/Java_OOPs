class Account{
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

public class Access_Modifires1{
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Account a1= new Account();
        a1.setPassword("JAY BHOLE");
        System.out.println(a1.getPassword());

    }
}