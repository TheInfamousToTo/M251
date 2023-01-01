package mock_Final;

public class Player {
    private int shirt;
    private String name;
    private int age;
    public Player(){
        this(0,null,0);
    }
    public Player(int shirt, String name, int age){
        this.shirt=shirt;
        this.name=name;
        this.age=age;

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString(int shirt, String name , int age){
        return "Shirt no :"+ shirt+ " , Name : "+name+" , Age: "+age;

    }
    public boolean equals(Object obj){
        Player p = (Player)obj;
            return shirt==p.shirt;
    }
}
