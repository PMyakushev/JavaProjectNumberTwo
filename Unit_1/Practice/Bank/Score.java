package Unit_1.Practice.Bank;
public class Score {
    Double scoreCredit;
    Double scoreSavings;

    public Score(Double scoreCredit, Double scoreSavings) {
        this.scoreCredit = scoreCredit;
        this.scoreSavings = scoreSavings;
    }

    public Double getScoreCredit() {
        return scoreCredit;
    }

    public void setScoreCredit(Double scoreCredit) {
        this.scoreCredit = scoreCredit;
    }

    public Double getScoreSavings() {
        return scoreSavings;
    }

    public void setScoreSavings(Double scoreSavings) {
        this.scoreSavings = scoreSavings;
    }
}
