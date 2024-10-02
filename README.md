# Projetos de Prática - Curso Maratona Java Virado no Jiraya

  Este repositório contém 5 exercícios desenvolvidos como parte da prática dos conceitos aprendidos no curso "Maratona Java Virado no Jiraya", oferecido pelo canal DevDojo no YouTube. Os exercícios foram implementados após assistir até o vídeo 94 do curso, e têm como objetivo consolidar o conhecimento adquirido em Java, com foco em Programação Orientada a Objetos (POO), manipulação de coleções, recursividade e controle de fluxo.

## Objetivo

 O principal objetivo deste repositório foi praticar os fundamentos de Java aprendidos ao longo do curso, com desafios que variam desde operações básicas com classes e objetos até conceitos avançados como recursividade e manipulação de listas.

## Índice

  1. <a href="#como-executar-os-exercicios">Como Executar os Exercícios</a>
  2. <a href="#lampada-com-metodos-avancados">Lâmpada com Métodos Avançados</a>
  3. <a href="#sistema-de-conta-corrente-com-metodos-estaticos">Sistema de Conta Corrente com Métodos Estáticos</a>
  4. <a href="#jogo-da-velha">Jogo da Velha </a>
  5. <a href="#fibonacci">Fibonacci</a>
  6. <a href="#sistema-de-controle-de-estoque">Sistema de Controle de Estoque</a> 

---
## 1. Como Executar os Exercícios

###   Pré-requisitos
- **Java Development Kit (JDK)** instalado.
- Um ambiente de desenvolvimento integrado (IDE) como **IntelliJ IDEA**, **Eclipse**, ou qualquer outro de sua preferência.

### Passos para Executar o Código

#### 1. Clonar o Repositório:

```bash
git clone https://github.com/Wadson-Ferreira/ExercicioPraticaJava.git
cd ExercicioPraticaJava
```

#### 2. Compilar o Código:

- Abra o terminal e navegue até o diretório do projeto.

- Compile os arquivos Java dos exercícios, utilizando o seguinte comando:

```bash
javac -d bin src/Exercicio01/Main.java
javac -d bin src/Exercicio02/Main.java
javac -d bin src/Exercicio03/Main.java
javac -d bin src/Exercicio04/Main.java
javac -d bin src/Exercicio05/Main.java
```

#### 3. Executar os Programas:

Após compilar, siga as instruções abaixo para rodar cada exercício.

#### **Executar o Programa da Lâmpada com Métodos Avançados:**

- Navegue até o diretório `bin`:
  ```bash
  cd bin
  ```
  
- Execute o programa:
  ```bash
  java ExercicioXX.Main
  ```
- Substitua o "XX" pelo númerodo do exercício que deseja rodar.

---

## 2. <a href="https://github.com/Wadson-Ferreira/ExercicioPraticaJava/tree/master/src/Exercicio01" target="_blank" id="lampada-com-metodos-avancados">Lâmpada com Métodos Avançados</a>

#### Implementa controle de uma lâmpada inteligente com ajuste de intensidade e temporizador.

Este exercício consiste na implementação de uma classe Lampada que simula o comportamento de uma lâmpada inteligente. A lâmpada possui métodos para ligar, desligar, ajustar a intensidade da luz (de 0 a 100%) e um temporizador 
que permite programar o desligamento automático após um período determinado de tempo em segundos ou minutos.

### Funcionalidades Implementadas

* Ligar/Desligar a Lâmpada: Controle do estado da lâmpada, permitindo ligar ou desligar.
* Ajuste de Intensidade: Permite ajustar a intensidade da lâmpada de 0 a 100%.
* Temporizador para Desligamento: Temporizador que aceita valores em segundos ou minutos para desligar automaticamente a lâmpada após o tempo configurado.

### Conceitos Abordados

* Programação Orientação a Objetos (POO): Implementação de classes e métodos, encapsulamento de comportamentos da lâmpada.
* Manipulação de Threads: Execução assíncrona do temporizador para desligamento da lâmpada.
* Tratamento de Erros: Uso de try-catch para capturar e gerenciar exceções durante a execução do temporizador.
* Validação de Entrada do Usuário: Garantindo que o sistema opere corretamente com as entradas recebidas.

### Desafios e Aprendizados

