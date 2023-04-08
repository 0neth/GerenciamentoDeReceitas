//CRIANDO ATRIBUTOS
public class Receitas {
    private String titulo;
    private String[] ingredientes;
    private String[] passos;
    private int duracaoEmMinutos;
    private int dificuldade;
    private String autor;

    public Receitas(String titulo, String[] ingredientes, String[] passos, int duracaoEmMinutos, int dificuldade, String autor) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.passos = passos;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.dificuldade = dificuldade;
        this.autor = autor;
    }


//GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public String[] getPassos() {
        return passos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPassos(String[] passos) {
        this.passos = passos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}