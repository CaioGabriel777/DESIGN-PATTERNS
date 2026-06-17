# Decorator

## O que é o Decorator?
O **Decorator** é um padrão de projeto estrutural que permite adicionar novos comportamentos aos objetos dinamicamente (em tempo de execução), colocando-os dentro de objetos "envoltórios" (wrappers) que contêm os comportamentos adicionais.

Em vez de criar dezenas de subclasses usando herança para combinar diferentes comportamentos, você envolve o objeto base em um ou mais decoradores. Como tanto o decorador quanto o objeto base implementam a mesma interface, o código cliente nem percebe se está lidando com o objeto puro ou com o objeto decorado.

## Quando usar?
* **Adição dinâmica de responsabilidades:** Quando você precisa adicionar funcionalidades extras a objetos em tempo de execução, sem afetar outros objetos da mesma classe.
* **Alternativa à "Explosão de Subclasses":** Quando estender o comportamento de um objeto via herança gera dezenas de classes para cobrir todas as combinações possíveis (ex: `NotificadorComSMS`, `NotificadorComEmail`, `NotificadorComSMSEmailSlack`, etc).
* **Middlewares / Interceptors (Cross-cutting concerns):** Muito utilizado no mercado para adicionar logs de auditoria, validações de segurança, compressão de dados ou cache no entorno de um método principal, sem sujar a regra de negócio.

## Vantagens
* **Mais flexibilidade que a herança:** Você pode adicionar ou remover comportamentos em tempo de execução simplesmente alterando a ordem ou a quantidade dos "wrappers" (decoradores).
* **Combinação de múltiplos comportamentos:** Você pode envolver um objeto com vários decoradores de uma vez. (Ex: um upload de documento que primeiro passa por antivírus, depois é criptografado, e por fim gera um log de auditoria).
* **Princípio de Responsabilidade Única (SRP):** Você pode dividir um processo complexo em várias classes menores, cada uma responsável por apenas uma camada de comportamento.

## Problemas e Desvantagens
* **Dificuldade na identificação de tipos:** Como o objeto principal fica encapsulado dentro de várias camadas de decoradores, não é recomendável (e às vezes é impossível) tentar checar o tipo específico dele usando `instanceof`.
* **Inicialização feia/complexa:** Instanciar um objeto envolto em 5 decoradores diferentes usando apenas `new` pode gerar um código feio de ler (`new Dec1(new Dec2(new Base()))`). No mundo real, isso costuma ser resolvido usando padrões como **Builder** ou **Factory** para montar as camadas de forma elegante.
