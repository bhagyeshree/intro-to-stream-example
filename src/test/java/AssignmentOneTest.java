import org.junit.jupiter.api.Test;

import java.util.List;

import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.is;
final class AssignmentOneTest {



    @Test
    void reverseStringsReturnEmptyListWhenGivennull(){
        //setup
        //exercise
        List<String> actual = AssignmentOne.evenOrOdd(null);
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }
}
