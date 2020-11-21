package exerciseRecursitate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExerciseRecursivityTest {
    ExerciseRecursivity exerciseRecursivity;

    @BeforeEach
    void setup(){
        exerciseRecursivity=new ExerciseRecursivity();
    }

    @Test
    @DisplayName("WHEN sumFirst(3) THEN returned 6 ")
    void sumFirstTest(){
        //WHEN
        int received=exerciseRecursivity.sumFirst(3);
        //THEN
        assertThat(received).isEqualTo(6);
    }

    @Test
    @DisplayName("WHEN sumEven(4) THEN returned 7 ")
    void sumEvenTest(){
        //WHEN
        int received=exerciseRecursivity.sumEven(4);
        //THEN
        assertThat(received).isEqualTo(7);
    }


    @Test
    @DisplayName("WHEN checkLastCharFirstChar(abcd) THEN returned a d ")
    void checkLastCharFirstCharTest(){
        //WHEN
        String received=exerciseRecursivity.checkLastCharFirst("abcd");
        //THEN
        assertThat(received).isEqualTo("a d");
    }

    @Test
    @DisplayName("WHEN sumDigit(22) THEN returned 4 ")
    void sumDigitTest(){
        //WHEN
        int received=exerciseRecursivity.sumDigit(22);
        //THEN
        assertThat(received).isEqualTo(4);
    }

    @Test
    @DisplayName("WHEN stringRevers(abcd) THEN returned dcba ")
    void stringReversTest(){
        //WHEN
        String received=exerciseRecursivity.stringRevers("abcd");
        //THEN
        assertThat(received).isEqualTo("dcba");
    }





}


