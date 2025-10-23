package zoo;

/**
 * Subclasse que herda de Animal.
 */
public class Reptil extends Animal {
    private boolean venenoso;

    public Reptil(String nome, int idade, String especie, boolean venenoso) {
        super(nome, idade, especie);
        setVenenoso(venenoso);
    }

    public boolean isVenenoso() { return venenoso; }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " sibila como um réptil.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " rasteja silenciosamente.");
    }
}
