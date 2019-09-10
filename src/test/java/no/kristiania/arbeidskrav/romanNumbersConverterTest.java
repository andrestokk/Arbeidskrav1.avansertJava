package no.kristiania.arbeidskrav;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class romanNumbersConverterTest {
    @Test
    void shouldReturnIfor1(){
        assertEquals("I", romanConverter.toRoman(1));
    }
    @Test
    void shouldReturnIVfor4(){
        assertEquals("IV", romanConverter.toRoman(4));
    }
    @Test
    void shouldReturnVfor5(){
        assertEquals("V", romanConverter.toRoman(5));
    }

    @Test
    void shouldReturnIXfor9(){
        assertEquals("IX", romanConverter.toRoman(9));
    }
    @Test
    void shouldReturnXVIIIfor18(){
        assertEquals("XVIII", romanConverter.toRoman(18));
    }
    @Test
    void shouldCalculateNumbersOver10(){
        assertEquals("X", romanConverter.toRoman(10));

    }@Test
    void shouldCalculateSimpleDigit(){
        assertEquals("MMMDCCCLXXXVIII", romanConverter.toRoman(3888));

    }
    @Test
    void shouldCalculatefourDigits(){
        assertEquals("CDXLIV", romanConverter.toRoman(444));

    }
    @Test
    void shouldCalculateNineDigits(){
        assertEquals("CMXCIX", romanConverter.toRoman(444));

    }

 }



