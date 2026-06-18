# Flyweight

## O que é o Flyweight?
O **Flyweight** (Peso-Mosca) é um padrão de projeto estrutural puramente focado em **economia de memória** (RAM). Ele permite que você instancie uma quantidade gigantesca de objetos na memória através do compartilhamento de partes comuns do estado entre múltiplos objetos, em vez de manter todos os dados duplicados em cada objeto individualmente.

O padrão ensina a dividir as propriedades de um objeto em dois tipos:
* **Estado Intrínseco (O Flyweight real):** São os dados repetitivos, constantes e pesados. Ficam guardados dentro de um único objeto Flyweight. (Ex: A imagem do logotipo de um departamento e a paleta de cores principal).
* **Estado Extrínseco (O Contexto):** São os dados únicos para cada objeto, que variam de contexto para contexto. Eles não são compartilhados. (Ex: O nome e a foto pessoal do crachá do funcionário).

Geralmente, o padrão é acompanhado por uma `Factory` que atua como um "Cache" para garantir que os objetos Flyweight (Intrínsecos) sejam reaproveitados em vez de recriados.

## Quando usar?
* **Problemas de Memória RAM:** Quando sua aplicação precisar gerar e carregar em memória um número massivo de objetos similares simultaneamente e os recursos estiverem se esgotando.
* **Jogos (Game Development):** Muito utilizado na renderização gráfica. Por exemplo: exibir 10.000 árvores numa floresta. O modelo 3D da árvore (texturas, galhos) é o *Intrínseco*, enquanto as coordenadas X/Y no mapa são o *Extrínseco*.
* **Geração em Lote (Batch Processing):** Em sistemas corporativos, ao gerar milhares de crachás, boletos ou relatórios onde o "template" (Fundo, marca d'água) se repete para todos.

## Vantagens
* **Economia drástica de Memória RAM:** Permite rodar aplicações pesadas que manipulam milhares ou milhões de objetos em servidores ou computadores normais.
* **Redução da carga do Garbage Collector:** Menos objetos sendo criados e destruídos significa que a linguagem (especialmente o Java) gastará menos ciclos limpando a memória, melhorando a fluidez geral.

## Problemas e Desvantagens
* **Aumento extremo da complexidade do código:** Dividir classes simples em Múltiplas classes (Intrínsecas, Extrínsecas, Fábricas) torna o design inicial muito mais difícil de ler e dar manutenção.
* **Trade-off (Troca de RAM por CPU):** Em alguns cenários complexos, ficar recalculando ou passando o estado extrínseco toda vez por parâmetro de método pode aumentar o consumo do Processador (CPU). Você salva a memória RAM, mas gasta processamento.