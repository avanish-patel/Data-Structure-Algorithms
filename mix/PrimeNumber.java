package mix;

// A number which is divide by exact two numbers 1) By 1 2) By itself


// this algorithms runs on O(n)
public class PrimeNumber {

    // function to check whether numbers is prime or not

    private static boolean isPrime(int n) {

        if (n <= 1) {

            return false;
        }

        // check from 2 to n-1
        for (int i=2; i< n ; i++) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }
    // main method
    public static void main(String[] args) {

        System.out.println(" 4 is prime = " + isPrime(4));

        System.out.println(" 101 is prime = "+ isPrime(101));
    }

}
