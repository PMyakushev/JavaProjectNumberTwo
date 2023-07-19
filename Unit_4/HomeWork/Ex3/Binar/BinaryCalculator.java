package Unit_4.HomeWork.Ex3.Binar;

public class BinaryCalculator<T extends Number> {

    public String toBinaryString(T number) {
        if (number instanceof Double || number instanceof Float) {
            // округляем значение
            Long roundedNumber = Math.round(number.doubleValue());

            // возвращаем бинарное значение
            return Long.toBinaryString(roundedNumber);
        }

        return Long.toBinaryString(number.longValue());
    }


    // Для обработки строковых значений
    public String toBinaryStringTwo(String value) {
        try {
            // Попробуем преобразовать строку в Double
            Double doubleValue = Double.valueOf(value);

            // Преобразовываем в бинарную форму
            return toBinaryString((T) doubleValue);
        } catch (NumberFormatException e) {
            // Если строка не является числом, вернём ошибку
            return "Invalid number format";
        }
    }
}
