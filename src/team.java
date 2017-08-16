import java.util.HashSet;

public class team {

	HashSet<player> players;
	String name;
	
	// Robust constructor.
	public team(String _name, boolean setUp) {
		players = new HashSet<player>();
		this.name = _name;
		
		// TODO - Setup team creation
		if (!setUp) {
			players = makeRandomTeam(50);
		} else {
			players = openTeam();
		}
	}

	// Standard constructor.
	public team(String _name) {
		players = new HashSet<player>();
		this.name = _name;
	}
	
	// Default constructor.
	public team() {
		players = new HashSet<player>();
		this.name = "Unknown";
	}
	
	// Make a random team with players with numbers 0->n
	protected HashSet<player> makeRandomTeam(int numPlrs) {
		// TODO
		HashSet<player> team = new HashSet<player>();
		
		for (int i = 0; i < numPlrs; i++) {
			player temp = new player(i);
			team.add(temp);
		}
		
		return team;
	}
	
	// Load a team from a "x.team" file
	protected HashSet<player> openTeam() {
		// TODO 
		return null;
	}
	
	// Making a team with setting up names, numbers, and positions manually
	protected HashSet<player> makeTeam() {
		// TODO
		HashSet<player> team = new HashSet<player>();
		
		
		
		return team;
	}

}