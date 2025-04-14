import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array with combined size of both arrays
        int[] result = new int[array1.length + array2.length];

        // Copy elements of the first array into result array
        System.arraycopy(array1, 0, result, 0, array1.length);

        // Copy elements of the second array into result array
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}

