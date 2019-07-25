package soccer;

import utility.GameUtils;

public class League{

    public static void main(String[] args){

        Team[] theTeams = creaTeams();
        Game[] theGames = creatGames(theTeams);

        Game currentGame = theGames[0];

        Player player1 = new Player();
        player1.playerName = "Robben Johnson";

        Player player2 = new Player();
        player2.playerName = "Raymond Lee";

        Player player3 = new Player();
        player3.playerName = "Romeo James";
        Player[] redPlayers = {player1,player2,player3};
        theTeams[1].playerArray = redPlayers;


        //green team 
        theTeams[0].playerArray = new Player[3];

        theTeams[0].playerArray[0] = new Player();
        theTeams[0].playerArray[0].playerName = "General Fallen";

        theTeams[0].playerArray[1] = new Player();
        theTeams[0].playerArray[1].playerName = "George Sandles";

        theTeams[0].playerArray[2] = new Player();
        theTeams[0].playerArray[2].playerName = "Gerald McQueen";

        System.out.println("\nThe Greens : \n" );

        //GOALS
        currentGame.playGame();
       
        for (Goal currentGoal : currentGame.goals){
            System.out.println( currentGame.getDesc());
        }

        for(Player players : theTeams[1].playerArray){
            
            if (players.playerName.matches(".*G.*")) {

                String name[] = players.playerName.split(" ");
                StringBuilder firstName = new StringBuilder();
                firstName.append("\n");
                firstName.append(name[0]);
                firstName.append(", ");
                firstName.append(name[1]);
                System.out.print(firstName + "\n");
            }
        }
        System.out.println(currentGame.getDesc());
    }
    //create a team
    public static Team[] creaTeams(){

        Team redTeam = new Team();
        redTeam.teamName = "The Reds";
        Team greenTeam = new Team();
        greenTeam.teamName = "The Greens";

        Team[] theTeams = {redTeam,greenTeam};
        // for(Player players : redTeam.playerArray){System.out.println( players.playerName);}

        return theTeams;
    }

    //create game
    public static Game[] creatGames(Team[] theTeams){
       
        Game theGame = new Game();
        theGame.awayTeam = theTeams[1];
        theGame.homeTeam = theTeams[0];
        Game[] theGames = {theGame};
       
        return theGames;
    }
}
