public class SortNumbers {
    public static void main(String[] args) {
        // Define and initialize an array of 10 numbers
        int[] numbers = {5, 3, 8, 1, 9, 7, 4, 2, 10, 6};

        // Bubble Sort
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Output the sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
