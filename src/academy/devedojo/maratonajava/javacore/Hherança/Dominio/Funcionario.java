package academy.devedojo.maratonajava.javacore.Hherança.Dominio;

public class Funcionario  extends Pessoa {
    private double slario;

    public void imprime(){
        super.imprime();
        System.out.println(this.slario);
    }

    public double getSlario() {
        return slario;
    }

    public void setSlario(double slario) {
        this.slario = slario;
    }
}
