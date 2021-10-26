# Metodos contrutores

Os métodos construtores são os métodos que serão executados no momento da criação do objeto, ou seja, quando o objeto 
for instanciado.
Para criar o método construtor basta criar um método sem tipo ou void onde o nome dele é o mesmo nome do objeto (classe) 
que será construido.
Exemplo


```java
 // Classe: ObjetoExemplo;
 public ObjetoExemplo(){
     System.out.println("Código executado ao instanciar objeto");
 }

 //O mesmo objeto pode ser criado com um construtor com parametros, com sobrecarga de metodo e executar o metodo de acordo
 //com os parametros passados
 public ObjetoExemplo(int numero){
     System.out.println("Objeto instanciado e código executado com parametro" + numero);
 }
 //Exemplo para criação do objeto 
    ObjetoExemplo objeto = new ObjetoExemplo(); //Objeto criado com o primeiro construtor

    ObjetoExemplo objeto = new ObjetoExemplo(10); //Objeto criado com o segundo construtor e parametro informado
```