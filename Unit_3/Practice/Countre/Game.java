package Unit_3.Practice.Countre;

public interface Game {
    void start(int lengthWord, int countTry); // int lengthWord - количство попыток, int countTry - победа
    Ansver inputValue(String value); // ввод букв слов и символом в класс ответа
    GameStatus getGame();

}
