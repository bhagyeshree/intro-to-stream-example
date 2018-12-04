/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.jupiter.api.Test;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import java.util.Collections;
import java.util.List;

public class LibraryTest {

    @Test
    void reverseStringsReturnEmptyListWhenGivennull(){
        //setup
        //exercise
        List<String> actual = Library.reverseString(null);
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }
    @Test
    void reverseStringsReturnEmptyListWhenGivenEmptyList()
    {
        //setup
        List<String> actual = Library.reverseString(Collections.emptyList());
        //Exericise
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }


    @Test
    void reverseStringsReturnsOneReverseValue()
    {
        //setup
        //exercise
        final List<String> actual = Library.reverseString(Collections.singletonList("foo"));
        MatcherAssert.assertThat(actual,contains("oof"));

    }
}