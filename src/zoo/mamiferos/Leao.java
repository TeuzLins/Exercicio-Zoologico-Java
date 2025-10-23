package zoo;

import zoo.interfaces.Alimentavel;

/**
 * Leão: herda de Mamifero e implementa a interface Alimentavel.
 * Demonstra também SOBRECARGA no método alimentar(...).
 */
public class Leao extends Mamifero implements Alimentavel {

    public Leao(String nome, int idade) {
        super(nome, idade, "Panthera leo", "Curta");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ruge alto!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " corre pela savana.");
    }

    // Interface
    @Override
    public void comer(String tipo, double quantidadeEmKg) {
        System.out.printf("%s come %.2f kg de %s.%n", getNome(), quantidadeEmKg, tipo);
    }

    @Override
    public void beber(double litros) {
        System.out.printf("%s bebe %.2f litros de água.%n", getNome(), litros);
    }

    // SOBRECARGA (Overloading)
    public void alimentar(double quantidadeEmKg) {
        comer("carne", quantidadeEmKg);
    }

    public void alimentar(String tipo, double quantidadeEmKg) {
        comer(tipo, quantidadeEmKg);
    }

    public void alimentar(Alimento alimento) {
        comer(alimento.getTipo(), alimento.getQuantidadeEmKg());
    }
}
