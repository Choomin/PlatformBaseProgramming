package edu.pnu.admin;
import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String fName, String lname, int number){
        firstName = fName;
        lastName = lname;
        jerseyNumber = number;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return '['+ lastName + ", " + firstName + " " + jerseyNumber + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return jerseyNumber == player.jerseyNumber && Objects.equals(firstName, player.firstName) && Objects.equals(lastName, player.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, jerseyNumber);
    }
}
