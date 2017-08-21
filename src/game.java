
public class game {
	team homeTeam, awayTeam;
	
	String[] logs;
	
	public game(team home, team away) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.logs = new String[6];
		
		for (int i = 0; i < this.logs.length; i++) {
			this.logs[i] = "";
		}
	}
	
	public game() {
		this.homeTeam = null;
		this.awayTeam = null;
		this.logs = new String[6];
		
		for (int i = 0; i < this.logs.length; i++) {
			this.logs[i] = "";
		}
	}

	public void play() {
		// TODO Auto-generated method stub
		if (this.homeTeam == null || this.awayTeam == null) {
			System.out.println("ERROR: Need to load or create both teams.");
			return;
		}
	}

}
