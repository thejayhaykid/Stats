import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class team {

	HashSet<player> players;
	String name;
	String maxPrepsID;
	
	// Robust constructor.
	public team(String _name, boolean setUp) {
		players = new HashSet<player>();
		this.name = _name;
		this.maxPrepsID = "";
	}

	// Standard constructor.
	public team(String _name) {
		players = new HashSet<player>();
		this.name = _name;
		this.maxPrepsID = "";
	}
	
	// Default constructor.
	public team() {
		players = new HashSet<player>();
		this.name = "Unknown";
		this.maxPrepsID = "";
	}
	
	// Make a random team with players with numbers 0->n
	protected HashSet<player> makeRandomTeam(int numPlrs) {
		HashSet<player> team = new HashSet<player>();
		
		for (int i = 0; i < numPlrs; i++) {
			player temp = new player(i);
			team.add(temp);
		}
		
		return team;
	}
	
	protected void setID(String ID) {
		this.maxPrepsID = ID;
	}
	
	// Load a team from a "x.team" file
	protected team loadTeam() {
		// TODO 
		return null;
	}
	
	// Making a team with setting up names, numbers, and positions manually
	protected team makeTeam() {
		// TODO
		team team = new team();
		
		
		
		return team;
	}
	
	// Saving "x.team" file
	public void saveTeam(Scanner in) {
		System.out.print("Enter the name of the team file: ");
		String ans = in.nextLine();
		
		if (ans.length() < 1) {
			ans = this.name;
			ans += new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
			System.out.println(ans);
		}
		
		if (ans.length() > 4) {
			if (ans.substring(ans.length() - 4) != ".team") {
				ans += ".team";
			}
		}
		
		try {
			PrintWriter out = new PrintWriter(ans);
			
			out.println("Name: " + this.name);
			if (this.maxPrepsID.length() > 0) {
				out.println("ID: " + this.maxPrepsID);
			} else {
				out.println();
			}
			
			out.println("Players:");
			
			Iterator<player> it = this.players.iterator();
			player temp = it.next();
			
			do {
				out.println(temp.name + " - " + temp.number + " - " + temp.pos);
				temp = it.next();
			} while (it.hasNext());
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public team createTeam(Scanner in) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected void exportForMaxPreps(PrintWriter out) {
		if (maxPrepsID.length() == 32) {
			out.println(maxPrepsID);
		}
		
		out.println("Jersey|PassingComp|PassingAtt|PassingYards|PassingTD|PassingInt|PassingLong|RushingNum|RushingYards|RushingLong|RushingTDNum|ReceivingNum|ReceivingYards|ReceivingLong|ReceivingTDNum|OffensiveFumbesLost|PancakeBlocks|Tackles|Assists|Sacks|TacklesForLoss|CausedFumbles|FumbleRecoveries|FumbleRecoveryYards|FumbleReturnedTDNum|Safeties|INTs|INTYards|PassesDefensed|IntReturnedTDNum");
		
		String p = "|"; //Pipe for delimiter
		
		Iterator<player> it = this.players.iterator();
		player temp = it.next();
		
		do {
			out.print(temp.number + p);
			out.print(temp.passComp + p);
			out.print(temp.passAtt + p);
			out.print(temp.passYds + p);
			out.print(temp.passTD + p);
			out.print(temp.passInt + p);
			out.print(temp.passLong + p);
			out.print(temp.rushAtt + p);
			out.print(temp.rushYds + p);
			out.print(temp.rushLong + p);
			out.print(temp.rushTD + p);
			out.print(temp.recComp + p);
			out.print(temp.recYds + p);
			out.print(temp.recLong + p);
			out.print(temp.recTD + p);
			out.print(temp.rushFum + p);
			out.print(temp.bloPan + p);
			out.print(temp.tkl + p);
			out.print(temp.tklAss + p);
			out.print(temp.tklSck + p);
			out.print(temp.tklLss + p);
			out.print(temp.fumFor + p);
			out.print(temp.fumRec + p);
			out.print(temp.fumYds + p);
			out.print(temp.fumTD + p);
			out.print(temp.safety + p);
			out.print(temp.intRec + p);
			out.print(temp.intYds + p);
			out.print(temp.pssBrk + p);
			out.print(temp.intTD + "\n");
			temp = it.next();
		} while (it.hasNext());
	}

}