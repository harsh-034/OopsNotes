package Incapsulation;


 public class incapsulationone{
    private String name;
    private int age;
    private int stendrd;
    private String gender;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setStendrd(int stendrd){
        this.stendrd = stendrd;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getStendrd(){
        return stendrd;
    }
    public String getGender(){
        return gender;
    }

}




//public class incapsulationone {
//    public static void main(String[] args){
//        Code c = new Code();
//        c.setName("harsh");
//        c.setage(33);
//        System.out.print(c.getName());
//
//    }
//}
