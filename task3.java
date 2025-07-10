import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Index of 8: " + index);
    }
}