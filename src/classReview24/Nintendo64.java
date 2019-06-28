package classReview24;


	public class Nintendo64 extends GameConsole {

	    public static void main(String[] args) {
	        Nintendo64 nintendo = new Nintendo64();
	        nintendo.controller = "red & blue";
	        nintendo.numberOfController = 4;
	        nintendo.ifTvNeeded = true;
	        nintendo.cd = false;
	        nintendo.powerSource = "outlet";
	        // -------------- below are attributes-------------------------
//	        System.out.println(nintendo.controller + " Controler color");
//	        System.out.println(nintendo.numberOfController + " number of controler");
//	        System.out.println(nintendo.ifTvNeeded + " if tv is needed");
//	        System.out.println(nintendo.cd + " is cd required");
//	        System.out.println(nintendo.powerSource + " is power source needed");

	        // -------------- below are behaviors-------------------------
	        /**
	         * ----System.out.println(nintendo.portable() + " is game system portable");
	         * //----System.out.println(nintendo.surfWeb()+" able to surf the web"); ----too
	         * old to play on web
	         * nintendo.readDisk(); nintendo is a casset player not disk
	         **/

	        nintendo.ableToPlay();
	        System.out.println(nintendo.canPlayMarioGames()+" Can play mario games");
	    }
	    
	    
	    boolean canPlayMarioGames() {
	        return true;
	    }

	}


