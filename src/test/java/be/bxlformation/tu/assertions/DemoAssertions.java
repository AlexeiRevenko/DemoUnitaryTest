package be.bxlformation.tu.assertions;

import be.bxlformation.tu.Calculation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class DemoAssertions {
    private final Calculation calculation = new Calculation();

    @Test
    void standardAssertions(){
        assertEquals(2,calculation.addition(1,1));
        assertEquals(2,calculation.addition(1,1), "1 + 2 ne fait pas  2 !!!");
        assertTrue(1 < 2, "La condition retourne FAUX");

    }

    @Test
    void exceptionTesting(){
        Calculation calculation1 = null;
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> calculation1.addition(1,1)
        );
    }

    @Test
    void exceptionDivsion0Testing(){
        Calculation calculation1 =new Calculation();
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculation1.addition(5,0)
        );
        assertEquals("/ by zero", exception.getMessage());
    }

    /*
    @Test
    void exceptionDivisionByNullTesting(){
        int a = 1, b = 0;
        Calculation calc = new Calculation();

        int resultat;


        ArithmeticException e = null;
        // ACT
        //verifier si une exception est générée ou pas
        try{
            resultat = calc.division(a,b);

        }catch(ArithmeticException exc) {
            e = exc;
        }
        assertThrows(
                ArithmeticException.class,
                () -> calculation.division(1,1)
        );
    }

    //division entiere
    //division 0*/

    @Test
    void timeOutNotExceeded(){
        //retourne nawak si depasse  150 milli secondes

        //the assert time out ,will check if the second parameter execution time exceeds the time set in the first parameter
       String result = assertTimeout(Duration.ofMillis(150), () -> "nawak" );
       assertEquals("nawak", result);
        System.out.println(Duration.class);
        System.out.println(result);
    }

    private static String naw() throws InterruptedException{
        Thread.sleep(300);
        return "nawak";
    }

    /*
    void testPerson(){
        assertAll("person", () -> assertEquals("Ceulers", p.getLast_name()))
    }*/




    @Target({ElementType.METHOD,ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @interface TestOnWindows{}

    @TestOnWindows
    void OSTest(){

    }



}
