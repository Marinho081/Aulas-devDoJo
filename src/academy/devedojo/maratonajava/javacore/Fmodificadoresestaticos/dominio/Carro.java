package academy.devedojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;
//modificador de acesso estatico vai fazer o atributo pertencer a classe.
//TODOS OBJETOS COMPARTILHARAM DO MESMO VALOR.
public class Carro {
    //atributos
    private String nome;
    private double velocidadeMaxima;
    //modificador de acesso estatico(O NOME ESTATIC NO CODIGO ATRIBUTO)
    //foi removido o PRIVAT e colocado o PUBLIC pelo fato por não ter trabalhado com o privat nesses exemplo
    private static  double elocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Nome"+this.nome);
        System.out.println("Velocidade Maxima"+this.velocidadeMaxima);
        System.out.println("Velocidade limite"+this.elocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.elocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return Carro.elocidadeLimite;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
