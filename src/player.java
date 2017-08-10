
public class player {

	// Player
    int number;
    String name;
    String pos;
    
    // Offensive Stats
    int passYds;
    int passAtt;
    int passComp;
    double passRtg;
    int passTD;
    double compPerc;
    int passInt;
    int passLong;
    int rushAtt;
    int rushYds;
    double rushYPC;
    int rushTD;
    int rushFum;
    int rushLong;
    int recAtt;
    int recComp;
    int recYds;
    double recYPC;
    int recTD;
    int recLong;
    int bloPan;
    
    // Deffensive Stats
    int tkl;
    int tklAss;
    int tklSck;
    int tklLss;
    int fumFor;
    int fumRec;
    int fumYds;
    int fumTD;
    int safety;
    int intRec;
    int intYds;
    int intDef;
    int intTD;
    
    // Full constructor
    public player(int _num, String _name, String _pos) {
    	this.pos = _pos;
    	this.name = _name;
    	this.number = _num;
    	
    	zeroScores();
    }

    // Most common constructor
	public player(int num, String _name) {
		this.pos = "NA";
		this.name = _name;
		this.number = num;
		
		zeroScores();
	}
    
	// Baseline constructor
	public player() {
		this.name = "Unknown";
		this.pos = "NA";
		
		zeroScores();
	}
	
	// Set all stats to 0, used for constructor
	private void zeroScores() {
		// Offensive Stats
	    this.passYds = 0;
	    this.passAtt = 0;
	    this.passComp = 0;
	    this.passRtg = 0.0;
	    this.passTD = 0;
	    this.compPerc = 0.0;
	    this.passInt = 0;
	    this.passLong = 0;
	    this.rushAtt = 0;
	    this.rushYds = 0;
	    this.rushYPC = 0.0;
	    this.rushTD = 0;
	    this.rushFum = 0;
	    this.rushLong = 0;
	    this.recAtt = 0;
	    this.recComp = 0;
	    this.recYds = 0;
	    this.recYPC = 0.0;
	    this.recTD = 0;
	    this.recLong = 0;
	    this.bloPan = 0;
	    
	    // Deffensive Stats
	    this.tkl = 0;
	    this.tklAss = 0;
	    this.tklSck = 0;
	    this.tklLss = 0;
	    this.fumFor = 0;
	    this.fumRec = 0;
	    this.fumYds = 0;
	    this.fumTD = 0;
	    this.safety = 0;
	    this.intRec = 0;
	    this.intYds = 0;
	    this.intDef = 0;
	    this.intTD = 0;
	}
	
	// TODO: Build main functions.

}
