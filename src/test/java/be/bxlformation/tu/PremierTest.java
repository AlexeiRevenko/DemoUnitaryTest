package be.bxlformation.tu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Les premiers tests")
// @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) // ne peut etre utilisée que au dessus des classes
// @DisplayNameGeneration(DisplayNameGenerator.Standard.class)
public class PremierTest {
    //Junit fonctionne avec des annotations --> a fixer sur des methodes ou à des endroits sur certains param

    //Junit est un package de testing parmi bcp d'autres

    /*
    * Vérification d'une addition de 2 nombres entiers
    * - Les 2 nombres doivent être entiers
    * - Aucun des 2 nombres ne sont null
    * - Que le résultat de  2 nombres corresponde au résultat souhaité
    * */

    /*

    * Un test on l'écrit toujours en 3 étapes
    * ETAPE D'IMPLEMENTATION D'UN TEST
    * Arrange --> initialiser tous les entrants nécessaire (tous les inputs/tous les entrants )
    * Act --> execution du test avec les entrants et sauvegarde(les resultats que le programme a produit a partir des entrants)
    * Asert --> valider les sortants en fonction de ce qui est attendu à partir des entrants
    * --> triples A --> résumé
    * */

    //pas de mot clé accessibilité -> default level package *je crois*

     //la classe peut etre autoexecutable par JUnit des que l'annotation @Test est mise au dessus d'une méthode de test
    //on peut voir que l'on peut executer sans méthodes main
    @Test
    @DisplayName("Premier test sur la validité de l'addition")
    void premierTest(){
        //on a d'abord créer la classe PRemierTest dans le package test java --> puis on es passé dans main > java > ... pour definir la classe dans laquelle il y a la méthode a tester
        // ARRANGE
        int a = 3, b = 4;
        Calculation premierTest = new Calculation();

        // ACT
        int resultat = premierTest.addition(a,b);

        //c'est ici que toutes les méthodes statiques de JUnit vons entrer en jeu
        // methode statiques dans la classe assertion !!

        //ASSERT
        assertEquals(resultat, 7);
    }

    @Test
    void premierTestFailCarPasDesEntiers(){
        //on a d'abord créer la classe PRemierTest dans le package test java --> puis on es passé dans main > java > ... pour definir la classe dans laquelle il y a la méthode a tester
        // ARRANGE
        String inputUser_a = "53", inputUser_b = "4";
        int resultat;


        NumberFormatException e = null;
        // ACT
        //verifier si une exception est générée ou pas
        try{
            resultat = Integer.parseInt(inputUser_a);
            resultat = Integer.parseInt(inputUser_b);
        }catch(NumberFormatException exc) {
            e = exc;
        }

        //c'est ici que toutes les méthodes statiques de JUnit vons entrer en jeu
        // methode statiques dans la classe assertion !!

        //ASSERT
        //est ce qu'une exception a été retournée ou pas ! dans notre act --> il a su convertir l'entier
        assertNull(e);
    }



}
