package zoo;

/**
 * Classe abstrata base para todos os animais.
 * Demonstra encapsulamento com atributos privados e validação em setters.
 */
public abstract class Animal {
    private String nome;
    private int idade;       // em anos
    private String especie;

    protected Animal(String nome, int idade, String especie) {
        setNome(nome);
        setIdade(idade);
        setEspecie(especie);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("Espécie inválida.");
        }
        this.especie = especie;
    }

    // Métodos polimórficos
    public abstract void emitirSom();
    public abstract void mover();

    @Override
    public String toString() {
        return String.format("%s (espécie=%s, idade=%d)", nome, especie, idade);
    }
}
