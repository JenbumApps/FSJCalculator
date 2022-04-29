import java.util.Scanner;

/**
 * Display user interface
 */
public class CalculatorUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your operation\n\n" +
                "1. Addition (+)\n" +
                "2. Subtraction (-)\n" +
                "3. Multiplication(*)\n" +
                "4. Division(/)\n" +
                "5. Square\n" +
                "6. Cube\n" +
                "7. Area\n" +
                "8. Perimeter\n" +
                "9. Print First 100 Odd Numbers\n");

        int userInput = scanner.nextInt();

        while(userInput == 0 || userInput > 10) {
            System.out.println("Select a valid operation between 1 and 9\n");
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
            case 5:
                // Square
                square(scanner);
                break;
            case 6:
                // Cube
                cube(scanner);
                break;

            case 7:
                // Area
                area(scanner);
                break;
            case 8:
                // Perimeter
                perimeter(scanner);
                break;
            case 9:
                // Print first 100 Odd numbers
                first100OddNumbers();

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

    /**
     * Gets User input for finding Square of a given number and
     * display its result
     */
    private static void square(Scanner scanner) {
        System.out.println("Enter a number to find its Square");
        long squareUserInput = scanner.nextLong();
        System.out.println("Square of "+
                squareUserInput+" is "+MeasurementCalculator.square(squareUserInput));
    }

    /**
     * Gets User input for finding cube of a given number and
     * display its result
     */
    private static void cube(Scanner scanner) {
        System.out.println("Enter a number to find its Cube");
        long cubeUserInput = scanner.nextLong();
        System.out.println("Cube of "+
                cubeUserInput+" is "+MeasurementCalculator.cube(cubeUserInput));
    }

    private static void area(Scanner scanner){
        System.out.println("Enter the length of rectangle");
        long aLength = scanner.nextLong();

        System.out.println("Enter the breadth of rectangle");
        long aBreadth = scanner.nextLong();

        System.out.println("Area of rectangle is "+MeasurementCalculator.area(aLength, aBreadth));
    }

    /**
     * Gets User input for finding perimeter of a rectangle and
     * display its result
     */
    private static void perimeter(Scanner scanner) {
        System.out.println("Enter the length of rectangle");
        long pLength = scanner.nextLong();

        System.out.println("Enter the breadth of rectangle");
        long pBreadth = scanner.nextLong();

        System.out.println("Perimeter of rectangle is "+MeasurementCalculator.perimeter(pLength, pBreadth));
    }

    /**
     * display the result of first 100 Odd numbers
     */
    private static void first100OddNumbers() {
        MeasurementCalculator.printFirst100OddNumbers();
    }
}
