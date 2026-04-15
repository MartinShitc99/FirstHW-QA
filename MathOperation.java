public class MathOperation {
    public static void main(String[] args) {
        int sum = add( 10, 11);
        System.out.println("Результат прибавления: " + sum);

        int sum1 = subtrack( 15, 7);
        System.out.println("Результат вычетания: " + sum1);

        int sum2 = multiply( 3, 7);
        System.out.println("Результат вычетания: " + sum2);

        double sum3 = divide( 42, 7);
        System.out.println("Результат вычетания: " + sum3);

//        2.findMax
        int sum4 = findMax(10, 30);
        System.out.println("Максимальное число: " + sum4);

//        3.difference
        int sum5 = difference( 11, 11);
        System.out.println("Разность двух чисел: " + sum5);

//        4.squareArea
        double sum6 = squareArea(100.2);
        System.out.println("Площадь: " + sum6);

//        4.squarePerimeter
        double sum7 = squarePerimeter(100.2);
        System.out.println("Периметр: " + sum7);

 //        5.convertSecondsToMinutes
        int sum8 = convertSecondsToMinutes(120);
        System.out.println("Количество минут: " + sum8);

 //        6.averageSpeed
        double sum9 = averageSpeed(120, 20);
        System.out.println("Средняя скорость: " + sum9);

        //        7.findHypotenuse
        double sum10 = findHypotenuse(121, 25);
        System.out.println("Гипотенуза: " + sum10);

        //        8.circleCircumference
        double sum11 = circleCircumference(27);
        System.out.println("Длина окружности: " + sum11);

        //        9.calculatePercentage
        double sum12 = calculatePercentage(27, 100);
        System.out.println("Вычисление процентов: " + sum12);

        //        10.celsiusToFahrenheit
        double sum13 = celsiusToFahrenheit(27);
        System.out.println("Цельсии: " + sum13);

        //        10.FahrenheitToCelsius
        double sum14 = FahrenheitToCelsius(27);
        System.out.println("Фаренгейты: " + sum14);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtrack(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }

//  2.findMax
    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

//    3.difference
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    //        4.squareArea
    public static double squareArea(double side) {
        return side * side;
    }

    //        4.squarePerimeter
    public static double squarePerimeter(double side) {
        return 4 * side;
    }

//        5.convertSecondsToMinutes
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    //        6.averageSpeed
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    //        7.findHypotenuse
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    //        8.findHypotenuse
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //        9.findHypotenuse
    public static double calculatePercentage(double part, double total) {
        return (part / total) * 100;
    }

    //        9.celsiusToFahrenheit
    public static double celsiusToFahrenheit(double С) {
        return С * 9 / 5 + 32;
    }

//    FahrenheitToCelsius
    public static double FahrenheitToCelsius(double F) {
        return (F - 32) * 5 / 9;
    }

}
