# SpringBoot

## Component ou Bean?

* *Component* quando eu tenho acesso ao código fonte, me permite injeta-lo em qualquer (através da injeção de dependências) em qualquer ecossistema de um container do SpringBoot;

* *Bean* quando é uma classe ou interface de uma biblioteca externa.

## run(*Component *) e Autowired

* Utilizado para injetar um objeto na inicialização do container, mas sem o uso do "new Object";

* Semelhante ao Autowired, me permite injetar um componente para ser utilizado.

### Conveção:

* Ao usar vários *Bean* deve-se criar uma classe "Beans", para adicionar todas classes externas que são necessárias;

* Caso hajam erros, adicionar *@Configuration* no início dessa classe de beans.