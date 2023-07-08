package Unit_1.Practice.Bank;

import java.util.Scanner;

//У него должны быть:
//        - реализовать методы:
//        - deposit(amount) - метод для добавления денежных средств на счет.
//        Принимает один аргумент - сумму депозита.
//        - withdraw(amount) - метод для снятия денежных средств со счета.
//        Принимает один аргумент - сумму снятия.
//        (Выше реализованы представлены сигнатуры общих методов)
//        Для сберегательного счёта:
//        - addInterest() - метод для добавления процентов к балансу. Рассчитывает
//        процентную ставку от текущего баланса и добавляет полученную сумму к
//        балансу.
public class Account extends Score {
    private Integer nameAccount;
    private String name;
    private Double manyBalans;

    public Account(Double scoreCredit, Double scoreSavings, Integer nameAccount, String name, Double manyBalans) {
        super(scoreCredit, scoreSavings);
        this.nameAccount = nameAccount;
        this.name = name;
        this.manyBalans = manyBalans;
    }

    public Integer getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(Integer nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getManyBalans() {
        return manyBalans;
    }

    public void setManyBalans(Double manyBalans) {
        this.manyBalans = manyBalans;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую сумму хотите положить? Ваш баланс: " + this.manyBalans);
        double many = scanner.nextDouble();
        scanner.close();
        this.manyBalans = manyBalans + many;
        System.out.println("Ваш баланс: " + this.manyBalans);

    }

    //Double scoreCredit, Double scoreSavings, Integer nameAccount, String name, Double manyBalans
    public String toString() {
        return "scoreCredit: " + scoreCredit + "\n scoreSavings: " + scoreSavings + "\n nameAccount: " + nameAccount + "\n name: " + name + "\n manyBalans: " + manyBalans;
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую сумму хотите снять? Ваш баланс: " + this.manyBalans);
        Double many = scanner.nextDouble();
        scanner.close();
        if (this.manyBalans > many) {
            this.manyBalans = manyBalans - many;
            System.out.println("Ваш баланс: " + this.manyBalans);

        } else {
            System.out.println("Недостаточно средств");
        }

    }

    public double addInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько % прибавить к счету: " + this.manyBalans);
        Double many = scanner.nextDouble();
        System.out.println("Прцент: " + (many) + "% В сумме " + manyBalans * (many / 100));
        this.manyBalans = manyBalans + (manyBalans * (many / 100));
        scanner.close();
        return this.manyBalans;
    }
}

