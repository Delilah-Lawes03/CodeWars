public class User {
    public int rank = -8;
    public int progress = 0;
    public void incProgress(int rank) {
        if (rank < -8 || rank > 8 || rank == 0) throw new IllegalArgumentException();
        if (this.rank < 0 && rank > 0) rank--;
        if (this.rank > 0 && rank < 0) rank++;
        if (rank == this.rank) {
            progress += 3;
        } else if (rank == this.rank - 1) {
            progress += 1;
        } else if (rank >= this.rank + 1) {
            progress += 10 * (rank - this.rank) * (rank - this.rank);
        }
        if (progress >= 100) {
            this.rank += progress / 100;
            progress %= 100;
        }
        if (this.rank == 0) this.rank++;
        if (this.rank > 8) {
            this.rank = 8;
            progress = 0;
        }
    }
}
