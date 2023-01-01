package mock_Final;

import java.io.*;
import java.util.*;

public class Team {
    private String teamName;
    private ArrayList<Player>players;
    public Team(String teamName){
        this.teamName=teamName;
        players =new ArrayList<Player>();
    }
    public void addPlayer(Player player){
        if ( players.contains(player)){
            System.out.println("failed , duplicate shirt number");
        }
        else
        {players.add(player);
            System.out.println("Success, user added");}

//        boolean flag= false;
//        for(Player p: players) {
//            if (players.equals(p)) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag==true){
//            System.out.println("failed , duplicate shirt number");}
//        else {
//            players.add(player);
//            System.out.println("Success, user added");}
    }
    public String youngestPlayer(){
        int minAge=1000;
        String minName=null;
        for ( Player p: players){
            if (minAge> p.getAge()){
                minAge= p.getAge();
                minName=p.getName();
            }
        }
        return minName;
    }
    public void saveIntoFile(String FileName){
        try{
            File myfile = new File(FileName);
            PrintWriter pr = new PrintWriter(myfile);
            pr.println(teamName);
            for(Player p: players){
                pr.println(p.toString());
            }
            pr.close();

        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }

    }

}
