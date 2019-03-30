import java.util.Date;
public class SoccerMatch {
	Date startTime;
	Date endTime;
	String location;
	String home;
	String visitor;
	Player[] homePlayers = new Player[11];
	Player[] visitorPlayers = new Player[11];
	Goal[] homeGoals = new Goal[10];
	Goal[] visitorGoals = new Goal[10];
	
	SoccerMatch() {}
	
	SoccerMatch(Date startTime, Date endTime, String home, String visitor){
		this.startTime = startTime;
		this.endTime = endTime;
		this.home = home;
		this.visitor = visitor;
	}
	
	public void addHomePlayer(Player p){
		int i = 0;
		homePlayers[i] = p;
	}
	
	public void addVisitorPlayer(Player p) {
		int i = 0;
		visitorPlayers[i] = p;
	}
	
	public String getWinner(){
		if(homeGoals.length > visitorGoals.length) {
			return home;
		}
		else if(homeGoals.length < visitorGoals.length) {
			return visitor;
		}
		else {
			return "tie";
		}
	}
	
	public void addHomeGoal(Goal g) {
		int i = 0;
		homeGoals[i] = g;
	}
	
	public void addVisitorGoal(Goal g) {
		int i = 0;
		visitorGoals[i] = g;
	}
	
	public Goal[] getHomeGoals(Goal g){
		return homeGoals;
	}
	
	public Goal[] getVisitorGoals(Goal g){
		return visitorGoals;
	}

}
