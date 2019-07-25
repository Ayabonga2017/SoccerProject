package soccer;
import utility.GameUtils;

public class Game{

    public  Team homeTeam;
    public  Team awayTeam;
    public Goal[] goals;

public void playGame(){

    int numberOfGoals = (int)(Math.random() * 9);
    System.out.println(numberOfGoals);
    GameUtils.addGameGoals(this);

    Goal[] theGoals = new Goal[numberOfGoals];
    this.goals = theGoals;
    System.out.println("Goal(s) scored : \n" +numberOfGoals);

}
public String getDesc(){

    StringBuilder goal = new StringBuilder();



    for (Goal currentGoal : this.goals){

        double time = (int)(Math.random()* 90);
        time = currentGoal.theTime;
        System.out.println(time);
    goal.append("\nGOOOOOOOOOOOAAAAAALLLLLLL !!!!!!\n");
    goal.append("\nGoal scored after ");
    goal.append(time);
    goal.append(" mins by ");
    goal.append(currentGoal.thePlayer.playerName);
    goal.append(" of ");
    goal.append(currentGoal.theTeam.teamName);
    goal.append(".\n");
    System.out.println(goal);
    }
    return goal.toString();
}

}
