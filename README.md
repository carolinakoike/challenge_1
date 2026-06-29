# Challenge 1 - Orientação a Objetos em Java

Projeto desenvolvido como parte de um challenge do UOL Back-end Journey (Spring Boot) - AWS Cloud
Context no Scholarship Program – Compass UOL, que ocorreu entre os dias 05/06/2023 e 01/11/2023, com foco na prática de conceitos de Programação Orientada a Objetos utilizando Java.

## Sobre o projeto

O objetivo do exercício é modelar diferentes tipos de veículos utilizando herança e polimorfismo.

A aplicação funciona via terminal e permite cadastrar veículos, informar suas características e listar os veículos cadastrados durante a execução do programa.

## Conceitos praticados

- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Encapsulamento
- Criação de classes e objetos
- Uso de construtores, getters e setters
- Entrada de dados via terminal com `Scanner`
- Organização de classes em Java

## Classes implementadas

O projeto possui uma classe base para representar veículos e classes específicas para diferentes tipos de transporte.

### Classe base

- `Veiculos`

### Classes filhas

- `Moto`
- `Carro`
- `Bicicleta`
- `Caminhao`
- `Charrete`

### Classe auxiliar

- `Combustivel`

## Funcionalidades

- Cadastrar veículos via terminal
- Informar características como:
  - modelo
  - motor
  - volante
  - quantidade de passageiros
  - quantidade de portas
  - quantidade de rodas
  - se é veículo de carga
  - capacidade de carga
  - tipos de combustível

- Cadastrar atributos específicos de cada tipo de veículo
- Listar os veículos cadastrados

## Exemplo de uso

```text
=== MENU ===
1. Cadastrar veiculo
2. Listar veiculos
0. Sair
Escolha uma opcao:
```

Exemplo de veículo cadastrado:

```text
Modelo: bis
Motor: true
Volante: false
Passageiros: 2
Portas: 0
Rodas: 2
Carga: false
Capacidade de Carga: 0
Partida Eletrica: true
Combustivel: Gasolina Eletricidade
```

## Como executar

### Pré-requisito

É necessário ter o Java instalado na máquina.

Para verificar se o Java está instalado, execute:

```bash
java -version
```

### Clonar o repositório

```bash
git clone https://github.com/carolinakoike/challenge_1.git
```

```bash
cd challenge_1
```

### Compilar o projeto

```bash
javac -d out *.java
```

### Executar o projeto

```bash
java -cp out challenge.Main
```

## Observação

Este projeto foi desenvolvido como exercício de aprendizado e representa uma etapa inicial de prática com Java e Programação Orientada a Objetos.

O código foi mantido como registro de evolução durante os estudos.
