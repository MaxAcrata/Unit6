// Создаем пакет где : 1) <groupId> ru.netology.javaqa` 2) <artifactId>Freelancer 3) название "Может быть любое"
package ru.netologi.javaqa.Freelancer.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelancerRestCalculatorTest {

    // Вводим параметризированый тест
    @ParameterizedTest
    @CsvSource({"10000,3000,20000,3",
                "50,5000,20000,0",
                "100000,60000,150000,2"})

    public void calculate(int income, int expenses, int threshold, int expected) {

        FreelancerRestCalculator service = new FreelancerRestCalculator();

        // вызываем целевой метод:
        int actual = service.calculateRestMonths(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}

