package Sports;

    public class Sports {

        protected int _players;
        protected String _teamName;

        public Sports( int players, String teamName) {
            _players = players;
            _teamName = teamName;
        }

        public void playBall() {
            System.out.println("What game are we playing here?");
        }

//        public void run(String action) {
////            System.out.println(action);
////        }
}
