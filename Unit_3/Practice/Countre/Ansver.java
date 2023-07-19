package Unit_3.Practice.Countre;

public class Ansver {
    private int bulls;
    private int cows;

    public Ansver(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    @Override
    public String toString() {
        return "{" +
                "Коровы=" + cows +
                ", Быки=" + bulls +
                '}';
    }
}
