package academy.devedojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;
//0-o bloco de inicialização STATIC é executado a penas uma vez quando a jvm carrega a classe.
//1-aloca espaço em memoria pro objeto.
//2-cada atributo de classe é criado e inicializados com valores defalt ou o que for passado.
//3-bloco de inicialização é executado.
//4-costrutor é executado.

public class Anime {
    private String nome;
    private static int[] episodios ;
    //bloco de inicialização static.
    static {
        episodios = new int [100];
        for (int i= 0;i < episodios.length;i++) {
            episodios[i] = i + 1;
        }

        System.out.println("dent5ro do ploco de inicialização");

    }

    //CONSTRUTOR COM NOME.
    public Anime(String nome  ) {
        this.nome = nome;
    }
    //CONSTRUTOR SEM NOME.
    public Anime() {


        for (int episodio: Anime.episodios) {

            System.out.print(episodio+" ");

        }


    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
