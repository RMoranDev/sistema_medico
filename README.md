# 🏥 Sistema Hospitalar — Java POO

> Projeto desenvolvido para praticar os pilares da **Programação Orientada a Objetos** em Java, simulando o cadastro e atendimento de médicos e pacientes em um hospital.

---

## 📋 Sobre o Projeto

O sistema modela um ambiente hospitalar onde médicos (incluindo especialistas) e pacientes são cadastrados, atendimentos são realizados e faturas são emitidas. Cada classe foi projetada para demonstrar na prática os conceitos fundamentais de POO.

---

## 🧠 Conceitos Aplicados

| Conceito | Onde é aplicado |
|---|---|
| **Classe e Objeto** | `Hospital`, `Medico`, `Paciente`, `Especialista` |
| **Abstração** | Classe abstrata `Pessoa` define o contrato base |
| **Herança** | `Medico` e `Paciente` herdam de `Pessoa`; `Especialista` herda de `Medico` |
| **Encapsulamento** | Atributos `private` com acesso via getters e setters |
| **Polimorfismo** | `getTipo()`, `realizarAtendimento()` se comportam diferente em cada classe |
| **Classe Abstrata** | `Pessoa` não pode ser instanciada diretamente |
| **Interface** | `Atendivel` e `Faturavel` definem contratos independentes |
| **Getter / Setter** | Presentes em todas as classes com validação de dados |

---

## 🗂️ Estrutura do Projeto

```
HOSPITAL/
└── src/
    ├── Pessoa.java          # Classe abstrata base
    ├── Medico.java          # Herda Pessoa, implementa Atendivel
    ├── Especialista.java    # Herda Medico, implementa Faturavel
    ├── Paciente.java        # Herda Pessoa, implementa Faturavel
    ├── Hospital.java        # Classe principal do sistema
    ├── Atendivel.java       # Interface de atendimento
    ├── Faturavel.java       # Interface de faturamento
    └── Main.java            # Ponto de entrada da aplicação
```

---

## 🔗 Diagrama de Classes

```
              «interface»          «interface»
              Atendivel            Faturavel
             ╔═════════╗         ╔══════════╗
             ║         ║         ║          ║
         ┌───╨──┐   ┌──╨─────────╨──┐
         │      │   │               │
      ╔══╧══════╧═══╧══╗        ╔═══╧══════╗
      ║   «abstract»   ║        ║          ║
      ║     Pessoa     ║        ║ Paciente ║
      ╚═══════╤════════╝        ╚══════════╝
              │
         ╔════╧══════╗
         ║   Medico  ║
         ╚════╤══════╝
              │
       ╔══════╧════════╗
       ║  Especialista ║
       ╚═══════════════╝
```

---

## ▶️ Como Executar

**Pré-requisito:** Java 16 ou superior instalado.

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/sistema-hospitalar.git

# 2. Entre na pasta do projeto
cd sistema-hospitalar

# 3. Compile todos os arquivos
javac src/*.java

# 4. Execute o programa
java src.Main
```

---

## 💡 Destaques do Código

**Polimorfismo via classe pai**
```java
Pessoa[] pessoas = { clinicoGeral, cardiologista, p1, p2 };
for (Pessoa pessoa : pessoas) {
    System.out.println(pessoa.getTipo()); // cada um retorna o seu tipo
}
```

**Polimorfismo via interface**
```java
Atendivel[] atendiveis = { clinicoGeral, cardiologista };
for (Atendivel a : atendiveis) {
    a.realizarAtendimento(); // comportamento específico de cada médico
}
```

**instanceof com pattern matching (Java 16+)**
```java
if (m instanceof Faturavel f) {
    f.emitirNota(); // só Especialista cai aqui
}
```

---

## 📚 Aprendizados

Este projeto foi desenvolvido em **5 semanas** de estudo de Java, como exercício prático dos fundamentos de Orientação a Objetos. Cada arquivo representa um passo na compreensão de como modelar sistemas reais com código limpo e bem estruturado.

---

## 👨‍💻 Autor

Feito com dedicação durante os estudos de Java POO.
