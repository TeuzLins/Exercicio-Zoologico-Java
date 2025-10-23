package zoo;

/**
 * Subclasse que herda de Animal.
 */
public class Mamifero extends Animal {
    private String tipoPelagem;

    public Mamifero(String nome, int idade, String especie, String tipoPelagem) {
        super(nome, idade, especie);
        setTipoPelagem(tipoPelagem);
    }

    public String getTipoPelagem() { return tipoPelagem; }
    public void setTipoPelagem(String tipoPelagem) {
        if (tipoPelagem == null || tipoPelagem.isBlank()) {
            throw new IllegalArgumentException("Tipo de pelagem inválido.");
        }
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite um som típico de mamífero.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " caminha como um mamífero.");
    }
}
