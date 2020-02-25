import java.util.Random;
public class RandomNumbers {
    int maxNuber;
    int minNumber;

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int number = 0;
        int maxNumber = 0;
        int minNumber = 0;
        while (sum <= 5000) {
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            number = random.nextInt(31);
            sum = sum + number;

            System.out.println("Random numbers from 0 to 30 which sum up to 5000 :  " + number);

        }
        System.out.println("Max random number is  " + maxNumber);
        System.out.println("Min random number is  " + minNumber);
    }
}







