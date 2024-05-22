package ru.netology.javaqa.Vacancion.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacantionServiseTest {
@ParameterizedTest
//@CsvSource({
     //   "10000, 3000, 20000, 3",
       // "100000, 60000, 150000, 2"
//})
@CsvFileSource(files="src/test/resources/vacancion.csv")
    public void calcVacancionServise(int income, int expenses, int threshold, int expected){
        VacancionServise servise = new VacancionServise();
       // int expected = 3;
      //  int income = 30000;
      //  int expenses = 10000;
      //  int threshold = 20000;
        int actual = servise.calcVacancionMonth(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