* Implementação de Thread para o temporizador de desligamento, lidando com manipulação de threads e tratamento de interrupções.
* Validação de entrada do usuário para o temporizador, garantindo que sejam fornecidos valores numéricos e unidades válidas (segundos ou minutos).
* Verificação do estado da lâmpada antes de iniciar o temporizador para evitar inconsistências, como tentar desligar uma lâmpada que já está apagada.

---

## 3. <a href="https://github.com/Wadson-Ferreira/ExercicioPraticaJava/tree/master/src/Exercicio02" target="_blank" id="sistema-de-conta-corrente-com-metodos-estaticos">Sistema de Conta Corrente com Métodos Estáticos</a>

#### Um sistema para criar e gerenciar contas bancárias com métodos estáticos.

Este exercício implementa um sistema de conta corrente em Java que permite a criação de contas bancárias, realização de depósitos e saques, e visualização do extrato bancário. O sistema conta com métodos estáticos para contabilizar 
o número total de operações realizadas, como saques e depósitos, utilizando uma abordagem orientada a objetos.

### Funcionalidades Implementadas

* Criar Conta: Permite criar uma nova conta com nome do titular, agência fixa, número da conta gerado automaticamente e saldo inicial.
* Depositar: Adiciona saldo à conta, com validação de valores e registro de transações.
* Sacar: Realiza saques com validação de saldo disponível e registro de operações.
* Exibir Extrato Bancário: Mostra todas as transações realizadas na conta, incluindo depósitos e saques.
* Contador de Operações: Contabiliza e exibe o total de saques, depósitos e operações realizadas em todas as contas.

### Conceitos Abordados

* Encapsulamento: Atributos como saldo e transações são privados e acessados através de métodos específicos (getters e setters).
* Métodos Estáticos: A classe Conta utiliza métodos e atributos estáticos para manter um controle global das operações realizadas, independentemente da instância.
* Listas (ArrayList): A lista de transações e contas é gerenciada utilizando a classe ArrayList do Java, facilitando a adição e manipulação de dados dinâmicos.
* Tratamento de Entradas do Usuário: Uso de Scanner para capturar e validar entradas, garantindo que o sistema responda de forma adequada a entradas numéricas e textuais.
* Estruturas de Controle: Uso de loops e estruturas condicionais (if/else e switch) para controlar o fluxo do programa, permitindo interação com o usuário de maneira dinâmica.
* Gestão de Exceções: O código está preparado para lidar com exceções de entradas inválidas, como valores não numéricos ou fora do esperado.
  
### Desafios e Aprendizados

* Gerenciamento de Contas: Integração correta entre a classe 'ContaManager' e a classe 'Conta' para gerenciar múltiplas contas de forma eficiente.
* Validação de Entradas: Tratamento de entradas numéricas para depósitos e saques, garantindo que valores sejam válidos e formatados corretamente.
* Contabilização de Operações: Implementação de métodos estáticos para manter contadores globais de todas as operações bancárias realizadas.
* Tratamento de Erros: Lidando com exceções e entradas inválidas de forma a garantir que o sistema permaneça estável e seguro.

---

## 4. <a href="https://github.com/Wadson-Ferreira/ExercicioPraticaJava/tree/master/src/Exercicio03" target="_blank" id="jogo-da-velha">Jogo da Velha</a>

#### Jogo da Velha com três modos de jogo e implementação de IA.

Um Jogo da Velha com três modos de jogo: Jogador vs Jogador, Jogador vs IA, e IA vs IA. O projeto explora a implementação de uma inteligência artificial simples para enfrentar o jogador humano e o controle do fluxo do jogo.

### Funcionalidades Implementadas

* O jogo permite três modos diferentes:
  * Jogador vs Jogador
  * Jogador vs IA
  * IA vs IA
* Atualização do Tabuleiro: O tabuleiro é exibido e atualizado a cada jogada, mostrando o estado atual do jogo.
* Verificação de Vitória e Empate: O jogo verifica automaticamente se há um vencedor ou se terminou em empate.
* Repetição de Partida: Após o fim de uma partida, o jogador tem a opção de jogar novamente.

### Conceitos Abordados

