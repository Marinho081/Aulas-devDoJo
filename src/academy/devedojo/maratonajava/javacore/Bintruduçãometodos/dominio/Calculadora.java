package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros (){
        System.out.println(10+10+10);
    }
    public void subitrairDoisNumeros (){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros (int num1, int num2){
        System.out.println(num1*num2);

    }
    public double dividirDoisNumeros (double num1, double num2){
        if (num2==0){
            return 0;
        }
        return num1/num2;
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1=99;
        num2=33;
        System.out.println("Dentro dos dois numeros");
        System.out.println("numero1 = "+num1+" numero2 = "+num2);
    }
}
