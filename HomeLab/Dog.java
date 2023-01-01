package HomeLab;

public class Dog {
    String name;
    int age;
    public Dog(){
        System.out.println("please provide data ");

    }
    public Dog(String name){
        this.name=name;

    }
    public Dog(int age){
        age=age*5;
        this.age=age;
    }
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
}
