package tests;

public class CadastroLivroTestSemPom {

    public void testarCadastroCorreto() {

        String titulo = "Dom Casmurro";
        String autor = "Machado de Assis";
        String mensagem;

        // Simulando o cadastro
        if (titulo != null && !titulo.isBlank() && autor != null && !autor.isBlank()) {
            mensagem = "Livro cadastrado com sucesso!";
        } else {
            mensagem = "Preencha os campos!";
        }

        // Verificando o resultado
        if (mensagem.equals("Livro cadastrado com sucesso!")) {
            System.out.println("Teste 1 aprovado!");
        }
    }


    public void testarCadastroSemTitulo() {

        String titulo = "";
        String autor = "Machado de Assis";
        String mensagem;

        if (titulo == null || titulo.isBlank()) {
            mensagem = "Informe o título do livro!";
        }
        else if (autor == null || autor.isBlank()) {
            mensagem = "Informe o autor do livro!";
        }
        else {
            mensagem = "Livro cadastrado com sucesso!";
        }

        if (mensagem.equals("Informe o título do livro!")) {
            System.out.println("Teste 2 aprovado!");
        }
    }


    public void testarCadastroSemAutor() {

        String titulo = "Dom Casmurro";
        String autor = "";
        String mensagem;

        if (titulo == null || titulo.isBlank()) {
            mensagem = "Informe o título do livro!";
        }
        else if (autor == null || autor.isBlank()) {
            mensagem = "Informe o autor do livro!";
        }
        else {
            mensagem = "Livro cadastrado com sucesso!";
        }

        if (mensagem.equals("Informe o autor do livro!")) {
            System.out.println("Teste 3 aprovado!");
        }
    }


    public void testarCadastroVazio() {

        String titulo = "";
        String autor = "";
        String mensagem;

        if (titulo == null || titulo.isBlank()) {
            mensagem = "Informe o título do livro!";
        }
        else if (autor == null || autor.isBlank()) {
            mensagem = "Informe o autor do livro!";
        }
        else {
            mensagem = "Livro cadastrado com sucesso!";
        }

        if (mensagem.equals("Informe o título do livro!")) {
            System.out.println("Teste 4 aprovado!");
        }
    }
}