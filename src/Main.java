public class Main {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.d;
        double result = 0.0d;
        char operationCode = 'd';

        if (operationCode == 'a')
            result = value1 + value2;
        else if (operationCode == 's')
            result = value1 - value2;
        else if (operationCode == 'm')
            result = value1 * value2;
        else if (operationCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);
    }
}