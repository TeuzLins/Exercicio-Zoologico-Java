package zoo.interfaces;

/**
 * Interface com dois métodos abstratos obrigatórios.
 * Implementada por animais que podem comer e beber de forma controlada.
 */
public interface Alimentavel {
    void comer(String tipo, double quantidadeEmKg);
    void beber(double litros);
}
