class Factorial {
    public static void main(String args[]) {
        int a, i;
        a = Integer.parseInt(args[0]);
        int factorial = 1;        // Use a separate variable to store the factorial
        
        // Loop to calculate the factorial
        for (i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        
        // Output the result
        System.out.println("Factorial is " + factorial);
    }
}
