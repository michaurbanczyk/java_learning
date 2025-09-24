import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] operationCode = {'d', 'a', 's', 'm'};
        double[] results = new double[operationCode.length];

        if(args.length == 0){
            for (int i = 0; i < operationCode.length; i++) {
            results[i] = execute(operationCode[i], leftVals[i], rightVals[i]);
        }
            for (double result : results)
                System.out.println("Result: " + result);
        } else if (args.length == 3){
            handleCommandLine(args);
        }
        else {
            System.out.println("Wrong number of arguments");
        }
    }

    static double execute(char operationCode, double leftVal, double rightVal) {
        switch (operationCode) {
            case 'd':
                return leftVal + rightVal;
            case 'a':
                return leftVal - rightVal;
            case 's':
                return leftVal * rightVal;
            case 'm':
                return rightVal != 0.0d ? leftVal / rightVal : 0.0d;
            default:
                System.out.println("Invalid operationCode:" + operationCode);
                return 0.0d;
        }
    }

    static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result =  execute(opCode, leftVal, rightVal);
        System.out.println("Result: " + result);
    }
}