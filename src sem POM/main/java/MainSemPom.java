import tests.CadastroLivroTestSemPom;

public class MainSemPom {

    public static void main(String[] args) {

        CadastroLivroTestSemPom teste = new CadastroLivroTestSemPom();

        teste.testarCadastroCorreto();

        teste.testarCadastroSemTitulo();

        teste.testarCadastroSemAutor();

        teste.testarCadastroVazio();
    }
}