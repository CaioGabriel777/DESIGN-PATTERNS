# Prototype

## O que é o Prototype?
O **Prototype** é um padrão de projeto criacional que permite copiar objetos existentes sem fazer com que seu código fique dependente de suas classes. Em vez de instanciar um novo objeto do zero usando o operador `new` e configurar cada campo, o Prototype delega o processo de clonagem aos próprios objetos que estão sendo clonados. Ele declara uma interface comum (geralmente com um método `clone()`) para todos os objetos que suportam a clonagem.

## Quando usar?
* **Quando o código não deve depender das classes concretas dos objetos que você precisa copiar:** Isso acontece muito quando o seu código trabalha com objetos passados para você por código de terceiros ou via injeção de dependência através de uma interface genérica.
* **Quando a inicialização de um objeto é custosa:** Se criar um objeto do zero for mais demorado ou exigir mais processamento do que clonar um já existente (por exemplo, quando o objeto requer chamadas lentas ao banco de dados ou redes para ser populado).
* **Quando você deseja reduzir o número de subclasses que apenas se diferenciam na forma como inicializam seus objetos:** Em vez de ter múltiplas classes herdeiras apenas para configurar os valores de um objeto, você pode simplesmente instanciar um conjunto de objetos base (protótipos) com os valores desejados e cloná-los.

## Vantagens
* **Clonagem de objetos sem acoplamento:** Você pode clonar objetos sem precisar conhecer suas classes concretas ou dependências internas.
* **Redução de código de inicialização repetitivo:** Evita a necessidade de configurar instâncias manualmente repetidas vezes.
* **Facilidade na criação de objetos complexos:** Muito útil para instanciar objetos que exigem diversas configurações prévias.
* **Alternativa mais dinâmica:** Ajuda a evitar hierarquias de classes complexas focadas apenas na instanciação, favorecendo a composição e configuração em tempo de execução.

## Problemas e Desvantagens
* **Complexidade na clonagem profunda (Deep Copy):** O maior problema do Prototype surge ao tentar clonar objetos complexos que possuem referências para outros objetos, especialmente quando há **referências circulares**. Um clone superficial (Shallow Copy) pode fazer com que os clones compartilhem dependências com o original, causando efeitos colaterais indesejados. Nessas situações, a implementação precisa de cópias profundas (Deep Copy) pode ser bastante trabalhosa e propensa a erros.