public class Score {
    private int points = 100; // start at 100

    // Decrement by 1 and return the updated score
    public int decrement() {
        points -= 1;
        if (points < 0) {
            points = 0; // prevent negative score
        }
        return points;
    }

    public int getPoints() {
        return points;
    }
}
