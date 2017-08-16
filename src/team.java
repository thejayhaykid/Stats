import java.util.HashSet;

public class team {

	HashSet<player> players;
	String name;
	
	public team(String _name, boolean setUp) {
		players = new HashSet<player>();
		this.name = _name;
		
		if (!setUp) {
			players = makeRandomTeam(50);
		} else {
			players = openTeam();
		}
	}

	public team(String _name) {
		players = new HashSet<player>();
		this.name = _name;
	}
	
	public team() {
		players = new HashSet<player>();
	}
	
	protected HashSet<player> makeRandomTeam(int numPlrs) {
		HashSet<player> team = new HashSet<player>();
		
		for (int i = 0; i < numPlrs; i++) {
			player temp = new player(i);
			team.add(temp);
		}
		
		return team;
	}
	
	protected HashSet<player> openTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected HashSet<player> makeTeam() {
		HashSet<player> team = new HashSet<player>();
		
		
		
		return team;
	}

}