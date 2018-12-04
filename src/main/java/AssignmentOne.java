import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class AssignmentOne {
    public static List<String> evenOrOdd(List<Integer> numbers) {

        if(numbers == null || numbers.isEmpty() )
        {
            return Collections.emptyList();
        }

        return numbers.stream()
                .map(number -> number % 2 == 0 ? "even" : "odd")
                .collect(Collectors.toList());



    }








}
