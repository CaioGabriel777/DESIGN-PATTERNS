# Singleton

## O que é o Singleton?
O **Singleton** é um padrão de projeto criacional que garante que uma classe tenha apenas uma única instância em todo o ciclo de vida da aplicação, enquanto provê um ponto de acesso global para essa instância. Ele faz isso encapsulando a própria instância estática dentro da classe e tornando o seu construtor privado, impedindo o uso do operador `new` de fora da classe.

## Quando usar?
* **Quando uma classe no seu programa deve ter apenas uma instância disponível para todos os clientes:** Um exemplo clássico é um gerenciador de conexões com o banco de dados (Database Connection Pool) ou configurações globais que são compartilhadas por diferentes partes do sistema.
* **Quando você precisa de um controle mais rigoroso sobre variáveis globais:** Diferente de variáveis globais padrão que podem ser lidas e sobrescritas por qualquer parte do código, o Singleton garante que ninguém possa substituir a instância armazenada.

## Vantagens
* **Controle de Instância Única:** Você tem a garantia absoluta de que a classe terá apenas uma instância instanciada.
* **Acesso Global:** Você ganha um ponto de acesso global e padronizado para essa instância.
* **Inicialização Tardia (Lazy Initialization):** A instância do Singleton só é criada quando for solicitada pela primeira vez, o que pode economizar recursos caso ela seja muito pesada e acabe não sendo usada na execução.

## Problemas e Desvantagens
* **Violação do Princípio de Responsabilidade Única (SRP):** A classe Singleton acaba resolvendo dois problemas ao mesmo tempo: garantir que exista apenas uma instância (controle do próprio ciclo de vida) e lidar com a sua lógica de negócio principal.
* **Acoplamento Forte (High Coupling) e Design Ruim:** O Singleton funciona como uma "variável global glorificada". Ele pode mascarar um design ruim, onde os componentes do programa dependem excessivamente dessa instância global ao invés de receberem suas dependências injetadas (Dependency Injection).
* **Dificuldade em Testes Unitários:** Muitas bibliotecas de testes (como o Mockito) e frameworks dependem de herança e injeção para criar *mocks*. Como o construtor do Singleton é privado e ele frequentemente usa métodos estáticos, "mockar" ou substituir um Singleton durante testes unitários é bem mais complicado e exige soluções alternativas.
* **Dores de cabeça em ambientes Multithread:** Em aplicações que rodam várias threads simultâneas, inicializar um Singleton sem os devidos cuidados (como uso de travas `synchronized` ou técnicas de *Double-Checked Locking*) pode causar "Race Conditions" e acabar criando múltiplas instâncias acidentalmente.
