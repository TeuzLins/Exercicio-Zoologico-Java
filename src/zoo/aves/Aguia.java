package zoo;

import zoo.interfaces.Alimentavel;

public class Aguia extends Ave implements Alimentavel {

    public Aguia(String nome, int idade, double envergaduraAsas) {
        super(nome, idade, "Aquila chrysaetos", envergaduraAsas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " solta um grasnido agudo!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " plana em grandes altitudes.");
    }

    @Override
    public void comer(String tipo, double quantidadeEmKg) {
        System.out.printf("%s rasga e come %.2f kg de %s.%n", getNome(), quantidadeEmKg, tipo);
    }

    @Override
    public void beber(double litros) {
        System.out.printf("%s bebe %.2f litros de água pura.%n", getNome(), litros);
    }
}
