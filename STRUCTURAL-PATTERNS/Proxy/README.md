# Proxy

## O que é o Proxy?
O **Proxy** (Procurador ou Representante) é um padrão de projeto estrutural que fornece um substituto ou um espaço reservado para outro objeto. O proxy controla o acesso ao objeto original, permitindo que você execute alguma lógica antes ou depois de o pedido chegar ao objeto verdadeiro.

A ideia central é criar uma classe intermediária (o Proxy) que implementa a mesma interface do objeto real. O código cliente interage com o Proxy achando que está interagindo com o objeto real. O Proxy, por sua vez, decide quando, como e se deve repassar a chamada para o objeto verdadeiro.

## Quando usar?
O Proxy é um dos padrões mais versáteis e possui diferentes implementações baseadas na necessidade:
* **Proxy Virtual (Lazy Initialization):** Quando você tem um objeto pesado que consome muitos recursos do sistema (como conexão com banco, carregamento de vídeos ou arquivos muito grandes da nuvem), o Proxy adia a inicialização desse objeto até o momento exato em que ele for *realmente* necessário.
* **Proxy de Proteção (Controle de Acesso):** Quando você quer verificar as credenciais ou permissões de um usuário antes de deixá-lo executar um método sensível do objeto real.
* **Proxy de Cache:** Guarda os resultados de chamadas pesadas ao objeto real e os retorna nas próximas vezes, poupando processamento ou idas desnecessárias à rede.
* **Proxy Remoto:** Quando o objeto real está em outro servidor. O proxy finge ser o objeto local e esconde os detalhes complexos de comunicação pela rede.

## Vantagens
* **Controle Total e Transparente:** Você pode controlar o ciclo de vida e o acesso do objeto real sem que o cliente saiba disso, pois ambos possuem a mesma interface.
* **Desempenho (Performance):** Proxies Virtuais e de Cache melhoram incrivelmente o tempo de resposta e economizam recursos de rede e memória, evitando instanciar coisas pesadas à toa.
* **Princípio Aberto/Fechado (OCP):** Você pode criar novos proxies (ex: adicionar um Proxy de Cache em volta de um banco de dados) sem alterar o código cliente nem o código original do banco de dados.
* **Princípio da Responsabilidade Única (SRP):** Permite retirar lógicas de segurança, lazy loading ou cache de dentro da classe principal, deixando-a focada puramente na regra de negócio.

## Problemas e Desvantagens
* **Complexidade Adicional:** Introduz mais uma camada de classes na arquitetura do sistema, o que pode aumentar a dificuldade de leitura inicial.
* **Atrasos (Latency):** A resposta do serviço pode sofrer pequenos atrasos, já que todo pedido obrigatoriamente passa pelo proxy antes de chegar ao destino real. Se o código do proxy for mal otimizado, isso vira um gargalo.