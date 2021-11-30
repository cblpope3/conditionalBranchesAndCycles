public class Lesson4 {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte eightBitNumber = 127;
        short sixteenBitNumber = 30000;
        int thirtyTwoBitNumber = 2000000000;
        float floatNumber = 44.57f;
        double doubleNumber = 467575.4465;
        char letter = 'a';
        boolean boolVariable = false;

        String text = "Hello World";

        Lesson4 testObject = new Lesson4();
        testObject.testAllMethods();
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода
     */
    public double performCalculations(double a, double b, double c, double d) throws ArithmeticException {
        if (d == 0) throw new ArithmeticException("Arithmetic exception: Division by zero!");
        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа,
     * и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     * если да – вернуть true, в противном случае – false;
     */
    public boolean isSumInBounds(double a, double b) {
        double sum = a + b;
        return ((sum >= 10) && (sum <= 20));
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали, или отрицательное;
     * Замечание: ноль считаем положительным числом.
     */
    public void isPositiveOrNegative(int number) {

        if (number < 0) System.out.println("Number is negative.");
        else System.out.println("Number is positive.");
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     * метод должен вернуть true, если число отрицательное;
     */
    public boolean isNegative(int number) {
        return number < 0;
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     * метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    public void greeting(String name) {
        System.out.printf("Hello, %s!%n", name);
    }

    /**
     * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public void isYearLeap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.printf("Year %d is leap!%n", year);
        } else System.out.printf("Year %d is not leap!%n", year);
    }

    /**
     * This method created to test all methods above.
     */
    public void testAllMethods() {

        System.out.println("Testing performCalculations method:");
        try {
            System.out.println("Expecting 14: ");
            System.out.println(performCalculations(2.0d, 1.0d, 3.0d, 0.5d));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Expecting 0: ");
            System.out.println(performCalculations(0.0d, 1.0d, 3.0d, 0.5d));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Expecting exception: ");
            System.out.println(performCalculations(0.2d, 1.0d, 3.0d, 0.0d));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.printf("%nTesting isSumInBounds method:%n");
        System.out.println("Expecting false");
        System.out.println(isSumInBounds(30, 44));
        System.out.println("Expecting false");
        System.out.println(isSumInBounds(0, 0));
        System.out.println("Expecting true");
        System.out.println(isSumInBounds(10, 4));
        System.out.println("Expecting true");
        System.out.println(isSumInBounds(10, 10));
        System.out.println("Expecting true");
        System.out.println(isSumInBounds(10, 0));

        System.out.printf("%nTesting isPositiveOrNegative method:%n");
        System.out.println("Expecting positive");
        isPositiveOrNegative(11);
        System.out.println("Expecting positive");
        isPositiveOrNegative(0);
        System.out.println("Expecting negative");
        isPositiveOrNegative(-11);

        System.out.printf("%nTesting isNegative method:%n");
        System.out.println("Expecting true");
        System.out.println(isNegative(-1));
        System.out.println("Expecting false");
        System.out.println(isNegative(0));
        System.out.println("Expecting false");
        System.out.println(isNegative(1));

        System.out.printf("%nTesting greeting method:%n");
        greeting("Walter White");

        System.out.printf("%nTesting isYearLeap method:%n");
        System.out.println("2000. Expecting is leap");
        isYearLeap(2000);
        System.out.println("2001. Expecting is not leap");
        isYearLeap(2001);
        System.out.println("2001. Expecting is not leap");
        isYearLeap(2001);
        System.out.println("2002. Expecting is not leap");
        isYearLeap(2002);
        System.out.println("2004. Expecting is leap");
        isYearLeap(2004);
        System.out.println("1972. Expecting is leap");
        isYearLeap(1972);
    }
}
