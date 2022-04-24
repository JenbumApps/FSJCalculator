import java.util.Scanner;

/**
 * Display user interface
 */
public class CalculatorUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your operation\n\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication(*)\n4. Division(/)\n");

        int userInput = scanner.nextInt();

        while(userInput == 0 || userInput > 4) {
            System.out.println("Select a valid operation between 1 and 4\n");
            userInput = scanner.nextInt();
        }


        switch(userInput) {

            case 1:
                addition(scanner);
                break;

            case 2:
                subtraction(scanner);
                break;

            case 3:
                multiplication(scanner);
                break;

            case 4:
                division(scanner);
                break;
        }

    }

    /**
     * Gets User input for addition and display its result
     */
    private static void addition(Scanner scanner){
        System.out.println("""
                Select the type of number you wish to add
                1. Integer
                2. Floating Point (float)
                3. Double""");

        // Getting user input
        int ui = scanner.nextInt();
        while(ui == 0 || ui > 3) {
            System.out.println("Select a valid operation between 1, 2 and 3\n");
            ui = scanner.nextInt();
        }

        if(ui == 1){
            System.out.println("Enter your first integer value");
            int intVal1 = scanner.nextInt();

            System.out.println("Enter your second integer value");
            int intVal2 = scanner.nextInt();

            System.out.println("The sum of "+intVal1+" and " +intVal2+ " is " + Calculator.add(intVal1, intVal2));
        } else if(ui == 2){
            System.out.println("Enter your first float value");
            float floatVal1 = scanner.nextFloat();

            System.out.println("Enter your second float value");
            float floatVal2 = scanner.nextFloat();

            System.out.println("The sum of "+floatVal1+" and " +floatVal2+ " is " + Calculator.add(floatVal1, floatVal2));
        } else if(ui == 3){
            System.out.println("Enter your first double value");
            double doubleVal1 = scanner.nextDouble();

            System.out.println("Enter your second double value");
            double doubleVal2 = scanner.nextDouble();

            System.out.println("The sum of "+doubleVal1+" and " +doubleVal2+ " is " + Calculator.add(doubleVal1, doubleVal2));
        }
    }

    /**
     * Gets User input for subtraction and display its result
     */
    private static void subtraction(Scanner scanner){
        System.out.println("""
                Select the type of number you wish to subtract
                1. Integer
                2. Floating Point (float)
                3. Double""");

        // Getting user input
        int ui = scanner.nextInt();
        while(ui == 0 || ui > 3) {
            System.out.println("Select a valid operation between 1, 2 and 3\n");
            ui = scanner.nextInt();
        }

        if(ui == 1){
            System.out.println("Enter your first integer value");
            int intVal1 = scanner.nextInt();

            System.out.println("Enter your second integer value");
            int intVal2 = scanner.nextInt();

            System.out.println("The subtraction of "+intVal1+" and " +intVal2+ " is " + Calculator.subtract(intVal1, intVal2));
        } else if(ui == 2){
            System.out.println("Enter your first float value");
            float floatVal1 = scanner.nextFloat();

            System.out.println("Enter your second float value");
            float floatVal2 = scanner.nextFloat();

            System.out.println("The subtraction of "+floatVal1+" and " +floatVal2+ " is " + Calculator.subtract(floatVal1, floatVal2));
        } else if(ui == 3){
            System.out.println("Enter your first double value");
            double doubleVal1 = scanner.nextDouble();

            System.out.println("Enter your second double value");
            double doubleVal2 = scanner.nextDouble();

            System.out.println("The subtraction of "+doubleVal1+" and " +doubleVal2+ " is " + Calculator.subtract(doubleVal1, doubleVal2));
        }
    }

    /**
     * Gets User input for multiplication and display its result
     */
    private static void multiplication(Scanner scanner){
        System.out.println("""
                Select the type of number you wish to multiply
                1. Integer
                2. Floating Point (float)
                3. Double""");

        // Getting user input
        int ui = scanner.nextInt();
        while(ui == 0 || ui > 3) {
            System.out.println("Select a valid operation between 1, 2 and 3\n");
            ui = scanner.nextInt();
        }

        if(ui == 1){
            System.out.println("Enter your first integer value");
            int intVal1 = scanner.nextInt();

            System.out.println("Enter your second integer value");
            int intVal2 = scanner.nextInt();

            System.out.println("The multiplication of "+intVal1+" and " +intVal2+ " is " + Calculator.multiply(intVal1, intVal2));
        } else if(ui == 2){
            System.out.println("Enter your first float value");
            float floatVal1 = scanner.nextFloat();

            System.out.println("Enter your second float value");
            float floatVal2 = scanner.nextFloat();

            System.out.println("The multiplication of "+floatVal1+" and " +floatVal2+ " is " + Calculator.multiply(floatVal1, floatVal2));
        } else if(ui == 3){
            System.out.println("Enter your first double value");
            double doubleVal1 = scanner.nextDouble();

            System.out.println("Enter your second double value");
            double doubleVal2 = scanner.nextDouble();

            System.out.println("The multiplication of "+doubleVal1+" and " +doubleVal2+ " is " + Calculator.multiply(doubleVal1, doubleVal2));
        }
    }

    /**
     * Gets User input for division and display its result
     */
    private static void division(Scanner scanner){
        System.out.println("""
                Select the type of number you wish to multiply
                1. Integer
                2. Floating Point (float)
                3. Double""");

        // Getting user input
        int ui = scanner.nextInt();
        while(ui == 0 || ui > 3) {
            System.out.println("Select a valid operation between 1, 2 and 3\n");
            ui = scanner.nextInt();
        }

        if(ui == 1){
            System.out.println("Enter your first integer value");
            int intVal1 = scanner.nextInt();

            System.out.println("Enter your second integer value");
            int intVal2 = scanner.nextInt();

            System.out.println("The division of "+intVal1+" and " +intVal2+ " is " + Calculator.divide(intVal1, intVal2));
        } else if(ui == 2){
            System.out.println("Enter your first float value");
            float floatVal1 = scanner.nextInt();

            System.out.println("Enter your second float value");
            float floatVal2 = scanner.nextInt();

            System.out.println("The division of "+floatVal1+" and " +floatVal2+ " is " + Calculator.divide(floatVal1, floatVal2));
        } else if(ui == 3){
            System.out.println("Enter your first double value");
            float doubleVal1 = scanner.nextInt();

            System.out.println("Enter your second double value");
            float doubleVal2 = scanner.nextInt();

            System.out.println("The division of "+doubleVal1+" and " +doubleVal2+ " is " + Calculator.divide(doubleVal1, doubleVal2));
        }
    }
}
