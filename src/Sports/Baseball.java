package Sports;

public class Baseball extends Sports {

    // This is the same thing as a constructor
    // for the main class.
    public Baseball( int players, String teamName) {
        super(players, teamName);
    }

    public void playBall() {
        System.out.println("Take me out to the ball game!");
    }

}
