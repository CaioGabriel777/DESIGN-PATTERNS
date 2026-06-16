# Adapter

## O que é o Adapter?
O **Adapter** (também conhecido como Wrapper) é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis colaborem entre si. Ele atua como um "tradutor" ou "adaptador", envolvendo um objeto existente (o *Adaptee*) em uma nova classe (o *Adapter*) que implementa a interface que o cliente (*Target*) espera.

No contexto deste projeto, o *Target* é a `NotificationService` (interface moderna), o *Adaptee* é a `LegacyGovSmsAPI` (API legada), e o *Adapter* é a classe `GovSmsAdapter` que traduz as chamadas de uma para a outra.

## Quando usar?
* **Integração de código existente:** Quando você deseja utilizar uma classe existente (como uma biblioteca de terceiros, código legado ou API externa), mas sua interface não é compatível com o resto do seu código.
* **Reutilização de subclasses:** Quando você quer reutilizar várias subclasses existentes que não possuem alguma funcionalidade comum e não é prático estender cada uma delas. O adaptador pode envolver e adaptar esse comportamento de forma centralizada.

## Vantagens
* **Princípio de Responsabilidade Única (SRP):** Você pode separar o código de conversão de interface (ou tradução de dados) da lógica de negócios primária do programa.
* **Princípio Aberto/Fechado (OCP):** Você pode introduzir novos adaptadores no programa sem quebrar o código cliente existente, pois o cliente se comunica com o adaptador através da interface alvo.
* **Reaproveitamento de código:** Permite usar sistemas legados de forma indolor sem precisar reescrevê-los ou alterá-los diretamente.

## Problemas e Desvantagens
* **Alta Complexidade Geral:** A complexidade geral do código aumenta, pois você precisa introduzir um conjunto de novas interfaces e classes (como o próprio adaptador). 
* **Alternativas mais simples:** Em alguns casos, quando o código fonte da classe problemática está sob seu controle e é fácil de manter, pode ser mais simples apenas refatorá-la para coincidir com a interface desejada ao invés de criar um Adapter.
