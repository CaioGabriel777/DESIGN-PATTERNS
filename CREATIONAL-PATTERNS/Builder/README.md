# Builder

## O que é o Builder?
O **Builder** é um padrão de projeto criacional que permite a construção de objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção. Ele isola a lógica de criação de um objeto de sua classe principal (domínio), delegando-a para uma classe dedicada a construí-lo (o *Builder*).

## Quando usar?
* **Quando você precisar evitar o problema do "Construtor Telescópico" (Telescoping Constructor):** Isso ocorre quando sua classe possui dezenas de parâmetros (muitos deles opcionais), o que acaba exigindo a criação de vários construtores sobrecarregados para cobrir todas as combinações possíveis.
* **Quando você deseja criar diferentes representações de um produto específico:** Se a criação de objetos exige passos semelhantes que diferem apenas nos detalhes, o padrão permite criar diferentes *Builders* concretos para implementar essas variações.
* **Quando a construção do objeto envolve muitas etapas:** Diferente de outros padrões criacionais que geram o produto em uma única chamada, o Builder foca na construção passo a passo, sendo o objeto final devolvido apenas quando todas as configurações necessárias forem concluídas.

## Vantagens
* **Construção controlada:** Você pode construir objetos etapa por etapa, adiar etapas de construção ou executá-las de forma fluente (Fluent Interface).
* **Reutilização do processo de construção:** Você pode reutilizar o mesmo código de montagem para criar diferentes variações do mesmo tipo de produto.
* **Princípio de Responsabilidade Única (SRP):** Você isola o código de construção complexo da lógica de negócio do produto. A classe resultante muitas vezes se torna imutável, sem a necessidade de expor *setters*.

## Problemas e Desvantagens
* **Aumento na quantidade de arquivos e código:** O padrão pode aumentar a complexidade geral do projeto ao exigir a criação de múltiplas classes novas (os próprios Builders, possíveis interfaces e, às vezes, a classe Diretor).