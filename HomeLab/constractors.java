package HomeLab;

public class constractors {
    public static void main(String[] args) {
        Dog myDog =new Dog();
        Dog toto = new Dog("ali");
        Dog kkk = new Dog("meow", 5);
        Dog dead = new Dog(5);
        System.out.println(myDog.name + " "+myDog.age);
        System.out.println(toto.name + " "+toto.age);
        System.out.println(kkk.name + " "+kkk.age);
        System.out.println(dead.age);

    }
}
