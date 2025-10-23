# 🦁 Sistema de Gerenciamento de Animais do Zoológico  
> Projeto de Programação Orientada a Objetos em **Java**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

---

## 🎯 Objetivo

Este projeto foi desenvolvido para demonstrar os principais **pilares da Programação Orientada a Objetos (POO)** em Java:  
**Encapsulamento, Herança, Polimorfismo, Interface e Sobrecarga.**

O tema escolhido foi um **Sistema de Gerenciamento de Animais de um Zoológico**, no qual diferentes espécies herdam e implementam comportamentos específicos.

---

## 🧠 Conceitos Aplicados

| Conceito | Descrição |
|-----------|------------|
| 🧱 **Encapsulamento** | Todos os atributos são privados e acessados por *getters/setters*. |
| 🧬 **Herança** | `Mamifero`, `Ave` e `Reptil` herdam da classe abstrata `Animal`. |
| 🎭 **Polimorfismo** | Cada animal sobrescreve os métodos `emitirSom()` e `mover()`. |
| 🔌 **Interface** | A interface `Alimentavel` define os métodos `comer()` e `beber()`. |
| ➕ **Sobrecarga** | A classe `Leao` possui o método `alimentar()` com 3 versões diferentes. |

---

## 📂 Estrutura do Projeto

```bash
zoologico-java/
├─ README.md
├─ src/
│  └─ zoo/
│     ├─ interfaces/
│     │  └─ Alimentavel.java
│     ├─ Alimento.java
│     ├─ Animal.java
│     ├─ Mamifero.java
│     ├─ Ave.java
│     ├─ Reptil.java
│     ├─ Leao.java
│     ├─ Aguia.java
│     ├─ Cobra.java
│     └─ Zoologico.java
└─ out/

---

## ⚙️ Como Executar

### 🪟 No Windows
```bash
cd zoologico-java
mkdir out
javac -d out src\zoo\interfaces\*.java src\zoo\*.java
cd out
java zoo.Zoologico


🧪 Saída Esperada
=== Demonstração de Polimorfismo ===
Simba (espécie=Panthera leo, idade=5)
Simba ruge alto!
Simba corre pela savana.
Simba come 0.50 kg de alimento padrão.
Simba bebe 0.30 litros de água.
...
=== Sobrecarga de métodos (Leao#alimentar) ===
Simba come 3.00 kg de carne.
Simba come 2.50 kg de gazela.
Simba come 1.20 kg de bife.

Execução concluída com sucesso.


🧰 Tecnologias Utilizadas

☕ Java SE 11+

💻 VS Code com Extension Pack for Java

🧩 Paradigma Orientado a Objetos




## 👨‍💻 Autor

**Mateus de Lima Lins Prestes**  
📍 Brasília - DF  
📧 [mateus.prestes.contato@gmail.com](mailto:mateus.prestes.contato@gmail.com)
🔗 [![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mateus-de-lima-lins-304a812b7)
🐙 [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/TeuzLins)
