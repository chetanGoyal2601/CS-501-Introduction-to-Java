//Kindly use the input file 'InputForAssignment3' for inputs
import java.util.Scanner;
import java.util.Arrays;

public class C7E9E10E20SmallestElementAndSorting {
    public static double minNumber(double[] array) {
        double small = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }

        return small;
    }

    public static int indexOfSmallestElement(double[] array) {
        int smallIndex = 0;
        double small = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < small) {
                small = array[i];
                smallIndex = i;
            }
        }

        return smallIndex;
    }

    public static void selectionSort(double[] array) {
        for (int i = 9; i > 0; i--) {
            double big = array[i];
            int bigIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > big) {
                    big = array[j];
                    bigIndex = j;
                }
            }

            array[bigIndex] = array[i];
            array[i] = big;
            
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] == (int) array[i]) {
                System.out.print((int) array[i] + " ");
            }
            else {System.out.print(array[i] + " ");}
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("This program takes in 10 numbers, and then finds and prints the following:- \n1. The minimum number amongst them\n2. Minimum number's original index\n3. The numbers entered in sorted fashion - It uses selection sort which finds the largest number in the array and swaps it with the last.\n");
        int repeatLoop = 1;

        while (repeatLoop == 1) {
            System.out.print("Enter any ten numbers, each seperated by a single space: ");
            double[] arr = new double[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = inp.nextDouble();
            }

            double minimumNo = minNumber(arr);
            if (minimumNo == (int) minimumNo) {
                System.out.println((int) minimumNo);
            }
            else {System.out.println(minimumNo);}

            System.out.println(indexOfSmallestElement(arr));
            selectionSort(arr);

            System.out.print("\nIf you wish to repeat this program, press 1 but if you wish to exit the program press 0: ");
            repeatLoop = inp.nextInt();

        }
    }
}