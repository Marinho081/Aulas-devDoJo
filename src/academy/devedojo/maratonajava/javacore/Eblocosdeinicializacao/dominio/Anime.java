package academy.devedojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;
//1-aloca espaço em memoria pro objeto.
//2-cada atributo de classe é criado e inicializados com valores defalt ou o que for passado.
//3-bloco de inicialização é executado.
//4-costrutor é executado.

public class Anime {
    private String nome;
    private int[] episodios ;
    {
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


        for (int episodio: this.episodios) {

        }

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
