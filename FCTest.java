import java.io.InputStream;
import java.util.Scanner;

enum Command {ADD, FIND, CLEAR, LIST, QUIT, INVALID}
public class FCTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        FootballClub chelsea = new FootballClub("Chelsea");
        while (true){
            final Command cmd = getCommand(scanner);
            if(cmd==Command.QUIT){
                System.out.println("Bye");
                break;
            }
            if (cmd== Command.INVALID){
                System.out.println("Invalid Operation!");
                continue;
            }
            switch (cmd){
                case ADD :{
                    Player newPlayer = createPlayer();
                    chelsea.addPlayer(newPlayer);
                    break;
                }
                case FIND:
                    findPlayer(chelsea); break;
                case CLEAR:
                    chelsea.removeAllPlayer(); break;
                case LIST:
                    System.out.println(chelsea); break;
                default: break;
            }
        }
    }
    private static void findPlayer(final FootballClub fc){
        final String playerFirstName = scanner.next();
        final int jerseyNumber = scanner.nextInt();
        final Player foundPlayer = fc.findPlayer(playerFirstName, jerseyNumber);
        if (foundPlayer != null)
            System.out.println(foundPlayer);
        else
            System.out.println("Player Not Found with name "+ playerFirstName+" and number "+jerseyNumber);
    }
    private static Player createPlayer(){
        final String playerFirstMame = scanner.next();
        final String playerLastname = scanner.next();
        final int jerseyNumber = scanner.nextInt();
        return new Player(playerFirstMame, playerLastname, jerseyNumber);
    }

    private static Command getCommand(final Scanner scanner){
        System.out.print("Enter Command String! ");
        final String com = scanner.next();
        Command command;
        try {
            command = Command.valueOf(com.toUpperCase());
        }catch (IllegalArgumentException e){
            command = Command.INVALID;
        }
        return command;
    }
}
