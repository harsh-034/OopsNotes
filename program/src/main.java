import Constructor.Default;
import Constructor.Paramiterized;
import Incapsulation.incapsulationone;
import Inheritance.Singal;

import basic_class_object.Basic_1;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //=================================
        Basic_1 b = new Basic_1(); //object
        System.out.println("Enter Your Name : ");
        b.name = sc.nextLine();
        System.out.println("Enter your Age : ");
        b.age = sc.nextInt();
        System.out.println("Emter your class :");
        b.stenderd = sc.nextInt();
         b.display();

        //====================================
        System.out.println("=============Constructor==================");
        // default constructer
        Default d = new Default();
        //No argument constructer;
        //without maintion any argument only use constercre name for method like constructer()
        // paramiterize constructer


        Paramiterized p1 = new  Paramiterized(b.age);
        Paramiterized p2 = new  Paramiterized(b.name,b.age);
        Paramiterized p3 = new  Paramiterized(b.name);
        //===========================================================
        //Encapsulation
        System.out.println("=============Encapsulation==================");

        incapsulationone i = new incapsulationone();

        i.setName(b.name);
        i.setAge(b.age);
        i.setStendrd(b.stenderd);
        i.setGender("Male");

        System.out.println("Student Name : " + i.getName());
        System.out.println("Student Age :"+i.getAge());
        System.out.println("Student Class :"+i.getStendrd());
        System.out.println("Student Gender : "+i.getGender());

        //======================================================
        System.out.println("===============Inheritance=====================");

        Singal stu1 = new Singal();
        stu1.name = b.name;
        stu1.age = b.age;
        stu1.stenderd = b.stenderd;
        stu1.display();
        stu1.eat();

    }
}
