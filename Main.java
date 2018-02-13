import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);
        int dex;
        int index;
        String hex = "0123456789ABCDEF";  // idea from https://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html
        long decimalNumber;
        decimalNumber = 0;
        index = 0;
        String hexIdentifier = "0X";

        //Input hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String input = scnr.nextLine();
        input = input.toUpperCase();
        String check = input.substring(0, 2);

        if (check.equals(hexIdentifier)) {
           input = input.substring(2);
        }

        dex = input.length();

        while (index < input.length()) {
            dex -= 1;
            char vars = input.charAt(index);
            int num = hex.indexOf(vars);
            decimalNumber += num * Math.pow(16, dex);
            index += 1;
        }

        System.out.println("Your number is " + decimalNumber + " in decimal");

    }
}
