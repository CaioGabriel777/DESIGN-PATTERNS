# Facade

## O que é o Facade?
O **Facade** (Fachada) é um padrão de projeto estrutural que fornece uma interface simplificada para um subsistema complexo, uma biblioteca ou um framework que contém dezenas de classes.

Em vez de o seu código cliente ter que instanciar várias classes diferentes, entender a ordem de execução de métodos e gerenciar as dependências entre eles, você cria uma "Fachada" — uma única classe que centraliza e orquestra todas essas operações, oferecendo métodos fáceis e diretos (ex: `cadastrarNovoFuncionario()`).

## Quando usar?
* **Orquestração de Sistemas Complexos:** Quando uma única ação do sistema exige a comunicação coordenada com várias partes diferentes (ex: Num Onboarding, você precisa criar e-mail, liberar VPN, criar usuário no banco).
* **Isolamento de Bibliotecas de Terceiros:** Para evitar que o código da sua aplicação fique espalhado e fortemente acoplado a classes de uma biblioteca externa. Se a biblioteca for trocada no futuro, você só precisa alterar o código dentro da Facade.
* **Criação de APIs amigáveis:** Quando você constrói um módulo complexo e deseja fornecer um "ponto de entrada" fácil para outros times usarem o seu módulo sem precisarem ler a documentação de todas as classes internas.

## Vantagens
* **Redução de Acoplamento:** O código cliente não conhece as classes que fazem o trabalho pesado. Se o subsistema interno for refatorado, o cliente não quebra.
* **Extrema Simplicidade:** Transforma 50 linhas de inicialização e chamadas de métodos complexos em uma única linha no código cliente.
* **Princípio da Menor Sabedoria (Law of Demeter):** O cliente só interage com seu contato direto (a Fachada), e não com as engrenagens internas.

## Problemas e Desvantagens
* **O risco do Objeto Deus (God Object):** O maior perigo do Facade é que ele continue crescendo até se tornar uma classe monolítica gigante que conhece e interage com todas as classes da aplicação inteira, ferindo o Princípio da Responsabilidade Única (SRP).
* **Perda de poder/customização:** Como a fachada oferece uma via rápida e padronizada, o código cliente perde o acesso aos recursos mais avançados ou "ajustes finos" que o subsistema poderia oferecer se fosse acessado diretamente.
