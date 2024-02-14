class student{
    String name;
    static String school;//this is same of all student that's why we make it as static.
    //static keyword is used to take less space in storage because we can write it once and call it anywhere.
    public static void changeSchool(){
        school="NewSchool";
    }
}


public class Static_Keyword {
    public static void main(String[] args) {
        student.school="XYZ School";//no need to create or use the object to call the static variable.
        student s1=new student();
        System.out.println(s1.name="Ramdas");
        System.out.println(student.school);
        student.changeSchool();//no need to create or use the object to call the static Methods.
        System.out.println(student.school);

    }
}
