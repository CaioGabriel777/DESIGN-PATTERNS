# Abstract Factory

## O que é o Abstract Factory?
O **Abstract Factory** (Fábrica Abstrata) é um padrão de projeto criacional que permite produzir famílias de objetos relacionados ou dependentes sem ter que especificar suas classes concretas. Ele fornece uma interface para criar diferentes tipos de produtos que fazem parte de uma mesma "família" ou "tema".

Diferente do Factory Method, que geralmente possui apenas um método para criar um único tipo de produto, o Abstract Factory possui múltiplos métodos de criação (um para cada tipo de produto daquela família).

## Quando usar?
* **Famílias de produtos relacionados:** Quando o seu código precisa funcionar com diferentes famílias de produtos e você quer garantir que os produtos criados sejam compatíveis entre si (ex: IDE e Client de Banco de Dados da mesma stack).
* **Esconder implementações concretas:** Quando você quer fornecer uma biblioteca de componentes e revelar apenas suas interfaces, mantendo as classes concretas ocultas.
* **Sistemas configuráveis ou multi-plataforma:** Muito usado para criar interfaces gráficas (UI) onde os botões, caixas de texto e janelas precisam combinar com o sistema operacional (Windows, macOS, Linux).

## Vantagens
* **Compatibilidade garantida:** Você tem certeza de que os produtos extraídos de uma mesma fábrica são compatíveis e foram feitos para trabalhar em conjunto.
* **Desacoplamento (Baixo Acoplamento):** Evita o acoplamento forte entre o código cliente e os produtos concretos. O cliente usa tudo através das interfaces abstratas.
* **Princípio de Responsabilidade Única (SRP):** Você extrai todo o código de criação de famílias de produtos para locais específicos (as fábricas), facilitando a manutenção.
* **Princípio Aberto/Fechado (OCP):** É muito fácil introduzir novas variantes de famílias (ex: adicionar uma `FrontendWorkstationFactory`) sem quebrar o código cliente existente.

## Problemas e Desvantagens
* **Alta Complexidade (Muitas classes):** O padrão exige a criação de muitas interfaces e classes novas. O número de classes multiplica rapidamente: (Qtd. de Tipos de Produto) x (Qtd. de Famílias) + (Interfaces) + (Fábricas).
* **Dificuldade para adicionar NOVOS TIPOS de produtos:** Se você precisar adicionar um **novo tipo de produto** na família (por exemplo, adicionar um `Terminal` além de `IDE` e `DatabaseClient`), você terá que alterar a interface principal `WorkstationFactory`. Isso forçará a alteração de **todas as fábricas concretas** já existentes para implementar o novo método, o que quebra o Princípio Aberto/Fechado.