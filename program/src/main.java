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
    }
}
