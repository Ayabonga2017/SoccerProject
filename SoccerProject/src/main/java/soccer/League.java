package soccer;

public class League{

    public static void main(String[] args){

        Player player1 = new Player();
        player1.playerName = "Robben";

        Player player2 = new Player();
        player2.playerName = "Raymond";

        Player player3 = new Player();
        player3.playerName = "Romeo";

        Player[] redPlayers = {player1,player2,player3};

        Team redTeam = new Team();
        redTeam.teamName = "The Reds";
        redTeam.playerArray = redPlayers;

        System.out.println("The Reds : \n" );

        for(Player players : redTeam.playerArray){
            System.out.println( players.playerName);
        }


        Team greenTeam = new Team();
        greenTeam.teamName = "The Greens";

        greenTeam.playerArray = new Player[3];

        greenTeam.playerArray[0] = new Player();
        greenTeam.playerArray[0].playerName = "Greg";

        greenTeam.playerArray[1] = new Player();
        greenTeam.playerArray[1].playerName = "George";

        greenTeam.playerArray[2] = new Player();
        greenTeam.playerArray[2].playerName = "Gerald";

        System.out.println("\nThe Greens : \n" );

        for(Player players : greenTeam.playerArray){
            System.out.println( players.playerName);
        }

        Game currentGame = new Game();
        currentGame.awayTeam = redTeam;
        currentGame.homeTeam = greenTeam;

        Goal goal1 = new Goal();
        goal1.thePlayer = currentGame.homeTeam.playerArray[2];
        goal1.theTeam = currentGame.homeTeam;
        goal1.theTime = 13;

        Goal[] scored = {goal1};
        currentGame.goals = scored;

        StringBuilder goal = new StringBuilder();

        goal.append("\nGOOOOOOOOOOOAAAAAALLLLLLL !!!!!!\n");
        goal.append("\nGoal scored after ");
        goal.append(currentGame.goals[0].theTime);
        goal.append(" mins by ");
        goal.append(currentGame.goals[0].thePlayer.playerName);
        goal.append(" of ");
        goal.append(currentGame.goals[0].theTeam.teamName);
        goal.append(".\n");

        System.out.println( goal );
    }
}
