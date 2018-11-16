package Sports;

public class SportsTest {

    public static void main(String[] args) {


        // new objects instances
        Baseball b = new Baseball(10, "Red Sox");
        Football f = new Football(10, "Jaguars");
        Soccer s = new Soccer(10, "Barcelona");
        Basketball Bask = new Basketball(10, "Spurs");
        Sports generalsport = new Sports(10, "IM A TEAM NAME");
        // This is an Array of Sports Objects
        Sports[] sports = {b, f, s, Bask, generalsport};

//        iterate over the Array of Strings
//        for (Sports sport : sports) {
//            System.out.println(sport._players);
//            System.out.println(sport._teamName);
//        }
        f.playBall("TOUCHDOWN", 6);
        f.run("SPRINT!");

//      Create a new "Variable" that is TYPEOF "Sport", but within that
//      variable is an object that is TYPEOF football

        Sports newTeam = new Football(10, "Longhorns");
       // Casting. Avoid this if possible
        Football Longhorns = (Football) newTeam;
//        newTeam.run("RUN THE BALL");
        Longhorns.run("RUN THE BALL");
    }

}
