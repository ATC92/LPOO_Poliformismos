class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }
    
    double sumar(double a, double b) {
        return a + b;
    }
    
    int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma: " + calc.sumar(1, 3));
        System.out.println("Suma: " + calc.sumar(2.0, 9.0));
        System.out.println("Suma: " + calc.sumar(4,5,3));
    }
}





