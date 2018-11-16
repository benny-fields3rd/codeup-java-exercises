package Sports;

public class Football extends Sports {

    public Football( int players, String teamName) {
        super(players, teamName);
    }

    public void playBall(String action, int points) {
        System.out.println(action + " " + points);
    }

    public void run(String action) {
        System.out.println(action);
    }

}
