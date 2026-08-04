package academy.devedojo.maratonajava.javacore.Hherança.Dominio;

public class Funcionario  extends Pessoa {
    private double slario = 2000;
    static {
        System.out.println("dentro do bloco de inicialização estatico funcionario");
    }
    {
        System.out.println("dentro do bloco de inicialização de funcionario 01");
    }
    {
        System.out.println("dentro do bloco de inicialização de funcionario 02");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro do construtorm de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.slario);
    }
    public void relatorioDePagamento(){
        System.out.println("eu"+this.nome+"recebi o salario de"+this.slario);
    }

    public double getSlario() {

        return slario;
    }

    public void setSlario(double slario) {

        this.slario = slario;
    }
}
