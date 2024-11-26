import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class ArraysDemo {
    Scanner scanner = new Scanner(System.in);

    /**
     * Task 1: Write a program that creates an array of integers with a length of 3.
     * Assign the values 1, 2, and 3 to the indexes.
     * Print out each array element.
     */
    public void ArrayExample() {
        int[] numbers = new int[3];
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
        int midindex = numbers[midvalue];
        System.out.println("Midindex : " + midindex);
    }

    /**
     * Write a program that creates an array of String type
     * and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
     * Print out the array length.
     * Make a copy using the clone( ) method.
     * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
     */
    public String ArrayClone() {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Length if the String Array " + colors.length);
        String copiedColors[] = colors.clone();
        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(copiedColors));
        return "";
    }

    /**
     * Write a program that creates an integer array with 5 elements (i.e., numbers).
     * The numbers can be any integers.
     * Print out the value at the first index and the last index using length - 1 as the index.
     * Now try printing the value at index = length (e.g., myArray[myArray.length] ).
     * Notice the type of exception which is produced.
     * Now try to assign a value to the array index 5.
     * You should get the same type of exception.
     */
    public void ArrayTask4() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        int arrayLength = numbers.length;
        System.out.println("Length of array : " + arrayLength);
        System.out.println("First Element :" + numbers[0]);
        System.out.println("Last Element" + numbers[4]);
    }

    /**
     * Task 5: Write a program where you create an integer array with a length of 5.
     * Loop through the array and
     * assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
     */
    public void ArrayTask5() {
        int[] numbers = new int[5];
        //System.out.println("Enter theLength of array : " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            // scanner.nextLine();
            System.out.println("Enter number " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
        //String[] num;
        //for(int num : numbers){
        //  System.out.println(num);
        //}
    }

    /**
     * Task 6: Write a program where you create an integer array of 5 numbers.
     * Loop through the array and
     * assign the value of the loop
     * control variable multiplied by 2 to the corresponding index in the array.
     */
    public void ArrayTask6() {
        int[] numbers = new int[5];
        //System.out.println("Enter theLength of array : " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            // scanner.nextLine();
            System.out.println("Enter number " + i + ": ");
            numbers[i] = scanner.nextInt() * 2;
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
    }
    /**
     * Task 7: Write a program where you create an array of 5 elements.
     * Loop through the array and print the value of each element,
     * except for the middle (index 2) element.
     */
    public void ArrayTask7() {
        int[] numbers = new int[5];
        //System.out.println("Enter the Length of array : " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
           int mid=numbers.length/ 2;
           System.out.println(mid);
            numbers[i] = scanner.nextInt();
            if (i != mid) {
                System.out.println("Entered number :"+numbers[i]);
            }
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
    }

    /**
     * Task 8: Write a program that creates a String array of 5 elements
     * and swaps the first element with the middle element without creating a new array.
     */
    public void ArrayTask8() {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Original array: "+Arrays.toString(colors));
        int midvalue = colors.length / 2;
        //colors[0], colors[midvalue];
        //colors[midvalue] = colors[0];
        String temp=colors[0];
        colors[0]=colors[midvalue];
        colors[midvalue]=temp;
        System.out.println("Copied array: "+Arrays.toString(colors));
    }
    /**
     * Task 9:
     * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
     * Print the array in ascending order,
     * and print the smallest and the largest element of the array.
     * The output will look like the following:
     * Array in ascending order: 0, 1, 2, 4, 9, 13
     * The smallest number is 0
     * The biggest number is 13
     */
    public void ArrayTask9() {
        int[] numbers = {4,2,9,13,1,0};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Smallest: "+numbers[0]);
        System.out.println("Largest: "+numbers[numbers.length-1]);
    }

    /**
     * Task 10: Create an array that includes an integer,
     * 3 strings, and 1 double. Print the array.
     */
    public void ArrayTask10() {
        Object[]  obj={10,"Red","blue","green",3.14};
        System.out.println("Original array: " + Arrays.toString(obj));

//        int[] numbers = {4,2,9,13,1,0};
//        String[] colors = {"red", "green","green"};
//        double[] floating = new double[] {1.1,2.2,3.3,4.4,5.5};
//        System.out.println("Original array: " + Arrays.toString(colors));
//        System.out.println("Sorted array: " + Arrays.toString(floating));
    }

    /**
     * Task 11: Write some Java code that asks the user how many favorite things they have.
     * Based on their answer,
     * you should create a String array of the correct size.
     * Then ask the user to enter the things and store them in the array you created.
     * Finally, print out the contents of the array.
     * Example
     * How many favorite things do you have?
     * 7
     */
    public void ArrayTask11() {
//      int[] numbers;
//        System.out.println("Enter the length of the array: ");
//         numbers = new int[]{scanner.nextInt()};
//        for (int i = 0; i < numbers; i++) {
//            System.out.println("Enter the elements of the array: "+i+"");
        System.out.println("How many favorite things do you like");
        int numbers=scanner.nextInt();
        String[] x=new String[numbers];
        int y= x.length;
        for (int i = 0; i <y; i++) {
            System.out.println("enter your favorite things " + i + ": ");
            x[i]=scanner.next();
        }
        System.out.println("Original array: " + Arrays.toString(x));
    }
}