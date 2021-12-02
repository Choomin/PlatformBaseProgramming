package edu.pnu.admin;
import edu.pnu.collection.GenericList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private GenericList<Player> squad = new GenericList<>(maxSquadSize);

    public FootballClub(String tname){name= tname;}

    public String toString() {
        String msg = "FootballClub Name: "+ name + ", Player Count: "+ squad.size()+ "\n";
        for (int i = 0; i<squad.size() ; i++){
            msg += "\t" + squad.get(i)+"\n";
        }
        return msg;
    }
    public void addPlayer(Player player){
        squad.add(player);
    }
    public void removeAllPlayer(){
        squad.clear();
    }
    public Player findPlayer(String s1, int number) {
        for (int i=0; i<squad.size() ; i++) {
            Integer jerseyNumber = squad.get(i).getJerseyNumber();
            Integer num = number;
            if (squad.get(i).getFirstName().equals(s1) && num.equals(jerseyNumber)){
                return squad.get(i);}
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return maxSquadSize == that.maxSquadSize && Objects.equals(name, that.name) && Objects.equals(squad, that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }
}

