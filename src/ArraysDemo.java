
public class Arrays {
    /**
     * Task 1: Write a program that creates an array of integers with a length of 3.
     * Assign the values 1, 2, and 3 to the indexes.
     * Print out each array element.
     */
    public void ArrayExample(){
        int[] numbers =new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /***
     * Task 2: Write a program that returns the middle element in an array.
     * Give the following values to the integer array: {13, 5, 7, 68, 2}
     * and produce the following output: 7
     */
    public void ArrayExample2() {
        int[] numbers = new int[5];
        numbers[0] = 13;
        numbers[1] = 5;
        numbers[2] = 7;
        numbers[3] = 68;
        int midvalue = numbers.length / 2;
        int midindex=numbers[midvalue];
        System.out.println("Midindex : " + midindex);
    }
    /**
     *  Write a program that creates an array of String type
     *  and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
     *  Print out the array length.
     *  Make a copy using the clone( ) method.
     *  Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
     */
    public String ArrayClone() {
        String[] colors={"red","green","blue","yellow"};
        System.out.println("Length if the String Array "+colors.length);
        String copiedColors[]=colors.clone();
        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(copiedColors));
    }
}
