package Inheritance;

 class studentinfo {
    public String name;
    public int age;
    public int stenderd;
    public void eat(){
        System.out.println("Student Eat Food.");
    }
}
public class Singal extends studentinfo{
    public void display(){
        System.out.println("Student Name " + name);
        System.out.println("Student Age :" + age);
        System.out.println("Student Class :" + stenderd+"th");
    }
}


