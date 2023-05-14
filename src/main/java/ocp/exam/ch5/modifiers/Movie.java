package ocp.exam.ch5.modifiers;

public class Movie {
/**
    public class Movie {
2:     private int butter = 5;
3:     private Movie() {}
4:     protected class Popcorn {
5:        private Popcorn() {}
6:        public static int butter = 10;
7:        public void startMovie() {
                8:           System.out.println(butter);
                9:        }
10:    }
11:    public static void main(String[] args) {
            12:       var movie = new Movie();
            13:       Movie.Popcorn in = new Movie().new Popcorn();
            14:       in.startMovie();
            15:    } }**/
    private int butter = 5;
    private Movie() {}
    protected class PopCorn {
        private static final int butter = 12;
        private PopCorn() {}

        public void startMovie() {
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie = new Movie();
        var pop = movie.new PopCorn();
        pop.startMovie();
    }
}
