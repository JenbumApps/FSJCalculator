public class MeasurementCalculator {
    /**
     * Calculates the Square of the given value
     * @param value
     * @return square of the given value
     */
    public static long square(long value) {
        return value * value;
    }

    /**
     * Calculates the Cube of the given value
     * @param value
     * @return cube of the given value
     */
    public static long cube(long value) {
        return square(value) * value;
    }

    /**
     * Calculates Area of a given rectangle
     * @param length of rectangle
     * @param breadth of rectangle
     * @return area of given rectangle (length * breadth)
     */
    public static long area(long length, long breadth) {
        return length * breadth;
    }


    /**
     * Calculates Perimeter of a given rectangle
     * @param length of rectangle
     * @param breadth of rectangle
     * @return perimeter of given rectangle 2*(length + breadth)
     */
    public static long perimeter(long length, long breadth) {
        return 2 * (length + breadth);
    }

    /**
     * prints first 100 odd numbers
     */
    public static void printFirst100OddNumbers() {
        System.out.println("--------- Printing First 100 Odd Numbers ----------\n");

        for(int i=1; i<=100; i++) {

            if(i%2!=0)
                System.out.print(i+", ");
        }

        System.out.println("---------- End ---------");
    }
}
