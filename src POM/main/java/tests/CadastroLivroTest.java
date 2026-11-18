package tests;

import pages.CadastroLivroPage;

public class CadastroLivroTest {

    public void testarCadastroCorreto() {

        CadastroLivroPage pagina = new CadastroLivroPage();

        pagina.preencherTitulo("Dom Casmurro");
        pagina.preencherAutor("Machado de Assis");

        pagina.clicarCadastrar();

        if (pagina.obterMensagem().equals(
                "Livro cadastrado com sucesso!")) {

            System.out.println("Teste 1 aprovado!");
        }
    }

    public void testarCadastroSemTitulo() {

        CadastroLivroPage pagina = new CadastroLivroPage();

        pagina.preencherAutor("Machado de Assis");

        pagina.clicarCadastrar();

        if (pagina.obterMensagem().equals(
                "Informe o título do livro!")) {

            System.out.println("Teste 2 aprovado!");
        }
    }


    public void testarCadastroSemAutor() {

        CadastroLivroPage pagina = new CadastroLivroPage();

        pagina.preencherTitulo("Dom Casmurro");

        pagina.clicarCadastrar();

        if (pagina.obterMensagem().equals(
                "Informe o autor do livro!")) {

            System.out.println("Teste 3 aprovado!");
        }
    }


    public void testarCadastroVazio() {

        CadastroLivroPage pagina = new CadastroLivroPage();

        pagina.clicarCadastrar();

        if (pagina.obterMensagem().equals(
                "Informe o título do livro!")) {

            System.out.println("Teste 4 aprovado!");
        }
    }
}