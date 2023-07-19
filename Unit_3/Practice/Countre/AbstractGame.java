package Unit_3.Practice.Countre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status = GameStatus.INIT;
    GameLog gameLog = new GameLog(new ArrayList<>());
    public AbstractGame(){

    }
    public AbstractGame(int wordLength, int tryCount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.wordLength = lengthWord;
        this.tryCount = countTry;
        word = generateWord();
        System.out.println("word = " + word);
    }

    private String generateWord() {
        List<String> strList = generateCharList();
        StringBuilder str = new StringBuilder();
        Random r = new Random();
        //todo: word generation
        for (int i = 0; i < wordLength; i++) {
            int idx = r.nextInt(strList.size());
            str.append(strList.get(idx));
            strList.remove(idx);
        }
        gameLog.theWord = str.toString();
        return str.toString();
    }
    public abstract List<String> generateCharList();

    @Override
    public Ansver inputValue(String value) {
        if (--tryCount == 0){
            status = GameStatus.FINISH;
        }
        if (status == GameStatus.FINISH){
            return null;
        }
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == word.charAt(i)){
                bulls++;
            }
            if(word.contains(String.valueOf(value.charAt(i)))){
                cows++;
            }

        }
        if (bulls == wordLength) status = GameStatus.WIN;
        Ansver answer = new Ansver(bulls, cows);
        AttempLog attempLog = new AttempLog(answer, value);
        gameLog.gameLog.add(attempLog);
        return new Ansver(bulls, cows);
    }

    @Override
    public GameStatus getGame() {
        return status;
    }
}
