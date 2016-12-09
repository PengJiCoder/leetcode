import java.util.Scanner;
import java.util.Arrays;

public class LC0006_ZigZag_Conversion {

    public static void main(String[] args) {
        //String input = "PAYPALISHIRING"
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the string: ");
            String input = sc.nextLine();

            System.out.print("Enter the row number: ");
            int rowNumber = Integer.parseInt(sc.nextLine());

            System.out.println(convert(input, rowNumber));
        }
    }

    private static String convert(String input, int rowNumber) {
        StringBuilder[] matrix = new StringBuilder[rowNumber];
        for (int i=0; i<rowNumber; i++) {
            matrix[i] = new StringBuilder("");;
        }

        for(int i=0, pivot=0, inc=1; i < input.length(); i++) {
            matrix[pivot].append(input.charAt(i));
            if (pivot==0) {
                inc =  1;
            }
            else if (pivot == rowNumber -1) {
                inc = -1;
            }
            pivot += inc;
        }

        StringBuilder result= new StringBuilder("");
        for (int i=0; i< rowNumber; i++) {
            result.append(matrix[i]);
        }

        return result.toString();
        
    }
}

