import java.util.Scanner;

public class Main {

    public static int findMinOfArray(int[] arr, int n){
        if (n == 1) {return arr[0];}
        return Math.min(arr[n-1], findMinOfArray(arr, n-1));
    }
    public static double averageOfArray(int[] array, int m){
        if (m == 1) {return array[0];}
        return (array[m -1] + (m -1) * averageOfArray(array, m -1))/(double) m;
    }
    public static boolean isPrimeOrNot(int a, int b ){
        if(a <= 2){return a==2;}
        if(a % b == 0){return false;}
        if(b * b > a){return true;}
        return isPrimeOrNot(a, b + 1);
    }
    public static int factorial(int c){
        if(c == 0 || c == 1) { return 1; }
        return c * factorial(c-1);
    }
    public static int fibonacci(int d) {
        if (d == 0) { return 0; }
        if (d == 1) { return 1; }
        return fibonacci(d - 1) + fibonacci(d - 2);
    }
    public static int power(int w, int p) {
        if (p == 0) { return 1; }
        return w * power(w, p - 1);
    }
    public static void generatePermutations(String st, String ans) {
        if (st.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            String ros = st.substring(0, i) + st.substring(i + 1);
            generatePermutations(ros, ans + ch);
        }
    }
    public static boolean isAllDigits(String str, int index) {
        if (str.isEmpty()) { return false; }
        if (index >= str.length()) { return true; }
        if (!Character.isDigit(str.charAt(index))) { return false; }
        return isAllDigits(str, index + 1);
    }
    public static int binomialCoefficient(int f, int k) {
        if (k == 0 || k == f) {return 1;}
        if (k > f) {return 0;}
        return binomialCoefficient(f - 1, k - 1) + binomialCoefficient(f - 1, k);
    }
    public static int gcd (int e, int q){
        if (q == 0){return e;}
        return gcd (q, e % q);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input for 1
        System.out.println("1.1) enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("1.2) enter the elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // input for 2
        System.out.println("2.1) enter the size of array: ");
        int m = sc.nextInt();
        int[] array = new int[m];
        System.out.println("2.2) enter the elements: ");
        for (int i = 0; i < m; i++){
            array[i] = sc.nextInt();
        }
        // input for 3
        System.out.print("3) enter a number for checking prime number: ");
        int a = sc.nextInt();
        // input for 4
        System.out.print("4) enter a number for factorial: ");
        int c = sc.nextInt();
        // input for 5
        System.out.print("5) enter a number for fibonacci: ");
        int d = sc.nextInt();
        // input for 6
        System.out.print("6) enter a number for power(recommendations: 1st number, 2nd power");
        int w = sc.nextInt();
        int p = sc.nextInt();
        // input for 7
        System.out.print("7) enter a string for permutations: ");
        String st = sc.next();
        // input for 8
        System.out.print("8.1) input a string for 8th problem: ");
        String inputStr = sc.next();
        System.out.print("8.2) input a first index (recommendation! = input '0'): ");
        int startIndex = sc.nextInt();
        boolean result = isAllDigits(inputStr, startIndex);
        // input for 9
        System.out.print("9) imput 2 digits:");
        int f = sc.nextInt();
        int k = sc.nextInt();
        // input for 10
        System.out.print("10) input 2 numbers:");
        int e = sc.nextInt();
        int q = sc.nextInt();

// Outputs

        System.out.println("1. the minimum element is " + findMinOfArray(arr, n));
        System.out.println("2. the average of the array is " + averageOfArray(array, m));
        if (isPrimeOrNot(a, 2)) {
            System.out.println("3. " + a + " is a prime number.");
        } else {
            System.out.println("3. " + a + " is not a prime number.");
        }
        System.out.println("4. The factorial of " + c + " is " + factorial(c));
        System.out.println("5. the number of fibonacci is " + fibonacci(d));
        System.out.println("6. the number of power is " + power(w, p));
        System.out.println("7. the strings of permutation:");
        generatePermutations(st, "");
        System.out.println("8. consist the string only on the digit: " + result);
        System.out.println("9. the binomial coefficient is: "+binomialCoefficient(f,k));
        System.out.println("10. the gcd of 2 numbers is: " + gcd(e,q));
    }
}
