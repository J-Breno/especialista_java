# 📘 Introdução ao Java

Este repositório contém anotações, exemplos e dicas práticas sobre a linguagem de programação **Java**, organizados para facilitar o aprendizado e revisão de conceitos essenciais — desde a plataforma Java até orientação a objetos, boas práticas de código e gerenciamento de memória.

---

## ✨ Sumário

- [Plataformas Java](#plataformas-java)
- [JVM, JRE e JDK](#jvm-jre-e-jdk)
- [Produtividade com IDE](#produtividade-com-ide)
- [Paradigmas de Programação](#paradigmas-de-programação)
- [Orientação a Objetos](#orientação-a-objetos)
- [Boas Práticas de Código](#boas-práticas-de-código)
- [Tipos Primitivos e Wrappers](#tipos-primitivos-e-wrappers)
- [Gerenciamento de Memória](#gerenciamento-de-memória)
- [Construtores, Pacotes e Visibilidade](#construtores-pacotes-e-visibilidade)
- [📚 Documentação Oficial](#-documentação-oficial)

---

## 🖥️ Plataformas Java

A plataforma Java possui diferentes edições que atendem a diversas necessidades:

- **Java SE (Standard Edition)**: Base da linguagem Java.
  - Inclui: Jakarta Servlet, Jakarta Persistence (JPA), Jakarta Bean Validation, etc.
- **Jakarta EE** (antiga Java EE): Voltada para aplicações corporativas.
- **Java ME**: Para dispositivos móveis e embarcados.
- **Java Card**: Para cartões inteligentes (smart cards).

---

## 🔥 JVM, JRE e JDK

### ☕ Java Virtual Machine (JVM)
Java é uma linguagem **pré-compilada**. O código é transformado em **bytecode**, que é interpretado pela **JVM** (Java Virtual Machine). A JVM traduz o bytecode em instruções nativas para o sistema operacional.

### ⚙️ JRE vs JDK

| Componente | Descrição |
|-----------|-----------|
| **JRE** (Java Runtime Environment) | Ambiente de execução Java. Inclui a JVM e bibliotecas padrões. |
| **JDK** (Java Development Kit) | Kit de desenvolvimento Java. Inclui o JRE, compilador (`javac`) e ferramentas de desenvolvimento. |

---

## 🚀 Produtividade com IDE (Atalhos úteis)

> Principais atalhos para aumentar a produtividade ao programar com IntelliJ IDEA:

| Ação | Atalho |
|------|--------|
| Formatar código | `Ctrl + Alt + L` |
| Remover imports não usados | `Ctrl + Alt + O` |
| Comentar linha | `Ctrl + /` |
| Comentar bloco | `Ctrl + Shift + /` |
| Rodar projeto | `Ctrl + Shift + F10` |
| Build do projeto | `Ctrl + F9` |
| Buscar no arquivo | `Ctrl + F` |
| Buscar no projeto | `Ctrl + Shift + F` |
| Refatorar | `Ctrl + R` |
| Abrir configurações | `Ctrl + Alt + S` |
| Nova linha abaixo | `Shift + Enter` |
| Renomear símbolo | `Shift + F6` |
| Alternar maiúsculo/minúsculo | `Ctrl + Shift + U` |

> Dicas:
> - `psvm`: Gera o método `public static void main(String[] args)`
> - `sout`, `souf`: Gera `System.out.println` ou `System.out.printf`
> - `fori`, `variavel.if`, `variavel.fori`: Gera estruturas de controle rapidamente
> - **Scratch Files**: Arquivos temporários para testes de código

---

## 🧠 Paradigmas de Programação

- **Programação Imperativa**: O programador descreve *como* fazer.
  - Procedural
  - Orientada a Objetos
- **Programação Declarativa**: O programador descreve *o que* deseja.
  - Funcional
  - Reativa

---

## 🎯 Orientação a Objetos

### 🧱 Classes e Objetos

- **Classe**: É um molde que define características (atributos) e comportamentos (métodos).
- **Objeto**: É uma instância de uma classe.

### 🏗️ Atributos e Instanciação

- **Atributos**: São as características da classe.
- Para criar um objeto:  
  ```java
  Pessoa p = new Pessoa();
  ```

### ⚙️ Composição de Objetos

- Uma classe pode conter referências a outras classes:
  ```java
  class Carro {
      Motor motor; // Composição
  }
  ```
- Cada variável armazena uma **referência** (endereço de memória) para o objeto, não o objeto em si.
- `this`: Referência ao próprio objeto.

### ➕ Sobrecarga de Métodos

- É possível ter métodos com o **mesmo nome**, mas **diferentes parâmetros**.

---

## 🧼 Boas Práticas de Código

> Baseado nos princípios do *Effective Java* e *Clean Code*.

- Use **nomes descritivos** para variáveis, métodos e classes.
- **Evite comentários desnecessários**: O código deve se explicar sozinho.
- **Prefira legibilidade à concisão**.
- **Classes** devem ser substantivos. **Métodos**, verbos.
- **Evite números mágicos**: Use constantes nomeadas.
- Faça **métodos pequenos**, que façam uma única coisa.
- Evite passar `null` como argumento. Use:
  ```java
  Objects.requireNonNull(obj, "Mensagem");
  ```

---

## 🔢 Tipos Primitivos e Wrappers

Java possui tipos primitivos como `int`, `double`, `boolean`, `char`, etc. Para tratá-los como objetos, usamos as classes **Wrapper**:

| Tipo Primitivo | Wrapper |
|----------------|---------|
| `int` | `Integer` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

### 🎁 Autoboxing e Unboxing

- **Autoboxing**: Converte automaticamente de primitivo para Wrapper.
  ```java
  Integer num = 10; // int -> Integer
  ```
- **Unboxing**: O processo inverso.

> Use **Wrapper** se a variável pode ser `null`.

---

## 💾 Gerenciamento de Memória

### 🧠 Estrutura da Memória da JVM

- **Heap**: Onde os objetos instanciados são armazenados.
- **Stack (Call Stack)**: Armazena variáveis locais e chamadas de método.
- **Metaspace** (antiga PermGen): Armazena metadados da aplicação (classes, métodos).

### ♻️ Garbage Collector

- Quando um objeto deixa de ter referências, ele é elegível para coleta de lixo.
- Boa prática: anule referências quando não precisar mais do objeto.

---

## 🏗️ Construtores, Pacotes e Visibilidade

### 🔨 Construtores

- Método especial usado para instanciar e inicializar objetos.
- Tem o mesmo nome da classe e **não possui tipo de retorno** (nem `void`).
- Se você criar um construtor com parâmetros, o **construtor padrão** deixa de ser gerado automaticamente. Declare os dois, se precisar.

```java
public class Pessoa {
    public Pessoa() {} // Construtor padrão
    public Pessoa(String nome) {} // Sobrecarga
}
```

### 📦 Pacotes

- Organizam o código em grupos lógicos de classes.

### 🔐 Modificadores de Acesso

| Modificador | Visível em... |
|-------------|----------------|
| `public` | Todas as classes |
| `protected` | Mesmo pacote e subclasses |
| `default` (sem modificador) | Somente no mesmo pacote |
| `private` | Somente na própria classe |

---

## 📚 Documentação Oficial

Para se aprofundar, estudo pela documentação oficial do Java:

🔗 [Documentação Java SE](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)

---

## Encapsulamento, Javabens e records

---

Encapsulamento é o princípio de esconder os detalhes internos de uma classe e expor apenas o que é necessário, normalmente por meio de métodos públicos de acesso (getters e setters).

JavaBean é uma convenção (um padrão) para criar classes em Java que seguem algumas regras específicas. Muito usado para representar objetos de dados (como DTOs ou formulários).

 O record é uma forma moderna de declarar classes imutáveis em Java, usada principalmente para transportar dados (Data Transfer Objects – DTOs) com muito menos código. Bom para armazenar dados

 ## Herança

 Herança em Java é um dos principais pilares da Programação Orientada a Objetos (POO) e permite que uma classe herde atributos e métodos de outra classe.

A ideia é reutilizar código e evitar repetição. Com herança, você pode criar uma nova classe (subclasse) com base em uma classe existente (superclasse), aproveitando seus comportamentos e podendo também adicionar ou sobrescrever funcionalidades.
É um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra.

## Polimorfismo
 
 O polimorfismo permite que um mesmo método ou comportamento possa agir de maneiras diferentes dependendo do objeto que o invoca.
 Polimorfismo é recurso que permite variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.

### Upcasting

 o upcasting é o processo de converter uma instância de uma classe derivada (subclasse) para uma referência da sua superclasse.

 ### Downcasting

 Downcasting é o processo de converter uma referência de uma classe pai (superclasse) para uma referência de uma classe filha (subclasse). Isso é feito quando você tem um objeto que, apesar de estar referenciado por uma variável do tipo da superclasse, na verdade é uma instância de uma subclasse, e você quer acessar comportamentos específicos dessa subclasse.

 A anotação @Override em Java serve para informar ao compilador que você está sobrescrevendo um método da superclasse ou de uma interface.

 ### Instanceof

Instanceof serve para saber se uma classe é uma outra classe. Por exemplo: Um conta investimento é uma conta?
OBS: não fique usando direto o instanceof, evite

Classes abstratas são classes que nã podem ser instanciadas

## Interface

interface é um contrato

## Exceptions

Exceções (do inglês exceptions) são eventos indesejados que ocorrem durante a execução do programa, como erro de divisão por zero, tentativa de acesso a um índice inválido, falha de conexão com banco de dados, etc.

Java trata essas situações com um sistema robusto de tratamento de exceções, permitindo que o programa não quebre abruptamente e que você lide com erros de forma controlada.

## Generics

Generics são uma forma de escrever código genérico, reutilizável e com segurança de tipo.

Eles permitem parametrizar tipos, ou seja, dizer que uma classe ou método trabalha com um tipo que será informado na hora do uso.

T extends NomeClasse - diz que esse T pode ser apenas de algo que esteja relacionado com o NomeClasse