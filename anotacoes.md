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
Ctrl + Shift + / = Comentário em bloco
Ctrl + Shift + f10 = faz o run
Ctrl + f9 = faz o Build Project
psvm = public static void main(String[] args)
sout = System.out.println
souf =  System.out.printf
fori = cria um laço
variavel.if = faz um if e coloca váriavel dentro
variavel.fori = for (int i = 0; i < variavel; i++)
Ctrl + alt + S = abre as configurações
Ctrl + F = abre a busca no arquivo
Ctrl + Shift + F = abre busca no projeto
Ctrl + R = abre a refatoração
Ctrl + Shift + seta = move a linha para onde voce colocar a seta
Shift + enter = cria nova linha
Ctrl + Shift + U = deixa tudo maisculo ou minusculo
Shift + f6 = renomeia palavra
stratches = serve para fazer anotações e testar códigos no projeto e eles não estão presos ao projeto, se voce abrir outro projeto eles vão está lá

## Mergulhando em Orientação a objeto

### Rascunhando e testando código com Scratch Files

É a forma que classificamos a linguagem de programação pela sua forma de funcionar

Programação imperativa = O programador instrui a máquina de como fazer as coisas

- Programação procedural = programa passo a passo, por uma ordem.
- Programação orientada a objetos = Simular as coisas no mundo real/abstrato no código, tudo seria um objeto, possui uma identidade;

Programação declarativa: descreva apenas o resultado desejado sem falar a lógica

- Programação funcional
- Programação reativa

### Entendendo o conceito de classes e objetos

Classe = Descrição de um conjunto de objetos do mesmo **tipo**, ou seja, um **molde**, com as mesma lista de caracteristicas e comportamentos;

Objeto = são os resultados da classe, fazer instanciação de objetos é fazer vários objetos da classe relacionada

### Criando uma classe com atributos

atributos são as caracteristicas

### Instanciando objetos

Instanciação de objetos é criação de objetos