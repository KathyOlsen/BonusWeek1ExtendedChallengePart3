import java.util.Random;
import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args){
        while(true) {
            int num = 0;
            String random = "";

            Scanner key = new Scanner(System.in);

            System.out.println("Would you like to generate a random number? (Y/N)");
            random = key.next();
            if (random.equalsIgnoreCase("Y")) {
                Random r = new Random();
                num = 1 + r.nextInt(250);
                System.out.println("Your random number is " + num);
            } else if (random.equalsIgnoreCase("N")) {
                System.out.println("Please enter a number greater than zero: ");
                num = key.nextInt();
            } else {
                System.out.println("");
            }

            if (num == 1) {
                System.out.println("1 is not prime");
            } else if (num == 2) {
                System.out.println("1 is not prime");
                System.out.println("2 is prime");
            } else if (num > 2) {
                System.out.println("1 is not prime");
                System.out.println("2 is prime");
                for (int counter2 = 3; num >= counter2; counter2++) {
                    for (int counter1 = 2; counter2 > counter1; counter1++) {
                        if (counter2 % counter1 == 0) {
                            System.out.println(counter2 + " is not prime");
                            break;
                        } else if (counter2 == counter1 + 1) {
                            System.out.println(counter2 + " is prime");
                            break;
                        } else {
                        }
                    }
                }
            } else {
                System.out.println("Invalid response.");
            }

            System.out.println("Do you want to play again? (Y/N)");
            String answer2 = key.next();
            if (answer2.equalsIgnoreCase("N")){
                break;
            }else{}
        }
    }
}
