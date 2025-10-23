package zoo;

/**
 * Classe simples para representar um alimento.
 */
public class Alimento {
    private String tipo;
    private double quantidadeEmKg;

    public Alimento(String tipo, double quantidadeEmKg) {
        setTipo(tipo);
        setQuantidadeEmKg(quantidadeEmKg);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo de alimento inválido.");
        }
        this.tipo = tipo;
    }

    public double getQuantidadeEmKg() {
        return quantidadeEmKg;
    }

    public void setQuantidadeEmKg(double quantidadeEmKg) {
        if (quantidadeEmKg <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva.");
        }
        this.quantidadeEmKg = quantidadeEmKg;
    }

    @Override
    public String toString() {
        return String.format("Alimento{tipo='%s', quantidade=%.2f kg}", tipo, quantidadeEmKg);
    }
}
