class M{
   int a;
   int b;
    M(int a, int b){
        this.a=a;//Here 'This' is used for stores the current value in the variable.
        this.b=b;//Here the parameter and the variable name is same that's why we have to use 'This' keyword.
        System.out.println(this.a +" "+ this.b);
    }
}


public class This_Keyword {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        M m1=new M(9,8);
    }
}
