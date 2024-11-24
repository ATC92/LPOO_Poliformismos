class Animal {
    void sonido() {
        System.out.println("Sonido generico de animal");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Perro perro = new Perro();

        perro.sonido();
    }
}




