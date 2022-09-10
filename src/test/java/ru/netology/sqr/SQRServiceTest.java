package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
// import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //        "1200,300,3"
    //        "99,300,8",
    //        "100,300,8",
    //        "101,300,7",
    //        "9400,9800,2",
    //        "9400,9801,3",
    //        "9400,9802,3",
    //        "300,300,0",
    //})
    @CsvFileSource(files = "src/test/resources/borders.csv")
    public void testAllInBorders(int lowerBorder, int upperBorder, int expected) {
        SQRService service = new SQRService();
        // вызываем целевой метод:
        int actual = service.sqrcalculate(lowerBorder, upperBorder);

        // производим проверку (сравниваем ожидаемый и фактический результат):
        Assertions.assertEquals(expected, actual);
    }
}





