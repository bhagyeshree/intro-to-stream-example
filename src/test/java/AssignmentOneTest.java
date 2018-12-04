import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
final class AssignmentOneTest {



    @Test
    void evenOrOddReturnEmptyListForNullInput(){
        //setup
        //exercise
        List<String> actual = AssignmentOne.evenOrOdd(null);
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }

    @Test
    void evenOrOddReturnsOneParityOfTheNumber()
    {
        //setup
        //exercise
        final List<String> actual = AssignmentOne.evenOrOdd(Arrays.asList(1));
        MatcherAssert.assertThat(actual,contains("odd"));



    }




}
