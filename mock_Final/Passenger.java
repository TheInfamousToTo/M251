package mock_Final;

public class Passenger {


    private String passportNo;
    private String name;
    private int age;

    public Passenger() {
    }


    public Passenger(String passportNo, String name, int age) {
        this.passportNo = passportNo;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age; }

    public String getName() {
        return name; }
    
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Passport No: " + passportNo + ", name: " + name + ", age: " + age;}


    public boolean equals(Object obj) {
        if (!(obj instanceof Passenger)) {
            return false;
        }
        Passenger p = (Passenger) obj;
        return passportNo.equals(p.passportNo);}
}