package CollegeFootball;

public class FloridaStateUniversity extends CollegeFootballTeams{

    @Override
    public void schoolName(){
        System.out.println("Florida State University");
    }

    @Override
    public void stadium() {
        System.out.println("Stadium: Doak Cambell Bobby Bowden Field");
    }

    @Override
    public void teamMascot() {
        System.out.println("Mascot: Seminoles");
    }

    @Override
    public void teamColors() {
        System.out.printf("Team colors:%nGarnet & Gold");
    }
}
