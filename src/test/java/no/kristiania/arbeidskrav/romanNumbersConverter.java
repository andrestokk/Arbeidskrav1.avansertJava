package no.kristiania.arbeidskrav;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class romanNumbersConverter {
    @Test
    void shouldReturnIfor1(){
        assertEquals("I", toRoman(1));
    }@Test
    void shouldReturnIIfor2(){
        assertEquals("II", toRoman(2));
    }@Test
    void shouldReturnIIIfor3(){
        assertEquals("III", toRoman(3));
    }@Test
    void shouldReturnIVfor4(){
        assertEquals("IV", toRoman(4));
    }@Test
    void shouldReturnVfor5(){
        assertEquals("V", toRoman(5));
    }@Test
    void shouldCalculateNumbersOver10(){
        assertEquals("X", toRoman(10));
        assertEquals("XVIII", toRoman(18));
    }

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", toRoman(37));
    }


    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = toRomanDigit(number, result, 10,"X");
        number = toRomanDigit(number, result, 1,"I");
        number = toRomanDigit(number, result, 4,"IV");
        number = toRomanDigit(number, result, 5,"V");
        number = toRomanDigit(number, result, 9,"IX");


        for(int i = 0; i < number; i++){
            result.append("I");
        }
        return result.toString();
    }

    private int toRomanDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        while (number >= digitValue){
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }

}



