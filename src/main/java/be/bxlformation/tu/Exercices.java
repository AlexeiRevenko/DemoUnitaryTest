package be.bxlformation.tu;

public class Exercices {
    public void triangle_type(double a, double b, double c){
        if(a == b && b == c)
            System.out.println("équilatéral");
        else if (a/b == 0 || a/c == 0 || b / c == 0)
            System.out.println("isocèle");
        else
            System.out.println("scalène");
    }
}
