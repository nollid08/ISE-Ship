class Score {
    private int points = 100; // start score at 100

    // Decrementing by 1
    public void decrement(int amount) {
        points -= amount;
        if (points < 0) {
            points = 0; // prevent negative score
        }
        System.out.println("Score decreased ur current score: " + points);
    }
}

   
