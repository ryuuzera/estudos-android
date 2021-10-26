# Sobrecarga de métodos
É possível em java criar métodos com o mesmo nome, desde que os parametros passados para o método sejam diferentes.
Para saber qual o método que será executado, irá então depender dos parametros passados, exemplos:

```java
    public void metodoExemplo(){
        System.out.println("Executou metodo sem parametro");
    }

    public void metodoExemplo(String nome, int idade){
        System.out.println("Executou metodo com parametro de nome: " + nome + " e idade: " + idade)
    }
```

É possível criar vários metodos com o mesmo nome dessa forma e o que vai determinar a identidade de cada um são os métodos
inseridos.