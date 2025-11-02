# Sistema de Gerenciamento de Animais do Zoológico (Java OOP)

Este projeto demonstra **encapsulamento**, **herança**, **polimorfismo**, **interfaces** e **sobrecarga** em Java,
seguindo os requisitos do exercício.

## Como compilar e executar (sem IDE)

Requisitos: JDK 11+ instalado e `javac` no PATH.

```bash
# 1) Vá até a pasta do projeto (se ainda não estiver nela)

# 2) Compile todos os .java gerando os .class em ./out/zoo
mkdir -p out/zoo
javac -d out/zoo src/zoo/aves/*.java src/zoo/mamiferos/*.java src/zoo/repteis/*.java src/zoo/base/*.java src/zoo/base/interfaces/*.java

# 3) Execute o programa principal
java -cp out/zoo zoo.Zoologico
```

##  Estrutura
```
root/
├─ README.md
├─ out/
│  └─ zoo/
│     ├─ aves/
│     ├─ base/
│     │  └─ interfaces/
│     ├─ mamiferos/
│     └─ repteis/
└─ src/
   └─ zoo/
      ├─ aves/
      │  ├─ Aguia.java
      │  └─ Ave.java
      ├─ base/
      │  ├─ Alimento.java
      │  ├─ Animal.java
      │  ├─ Zoologico.java
      │  └─ interfaces/
      │     └─ Alimentavel.java
      ├─ mamiferos/
      │  ├─ Leao.java
      │  └─ Mamifero.java
      └─ repteis/
         ├─ Cobra.java
         └─ Reptil.java
```

##  O que foi aplicado
- **Encapsulamento**: todos os atributos são **privados**; acesso via **getters/setters** (com validações simples).
- **Herança**: `Mamifero`, `Ave`, `Reptil` herdam de `Animal`.
- **Polimorfismo**: `emitirSom()` e `mover()` são sobrescritos nas subclasses.
- **Interface**: `Alimentavel` (métodos `comer` e `beber`) implementada por `Leao`, `Aguia`, `Cobra`.
- **Sobrecarga**: método `alimentar(...)` **sobrecarregado** (quantidade, tipo+quantidade, e objeto `Alimento`).

##  O que o `main` demonstra
- Criação de uma coleção `ArrayList<Animal>` com diferentes animais.
- Laço polimórfico chamando `emitirSom()` e `mover()`.
- Uso de `instanceof` para acionar comportamentos de `Alimentavel`.
- Exemplos de **sobrecarga** com `Leao#alimentar(...)`.
