class Animal2 {
    void sonido() {
        System.out.println("Sonido generico de animal");
    }
}

class Gato extends Animal2 {
    @Override
    void sonido() {
        System.out.println("El gato maulla");
    }
}

class Perro2 extends Animal2 {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }
}

public class Main3PLPL {
    public static void main(String[] args) {
        Animal2 miAnimal;
        
        miAnimal = new Perro2();
        miAnimal.sonido();  // Salida: El perro ladra
        
        miAnimal = new Gato();
        miAnimal.sonido();  // Salida: El gato maulla
    }
}





