# Collections

* Estrutura de dados que agrupa elementos (Objetos) em uma variável;
* Podem ser homogêneas ou heterogêneas;

## 4 tipos

* Set: Interface que define uma coleção sem repetidos;
* List: Coleção ordenada, que permite elementos duplicados;
* Queue: Coleção com fila de prioridades, a ordem é determinada pelo uso do Comparable ou Comparator;
* Map: tem um elemento associado a uma chave única.


![alt text](collection-framework.png)
Embora Map, não faça parte de collections, também é considerada coleção devido à sua função.

### Sumário de metódos

![alt text](<collection-framework-methods copy.png>)

## GenericsType

* '<>' (diamond operator): infere automaticamente o tipo com base no contexto;
* o que era `public class Abc`, vira `public class Abc<T>`, e `T` passa a ser uma variável de tipo para toda a classe;
* as variáveis de tipo podem ser: tipos de classe, tipos de interface, tipos de array ou até outra variável de tipo;
* nomes normalmente usados:
    * E - Elemento (usado extensivamente pelo Java Collections Framework)
    * K - Chave
    * N - Número
    * T - Tipo
    * V - Valor

### Vantagens
1. Manter segurança do tipo de dados: terei apenas elementos do mesmo tipo;
2. Código mais legível: especifica o que vai e volta;
3. Detecta erros: o compilador verifica se os tipos de elemtentos estão de acordo com o tipo de collection;
4. Classes e metódos que funcionam com diferentes coleções.

## Comparable X Comparator

#### Comparable
* Fornece uma sequência de ordenação com base em um elemento (id, nome ou preço);
* A classe é modificada;
* Metódo `compareTo()` para ordenar;
* Está no pct `java.lang`;
* É possível ordenar os elementos da lista tipo `Comparable` usando o metódo `Collections.sort(List)`;

#### Comparator

* Fornece o metódo `compare()` para ordenar elementos;
* Fornece múltiplas sequências de ordenação (pode usar como base vários elementos);
* Não afeta a classe original;
* Está presente no `java.util`
* É possível ordenar os elementos da lista tipo `Comparator` usando o metódo `Collections.sort(List, Comparator)`;

#### Collections
* É uma classe utilitária do java para operações comuns em coleções;
* `sort` é usado para ordenar uma lista em ordem crescente;
* `sort` em conjunto com `Collections.reverseOrder()` para decrescente.
