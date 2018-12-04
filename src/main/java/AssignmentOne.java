import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class AssignmentOne {
    public static List<String> evenOrOdd(List<Integer> number) {

        if(number == null || number.isEmpty())
        {
            return Collections.emptyList();
        }

        return Arrays.asList("odd");
    }
}
