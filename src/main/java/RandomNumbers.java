import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    private int maxNumber;
    private int minNumber;
    private List<Integer> numbers = new ArrayList<>();

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void generate() {
        Random random = new Random();
        int sum = 0;
        maxNumber = Integer.MIN_VALUE;
        minNumber = Integer.MAX_VALUE;
        int number;

        while (sum <= 5000) {
            number = random.nextInt(31);
            numbers.add(number);

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }

            sum = sum + number;
        }
    }

    public String getStatus() {
        return "min: " + minNumber + ", max: " + maxNumber + ", numbers: " + numbers;
    }

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generate();
        System.out.println(randomNumbers.getStatus());

    }
}






