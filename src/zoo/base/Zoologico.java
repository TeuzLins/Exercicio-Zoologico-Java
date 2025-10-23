package zoo;

import java.util.ArrayList;
import java.util.List;
import zoo.interfaces.Alimentavel;

/**
 * Classe principal com método main para demonstração.
 */
public class Zoologico {
    public static void main(String[] args) {
        // Coleção polimórfica
        List<Animal> animais = new ArrayList<>();

        Leao simba = new Leao("Simba", 5);
        Aguia sky = new Aguia("Sky", 3, 2.1);
        Cobra naga = new Cobra("Naga", 2, true);

        animais.add(simba);
        animais.add(sky);
        animais.add(naga);

        System.out.println("=== Demonstração de Polimorfismo ===");
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom(); // método sobrescrito em cada subclasse
            a.mover();     // método sobrescrito em cada subclasse

            if (a instanceof Alimentavel) {
                Alimentavel al = (Alimentavel) a;
                al.comer("alimento padrão", 0.5);
                al.beber(0.3);
            }
            System.out.println();
        }

        System.out.println("=== Sobrecarga de métodos (Leao#alimentar) ===");
        simba.alimentar(3.0); // apenas quantidade (assume "carne")
        simba.alimentar("gazela", 2.5); // tipo + quantidade
        simba.alimentar(new Alimento("bife", 1.2)); // objeto Alimento

        System.out.println("\nExecução concluída com sucesso.");
    }
}
