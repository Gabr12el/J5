package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"Min limit values ,99,100,1",
            "Max limit values ,9800,9802,1",
            "Averages values,1000,5000,39",
            "No min values,0,99,0",
            "No max values,9802,1000,0",
            "maximum number of values,100,9801,90"})
    void ownCalculate(String testName, int lowlimit, int uplimit, int counter) { //А это чтобы я понял и запомнил!!!
        SQRService calculate = new SQRService(); // подготавливаем данные
        int currentCounter = calculate.calculatePipez(lowlimit, uplimit); // вызываем целевой метод
        assertEquals(currentCounter, counter);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS, если false — то FAIL
    }
}