package academy.devedojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e dooble = 0
        // char= '\u0000' ' '
        //boolean = false
        //string = nuul
        String [] name  = new String[5];
        name[0] = "Arthur";
        name[1] = "Joyce";
        name[2] = "Lucas";
        name[3] = "Sebastião";
        name[4] = "Maria";
        for (int i =0; i< name.length ;i++ ){
            System.out.println(name[i]);
        }

    }
}
