package lesson01.part2;

public class Task03 {

    /**
     * В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <a+100> долларов в месяц."
     * Где <a+100> - это зарплата увеличенная на 100.
     * <p>
     * Пример вывода на экран для а = 700:
     *
     * <p>
     * <p>
     * Требования:
     * 1. Программа должна выводить текст на экран.
     * 2. Метод main не должен вызывать System.out.println или System.out.print.
     * 3. Метод hackSalary Твоя зарплата составляет: 800 долларов в месяц.не должен возвращать результат.
     * 4. Метод main должен вызвать метод hackSalary только один раз.
     * 5. Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.
     */

    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        int x = a+100;
        String print = "Твоя зарплата составляет: " + x + " долларов в месяц.";

        System.out.println(print);
    }
}
