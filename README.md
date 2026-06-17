# 🛠️ Padrões de Projeto (Design Patterns)

Bem-vindo ao meu repositório de **Estudos Práticos de Padrões de Projeto**! 

Este projeto tem como objetivo principal explorar, entender e aplicar os diferentes Padrões de Projeto do famoso catálogo do "Gang of Four" (GoF). O foco aqui não é apenas implementar o código base do padrão, mas trazê-lo para um **contexto de ambiente real**, utilizando boas práticas de arquitetura e design de software.

## 🚀 O que você vai encontrar aqui?

Cada padrão de projeto possui seu próprio projeto/diretório contendo:
- A implementação prática do padrão na linguagem **Java**.
- Um arquivo `README.md` dedicado, contendo:
  - O que é o padrão e como ele funciona.
  - Quando devemos utilizá-lo.
  - As vantagens que ele traz.
  - Seus problemas e desvantagens.
- Estrutura de pacotes voltada para o mercado (Package-by-Feature / Orientação a Domínio).

## 📚 Padrões Estudados

### Padrões Criacionais
- [x] **[Factory Method](CREATIONAL-PATTERNS/Factory-Method/)** - Define uma interface para criar objetos, delegando às subclasses a decisão de qual classe instanciar.
- [x] **[Abstract Factory](CREATIONAL-PATTERNS/Abstract-Factory/)** - Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
- [x] **[Builder](CREATIONAL-PATTERNS/Builder/)** - Permite a construção de objetos complexos passo a passo, separando a construção de sua representação.
- [x] **[Prototype](CREATIONAL-PATTERNS/Prototype/)** - Permite copiar objetos existentes sem fazer com que seu código fique dependente de suas classes.
- [x] **[Singleton](CREATIONAL-PATTERNS/Singleton/)** - Garante que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.

### Padrões Estruturais
- [x] **[Adapter](STRUCTURAL-PATTERNS/Adapter/)** - Permite a colaboração de objetos com interfaces incompatíveis.
- [x] **[Bridge](STRUCTURAL-PATTERNS/Bridge/)** - Permite dividir uma classe grande ou um conjunto de classes em duas hierarquias separadas (abstração e implementação) que podem variar de forma independente.
- [x] **[Composite](STRUCTURAL-PATTERNS/Composite/)** - Permite compor objetos em estruturas de árvores e trabalhar com essas estruturas como se fossem objetos individuais.
- [x] **[Decorator](STRUCTURAL-PATTERNS/Decorator/)** - Permite acoplar novos comportamentos e responsabilidades a um objeto dinamicamente (em tempo de execução), utilizando "wrappers" (envoltórios).
- [ ] **[Facade](STRUCTURAL-PATTERNS/Facade/)**
- [ ] **[Flyweight](STRUCTURAL-PATTERNS/Flyweight/)**
- [ ] **[Proxy](STRUCTURAL-PATTERNS/Proxy/)**

*(A lista será atualizada conforme o avanço dos estudos por outros padrões Comportamentais).*

## 💡 Boas Práticas Adotadas
Além do conceito puro de cada padrão, este repositório aplica e respeita:
- **Princípios SOLID** (Especialmente o Princípio de Responsabilidade Única - SRP, e o Princípio Aberto/Fechado - OCP).
- **Baixo Acoplamento e Alta Coesão.**
- **Package-by-Feature:** Organização de pastas e pacotes com base nas regras de negócio/domínio, evitando pacotes genéricos vazios de sentido (como pacotes contendo apenas `interfaces` de todo o sistema).

## 🛠️ Tecnologias Utilizadas
- Java
- Maven

---
*Repositório criado para fins de estudo (IFBA) e aprimoramento profissional contínuo em Arquitetura de Software.*