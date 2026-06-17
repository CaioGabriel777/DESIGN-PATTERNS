# Composite

## O que é o Composite?
O **Composite** é um padrão de projeto estrutural que permite agrupar objetos em estruturas de árvore para representar hierarquias do tipo "parte-todo". Ele permite que o código cliente trate objetos individuais e composições complexas de objetos de maneira perfeitamente uniforme.

A ideia central é que você tenha um contrato em comum (**Component**) que é implementado tanto pelos elementos mais simples (**Leaf** ou Folha) quanto pelos elementos contêineres (**Composite**). Quando você chama um método em um Composite, ele não faz o trabalho sozinho: ele repassa (delega) a chamada para todos os seus filhos, formando uma reação em cadeia.

## Quando usar?
* **Estruturas Hierárquicas (Árvores):** Quando você precisa representar hierarquias complexas. (Exemplos clássicos: Sistemas de Arquivos com Pastas e Arquivos, Menus de navegação com Submenus e Links, Organogramas de empresas com Diretores e Funcionários).
* **Tratamento Uniforme:** Quando você quer que o código cliente trate tanto objetos simples (um item solto) quanto agrupamentos (uma caixa com vários itens) da mesma forma, sem precisar usar dezenas de `if` ou `instanceof` para descobrir o que está manipulando.

## Vantagens
* **Facilidade com estruturas complexas:** O polimorfismo e a recursão resolvem quase tudo para você. O cliente apenas chama o método no nó principal e a operação se propaga automaticamente por toda a estrutura da árvore.
* **Princípio Aberto/Fechado (OCP):** É muito simples introduzir novos tipos de componentes (novos elementos Folha ou novos Contêineres) sem precisar alterar nada no código existente.
* **Simplificação do Cliente:** O cliente não se importa com quem está falando. Para ele, uma Folha ou um Composite são exatamente a mesma coisa.

## Problemas e Desvantagens
* **Contratos muito genéricos (Violação do ISP):** Pode ser difícil criar uma interface comum que se encaixe perfeitamente em todas as classes. Muitas vezes, você acaba colocando métodos de gerenciamento na interface principal (como `adicionar()` e `remover()`) que só fazem sentido para o Composite, forçando as classes Leaf (Folhas) a implementarem métodos vazios ou lançarem exceções, o que fere o Princípio da Segregação da Interface (ISP) do SOLID.