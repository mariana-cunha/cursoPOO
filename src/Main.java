import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Cachorro cachorro1 = new Cachorro("Pup", "Branco", 25, 5.5, 5, "nada");
        Gato gato1 = new Gato("Garfield", "Laranja", 30, 6.5, "nada");
        Passaro passaro1 = new Passaro("Frajola", "branco", 15, 5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}