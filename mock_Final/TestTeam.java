package mock_Final;

public class TestTeam {
    public static void main(String[] args) {
        Team myTeam=new Team("AOU Team");
        Player p1=new Player(1,"ali",9);
        Player p2=new Player(2,"ahmed",5);
        Player p3=new Player(3,"maki",15);
        Player p4=new Player(4,"mosa",25);
        Player p5=new Player(5,"taki",16);
        Player p6=new Player(6,"jassim",8);
        Player p7=new Player(7,"rabab",2);
        Player p8=new Player(8,"reem",4);
        Player p9=new Player(9,"noor",20);
        Player p10=new Player(10,"nooh",26);
        Player p11=new Player(10,"nooh",26);
        myTeam.addPlayer(p1);
        myTeam.addPlayer(p2);
        myTeam.addPlayer(p3);
        myTeam.addPlayer(p4);
        myTeam.addPlayer(p5);
        myTeam.addPlayer(p6);
        myTeam.addPlayer(p7);
        myTeam.addPlayer(p8);
        myTeam.addPlayer(p9);
        myTeam.addPlayer(p10);
        myTeam.addPlayer(p11);
        System.out.println("The youngest player is "+myTeam.youngestPlayer());
        myTeam.saveIntoFile("myTeam.txt");

    }

}
