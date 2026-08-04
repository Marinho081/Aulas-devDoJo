package academy.devedojo.maratonajava.javacore.Jmodificadorfinal.Dominio;

public class Comprador {
    private String nome;
    //MODIFICADOR FINAL DO TIPO REFERÊNCIA

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