* Classes e Objetos: O projeto foi estruturado utilizando classes que representam os elementos principais do jogo (Jogador, Tabuleiro, etc.), e objetos dessas classes foram instanciados para realizar o jogo.
* Herança: As classes JogadorHumano e JogadorIA herdam a classe base Jogador, permitindo reutilizar código comum e especializar o comportamento para cada tipo de jogador.
* Polimorfismo: A interface JogadorInterface foi implementada por diferentes tipos de jogadores (humano e IA), permitindo que o código no método fazerJogada seja executado de forma polimórfica, dependendo do tipo do jogador.
* Encapsulamento: As propriedades dos objetos (como nome, símbolo e tipo de jogador) foram encapsuladas e manipuladas através de métodos getters e setters, garantindo a integridade dos dados.
* Loops: Utilizamos loops while para controlar o ciclo do jogo, permitindo que o tabuleiro seja atualizado continuamente até que haja um vencedor ou empate. Também foi utilizado para permitir que o jogador decida se deseja jogar novamente.
* Condicionais: Foram utilizados if e switch para verificar a escolha do jogador, validar as jogadas e determinar as condições de vitória ou empate.
* Alternância de Turnos: A lógica de alternância entre os turnos dos jogadores foi implementada com uma simples troca de booleanos, alternando entre o jogador 1 e o jogador 2 a cada rodada.
* O tabuleiro do jogo foi representado por um array bidimensional (char[][]), que foi manipulado para armazenar e atualizar as jogadas dos jogadores. Isso também facilitou a verificação de vitórias e empates com base nas posições ocupadas no array.
* Validação de Coordenadas: O código valida as entradas dos jogadores para garantir que as coordenadas inseridas estão dentro do limite do tabuleiro (0 a 2) e que a posição escolhida ainda não foi ocupada.
* Tratamento de Erros: Foram implementadas mensagens de erro amigáveis para o jogador caso ele insira coordenadas inválidas ou tente jogar em uma posição já ocupada.

### Desafios e Aprendizados

* Implementação da IA: Um dos desafios foi desenvolver uma IA simples, capaz de realizar jogadas aleatórias, mas dentro das regras do jogo. Isso exigiu uma validação das posições escolhidas pela IA para garantir que fossem válidas.
* Controle do Fluxo de Jogo: Implementar a lógica que alterna os turnos entre os jogadores, verifica as condições de vitória e permite a repetição do jogo sem reiniciar o programa foi um exercício importante para entender loops e estruturas de controle.
* Tratamento de Erros: Durante a implementação, foi necessário validar as entradas dos jogadores, como coordenadas inválidas ou já ocupadas, além de garantir que a interação com o tabuleiro fosse precisa.
* Interfaces e Herança: O uso de interfaces e herança permitiu criar uma estrutura flexível para os diferentes tipos de jogadores (humanos e IA).
* Validação de Entradas: Implementar a validação de entradas foi um ponto crítico para garantir que o jogo fosse jogável e não quebrasse em situações de erro, como entradas inválidas.
  
---

## 5. <a href="https://github.com/Wadson-Ferreira/ExercicioPraticaJava/tree/master/src/Exercicio04" target="_blank" id="fibonacci">Fibonacci </a>

#### Implementa um método que calcula o N-ésimo termo da sequência de Fibonacci e outro método que retorna toda a sequência até o N-ésimo termo.

Este exercício calcula o N-ésimo termo da sequência de Fibonacci, e permite ao usuário inserir a posição desejada para obter o valor correspondente da sequência.

### Funcionalidades Implementadas

* Cálculo do N-ésimo termo da sequência de Fibonacci: O programa calcula o termo correto da sequência de Fibonacci com base na posição fornecida pelo usuário.
* Entrada e validação simples do usuário: O programa aceita uma entrada do usuário (a posição na sequência) e realiza o cálculo automaticamente.
* Iteração eficiente: A implementação utiliza uma abordagem iterativa, garantindo eficiência no cálculo de termos grandes sem sobrecarregar a pilha de chamadas, como ocorreria com uma implementação recursiva tradicional.
* Ajuste de indexação: O ajuste da posição de entrada do usuário com 'posicao--' garante que o cálculo esteja correto, considerando o início da sequência.

### Conceitos Abordados
* Laços (loops): O laço for é utilizado para iterar através dos termos da sequência, atualizando os valores de maneira sequencial.
* Manipulação de variáveis: Utiliza variáveis temporárias (prev, current) para armazenar os valores atuais e anteriores da sequência durante o cálculo.
* Sequência de Fibonacci: A fórmula básica da sequência de Fibonacci é aplicada, onde cada termo é a soma dos dois anteriores.

