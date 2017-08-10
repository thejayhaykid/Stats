import java.util.HashSet;

public class team {

	HashSet<player> players;
	String name;
	
	public team(String _name, boolean setUp) {
		players = new HashSet<player>();
		this.name = _name;
	}
	
	public team(String _name) {
		players = new HashSet<player>();
		this.name = _name;
	}
	
	public team() {
		players = new HashSet<player>();
	}

}
