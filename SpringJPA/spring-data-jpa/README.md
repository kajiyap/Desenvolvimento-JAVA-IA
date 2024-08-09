# Spring Data JPA

* **@Entity** para sinalizar que o  objeto será uma entidade do banco de dados;
* **@Id** para sinalizar que aquela propriedade é a chave primária da entidade;
* **@GeneratedValue(strategy = GenerationType.IDENTITY)** para que o Id sejá criado automaticamente e a estrutura de identificação seja baseada no Id.
* **@Column(name - user_id)** para definir que o nome da coluna no banco será diferente do nome da propriedade;
* **@Column(length = 100, nullable = false)** para definir o tamanho máximo da coluna (length) e se pode ser vazia ou não (nullable);

### Para conectar o SpringBoot com o Postgres:

#Opcional
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update 


#Obrigátorio de acordo com o seu banco de dados
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/dio_db
spring.datasource.username=postgres
spring.datasource.password=1574

### Metódos mais usados:

* **save:** Insere e atualiza os dados de uma entidade;
* **findById:** Retorna o objeto localizado pelo seu ID;
* **existsById:** Verifica e existência de um objeto pelo ID informado, retornando boolean;
* **findAll:** Retorna uma coleção contendo todos os registros da tabela no banco de dados;
* **delete:** Deleta um registro da respectiva tabela;
* **count:** Retorna a quantidade de registro de uma tabela mapeada do banco de dados;

## Consultas customizadas:

No Spring Data JPA, consultas customizadas permitem que você defina métodos de consulta complexos ou específicos que não são cobertos pelas consultas automáticas geradas pelo Spring. Existem duas principais abordagens para criar essas consultas: **Query Methods** e **Consultas Customizadas** com anotações como `@Query`.

### 1. **Query Methods**

**Query Methods** são métodos definidos no repositório que seguem uma convenção de nomenclatura específica. O Spring Data JPA analisa o nome do método e cria a consulta automaticamente com base nele.

**Exemplos de Query Methods:**

1. **Encontrar por um campo específico:**
   ```java
   List<User> findByLastName(String lastName);
   ```

2. **Encontrar por vários campos:**
   ```java
   List<User> findByFirstNameAndLastName(String firstName, String lastName);
   ```

3. **Usando operadores de comparação:**
   ```java
   List<User> findByAgeGreaterThan(int age);
   ```

4. **Buscar registros ordenados:**
   ```java
   List<User> findByLastNameOrderByFirstNameAsc(String lastName);
   ```

5. **Paginação e Limitação:**
   ```java
   Page<User> findByLastName(String lastName, Pageable pageable);
   List<User> findFirst10ByOrderByLastNameAsc();
   ```

### 2. **Consultas Customizadas com @Query**

Quando a nomenclatura dos métodos se torna complexa ou não cobre a necessidade específica, você pode usar a anotação `@Query` para definir a consulta diretamente em JPQL (Java Persistence Query Language) ou SQL nativo.

**Exemplos:**

1. **Consulta JPQL:**
   ```java
   @Query("SELECT u FROM User u WHERE u.email = ?1")
   User findByEmailAddress(String email);
   ```

2. **Consulta com parâmetros nomeados:**
   ```java
   @Query("SELECT u FROM User u WHERE u.firstName = :firstName OR u.lastName = :lastName")
   List<User> findByNames(@Param("firstName") String firstName, @Param("lastName") String lastName);
   ```

3. **Consulta nativa:**
   ```java
   @Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
   User findByEmailNative(String email);
   ```

### 3. **Tabela com comandos SQL mais comuns e como utilizá-los:**

| **Comando** | **Uso** | **Exemplo de Uso em @Query** |
|-------------|---------|-----------------------------|
| `SELECT`    | Seleciona registros. | `@Query("SELECT u FROM User u WHERE u.id = ?1")` |
| `WHERE`     | Filtra registros.    | `@Query("SELECT u FROM User u WHERE u.name = ?1")` |
| `AND`       | Combina condições.   | `@Query("SELECT u FROM User u WHERE u.name = ?1 AND u.age > ?2")` |
| `OR`        | Alterna condições.   | `@Query("SELECT u FROM User u WHERE u.name = ?1 OR u.age > ?2")` |
| `JOIN`      | Une tabelas.         | `@Query("SELECT u FROM User u JOIN u.roles r WHERE r.name = ?1")` |
| `ORDER BY`  | Ordena resultados.   | `@Query("SELECT u FROM User u ORDER BY u.name ASC")` |
| `GROUP BY`  | Agrupa resultados.   | `@Query("SELECT u.department, COUNT(u) FROM User u GROUP BY u.department")` |
| `HAVING`    | Filtra grupos.       | `@Query("SELECT u.department, COUNT(u) FROM User u GROUP BY u.department HAVING COUNT(u) > ?1")` |
| `INSERT`    | Insere registros.    | `@Modifying @Query("INSERT INTO User (name, age) VALUES (?1, ?2)")` |
| `UPDATE`    | Atualiza registros.  | `@Modifying @Query("UPDATE User u SET u.name = ?1 WHERE u.id = ?2")` |
| `DELETE`    | Deleta registros.    | `@Modifying @Query("DELETE FROM User u WHERE u.id = ?1")` |

**Observações:**

- O uso de `@Modifying` é necessário para consultas que alteram o estado do banco de dados (`INSERT`, `UPDATE`, `DELETE`).
- O uso de consultas nativas (`nativeQuery = true`) é ideal quando você precisa de uma performance específica ou uma consulta que não pode ser representada em JPQL.

Essas ferramentas permitem criar consultas altamente customizadas e poderosas, adaptando-se a uma ampla variedade de necessidades de acesso a dados.
