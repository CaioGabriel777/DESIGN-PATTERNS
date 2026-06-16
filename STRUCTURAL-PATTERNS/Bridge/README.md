# Bridge

## O que é o Bridge?
O **Bridge** (Ponte) é um padrão de projeto estrutural que permite dividir uma classe grande (ou um conjunto de classes intimamente ligadas) em duas hierarquias separadas — **Abstração** e **Implementação** — que podem ser desenvolvidas independentemente umas das outras. 

A ideia central é usar *composição* em vez de herança para lidar com múltiplas dimensões ortogonais de uma mesma entidade. A abstração (o controle) contém uma referência para a implementação (a execução), e delega o trabalho pesado para ela.

## Quando usar?
* **Crescimento Exponencial de Classes (Explosão Cartesiana):** Quando você precisa estender uma classe em várias dimensões independentes (por exemplo: você tem `Relatorio` (Diario, Mensal) e `Formato` (HTML, PDF). Em vez de criar `RelatorioDiarioHTML`, `RelatorioDiarioPDF`, você separa as duas hierarquias).
* **Troca de Implementação em Tempo de Execução:** Quando você quer poder trocar a implementação que uma abstração usa durante a execução do programa (mudar de PDF para HTML dinamicamente).
* **Ocultação de Detalhes:** Quando você deseja fornecer uma interface de alto nível limpa e ocultar os detalhes de baixo nível dos clientes.

## Vantagens
* **Princípio de Responsabilidade Única (SRP):** Separa a lógica de controle de alto nível (Abstração) do código de formatação/plataforma (Implementação).
* **Princípio Aberto/Fechado (OCP):** Você pode criar novas abstrações (ex: `RelatorioAnual`) e novas implementações (ex: `FormatoExcel`) de forma totalmente independente.
* **Redução de Acoplamento:** A Abstração conversa apenas com a interface da Implementação.
* **Evita a explosão de subclasses:** Diminui drasticamente a quantidade de classes necessárias para combinar múltiplas variantes.

## Problemas e Desvantagens
* **Aumento de Complexidade Inicial:** Pode tornar o código mais complexo de entender inicialmente. Aplicar o Bridge em um escopo onde há apenas uma variação ou não há previsão de crescimento pode ser um "overengineering" desnecessário.