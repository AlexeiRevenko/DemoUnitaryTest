package be.bxlformation.tu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Triangle_test {

    @Test
    void Test_triangle1(){
        double a = 5d, b = 4d,c = 8d;
        double resultat = 0;
        Exercices exo =new Exercices();

        resultat = Math.abs(a + b) ;
        assertAll("EveryThin is ok",
                () -> assertTrue(Math.abs(a + b) > c),
                () -> assertTrue(Math.abs(a + c) > b),
                () -> assertTrue(Math.abs(c + b) > a));
    }

    @Test
    void Test_triangle2(){
        double a = 5d, b = 4d,c = 1d;

        assertAll("EveryThin is ok",
                () -> assertTrue(a > 0),
                () -> assertTrue(b > 0),
                () -> assertTrue(c > 0));
    }

    @Test
    void Test_triangle3(){
        double a = 5d, b = 4d,c = 1d;

        assertTrue(a*b*c > 0);
    }

    @Test
    void Test_input(){
        double a = 5d, b = 4d,c = 1d;
        Exercices exo =new Exercices();
        Exception exce = null;
        try{
            exo.triangle_type(5f, b, c);
        }catch (Exception e){
            exce = e;
        }
        assertNull(exce);
    }


}
