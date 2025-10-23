package zoo;

import zoo.interfaces.Alimentavel;

public class Cobra extends Reptil implements Alimentavel {

    public Cobra(String nome, int idade, boolean venenosa) {
        super(nome, idade, "Serpentes", venenosa);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: sssssss!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " desliza rapidamente pelo chão.");
    }

    @Override
    public void comer(String tipo, double quantidadeEmKg) {
        System.out.printf("%s engole %.2f kg de %s inteira.%n", getNome(), quantidadeEmKg, tipo);
    }

    @Override
    public void beber(double litros) {
        System.out.printf("%s absorve aproximadamente %.2f litros de água.%n", getNome(), litros);
    }
}
