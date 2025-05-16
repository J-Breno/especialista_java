# Java

## Introdução ao Java

### Conhecendo plataformas Java

- Java SE
- JAkarta EE (Antigo Java EE)
- Java ME
- Java Card

Java SE (Standard Edition) tem Jakarta Servelet, Jakarta Persistence (JPA), Jakarta Bean Validation, etc...

### Conhecendo a Máquina Virtual Java (JVM)

Java é uma linguagem pré compilada, isso significa que para executar uma aplicação java em um computador, precisamos de um software para intermediar e traduzir o código pre compilado para a linguagem nativa da maquina, esse software seria JVM(Java Virtual Machina).

O código java é compilado para bytecode e esse bytecode é interpretado pela JVM e ela traduz em operações nativas para o SO.

### JRE e JDK: qual é a diferença?

Java Runtime Environment (JRE) é um ambiente de Execução Java,a JVM é apenas um componente dentro desse ambiente de execução. Também tem bibliotecas padrão dentro dela, Class Loader;

Java Development Kit (JDK) é kit de desenvolvimento Java, o JDK tem o JRE dentro dele e também tem o compilador e outras ferramentas e utilitários.

## Produtividade com IDE

Ctrl + alt + L = Formatar o código
Ctrl + alt + O = Tirar imports não usado
Ctrl + / = Comentário em linha
Ctrl + shift + / = Comentário em bloco
