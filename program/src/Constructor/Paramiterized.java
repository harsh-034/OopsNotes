package Constructor;

public class Paramiterized {
    public Paramiterized(String name){
        System.out.println(name);
    }
   public  Paramiterized(int age){
        System.out.println("your age : "+age);
    }
    public Paramiterized(String name,int age){
        System.out.println("Your name is : "+name+" // " +"Your age is :"+age);
    }

}
