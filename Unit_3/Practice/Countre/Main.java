package Unit_3.Practice.Countre;


import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начать игру? " +
                "1. Да " +
                "2. Нет ");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("1"))
            startTheGame();
    }

    public static void startTheGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбрать игру: " +
                "1. Игра с цифрами  " +
                "2. Игра с русскими буквами  " +
                "3. Игра с латинскими буквами  ");
        String gameType = sc.nextLine();
        AbstractGame game = new NumberGame();
        switch (gameType) {
            case "1" -> game = new NumberGame();
            case "2" -> game = new RuGame();
            case "3" -> game = new EnGame();
            default -> System.out.println("Вы ввели что-то не то, играем с цифрами");
        }
        System.out.println(); // todo comment Of the Year
        System.out.println("Введите длину слова");
        int lengthWord = sc.nextInt();
        System.out.println("Введите кол-во попыток");
        int countTry = sc.nextInt();
        game.start(lengthWord, countTry);
        boolean isFinish = false;
        boolean isWin = false;
        while (!(isFinish || isWin)) {
            Ansver ansver = game.inputValue(sc.nextLine());
            System.out.println(ansver);
            isFinish = game.getGame() == GameStatus.FINISH;
            isWin = game.getGame() == GameStatus.WIN;
        }
        if (isWin) System.out.println("Мы победили");
        else System.out.println("Мы проиграли");
        System.out.println("Показать лог игры: " +
                "1. Да "+
                "2. Нет ");
        if (sc.nextLine().equals("1"))
        game.gameLog.printGameLog();
        System.out.println();
        System.out.println("Играть снова: " +
                "1. Да "+
                "2. Нет ");
        if (sc.nextLine().equals("1"))
            startTheGame();

    }
}
