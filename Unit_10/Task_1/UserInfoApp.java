package Unit_10.Task_1;

import java.io.*;
import java.text.ParseException;
import java.util.regex.Pattern;

public class UserInfoApp {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInfo = null;

        try {
            System.out.println("Введите Фамилию, Имя, Отчество, Дату рождения (dd.mm.yyyy), Номер телефона и Пол (f или m), разделенные пробелом:");
            userInfo = reader.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении ввода: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            String[] infoParts = parseAndValidateUserInfo(userInfo);
            writeToFile(infoParts);
        } catch (ParseException e) {
            System.out.println("Ошибка формата данных: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String[] parseAndValidateUserInfo(String userInfo) throws ParseException {
        String[] infoParts = userInfo.split(" ");

        if (infoParts.length != 6) {
            throw new ParseException("Введено неправильное количество данных. Введено: " + infoParts.length + ", требуется: 6", 0);
        }

        if (!Pattern.matches("^\\d{2}\\.\\d{2}\\.\\d{4}$", infoParts[3])) {
            throw new ParseException("Неверный формат даты. Должен быть: dd.mm.yyyy", 0);
        }

        if (!Pattern.matches("^\\d+$", infoParts[4])) {
            throw new ParseException("Номер телефона должен быть целым числом без форматирования.", 0);
        }

        if (!Pattern.matches("^[fm]$", infoParts[5])) {
            throw new ParseException("Пол должен быть 'f' или 'm'.", 0);
        }

        return infoParts;
    }

    private static void writeToFile(String[] infoParts) throws IOException {
        File file = new File(infoParts[0] + ".excel");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        StringBuilder userInfo = new StringBuilder();
        for (String part : infoParts) {
            userInfo.append(part).append(" ");
        }

        printWriter.println(userInfo.toString());

        printWriter.close();
        fileWriter.close();
    }
}
