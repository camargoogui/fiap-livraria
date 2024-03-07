//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        //tipoObjeto nomeObjeto = operadorInstanciação  construtor
        //Livro      favorito =   new                   Livro();
        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor = 37.27;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "Comum";

        System.out.println("Meu livro favorito é:" + favorito.titulo + " seu autor é:" + favorito.autor + " preço: R$" + favorito.valor);


        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 58.99;

    }
}
