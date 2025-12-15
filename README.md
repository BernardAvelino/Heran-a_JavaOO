# Exercícios de Herança em Java – Programação Orientada a Objetos

Este repositório reúne um **conjunto de exercícios práticos de Herança em Java**, desenvolvidos como parte da disciplina de **Programação Orientada a Objetos (POO)** do curso de **Análise e Desenvolvimento de Sistemas**.

O foco principal dessas atividades é consolidar conceitos fundamentais da orientação a objetos, especialmente **herança, sobrescrita de métodos, reutilização de código e polimorfismo**, utilizando exemplos didáticos e contextualizados.

Todos os códigos foram implementados de acordo com os enunciados propostos pela instituição e organizados em pastas separadas para cada exercício.

---

## 🎯 Objetivo do trabalho

Os exercícios têm como objetivo:

* Compreender o conceito de **herança entre classes**
* Aplicar a **sobrescrita de métodos** (`@Override`)
* Reutilizar atributos e comportamentos da classe base
* Modelar problemas do mundo real usando classes e subclasses
* Praticar organização e clareza no código Java

Cada exercício parte de uma **classe principal (classe pai)** e evolui para uma **classe especializada (classe filha)**.

---

## 🧩 Exercício 1 – Sistema de Personagens de Videogame

Neste exercício, foi criado um sistema simples de personagens de videogame.

* **Classe base:** `Personagem`

  * Atributos: nome, nível, vida, ataqueBase
  * Métodos: `atacar()` e `exibirStatus()`

* **Subclasse:** `Mago`

  * Atributo adicional: mana
  * O método `atacar()` foi sobrescrito para considerar a mana no cálculo do dano

Esse exercício reforça como uma subclasse pode **alterar o comportamento** herdado para atender a regras específicas.

---

## 🤖 Exercício 2 – Sistema de Robôs de Exploração Espacial

Aqui foi desenvolvido um sistema que simula robôs exploradores.

* **Classe base:** `RoboExplorador`

  * Atributos: id, modelo, energia, localAtual
  * Métodos: `mover()` e `status()`

* **Subclasse:** `RoboMinerador`

  * Atributo adicional: capacidadeDeCarga
  * O método `mover()` foi sobrescrito para representar um maior consumo de energia

Esse exercício destaca a **especialização de comportamento** em subclasses.

---

## 🐉 Exercício 3 – Sistema de Criação de Criaturas Fantásticas

Neste cenário, o sistema modela criaturas fantásticas.

* **Classe base:** `Criatura`

  * Atributos: nome, tipo, força, agilidade
  * Métodos: `voar()` e `mostrarFicha()`

* **Subclasse:** `Dragao`

  * Atributo adicional: elemento (fogo, gelo, trovão, etc.)
  * O método `voar()` foi sobrescrito para incluir o elemento no comportamento

O foco aqui é mostrar como **comportamentos podem ser enriquecidos** sem reescrever toda a classe base.

---

## 🧪 Exercício 4 – Sistema de Poções Mágicas

Este exercício trabalha a herança em um contexto de itens mágicos.

* **Classe base:** `Pocao`

  * Atributos: nome, potência, tipo (cura, energia, força)
  * Métodos: `usar()` e `mostrarDetalhes()`

* **Subclasse:** `PocaoRara`

  * Atributo adicional: raridade
  * O método `usar()` foi sobrescrito para aplicar bônus extras

Esse exemplo reforça a ideia de **extensão de funcionalidades** através da herança.

---

## 🚗 Exercício 5 – Sistema de Veículos Inteligentes

Neste exercício, foi criado um sistema básico de veículos.

* **Classe base:** `Veiculo`

  * Atributos: placa, velocidade, autonomia, localização
  * Métodos: `mover()` e `exibirInfo()`

* **Subclasse:** `CarroAutonomo`

  * Atributo adicional: nívelAutonomia
  * O método `mover()` foi sobrescrito para considerar decisões baseadas no nível de autonomia

Aqui o foco está na **adaptação de comportamento conforme regras mais complexas**.

---

## 🐱 Exercício 6 – Sistema de Animais de Estimação Virtuais

Este exercício simula um animal virtual interativo.

* **Classe base:** `AnimalVirtual`

  * Atributos: nome, felicidade, energia, fome
  * Métodos: `interagir()` e `statusAtual()`

* **Subclasse:** `GatoVirtual`

  * Atributo adicional: curiosidade
  * O método `interagir()` foi sobrescrito para incluir ações como explorar e caçar

Esse exercício demonstra bem como a herança pode ser usada para **criar comportamentos únicos a partir de uma base comum**.

---

## 📂 Organização do projeto

Cada exercício está separado em sua própria pasta, contendo:

* Classe base
* Subclasse
* Classe principal de teste (`main`)

Essa organização facilita a leitura, manutenção e entendimento do código.

---

## 📚 Conceitos aplicados

Ao longo do projeto, foram aplicados os seguintes conceitos de POO:

* Herança (`extends`)
* Sobrescrita de métodos (`@Override`)
* Encapsulamento
* Reutilização de código
* Polimorfismo

---

## 🏁 Conclusão

Este conjunto de exercícios foi essencial para consolidar a base em **Programação Orientada a Objetos com Java**, mostrando como a herança permite criar sistemas organizados, reutilizáveis e fáceis de evoluir.

Os exemplos abordam diferentes contextos, tornando o aprendizado mais intuitivo e próximo de situações reais de desenvolvimento.

Trabalho desenvolvido para fins acadêmicos, com foco em aprendizado e prática sólida de POO.
