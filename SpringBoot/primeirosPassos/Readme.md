# SpringBoot

## Component ou Bean?

- **Component**: Utilizado quando se tem acesso ao código fonte. Permite injetar a classe em qualquer ecossistema de um container do SpringBoot através da injeção de dependências.
- **Bean**: Utilizado quando se trata de uma classe ou interface de uma biblioteca externa.

## run(*Component*) e @Autowired

- Utilizados para injetar um objeto na inicialização do container, mas sem o uso do `new Object`.

### Convenção:

- Ao usar vários *Beans*, deve-se criar uma classe "Beans" para adicionar todas as classes externas que são necessárias.
- Caso hajam erros, adicionar `@Configuration` no início dessa classe de beans.

## Singleton ou Prototype

- **Singleton**: Um único objeto é utilizado a cada necessidade da aplicação.
- **Prototype**: A cada necessidade/dependência, uma nova instância é criada.

## Properties Value

- `@Value("${nome}")`: Chama um valor de dentro do `application.properties` chamado "nome".
- `@Value("${nome:OutraOpção}")`: Caso o "nome" não seja encontrado, ele assume o valor padrão posterior ao ":".

## ORM e JPA

### ORM

- ORM (Object-Relational Mapping), em português, Mapeamento Objeto-Relacional, é um recurso para aproximar o paradigma da orientação a objetos ao contexto de banco de dados relacional.
- É feito por uma biblioteca ou framework.

### JPA

- É uma especificação baseada em interfaces que, através de um framework, realiza operações de persistência de objetos Java.
- Implementações: Hibernate, EclipseLink, TopLink e OpenJPA.

#### Mapeamento

1. Identificação
2. Definição
3. Relacionamento
4. Herança
5. Persistência