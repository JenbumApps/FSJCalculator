public class MeasurementCalculator {
    /**
     * Calculates the Square of the given value
     * @param value
     * @return square of the given value
     */
    public static double square(double value) {
        return value * value;
    }

    /**
     * Calculates the Cube of the given value
     * @param value
     * @return cube of the given value
     */
    public static double cube(double value) {
        return value * value * value;
    }

    /**
     * Calculates Area of a given rectangle
     * @param length of rectangle
     * @param breadth of rectangle
     * @return area of given rectangle (length * breadth)
     */
    public static double area(double length, double breadth) {
        return length * breadth;
    }


    /**
     * Calculates Perimeter of a given rectangle
     * @param length of rectangle
     * @param breadth of rectangle
     * @return perimeter of given rectangle 2*(length + breadth)
     */
    public static double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    /**
     * prints first 100 odd numbers
     */
    public static void printFirst100OddNumbers() {
        System.out.println("--------- Printing First 100 Odd Numbers ----------\n");

        for(int i=1; i<=100; i++) {

            if(i%2!=0)
                System.out.println(i);
        }

        System.out.println("---------- End ---------");
    }
}
