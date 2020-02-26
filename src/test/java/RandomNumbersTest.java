
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class RandomNumbersTest {
    @Test
    public void name() {
        //given
        RandomNumbers randomNumbers = new RandomNumbers();

        //when
        randomNumbers.generate();

        //then
        List<Integer> numbers = randomNumbers.getNumbers();
        for (int num : numbers) {
            if (num > 30) {
                fail("Number is greater than 30. Number: " + num);
            }
        }

        int max = Collections.max(numbers);
        assertTrue(max == randomNumbers.getMaxNumber());

        int min = Collections.min(numbers);
        assertTrue(min == randomNumbers.getMinNumber());

        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        assertTrue(sum >= 5000 && sum <= 5029);
    }
}