### Desafios e Aprendizados

* Desafio de entender o comportamento da sequência de Fibonacci: Inicialmente, o programa estava pulando o segundo número 1 da sequência. Isso foi corrigido ajustando a lógica para garantir que a sequência inicie corretamente.
* Ajuste da indexação: Compreender que, para a sequência começar corretamente, foi necessário ajustar a posição da entrada do usuário para alinhar com a indexação da sequência.
* Escolha da abordagem iterativa: Uma versão recursiva da sequência de Fibonacci pode ser mais simples de implementar, mas a abordagem iterativa é mais eficiente e evita problemas com grandes entradas, como estouro de pilha.
* Controle de fluxo e lógica de laços: Foi importante entender como controlar o laço de forma que os valores fossem atualizados na ordem correta e que o cálculo fosse preciso sem pular termos.
  
---

### 6. <a href="https://github.com/Wadson-Ferreira/ExercicioPraticaJava/tree/master/src/Exercicio05" target="_blank" id="sistema-de-controle-de-estoque">Sistema de Controle de Estoque</a>

#### Um sistema de gerenciamento de estoque com funcionalidades para adicionar, remover, listar e buscar produtos.

Este projeto é um sistema de controle de estoque em Java, que permite adicionar, remover, listar e buscar produtos, além de calcular o valor total do estoque. O projeto foi desenvolvido como parte de um exercício de aprendizado em Java, 
focado em reforçar conceitos de orientação a objetos, manipulação de listas, controle de fluxo e tratamento de exceções.

### Funcionalidades Implementadas

* Adicionar Produto: Permite ao usuário adicionar novos produtos ao estoque, verificando se o produto já existe e, em caso afirmativo, atualizando a quantidade.
* Remover Produto: Remove uma quantidade específica de um produto, com a opção de remover todas as unidades do produto e excluir o produto do estoque.
* Listar Produtos: Exibe todos os produtos no estoque, com suas respectivas quantidades e preços.
* Buscar Produto: Pesquisa por um produto específico no estoque e exibe suas informações.
* Calcular Valor Total do Estoque: Calcula o valor total do estoque com base no preço e na quantidade de cada produto.
* Tratamento de Erros: Valida entradas do usuário para garantir que o sistema não seja interrompido por entradas inválidas.
  
### Desafios e Aprendizados

* Gerenciamento de Produtos corretamente no estoque, principalmente em operações como adicionar e remover. Foi necessário garantir que, ao adicionar um produto existente, a quantidade fosse atualizada corretamente, sem duplicar o produto na lista.
* A remoção de produtos apresentou um desafio interessante, pois o sistema precisava lidar tanto com a remoção parcial quanto com a remoção total de um produto. Além disso, o sistema foi configurado para solicitar confirmação do usuário antes de excluir completamente um item do estoque.
* Foi implementado um tratamento de exceções usando InputMismatchException para evitar erros quando o usuário fornecesse uma entrada inválida. Este foi um ponto crucial para garantir a robustez do sistema e evitar falhas inesperadas.
* Um outro aprendizado importante foi a validação do estado do estoque. Foram incluídas verificações para tratar casos de estoque vazio, tanto no momento de listar os produtos quanto nas operações de remoção e cálculo do valor total.

---

## Conclusão

Os cinco exercícios desenvolvidos neste repositório são um reflexo prático dos conceitos estudados até o vídeo 94 do curso "Maratona Java Virado no Jiraya". Cada exercício aborda tópicos fundamentais para o desenvolvimento em Java, como Programação Orientada a Objetos (POO), recursividade, manipulação de coleções e controle de fluxo. 
Ao longo do desenvolvimento, enfrentei desafios técnicos significativos, como a implementação de lógicas eficientes para IA, controle de fluxo em jogos, validação de entradas e utilização de threads. Cada um desses desafios contribuiu para um maior entendimento de como construir soluções em Java que sejam robustas e escaláveis. 
Este repositório não apenas consolida o aprendizado obtido, mas também oferece uma base sólida para projetos futuros, reforçando boas práticas de desenvolvimento, como modularidade de código, encapsulamento e tratamento adequado de exceções. 

Se houver dúvidas ou sugestões, sinta-se à vontade para abrir uma issue ou contribuir com o projeto.

