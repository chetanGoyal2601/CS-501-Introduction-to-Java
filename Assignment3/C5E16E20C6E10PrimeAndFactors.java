//Kindly use the input file 'InputForAssignment3' for inputs
import java.util.Scanner;
public class C5E16E20C6E10PrimeAndFactors {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= ((int) Math.sqrt(number) + 1); i++) {
            if (number == 2) {
                return true;
            }
            
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }     

    public static void main(String[] args) {
        System.out.println("This program displays the first 50 prime numbers, eight max in one line. It then stores prime numbers less than 100 in an array. \nThe program then asks takes input from the user to check if it is a prime number by searching the array.\nIf it is a prime number it displays the same else it prints all the factors of that number.\nThe program then asks if the user wants to continue with another input.\n");
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[168];
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                arr[count] = i;
                count++;

                if (count <= 50) {

                    System.out.print(arr[count-1] + " ");
                    
                    if (count % 8 == 0 || count == 50) {
                        System.out.println();
                    }
                }
            }
        }
        
        int repeatLoop = 1;

        while (repeatLoop == 1) {
            System.out.print("\nEnter an integer number which is greater than 1 and less than 1000: ");
            int num = inp.nextInt();
            boolean prime_flag = false;

            int low = 0;
            int high = arr.length - 1;
            int mid = (low + high) / 2;
       
            while (high >= low) {
                if (arr[mid] == num) {
                    System.out.println(num + " is a prime number.");
                    prime_flag = true;
                    break;
                }
                else if (arr[mid] > num) {
                    high = mid - 1;
                    mid = (low + high) / 2;
                }
                else {
                    low = mid + 1;
                    mid = (low + high) / 2;
                }
            }
            

            if (prime_flag == false) {
                int k = 0;
                System.out.print("The factors of " + num + " are: ");
                while (num != 1) {
                    if (num % arr[k] == 0) {
                        System.out.print(arr[k]);
                        num /= arr[k];
                        if (num != 1) {
                            System.out.print(", ");
                        }
                    }
                    else {
                        k += 1;
                    }
                }
                
            System.out.println();
            }

            System.out.print("\nIf you wish to repeat this program, press 1 but if you wish to exit the program press 0: ");
            repeatLoop = inp.nextInt();
        }
    }
}