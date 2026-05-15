# Factory Method

## O que é o Factory Method?
O **Factory Method** (ou Método Fábrica) é um padrão de projeto criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Em vez de chamar o construtor diretamente (usando `new`), você delega a criação do objeto a um método fábrica especial. Isso promove o baixo acoplamento, pois o código cliente não precisa saber qual a classe exata do objeto que está sendo criado.

## Quando usar?
* **Quando o tipo e dependências exatas não são conhecidos:** O padrão separa o código de construção do produto do código que o utiliza. Assim, é fácil adicionar novos tipos de produtos sem quebrar o código existente.
* **Extensibilidade de bibliotecas/frameworks:** Quando você cria um framework e deseja permitir que os usuários estendam seus componentes internos.
* **Reutilização de objetos (Pools e Caches):** Em vez de recriar objetos "pesados" (como conexões de banco de dados ou arquivos), o Factory Method pode retornar um objeto existente de um cache em vez de criar um novo toda vez.

## Vantagens
* **Desacoplamento (Baixo Acoplamento):** Evita o acoplamento forte entre a classe criadora (cliente) e as classes concretas dos produtos. O código cliente se comunica apenas com as interfaces ou classes abstratas.
* **Princípio de Responsabilidade Única (SRP):** Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
* **Princípio Aberto/Fechado (OCP):** Você pode introduzir novos tipos de produtos no sistema sem precisar modificar ou quebrar o código cliente existente. Basta criar um novo produto e o seu respectivo criador.

## Problemas e Desvantagens
* **Complexidade adicional:** O principal problema do Factory Method é que ele pode complicar o código introduzindo muitas novas subclasses. Em um cenário extremo, você precisará de uma classe criadora (Fábrica) diferente para cada nova classe de Produto (Produto Concreto), multiplicando a quantidade de arquivos e classes do seu sistema.
* **Refatoração complexa em sistemas grandes:** Se a hierarquia de criadores não for planejada desde o início, refatorar o código base para introduzir as classes e interfaces necessárias do Factory Method pode ser bastante trabalhoso.
