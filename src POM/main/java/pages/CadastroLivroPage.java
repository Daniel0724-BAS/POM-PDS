package pages;

public class CadastroLivroPage {

        private String titulo;
        private String autor;
        private String mensagem;

        public void preencherTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void preencherAutor(String autor) {
            this.autor = autor;
        }

        public void clicarCadastrar() {

            if (titulo == null || titulo.isBlank()) {
                mensagem = "Informe o título do livro!";
            }
            else if (autor == null || autor.isBlank()) {
                mensagem = "Informe o autor do livro!";
            }
            else {
                mensagem = "Livro cadastrado com sucesso!";
            }
    }

    public String obterMensagem() {
        return mensagem;
    }
}

