package exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertTemperatureTest {
    ConvertTemperature convertTemperature;

    @BeforeEach
    void setup(){

        convertTemperature=new ConvertTemperature();
    }

    @Test
    @DisplayName("WHEN fahrenheitToCelsius(1) THEN return -17.22222222222222")

    void testFahrenheitToCelsius(){
        //GIVEN
        //WHEN
        double grade=convertTemperature.fahrenheitToCelsius(1);
        //THEN
        assertThat(grade).isEqualTo(-17.22222222222222);
    }

    @Test
    @DisplayName("WHEN celsiusToFahrenheit(1) THEN return 33.8")

    void testFcelsiusToFahrenheit(){
        //GIVEN
        //WHEN
        double grade=convertTemperature.celsiusToFahrenheit(1);
        //THEN
        assertThat(grade).isEqualTo(33.8);
    }
}
