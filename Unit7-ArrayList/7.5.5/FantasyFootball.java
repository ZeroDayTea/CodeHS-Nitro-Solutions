import java.util.ArrayList;
import java.util.Scanner;
public class FantasyFootball
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        String[] team = new String[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Player you would like on your team: ");
            String player = sc.nextLine();
            int playerIndex = search(availablePlayers, player);
            if(playerIndex > -1)
            {
                System.out.println("Great! That player is added to your team!");
                team[i] = player;
                availablePlayers.remove(playerIndex);
            }
            else
            {
                System.out.println("That player is not available, please pick another player.");
                i--;
            }
            System.out.println("");
        }
        System.out.println("Your team is:");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(team[i]);
        }
    }
    public static int search(ArrayList<String> array, String player)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).equals(player)) {
                return i;
            }
        }
        return -1;
    }
    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
