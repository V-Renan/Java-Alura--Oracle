package desafio6;

/**
 * @author Victor$
 * @date 4/9/2024$
 * Description:
 */
public class Livro {
    private String titulo;
    private String autor;
    public Livro() {

    }
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void exibirDetalhe() {
        System.out.printf("""
                Titulo: %s
                Autor: %s
                """, getTitulo(), getAutor());
    }
}
