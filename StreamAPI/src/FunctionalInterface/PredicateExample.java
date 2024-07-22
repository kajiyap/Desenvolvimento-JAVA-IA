package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
  }
}