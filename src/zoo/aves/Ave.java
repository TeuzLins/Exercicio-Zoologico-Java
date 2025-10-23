package zoo;

/**
 * Subclasse que herda de Animal.
 */
public class Ave extends Animal {
    private double envergaduraAsas; // em metros

    public Ave(String nome, int idade, String especie, double envergaduraAsas) {
        super(nome, idade, especie);
        setEnvergaduraAsas(envergaduraAsas);
    }

    public double getEnvergaduraAsas() { return envergaduraAsas; }
    public void setEnvergaduraAsas(double envergaduraAsas) {
        if (envergaduraAsas <= 0) {
            throw new IllegalArgumentException("Envergadura deve ser positiva.");
        }
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " pia/canta como uma ave.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " voa pelo céu.");
    }
}
