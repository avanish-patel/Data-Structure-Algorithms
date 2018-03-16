package mix;

public class DecimalToBinary {

    // method to convert decimal to binary

    static void decimalToBinary(int n) {

        // array to store numbers
        int[] binary = new int[n*2];

        // count variable
        int i =0;

        while (n > 0) {

            binary[i] = n % 2;

            n = n/2;
            i++;

        }

        // print the binary array in reverse order

        for (int j= i -1; j>= 0; j--) {

            System.out.print(binary[j]);
        }
    }

    // main method
    public static void main(String[] args) {


        decimalToBinary(7);

    }
}
